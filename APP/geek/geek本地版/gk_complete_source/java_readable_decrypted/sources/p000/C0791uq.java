package p000;

import android.view.View;

/* JADX INFO: renamed from: uq */
/* JADX INFO: loaded from: classes.dex */
public final class C0791uq {

    /* JADX INFO: renamed from: a */
    public AbstractC0019ai f4750a;

    /* JADX INFO: renamed from: b */
    public int f4751b;

    /* JADX INFO: renamed from: c */
    public int f4752c;

    /* JADX INFO: renamed from: d */
    public boolean f4753d;

    /* JADX INFO: renamed from: e */
    public boolean f4754e;

    public C0791uq() {
        m2467d();
    }

    /* JADX INFO: renamed from: a */
    public final void m2464a() {
        this.f4752c = this.f4753d ? this.f4750a.mo103g() : this.f4750a.mo107k();
    }

    /* JADX INFO: renamed from: b */
    public final void m2465b(View view, int i) {
        if (this.f4753d) {
            int iMo98b = this.f4750a.mo98b(view);
            AbstractC0019ai abstractC0019ai = this.f4750a;
            this.f4752c = (Integer.MIN_VALUE == abstractC0019ai.f143a ? 0 : abstractC0019ai.mo108l() - abstractC0019ai.f143a) + iMo98b;
        } else {
            this.f4752c = this.f4750a.mo101e(view);
        }
        this.f4751b = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m2466c(View view, int i) {
        AbstractC0019ai abstractC0019ai = this.f4750a;
        int iMo108l = Integer.MIN_VALUE == abstractC0019ai.f143a ? 0 : abstractC0019ai.mo108l() - abstractC0019ai.f143a;
        if (iMo108l >= 0) {
            m2465b(view, i);
            return;
        }
        this.f4751b = i;
        if (!this.f4753d) {
            int iMo101e = this.f4750a.mo101e(view);
            int iMo107k = iMo101e - this.f4750a.mo107k();
            this.f4752c = iMo101e;
            if (iMo107k > 0) {
                int iMo103g = (this.f4750a.mo103g() - Math.min(0, (this.f4750a.mo103g() - iMo108l) - this.f4750a.mo98b(view))) - (this.f4750a.mo99c(view) + iMo101e);
                if (iMo103g < 0) {
                    this.f4752c -= Math.min(iMo107k, -iMo103g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo103g2 = (this.f4750a.mo103g() - iMo108l) - this.f4750a.mo98b(view);
        this.f4752c = this.f4750a.mo103g() - iMo103g2;
        if (iMo103g2 > 0) {
            int iMo99c = this.f4752c - this.f4750a.mo99c(view);
            int iMo107k2 = this.f4750a.mo107k();
            int iMin = iMo99c - (Math.min(this.f4750a.mo101e(view) - iMo107k2, 0) + iMo107k2);
            if (iMin < 0) {
                this.f4752c = Math.min(iMo103g2, -iMin) + this.f4752c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2467d() {
        this.f4751b = -1;
        this.f4752c = Integer.MIN_VALUE;
        this.f4753d = false;
        this.f4754e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f4751b + ", mCoordinate=" + this.f4752c + ", mLayoutFromEnd=" + this.f4753d + ", mValid=" + this.f4754e + '}';
    }
}
