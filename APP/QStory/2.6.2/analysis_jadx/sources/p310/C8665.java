package p310;

import android.graphics.Typeface;
import androidx.core.view.C2242;
import com.google.android.material.internal.C3149;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8665 extends AbstractC9124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f24408;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Typeface f24409;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2242 f24410;

    public C8665(C2242 c2242, Typeface typeface) {
        this.f24409 = typeface;
        this.f24410 = c2242;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7192(Typeface typeface, boolean z) {
        if (this.f24408) {
            return;
        }
        C3149 c3149 = (C3149) this.f24410.f6536;
        if (c3149.m7182(typeface)) {
            c3149.m7184(false);
        }
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7193(int i) {
        if (this.f24408) {
            return;
        }
        C3149 c3149 = (C3149) this.f24410.f6536;
        if (c3149.m7182(this.f24409)) {
            c3149.m7184(false);
        }
    }
}
