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
        if (this.f5349d == false) goto L5;
        int r0 = this.f5346a.mo5256g();
    L6:
        this.f5348c = r0;
        return;
    L5:
        r0 = this.f5346a.mo5260k();
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m2883b(View r4, int r5) {
        if (this.f5349d == false) goto L9;
        int r42 = this.f5346a.mo5251b(r4);
        AbstractC2730xt r0 = this.f5346a;
        if (Integer.MIN_VALUE != r0.f9329b) goto L7;
        int r02 = 0;
    L8:
        this.f5348c = r02 + r42;
    L10:
        this.f5347b = r5;
        return;
    L7:
        r02 = r0.mo5261l() - r0.f9329b;
        goto L8
    L9:
        this.f5348c = this.f5346a.mo5254e(r4);
        goto L10
    }

    /* JADX INFO: renamed from: c */
    public final void m2884c(View r5, int r6) {
        AbstractC2730xt r0 = this.f5346a;
        if (Integer.MIN_VALUE != r0.f9329b) goto L5;
        int r1 = 0;
    L6:
        if (r1 < 0) goto L9;
        m2883b(r5, r6);
        return;
    L9:
        this.f5347b = r6;
        if (this.f5349d == false) goto L17;
        int r62 = (this.f5346a.mo5256g() - r1) - this.f5346a.mo5251b(r5);
        this.f5348c = this.f5346a.mo5256g() - r62;
        if (r62 <= 0) goto L23;
        int r12 = this.f5348c - this.f5346a.mo5252c(r5);
        int r02 = this.f5346a.mo5260k();
        int r13 = r12 - (Math.min(this.f5346a.mo5254e(r5) - r02, 0) + r02);
        if (r13 >= 0) goto L24;
        this.f5348c = Math.min(r62, -r13) + this.f5348c;
        return;
    L24:
        return;
    L23:
        return;
    L17:
        int r63 = this.f5346a.mo5254e(r5);
        int r03 = r63 - this.f5346a.mo5260k();
        this.f5348c = r63;
        if (r03 <= 0) goto L25;
        int r52 = (this.f5346a.mo5256g() - Math.min(0, (this.f5346a.mo5256g() - r1) - this.f5346a.mo5251b(r5))) - (this.f5346a.mo5252c(r5) + r63);
        if (r52 >= 0) goto L26;
        this.f5348c -= Math.min(r03, -r52);
        return;
    L26:
        return;
    L25:
        return;
    L5:
        r1 = r0.mo5261l() - r0.f9329b;
        goto L6
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
