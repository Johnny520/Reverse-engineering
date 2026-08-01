package androidx.compose.runtime;

import androidx.compose.runtime.internal.AbstractC1246;
import kotlin.AbstractC5184;
import kotlin.Result;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1355 extends AbstractC1246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6557 f3927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5443 f3928;

    @Override // androidx.compose.runtime.internal.AbstractC1246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2159(Throwable th) {
        C5443 c5443 = this.f3928;
        if (c5443 != null) {
            c5443.resumeWith(Result.m8755constructorimpl(AbstractC5184.m10207(th)));
        }
    }

    @Override // androidx.compose.runtime.internal.AbstractC1246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2160() {
        this.f3927 = null;
        this.f3928 = null;
    }
}
