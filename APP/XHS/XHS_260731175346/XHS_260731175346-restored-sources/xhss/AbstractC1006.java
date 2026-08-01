package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛱᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1006 {
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static java.lang.String m1648(java.lang.Object r2) {
            boolean r0 = r2 instanceof xhss.AbstractC1006
            if (r0 == 0) goto L5
            goto L37
        L5:
            boolean r0 = r2 instanceof java.lang.Class
            java.lang.Class<xhss.ᲇᛱᲁᛸ> r1 = xhss.AbstractC1006.class
            if (r0 == 0) goto L24
            xhss.ᛱᛸᛷᛸ r0 = xhss.AbstractC0256.m565(r1)
            java.lang.Class r0 = xhss.C0614.m1075(r0)
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
            boolean r0 = r2 instanceof xhss.C0078
            if (r0 == 0) goto L3a
            xhss.ᛱᛸᛷᛸ r0 = xhss.AbstractC0256.m565(r1)
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
            int r1 = xhss.AbstractC0249.m554(r2)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L5e
            java.lang.String r1 = m1648(r1)
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
