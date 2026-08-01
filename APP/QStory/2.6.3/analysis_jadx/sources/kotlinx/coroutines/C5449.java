package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC4357;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5449 extends C5444 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5460 f15102;

    public C5449(C5460 c5460, InterfaceC4357 interfaceC4357) {
        super(1, interfaceC4357);
        this.f15102 = c5460;
    }

    @Override // kotlinx.coroutines.C5444
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo10534() {
        return "AwaitContinuation";
    }

    @Override // kotlinx.coroutines.C5444
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Throwable mo10549(C5460 c5460) {
        Throwable thM10595;
        Object objM10581 = this.f15102.m10581();
        return (!(objM10581 instanceof C5464) || (thM10595 = ((C5464) objM10581).m10595()) == null) ? objM10581 instanceof C5430 ? ((C5430) objM10581).f15075 : c5460.mo10563() : thM10595;
    }
}
