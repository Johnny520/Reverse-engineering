package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import p415.InterfaceC9973;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLogger implements InterfaceC9970, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;
    protected String name;

    private void handle2ArgsCall(Level level, Marker marker, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            handleNormalizedLoggingCall(level, marker, str, new Object[]{obj, obj2}, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void handleArgArrayCall(Level level, Marker marker, String str, Object[] objArr) {
        Throwable th;
        if (objArr == null || objArr.length == 0) {
            th = null;
        } else {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        Throwable th2 = th;
        if (th2 == null) {
            handleNormalizedLoggingCall(level, marker, str, objArr, null);
            return;
        }
        if (objArr == null || objArr.length == 0) {
            C6755.m11870("non-sensical empty or null argument array");
            return;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        handleNormalizedLoggingCall(level, marker, str, objArr2, th2);
    }

    private void handle_0ArgsCall(Level level, Marker marker, String str, Throwable th) {
        handleNormalizedLoggingCall(level, marker, str, null, th);
    }

    private void handle_1ArgsCall(Level level, Marker marker, String str, Object obj) {
        handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, null);
    }

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

    public void debug(String str, Object obj, Object obj2) {
        if (isDebugEnabled()) {
            handle2ArgsCall(Level.DEBUG, null, str, obj, obj2);
        }
    }

    public void error(String str, Object obj, Object obj2) {
        if (isErrorEnabled()) {
            handle2ArgsCall(Level.ERROR, null, str, obj, obj2);
        }
    }

    public abstract String getFullyQualifiedCallerName();

    public String getName() {
        return this.name;
    }

    public abstract void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th);

    public void info(String str, Object obj, Object obj2) {
        if (isInfoEnabled()) {
            handle2ArgsCall(Level.INFO, null, str, obj, obj2);
        }
    }

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

    public void trace(String str, Object obj, Object obj2) {
        if (isTraceEnabled()) {
            handle2ArgsCall(Level.TRACE, null, str, obj, obj2);
        }
    }

    public void warn(String str, Object obj, Object obj2) {
        if (isWarnEnabled()) {
            handle2ArgsCall(Level.WARN, null, str, obj, obj2);
        }
    }

    public void debug(String str, Object obj) {
        if (isDebugEnabled()) {
            handle_1ArgsCall(Level.DEBUG, null, str, obj);
        }
    }

    public void error(String str, Object obj) {
        if (isErrorEnabled()) {
            handle_1ArgsCall(Level.ERROR, null, str, obj);
        }
    }

    public void info(String str, Object obj) {
        if (isInfoEnabled()) {
            handle_1ArgsCall(Level.INFO, null, str, obj);
        }
    }

    public void trace(String str, Object obj) {
        if (isTraceEnabled()) {
            handle_1ArgsCall(Level.TRACE, null, str, obj);
        }
    }

    public void warn(String str, Object obj) {
        if (isWarnEnabled()) {
            handle_1ArgsCall(Level.WARN, null, str, obj);
        }
    }

    @Override // p414.InterfaceC9970
    public void debug(String str) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(Level.DEBUG, null, str, null);
        }
    }

    public void error(String str) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(Level.ERROR, null, str, null);
        }
    }

    @Override // p414.InterfaceC9970
    public void info(String str) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, str, null);
        }
    }

    @Override // p414.InterfaceC9970
    public void trace(String str) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(Level.TRACE, null, str, null);
        }
    }

    @Override // p414.InterfaceC9970
    public void warn(String str) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(Level.WARN, null, str, null);
        }
    }

    public void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            handleArgArrayCall(Level.DEBUG, null, str, objArr);
        }
    }

    public void error(String str, Object... objArr) {
        if (isErrorEnabled()) {
            handleArgArrayCall(Level.ERROR, null, str, objArr);
        }
    }

    public void info(String str, Object... objArr) {
        if (isInfoEnabled()) {
            handleArgArrayCall(Level.INFO, null, str, objArr);
        }
    }

    public void trace(String str, Object... objArr) {
        if (isTraceEnabled()) {
            handleArgArrayCall(Level.TRACE, null, str, objArr);
        }
    }

    public void warn(String str, Object... objArr) {
        if (isWarnEnabled()) {
            handleArgArrayCall(Level.WARN, null, str, objArr);
        }
    }

    @Override // p414.InterfaceC9970
    public void debug(String str, Throwable th) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(Level.DEBUG, null, str, th);
        }
    }

    @Override // p414.InterfaceC9970
    public void error(String str, Throwable th) {
        if (isErrorEnabled()) {
            handle_0ArgsCall(Level.ERROR, null, str, th);
        }
    }

    public void info(String str, Throwable th) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, str, th);
        }
    }

    public void trace(String str, Throwable th) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(Level.TRACE, null, str, th);
        }
    }

    @Override // p414.InterfaceC9970
    public void warn(String str, Throwable th) {
        if (isWarnEnabled()) {
            handle_0ArgsCall(Level.WARN, null, str, th);
        }
    }

    public void debug(Marker marker, String str) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(Level.DEBUG, marker, str, null);
        }
    }

    public void error(Marker marker, String str) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(Level.ERROR, marker, str, null);
        }
    }

    public void info(Marker marker, String str) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(Level.INFO, marker, str, null);
        }
    }

    public void trace(Marker marker, String str) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(Level.TRACE, marker, str, null);
        }
    }

    public void warn(Marker marker, String str) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(Level.WARN, marker, str, null);
        }
    }

    public void debug(Marker marker, String str, Object obj) {
        if (isDebugEnabled(marker)) {
            handle_1ArgsCall(Level.DEBUG, marker, str, obj);
        }
    }

    public void error(Marker marker, String str, Object obj) {
        if (isErrorEnabled(marker)) {
            handle_1ArgsCall(Level.ERROR, marker, str, obj);
        }
    }

    public void info(Marker marker, String str, Object obj) {
        if (isInfoEnabled(marker)) {
            handle_1ArgsCall(Level.INFO, marker, str, obj);
        }
    }

    public void trace(Marker marker, String str, Object obj) {
        if (isTraceEnabled(marker)) {
            handle_1ArgsCall(Level.TRACE, marker, str, obj);
        }
    }

    public void warn(Marker marker, String str, Object obj) {
        if (isWarnEnabled(marker)) {
            handle_1ArgsCall(Level.WARN, marker, str, obj);
        }
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        if (isDebugEnabled(marker)) {
            handle2ArgsCall(Level.DEBUG, marker, str, obj, obj2);
        }
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        if (isErrorEnabled(marker)) {
            handle2ArgsCall(Level.ERROR, marker, str, obj, obj2);
        }
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        if (isInfoEnabled(marker)) {
            handle2ArgsCall(Level.INFO, marker, str, obj, obj2);
        }
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
        if (isTraceEnabled(marker)) {
            handle2ArgsCall(Level.TRACE, marker, str, obj, obj2);
        }
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        if (isWarnEnabled(marker)) {
            handle2ArgsCall(Level.WARN, marker, str, obj, obj2);
        }
    }

    public void debug(Marker marker, String str, Object... objArr) {
        if (isDebugEnabled(marker)) {
            handleArgArrayCall(Level.DEBUG, marker, str, objArr);
        }
    }

    public void error(Marker marker, String str, Object... objArr) {
        if (isErrorEnabled(marker)) {
            handleArgArrayCall(Level.ERROR, marker, str, objArr);
        }
    }

    public void info(Marker marker, String str, Object... objArr) {
        if (isInfoEnabled(marker)) {
            handleArgArrayCall(Level.INFO, marker, str, objArr);
        }
    }

    public void trace(Marker marker, String str, Object... objArr) {
        if (isTraceEnabled(marker)) {
            handleArgArrayCall(Level.TRACE, marker, str, objArr);
        }
    }

    public void warn(Marker marker, String str, Object... objArr) {
        if (isWarnEnabled(marker)) {
            handleArgArrayCall(Level.WARN, marker, str, objArr);
        }
    }

    @Override // p414.InterfaceC9970
    public void debug(Marker marker, String str, Throwable th) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(Level.DEBUG, marker, str, th);
        }
    }

    @Override // p414.InterfaceC9970
    public void error(Marker marker, String str, Throwable th) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(Level.ERROR, marker, str, th);
        }
    }

    @Override // p414.InterfaceC9970
    public void info(Marker marker, String str, Throwable th) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(Level.INFO, marker, str, th);
        }
    }

    @Override // p414.InterfaceC9970
    public void trace(Marker marker, String str, Throwable th) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(Level.TRACE, marker, str, th);
        }
    }

    @Override // p414.InterfaceC9970
    public void warn(Marker marker, String str, Throwable th) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(Level.WARN, marker, str, th);
        }
    }
}
