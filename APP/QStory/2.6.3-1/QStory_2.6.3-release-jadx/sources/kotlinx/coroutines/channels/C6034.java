package kotlinx.coroutines.channels;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6042 f15135 = new C6042();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f15136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m10831(Object obj) {
        if (obj instanceof C6042) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Throwable m10832(Object obj) {
        C6041 c6041 = obj instanceof C6041 ? (C6041) obj : null;
        if (c6041 != null) {
            return c6041.f15142;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6034) {
            return AbstractC5227.m9466(this.f15136, ((C6034) obj).f15136);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f15136;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f15136;
        if (obj instanceof C6041) {
            return ((C6041) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
