package p166;

import android.text.InputFilter;
import android.widget.TextView;
import p053.AbstractC6560;
import p167.C7712;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7685 extends AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7678 f20871;

    public C7685(TextView textView) {
        this.f20871 = new C7678(textView);
    }

    @Override // p053.AbstractC6560
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo12043(boolean z) {
        if (C7712.m12979()) {
            this.f20871.mo12043(z);
        }
    }

    @Override // p053.AbstractC6560
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final void mo12044(boolean z) {
        boolean zM12979 = C7712.m12979();
        C7678 c7678 = this.f20871;
        if (zM12979) {
            c7678.mo12044(z);
        } else {
            c7678.f20857 = z;
        }
    }

    @Override // p053.AbstractC6560
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final InputFilter[] mo12045(InputFilter[] inputFilterArr) {
        return !C7712.m12979() ? inputFilterArr : this.f20871.mo12045(inputFilterArr);
    }
}
