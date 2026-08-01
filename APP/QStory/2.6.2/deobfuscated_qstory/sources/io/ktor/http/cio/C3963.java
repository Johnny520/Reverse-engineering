package io.ktor.http.cio;

import androidx.compose.foundation.C1067;
import io.ktor.utils.io.C4248;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5437;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3963 extends AbstractC3967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4248 f12194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5437 f12195;

    public C3963(C5437 c5437, C4248 c4248) {
        this.f12195 = c5437;
        this.f12194 = c4248;
    }

    @Override // io.ktor.http.cio.AbstractC3967
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8367() throws Throwable {
        this.f12195.mo10554(new C1067(this, 13));
        AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new MultipartEvent$MultipartPart$release$2(this, null));
    }
}
