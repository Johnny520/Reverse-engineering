package defpackage;

/* JADX INFO: renamed from: ᲀᛸᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1726 implements defpackage.InterfaceC1111 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.graphics.Bitmap.Config f7646;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0325 f7647;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f7648;

    public C1726(defpackage.C0325 r1) {
            r0 = this;
            r0.<init>()
            r0.f7647 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.C1726
            r1 = 0
            if (r0 == 0) goto L19
            ᲀᛸᲀᛴ r4 = (defpackage.C1726) r4
            int r0 = r3.f7648
            int r2 = r4.f7648
            if (r0 != r2) goto L19
            android.graphics.Bitmap$Config r3 = r3.f7646
            android.graphics.Bitmap$Config r4 = r4.f7646
            boolean r3 = defpackage.AbstractC1754.m3144(r3, r4)
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f7648
            int r0 = r0 * 31
            android.graphics.Bitmap$Config r1 = r1.f7646
            if (r1 == 0) goto Ld
            int r1 = r1.hashCode()
            goto Le
        Ld:
            r1 = 0
        Le:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f7648
            android.graphics.Bitmap$Config r1 = r1.f7646
            java.lang.String r1 = defpackage.C1366.m2535(r0, r1)
            return r1
    }

    @Override // defpackage.InterfaceC1111
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo2131() {
            r1 = this;
            ᛲᛷᲀᛷ r0 = r1.f7647
            r0.m3106(r1)
            return
    }
}
