package androidx.compose.runtime;

import androidx.compose.runtime.internal.AbstractC1246;
import kotlin.AbstractC5185;
import kotlin.Result;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1355 extends AbstractC1246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6558 f3928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5444 f3929;

    @Override // androidx.compose.runtime.internal.AbstractC1246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2169(Throwable th) {
        C5444 c5444 = this.f3929;
        if (c5444 != null) {
            c5444.resumeWith(Result.m8745constructorimpl(AbstractC5185.m10211(th)));
        }
    }

    @Override // androidx.compose.runtime.internal.AbstractC1246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2170() {
        this.f3928 = null;
        this.f3929 = null;
    }
}
