package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2519 f7598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7599;

    public /* synthetic */ C2521(AbstractC2519 abstractC2519, int i) {
        this.f7599 = i;
        this.f7598 = abstractC2519;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m5010() {
        int i = this.f7599;
        AbstractC2519 abstractC2519 = this.f7598;
        switch (i) {
            case 0:
                return abstractC2519.getPaddingLeft();
            default:
                return abstractC2519.getPaddingTop();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m5011() {
        int i;
        int paddingRight;
        int i2 = this.f7599;
        AbstractC2519 abstractC2519 = this.f7598;
        switch (i2) {
            case 0:
                i = abstractC2519.f7580;
                paddingRight = abstractC2519.getPaddingRight();
                break;
            default:
                i = abstractC2519.f7579;
                paddingRight = abstractC2519.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5012(View view) {
        int iM4978;
        int i;
        switch (this.f7599) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                iM4978 = AbstractC2519.m4978(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).leftMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                iM4978 = AbstractC2519.m4971(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).topMargin;
                break;
        }
        return iM4978 - i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m5013(View view) {
        int iM4975;
        int i;
        switch (this.f7599) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                iM4975 = AbstractC2519.m4975(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).rightMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                iM4975 = AbstractC2519.m4976(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).bottomMargin;
                break;
        }
        return iM4975 + i;
    }
}
