package kotlinx.coroutines;

import kotlinx.coroutines.selects.InterfaceC6200;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6297 extends AbstractC6282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6200 f15468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C6292 f15469;

    public C6297(C6292 c6292, InterfaceC6200 interfaceC6200) {
        this.f15469 = c6292;
        this.f15468 = interfaceC6200;
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) {
        C6292 c6292 = this.f15469;
        Object objM11140 = c6292.m11140();
        if (!(objM11140 instanceof C6262)) {
            objM11140 = AbstractC6231.m11039(objM11140);
        }
        this.f15468.mo10971(c6292, objM11140);
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return false;
    }
}
