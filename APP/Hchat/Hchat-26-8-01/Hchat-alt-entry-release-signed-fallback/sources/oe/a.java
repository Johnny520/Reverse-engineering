package oe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.p f9788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f9789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f9790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public oe.a f9793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f9794g;

    public a(ud.p r1, java.util.ArrayList r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f9788a = r1
            r0.f9789b = r2
            r0.f9791d = r3
            r0.f9792e = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            a(r1, r2)
            r0.f9790c = r2
            return
    }

    public static void a(ud.p r3, java.util.ArrayList r4) {
            pd.k r0 = r3.f13713k
            java.util.List r1 = r3.f13715m
            pd.k r2 = pd.k.R
            if (r0 != r2) goto L13
            td.b r3 = (td.b) r3
            yd.b r3 = r3.f13121o
            java.util.ArrayList r3 = r3.J()
            r4.addAll(r3)
        L13:
            java.util.Iterator r3 = r1.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()
            qd.l r0 = (qd.l) r0
            r0.getClass()
            boolean r2 = r0 instanceof qd.r
            if (r2 == 0) goto L17
            qd.r r0 = (qd.r) r0
            r4.add(r0)
            goto L17
        L30:
            java.util.Iterator r3 = r1.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r3.next()
            qd.l r0 = (qd.l) r0
            r0.getClass()
            boolean r1 = r0 instanceof qd.m
            if (r1 == 0) goto L34
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            a(r0, r4)
            goto L34
        L4f:
            return
    }

    public static boolean e(ud.p r2, java.util.BitSet r3) {
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            qd.r r2 = r2.f13714l
            if (r2 != 0) goto Ld
            return r1
        Ld:
            int r2 = r2.f10922l
            boolean r2 = r3.get(r2)
            return r2
    }

    public final boolean b() {
            r2 = this;
            ud.p r0 = r2.f9788a
            boolean r0 = r0.N()
            if (r0 != 0) goto L9
            goto L23
        L9:
            java.util.ArrayList r0 = r2.f9794g
            if (r0 == 0) goto L25
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            oe.a r1 = (oe.a) r1
            boolean r1 = r1.b()
            if (r1 != 0) goto L11
        L23:
            r0 = 0
            return r0
        L25:
            r0 = 1
            return r0
    }

    public final void c(java.util.BitSet r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.f9790c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            qd.r r1 = (qd.r) r1
            int r1 = r1.f10922l
            r3.set(r1)
            goto L6
        L18:
            java.util.ArrayList r0 = r2.f9794g
            if (r0 == 0) goto L30
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            oe.a r1 = (oe.a) r1
            r1.c(r3)
            goto L20
        L30:
            return
    }

    public final oe.a d() {
            r1 = this;
            oe.a r0 = r1.f9793f
            if (r0 == 0) goto Lc
            oe.a r0 = r0.d()
            if (r0 == 0) goto Lc
            r1.f9793f = r0
        Lc:
            oe.a r0 = r1.f9793f
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.f9792e
            oe.a r1 = r6.f9793f
            if (r1 != 0) goto L9
            java.lang.String r1 = "-"
            goto Lf
        L9:
            int r1 = r1.f9791d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.ArrayList r2 = r6.f9790c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            ud.p r3 = r6.f9788a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ArgsInfo: |"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " ->"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = " "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " : "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            return r0
    }
}
