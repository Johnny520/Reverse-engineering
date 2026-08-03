package p043Y;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p037U.AbstractC0358S;
import p089x0.C1121e;

/* JADX INFO: renamed from: Y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0442a extends AbstractC0454m {

    /* JADX INFO: renamed from: A */
    public ArrayList f969A;

    /* JADX INFO: renamed from: B */
    public boolean f970B;

    /* JADX INFO: renamed from: C */
    public int f971C;

    /* JADX INFO: renamed from: D */
    public boolean f972D;

    /* JADX INFO: renamed from: E */
    public int f973E;

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: A */
    public final void mo1047A(long r4) {
        this.f1011c = r4;
        if (r4 < 0) goto L9;
        ArrayList r02 = this.f969A;
        if (r02 == null) goto L11;
        int r03 = r02.size();
        int r1 = 0;
    L7:
        if (r1 >= r03) goto L12;
        ((AbstractC0454m) this.f969A.get(r1)).mo1047A(r4);
        r1 = r1 + 1;
        goto L7
    L12:
        return;
    L11:
        return;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: B */
    public final void mo1048B(AbstractC0358S r4) {
        this.f973E |= 8;
        int r02 = this.f969A.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0454m) this.f969A.get(r1)).mo1048B(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: C */
    public final void mo1049C(TimeInterpolator r4) {
        this.f973E |= 1;
        ArrayList r02 = this.f969A;
        if (r02 == null) goto L7;
        int r03 = r02.size();
        int r1 = 0;
    L5:
        if (r1 >= r03) goto L7;
        ((AbstractC0454m) this.f969A.get(r1)).mo1049C(r4);
        r1 = r1 + 1;
    L7:
        this.f1012d = r4;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: D */
    public final void mo1050D(C1121e r3) {
        super.mo1050D(r3);
        this.f973E |= 4;
        if (this.f969A == null) goto L8;
        int r02 = 0;
    L6:
        if (r02 >= this.f969A.size()) goto L10;
        ((AbstractC0454m) this.f969A.get(r02)).mo1050D(r3);
        r02 = r02 + 1;
        goto L6
    L10:
        return;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: E */
    public final void mo1051E() {
        this.f973E |= 2;
        int r02 = this.f969A.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0454m) this.f969A.get(r1)).mo1051E();
        r1 = r1 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: F */
    public final void mo1052F(long r1) {
        this.f1010b = r1;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: H */
    public final String mo1053H(String r6) {
        String r02 = super.mo1053H(r6);
        int r1 = 0;
    L4:
        if (r1 >= this.f969A.size()) goto L6;
        StringBuilder r2 = new StringBuilder();
        r2.append(r02);
        r2.append("\n");
        r2.append(((AbstractC0454m) this.f969A.get(r1)).mo1053H(r6 + "  "));
        r02 = r2.toString();
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    /* JADX INFO: renamed from: I */
    public final void m1054I(AbstractC0454m r5) {
        this.f969A.add(r5);
        r5.f1017i = this;
        long r02 = this.f1011c;
        if (r02 < 0) goto L6;
        r5.mo1047A(r02);
    L6:
        if ((this.f973E & 1) == 0) goto L9;
        r5.mo1049C(this.f1012d);
    L9:
        if ((this.f973E & 2) == 0) goto L12;
        r5.mo1051E();
    L12:
        if ((this.f973E & 4) == 0) goto L15;
        r5.mo1050D(this.f1030v);
    L15:
        if ((this.f973E & 8) == 0) goto L18;
        r5.mo1048B(null);
        return;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: c */
    public final void mo1055c() {
        super.mo1055c();
        int r02 = this.f969A.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0454m) this.f969A.get(r1)).mo1055c();
        r1 = r1 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    public final /* bridge */ /* synthetic */ Object clone() {
        return mo1059j();
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: d */
    public final void mo1056d(C0462u r4) {
        if (m1087t(r4.f1042b) == false) goto L10;
        Iterator r02 = this.f969A.iterator();
    L6:
        if (r02.hasNext() == false) goto L16;
        AbstractC0454m r1 = (AbstractC0454m) r02.next();
        if (r1.m1087t(r4.f1042b) == false) goto L6;
        r1.mo1056d(r4);
        r4.f1043c.add(r1);
        goto L6
    L16:
        return;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: f */
    public final void mo1057f(C0462u r4) {
        int r02 = this.f969A.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0454m) this.f969A.get(r1)).mo1057f(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: g */
    public final void mo1058g(C0462u r4) {
        if (m1087t(r4.f1042b) == false) goto L10;
        Iterator r02 = this.f969A.iterator();
    L6:
        if (r02.hasNext() == false) goto L16;
        AbstractC0454m r1 = (AbstractC0454m) r02.next();
        if (r1.m1087t(r4.f1042b) == false) goto L6;
        r1.mo1058g(r4);
        r4.f1043c.add(r1);
        goto L6
    L16:
        return;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: j */
    public final AbstractC0454m mo1059j() {
        C0442a r02 = (C0442a) super.mo1059j();
        r02.f969A = new ArrayList();
        int r1 = this.f969A.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        AbstractC0454m r3 = ((AbstractC0454m) this.f969A.get(r2)).mo1059j();
        r02.f969A.add(r3);
        r3.f1017i = r02;
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: l */
    public final void mo1060l(ViewGroup r13, C0463v r14, C0463v r15, ArrayList r16, ArrayList r17) {
        long r1 = this.f1010b;
        int r3 = this.f969A.size();
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L14;
        AbstractC0454m r6 = (AbstractC0454m) this.f969A.get(r4);
        if (r1 <= 0) goto L13;
        if (this.f970B == true) goto L9;
        if (r4 != 0) goto L13;
    L9:
        long r9 = r6.f1010b;
        if (r9 <= 0) goto L12;
        r6.mo1052F(r9 + r1);
        goto L13
    L12:
        r6.mo1052F(r1);
    L13:
        r6.mo1060l(r13, r14, r15, r16, r17);
        r4 = r4 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: w */
    public final void mo1061w(View r4) {
        super.mo1061w(r4);
        int r02 = this.f969A.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0454m) this.f969A.get(r1)).mo1061w(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: x */
    public final AbstractC0454m mo1062x(InterfaceC0452k r1) {
        super.mo1062x(r1);
        return this;
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: y */
    public final void mo1063y(View r4) {
        super.mo1063y(r4);
        int r02 = this.f969A.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        ((AbstractC0454m) this.f969A.get(r1)).mo1063y(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p043Y.AbstractC0454m
    /* JADX INFO: renamed from: z */
    public final void mo1064z() {
        if (this.f969A.isEmpty() == false) goto L6;
        m1078G();
        m1083m();
        return;
    L6:
        C0459r r02 = new C0459r();
        r02.f1039b = this;
        Iterator r1 = this.f969A.iterator();
    L8:
        if (r1.hasNext() == false) goto L10;
        ((AbstractC0454m) r1.next()).m1079a(r02);
        goto L8
    L10:
        this.f971C = this.f969A.size();
        if (this.f970B == true) goto L19;
        int r03 = 1;
    L14:
        if (r03 >= this.f969A.size()) goto L16;
        ((AbstractC0454m) this.f969A.get(r03 - 1)).m1079a(new C0459r((AbstractC0454m) this.f969A.get(r03)));
        r03 = r03 + 1;
        goto L14
    L16:
        AbstractC0454m r04 = (AbstractC0454m) this.f969A.get(0);
        if (r04 == null) goto L23;
        r04.mo1064z();
        return;
    L23:
        return;
    L19:
        Iterator r05 = this.f969A.iterator();
    L21:
        if (r05.hasNext() == false) goto L28;
        ((AbstractC0454m) r05.next()).mo1064z();
        goto L21
    }
}
