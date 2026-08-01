package defpackage;

/* JADX INFO: renamed from: ᛷᛷᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1321 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.util.logging.Logger f5839 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.net.URI f5840;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f5841;

    static {
            java.lang.Class<ᛷᛷᲈᛶ> r0 = defpackage.C1321.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.C1321.f5839 = r0
            return
    }

    public C1321(com.thegrizzlylabs.sardineandroid.model.Response r3) {
            r2 = this;
            r2.<init>()
            java.net.URI r0 = new java.net.URI
            java.lang.String r1 = r3.getHref()
            r0.<init>(r1)
            r2.f5840 = r0
            java.lang.String r0 = r3.getStatus()
            if (r0 == 0) goto L2e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            goto L2e
        L1b:
            java.lang.String r1 = r3.getStatus()     // Catch: java.io.IOException -> L23
            defpackage.AbstractC0209.m769(r1)     // Catch: java.io.IOException -> L23
            goto L2e
        L23:
            java.lang.String r1 = "Failed to parse status line: "
            java.lang.String r0 = r1.concat(r0)
            java.util.logging.Logger r1 = defpackage.C1321.f5839
            r1.warning(r0)
        L2e:
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r0.<init>(r2, r3)
            r2.f5841 = r0
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.net.URI r0 = r0.f5840
            java.lang.String r0 = r0.getPath()
            return r0
    }
}
