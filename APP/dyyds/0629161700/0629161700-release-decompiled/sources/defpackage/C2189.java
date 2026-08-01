package defpackage;

/* JADX INFO: renamed from: ᲈᛲᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2189 implements defpackage.InterfaceC1711 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1711 f9282;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1711 f9283;

    public C2189(defpackage.InterfaceC1711 r1, defpackage.InterfaceC1711 r2) {
            r0 = this;
            r0.<init>()
            r0.f9283 = r1
            r0.f9282 = r2
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.C2189
            r1 = 0
            if (r0 == 0) goto L1d
            ᲈᛲᛴᲀ r4 = (defpackage.C2189) r4
            ᲀᛷᛶᲈ r0 = r3.f9283
            ᲀᛷᛶᲈ r2 = r4.f9283
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            ᲀᛷᛶᲈ r3 = r3.f9282
            ᲀᛷᛶᲈ r4 = r4.f9282
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1d
            r3 = 1
            return r3
        L1d:
            return r1
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r1 = this;
            ᲀᛷᛶᲈ r0 = r1.f9283
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ᲀᛷᛶᲈ r1 = r1.f9282
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DataCacheKey{sourceKey="
            r0.<init>(r1)
            ᲀᛷᛶᲈ r1 = r2.f9283
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            ᲀᛷᛶᲈ r2 = r2.f9282
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r2) {
            r1 = this;
            ᲀᛷᛶᲈ r0 = r1.f9283
            r0.mo1225(r2)
            ᲀᛷᛶᲈ r1 = r1.f9282
            r1.mo1225(r2)
            return
    }
}
