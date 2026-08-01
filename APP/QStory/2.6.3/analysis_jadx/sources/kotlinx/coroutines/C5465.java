package kotlinx.coroutines;

import kotlinx.coroutines.selects.InterfaceC5368;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5465 extends AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5368 f15123;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C5460 f15124;

    public C5465(C5460 c5460, InterfaceC5368 interfaceC5368) {
        this.f15124 = c5460;
        this.f15123 = interfaceC5368;
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) {
        C5460 c5460 = this.f15124;
        Object objM10581 = c5460.m10581();
        if (!(objM10581 instanceof C5430)) {
            objM10581 = AbstractC5399.m10480(objM10581);
        }
        this.f15123.mo10412(c5460, objM10581);
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return false;
    }
}
