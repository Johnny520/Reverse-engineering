package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f13171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13173;

    public C4523(int i, int i2, int i3) {
        this.f13173 = i;
        this.f13172 = i2;
        this.f13171 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4523)) {
            return false;
        }
        C4523 c4523 = (C4523) obj;
        return this.f13173 == c4523.f13173 && this.f13172 == c4523.f13172 && this.f13171 == c4523.f13171;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13171) + AbstractC0053.m144(this.f13172, Integer.hashCode(this.f13173) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13173);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13172);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13171);
        return sb.toString();
    }
}
