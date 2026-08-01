package bsh;

import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2655 implements Supplier, Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ThreadLocal f7945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final WeakHashMap f7946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f7947;

    static {
        C2655 c2655 = new C2655();
        c2655.f7947 = true;
        f7945 = ThreadLocal.withInitial(c2655);
        f7946 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5360() {
        return ((Boolean) f7945.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f7947 = ((Boolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f7947);
    }
}
