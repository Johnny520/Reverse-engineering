package p000;

import android.view.View;

/* JADX INFO: renamed from: ho */
/* JADX INFO: loaded from: classes.dex */
public final class C1509ho {

    /* JADX INFO: renamed from: a */
    public AbstractC2730xt f5346a;

    /* JADX INFO: renamed from: b */
    public int f5347b;

    /* JADX INFO: renamed from: c */
    public int f5348c;

    /* JADX INFO: renamed from: d */
    public boolean f5349d;

    /* JADX INFO: renamed from: e */
    public boolean f5350e;

    public C1509ho() {
        m2885d();
    }

    /* JADX INFO: renamed from: a */
    public final void m2882a() {
        this.f5348c = this.f5349d ? this.f5346a.mo5256g() : this.f5346a.mo5260k();
    }

    /* JADX INFO: renamed from: b */
    public final void m2883b(View view, int i) {
        if (this.f5349d) {
            int iMo5251b = this.f5346a.mo5251b(view);
            AbstractC2730xt abstractC2730xt = this.f5346a;
            this.f5348c = (Integer.MIN_VALUE == abstractC2730xt.f9329b ? 0 : abstractC2730xt.mo5261l() - abstractC2730xt.f9329b) + iMo5251b;
        } else {
            this.f5348c = this.f5346a.mo5254e(view);
        }
        this.f5347b = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m2884c(View view, int i) {
        AbstractC2730xt abstractC2730xt = this.f5346a;
        int iMo5261l = Integer.MIN_VALUE == abstractC2730xt.f9329b ? 0 : abstractC2730xt.mo5261l() - abstractC2730xt.f9329b;
        if (iMo5261l >= 0) {
            m2883b(view, i);
            return;
        }
        this.f5347b = i;
        if (!this.f5349d) {
            int iMo5254e = this.f5346a.mo5254e(view);
            int iMo5260k = iMo5254e - this.f5346a.mo5260k();
            this.f5348c = iMo5254e;
            if (iMo5260k > 0) {
                int iMo5256g = (this.f5346a.mo5256g() - Math.min(0, (this.f5346a.mo5256g() - iMo5261l) - this.f5346a.mo5251b(view))) - (this.f5346a.mo5252c(view) + iMo5254e);
                if (iMo5256g < 0) {
                    this.f5348c -= Math.min(iMo5260k, -iMo5256g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo5256g2 = (this.f5346a.mo5256g() - iMo5261l) - this.f5346a.mo5251b(view);
        this.f5348c = this.f5346a.mo5256g() - iMo5256g2;
        if (iMo5256g2 > 0) {
            int iMo5252c = this.f5348c - this.f5346a.mo5252c(view);
            int iMo5260k2 = this.f5346a.mo5260k();
            int iMin = iMo5252c - (Math.min(this.f5346a.mo5254e(view) - iMo5260k2, 0) + iMo5260k2);
            if (iMin < 0) {
                this.f5348c = Math.min(iMo5256g2, -iMin) + this.f5348c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2885d() {
        this.f5347b = -1;
        this.f5348c = Integer.MIN_VALUE;
        this.f5349d = false;
        this.f5350e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5347b + ", mCoordinate=" + this.f5348c + ", mLayoutFromEnd=" + this.f5349d + ", mValid=" + this.f5350e + '}';
    }
}
