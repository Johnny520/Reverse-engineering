package p398;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import p336.C8791;
import p399.C9143;
import p399.InterfaceC9144;

/* JADX INFO: renamed from: 飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9141 {
    default InterfaceC9144 atDebug() {
        return isDebugEnabled() ? makeLoggingEventBuilder(Level.DEBUG) : C9143.f25547;
    }

    default InterfaceC9144 atError() {
        return isErrorEnabled() ? makeLoggingEventBuilder(Level.ERROR) : C9143.f25547;
    }

    default InterfaceC9144 atInfo() {
        return isInfoEnabled() ? makeLoggingEventBuilder(Level.INFO) : C9143.f25547;
    }

    default InterfaceC9144 atLevel(Level level) {
        return isEnabledForLevel(level) ? makeLoggingEventBuilder(level) : C9143.f25547;
    }

    default InterfaceC9144 atTrace() {
        return isTraceEnabled() ? makeLoggingEventBuilder(Level.TRACE) : C9143.f25547;
    }

    default InterfaceC9144 atWarn() {
        return isWarnEnabled() ? makeLoggingEventBuilder(Level.WARN) : C9143.f25547;
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
        C8791.m14472(level, "Level [", "] not recognized.");
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

    default InterfaceC9144 makeLoggingEventBuilder(Level level) {
        return new C9143();
    }

    void trace(String str);

    void trace(Marker marker, String str, Throwable th);

    void warn(String str);

    void warn(String str, Throwable th);

    void warn(Marker marker, String str, Throwable th);
}
