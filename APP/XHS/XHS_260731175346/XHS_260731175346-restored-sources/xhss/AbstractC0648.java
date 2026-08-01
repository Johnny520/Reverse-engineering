package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0648 extends xhss.AbstractC0671 {
    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public static void m1133(java.util.ArrayList r1, java.lang.Iterable r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto La
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            return
        La:
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto Le
        L1c:
            return
    }
}
