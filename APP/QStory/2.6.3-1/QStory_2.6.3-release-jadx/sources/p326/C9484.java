package p326;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9484 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ TextPaint f24738;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Context f24739;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9004 f24740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C9483 f24741;

    public C9484(C9483 c9483, Context context, TextPaint textPaint, AbstractC9004 abstractC9004) {
        this.f24741 = c9483;
        this.f24739 = context;
        this.f24738 = textPaint;
        this.f24740 = abstractC9004;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7738(Typeface typeface, boolean z) {
        this.f24741.m14911(this.f24739, this.f24738, typeface);
        this.f24740.mo7738(typeface, z);
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7739(int i) {
        this.f24740.mo7739(i);
    }
}
