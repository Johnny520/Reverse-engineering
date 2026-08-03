package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: St */
/* JADX INFO: loaded from: classes.dex */
public class C0809St implements InterfaceC0126Cx, InterfaceC0050B6 {

    /* JADX INFO: renamed from: a */
    public final String f2553a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2677wj f2554b;

    /* JADX INFO: renamed from: c */
    public final int f2555c;

    /* JADX INFO: renamed from: d */
    public int f2556d;

    /* JADX INFO: renamed from: e */
    public final String[] f2557e;

    /* JADX INFO: renamed from: f */
    public final List[] f2558f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f2559g;

    /* JADX INFO: renamed from: h */
    public Object f2560h;

    /* JADX INFO: renamed from: i */
    public final Object f2561i;

    /* JADX INFO: renamed from: j */
    public final Object f2562j;

    /* JADX INFO: renamed from: k */
    public final Object f2563k;

    public C0809St(String r2, InterfaceC2677wj r3, int r4) {
        this.f2553a = r2;
        this.f2554b = r3;
        this.f2555c = r4;
        this.f2556d = -1;
        String[] r22 = new String[r4];
        int r32 = 0;
    L3:
        if (r32 >= r4) goto L5;
        r22[r32] = "[UNINITIALIZED]";
        r32 = r32 + 1;
        goto L3
    L5:
        this.f2557e = r22;
        int r23 = this.f2555c;
        this.f2558f = new List[r23];
        this.f2559g = new boolean[r23];
        this.f2560h = C0495Lf.f1620a;
        final int r33 = 0;
        this.f2561i = AbstractC0148Dc.m280n(2, new C0766Rt(this, r33));
        final int r42 = 1;
        this.f2562j = AbstractC0148Dc.m280n(2, new C0766Rt(this, r42));
        final int r43 = 2;
        this.f2563k = AbstractC0148Dc.m280n(2, new C0766Rt(this, r43));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String r2) {
        Integer r22 = (Integer) this.f2560h.get(r2);
        if (r22 != null) goto L5;
        return -3;
    L5:
        return r22.intValue();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return this.f2553a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return C0128Cz.f298g;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return this.f2555c;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int r2) {
        return this.f2557e[r2];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [Dn, java.lang.Object] */
    public boolean equals(Object r6) {
        if (this != r6) goto L5;
        return true;
    L5:
        if ((r6 instanceof C0809St) == false) goto L23;
        InterfaceC0126Cx r0 = (InterfaceC0126Cx) r6;
        if (this.f2553a.equals(r0.mo203b()) == false) goto L23;
        if (Arrays.equals((InterfaceC0126Cx[]) this.f2562j.getValue(), (InterfaceC0126Cx[]) ((C0809St) r6).f2562j.getValue()) == false) goto L23;
        int r62 = r0.mo205d();
        int r2 = this.f2555c;
        if (r2 != r62) goto L23;
        int r63 = 0;
    L17:
        if (r63 >= r2) goto L30;
        if (AbstractC0585Nj.m1134a(mo210j(r63).mo203b(), r0.mo210j(r63).mo203b()) == false) goto L23;
        if (AbstractC0585Nj.m1134a(mo210j(r63).mo204c(), r0.mo210j(r63).mo204c()) == false) goto L23;
        r63 = r63 + 1;
        goto L17
    L30:
        return true;
    L23:
        return false;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public boolean mo207f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC0050B6
    /* JADX INFO: renamed from: g */
    public final Set mo89g() {
        return this.f2560h.keySet();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: h */
    public final boolean mo208h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Dn, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f2563k.getValue()).intValue();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int r2) {
        List r22 = this.f2558f[r2];
        if (r22 == null) goto L5;
        return r22;
    L5:
        return C0452Kf.f1484a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int r2) {
        return ((InterfaceC0717Qm[]) this.f2561i.getValue())[r2].getDescriptor();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int r2) {
        return this.f2559g[r2];
    }

    /* JADX INFO: renamed from: l */
    public final void m1614l(String r6) {
        int r0 = this.f2556d + 1;
        this.f2556d = r0;
        String[] r2 = this.f2557e;
        r2[r0] = r6;
        this.f2559g[r0] = true;
        this.f2558f[r0] = null;
        if (r0 != (this.f2555c - 1)) goto L10;
        HashMap r62 = new HashMap();
        int r02 = r2.length;
        int r1 = 0;
    L5:
        if (r1 >= r02) goto L7;
        Integer r3 = Integer.valueOf(r1);
        r62.put(r2[r1], r3);
        r1 = r1 + 1;
        goto L5
    L7:
        this.f2560h = r62;
        return;
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(AbstractC0828TB.m1632J(0, this.f2555c), ", ", this.f2553a.concat("("), ")", new C2479s(4, this), 24);
    }
}
