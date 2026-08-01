package org.slf4j.event;

import java.util.ArrayList;
import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.helpers.C6579;
import org.slf4j.helpers.LegacyAbstractLogger;
import p415.InterfaceC9973;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class EventRecordingLogger extends LegacyAbstractLogger {
    static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    Queue<C6576> eventQueue;
    C6579 logger;
    String name;

    public EventRecordingLogger(C6579 c6579, Queue<C6576> queue) {
        this.logger = c6579;
        this.name = c6579.f16094;
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 atWarn() {
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
        C6576 c6576 = new C6576();
        System.currentTimeMillis();
        c6576.f16084 = level;
        c6576.f16083 = this.logger;
        if (marker != null) {
            if (c6576.f16082 == null) {
                c6576.f16082 = new ArrayList(2);
            }
            c6576.f16082.add(marker);
        }
        Thread.currentThread().getName();
        c6576.f16081 = objArr;
        this.eventQueue.add(c6576);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p414.InterfaceC9970
    public /* bridge */ /* synthetic */ InterfaceC9973 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }
}
