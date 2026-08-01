package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f7033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f7034;

    public C2393(Method method, int i) {
        this.f7034 = i;
        this.f7033 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2393)) {
            return false;
        }
        C2393 c2393 = (C2393) obj;
        return this.f7034 == c2393.f7034 && this.f7033.getName().equals(c2393.f7033.getName());
    }

    public final int hashCode() {
        return this.f7033.getName().hashCode() + (this.f7034 * 31);
    }
}
