package p326;

import android.graphics.Typeface;
import p177.AbstractC8471;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9485 extends AbstractC8471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9004 f24742;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C9483 f24743;

    public C9485(C9483 c9483, AbstractC9004 abstractC9004) {
        this.f24743 = c9483;
        this.f24742 = abstractC9004;
    }

    @Override // p177.AbstractC8471
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1295(int i) {
        this.f24743.f24728 = true;
        this.f24742.mo7739(i);
    }

    @Override // p177.AbstractC8471
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo1296(Typeface typeface) {
        C9483 c9483 = this.f24743;
        Typeface typefaceCreate = Typeface.create(typeface, c9483.f24724);
        c9483.f24731 = typefaceCreate;
        c9483.f24728 = true;
        this.f24742.mo7738(typefaceCreate, false);
    }
}
