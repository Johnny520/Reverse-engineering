package androidx.recyclerview.widget;

import android.view.View;
import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f7719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7720;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7722;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3290 f7723;

    public C3304() {
        m5435();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f7722);
        sb.append(", mCoordinate=");
        sb.append(this.f7721);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f7720);
        sb.append(", mValid=");
        return AbstractC0900.m712(sb, this.f7719, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5435() {
        this.f7722 = -1;
        this.f7721 = Integer.MIN_VALUE;
        this.f7720 = false;
        this.f7719 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5436(View view, int i) {
        int iM5410 = this.f7723.m5410();
        if (iM5410 >= 0) {
            boolean z = this.f7720;
            AbstractC3290 abstractC3290 = this.f7723;
            if (z) {
                this.f7721 = this.f7723.m5410() + abstractC3290.mo5399(view);
            } else {
                this.f7721 = abstractC3290.mo5396(view);
            }
            this.f7722 = i;
            return;
        }
        this.f7722 = i;
        boolean z2 = this.f7720;
        AbstractC3290 abstractC32902 = this.f7723;
        if (!z2) {
            int iMo5396 = abstractC32902.mo5396(view);
            int iMo5405 = iMo5396 - this.f7723.mo5405();
            this.f7721 = iMo5396;
            if (iMo5405 > 0) {
                int iMo5404 = (this.f7723.mo5404() - Math.min(0, (this.f7723.mo5404() - iM5410) - this.f7723.mo5399(view))) - (this.f7723.mo5398(view) + iMo5396);
                if (iMo5404 < 0) {
                    this.f7721 -= Math.min(iMo5405, -iMo5404);
                    return;
                }
                return;
            }
            return;
        }
        int iMo54042 = (abstractC32902.mo5404() - iM5410) - this.f7723.mo5399(view);
        this.f7721 = this.f7723.mo5404() - iMo54042;
        if (iMo54042 > 0) {
            int iMo5398 = this.f7721 - this.f7723.mo5398(view);
            int iMo54052 = this.f7723.mo5405();
            int iMin = iMo5398 - (Math.min(this.f7723.mo5396(view) - iMo54052, 0) + iMo54052);
            if (iMin < 0) {
                this.f7721 = Math.min(iMo54042, -iMin) + this.f7721;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5437() {
        boolean z = this.f7720;
        AbstractC3290 abstractC3290 = this.f7723;
        this.f7721 = z ? abstractC3290.mo5404() : abstractC3290.mo5405();
    }
}
