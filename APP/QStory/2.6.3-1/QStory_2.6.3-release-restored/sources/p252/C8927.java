package p252;

import androidx.activity.AbstractC0900;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8927 f22707 = new C8927("HTTP", 2, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8927 f22706 = new C8927("HTTP", 1, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8927 f22705 = new C8927("HTTP", 1, 0);

    public C8927(String str, int i, int i2) {
        this.f22710 = str;
        this.f22709 = i;
        this.f22708 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8927)) {
            return false;
        }
        C8927 c8927 = (C8927) obj;
        return this.f22710.equals(c8927.f22710) && this.f22709 == c8927.f22709 && this.f22708 == c8927.f22708;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22708) + AbstractC0900.m704(this.f22709, this.f22710.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f22710 + '/' + this.f22709 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + this.f22708;
    }
}
