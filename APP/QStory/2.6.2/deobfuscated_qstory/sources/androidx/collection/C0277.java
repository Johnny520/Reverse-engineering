package androidx.collection;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0277 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m853(int i, int i2) {
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
        return AbstractC0053.m154(sb, (int) (j & 4294967295L), ')');
    }
}
