package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3226 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f7379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f7380;

    public C3226(Method method, int i) {
        this.f7380 = i;
        this.f7379 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3226)) {
            return false;
        }
        C3226 c3226 = (C3226) obj;
        return this.f7380 == c3226.f7380 && this.f7379.getName().equals(c3226.f7379.getName());
    }

    public final int hashCode() {
        return this.f7379.getName().hashCode() + (this.f7380 * 31);
    }
}
