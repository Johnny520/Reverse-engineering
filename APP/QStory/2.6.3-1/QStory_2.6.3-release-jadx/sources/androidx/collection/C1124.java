package androidx.collection;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f1329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m1414(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1124) {
            return this.f1329 == ((C1124) obj).f1329;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1329);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f1329;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC0900.m716(sb, (int) (j & 4294967295L), ')');
    }
}
