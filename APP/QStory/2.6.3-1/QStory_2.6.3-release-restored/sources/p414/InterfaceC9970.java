package p414;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import p352.C9620;
import p415.C9972;
import p415.InterfaceC9973;

/* JADX INFO: renamed from: 飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9970 {
    default InterfaceC9973 atDebug() {
        return isDebugEnabled() ? makeLoggingEventBuilder(Level.DEBUG) : C9972.f25892;
    }

    default InterfaceC9973 atError() {
        return isErrorEnabled() ? makeLoggingEventBuilder(Level.ERROR) : C9972.f25892;
    }

    default InterfaceC9973 atInfo() {
        return isInfoEnabled() ? makeLoggingEventBuilder(Level.INFO) : C9972.f25892;
    }

    default InterfaceC9973 atLevel(Level level) {
        return isEnabledForLevel(level) ? makeLoggingEventBuilder(level) : C9972.f25892;
    }

    default InterfaceC9973 atTrace() {
        return isTraceEnabled() ? makeLoggingEventBuilder(Level.TRACE) : C9972.f25892;
    }

    default InterfaceC9973 atWarn() {
        return isWarnEnabled() ? makeLoggingEventBuilder(Level.WARN) : C9972.f25892;
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
        C9620.m15031(level, "Level [", "] not recognized.");
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

    default InterfaceC9973 makeLoggingEventBuilder(Level level) {
        return new C9972();
    }

    void trace(String str);

    void trace(Marker marker, String str, Throwable th);

    void warn(String str);

    void warn(String str, Throwable th);

    void warn(Marker marker, String str, Throwable th);
}
