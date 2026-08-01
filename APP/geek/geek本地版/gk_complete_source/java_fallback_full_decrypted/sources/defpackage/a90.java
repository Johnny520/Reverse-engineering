package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a90 extends defpackage.z80 {
    public defpackage.ox[] a;
    public java.lang.String b;
    public int c;

    public a90() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.c = r0
            return
    }

    public a90(defpackage.a90 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.c = r0
            java.lang.String r0 = r2.b
            r1.b = r0
            ox[] r2 = r2.a
            ox[] r2 = defpackage.ct.k(r2)
            r1.a = r2
            return
    }

    public defpackage.ox[] getPathData() {
            r1 = this;
            ox[] r0 = r1.a
            return r0
    }

    public java.lang.String getPathName() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public void setPathData(defpackage.ox[] r8) {
            r7 = this;
            ox[] r0 = r7.a
            r1 = 0
            if (r0 == 0) goto L28
            if (r8 != 0) goto L8
            goto L28
        L8:
            int r2 = r0.length
            int r3 = r8.length
            if (r2 == r3) goto Ld
            goto L28
        Ld:
            r2 = r1
        Le:
            int r3 = r0.length
            if (r2 >= r3) goto L27
            r3 = r0[r2]
            char r4 = r3.a
            r5 = r8[r2]
            char r6 = r5.a
            if (r4 != r6) goto L28
            float[] r3 = r3.b
            int r3 = r3.length
            float[] r4 = r5.b
            int r4 = r4.length
            if (r3 == r4) goto L24
            goto L28
        L24:
            int r2 = r2 + 1
            goto Le
        L27:
            r1 = 1
        L28:
            if (r1 != 0) goto L31
            ox[] r8 = defpackage.ct.k(r8)
            r7.a = r8
            return
        L31:
            ox[] r0 = r7.a
            r1 = 0
            r2 = r1
        L35:
            int r3 = r8.length
            if (r2 >= r3) goto L56
            r3 = r0[r2]
            r4 = r8[r2]
            char r4 = r4.a
            r3.a = r4
            r3 = r1
        L41:
            r4 = r8[r2]
            float[] r4 = r4.b
            int r5 = r4.length
            if (r3 >= r5) goto L53
            r5 = r0[r2]
            float[] r5 = r5.b
            r4 = r4[r3]
            r5[r3] = r4
            int r3 = r3 + 1
            goto L41
        L53:
            int r2 = r2 + 1
            goto L35
        L56:
            return
    }
}
