package p400;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import p330.C8796;
import p397.C9149;
import p397.InterfaceC9150;

/* JADX INFO: renamed from: 飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9156 {
    default InterfaceC9150 atDebug() {
        return isDebugEnabled() ? makeLoggingEventBuilder(Level.DEBUG) : C9149.f25551;
    }

    default InterfaceC9150 atError() {
        return isErrorEnabled() ? makeLoggingEventBuilder(Level.ERROR) : C9149.f25551;
    }

    default InterfaceC9150 atInfo() {
        return isInfoEnabled() ? makeLoggingEventBuilder(Level.INFO) : C9149.f25551;
    }

    default InterfaceC9150 atLevel(Level level) {
        return isEnabledForLevel(level) ? makeLoggingEventBuilder(level) : C9149.f25551;
    }

    default InterfaceC9150 atTrace() {
        return isTraceEnabled() ? makeLoggingEventBuilder(Level.TRACE) : C9149.f25551;
    }

    default InterfaceC9150 atWarn() {
        return isWarnEnabled() ? makeLoggingEventBuilder(Level.WARN) : C9149.f25551;
    }

    void debug(String str);

    void debug(String str, Throwable th);

    void debug(Marker marker, String str, Throwable th);

    void error(String str, Throwable th);

    void error(Marker marker, String str, Throwable th);

    void info(String str);

    void info(Marker marker, String str, Throwable th);

    boolean isDebugEnabled();

    boolean isDebugEnabled(Marker marker);

    default boolean isEnabledForLevel(Level level) {
        int i = level.toInt();
        if (i == 0) {
            return isTraceEnabled();
        }
        if (i == 10) {
            return isDebugEnabled();
        }
        if (i == 20) {
            return isInfoEnabled();
        }
        if (i == 30) {
            return isWarnEnabled();
        }
        if (i == 40) {
            return isErrorEnabled();
        }
        C8796.m14448(level, "Level [", "] not recognized.");
        return false;
    }

    boolean isErrorEnabled();

    boolean isErrorEnabled(Marker marker);

    boolean isInfoEnabled();

    boolean isInfoEnabled(Marker marker);

    boolean isTraceEnabled();

    boolean isTraceEnabled(Marker marker);

    boolean isWarnEnabled();

    boolean isWarnEnabled(Marker marker);

    default InterfaceC9150 makeLoggingEventBuilder(Level level) {
        return new C9149();
    }

    void trace(String str);

    void trace(Marker marker, String str, Throwable th);

    void warn(String str);

    void warn(String str, Throwable th);

    void warn(Marker marker, String str, Throwable th);
}
