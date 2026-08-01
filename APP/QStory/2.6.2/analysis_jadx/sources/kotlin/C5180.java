package kotlin;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5180 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f14744;

    public /* synthetic */ C5180(int i) {
        this.f14744 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC4394.m8915(this.f14744 ^ Integer.MIN_VALUE, ((C5180) obj).f14744 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5180) {
            return this.f14744 == ((C5180) obj).f14744;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14744);
    }

    public final String toString() {
        return String.valueOf(((long) this.f14744) & 4294967295L);
    }
}
