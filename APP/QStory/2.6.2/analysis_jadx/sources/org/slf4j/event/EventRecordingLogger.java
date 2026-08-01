package org.slf4j.event;

import java.util.ArrayList;
import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.helpers.C5748;
import org.slf4j.helpers.LegacyAbstractLogger;
import p397.InterfaceC9150;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class EventRecordingLogger extends LegacyAbstractLogger {
    static final boolean RECORD_ALL_EVENTS = true;
    private static final long serialVersionUID = -176083308134819629L;
    Queue<C5745> eventQueue;
    C5748 logger;
    String name;

    public EventRecordingLogger(C5748 c5748, Queue<C5745> queue) {
        this.logger = c5748;
        this.name = c5748.f15749;
        this.eventQueue = queue;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atDebug() {
        return super.atDebug();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atError() {
        return super.atError();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atInfo() {
        return super.atInfo();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atLevel(Level level) {
        return super.atLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atTrace() {
        return super.atTrace();
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 atWarn() {
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
        C5745 c5745 = new C5745();
        System.currentTimeMillis();
        c5745.f15739 = level;
        c5745.f15738 = this.logger;
        if (marker != null) {
            if (c5745.f15737 == null) {
                c5745.f15737 = new ArrayList(2);
            }
            c5745.f15737.add(marker);
        }
        Thread.currentThread().getName();
        c5745.f15736 = objArr;
        this.eventQueue.add(c5745);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ boolean isEnabledForLevel(Level level) {
        return super.isEnabledForLevel(level);
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isTraceEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public boolean isWarnEnabled() {
        return true;
    }

    @Override // org.slf4j.helpers.LegacyAbstractLogger, org.slf4j.helpers.AbstractLogger, p400.InterfaceC9156
    public /* bridge */ /* synthetic */ InterfaceC9150 makeLoggingEventBuilder(Level level) {
        return super.makeLoggingEventBuilder(level);
    }
}
