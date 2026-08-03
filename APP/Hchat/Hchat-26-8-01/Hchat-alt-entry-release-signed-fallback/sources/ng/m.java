package ng;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends ng.n {
    public static ng.j R(java.util.Iterator r2) {
            r2.getClass()
            dg.n r0 = new dg.n
            r1 = 2
            r0.<init>(r2, r1)
            ng.a r2 = new ng.a
            r2.<init>(r0)
            return r2
    }

    public static ng.c S(ng.j r2) {
            r9.p r0 = new r9.p
            r1 = 11
            r0.<init>(r1)
            ng.c r1 = new ng.c
            r1.<init>(r2, r0)
            return r1
    }

    public static ng.i T(ng.j r2, fg.l r3) {
            r3.getClass()
            ng.i r0 = new ng.i
            r1 = 1
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static java.lang.Object U(ng.j r1) {
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object r1 = r1.next()
            return r1
    }

    public static java.lang.String V(ng.j r4, java.lang.String r5, fg.l r6, int r7) {
            r7 = r7 & 32
            if (r7 == 0) goto L5
            r6 = 0
        L5:
            r4.getClass()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = ""
            r7.append(r0)
            java.util.Iterator r4 = r4.iterator()
            r1 = 0
        L17:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r4.next()
            r3 = 1
            int r1 = r1 + r3
            if (r1 <= r3) goto L28
            r7.append(r5)
        L28:
            ac.p.f(r7, r2, r6)
            goto L17
        L2c:
            r7.append(r0)
            java.lang.String r4 = r7.toString()
            return r4
    }

    public static ng.t W(ng.j r1, fg.l r2) {
            r1.getClass()
            r2.getClass()
            ng.t r0 = new ng.t
            r0.<init>(r1, r2)
            return r0
    }

    public static ng.i X(ng.j r2, fg.l r3) {
            ng.t r0 = new ng.t
            r0.<init>(r2, r3)
            i2.z r2 = new i2.z
            r3 = 29
            r2.<init>(r3)
            ng.i r3 = new ng.i
            r1 = 0
            r3.<init>(r0, r1, r2)
            return r3
    }

    public static dg.j Y(ng.j r3, dg.n r4) {
            r0 = 2
            ng.j[] r0 = new ng.j[r0]
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r0[r3] = r4
            ng.j r3 = tf.l.k0(r0)
            i2.z r4 = new i2.z
            r0 = 28
            r4.<init>(r0)
            boolean r0 = r3 instanceof ng.t
            if (r0 == 0) goto L24
            ng.t r3 = (ng.t) r3
            dg.j r0 = new dg.j
            ng.j r1 = r3.f9459a
            fg.l r3 = r3.f9460b
            r0.<init>(r1, r3, r4)
            return r0
        L24:
            dg.j r0 = new dg.j
            r9.p r1 = new r9.p
            r2 = 11
            r1.<init>(r2)
            r0.<init>(r3, r1, r4)
            return r0
    }

    public static ng.j Z(ng.j r2, int r3) {
            if (r3 < 0) goto L19
            if (r3 != 0) goto L7
            ng.g r2 = ng.g.f9436a
            return r2
        L7:
            boolean r0 = r2 instanceof ng.f
            if (r0 == 0) goto L12
            ng.f r2 = (ng.f) r2
            ng.j r2 = r2.a(r3)
            return r2
        L12:
            ng.e r0 = new ng.e
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
        L19:
            java.lang.String r2 = "Requested element count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r2 = eh.a.m(r3, r2, r0)
            j8.o.q(r2)
            r2 = 0
            return r2
    }

    public static void a0(ng.j r1, java.util.AbstractCollection r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L4
        L12:
            return
    }

    public static java.util.List b0(ng.j r2) {
            r2.getClass()
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L10
            tf.t r2 = tf.t.f13167g
            return r2
        L10:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1f
            java.util.List r2 = a.a.x0(r0)
            return r2
        L1f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L27
        L35:
            return r1
    }

    public static java.util.Set c0(ng.j r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Ld
            tf.v r2 = tf.v.f13169g
            return r2
        Ld:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1c
            java.util.Set r2 = ac.p.N(r0)
            return r2
        L1c:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r1.add(r0)
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L24
        L32:
            return r1
    }
}
