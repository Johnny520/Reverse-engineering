package tf;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 extends ac.p {
    public static java.util.LinkedHashSet R(java.lang.Object... r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = tf.y.a0(r1)
            r0.<init>(r1)
            tf.l.J0(r2, r0)
            return r0
    }

    public static java.util.LinkedHashSet S(java.util.Set r6, java.lang.Object r7) {
            r6.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r6.size()
            int r1 = tf.y.a0(r1)
            r0.<init>(r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
            r2 = r1
        L18:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r6.next()
            r4 = 1
            if (r2 != 0) goto L2d
            boolean r5 = gg.l.a(r3, r7)
            if (r5 == 0) goto L2d
            r2 = r4
            r4 = r1
        L2d:
            if (r4 == 0) goto L18
            r0.add(r3)
            goto L18
        L33:
            return r0
    }

    public static java.util.Set T(java.util.Set r3, java.lang.Iterable r4) {
            r3.getClass()
            r4.getClass()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            java.util.Collection r4 = (java.util.Collection) r4
            goto L11
        Ld:
            java.util.List r4 = tf.m.P1(r4)
        L11:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L1e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = tf.m.U1(r3)
            return r3
        L1e:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L45
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r3.next()
            r2 = r4
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L2d
            r0.add(r1)
            goto L2d
        L44:
            return r0
        L45:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3)
            r0.removeAll(r4)
            return r0
    }

    public static java.util.LinkedHashSet U(java.util.Set r2, java.lang.Iterable r3) {
            r2.getClass()
            r3.getClass()
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L16
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            int r1 = r2.size()
            int r1 = r1 + r0
            goto L29
        L23:
            int r0 = r2.size()
            int r1 = r0 * 2
        L29:
            int r0 = tf.y.a0(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            tf.r.h1(r1, r3)
            return r1
    }

    public static java.util.LinkedHashSet V(java.util.Set r2, java.lang.Object r3) {
            r2.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 + 1
            int r1 = tf.y.a0(r1)
            r0.<init>(r1)
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            r0.add(r3)
            return r0
    }

    public static java.util.Set W(java.lang.Object... r2) {
            int r0 = r2.length
            if (r0 == 0) goto L1c
            r1 = 1
            if (r0 == r1) goto L14
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = tf.y.a0(r1)
            r0.<init>(r1)
            tf.l.J0(r2, r0)
            return r0
        L14:
            r0 = 0
            r2 = r2[r0]
            java.util.Set r2 = ac.p.N(r2)
            return r2
        L1c:
            tf.v r2 = tf.v.f13169g
            return r2
    }
}
