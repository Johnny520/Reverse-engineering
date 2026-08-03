package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Tr */
/* JADX INFO: loaded from: classes.dex */
public final class C0850Tr extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public C2435qz f2697l;

    /* JADX INFO: renamed from: m */
    public C0182E9 f2698m;

    /* JADX INFO: renamed from: n */
    public C0182E9 f2699n;

    /* JADX INFO: renamed from: o */
    public C0294Gt f2700o;

    /* JADX INFO: renamed from: p */
    public ArrayList f2701p;

    /* JADX INFO: renamed from: N */
    public final void m1683N(int r3) {
        if (this.f2700o != null) goto L5;
        this.f2700o = new C0294Gt();
    L5:
        C0294Gt r0 = this.f2700o;
        r0.getClass();
        r0.f995m = new C0243Fl(r3);
    }

    /* JADX INFO: renamed from: O */
    public final void m1684O(List r7) {
        C0294Gt r0 = new C0294Gt();
        r0.f994l = new ArrayList(C0452Kf.f1484a);
        Iterator r72 = r7.iterator();
    L4:
        if (r72.hasNext() == false) goto L13;
        String r1 = (String) r72.next();
        if (r1 == null) goto L8;
        C0251Ft r2 = new C0251Ft();
        C0182E9 r3 = new C0182E9();
        r3.f536l = new C2435qz(r1, 5);
        r2.f818l = r3;
    L9:
        List r12 = r0.f994l;
        if (r12 != null) goto L12;
        r12 = new ArrayList();
    L12:
        r0.f994l = r12;
        r12.add(r2);
        goto L4
    L8:
        r2 = null;
        goto L9
    L13:
        this.f2700o = r0;
    }

    /* JADX INFO: renamed from: P */
    public final void m1685P(String... r7) {
        ArrayList r0 = new ArrayList(r7.length);
        int r1 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.add(new C2435qz(r7[r2], 5));
        r2 = r2 + 1;
        goto L3
    L5:
        this.f2701p = new ArrayList(r0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m1686Q(String... r7) {
        ArrayList r0 = new ArrayList(r7.length);
        int r1 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.add(new C2435qz(r7[r2], 1));
        r2 = r2 + 1;
        goto L3
    L5:
        this.f2701p = new ArrayList(r0);
    }
}
