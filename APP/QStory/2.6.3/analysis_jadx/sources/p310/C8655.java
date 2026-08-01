package p310;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8655 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ TextPaint f24393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Context f24394;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8175 f24395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ C8654 f24396;

    public C8655(C8654 c8654, Context context, TextPaint textPaint, AbstractC8175 abstractC8175) {
        this.f24396 = c8654;
        this.f24394 = context;
        this.f24393 = textPaint;
        this.f24395 = abstractC8175;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo7179(Typeface typeface, boolean z) {
        this.f24396.m14352(this.f24394, this.f24393, typeface);
        this.f24395.mo7179(typeface, z);
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo7180(int i) {
        this.f24395.mo7180(i);
    }
}
