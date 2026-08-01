package p236;

import androidx.activity.AbstractC0053;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8098 f22362 = new C8098("HTTP", 2, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8098 f22361 = new C8098("HTTP", 1, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8098 f22360 = new C8098("HTTP", 1, 0);

    public C8098(String str, int i, int i2) {
        this.f22365 = str;
        this.f22364 = i;
        this.f22363 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8098)) {
            return false;
        }
        C8098 c8098 = (C8098) obj;
        return this.f22365.equals(c8098.f22365) && this.f22364 == c8098.f22364 && this.f22363 == c8098.f22363;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22363) + AbstractC0053.m144(this.f22364, this.f22365.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f22365 + '/' + this.f22364 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + this.f22363;
    }
}
