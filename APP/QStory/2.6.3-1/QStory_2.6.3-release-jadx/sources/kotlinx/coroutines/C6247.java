package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.coroutines.C5188;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.C6192;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6247 extends C6192 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ThreadLocal f15401;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6247(InterfaceC5189 interfaceC5189, InterfaceC5192 interfaceC5192) {
        C6243 c6243 = C6243.f15396;
        super(interfaceC5189, interfaceC5192.get(c6243) == null ? interfaceC5192.plus(c6243) : interfaceC5192);
        this.f15401 = new ThreadLocal();
        if (interfaceC5189.getContext().get(C5188.f13281) instanceof AbstractC6264) {
            return;
        }
        Object objM10927 = AbstractC6185.m10927(interfaceC5192, null);
        AbstractC6185.m10930(interfaceC5192, objM10927);
        m11075(interfaceC5192, objM10927);
    }

    @Override // kotlinx.coroutines.internal.C6192, kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo10943(Object obj) {
        m11074();
        Object objM11034 = AbstractC6231.m11034(obj);
        InterfaceC5189 interfaceC5189 = this.f15287;
        InterfaceC5192 context = interfaceC5189.getContext();
        Object objM10927 = AbstractC6185.m10927(context, null);
        C6247 c6247M11030 = objM10927 != AbstractC6185.f15273 ? AbstractC6231.m11030(interfaceC5189, context, objM10927) : null;
        try {
            interfaceC5189.resumeWith(objM11034);
            if (c6247M11030 == null || c6247M11030.m11076()) {
                AbstractC6185.m10930(context, objM10927);
            }
        } catch (Throwable th) {
            if (c6247M11030 == null || c6247M11030.m11076()) {
                AbstractC6185.m10930(context, objM10927);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void m11074() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f15401.get();
            if (pair != null) {
                AbstractC6185.m10930((InterfaceC5192) pair.component1(), pair.component2());
            }
            this.f15401.remove();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final void m11075(InterfaceC5192 interfaceC5192, Object obj) {
        this.threadLocalIsSet = true;
        this.f15401.set(new Pair(interfaceC5192, obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final boolean m11076() {
        boolean z = this.threadLocalIsSet && this.f15401.get() == null;
        this.f15401.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.internal.C6192
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final void mo10944() {
        m11074();
    }
}
