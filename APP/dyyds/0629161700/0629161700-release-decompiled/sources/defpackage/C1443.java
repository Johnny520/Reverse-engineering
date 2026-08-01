package defpackage;

/* JADX INFO: renamed from: ᛸᛲᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1443 extends defpackage.AbstractC1450 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ byte[] f6340;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6341;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1237 f6342;

    public C1443(defpackage.C1237 r1, int r2, byte[] r3) {
            r0 = this;
            r0.<init>()
            r0.f6342 = r1
            r0.f6341 = r2
            r0.f6340 = r3
            return
    }

    @Override // defpackage.AbstractC1450
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo2650(defpackage.C1037 r3) {
            r2 = this;
            boolean r0 = r3.f4610
            if (r0 != 0) goto L11
            ᛸᲁᛵ r0 = r3.f4611
            int r1 = r2.f6341
            byte[] r2 = r2.f6340
            r0.m2845(r1, r2)
            r3.m1998()
            return
        L11:
            java.lang.String r2 = "closed"
            defpackage.C2264.m3676(r2)
            return
    }

    @Override // defpackage.AbstractC1450
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long mo2651() {
            r2 = this;
            int r2 = r2.f6341
            long r0 = (long) r2
            return r0
    }

    @Override // defpackage.AbstractC1450
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1237 mo2652() {
            r0 = this;
            ᛷᛳᛱᛳ r0 = r0.f6342
            return r0
    }
}
