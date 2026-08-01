package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WeakReference f14606;

    public C5065(ClassLoader classLoader) {
        this.f14606 = new WeakReference(classLoader);
        this.f14605 = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5065) && this.f14606.get() == ((C5065) obj).f14606.get();
    }

    public final int hashCode() {
        return this.f14605;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f14606.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
