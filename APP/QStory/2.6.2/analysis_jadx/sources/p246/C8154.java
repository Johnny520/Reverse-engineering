package p246;

import io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final PluginTraceElement$PluginEvent f22488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22490;

    public C8154(String str, String str2, PluginTraceElement$PluginEvent pluginTraceElement$PluginEvent) {
        str2.getClass();
        pluginTraceElement$PluginEvent.getClass();
        this.f22490 = str;
        this.f22489 = str2;
        this.f22488 = pluginTraceElement$PluginEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8154)) {
            return false;
        }
        C8154 c8154 = (C8154) obj;
        return this.f22490.equals(c8154.f22490) && AbstractC4394.m8917(this.f22489, c8154.f22489) && this.f22488 == c8154.f22488;
    }

    public final int hashCode() {
        return this.f22488.hashCode() + AbstractC6136.m11539(this.f22490.hashCode() * 31, 31, this.f22489);
    }

    public final String toString() {
        return "PluginTraceElement(pluginName=" + this.f22490 + ", handler=" + this.f22489 + ", event=" + this.f22488 + ')';
    }
}
