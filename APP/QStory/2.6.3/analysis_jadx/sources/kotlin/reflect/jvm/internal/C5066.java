package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WeakReference f14606;

    public C5066(ClassLoader classLoader) {
        this.f14606 = new WeakReference(classLoader);
        this.f14605 = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5066) && this.f14606.get() == ((C5066) obj).f14606.get();
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
