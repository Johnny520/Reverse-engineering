package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲁᛶᛳ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0905 extends xhss.AbstractC0485 {
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public static java.util.Set m1461(xhss.C1197 r3, java.util.Set r4) {
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Set r3 = xhss.AbstractC0713.m1245(r3)
            return r3
        Lb:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto L36
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L18:
            r1 = r3
            xhss.ᛵᛶᛲᛵ r1 = (xhss.AbstractC0479) r1
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L35
            r1 = r3
            xhss.ᲈᛴᲈᛵ r1 = (xhss.C1139) r1
            java.lang.Object r1 = r1.next()
            r2 = r4
            java.util.Set r2 = (java.util.Set) r2
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L18
            r0.add(r1)
            goto L18
        L35:
            return r0
        L36:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r3)
            r0.removeAll(r4)
            return r0
    }
}
