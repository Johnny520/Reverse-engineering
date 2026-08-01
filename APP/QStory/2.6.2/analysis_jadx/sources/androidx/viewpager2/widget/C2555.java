package androidx.viewpager2.widget;

import android.view.View;
import androidx.compose.animation.core.C0325;
import p155.InterfaceC7614;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2555 implements InterfaceC7614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0325 f7696;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7697;

    public /* synthetic */ C2555(C0325 c0325, int i) {
        this.f7697 = i;
        this.f7696 = c0325;
    }

    @Override // p155.InterfaceC7614
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo340(View view) {
        int i = this.f7697;
        C0325 c0325 = this.f7696;
        switch (i) {
            case 0:
                int currentItem = ((C2549) view).getCurrentItem() + 1;
                C2549 c2549 = (C2549) c0325.f1093;
                if (c2549.f7679) {
                    c2549.m5044(currentItem);
                }
                break;
            default:
                int currentItem2 = ((C2549) view).getCurrentItem() - 1;
                C2549 c25492 = (C2549) c0325.f1093;
                if (c25492.f7679) {
                    c25492.m5044(currentItem2);
                }
                break;
        }
        return true;
    }
}
