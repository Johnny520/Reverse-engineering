package fun.box001.internal.dexformat.writer;

import java.util.BitSet;

/* JADX INFO: renamed from: j.n */
/* JADX INFO: loaded from: classes.dex */
final class C0163n {

    /* JADX INFO: renamed from: a */
    private final BitSet f507a;

    /* JADX INFO: renamed from: b */
    private final C0164o f508b;

    /* JADX INFO: renamed from: c */
    private int f509c;

    /* JADX INFO: renamed from: d */
    private final C0164o f510d;

    /* JADX INFO: renamed from: e */
    private boolean f511e;

    C0163n(C0164o r1, BitSet r2, boolean r3) {
        this.f508b = r1;
        this.f507a = r2;
        this.f509c = 0;
        this.f510d = new C0164o(r1.m504B());
        this.f511e = r3;
    }

    /* JADX INFO: renamed from: a */
    static void m392a(C0163n r4, int r5) {
        C0162m r0 = (C0162m) C0164o.m394F(r4.f508b, r5);
        BitSet r2 = r4.f507a;
        if (r2 != null) goto L6;
    L7:
        boolean r22 = true;
    L9:
        if (r22 == false) goto L13;
        r0 = r0.m390r(r4.f509c);
        if (r4.f511e == true) goto L13;
        r4.f509c = r0.m382g() + r4.f509c;
    L13:
        r4.f511e = false;
        C0164o.m395G(r4.f510d, r5, r0);
        return;
    L6:
        if (r2.get(r5) == false) goto L7;
        r22 = false;
        goto L9
    }

    /* JADX INFO: renamed from: b */
    static C0164o m393b(C0163n r1) {
        boolean r0 = r1.f508b.m534e();
        C0164o r12 = r1.f510d;
        if (r0 == false) goto L5;
        r12.m536g();
    L5:
        return r12;
    }
}
