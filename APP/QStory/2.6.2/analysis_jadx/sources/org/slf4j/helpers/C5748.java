package org.slf4j.helpers;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.Marker;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.InterfaceC5746;
import org.slf4j.event.Level;
import p397.InterfaceC9150;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5748 implements InterfaceC9156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EventRecordingLogger f15743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Method f15744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Queue f15745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f15746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile InterfaceC9156 f15747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Boolean f15748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15749;

    public C5748(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f15749 = str;
        this.f15745 = linkedBlockingQueue;
        this.f15746 = z;
    }

    @Override // p400.InterfaceC9156
    public final void debug(String str) {
        m11080().debug(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5748.class == obj.getClass() && this.f15749.equals(((C5748) obj).f15749);
    }

    @Override // p400.InterfaceC9156
    public final void error(String str, Throwable th) {
        m11080().error(str, th);
    }

    public final int hashCode() {
        return this.f15749.hashCode();
    }

    @Override // p400.InterfaceC9156
    public final void info(String str) {
        m11080().info(str);
    }

    @Override // p400.InterfaceC9156
    public final boolean isDebugEnabled() {
        return m11080().isDebugEnabled();
    }

    @Override // p400.InterfaceC9156
    public final boolean isEnabledForLevel(Level level) {
        return m11080().isEnabledForLevel(level);
    }

    @Override // p400.InterfaceC9156
    public final boolean isErrorEnabled() {
        return m11080().isErrorEnabled();
    }

    @Override // p400.InterfaceC9156
    public final boolean isInfoEnabled() {
        return m11080().isInfoEnabled();
    }

    @Override // p400.InterfaceC9156
    public final boolean isTraceEnabled() {
        return m11080().isTraceEnabled();
    }

    @Override // p400.InterfaceC9156
    public final boolean isWarnEnabled() {
        return m11080().isWarnEnabled();
    }

    @Override // p400.InterfaceC9156
    public final InterfaceC9150 makeLoggingEventBuilder(Level level) {
        return m11080().makeLoggingEventBuilder(level);
    }

    @Override // p400.InterfaceC9156
    public final void trace(String str) {
        m11080().trace(str);
    }

    @Override // p400.InterfaceC9156
    public final void warn(String str, Throwable th) {
        m11080().warn("Exception occurred during engine shutdown", th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m11079() {
        Boolean bool = this.f15748;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f15744 = this.f15747.getClass().getMethod("log", InterfaceC5746.class);
            this.f15748 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f15748 = Boolean.FALSE;
        }
        return this.f15748.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9156 m11080() {
        if (this.f15747 != null) {
            return this.f15747;
        }
        if (this.f15746) {
            return NOPLogger.NOP_LOGGER;
        }
        if (this.f15743 == null) {
            this.f15743 = new EventRecordingLogger(this, this.f15745);
        }
        return this.f15743;
    }

    @Override // p400.InterfaceC9156
    public final void debug(String str, Throwable th) {
        m11080().debug(str, th);
    }

    @Override // p400.InterfaceC9156
    public final void error(Marker marker, String str, Throwable th) {
        m11080().error(marker, str, th);
    }

    @Override // p400.InterfaceC9156
    public final void info(Marker marker, String str, Throwable th) {
        m11080().info(marker, str, th);
    }

    @Override // p400.InterfaceC9156
    public final void trace(Marker marker, String str, Throwable th) {
        m11080().trace(marker, str, th);
    }

    @Override // p400.InterfaceC9156
    public final void debug(Marker marker, String str, Throwable th) {
        m11080().debug(marker, str, th);
    }

    @Override // p400.InterfaceC9156
    public final boolean isDebugEnabled(Marker marker) {
        return m11080().isDebugEnabled(marker);
    }

    @Override // p400.InterfaceC9156
    public final boolean isErrorEnabled(Marker marker) {
        return m11080().isErrorEnabled(marker);
    }

    @Override // p400.InterfaceC9156
    public final boolean isInfoEnabled(Marker marker) {
        return m11080().isInfoEnabled(marker);
    }

    @Override // p400.InterfaceC9156
    public final boolean isTraceEnabled(Marker marker) {
        return m11080().isTraceEnabled(marker);
    }

    @Override // p400.InterfaceC9156
    public final boolean isWarnEnabled(Marker marker) {
        return m11080().isWarnEnabled(marker);
    }

    @Override // p400.InterfaceC9156
    public final void warn(String str) {
        m11080().warn(str);
    }

    @Override // p400.InterfaceC9156
    public final void warn(Marker marker, String str, Throwable th) {
        m11080().warn(marker, str, th);
    }
}
