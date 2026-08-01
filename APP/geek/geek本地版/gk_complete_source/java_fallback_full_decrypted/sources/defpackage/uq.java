package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uq {
    public defpackage.ai a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public uq() {
            r0 = this;
            r0.<init>()
            r0.d()
            return
    }

    public final void a() {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto Lb
            ai r0 = r1.a
            int r0 = r0.g()
            goto L11
        Lb:
            ai r0 = r1.a
            int r0 = r0.k()
        L11:
            r1.c = r0
            return
    }

    public final void b(android.view.View r4, int r5) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 == 0) goto L20
            ai r0 = r3.a
            int r4 = r0.b(r4)
            ai r0 = r3.a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r0.a
            if (r1 != r2) goto L14
            r0 = 0
            goto L1c
        L14:
            int r1 = r0.l()
            int r0 = r0.a
            int r0 = r1 - r0
        L1c:
            int r0 = r0 + r4
            r3.c = r0
            goto L28
        L20:
            ai r0 = r3.a
            int r4 = r0.e(r4)
            r3.c = r4
        L28:
            r3.b = r5
            return
    }

    public final void c(android.view.View r5, int r6) {
            r4 = this;
            ai r0 = r4.a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r0.a
            r3 = 0
            if (r1 != r2) goto Lb
            r1 = r3
            goto L12
        Lb:
            int r1 = r0.l()
            int r0 = r0.a
            int r1 = r1 - r0
        L12:
            if (r1 < 0) goto L18
            r4.b(r5, r6)
            return
        L18:
            r4.b = r6
            boolean r6 = r4.d
            if (r6 == 0) goto L60
            ai r6 = r4.a
            int r6 = r6.g()
            int r6 = r6 - r1
            ai r0 = r4.a
            int r0 = r0.b(r5)
            int r6 = r6 - r0
            ai r0 = r4.a
            int r0 = r0.g()
            int r0 = r0 - r6
            r4.c = r0
            if (r6 <= 0) goto L9f
            ai r0 = r4.a
            int r0 = r0.c(r5)
            int r1 = r4.c
            int r1 = r1 - r0
            ai r0 = r4.a
            int r0 = r0.k()
            ai r2 = r4.a
            int r5 = r2.e(r5)
            int r5 = r5 - r0
            int r5 = java.lang.Math.min(r5, r3)
            int r5 = r5 + r0
            int r1 = r1 - r5
            if (r1 >= 0) goto L9f
            int r5 = r4.c
            int r0 = -r1
            int r6 = java.lang.Math.min(r6, r0)
            int r6 = r6 + r5
            r4.c = r6
            return
        L60:
            ai r6 = r4.a
            int r6 = r6.e(r5)
            ai r0 = r4.a
            int r0 = r0.k()
            int r0 = r6 - r0
            r4.c = r6
            if (r0 <= 0) goto L9f
            ai r2 = r4.a
            int r2 = r2.c(r5)
            int r2 = r2 + r6
            ai r6 = r4.a
            int r6 = r6.g()
            int r6 = r6 - r1
            ai r1 = r4.a
            int r5 = r1.b(r5)
            int r6 = r6 - r5
            ai r5 = r4.a
            int r5 = r5.g()
            int r6 = java.lang.Math.min(r3, r6)
            int r5 = r5 - r6
            int r5 = r5 - r2
            if (r5 >= 0) goto L9f
            int r6 = r4.c
            int r5 = -r5
            int r5 = java.lang.Math.min(r0, r5)
            int r6 = r6 - r5
            r4.c = r6
        L9f:
            return
    }

    public final void d() {
            r1 = this;
            r0 = -1
            r1.b = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.c = r0
            r0 = 0
            r1.d = r0
            r1.e = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnchorInfo{mPosition="
            r0.<init>(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mCoordinate="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", mLayoutFromEnd="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", mValid="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
