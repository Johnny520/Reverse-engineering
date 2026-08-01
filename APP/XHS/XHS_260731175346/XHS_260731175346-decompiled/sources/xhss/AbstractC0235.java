package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛱᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.util.logging.Logger f900 = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            xhss.AbstractC0235.f900 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final boolean m540(java.lang.AssertionError r2) {
            java.lang.Throwable r0 = r2.getCause()
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L14
            java.lang.String r0 = "getsockname failed"
            boolean r2 = xhss.AbstractC0120.m339(r2, r0, r1)
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L19
            r2 = 1
            return r2
        L19:
            return r1
    }
}
