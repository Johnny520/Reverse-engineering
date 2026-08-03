package s6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static java.lang.String a(java.lang.Object r2) {
            boolean r0 = r2 instanceof s6.b
            if (r0 == 0) goto L5
            goto L37
        L5:
            boolean r0 = r2 instanceof java.lang.Class
            java.lang.Class<s6.b> r1 = s6.b.class
            if (r0 == 0) goto L24
            gg.f r0 = gg.v.a(r1)
            java.lang.Class r0 = a.a.a0(r0)
            if (r0 != 0) goto L16
            goto L17
        L16:
            r1 = r0
        L17:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L37
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.toString()
            return r2
        L24:
            boolean r0 = r2 instanceof mg.b
            if (r0 == 0) goto L3a
            gg.f r0 = gg.v.a(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L37
            java.lang.String r2 = r2.toString()
            return r2
        L37:
            java.lang.String r2 = "VagueType"
            return r2
        L3a:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L68
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r2)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L5e
            java.lang.String r1 = a(r1)
            goto L5f
        L5e:
            r1 = 0
        L5f:
            r0.add(r1)
            goto L4d
        L63:
            java.lang.String r2 = r0.toString()
            return r2
        L68:
            java.lang.String r2 = r2.toString()
            return r2
    }
}
