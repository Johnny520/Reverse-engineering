package defpackage;

/* JADX INFO: renamed from: ᛳᛶᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0494 extends java.io.IOException {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f2438;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f2439;

    public C0494(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f2439 = r2
            r0.f2438 = r3
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = super.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " ("
            r1.append(r0)
            int r0 = r2.f2439
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r2 = r2.f2438
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }
}
