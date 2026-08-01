package bsh;

import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2654 implements Supplier, Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ThreadLocal f7943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final WeakHashMap f7944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile boolean f7945;

    static {
        C2654 c2654 = new C2654();
        c2654.f7945 = true;
        f7943 = ThreadLocal.withInitial(c2654);
        f7944 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5315() {
        return ((Boolean) f7943.get()).booleanValue();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f7945 = ((Boolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Boolean.valueOf(this.f7945);
    }
}
