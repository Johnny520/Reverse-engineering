package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5209 f14790 = new C5209();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m10268(Object obj) {
        if (obj instanceof C5209) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Throwable m10269(Object obj) {
        C5208 c5208 = obj instanceof C5208 ? (C5208) obj : null;
        if (c5208 != null) {
            return c5208.f14797;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5201) {
            return AbstractC4394.m8917(this.f14791, ((C5201) obj).f14791);
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
        if (obj instanceof C5208) {
            return ((C5208) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
