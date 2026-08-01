package org.slf4j.helpers;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.Marker;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.InterfaceC5747;
import org.slf4j.event.Level;
import p398.InterfaceC9141;
import p399.InterfaceC9144;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5749 implements InterfaceC9141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EventRecordingLogger f15743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Method f15744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Queue f15745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f15746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile InterfaceC9141 f15747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Boolean f15748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15749;

    public C5749(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f15749 = str;
        this.f15745 = linkedBlockingQueue;
        this.f15746 = z;
    }

    @Override // p398.InterfaceC9141
    public final void debug(String str) {
        m11137().debug(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5749.class == obj.getClass() && this.f15749.equals(((C5749) obj).f15749);
    }

    @Override // p398.InterfaceC9141
    public final void error(String str, Throwable th) {
        m11137().error(str, th);
    }

    public final int hashCode() {
        return this.f15749.hashCode();
    }

    @Override // p398.InterfaceC9141
    public final void info(String str) {
        m11137().info(str);
    }

    @Override // p398.InterfaceC9141
    public final boolean isDebugEnabled() {
        return m11137().isDebugEnabled();
    }

    @Override // p398.InterfaceC9141
    public final boolean isEnabledForLevel(Level level) {
        return m11137().isEnabledForLevel(level);
    }

    @Override // p398.InterfaceC9141
    public final boolean isErrorEnabled() {
        return m11137().isErrorEnabled();
    }

    @Override // p398.InterfaceC9141
    public final boolean isInfoEnabled() {
        return m11137().isInfoEnabled();
    }

    @Override // p398.InterfaceC9141
    public final boolean isTraceEnabled() {
        return m11137().isTraceEnabled();
    }

    @Override // p398.InterfaceC9141
    public final boolean isWarnEnabled() {
        return m11137().isWarnEnabled();
    }

    @Override // p398.InterfaceC9141
    public final InterfaceC9144 makeLoggingEventBuilder(Level level) {
        return m11137().makeLoggingEventBuilder(level);
    }

    @Override // p398.InterfaceC9141
    public final void trace(String str) {
        m11137().trace(str);
    }

    @Override // p398.InterfaceC9141
    public final void warn(String str, Throwable th) {
        m11137().warn("Exception occurred during engine shutdown", th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m11136() {
        Boolean bool = this.f15748;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f15744 = this.f15747.getClass().getMethod("log", InterfaceC5747.class);
            this.f15748 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f15748 = Boolean.FALSE;
        }
        return this.f15748.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9141 m11137() {
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

    @Override // p398.InterfaceC9141
    public final void debug(String str, Throwable th) {
        m11137().debug(str, th);
    }

    @Override // p398.InterfaceC9141
    public final void error(Marker marker, String str, Throwable th) {
        m11137().error(marker, str, th);
    }

    @Override // p398.InterfaceC9141
    public final void info(Marker marker, String str, Throwable th) {
        m11137().info(marker, str, th);
    }

    @Override // p398.InterfaceC9141
    public final void trace(Marker marker, String str, Throwable th) {
        m11137().trace(marker, str, th);
    }

    @Override // p398.InterfaceC9141
    public final void debug(Marker marker, String str, Throwable th) {
        m11137().debug(marker, str, th);
    }

    @Override // p398.InterfaceC9141
    public final boolean isDebugEnabled(Marker marker) {
        return m11137().isDebugEnabled(marker);
    }

    @Override // p398.InterfaceC9141
    public final boolean isErrorEnabled(Marker marker) {
        return m11137().isErrorEnabled(marker);
    }

    @Override // p398.InterfaceC9141
    public final boolean isInfoEnabled(Marker marker) {
        return m11137().isInfoEnabled(marker);
    }

    @Override // p398.InterfaceC9141
    public final boolean isTraceEnabled(Marker marker) {
        return m11137().isTraceEnabled(marker);
    }

    @Override // p398.InterfaceC9141
    public final boolean isWarnEnabled(Marker marker) {
        return m11137().isWarnEnabled(marker);
    }

    @Override // p398.InterfaceC9141
    public final void warn(String str) {
        m11137().warn(str);
    }

    @Override // p398.InterfaceC9141
    public final void warn(Marker marker, String str, Throwable th) {
        m11137().warn(marker, str, th);
    }
}
