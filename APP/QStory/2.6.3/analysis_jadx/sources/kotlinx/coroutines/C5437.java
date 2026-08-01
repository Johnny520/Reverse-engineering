package kotlinx.coroutines;

import kotlinx.coroutines.internal.C5349;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5437 extends AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5444 f15085;

    public C5437(C5444 c5444) {
        this.f15085 = c5444;
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) throws DispatchException {
        C5460 c5460M10553 = m10553();
        C5444 c5444 = this.f15085;
        Throwable thMo10549 = c5444.mo10549(c5460M10553);
        if (!c5444.m10535() ? false : ((C5349) c5444.f15096).m10346(thMo10549)) {
            return;
        }
        c5444.mo10435(thMo10549);
        c5444.m10545();
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return true;
    }
}
