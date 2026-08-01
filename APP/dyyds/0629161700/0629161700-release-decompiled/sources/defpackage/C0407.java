package defpackage;

/* JADX INFO: renamed from: ᛳᛱᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0407 extends defpackage.AbstractC0330 {
    @Override // defpackage.AbstractC0330
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Object mo707(java.lang.Class r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot allocate "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }
}
