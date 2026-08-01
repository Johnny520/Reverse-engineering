package kotlinx.coroutines;

import kotlin.C5176;
import kotlin.Result;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5418 extends AbstractC5450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5444 f15058;

    public C5418(C5444 c5444) {
        this.f15058 = c5444;
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo10468(Throwable th) {
        this.f15058.resumeWith(Result.m8745constructorimpl(C5176.f14739));
    }

    @Override // kotlinx.coroutines.AbstractC5450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo10469() {
        return false;
    }
}
