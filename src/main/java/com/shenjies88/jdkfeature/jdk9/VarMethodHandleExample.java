package com.shenjies88.jdkfeature.jdk9;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;

/**
 * @author shenjies88
 * @since 2020/10/20/15:12
 */
public class VarMethodHandleExample {
    public int count = 1;

    static int body(final int sum, final String value) {
        return sum + value.length();
    }

    public static void main(String[] args) throws Throwable {
        varHandleFun();
        methodHandleFun();
    }

    private static void varHandleFun() throws NoSuchFieldException, IllegalAccessException {
        VarMethodHandleExample handleTarget = new VarMethodHandleExample();
        VarHandle varHandle = MethodHandles
                .lookup()
                .findVarHandle(VarMethodHandleExample.class, "count", int.class);
        System.err.println(varHandle.get(handleTarget));
        System.err.println(varHandle.getVolatile(handleTarget));
        System.err.println(varHandle.getOpaque(handleTarget));
        System.err.println(varHandle.getAcquire(handleTarget));
    }

    private static void methodHandleFun() throws Throwable {
        final MethodHandle iterator = MethodHandles.constant(
                Iterator.class,
                List.of("a", "bc", "def").iterator());
        final MethodHandle init = MethodHandles.zero(int.class);
        final MethodHandle body = MethodHandles
                .lookup()
                .findStatic(
                        VarMethodHandleExample.class,
                        "body",
                        MethodType.methodType(
                                int.class,
                                int.class,
                                String.class));
        final MethodHandle iteratedLoop = MethodHandles
                .iteratedLoop(iterator, init, body);
        System.err.println(iteratedLoop.invoke());
    }
}
