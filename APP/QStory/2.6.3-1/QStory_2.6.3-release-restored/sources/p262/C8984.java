package p262;

import io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8984 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final PluginTraceElement$PluginEvent f22831;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22833;

    public C8984(String str, String str2, PluginTraceElement$PluginEvent pluginTraceElement$PluginEvent) {
        str2.getClass();
        pluginTraceElement$PluginEvent.getClass();
        this.f22833 = str;
        this.f22832 = str2;
        this.f22831 = pluginTraceElement$PluginEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8984)) {
            return false;
        }
        C8984 c8984 = (C8984) obj;
        return this.f22833.equals(c8984.f22833) && AbstractC5227.m9466(this.f22832, c8984.f22832) && this.f22831 == c8984.f22831;
    }

    public final int hashCode() {
        return this.f22831.hashCode() + AbstractC7012.m12131(this.f22833.hashCode() * 31, 31, this.f22832);
    }

    public final String toString() {
        return "PluginTraceElement(pluginName=" + this.f22833 + ", handler=" + this.f22832 + ", event=" + this.f22831 + ')';
    }
}
