package kotlinx.coroutines;

import kotlin.AbstractC5185;
import kotlin.Result;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5456 extends AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5449 f15107;

    public C5456(C5449 c5449) {
        this.f15107 = c5449;
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) {
        Object objM10581 = m10553().m10581();
        boolean z = objM10581 instanceof C5430;
        C5449 c5449 = this.f15107;
        if (z) {
            c5449.resumeWith(Result.m8745constructorimpl(AbstractC5185.m10211(((C5430) objM10581).f15075)));
        } else {
            c5449.resumeWith(Result.m8745constructorimpl(AbstractC5399.m10480(objM10581)));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return false;
    }
}
