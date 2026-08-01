package androidx.recyclerview.widget;

import android.view.View;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f7374;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2457 f7378;

    public C2471() {
        m4875();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f7377);
        sb.append(", mCoordinate=");
        sb.append(this.f7376);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f7375);
        sb.append(", mValid=");
        return AbstractC0053.m152(sb, this.f7374, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4875() {
        this.f7377 = -1;
        this.f7376 = Integer.MIN_VALUE;
        this.f7375 = false;
        this.f7374 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4876(View view, int i) {
        int iM4850 = this.f7378.m4850();
        if (iM4850 >= 0) {
            boolean z = this.f7375;
            AbstractC2457 abstractC2457 = this.f7378;
            if (z) {
                this.f7376 = this.f7378.m4850() + abstractC2457.mo4839(view);
            } else {
                this.f7376 = abstractC2457.mo4836(view);
            }
            this.f7377 = i;
            return;
        }
        this.f7377 = i;
        boolean z2 = this.f7375;
        AbstractC2457 abstractC24572 = this.f7378;
        if (!z2) {
            int iMo4836 = abstractC24572.mo4836(view);
            int iMo4845 = iMo4836 - this.f7378.mo4845();
            this.f7376 = iMo4836;
            if (iMo4845 > 0) {
                int iMo4844 = (this.f7378.mo4844() - Math.min(0, (this.f7378.mo4844() - iM4850) - this.f7378.mo4839(view))) - (this.f7378.mo4838(view) + iMo4836);
                if (iMo4844 < 0) {
                    this.f7376 -= Math.min(iMo4845, -iMo4844);
                    return;
                }
                return;
            }
            return;
        }
        int iMo48442 = (abstractC24572.mo4844() - iM4850) - this.f7378.mo4839(view);
        this.f7376 = this.f7378.mo4844() - iMo48442;
        if (iMo48442 > 0) {
            int iMo4838 = this.f7376 - this.f7378.mo4838(view);
            int iMo48452 = this.f7378.mo4845();
            int iMin = iMo4838 - (Math.min(this.f7378.mo4836(view) - iMo48452, 0) + iMo48452);
            if (iMin < 0) {
                this.f7376 = Math.min(iMo48442, -iMin) + this.f7376;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4877() {
        boolean z = this.f7375;
        AbstractC2457 abstractC2457 = this.f7378;
        this.f7376 = z ? abstractC2457.mo4844() : abstractC2457.mo4845();
    }
}
