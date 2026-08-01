package androidx.recyclerview.widget;

import android.view.View;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f7373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f7374;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2457 f7377;

    public C2471() {
        m4865();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f7376);
        sb.append(", mCoordinate=");
        sb.append(this.f7375);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f7374);
        sb.append(", mValid=");
        return AbstractC0053.m150(sb, this.f7373, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4865() {
        this.f7376 = -1;
        this.f7375 = Integer.MIN_VALUE;
        this.f7374 = false;
        this.f7373 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4866(View view, int i) {
        int iM4840 = this.f7377.m4840();
        if (iM4840 >= 0) {
            boolean z = this.f7374;
            AbstractC2457 abstractC2457 = this.f7377;
            if (z) {
                this.f7375 = this.f7377.m4840() + abstractC2457.mo4829(view);
            } else {
                this.f7375 = abstractC2457.mo4826(view);
            }
            this.f7376 = i;
            return;
        }
        this.f7376 = i;
        boolean z2 = this.f7374;
        AbstractC2457 abstractC24572 = this.f7377;
        if (!z2) {
            int iMo4826 = abstractC24572.mo4826(view);
            int iMo4835 = iMo4826 - this.f7377.mo4835();
            this.f7375 = iMo4826;
            if (iMo4835 > 0) {
                int iMo4834 = (this.f7377.mo4834() - Math.min(0, (this.f7377.mo4834() - iM4840) - this.f7377.mo4829(view))) - (this.f7377.mo4828(view) + iMo4826);
                if (iMo4834 < 0) {
                    this.f7375 -= Math.min(iMo4835, -iMo4834);
                    return;
                }
                return;
            }
            return;
        }
        int iMo48342 = (abstractC24572.mo4834() - iM4840) - this.f7377.mo4829(view);
        this.f7375 = this.f7377.mo4834() - iMo48342;
        if (iMo48342 > 0) {
            int iMo4828 = this.f7375 - this.f7377.mo4828(view);
            int iMo48352 = this.f7377.mo4835();
            int iMin = iMo4828 - (Math.min(this.f7377.mo4826(view) - iMo48352, 0) + iMo48352);
            if (iMin < 0) {
                this.f7375 = Math.min(iMo48342, -iMin) + this.f7375;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4867() {
        boolean z = this.f7374;
        AbstractC2457 abstractC2457 = this.f7377;
        this.f7375 = z ? abstractC2457.mo4834() : abstractC2457.mo4835();
    }
}
