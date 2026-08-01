package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import p415.InterfaceC9973;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
abstract class NamedLoggerBase implements InterfaceC9970, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atDebug() {
        return super.atDebug();
    }

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atError() {
        return super.atError();
    }

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atInfo() {
        return super.atInfo();
    }

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atTrace() {
        return super.atTrace();
    }

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atWarn() {
        return super.atWarn();
    }

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void debug(String str);

    public abstract /* synthetic */ void debug(String str, Object obj);

    public abstract /* synthetic */ void debug(String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void debug(String str, Throwable th);

    public abstract /* synthetic */ void debug(String str, Object... objArr);

    public abstract /* synthetic */ void debug(Marker marker, String str);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void debug(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object... objArr);

    public abstract /* synthetic */ void error(String str);

    public abstract /* synthetic */ void error(String str, Object obj);

    public abstract /* synthetic */ void error(String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void error(String str, Throwable th);

    public abstract /* synthetic */ void error(String str, Object... objArr);

    public abstract /* synthetic */ void error(Marker marker, String str);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void error(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void error(Marker marker, String str, Object... objArr);

    public String getName() {
        return this.name;
    }

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void info(String str);

    public abstract /* synthetic */ void info(String str, Object obj);

    public abstract /* synthetic */ void info(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(String str, Throwable th);

    public abstract /* synthetic */ void info(String str, Object... objArr);

    public abstract /* synthetic */ void info(Marker marker, String str);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void info(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void info(Marker marker, String str, Object... objArr);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isDebugEnabled();

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isDebugEnabled(Marker marker);

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isErrorEnabled();

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isErrorEnabled(Marker marker);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isInfoEnabled(Marker marker);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isTraceEnabled();

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isTraceEnabled(Marker marker);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isWarnEnabled();

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ boolean isWarnEnabled(Marker marker);

    @Override // p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    public Object readResolve() {
        return AbstractC9968.m15262(getName());
    }

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void trace(String str);

    public abstract /* synthetic */ void trace(String str, Object obj);

    public abstract /* synthetic */ void trace(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(String str, Throwable th);

    public abstract /* synthetic */ void trace(String str, Object... objArr);

    public abstract /* synthetic */ void trace(Marker marker, String str);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void trace(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object... objArr);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void warn(String str);

    public abstract /* synthetic */ void warn(String str, Object obj);

    public abstract /* synthetic */ void warn(String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void warn(String str, Throwable th);

    public abstract /* synthetic */ void warn(String str, Object... objArr);

    public abstract /* synthetic */ void warn(Marker marker, String str);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj, Object obj2);

    @Override // p414.InterfaceC9970
    public abstract /* synthetic */ void warn(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object... objArr);
}
