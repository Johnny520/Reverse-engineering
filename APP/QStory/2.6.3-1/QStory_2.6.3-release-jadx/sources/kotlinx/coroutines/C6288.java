package kotlinx.coroutines;

import kotlin.AbstractC6017;
import kotlin.Result;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6288 extends AbstractC6282 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6281 f15452;

    public C6288(C6281 c6281) {
        this.f15452 = c6281;
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11027(Throwable th) {
        Object objM11140 = m11112().m11140();
        boolean z = objM11140 instanceof C6262;
        C6281 c6281 = this.f15452;
        if (z) {
            c6281.resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770(((C6262) objM11140).f15420)));
        } else {
            c6281.resumeWith(Result.m9304constructorimpl(AbstractC6231.m11039(objM11140)));
        }
    }

    @Override // kotlinx.coroutines.AbstractC6282
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo11028() {
        return false;
    }
}
