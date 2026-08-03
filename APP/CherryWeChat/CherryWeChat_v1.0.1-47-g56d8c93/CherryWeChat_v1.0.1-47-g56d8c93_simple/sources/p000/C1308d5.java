package p000;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1308d5 extends AbstractC0356IB {

    /* JADX INFO: renamed from: A */
    public ArrayList f4758A;

    /* JADX INFO: renamed from: B */
    public boolean f4759B;

    /* JADX INFO: renamed from: C */
    public int f4760C;

    /* JADX INFO: renamed from: D */
    public boolean f4761D;

    /* JADX INFO: renamed from: E */
    public int f4762E;

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: A */
    public final void mo758A(long r4) {
        this.f1198c = r4;
        if (r4 < 0) goto L9;
        ArrayList r0 = this.f4758A;
        if (r0 == null) goto L11;
        int r02 = r0.size();
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L12;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo758A(r4);
        r1 = r1 + 1;
        goto L7
    L12:
        return;
    L11:
        return;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: B */
    public final void mo759B(AbstractC0671Pj r4) {
        this.f4762E |= 8;
        int r0 = this.f4758A.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo759B(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: C */
    public final void mo760C(TimeInterpolator r4) {
        this.f4762E |= 1;
        ArrayList r0 = this.f4758A;
        if (r0 == null) goto L7;
        int r02 = r0.size();
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L7;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo760C(r4);
        r1 = r1 + 1;
    L7:
        this.f1199d = r4;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: D */
    public final void mo761D(C1517hw r3) {
        super.mo761D(r3);
        this.f4762E |= 4;
        if (this.f4758A == null) goto L8;
        int r0 = 0;
    L6:
        if (r0 >= this.f4758A.size()) goto L10;
        ((AbstractC0356IB) this.f4758A.get(r0)).mo761D(r3);
        r0 = r0 + 1;
        goto L6
    L10:
        return;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: E */
    public final void mo762E() {
        this.f4762E |= 2;
        int r0 = this.f4758A.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo762E();
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: F */
    public final void mo763F(long r1) {
        this.f1197b = r1;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: H */
    public final String mo765H(String r6) {
        String r0 = super.mo765H(r6);
        int r1 = 0;
    L4:
        if (r1 >= this.f4758A.size()) goto L6;
        StringBuilder r2 = new StringBuilder();
        r2.append(r0);
        r2.append("\n");
        r2.append(((AbstractC0356IB) this.f4758A.get(r1)).mo765H(r6 + "  "));
        r0 = r2.toString();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    /* JADX INFO: renamed from: I */
    public final void m2568I(AbstractC0356IB r5) {
        this.f4758A.add(r5);
        r5.f1204i = this;
        long r0 = this.f1198c;
        if (r0 < 0) goto L6;
        r5.mo758A(r0);
    L6:
        if ((this.f4762E & 1) == 0) goto L9;
        r5.mo760C(this.f1199d);
    L9:
        if ((this.f4762E & 2) == 0) goto L12;
        r5.mo762E();
    L12:
        if ((this.f4762E & 4) == 0) goto L15;
        r5.mo761D(this.f1217v);
    L15:
        if ((this.f4762E & 8) == 0) goto L18;
        r5.mo759B(null);
        return;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: c */
    public final void mo767c() {
        super.mo767c();
        int r0 = this.f4758A.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo767c();
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    public final /* bridge */ /* synthetic */ Object clone() {
        return mo774j();
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: d */
    public final void mo768d(C0657PB r5) {
        View r0 = r5.f2100b;
        if (m783t(r0) == false) goto L10;
        Iterator r1 = this.f4758A.iterator();
    L6:
        if (r1.hasNext() == false) goto L16;
        AbstractC0356IB r2 = (AbstractC0356IB) r1.next();
        if (r2.m783t(r0) == false) goto L6;
        r2.mo768d(r5);
        r5.f2101c.add(r2);
        goto L6
    L16:
        return;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: f */
    public final void mo770f(C0657PB r4) {
        int r0 = this.f4758A.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo770f(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: g */
    public final void mo771g(C0657PB r5) {
        View r0 = r5.f2100b;
        if (m783t(r0) == false) goto L10;
        Iterator r1 = this.f4758A.iterator();
    L6:
        if (r1.hasNext() == false) goto L16;
        AbstractC0356IB r2 = (AbstractC0356IB) r1.next();
        if (r2.m783t(r0) == false) goto L6;
        r2.mo771g(r5);
        r5.f2101c.add(r2);
        goto L6
    L16:
        return;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: j */
    public final AbstractC0356IB mo774j() {
        C1308d5 r0 = (C1308d5) super.mo774j();
        r0.f4758A = new ArrayList();
        int r1 = this.f4758A.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        AbstractC0356IB r3 = ((AbstractC0356IB) this.f4758A.get(r2)).mo774j();
        r0.f4758A.add(r3);
        r3.f1204i = r0;
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: l */
    public final void mo776l(ViewGroup r12, C2428qs r13, C2428qs r14, ArrayList r15, ArrayList r16) {
        long r0 = this.f1197b;
        int r2 = this.f4758A.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L16;
        AbstractC0356IB r5 = (AbstractC0356IB) this.f4758A.get(r3);
        if (r0 <= 0) goto L15;
        if (this.f4759B == true) goto L11;
        if (r3 != 0) goto L15;
    L11:
        long r8 = r5.f1197b;
        if (r8 <= 0) goto L14;
        r5.mo763F(r8 + r0);
        goto L15
    L14:
        r5.mo763F(r0);
    L15:
        r5.mo776l(r12, r13, r14, r15, r16);
        r3 = r3 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: w */
    public final void mo785w(View r4) {
        super.mo785w(r4);
        int r0 = this.f4758A.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo785w(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: x */
    public final AbstractC0356IB mo786x(InterfaceC0313HB r1) {
        super.mo786x(r1);
        return this;
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: y */
    public final void mo787y(View r4) {
        super.mo787y(r4);
        int r0 = this.f4758A.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((AbstractC0356IB) this.f4758A.get(r1)).mo787y(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0356IB
    /* JADX INFO: renamed from: z */
    public final void mo788z() {
        if (this.f4758A.isEmpty() == false) goto L6;
        m764G();
        m777m();
        return;
    L6:
        C0571NB r0 = new C0571NB();
        r0.f1864b = this;
        Iterator r1 = this.f4758A.iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        ((AbstractC0356IB) r1.next()).m766a(r0);
        goto L8
    L10:
        this.f4760C = this.f4758A.size();
        if (this.f4759B == true) goto L20;
        int r02 = 1;
    L14:
        if (r02 >= this.f4758A.size()) goto L16;
        ((AbstractC0356IB) this.f4758A.get(r02 - 1)).m766a(new C0571NB((AbstractC0356IB) this.f4758A.get(r02)));
        r02 = r02 + 1;
        goto L14
    L16:
        AbstractC0356IB r03 = (AbstractC0356IB) this.f4758A.get(0);
        if (r03 == null) goto L24;
        r03.mo788z();
        return;
    L24:
        return;
    L20:
        Iterator r04 = this.f4758A.iterator();
    L22:
        if (r04.hasNext() == false) goto L28;
        ((AbstractC0356IB) r04.next()).mo788z();
        goto L22
    }
}
