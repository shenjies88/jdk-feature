import com.logging.module.CustomLoggerFinder;

module com.logging.module {
    provides java.lang.System.LoggerFinder
            with CustomLoggerFinder;
    exports com.logging.module;
}