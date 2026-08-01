package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3352 f7944;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7945;

    public /* synthetic */ C3354(AbstractC3352 abstractC3352, int i) {
        this.f7945 = i;
        this.f7944 = abstractC3352;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m5580() {
        int i = this.f7945;
        AbstractC3352 abstractC3352 = this.f7944;
        switch (i) {
            case 0:
                return abstractC3352.getPaddingLeft();
            default:
                return abstractC3352.getPaddingTop();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m5581() {
        int i;
        int paddingRight;
        int i2 = this.f7945;
        AbstractC3352 abstractC3352 = this.f7944;
        switch (i2) {
            case 0:
                i = abstractC3352.f7926;
                paddingRight = abstractC3352.getPaddingRight();
                break;
            default:
                i = abstractC3352.f7925;
                paddingRight = abstractC3352.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5582(View view) {
        int iM5548;
        int i;
        switch (this.f7945) {
            case 0:
                C3351 c3351 = (C3351) view.getLayoutParams();
                iM5548 = AbstractC3352.m5548(view);
                i = ((ViewGroup.MarginLayoutParams) c3351).leftMargin;
                break;
            default:
                C3351 c33512 = (C3351) view.getLayoutParams();
                iM5548 = AbstractC3352.m5541(view);
                i = ((ViewGroup.MarginLayoutParams) c33512).topMargin;
                break;
        }
        return iM5548 - i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m5583(View view) {
        int iM5545;
        int i;
        switch (this.f7945) {
            case 0:
                C3351 c3351 = (C3351) view.getLayoutParams();
                iM5545 = AbstractC3352.m5545(view);
                i = ((ViewGroup.MarginLayoutParams) c3351).rightMargin;
                break;
            default:
                C3351 c33512 = (C3351) view.getLayoutParams();
                iM5545 = AbstractC3352.m5546(view);
                i = ((ViewGroup.MarginLayoutParams) c33512).bottomMargin;
                break;
        }
        return iM5545 + i;
    }
}
