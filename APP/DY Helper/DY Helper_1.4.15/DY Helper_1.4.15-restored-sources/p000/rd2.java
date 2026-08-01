package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class rd2 {

    /* JADX INFO: renamed from: α */
    public static final java.util.logging.Logger f9350 = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p000.rd2.f9350 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m5080(java.lang.AssertionError r2) {
            java.lang.Throwable r0 = r2.getCause()
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L14
            java.lang.String r0 = "getsockname failed"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
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
