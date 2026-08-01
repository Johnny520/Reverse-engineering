package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2519 f7599;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7600;

    public /* synthetic */ C2521(AbstractC2519 abstractC2519, int i) {
        this.f7600 = i;
        this.f7599 = abstractC2519;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m5020() {
        int i = this.f7600;
        AbstractC2519 abstractC2519 = this.f7599;
        switch (i) {
            case 0:
                return abstractC2519.getPaddingLeft();
            default:
                return abstractC2519.getPaddingTop();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m5021() {
        int i;
        int paddingRight;
        int i2 = this.f7600;
        AbstractC2519 abstractC2519 = this.f7599;
        switch (i2) {
            case 0:
                i = abstractC2519.f7581;
                paddingRight = abstractC2519.getPaddingRight();
                break;
            default:
                i = abstractC2519.f7580;
                paddingRight = abstractC2519.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5022(View view) {
        int iM4988;
        int i;
        switch (this.f7600) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                iM4988 = AbstractC2519.m4988(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).leftMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                iM4988 = AbstractC2519.m4981(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).topMargin;
                break;
        }
        return iM4988 - i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m5023(View view) {
        int iM4985;
        int i;
        switch (this.f7600) {
            case 0:
                C2518 c2518 = (C2518) view.getLayoutParams();
                iM4985 = AbstractC2519.m4985(view);
                i = ((ViewGroup.MarginLayoutParams) c2518).rightMargin;
                break;
            default:
                C2518 c25182 = (C2518) view.getLayoutParams();
                iM4985 = AbstractC2519.m4986(view);
                i = ((ViewGroup.MarginLayoutParams) c25182).bottomMargin;
                break;
        }
        return iM4985 + i;
    }
}
