package p069m;

import java.util.Arrays;

/* JADX INFO: renamed from: m.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0989i {

    /* JADX INFO: renamed from: a */
    public boolean f3506a;

    /* JADX INFO: renamed from: b */
    public int f3507b;

    /* JADX INFO: renamed from: c */
    public int f3508c;

    /* JADX INFO: renamed from: d */
    public int f3509d;

    /* JADX INFO: renamed from: e */
    public float f3510e;

    /* JADX INFO: renamed from: f */
    public boolean f3511f;

    /* JADX INFO: renamed from: g */
    public final float[] f3512g;

    /* JADX INFO: renamed from: h */
    public final float[] f3513h;

    /* JADX INFO: renamed from: i */
    public C0983c[] f3514i;

    /* JADX INFO: renamed from: j */
    public int f3515j;

    /* JADX INFO: renamed from: k */
    public int f3516k;

    /* JADX INFO: renamed from: l */
    public int f3517l;

    public C0989i(int r4) {
        this.f3507b = -1;
        this.f3508c = -1;
        this.f3509d = 0;
        this.f3511f = false;
        this.f3512g = new float[9];
        this.f3513h = new float[9];
        this.f3514i = new C0983c[16];
        this.f3515j = 0;
        this.f3516k = 0;
        this.f3517l = r4;
    }

    /* JADX INFO: renamed from: a */
    public final void m2373a(C0983c r4) {
        int r02 = 0;
    L3:
        int r1 = this.f3515j;
        if (r02 >= r1) goto L9;
        if (this.f3514i[r02] == r4) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        return;
    L9:
        C0983c[] r03 = this.f3514i;
        if (r1 < r03.length) goto L12;
        this.f3514i = (C0983c[]) Arrays.copyOf(r03, r03.length * 2);
    L12:
        C0983c[] r04 = this.f3514i;
        int r12 = this.f3515j;
        r04[r12] = r4;
        this.f3515j = r12 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m2374b(C0983c r5) {
        int r02 = this.f3515j;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L12;
        if (this.f3514i[r1] == r5) goto L7;
        r1 = r1 + 1;
    L7:
        if (r1 >= (r02 - 1)) goto L9;
        C0983c[] r52 = this.f3514i;
        int r2 = r1 + 1;
        r52[r1] = r52[r2];
        r1 = r2;
        goto L7
    L9:
        this.f3515j--;
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m2375c() {
        this.f3517l = 5;
        this.f3509d = 0;
        this.f3507b = -1;
        this.f3508c = -1;
        this.f3510e = 0.0f;
        this.f3511f = false;
        int r2 = this.f3515j;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        this.f3514i[r3] = null;
        r3 = r3 + 1;
        goto L3
    L5:
        this.f3515j = 0;
        this.f3516k = 0;
        this.f3506a = false;
        Arrays.fill(this.f3513h, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public final void m2376d(C0983c r5) {
        int r02 = this.f3515j;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        this.f3514i[r2].mo2351h(r5, false);
        r2 = r2 + 1;
        goto L3
    L5:
        this.f3515j = 0;
    }

    public final String toString() {
        return "" + this.f3507b;
    }
}
