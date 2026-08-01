package defpackage;

/* JADX INFO: renamed from: ᲁᲈᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1969 implements defpackage.InterfaceC1111 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Class f8545;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0325 f8546;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f8547;

    public C1969(defpackage.C0325 r1) {
            r0 = this;
            r0.<init>()
            r0.f8546 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.C1969
            r1 = 0
            if (r0 == 0) goto L15
            ᲁᲈᛸᛵ r4 = (defpackage.C1969) r4
            int r0 = r3.f8547
            int r2 = r4.f8547
            if (r0 != r2) goto L15
            java.lang.Class r3 = r3.f8545
            java.lang.Class r4 = r4.f8545
            if (r3 != r4) goto L15
            r3 = 1
            return r3
        L15:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f8547
            int r0 = r0 * 31
            java.lang.Class r1 = r1.f8545
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key{size="
            r0.<init>(r1)
            int r1 = r2.f8547
            r0.append(r1)
            java.lang.String r1 = "array="
            r0.append(r1)
            java.lang.Class r2 = r2.f8545
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1111
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo2131() {
            r1 = this;
            ᛲᛷᲀᛷ r0 = r1.f8546
            r0.m3106(r1)
            return
    }
}
