package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import p397.InterfaceC9150;
import p400.AbstractC9154;
import p400.InterfaceC9156;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
abstract class NamedLoggerBase implements InterfaceC9156, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atDebug() {
        return super.atDebug();
    }

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atError() {
        return super.atError();
    }

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atInfo() {
        return super.atInfo();
    }

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atTrace() {
        return super.atTrace();
    }

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atWarn() {
        return super.atWarn();
    }

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void debug(String str);

    public abstract /* synthetic */ void debug(String str, Object obj);

    public abstract /* synthetic */ void debug(String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void debug(String str, Throwable th);

    public abstract /* synthetic */ void debug(String str, Object... objArr);

    public abstract /* synthetic */ void debug(Marker marker, String str);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void debug(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object... objArr);

    public abstract /* synthetic */ void error(String str);

    public abstract /* synthetic */ void error(String str, Object obj);

    public abstract /* synthetic */ void error(String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void error(String str, Throwable th);

    public abstract /* synthetic */ void error(String str, Object... objArr);

    public abstract /* synthetic */ void error(Marker marker, String str);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void error(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void error(Marker marker, String str, Object... objArr);

    public String getName() {
        return this.name;
    }

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void info(String str);

    public abstract /* synthetic */ void info(String str, Object obj);

    public abstract /* synthetic */ void info(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(String str, Throwable th);

    public abstract /* synthetic */ void info(String str, Object... objArr);

    public abstract /* synthetic */ void info(Marker marker, String str);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void info(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void info(Marker marker, String str, Object... objArr);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isDebugEnabled();

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isDebugEnabled(Marker marker);

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isErrorEnabled();

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isErrorEnabled(Marker marker);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isInfoEnabled(Marker marker);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isTraceEnabled();

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isTraceEnabled(Marker marker);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isWarnEnabled();

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ boolean isWarnEnabled(Marker marker);

    @Override // p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    public Object readResolve() {
        return AbstractC9154.m14712(getName());
    }

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void trace(String str);

    public abstract /* synthetic */ void trace(String str, Object obj);

    public abstract /* synthetic */ void trace(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(String str, Throwable th);

    public abstract /* synthetic */ void trace(String str, Object... objArr);

    public abstract /* synthetic */ void trace(Marker marker, String str);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void trace(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object... objArr);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void warn(String str);

    public abstract /* synthetic */ void warn(String str, Object obj);

    public abstract /* synthetic */ void warn(String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void warn(String str, Throwable th);

    public abstract /* synthetic */ void warn(String str, Object... objArr);

    public abstract /* synthetic */ void warn(Marker marker, String str);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj, Object obj2);

    @Override // p400.InterfaceC9156
    public abstract /* synthetic */ void warn(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object... objArr);
}
