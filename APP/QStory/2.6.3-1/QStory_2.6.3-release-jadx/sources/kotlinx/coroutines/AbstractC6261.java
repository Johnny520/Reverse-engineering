package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6261 extends C6292 implements InterfaceC5189, InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5192 f15418;

    public AbstractC6261(InterfaceC5192 interfaceC5192, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m11139((InterfaceC6284) interfaceC5192.get(C6285.f15450));
        }
        this.f15418 = interfaceC5192.plus(this);
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f15418;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(obj);
        if (thM9307exceptionOrNullimpl != null) {
            obj = new C6262(thM9307exceptionOrNullimpl, false);
        }
        Object objM11148 = m11148(obj);
        if (objM11148 == AbstractC6231.f15379) {
            return;
        }
        mo10943(objM11148);
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final String mo11082() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f15418;
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void mo11083(CompletionHandlerException completionHandlerException) {
        AbstractC6231.m11055(this.f15418, completionHandlerException);
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo11084(Object obj) {
        if (!(obj instanceof C6262)) {
            mo10834(obj);
        } else {
            C6262 c6262 = (C6262) obj;
            mo10835(c6262.f15420, C6262.f15419.get(c6262) == 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public void mo10834(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public void mo10835(Throwable th, boolean z) {
    }
}
