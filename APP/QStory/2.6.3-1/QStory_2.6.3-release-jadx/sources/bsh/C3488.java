package bsh;

import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3488 implements Supplier, Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ThreadLocal f8290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final WeakHashMap f8291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f8292;

    static {
        C3488 c3488 = new C3488();
        c3488.f8292 = true;
        f8290 = ThreadLocal.withInitial(c3488);
        f8291 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5920() {
        return ((Boolean) f8290.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f8292 = ((Boolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f8292);
    }
}
