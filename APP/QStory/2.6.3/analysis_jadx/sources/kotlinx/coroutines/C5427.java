package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import p291.AbstractC8493;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5427 extends AbstractC5450 {
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5425 f15069;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5444 f15070;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC5398 f15071;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15068 = AtomicReferenceFieldUpdater.newUpdater(C5427.class, Object.class, "_disposer$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15067 = AbstractC8493.f23591.objectFieldOffset(C5427.class.getDeclaredField("_disposer$volatile"));

    public C5427(C5425 c5425, C5444 c5444) {
        this.f15069 = c5425;
        this.f15070 = c5444;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5426 m10521() {
        f15068.getClass();
        return (C5426) AbstractC8493.f23591.getObjectVolatile(this, f15067);
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) throws DispatchException {
        C5444 c5444 = this.f15070;
        if (th != null) {
            C4485 c4485M10536 = c5444.m10536(new C5430(th, false), null);
            if (c4485M10536 != null) {
                c5444.mo10433(c4485M10536);
                C5426 c5426M10521 = m10521();
                if (c5426M10521 != null) {
                    c5426M10521.m10520();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5425.f15064;
        C5425 c5425 = this.f15069;
        if (atomicIntegerFieldUpdater.decrementAndGet(c5425) == 0) {
            InterfaceC5408[] interfaceC5408Arr = c5425.f15065;
            ArrayList arrayList = new ArrayList(interfaceC5408Arr.length);
            for (InterfaceC5408 interfaceC5408 : interfaceC5408Arr) {
                arrayList.add(interfaceC5408.mo10510());
            }
            c5444.resumeWith(Result.m8745constructorimpl(arrayList));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m10522(C5426 c5426) {
        f15068.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f15067, c5426);
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return false;
    }
}
