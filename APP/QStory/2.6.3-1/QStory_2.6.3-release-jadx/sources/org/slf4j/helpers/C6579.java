package org.slf4j.helpers;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.Marker;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.InterfaceC6577;
import org.slf4j.event.Level;
import p414.InterfaceC9970;
import p415.InterfaceC9973;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6579 implements InterfaceC9970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EventRecordingLogger f16088;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Method f16089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Queue f16090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f16091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile InterfaceC9970 f16092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Boolean f16093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f16094;

    public C6579(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f16094 = str;
        this.f16090 = linkedBlockingQueue;
        this.f16091 = z;
    }

    @Override // p414.InterfaceC9970
    public final void debug(String str) {
        m11696().debug(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6579.class == obj.getClass() && this.f16094.equals(((C6579) obj).f16094);
    }

    @Override // p414.InterfaceC9970
    public final void error(String str, Throwable th) {
        m11696().error(str, th);
    }

    public final int hashCode() {
        return this.f16094.hashCode();
    }

    @Override // p414.InterfaceC9970
    public final void info(String str) {
        m11696().info(str);
    }

    @Override // p414.InterfaceC9970
    public final boolean isDebugEnabled() {
        return m11696().isDebugEnabled();
    }

    @Override // p414.InterfaceC9970
    public final boolean isEnabledForLevel(Level level) {
        return m11696().isEnabledForLevel(level);
    }

    @Override // p414.InterfaceC9970
    public final boolean isErrorEnabled() {
        return m11696().isErrorEnabled();
    }

    @Override // p414.InterfaceC9970
    public final boolean isInfoEnabled() {
        return m11696().isInfoEnabled();
    }

    @Override // p414.InterfaceC9970
    public final boolean isTraceEnabled() {
        return m11696().isTraceEnabled();
    }

    @Override // p414.InterfaceC9970
    public final boolean isWarnEnabled() {
        return m11696().isWarnEnabled();
    }

    @Override // p414.InterfaceC9970
    public final InterfaceC9973 makeLoggingEventBuilder(Level level) {
        return m11696().makeLoggingEventBuilder(level);
    }

    @Override // p414.InterfaceC9970
    public final void trace(String str) {
        m11696().trace(str);
    }

    @Override // p414.InterfaceC9970
    public final void warn(String str, Throwable th) {
        m11696().warn("Exception occurred during engine shutdown", th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m11695() {
        Boolean bool = this.f16093;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f16089 = this.f16092.getClass().getMethod("log", InterfaceC6577.class);
            this.f16093 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f16093 = Boolean.FALSE;
        }
        return this.f16093.booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9970 m11696() {
        if (this.f16092 != null) {
            return this.f16092;
        }
        if (this.f16091) {
            return NOPLogger.NOP_LOGGER;
        }
        if (this.f16088 == null) {
            this.f16088 = new EventRecordingLogger(this, this.f16090);
        }
        return this.f16088;
    }

    @Override // p414.InterfaceC9970
    public final void debug(String str, Throwable th) {
        m11696().debug(str, th);
    }

    @Override // p414.InterfaceC9970
    public final void error(Marker marker, String str, Throwable th) {
        m11696().error(marker, str, th);
    }

    @Override // p414.InterfaceC9970
    public final void info(Marker marker, String str, Throwable th) {
        m11696().info(marker, str, th);
    }

    @Override // p414.InterfaceC9970
    public final void trace(Marker marker, String str, Throwable th) {
        m11696().trace(marker, str, th);
    }

    @Override // p414.InterfaceC9970
    public final void debug(Marker marker, String str, Throwable th) {
        m11696().debug(marker, str, th);
    }

    @Override // p414.InterfaceC9970
    public final boolean isDebugEnabled(Marker marker) {
        return m11696().isDebugEnabled(marker);
    }

    @Override // p414.InterfaceC9970
    public final boolean isErrorEnabled(Marker marker) {
        return m11696().isErrorEnabled(marker);
    }

    @Override // p414.InterfaceC9970
    public final boolean isInfoEnabled(Marker marker) {
        return m11696().isInfoEnabled(marker);
    }

    @Override // p414.InterfaceC9970
    public final boolean isTraceEnabled(Marker marker) {
        return m11696().isTraceEnabled(marker);
    }

    @Override // p414.InterfaceC9970
    public final boolean isWarnEnabled(Marker marker) {
        return m11696().isWarnEnabled(marker);
    }

    @Override // p414.InterfaceC9970
    public final void warn(String str) {
        m11696().warn(str);
    }

    @Override // p414.InterfaceC9970
    public final void warn(Marker marker, String str, Throwable th) {
        m11696().warn(marker, str, th);
    }
}
