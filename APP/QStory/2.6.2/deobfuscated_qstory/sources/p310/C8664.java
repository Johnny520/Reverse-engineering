package p310;

import android.graphics.Typeface;
import p161.AbstractC7641;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8664 extends AbstractC7641 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9124 f24406;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C8662 f24407;

    public C8664(C8662 c8662, AbstractC9124 abstractC9124) {
        this.f24407 = c8662;
        this.f24406 = abstractC9124;
    }

    @Override // p161.AbstractC7641
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo734(int i) {
        this.f24407.f24392 = true;
        this.f24406.mo7193(i);
    }

    @Override // p161.AbstractC7641
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo735(Typeface typeface) {
        C8662 c8662 = this.f24407;
        Typeface typefaceCreate = Typeface.create(typeface, c8662.f24388);
        c8662.f24395 = typefaceCreate;
        c8662.f24392 = true;
        this.f24406.mo7192(typefaceCreate, false);
    }
}
