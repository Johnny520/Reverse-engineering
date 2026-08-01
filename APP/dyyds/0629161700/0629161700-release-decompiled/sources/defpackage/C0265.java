package defpackage;

/* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0265 implements defpackage.InterfaceC1152 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC1152 f1525;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f1526;

    public C0265(defpackage.InterfaceC1152 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f1525 = r1
            r0.f1526 = r2
            if (r2 < 0) goto La
            return
        La:
            java.lang.String r0 = "count must be non-negative, but was "
            r1 = 46
            defpackage.C2264.m3686(r0, r2, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.InterfaceC1152
    public final java.util.Iterator iterator() {
            r1 = this;
            ᛶᛷᛱᲀ r0 = new ᛶᛷᛱᲀ
            r0.<init>(r1)
            return r0
    }
}
