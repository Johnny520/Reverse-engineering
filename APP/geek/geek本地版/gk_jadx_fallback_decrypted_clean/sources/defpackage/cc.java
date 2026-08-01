package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cc {
    public java.util.HashSet a;
    public final defpackage.pc b;
    public final int c;
    public defpackage.cc d;
    public int e;
    public int f;
    public defpackage.a40 g;

    public cc(defpackage.pc r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.e = r0
            r0 = -1
            r1.f = r0
            r1.b = r2
            r1.c = r3
            return
    }

    public final void a(defpackage.cc r3, int r4) {
            r2 = this;
            r0 = -1
            r1 = 0
            r2.b(r3, r4, r0, r1)
            return
    }

    public final boolean b(defpackage.cc r3, int r4, int r5, boolean r6) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L7
            r2.h()
            return r0
        L7:
            r1 = 0
            if (r6 != 0) goto L11
            boolean r6 = r2.g(r3)
            if (r6 != 0) goto L11
            return r1
        L11:
            r2.d = r3
            java.util.HashSet r6 = r3.a
            if (r6 != 0) goto L1e
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.a = r6
        L1e:
            cc r3 = r2.d
            java.util.HashSet r3 = r3.a
            r3.add(r2)
            if (r4 <= 0) goto L2a
            r2.e = r4
            goto L2c
        L2a:
            r2.e = r1
        L2c:
            r2.f = r5
            return r0
    }

    public final int c() {
            r3 = this;
            pc r0 = r3.b
            int r0 = r0.V
            r1 = 8
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            int r0 = r3.f
            r2 = -1
            if (r0 <= r2) goto L1a
            cc r2 = r3.d
            if (r2 == 0) goto L1a
            pc r2 = r2.b
            int r2 = r2.V
            if (r2 != r1) goto L1a
            return r0
        L1a:
            int r0 = r3.e
            return r0
    }

    public final defpackage.cc d() {
            r3 = this;
            int r0 = r3.c
            int r1 = defpackage.z30.t(r0)
            pc r2 = r3.b
            switch(r1) {
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L21;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = defpackage.z30.s(r0)
            r1.<init>(r0)
            throw r1
        L15:
            cc r0 = r2.y
            return r0
        L18:
            cc r0 = r2.x
            return r0
        L1b:
            cc r0 = r2.A
            return r0
        L1e:
            cc r0 = r2.z
            return r0
        L21:
            r0 = 0
            return r0
    }

    public final boolean e() {
            r3 = this;
            java.util.HashSet r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            cc r2 = (defpackage.cc) r2
            cc r2 = r2.d()
            boolean r2 = r2.f()
            if (r2 == 0) goto La
            r0 = 1
            return r0
        L22:
            return r1
    }

    public final boolean f() {
            r1 = this;
            cc r0 = r1.d
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean g(defpackage.cc r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L60
        L5:
            pc r1 = r9.b
            int r9 = r9.c
            r2 = 6
            int r3 = r8.c
            r4 = 1
            if (r9 != r3) goto L1c
            if (r3 != r2) goto L5e
            boolean r9 = r1.w
            if (r9 == 0) goto L60
            pc r9 = r8.b
            boolean r9 = r9.w
            if (r9 != 0) goto L5e
            goto L60
        L1c:
            int r5 = defpackage.z30.t(r3)
            r6 = 8
            r7 = 9
            switch(r5) {
                case 0: goto L60;
                case 1: goto L4c;
                case 2: goto L38;
                case 3: goto L4c;
                case 4: goto L38;
                case 5: goto L60;
                case 6: goto L31;
                case 7: goto L60;
                case 8: goto L60;
                default: goto L27;
            }
        L27:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = defpackage.z30.s(r3)
            r9.<init>(r0)
            throw r9
        L31:
            if (r9 == r2) goto L60
            if (r9 == r6) goto L60
            if (r9 == r7) goto L60
            goto L5e
        L38:
            r2 = 3
            if (r9 == r2) goto L41
            r2 = 5
            if (r9 != r2) goto L3f
            goto L41
        L3f:
            r2 = r0
            goto L42
        L41:
            r2 = r4
        L42:
            boolean r1 = r1 instanceof defpackage.go
            if (r1 == 0) goto L4b
            if (r2 != 0) goto L5e
            if (r9 != r7) goto L60
            goto L5e
        L4b:
            return r2
        L4c:
            r2 = 2
            if (r9 == r2) goto L55
            r2 = 4
            if (r9 != r2) goto L53
            goto L55
        L53:
            r2 = r0
            goto L56
        L55:
            r2 = r4
        L56:
            boolean r1 = r1 instanceof defpackage.go
            if (r1 == 0) goto L5f
            if (r2 != 0) goto L5e
            if (r9 != r6) goto L60
        L5e:
            return r4
        L5f:
            return r2
        L60:
            return r0
    }

    public final void h() {
            r1 = this;
            cc r0 = r1.d
            if (r0 == 0) goto Lb
            java.util.HashSet r0 = r0.a
            if (r0 == 0) goto Lb
            r0.remove(r1)
        Lb:
            r0 = 0
            r1.d = r0
            r0 = 0
            r1.e = r0
            r0 = -1
            r1.f = r0
            return
    }

    public final void i() {
            r2 = this;
            a40 r0 = r2.g
            if (r0 != 0) goto Ld
            a40 r0 = new a40
            r1 = 1
            r0.<init>(r1)
            r2.g = r0
            return
        Ld:
            r0.c()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            pc r1 = r2.b
            java.lang.String r1 = r1.W
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.c
            java.lang.String r1 = defpackage.z30.s(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
