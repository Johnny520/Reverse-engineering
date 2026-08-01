package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC5189;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6281 extends C6276 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6292 f15447;

    public C6281(C6292 c6292, InterfaceC5189 interfaceC5189) {
        super(1, interfaceC5189);
        this.f15447 = c6292;
    }

    @Override // kotlinx.coroutines.C6276
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo11093() {
        return "AwaitContinuation";
    }

    @Override // kotlinx.coroutines.C6276
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Throwable mo11108(C6292 c6292) {
        Throwable thM11154;
        Object objM11140 = this.f15447.m11140();
        return (!(objM11140 instanceof C6296) || (thM11154 = ((C6296) objM11140).m11154()) == null) ? objM11140 instanceof C6262 ? ((C6262) objM11140).f15420 : c6292.mo11122() : thM11154;
    }
}
