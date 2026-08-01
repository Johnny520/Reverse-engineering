package defpackage;

/* JADX INFO: renamed from: ᛸᲈᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1607 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.logging.Logger f7103 = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.AbstractC1607.f7103 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final boolean m2906(java.lang.AssertionError r2) {
            java.lang.Throwable r0 = r2.getCause()
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L14
            java.lang.String r0 = "getsockname failed"
            boolean r2 = defpackage.AbstractC1347.m2500(r2, r0, r1)
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
