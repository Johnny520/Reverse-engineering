package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6181;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6269 extends AbstractC6282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6276 f15430;

    public C6269(C6276 c6276) {
        this.f15430 = c6276;
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) throws DispatchException {
        C6292 c6292M11112 = m11112();
        C6276 c6276 = this.f15430;
        Throwable thMo11108 = c6276.mo11108(c6292M11112);
        if (!c6276.m11094() ? false : ((C6181) c6276.f15441).m10905(thMo11108)) {
            return;
        }
        c6276.mo10994(thMo11108);
        c6276.m11104();
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return true;
    }
}
