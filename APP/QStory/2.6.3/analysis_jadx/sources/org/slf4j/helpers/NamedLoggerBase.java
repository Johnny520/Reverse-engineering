package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import p398.AbstractC9139;
import p398.InterfaceC9141;
import p399.InterfaceC9144;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
abstract class NamedLoggerBase implements InterfaceC9141, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atDebug() {
        return super.atDebug();
    }

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atError() {
        return super.atError();
    }

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atInfo() {
        return super.atInfo();
    }

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atTrace() {
        return super.atTrace();
    }

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atWarn() {
        return super.atWarn();
    }

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void debug(String str);

    public abstract /* synthetic */ void debug(String str, Object obj);

    public abstract /* synthetic */ void debug(String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void debug(String str, Throwable th);

    public abstract /* synthetic */ void debug(String str, Object... objArr);

    public abstract /* synthetic */ void debug(Marker marker, String str);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void debug(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void debug(Marker marker, String str, Object... objArr);

    public abstract /* synthetic */ void error(String str);

    public abstract /* synthetic */ void error(String str, Object obj);

    public abstract /* synthetic */ void error(String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void error(String str, Throwable th);

    public abstract /* synthetic */ void error(String str, Object... objArr);

    public abstract /* synthetic */ void error(Marker marker, String str);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void error(Marker marker, String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void error(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void error(Marker marker, String str, Object... objArr);

    public String getName() {
        return this.name;
    }

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void info(String str);

    public abstract /* synthetic */ void info(String str, Object obj);

    public abstract /* synthetic */ void info(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void info(String str, Throwable th);

    public abstract /* synthetic */ void info(String str, Object... objArr);

    public abstract /* synthetic */ void info(Marker marker, String str);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void info(Marker marker, String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void info(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void info(Marker marker, String str, Object... objArr);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isDebugEnabled();

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isDebugEnabled(Marker marker);

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isErrorEnabled();

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isErrorEnabled(Marker marker);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isInfoEnabled(Marker marker);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isTraceEnabled();

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isTraceEnabled(Marker marker);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isWarnEnabled();

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ boolean isWarnEnabled(Marker marker);

    @Override // p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }

    public Object readResolve() {
        return AbstractC9139.m14703(getName());
    }

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void trace(String str);

    public abstract /* synthetic */ void trace(String str, Object obj);

    public abstract /* synthetic */ void trace(String str, Object obj, Object obj2);

    public abstract /* synthetic */ void trace(String str, Throwable th);

    public abstract /* synthetic */ void trace(String str, Object... objArr);

    public abstract /* synthetic */ void trace(Marker marker, String str);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void trace(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void trace(Marker marker, String str, Object... objArr);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void warn(String str);

    public abstract /* synthetic */ void warn(String str, Object obj);

    public abstract /* synthetic */ void warn(String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void warn(String str, Throwable th);

    public abstract /* synthetic */ void warn(String str, Object... objArr);

    public abstract /* synthetic */ void warn(Marker marker, String str);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object obj, Object obj2);

    @Override // p398.InterfaceC9141
    public abstract /* synthetic */ void warn(Marker marker, String str, Throwable th);

    public abstract /* synthetic */ void warn(Marker marker, String str, Object... objArr);
}
