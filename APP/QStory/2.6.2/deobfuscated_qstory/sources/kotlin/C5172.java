package kotlin;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5172 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final short f14736;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC4394.m8915(this.f14736 & 65535, ((C5172) obj).f14736 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5172) {
            return this.f14736 == ((C5172) obj).f14736;
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
