package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲀᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0086 extends xhss.AbstractC0473 {
    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public static int m243(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public static void m244() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public static java.util.List m245(java.lang.Object... r1) {
            int r0 = r1.length
            if (r0 <= 0) goto L8
            java.util.List r1 = java.util.Arrays.asList(r1)
            return r1
        L8:
            xhss.ᛵᛷᛶᛱ r1 = xhss.C0492.f1802
            return r1
    }
}
