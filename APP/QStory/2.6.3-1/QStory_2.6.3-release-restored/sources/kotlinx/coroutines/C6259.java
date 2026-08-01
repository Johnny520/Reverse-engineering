package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import p307.AbstractC9322;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6259 extends AbstractC6282 {
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6257 f15414;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6276 f15415;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC6230 f15416;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15413 = AtomicReferenceFieldUpdater.newUpdater(C6259.class, Object.class, "_disposer$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15412 = AbstractC9322.f23936.objectFieldOffset(C6259.class.getDeclaredField("_disposer$volatile"));

    public C6259(C6257 c6257, C6276 c6276) {
        this.f15414 = c6257;
        this.f15415 = c6276;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C6258 m11080() {
        f15413.getClass();
        return (C6258) AbstractC9322.f23936.getObjectVolatile(this, f15412);
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) throws DispatchException {
        C6276 c6276 = this.f15415;
        if (th != null) {
            C5317 c5317M11095 = c6276.m11095(new C6262(th, false), null);
            if (c5317M11095 != null) {
                c6276.mo10992(c5317M11095);
                C6258 c6258M11080 = m11080();
                if (c6258M11080 != null) {
                    c6258M11080.m11079();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6257.f15409;
        C6257 c6257 = this.f15414;
        if (atomicIntegerFieldUpdater.decrementAndGet(c6257) == 0) {
            InterfaceC6240[] interfaceC6240Arr = c6257.f15410;
            ArrayList arrayList = new ArrayList(interfaceC6240Arr.length);
            for (InterfaceC6240 interfaceC6240 : interfaceC6240Arr) {
                arrayList.add(interfaceC6240.mo11069());
            }
            c6276.resumeWith(Result.m9304constructorimpl(arrayList));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m11081(C6258 c6258) {
        f15413.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15412, c6258);
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return false;
    }
}
