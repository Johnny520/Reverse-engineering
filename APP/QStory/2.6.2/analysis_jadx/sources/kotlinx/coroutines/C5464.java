package kotlinx.coroutines;

import kotlinx.coroutines.selects.InterfaceC5367;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5464 extends AbstractC5449 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5367 f15123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C5459 f15124;

    public C5464(C5459 c5459, InterfaceC5367 interfaceC5367) {
        this.f15124 = c5459;
        this.f15123 = interfaceC5367;
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10464(Throwable th) {
        C5459 c5459 = this.f15124;
        Object objM10578 = c5459.m10578();
        if (!(objM10578 instanceof C5429)) {
            objM10578 = AbstractC5398.m10476(objM10578);
        }
        this.f15123.mo10408(c5459, objM10578);
    }

    @Override // kotlinx.coroutines.AbstractC5449
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10465() {
        return false;
    }
}
