package a;

/* JADX INFO: renamed from: a.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115e3 extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0430ve f449a;
    public a.C0175h9 b;
    public java.util.List<a.C0430ve> c;

    public C0115e3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void g(a.C0115e3 r3, java.lang.String r4) {
            java.lang.String r0 = "usingString"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "matchType"
            r1 = 1
            a.C0487z.j(r0, r1)
            a.ve r0 = new a.ve
            r2 = 0
            r0.<init>(r4, r1, r2)
            java.util.List<a.ve> r4 = r3.c
            if (r4 != 0) goto L1a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1a:
            r3.c = r4
            r4.add(r0)
            return
    }

    public static /* synthetic */ void i(a.C0115e3 r0, java.lang.String r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 5
        L5:
            r3 = 0
            r0.h(r1, r2, r3)
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r8) {
            r7 = this;
            a.ve r0 = r7.f449a
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.b(r8)
            goto Lb
        La:
            r0 = r1
        Lb:
            a.h9 r2 = r7.b
            if (r2 == 0) goto L14
            int r2 = r2.b(r8)
            goto L15
        L14:
            r2 = r1
        L15:
            java.util.List<a.ve> r3 = r7.c
            r4 = 10
            if (r3 == 0) goto L4c
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = a.C0312p3.g0(r3, r4)
            r5.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L43
            java.lang.Object r6 = r3.next()
            a.ve r6 = (a.C0430ve) r6
            r6.getClass()
            int r6 = r6.b(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L28
        L43:
            int[] r3 = a.C0383t3.v0(r5)
            int r3 = r8.d(r3)
            goto L4d
        L4c:
            r3 = r1
        L4d:
            r5 = 12
            r8.i(r5)
            r5 = 11
            r8.a(r5, r1)
            r8.a(r4, r1)
            r4 = 9
            r8.a(r4, r1)
            r4 = 8
            r8.a(r4, r3)
            r3 = 7
            r8.a(r3, r1)
            r3 = 6
            r8.a(r3, r1)
            r3 = 5
            r8.a(r3, r1)
            r3 = 4
            r8.a(r3, r2)
            r2 = 3
            r8.a(r2, r1)
            r2 = 2
            r8.a(r2, r1)
            r2 = 1
            r8.a(r2, r0)
            r8.a(r1, r1)
            int r0 = r8.e()
            r8.f(r0)
            return r0
    }

    public final void h(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "className"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "matchType"
            a.C0487z.j(r0, r3)
            a.ve r0 = new a.ve
            r0.<init>(r2, r3, r4)
            r1.f449a = r0
            return
    }
}
