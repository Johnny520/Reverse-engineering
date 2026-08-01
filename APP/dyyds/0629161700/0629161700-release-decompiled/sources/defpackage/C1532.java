package defpackage;

/* JADX INFO: renamed from: ᛸᛷᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1532 implements defpackage.InterfaceC1644 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1644 f6752;

    public C1532(defpackage.AbstractC2000 r1) {
            r0 = this;
            r0.<init>()
            r0.f6752 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            ᲀᛳᛴᛵ r2 = r2.f6752
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "("
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = "[?"
            java.lang.String r1 = "]"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r2, r1)
            return r2
        L17:
            java.lang.String r0 = "[?("
            java.lang.String r1 = ")]"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r0, r2, r1)
            return r2
    }

    @Override // defpackage.InterfaceC1644
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo837(defpackage.C1412 r1) {
            r0 = this;
            ᲀᛳᛴᛵ r0 = r0.f6752
            boolean r0 = r0.mo837(r1)
            return r0
    }
}
