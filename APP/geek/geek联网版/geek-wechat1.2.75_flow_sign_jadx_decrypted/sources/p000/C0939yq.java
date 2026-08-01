package p000;

import android.view.View;

/* JADX INFO: renamed from: yq */
/* JADX INFO: loaded from: classes.dex */
public final class C0939yq {

    /* JADX INFO: renamed from: a */
    public AbstractC0105ci f5481a;

    /* JADX INFO: renamed from: b */
    public int f5482b;

    /* JADX INFO: renamed from: c */
    public int f5483c;

    /* JADX INFO: renamed from: d */
    public boolean f5484d;

    /* JADX INFO: renamed from: e */
    public boolean f5485e;

    public C0939yq() {
        m2778d();
    }

    /* JADX INFO: renamed from: a */
    public final void m2775a() {
        this.f5483c = this.f5484d ? this.f5481a.mo641g() : this.f5481a.mo645k();
    }

    /* JADX INFO: renamed from: b */
    public final void m2776b(View view, int i) {
        if (this.f5484d) {
            int iMo636b = this.f5481a.mo636b(view);
            AbstractC0105ci abstractC0105ci = this.f5481a;
            this.f5483c = (Integer.MIN_VALUE == abstractC0105ci.f896a ? 0 : abstractC0105ci.mo646l() - abstractC0105ci.f896a) + iMo636b;
        } else {
            this.f5483c = this.f5481a.mo639e(view);
        }
        this.f5482b = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m2777c(View view, int i) {
        AbstractC0105ci abstractC0105ci = this.f5481a;
        int iMo646l = Integer.MIN_VALUE == abstractC0105ci.f896a ? 0 : abstractC0105ci.mo646l() - abstractC0105ci.f896a;
        if (iMo646l >= 0) {
            m2776b(view, i);
            return;
        }
        this.f5482b = i;
        if (!this.f5484d) {
            int iMo639e = this.f5481a.mo639e(view);
            int iMo645k = iMo639e - this.f5481a.mo645k();
            this.f5483c = iMo639e;
            if (iMo645k > 0) {
                int iMo641g = (this.f5481a.mo641g() - Math.min(0, (this.f5481a.mo641g() - iMo646l) - this.f5481a.mo636b(view))) - (this.f5481a.mo637c(view) + iMo639e);
                if (iMo641g < 0) {
                    this.f5483c -= Math.min(iMo645k, -iMo641g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo641g2 = (this.f5481a.mo641g() - iMo646l) - this.f5481a.mo636b(view);
        this.f5483c = this.f5481a.mo641g() - iMo641g2;
        if (iMo641g2 > 0) {
            int iMo637c = this.f5483c - this.f5481a.mo637c(view);
            int iMo645k2 = this.f5481a.mo645k();
            int iMin = iMo637c - (Math.min(this.f5481a.mo639e(view) - iMo645k2, 0) + iMo645k2);
            if (iMin < 0) {
                this.f5483c = Math.min(iMo641g2, -iMin) + this.f5483c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2778d() {
        this.f5482b = -1;
        this.f5483c = Integer.MIN_VALUE;
        this.f5484d = false;
        this.f5485e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5482b + ", mCoordinate=" + this.f5483c + ", mLayoutFromEnd=" + this.f5484d + ", mValid=" + this.f5485e + '}';
    }
}
