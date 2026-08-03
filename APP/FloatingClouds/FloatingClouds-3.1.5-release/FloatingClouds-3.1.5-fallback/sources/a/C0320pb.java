package a;

/* JADX INFO: renamed from: a.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0320pb extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0115e3 f640a;
    public a.C0115e3 b;
    public a.C0321pc c;
    public java.util.List<a.C0430ve> d;

    public C0320pb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void g(a.C0320pb r3, java.lang.String r4) {
            java.lang.String r0 = "usingString"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "matchType"
            r1 = 1
            a.C0487z.j(r0, r1)
            java.util.List<a.ve> r0 = r3.d
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L14:
            r3.d = r0
            a.ve r3 = new a.ve
            r2 = 0
            r3.<init>(r4, r1, r2)
            r0.add(r3)
            return
    }

    public static void h(a.C0320pb r3, java.lang.String r4) {
            java.lang.String r0 = "className"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "matchType"
            r1 = 5
            a.C0487z.j(r0, r1)
            a.e3 r0 = new a.e3
            r0.<init>()
            r2 = 0
            r0.h(r4, r1, r2)
            r3.f640a = r0
            return
    }

    public static void j(a.C0320pb r3, java.lang.String r4) {
            java.lang.String r0 = "typeName"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "matchType"
            r1 = 5
            a.C0487z.j(r0, r1)
            a.e3 r0 = new a.e3
            r0.<init>()
            r2 = 0
            r0.h(r4, r1, r2)
            r3.b = r0
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r9) {
            r8 = this;
            a.e3 r0 = r8.f640a
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.b(r9)
            goto Lb
        La:
            r0 = r1
        Lb:
            a.e3 r2 = r8.b
            if (r2 == 0) goto L14
            int r2 = r2.b(r9)
            goto L15
        L14:
            r2 = r1
        L15:
            a.pc r3 = r8.c
            if (r3 == 0) goto L1e
            int r3 = r3.b(r9)
            goto L1f
        L1e:
            r3 = r1
        L1f:
            java.util.List<a.ve> r4 = r8.d
            r5 = 10
            if (r4 == 0) goto L56
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = a.C0312p3.g0(r4, r5)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L4d
            java.lang.Object r7 = r4.next()
            a.ve r7 = (a.C0430ve) r7
            r7.getClass()
            int r7 = r7.b(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L32
        L4d:
            int[] r4 = a.C0383t3.v0(r6)
            int r4 = r9.d(r4)
            goto L57
        L56:
            r4 = r1
        L57:
            r6 = 17
            r9.i(r6)
            r6 = 16
            r9.a(r6, r1)
            r6 = 15
            r9.a(r6, r1)
            r6 = 14
            r9.a(r6, r1)
            r6 = 13
            r9.a(r6, r1)
            r6 = 12
            r9.a(r6, r1)
            r6 = 11
            r9.a(r6, r1)
            r9.a(r5, r1)
            r5 = 9
            r9.a(r5, r1)
            r5 = 8
            r9.a(r5, r1)
            r5 = 7
            r9.a(r5, r4)
            r4 = 6
            r9.a(r4, r1)
            r4 = 5
            r9.a(r4, r1)
            r4 = 4
            r9.a(r4, r3)
            r3 = 3
            r9.a(r3, r2)
            r2 = 2
            r9.a(r2, r0)
            r0 = 1
            r9.a(r0, r1)
            r9.a(r1, r1)
            int r0 = r9.e()
            r9.f(r0)
            return r0
    }

    public final void i(java.util.Collection r7) {
            r6 = this;
            java.lang.String r0 = "paramTypes"
            a.C0193i9.e(r7, r0)
            a.pc r0 = new a.pc
            r0.<init>()
            a.Y5 r1 = a.Y5.f351a
            java.util.ArrayList r1 = a.C0383t3.y0(r1)
            r0.f641a = r1
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L36
            a.oc r2 = new a.oc
            r2.<init>()
            a.e3 r3 = new a.e3
            r3.<init>()
            r4 = 0
            r5 = 5
            r3.h(r1, r5, r4)
            r2.f625a = r3
            goto L37
        L36:
            r2 = 0
        L37:
            java.util.List<a.oc> r1 = r0.f641a
            if (r1 != 0) goto L40
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L40:
            r0.f641a = r1
            r1.add(r2)
            goto L16
        L46:
            r6.c = r0
            return
    }
}
