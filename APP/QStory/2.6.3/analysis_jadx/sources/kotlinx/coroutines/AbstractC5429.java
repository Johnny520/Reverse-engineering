package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5429 extends C5460 implements InterfaceC4357, InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4360 f15073;

    public AbstractC5429(InterfaceC4360 interfaceC4360, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m10580((InterfaceC5452) interfaceC4360.get(C5453.f15105));
        }
        this.f15073 = interfaceC4360.plus(this);
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f15073;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(obj);
        if (thM8748exceptionOrNullimpl != null) {
            obj = new C5430(thM8748exceptionOrNullimpl, false);
        }
        Object objM10589 = m10589(obj);
        if (objM10589 == AbstractC5399.f15034) {
            return;
        }
        mo10384(objM10589);
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final String mo10523() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f15073;
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void mo10524(CompletionHandlerException completionHandlerException) {
        AbstractC5399.m10496(this.f15073, completionHandlerException);
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo10525(Object obj) {
        if (!(obj instanceof C5430)) {
            mo10275(obj);
        } else {
            C5430 c5430 = (C5430) obj;
            mo10276(c5430.f15075, C5430.f15074.get(c5430) == 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public void mo10275(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public void mo10276(Throwable th, boolean z) {
    }
}
