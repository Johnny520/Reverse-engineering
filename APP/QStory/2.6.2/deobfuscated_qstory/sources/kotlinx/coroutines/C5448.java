package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC4356;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5448 extends C5443 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5459 f15102;

    public C5448(C5459 c5459, InterfaceC4356 interfaceC4356) {
        super(1, interfaceC4356);
        this.f15102 = c5459;
    }

    @Override // kotlinx.coroutines.C5443
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final String mo10530() {
        return "AwaitContinuation";
    }

    @Override // kotlinx.coroutines.C5443
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Throwable mo10545(C5459 c5459) {
        Throwable thM10591;
        Object objM10578 = this.f15102.m10578();
        return (!(objM10578 instanceof C5463) || (thM10591 = ((C5463) objM10578).m10591()) == null) ? objM10578 instanceof C5429 ? ((C5429) objM10578).f15075 : c5459.mo10559() : thM10591;
    }
}
