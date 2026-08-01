package p341;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p217.AbstractC7968;
import p315.C8671;
import p385.C9090;
import top.suzhelan.sticker.sdk.presenter.C5979;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8816 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC6557 f24800;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f24801 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC6557 f24802;

    public C8816(C9090 c9090, C9090 c90902) {
        this.f24802 = c9090;
        this.f24800 = c90902;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        switch (this.f24801) {
            case 0:
                View viewInflate = AbstractC6560.m12028(context).inflate(R.layout.item_online_sticker, viewGroup, false);
                viewInflate.getClass();
                return new C8671(viewInflate);
            default:
                View viewInflate2 = AbstractC6560.m12028(context).inflate(R.layout.item_message, viewGroup, false);
                viewInflate2.getClass();
                return new C8671(viewInflate2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x013f  */
    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo13429(androidx.recyclerview.widget.AbstractC2484 r20, int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p341.C8816.mo13429(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰, int, java.lang.Object):void");
    }

    public C8816(C5979 c5979) {
        c5979.getClass();
    }
}
