package kotlin.reflect.jvm.internal.impl.p009km;

import androidx.activity.AbstractC0900;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5355 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f13516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f13518;

    public C5355(int i, int i2, int i3) {
        this.f13518 = i;
        this.f13517 = i2;
        this.f13516 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5355)) {
            return false;
        }
        C5355 c5355 = (C5355) obj;
        return this.f13518 == c5355.f13518 && this.f13517 == c5355.f13517 && this.f13516 == c5355.f13516;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13516) + AbstractC0900.m704(this.f13517, Integer.hashCode(this.f13518) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13518);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13517);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f13516);
        return sb.toString();
    }
}
