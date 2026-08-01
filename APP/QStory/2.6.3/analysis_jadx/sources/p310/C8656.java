package p310;

import android.graphics.Typeface;
import p161.AbstractC7642;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8656 extends AbstractC7642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8175 f24397;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C8654 f24398;

    public C8656(C8654 c8654, AbstractC8175 abstractC8175) {
        this.f24398 = c8654;
        this.f24397 = abstractC8175;
    }

    @Override // p161.AbstractC7642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo735(int i) {
        this.f24398.f24383 = true;
        this.f24397.mo7180(i);
    }

    @Override // p161.AbstractC7642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo736(Typeface typeface) {
        C8654 c8654 = this.f24398;
        Typeface typefaceCreate = Typeface.create(typeface, c8654.f24379);
        c8654.f24386 = typefaceCreate;
        c8654.f24383 = true;
        this.f24397.mo7179(typefaceCreate, false);
    }
}
