package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a90 extends z80 {
    public ox[] a;
    public String b;
    public int c;

    public a90() {
        this.a = null;
        this.c = 0;
    }

    public ox[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ox[] r8) {
        ox[] r0 = this.a;
        boolean r1 = false;
        if (r0 == null) goto L19;
        if (r8 == null) goto L19;
        if (r0.length != r8.length) goto L19;
        int r2 = 0;
    L11:
        if (r2 >= r0.length) goto L18;
        ox r3 = r0[r2];
        char r4 = r3.a;
        ox r5 = r8[r2];
        if (r4 != r5.a) goto L19;
        if (r3.b.length != r5.b.length) goto L19;
        r2 = r2 + 1;
        goto L11
    L18:
        r1 = true;
    L19:
        if (r1 == true) goto L22;
        this.a = ct.k(r8);
        return;
    L22:
        ox[] r02 = this.a;
        int r22 = 0;
    L24:
        if (r22 >= r8.length) goto L30;
        r02[r22].a = r8[r22].a;
        int r32 = 0;
    L26:
        float[] r42 = r8[r22].b;
        if (r32 >= r42.length) goto L29;
        r02[r22].b[r32] = r42[r32];
        r32 = r32 + 1;
        goto L26
    L29:
        r22 = r22 + 1;
        goto L24
    }

    public a90(a90 r2) {
        this.a = null;
        this.c = 0;
        this.b = r2.b;
        this.a = ct.k(r2.a);
    }
}
