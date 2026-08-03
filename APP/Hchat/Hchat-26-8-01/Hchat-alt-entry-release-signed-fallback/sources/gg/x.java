package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static java.util.List a(java.lang.Object r1) {
            boolean r0 = r1 instanceof hg.a
            if (r0 == 0) goto L10
            boolean r0 = r1 instanceof hg.c
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "kotlin.collections.MutableList"
            f(r1, r0)
            r1 = 0
            throw r1
        L10:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.ClassCastException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.Class<gg.x> r0 = gg.x.class
            java.lang.String r0 = r0.getName()
            gg.l.e(r1, r0)
            throw r1
    }

    public static java.util.Map b(java.lang.Object r1) {
            boolean r0 = r1 instanceof hg.a
            if (r0 == 0) goto L10
            boolean r0 = r1 instanceof hg.d
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "kotlin.collections.MutableMap"
            f(r1, r0)
            r1 = 0
            throw r1
        L10:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.ClassCastException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.Class<gg.x> r0 = gg.x.class
            java.lang.String r0 = r0.getName()
            gg.l.e(r1, r0)
            throw r1
    }

    public static void c(int r2, java.lang.Object r3) {
            if (r3 == 0) goto L1c
            boolean r0 = d(r2, r3)
            if (r0 == 0) goto L9
            goto L1c
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            f(r3, r2)
            r2 = 0
            throw r2
        L1c:
            return
    }

    public static boolean d(int r3, java.lang.Object r4) {
            boolean r0 = r4 instanceof sf.b
            r1 = 0
            if (r0 == 0) goto La9
            boolean r0 = r4 instanceof gg.i
            r2 = 1
            if (r0 == 0) goto L12
            gg.i r4 = (gg.i) r4
            int r4 = r4.getArity()
            goto La6
        L12:
            boolean r0 = r4 instanceof fg.a
            if (r0 == 0) goto L19
            r4 = r1
            goto La6
        L19:
            boolean r0 = r4 instanceof fg.l
            if (r0 == 0) goto L20
            r4 = r2
            goto La6
        L20:
            boolean r0 = r4 instanceof fg.p
            if (r0 == 0) goto L27
            r4 = 2
            goto La6
        L27:
            boolean r0 = r4 instanceof fg.q
            if (r0 == 0) goto L2e
            r4 = 3
            goto La6
        L2e:
            boolean r0 = r4 instanceof fg.r
            if (r0 == 0) goto L35
            r4 = 4
            goto La6
        L35:
            boolean r0 = r4 instanceof fg.s
            if (r0 == 0) goto L3c
            r4 = 5
            goto La6
        L3c:
            boolean r0 = r4 instanceof fg.t
            if (r0 == 0) goto L43
            r4 = 6
            goto La6
        L43:
            boolean r0 = r4 instanceof fg.u
            if (r0 == 0) goto L4a
            r4 = 7
            goto La6
        L4a:
            boolean r0 = r4 instanceof fg.v
            if (r0 == 0) goto L51
            r4 = 8
            goto La6
        L51:
            boolean r0 = r4 instanceof fg.w
            if (r0 == 0) goto L58
            r4 = 9
            goto La6
        L58:
            boolean r0 = r4 instanceof fg.b
            if (r0 == 0) goto L5f
            r4 = 10
            goto La6
        L5f:
            boolean r0 = r4 instanceof fg.c
            if (r0 == 0) goto L66
            r4 = 11
            goto La6
        L66:
            boolean r0 = r4 instanceof fg.e
            if (r0 == 0) goto L6d
            r4 = 13
            goto La6
        L6d:
            boolean r0 = r4 instanceof fg.f
            if (r0 == 0) goto L74
            r4 = 14
            goto La6
        L74:
            boolean r0 = r4 instanceof fg.g
            if (r0 == 0) goto L7b
            r4 = 15
            goto La6
        L7b:
            boolean r0 = r4 instanceof fg.h
            if (r0 == 0) goto L82
            r4 = 16
            goto La6
        L82:
            boolean r0 = r4 instanceof fg.i
            if (r0 == 0) goto L89
            r4 = 17
            goto La6
        L89:
            boolean r0 = r4 instanceof fg.j
            if (r0 == 0) goto L90
            r4 = 18
            goto La6
        L90:
            boolean r0 = r4 instanceof fg.k
            if (r0 == 0) goto L97
            r4 = 19
            goto La6
        L97:
            boolean r0 = r4 instanceof fg.m
            if (r0 == 0) goto L9e
            r4 = 20
            goto La6
        L9e:
            boolean r4 = r4 instanceof fg.n
            if (r4 == 0) goto La5
            r4 = 21
            goto La6
        La5:
            r4 = -1
        La6:
            if (r4 != r3) goto La9
            return r2
        La9:
            return r1
    }

    public static boolean e(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof hg.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof hg.c
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static void f(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.String r0 = " cannot be cast to "
            java.lang.String r1 = wb.en.h(r1, r0, r2)
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<gg.x> r1 = gg.x.class
            java.lang.String r1 = r1.getName()
            gg.l.e(r2, r1)
            throw r2
    }
}
