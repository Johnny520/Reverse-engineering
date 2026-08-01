package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛴᛲᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0646 extends xhss.AbstractC0060 {
    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public static java.util.List m1132(xhss.InterfaceC0966 r2) {
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto Ld
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
            return r2
        Ld:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1c
            java.util.List r2 = java.util.Collections.singletonList(r0)
            return r2
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
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
