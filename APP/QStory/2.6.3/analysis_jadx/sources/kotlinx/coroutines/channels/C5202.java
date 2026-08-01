package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5202 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5210 f14790 = new C5210();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m10272(Object obj) {
        if (obj instanceof C5210) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Throwable m10273(Object obj) {
        C5209 c5209 = obj instanceof C5209 ? (C5209) obj : null;
        if (c5209 != null) {
            return c5209.f14797;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5202) {
            return AbstractC4395.m8907(this.f14791, ((C5202) obj).f14791);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f14791;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f14791;
        if (obj instanceof C5209) {
            return ((C5209) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
