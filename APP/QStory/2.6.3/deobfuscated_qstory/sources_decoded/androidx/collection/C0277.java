package androidx.collection;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0277 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m854(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0277) {
            return this.f984 == ((C0277) obj).f984;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f984);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f984;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0053.m156(sb, (int) (j & 4294967295L), ')');
    }
}
