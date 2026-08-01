package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛷᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1052 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0489 f3379 = null;

    static {
            xhss.ᛴᛲᛴᛶ r0 = new xhss.ᛴᛲᛴᛶ
            r0.<init>()
            xhss.ᛳᛶᲈᲈ r1 = xhss.C0289.f1117
            r0.m687(r1)
            byte[] r1 = r1.f1118
            int r1 = r1.length
            long r1 = (long) r1
            xhss.ᛵᛷᛳᲀ r3 = new xhss.ᛵᛷᛳᲀ
            r3.<init>(r1, r0)
            xhss.AbstractC1052.f3379 = r3
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            xhss.ᲀᛶᛷᛳ r0 = r0.mo720()
            xhss.AbstractC0577.m1041(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final byte[] m1712() {
            r6 = this;
            long r0 = r6.mo719()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L5a
            xhss.ᲀᛶᛷᛳ r6 = r6.mo720()
            r2 = 0
            byte[] r3 = r6.mo704()     // Catch: java.lang.Throwable -> L1d
            r6.close()     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r2 = move-exception
        L19:
            r5 = r3
            r3 = r2
            r2 = r5
            goto L28
        L1d:
            r3 = move-exception
            if (r6 == 0) goto L28
            r6.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r6 = move-exception
            xhss.AbstractC1178.m1874(r3, r6)
        L28:
            if (r3 != 0) goto L59
            int r6 = r2.length
            r3 = -1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L58
            long r3 = (long) r6
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L37
            goto L58
        L37:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Content-Length ("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = ") disagree"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
        L58:
            return r2
        L59:
            throw r3
        L5a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            throw r6
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public abstract long mo719();

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public abstract xhss.InterfaceC0870 mo720();

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public abstract xhss.C0034 mo721();
}
