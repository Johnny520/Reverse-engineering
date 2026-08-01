package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import p291.AbstractC8501;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5426 extends AbstractC5449 {
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5424 f15069;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5443 f15070;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC5397 f15071;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15068 = AtomicReferenceFieldUpdater.newUpdater(C5426.class, Object.class, "_disposer$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15067 = AbstractC8501.f23600.objectFieldOffset(C5426.class.getDeclaredField("_disposer$volatile"));

    public C5426(C5424 c5424, C5443 c5443) {
        this.f15069 = c5424;
        this.f15070 = c5443;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5425 m10517() {
        f15068.getClass();
        return (C5425) AbstractC8501.f23600.getObjectVolatile(this, f15067);
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) throws DispatchException {
        C5443 c5443 = this.f15070;
        if (th != null) {
            C4484 c4484M10532 = c5443.m10532(new C5429(th, false), null);
            if (c4484M10532 != null) {
                c5443.mo10429(c4484M10532);
                C5425 c5425M10517 = m10517();
                if (c5425M10517 != null) {
                    c5425M10517.m10516();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5424.f15064;
        C5424 c5424 = this.f15069;
        if (atomicIntegerFieldUpdater.decrementAndGet(c5424) == 0) {
            InterfaceC5407[] interfaceC5407Arr = c5424.f15065;
            ArrayList arrayList = new ArrayList(interfaceC5407Arr.length);
            for (InterfaceC5407 interfaceC5407 : interfaceC5407Arr) {
                arrayList.add(interfaceC5407.mo10506());
            }
            c5443.resumeWith(Result.m8755constructorimpl(arrayList));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m10518(C5425 c5425) {
        f15068.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f15067, c5425);
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return false;
    }
}
