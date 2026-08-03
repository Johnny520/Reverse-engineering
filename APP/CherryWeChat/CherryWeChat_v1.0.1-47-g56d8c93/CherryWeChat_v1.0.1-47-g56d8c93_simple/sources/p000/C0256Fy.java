package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: Fy */
/* JADX INFO: loaded from: classes.dex */
public final class C0256Fy implements Comparable {

    /* JADX INFO: renamed from: a */
    public boolean f829a;

    /* JADX INFO: renamed from: b */
    public int f830b;

    /* JADX INFO: renamed from: c */
    public int f831c;

    /* JADX INFO: renamed from: d */
    public int f832d;

    /* JADX INFO: renamed from: e */
    public float f833e;

    /* JADX INFO: renamed from: f */
    public boolean f834f;

    /* JADX INFO: renamed from: g */
    public final float[] f835g;

    /* JADX INFO: renamed from: h */
    public final float[] f836h;

    /* JADX INFO: renamed from: i */
    public C0564N4[] f837i;

    /* JADX INFO: renamed from: j */
    public int f838j;

    /* JADX INFO: renamed from: k */
    public int f839k;

    /* JADX INFO: renamed from: l */
    public int f840l;

    public C0256Fy(int r4) {
        this.f830b = -1;
        this.f831c = -1;
        this.f832d = 0;
        this.f834f = false;
        this.f835g = new float[9];
        this.f836h = new float[9];
        this.f837i = new C0564N4[16];
        this.f838j = 0;
        this.f839k = 0;
        this.f840l = r4;
    }

    /* JADX INFO: renamed from: a */
    public final void m533a(C0564N4 r4) {
        int r0 = 0;
    L3:
        int r1 = this.f838j;
        if (r0 >= r1) goto L9;
        if (this.f837i[r0] == r4) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return;
    L9:
        C0564N4[] r02 = this.f837i;
        if (r1 < r02.length) goto L12;
        this.f837i = (C0564N4[]) Arrays.copyOf(r02, r02.length * 2);
    L12:
        C0564N4[] r03 = this.f837i;
        int r12 = this.f838j;
        r03[r12] = r4;
        this.f838j = r12 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m534b(C0564N4 r5) {
        int r0 = this.f838j;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L12;
        if (this.f837i[r1] == r5) goto L7;
        r1 = r1 + 1;
    L7:
        if (r1 >= (r0 - 1)) goto L9;
        C0564N4[] r52 = this.f837i;
        int r2 = r1 + 1;
        r52[r1] = r52[r2];
        r1 = r2;
        goto L7
    L9:
        this.f838j--;
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m535c() {
        this.f840l = 5;
        this.f832d = 0;
        this.f830b = -1;
        this.f831c = -1;
        this.f833e = 0.0f;
        this.f834f = false;
        int r2 = this.f838j;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        this.f837i[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.f838j = 0;
        this.f839k = 0;
        this.f829a = false;
        Arrays.fill(this.f836h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f830b - ((C0256Fy) r2).f830b;
    }

    /* JADX INFO: renamed from: d */
    public final void m536d(C2244mo r4, float r5) {
        this.f833e = r5;
        this.f834f = true;
        int r52 = this.f838j;
        this.f831c = -1;
        int r1 = 0;
    L3:
        if (r1 >= r52) goto L5;
        this.f837i[r1].m1110h(r4, this, false);
        r1 = r1 + 1;
        goto L3
    L5:
        this.f838j = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m537e(C2244mo r5, C0564N4 r6) {
        int r0 = this.f838j;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        this.f837i[r2].mo1111i(r5, r6, false);
        r2 = r2 + 1;
        goto L3
    L5:
        this.f838j = 0;
    }

    public final String toString() {
        return "" + this.f830b;
    }
}
