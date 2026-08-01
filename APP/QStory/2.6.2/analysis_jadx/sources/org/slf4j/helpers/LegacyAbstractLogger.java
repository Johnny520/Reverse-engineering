package org.slf4j.helpers;

import org.slf4j.Marker;
import org.slf4j.event.Level;
import p397.InterfaceC9150;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LegacyAbstractLogger extends AbstractLogger {
    private static final long serialVersionUID = -7041884104854048950L;

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atWarn() {
        return super.atWarn();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public abstract /* synthetic */ boolean isDebugEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isDebugEnabled(Marker marker) {
        return isDebugEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public abstract /* synthetic */ boolean isErrorEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isErrorEnabled(Marker marker) {
        return isErrorEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public abstract /* synthetic */ boolean isInfoEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isInfoEnabled(Marker marker) {
        return isInfoEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public abstract /* synthetic */ boolean isTraceEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public abstract /* synthetic */ boolean isWarnEnabled();

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isWarnEnabled(Marker marker) {
        return isWarnEnabled();
    }

    @Override // org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }
}
