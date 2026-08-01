package kotlin;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6013 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f15089;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC5227.m9464(this.f15089 ^ Integer.MIN_VALUE, ((C6013) obj).f15089 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6013) {
            return this.f15089 == ((C6013) obj).f15089;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15089);
    }

    public final String toString() {
        return String.valueOf(((long) this.f15089) & 4294967295L);
    }
}
