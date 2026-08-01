package org.slf4j.event;

import java.util.ArrayList;
import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.helpers.C5749;
import org.slf4j.helpers.LegacyAbstractLogger;
import p399.InterfaceC9144;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class EventRecordingLogger extends LegacyAbstractLogger {
    static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    Queue<C5746> eventQueue;
    C5749 logger;
    String name;

    public EventRecordingLogger(C5749 c5749, Queue<C5746> queue) {
        this.logger = c5749;
        this.name = c5749.f15749;
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 atWarn() {
        return super.atWarn();
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public String getFullyQualifiedCallerName() {
        return null;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.helpers.AbstractLogger
    public void handleNormalizedLoggingCall(Level level, Marker marker, String str, Object[] objArr, Throwable th) {
        C5746 c5746 = new C5746();
        System.currentTimeMillis();
        c5746.f15739 = level;
        c5746.f15738 = this.logger;
        if (marker != null) {
            if (c5746.f15737 == null) {
                c5746.f15737 = new ArrayList(2);
            }
            c5746.f15737.add(marker);
        }
        Thread.currentThread().getName();
        c5746.f15736 = objArr;
        this.eventQueue.add(c5746);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p398.InterfaceC9141
    public /* bridge */ /* synthetic */ InterfaceC9144 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }
}
