package kotlin;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5173 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short f14736;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4395.m8905(this.f14736 & 65535, ((C5173) obj).f14736 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5173) {
            return this.f14736 == ((C5173) obj).f14736;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f14736);
    }

    public final String toString() {
        return String.valueOf(this.f14736 & 65535);
    }
}
