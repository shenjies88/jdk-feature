module com.slf4j.module {
    requires org.slf4j;
    provides java.lang.System.LoggerFinder
            with com.slf4j.module.Slf4jLoggerFinder;
    exports com.slf4j.module;
}