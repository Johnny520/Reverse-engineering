package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f7034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f7035;

    public C2393(Method method, int i) {
        this.f7035 = i;
        this.f7034 = method;
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
        return this.f7035 == c2393.f7035 && this.f7034.getName().equals(c2393.f7034.getName());
    }

    public final int hashCode() {
        return this.f7034.getName().hashCode() + (this.f7035 * 31);
    }
}
