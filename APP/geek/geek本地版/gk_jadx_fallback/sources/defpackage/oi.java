package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi {
    public int a;
    public final defpackage.xv b;
    public defpackage.xv c;
    public defpackage.xv d;
    public int e;
    public int f;

    public oi(defpackage.xv r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            r1.b = r2
            r1.c = r2
            return
    }

    public final int a(int r5) {
            r4 = this;
            xv r0 = r4.c
            android.util.SparseArray r0 = r0.a
            if (r0 != 0) goto L8
            r0 = 0
            goto Le
        L8:
            java.lang.Object r0 = r0.get(r5)
            xv r0 = (defpackage.xv) r0
        Le:
            int r1 = r4.a
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L22
            if (r0 != 0) goto L1a
            r4.b()
            goto L61
        L1a:
            r4.a = r3
            r4.c = r0
            r4.f = r2
        L20:
            r2 = r3
            goto L61
        L22:
            if (r0 == 0) goto L2c
            r4.c = r0
            int r0 = r4.f
            int r0 = r0 + r2
            r4.f = r0
            goto L20
        L2c:
            r0 = 65038(0xfe0e, float:9.1138E-41)
            if (r5 != r0) goto L35
            r4.b()
            goto L61
        L35:
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r5 != r0) goto L3b
            goto L20
        L3b:
            xv r0 = r4.c
            ni r1 = r0.b
            if (r1 == 0) goto L5e
            int r1 = r4.f
            r3 = 3
            if (r1 != r2) goto L58
            boolean r0 = r4.c()
            if (r0 == 0) goto L54
            xv r0 = r4.c
            r4.d = r0
            r4.b()
            goto L20
        L54:
            r4.b()
            goto L61
        L58:
            r4.d = r0
            r4.b()
            goto L20
        L5e:
            r4.b()
        L61:
            r4.e = r5
            return r2
    }

    public final void b() {
            r1 = this;
            r0 = 1
            r1.a = r0
            xv r0 = r1.b
            r1.c = r0
            r0 = 0
            r1.f = r0
            return
    }

    public final boolean c() {
            r4 = this;
            xv r0 = r4.c
            ni r0 = r0.b
            vv r0 = r0.b()
            r1 = 6
            int r1 = r0.a(r1)
            r2 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.a
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L1e
            return r2
        L1e:
            int r0 = r4.e
            r1 = 65039(0xfe0f, float:9.1139E-41)
            if (r0 != r1) goto L26
            return r2
        L26:
            r0 = 0
            return r0
    }
}
