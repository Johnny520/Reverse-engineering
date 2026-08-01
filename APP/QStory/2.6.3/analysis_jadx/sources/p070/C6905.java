package p070;

import androidx.activity.AbstractC0053;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6905 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6905 f18417 = new C6905(256, 256, 256);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18418;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f18420;

    public C6905(int i, int i2, int i3) {
        this.f18420 = i;
        this.f18419 = i2;
        this.f18418 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6905)) {
            return false;
        }
        C6905 c6905 = (C6905) obj;
        return this.f18420 == c6905.f18420 && this.f18419 == c6905.f18419 && this.f18418 == c6905.f18418;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18418) + AbstractC0053.m144(this.f18419, Integer.hashCode(this.f18420) * 31, 31);
    }

    public final String toString() {
        int i = this.f18419;
        int i2 = this.f18418;
        int i3 = this.f18420;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(i);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(i2);
        return sb2.toString();
    }
}
