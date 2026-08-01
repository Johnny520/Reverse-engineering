package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Marker;
import org.slf4j.event.Level;
import p398.AbstractC9139;
import p398.InterfaceC9141;
import p399.InterfaceC9144;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractLogger implements InterfaceC9141, Serializable {
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
        To view partially-correct add '--show-bad-code' argument
    */
    private void handleArgArrayCall(org.slf4j.event.Level r8, org.slf4j.Marker r9, java.lang.String r10, java.lang.Object[] r11) {
        /*
            r7 = this;
            if (r11 == 0) goto L13
            int r0 = r11.length
            if (r0 != 0) goto L6
            goto L13
        L6:
            int r0 = r11.length
            int r0 = r0 + (-1)
            r0 = r11[r0]
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L13
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L11:
            r6 = r0
            goto L15
        L13:
            r0 = 0
            goto L11
        L15:
            if (r6 == 0) goto L35
            if (r11 == 0) goto L2f
            int r0 = r11.length
            if (r0 == 0) goto L2f
            int r0 = r11.length
            int r0 = r0 + (-1)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            if (r0 <= 0) goto L27
            r1 = 0
            java.lang.System.arraycopy(r11, r1, r5, r1, r0)
        L27:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.handleNormalizedLoggingCall(r2, r3, r4, r5, r6)
            return
        L2f:
            java.lang.String r7 = "non-sensical empty or null argument array"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return
        L35:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = 0
            r4 = r11
            r0.handleNormalizedLoggingCall(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.AbstractLogger.handleArgArrayCall(org.slf4j.event.Level, org.slf4j.Marker, java.lang.String, java.lang.Object[]):void");
    }

    private void handle_0ArgsCall(Level level, Marker marker, String str, Throwable th) {
        handleNormalizedLoggingCall(level, marker, str, null, th);
    }

    private void handle_1ArgsCall(Level level, Marker marker, String str, Object obj) {
        handleNormalizedLoggingCall(level, marker, str, new Object[]{obj}, null);
    }

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

    @Override // p398.InterfaceC9141
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

    @Override // p398.InterfaceC9141
    public void info(String str) {
        if (isInfoEnabled()) {
            handle_0ArgsCall(Level.INFO, null, str, null);
        }
    }

    @Override // p398.InterfaceC9141
    public void trace(String str) {
        if (isTraceEnabled()) {
            handle_0ArgsCall(Level.TRACE, null, str, null);
        }
    }

    @Override // p398.InterfaceC9141
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

    @Override // p398.InterfaceC9141
    public void debug(String str, Throwable th) {
        if (isDebugEnabled()) {
            handle_0ArgsCall(Level.DEBUG, null, str, th);
        }
    }

    @Override // p398.InterfaceC9141
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

    @Override // p398.InterfaceC9141
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

    @Override // p398.InterfaceC9141
    public void debug(Marker marker, String str, Throwable th) {
        if (isDebugEnabled(marker)) {
            handle_0ArgsCall(Level.DEBUG, marker, str, th);
        }
    }

    @Override // p398.InterfaceC9141
    public void error(Marker marker, String str, Throwable th) {
        if (isErrorEnabled(marker)) {
            handle_0ArgsCall(Level.ERROR, marker, str, th);
        }
    }

    @Override // p398.InterfaceC9141
    public void info(Marker marker, String str, Throwable th) {
        if (isInfoEnabled(marker)) {
            handle_0ArgsCall(Level.INFO, marker, str, th);
        }
    }

    @Override // p398.InterfaceC9141
    public void trace(Marker marker, String str, Throwable th) {
        if (isTraceEnabled(marker)) {
            handle_0ArgsCall(Level.TRACE, marker, str, th);
        }
    }

    @Override // p398.InterfaceC9141
    public void warn(Marker marker, String str, Throwable th) {
        if (isWarnEnabled(marker)) {
            handle_0ArgsCall(Level.WARN, marker, str, th);
        }
    }
}
