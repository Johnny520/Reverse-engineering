package kotlin;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5181 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f14744;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC4395.m8905(this.f14744 ^ Integer.MIN_VALUE, ((C5181) obj).f14744 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5181) {
            return this.f14744 == ((C5181) obj).f14744;
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
