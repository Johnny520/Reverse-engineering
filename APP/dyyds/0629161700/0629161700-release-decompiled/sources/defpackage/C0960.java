package defpackage;

/* JADX INFO: renamed from: ᛵᲀᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0960 extends java.lang.Error {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Exception f4267;

    public C0960(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f4267 = r2
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = super.getMessage()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Exception r1 = r1.f4267
            if (r1 == 0) goto L1a
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L1a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.toString()
            return r1
        L1a:
            return r0
    }
}
