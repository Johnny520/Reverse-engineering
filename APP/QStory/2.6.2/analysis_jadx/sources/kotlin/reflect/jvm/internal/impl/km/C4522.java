package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4522 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f13167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13169;

    public C4522(int i, int i2, int i3) {
        this.f13169 = i;
        this.f13168 = i2;
        this.f13167 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4522)) {
            return false;
        }
        C4522 c4522 = (C4522) obj;
        return this.f13169 == c4522.f13169 && this.f13168 == c4522.f13168 && this.f13167 == c4522.f13167;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13167) + AbstractC0053.m143(this.f13168, Integer.hashCode(this.f13169) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13169);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13168);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13167);
        return sb.toString();
    }
}
