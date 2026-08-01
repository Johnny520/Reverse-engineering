package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5519 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5519 f14039 = new C5519("");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public transient C5519 f14040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5518 f14041;

    public C5519(String str) {
        str.getClass();
        this.f14041 = new C5518(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5519) {
            return AbstractC5227.m9466(this.f14041, ((C5519) obj).f14041);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14041.f14038.hashCode();
    }

    public final String toString() {
        return this.f14041.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5519 m9879() {
        C5519 c5519 = this.f14040;
        if (c5519 != null) {
            return c5519;
        }
        C5518 c5518 = this.f14041;
        if (c5518.m9873()) {
            C6755.m11870("root");
            return null;
        }
        C5519 c55192 = new C5519(c5518.m9871());
        this.f14040 = c55192;
        return c55192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 m9880(C5523 c5523) {
        c5523.getClass();
        return new C5519(this.f14041.m9875(c5523), this);
    }

    public C5519(C5518 c5518) {
        this.f14041 = c5518;
    }

    public C5519(C5518 c5518, C5519 c5519) {
        this.f14041 = c5518;
        this.f14040 = c5519;
    }
}
