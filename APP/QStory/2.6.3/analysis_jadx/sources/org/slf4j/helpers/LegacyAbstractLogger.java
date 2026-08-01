package org.slf4j.helpers;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import p399.InterfaceC9144;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LegacyAbstractLogger extends AbstractLogger {
    private static final long serialVersionUID = -7041884104854048950L;

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atWarn() {
        return super.atWarn();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public abstract /* synthetic */ boolean isDebugEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public abstract /* synthetic */ boolean isErrorEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public abstract /* synthetic */ boolean isTraceEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public abstract /* synthetic */ boolean isWarnEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }
}
