package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WeakReference f14951;

    public C5898(ClassLoader classLoader) {
        this.f14951 = new WeakReference(classLoader);
        this.f14950 = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5898) && this.f14951.get() == ((C5898) obj).f14951.get();
    }

    public final int hashCode() {
        return this.f14950;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f14951.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
