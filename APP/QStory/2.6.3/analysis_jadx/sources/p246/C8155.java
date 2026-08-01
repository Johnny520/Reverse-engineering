package p246;

import io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final PluginTraceElement$PluginEvent f22486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22488;

    public C8155(String str, String str2, PluginTraceElement$PluginEvent pluginTraceElement$PluginEvent) {
        str2.getClass();
        pluginTraceElement$PluginEvent.getClass();
        this.f22488 = str;
        this.f22487 = str2;
        this.f22486 = pluginTraceElement$PluginEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8155)) {
            return false;
        }
        C8155 c8155 = (C8155) obj;
        return this.f22488.equals(c8155.f22488) && AbstractC4395.m8907(this.f22487, c8155.f22487) && this.f22486 == c8155.f22486;
    }

    public final int hashCode() {
        return this.f22486.hashCode() + AbstractC6183.m11572(this.f22488.hashCode() * 31, 31, this.f22487);
    }

    public final String toString() {
        return "PluginTraceElement(pluginName=" + this.f22488 + ", handler=" + this.f22487 + ", event=" + this.f22486 + ')';
    }
}
