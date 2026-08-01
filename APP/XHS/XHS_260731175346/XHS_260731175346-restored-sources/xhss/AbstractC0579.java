package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛸᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0579 {
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static boolean m1050() {
            org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
            if (r0 != 0) goto L7
            goto L2a
        L7:
            int r1 = r0.major()
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L16
            int r0 = r0.major()
            if (r0 <= r2) goto L2a
            goto L29
        L16:
            int r1 = r0.minor()
            if (r1 == r3) goto L23
            int r0 = r0.minor()
            if (r0 <= r3) goto L2a
            goto L29
        L23:
            int r0 = r0.patch()
            if (r0 < 0) goto L2a
        L29:
            return r3
        L2a:
            r0 = 0
            return r0
    }
}
