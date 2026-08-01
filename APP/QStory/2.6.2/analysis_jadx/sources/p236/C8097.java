package p236;

import androidx.activity.AbstractC0053;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8097 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8097 f22364 = new C8097("HTTP", 2, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8097 f22363 = new C8097("HTTP", 1, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8097 f22362 = new C8097("HTTP", 1, 0);

    public C8097(String str, int i, int i2) {
        this.f22367 = str;
        this.f22366 = i;
        this.f22365 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8097)) {
            return false;
        }
        C8097 c8097 = (C8097) obj;
        return this.f22367.equals(c8097.f22367) && this.f22366 == c8097.f22366 && this.f22365 == c8097.f22365;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22365) + AbstractC0053.m143(this.f22366, this.f22367.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f22367 + '/' + this.f22366 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + this.f22365;
    }
}
