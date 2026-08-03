package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: fF */
/* JADX INFO: loaded from: classes.dex */
public final class C1405fF {

    /* JADX INFO: renamed from: f */
    public static int f4977f;

    /* JADX INFO: renamed from: a */
    public ArrayList f4978a;

    /* JADX INFO: renamed from: b */
    public int f4979b;

    /* JADX INFO: renamed from: c */
    public int f4980c;

    /* JADX INFO: renamed from: d */
    public ArrayList f4981d;

    /* JADX INFO: renamed from: e */
    public int f4982e;

    /* JADX INFO: renamed from: a */
    public final void m2677a(ArrayList r6) {
        int r0 = this.f4978a.size();
        if (this.f4982e == (-1)) goto L12;
        if (r0 <= 0) goto L12;
        int r1 = 0;
    L7:
        if (r1 >= r6.size()) goto L12;
        C1405fF r2 = (C1405fF) r6.get(r1);
        if (this.f4982e != r2.f4979b) goto L11;
        m2679c(this.f4980c, r2);
    L11:
        r1 = r1 + 1;
    L12:
        if (r0 != 0) goto L18;
        r6.remove(this);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final int m2678b(C2244mo r9, int r10) {
        ArrayList r0 = this.f4978a;
        int r2 = 0;
        if (r0.size() != 0) goto L5;
        return 0;
    L5:
        C2497sb r1 = (C2497sb) ((C2454rb) r0.get(0)).f8599T;
        r9.m4580t();
        r1.mo813b(r9, false);
        int r3 = 0;
    L7:
        if (r3 >= r0.size()) goto L9;
        ((C2454rb) r0.get(r3)).mo813b(r9, false);
        r3 = r3 + 1;
        goto L7
    L9:
        if (r10 != 0) goto L14;
        if (r1.f8783z0 <= 0) goto L14;
        AbstractC1406fG.m2681F(r1, r9, r0, 0);
    L14:
        if (r10 == 1) goto L16;
    L31:
        r9.m4576p();     // Catch: Exception -> L20
    L22:
        this.f4981d = new ArrayList();
    L24:
        if (r2 >= r0.size()) goto L26;
        C2454rb r32 = (C2454rb) r0.get(r2);
        C1517hw r4 = new C1517hw(25);
        new WeakReference(r32);
        C2244mo.m4561n(r32.f8588I);
        C2244mo.m4561n(r32.f8589J);
        C2244mo.m4561n(r32.f8590K);
        C2244mo.m4561n(r32.f8591L);
        C2244mo.m4561n(r32.f8592M);
        this.f4981d.add(r4);
        r2 = r2 + 1;
        goto L24
    L26:
        if (r10 != 0) goto L29;
        int r102 = C2244mo.m4561n(r1.f8588I);
        int r02 = C2244mo.m4561n(r1.f8590K);
        r9.m4580t();
    L30:
        return r02 - r102;
    L29:
        r102 = C2244mo.m4561n(r1.f8589J);
        r02 = C2244mo.m4561n(r1.f8591L);
        r9.m4580t();
    L20:
        e = move-exception;
        System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        goto L22
    L16:
        if (r1.f8762A0 <= 0) goto L31;
        AbstractC1406fG.m2681F(r1, r9, r0, 1);
        goto L31
    }

    /* JADX INFO: renamed from: c */
    public final void m2679c(int r6, C1405fF r7) {
        int r0 = r7.f4979b;
        Iterator r1 = this.f4978a.iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        C2454rb r2 = (C2454rb) r1.next();
        ArrayList r3 = r7.f4978a;
        if (r3.contains(r2) == true) goto L9;
        r3.add(r2);
    L9:
        if (r6 == 0) goto L10;
        r2.f8635o0 = r0;
        goto L4
    L10:
        r2.f8633n0 = r0;
        goto L4
    L12:
        this.f4982e = r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        int r1 = this.f4980c;
        if (r1 != 0) goto L6;
        String r12 = "Horizontal";
    L12:
        r0.append(r12);
        r0.append(" [");
        String r02 = AbstractC0213Ey.m409g(r0, this.f4979b, "] <");
        Iterator r13 = this.f4978a.iterator();
    L14:
        if (r13.hasNext() == false) goto L17;
        r02 = r02 + " " + ((C2454rb) r13.next()).f8621h0;
        goto L14
    L17:
        return AbstractC0213Ey.m407e(r02, " >");
    L6:
        if (r1 != 1) goto L9;
        r12 = "Vertical";
        goto L12
    L9:
        if (r1 != 2) goto L11;
        r12 = "Both";
        goto L12
    L11:
        r12 = "Unknown";
        goto L12
    }
}
