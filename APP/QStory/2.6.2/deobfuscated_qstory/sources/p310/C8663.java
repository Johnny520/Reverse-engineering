package p310;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8663 extends AbstractC9124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C8662 f24402;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9124 f24403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Context f24404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ TextPaint f24405;

    public C8663(C8662 c8662, Context context, TextPaint textPaint, AbstractC9124 abstractC9124) {
        this.f24402 = c8662;
        this.f24404 = context;
        this.f24405 = textPaint;
        this.f24403 = abstractC9124;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7192(Typeface typeface, boolean z) {
        this.f24402.m14334(this.f24404, this.f24405, typeface);
        this.f24403.mo7192(typeface, z);
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo7193(int i) {
        this.f24403.mo7193(i);
    }
}
