package p069m;

import java.util.Arrays;
import p034S.AbstractC0324d;
import p043Y.C0463v;

/* JADX INFO: renamed from: m.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0990j implements InterfaceC0982b {

    /* JADX INFO: renamed from: a */
    public int f3518a;

    /* JADX INFO: renamed from: b */
    public final int[] f3519b;

    /* JADX INFO: renamed from: c */
    public int[] f3520c;

    /* JADX INFO: renamed from: d */
    public int[] f3521d;

    /* JADX INFO: renamed from: e */
    public float[] f3522e;

    /* JADX INFO: renamed from: f */
    public int[] f3523f;

    /* JADX INFO: renamed from: g */
    public int[] f3524g;

    /* JADX INFO: renamed from: h */
    public int f3525h;

    /* JADX INFO: renamed from: i */
    public int f3526i;

    /* JADX INFO: renamed from: j */
    public final C0983c f3527j;

    /* JADX INFO: renamed from: k */
    public final C0463v f3528k;

    public C0990j(C0983c r3, C0463v r4) {
        this.f3518a = 16;
        this.f3519b = new int[16];
        this.f3520c = new int[16];
        this.f3521d = new int[16];
        this.f3522e = new float[16];
        this.f3523f = new int[16];
        this.f3524g = new int[16];
        this.f3525h = 0;
        this.f3526i = -1;
        this.f3527j = r3;
        this.f3528k = r4;
        clear();
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: a */
    public final float mo2333a(int r5) {
        int r02 = this.f3525h;
        int r1 = this.f3526i;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L11;
        if (r2 == r5) goto L6;
        r1 = this.f3524g[r1];
        if (r1 == (-1)) goto L16;
        r2 = r2 + 1;
        goto L3
    L16:
        return 0.0f;
    L6:
        return this.f3522e[r1];
    L11:
        return 0.0f;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: b */
    public final boolean mo2334b(C0989i r2) {
        if (m2379n(r2) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: c */
    public final void mo2335c(C0989i r9, float r10) {
        if (r10 > (-0.001f)) goto L5;
    L8:
        int r2 = 0;
        if (this.f3525h != 0) goto L11;
        m2378m(0, r9, r10);
        m2377l(r9, 0);
        this.f3526i = 0;
        return;
    L11:
        int r02 = m2379n(r9);
        if (r02 == (-1)) goto L14;
        this.f3522e[r02] = r10;
        return;
    L14:
        int r03 = this.f3525h + 1;
        int r1 = this.f3518a;
        if (r03 < r1) goto L20;
        int r12 = r1 * 2;
        this.f3521d = Arrays.copyOf(this.f3521d, r12);
        this.f3522e = Arrays.copyOf(this.f3522e, r12);
        this.f3523f = Arrays.copyOf(this.f3523f, r12);
        this.f3524g = Arrays.copyOf(this.f3524g, r12);
        this.f3520c = Arrays.copyOf(this.f3520c, r12);
        int r04 = this.f3518a;
    L17:
        if (r04 >= r12) goto L19;
        this.f3521d[r04] = -1;
        this.f3520c[r04] = -1;
        r04 = r04 + 1;
        goto L17
    L19:
        this.f3518a = r12;
    L20:
        int r05 = this.f3525h;
        int r13 = this.f3526i;
        int r4 = 0;
        int r5 = -1;
    L21:
        if (r4 >= r05) goto L33;
        int r6 = this.f3521d[r13];
        int r7 = r9.f3507b;
        if (r6 == r7) goto L24;
        if (r6 >= r7) goto L28;
        r5 = r13;
    L28:
        r13 = this.f3524g[r13];
        if (r13 == (-1)) goto L33;
        r4 = r4 + 1;
        goto L21
    L24:
        this.f3522e[r13] = r10;
        return;
    L33:
        if (r2 >= this.f3518a) goto L38;
        if (this.f3521d[r2] == (-1)) goto L39;
        r2 = r2 + 1;
    L39:
        m2378m(r2, r9, r10);
        if (r5 == (-1)) goto L42;
        this.f3523f[r2] = r5;
        int[] r102 = this.f3524g;
        r102[r2] = r102[r5];
        r102[r5] = r2;
    L46:
        int r103 = this.f3524g[r2];
        if (r103 == (-1)) goto L49;
        this.f3523f[r103] = r2;
    L49:
        m2377l(r9, r2);
        return;
    L42:
        this.f3523f[r2] = -1;
        if (this.f3525h <= 0) goto L45;
        this.f3524g[r2] = this.f3526i;
        this.f3526i = r2;
        goto L46
    L45:
        this.f3524g[r2] = -1;
        goto L46
    L38:
        r2 = -1;
        goto L39
    L5:
        if (r10 >= 0.001f) goto L8;
        mo2341i(r9, true);
    }

    @Override // p069m.InterfaceC0982b
    public final void clear() {
        int r02 = this.f3525h;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L8;
        C0989i r3 = mo2336d(r2);
        if (r3 == null) goto L7;
        r3.m2374b(this.f3527j);
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        int r03 = 0;
    L10:
        if (r03 >= this.f3518a) goto L12;
        this.f3521d[r03] = -1;
        this.f3520c[r03] = -1;
        r03 = r03 + 1;
        goto L10
    L12:
        int r04 = 0;
    L14:
        if (r04 >= 16) goto L16;
        this.f3519b[r04] = -1;
        r04 = r04 + 1;
        goto L14
    L16:
        this.f3525h = 0;
        this.f3526i = -1;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: d */
    public final C0989i mo2336d(int r7) {
        int r02 = this.f3525h;
        if (r02 != 0) goto L5;
        return null;
    L5:
        int r2 = this.f3526i;
        int r3 = 0;
    L6:
        if (r3 >= r02) goto L16;
        if (r3 != r7) goto L12;
        if (r2 == (-1)) goto L12;
        return ((C0989i[]) this.f3528k.f1047d)[this.f3521d[r2]];
    L12:
        r2 = this.f3524g[r2];
        if (r2 == (-1)) goto L16;
        r3 = r3 + 1;
    L16:
        return null;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: e */
    public final void mo2337e(float r6) {
        int r02 = this.f3525h;
        int r1 = this.f3526i;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L8;
        float[] r3 = this.f3522e;
        r3[r1] = r3[r1] / r6;
        r1 = this.f3524g[r1];
        if (r1 == (-1)) goto L11;
        r2 = r2 + 1;
        goto L3
    L11:
        return;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: f */
    public final void mo2338f(C0989i r6, float r7, boolean r8) {
        if (r7 > (-0.001f)) goto L5;
    L7:
        int r1 = m2379n(r6);
        if (r1 != (-1)) goto L10;
        mo2335c(r6, r7);
        return;
    L10:
        float[] r3 = this.f3522e;
        float r4 = r3[r1] + r7;
        r3[r1] = r4;
        if (r4 > (-0.001f)) goto L13;
        return;
    L13:
        if (r4 >= 0.001f) goto L18;
        r3[r1] = 0.0f;
        mo2341i(r6, r8);
        return;
    L18:
        return;
    L5:
        if (r7 >= 0.001f) goto L7;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: g */
    public final float mo2339g(C0989i r2) {
        int r22 = m2379n(r2);
        if (r22 != (-1)) goto L5;
        return 0.0f;
    L5:
        return this.f3522e[r22];
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: h */
    public final float mo2340h(C0983c r8, boolean r9) {
        float r02 = mo2339g(r8.f3479a);
        mo2341i(r8.f3479a, r9);
        C0990j r82 = (C0990j) r8.f3482d;
        int r1 = r82.f3525h;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L8;
        int r4 = r82.f3521d[r3];
        if (r4 == (-1)) goto L7;
        mo2338f(((C0989i[]) this.f3528k.f1047d)[r4], r82.f3522e[r3] * r02, r9);
        r2 = r2 + 1;
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        return r02;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: i */
    public final float mo2341i(C0989i r8, boolean r9) {
        int r02 = m2379n(r8);
        if (r02 != (-1)) goto L6;
        return 0.0f;
    L6:
        int r2 = r8.f3507b;
        int r3 = r2 % 16;
        int[] r4 = this.f3519b;
        int r5 = r4[r3];
        if (r5 != (-1)) goto L10;
    L21:
        float r22 = this.f3522e[r02];
        if (this.f3526i != r02) goto L24;
        this.f3526i = this.f3524g[r02];
    L24:
        this.f3521d[r02] = -1;
        int[] r32 = this.f3523f;
        int r42 = r32[r02];
        if (r42 == (-1)) goto L27;
        int[] r52 = this.f3524g;
        r52[r42] = r52[r02];
    L27:
        int r43 = this.f3524g[r02];
        if (r43 == (-1)) goto L30;
        r32[r43] = r32[r02];
    L30:
        this.f3525h--;
        r8.f3516k--;
        if (r9 == false) goto L33;
        r8.m2374b(this.f3527j);
    L33:
        return r22;
    L10:
        if (this.f3521d[r5] != r2) goto L12;
        int[] r23 = this.f3520c;
        r4[r3] = r23[r5];
        r23[r5] = -1;
    L12:
        int[] r33 = this.f3520c;
        int r44 = r33[r5];
        if (r44 == (-1)) goto L17;
        if (this.f3521d[r44] == r2) goto L17;
        r5 = r44;
    L17:
        if (r44 == (-1)) goto L21;
        if (this.f3521d[r44] != r2) goto L21;
        r33[r5] = r33[r44];
        r33[r44] = -1;
        goto L21
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: j */
    public final void mo2342j() {
        int r02 = this.f3525h;
        int r1 = this.f3526i;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L8;
        float[] r3 = this.f3522e;
        r3[r1] = r3[r1] * (-1.0f);
        r1 = this.f3524g[r1];
        if (r1 == (-1)) goto L11;
        r2 = r2 + 1;
        goto L3
    L11:
        return;
    }

    @Override // p069m.InterfaceC0982b
    /* JADX INFO: renamed from: k */
    public final int mo2343k() {
        return this.f3525h;
    }

    /* JADX INFO: renamed from: l */
    public final void m2377l(C0989i r4, int r5) {
        int r42 = r4.f3507b % 16;
        int[] r02 = this.f3519b;
        int r1 = r02[r42];
        if (r1 != (-1)) goto L5;
        r02[r42] = r5;
    L9:
        this.f3520c[r5] = -1;
        return;
    L5:
        int[] r43 = this.f3520c;
        int r03 = r43[r1];
        if (r03 == (-1)) goto L8;
        r1 = r03;
        goto L5
    L8:
        r43[r1] = r5;
        goto L9
    }

    /* JADX INFO: renamed from: m */
    public final void m2378m(int r3, C0989i r4, float r5) {
        this.f3521d[r3] = r4.f3507b;
        this.f3522e[r3] = r5;
        this.f3523f[r3] = -1;
        this.f3524g[r3] = -1;
        r4.m2373a(this.f3527j);
        r4.f3516k++;
        this.f3525h++;
    }

    /* JADX INFO: renamed from: n */
    public final int m2379n(C0989i r4) {
        if (this.f3525h != 0) goto L5;
        return -1;
    L5:
        int r42 = r4.f3507b;
        int[] r2 = this.f3519b;
        int r02 = r2[r42 % 16];
        if (r02 != (-1)) goto L9;
        return -1;
    L9:
        if (this.f3521d[r02] != r42) goto L11;
        return r02;
    L11:
        r02 = this.f3520c[r02];
        if (r02 == (-1)) goto L16;
        if (this.f3521d[r02] != r42) goto L11;
    L16:
        if (r02 != (-1)) goto L19;
        return -1;
    L19:
        if (this.f3521d[r02] != r42) goto L21;
        return r02;
    L21:
        return -1;
    }

    public final String toString() {
        String r02 = hashCode() + " { ";
        int r1 = this.f3525h;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L18;
        C0989i r3 = mo2336d(r2);
        if (r3 == null) goto L16;
        String r03 = r02 + r3 + " = " + mo2333a(r2) + " ";
        int r32 = m2379n(r3);
        String r04 = AbstractC0324d.m722e(r03, "[p: ");
        int r4 = this.f3523f[r32];
        C0463v r6 = this.f3528k;
        if (r4 == (-1)) goto L10;
        String r05 = r04 + ((C0989i[]) r6.f1047d)[this.f3521d[this.f3523f[r32]]];
    L11:
        String r06 = AbstractC0324d.m722e(r05, ", n: ");
        if (this.f3524g[r32] == (-1)) goto L14;
        String r07 = r06 + ((C0989i[]) r6.f1047d)[this.f3521d[this.f3524g[r32]]];
    L15:
        r02 = AbstractC0324d.m722e(r07, "]");
        goto L16
    L14:
        r07 = AbstractC0324d.m722e(r06, "none");
        goto L15
    L10:
        r05 = AbstractC0324d.m722e(r04, "none");
    L16:
        r2 = r2 + 1;
        goto L3
    L18:
        return AbstractC0324d.m722e(r02, " }");
    }
}
