package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛱᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final long[] f138 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final byte[] f139 = null;

    static {
            java.lang.String r0 = "0123456789abcdef"
            java.nio.charset.Charset r1 = xhss.AbstractC0619.f2136
            byte[] r0 = r0.getBytes(r1)
            xhss.AbstractC0003.f139 = r0
            r0 = 20
            long[] r0 = new long[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999, 99999999999, 999999999999, 9999999999999, 99999999999999, 999999999999999, 9999999999999999, 99999999999999999, 999999999999999999, 9223372036854775807} // fill-array
            xhss.AbstractC0003.f138 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.String m91(long r6, xhss.C0338 r8) {
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L1e
            long r3 = r6 - r1
            byte r0 = r8.m689(r3)
            r5 = 13
            if (r0 != r5) goto L1e
            java.nio.charset.Charset r6 = xhss.AbstractC0619.f2136
            java.lang.String r6 = r8.m690(r3, r6)
            r0 = 2
            r8.m696(r0)
            return r6
        L1e:
            java.nio.charset.Charset r0 = xhss.AbstractC0619.f2136
            java.lang.String r6 = r8.m690(r6, r0)
            r8.m696(r1)
            return r6
    }
}
