package defpackage;

/* JADX INFO: renamed from: ᛳᛸᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0533 implements defpackage.InterfaceC1711 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0619 f2651;

    public C0533() {
            r2 = this;
            r2.<init>()
            ᛴᛱᲇᛵ r0 = new ᛴᛱᲇᛵ
            r1 = 0
            r0.<init>(r1)
            r2.f2651 = r0
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0533
            if (r0 == 0) goto Lf
            ᛳᛸᲁᛶ r2 = (defpackage.C0533) r2
            ᛴᛱᲇᛵ r1 = r1.f2651
            ᛴᛱᲇᛵ r2 = r2.f2651
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            ᛴᛱᲇᛵ r0 = r0.f2651
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Options{values="
            r0.<init>(r1)
            ᛴᛱᲇᛵ r2 = r2.f2651
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m1326(defpackage.C0980 r2) {
            r1 = this;
            ᛴᛱᲇᛵ r1 = r1.f2651
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto Ld
            java.lang.Object r1 = r1.get(r2)
            return r1
        Ld:
            java.lang.Object r1 = r2.f4393
            return r1
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r7) {
            r6 = this;
            r0 = 0
        L1:
            ᛴᛱᲇᛵ r1 = r6.f2651
            int r2 = r1.f6994
            if (r0 >= r2) goto L2b
            java.lang.Object r1 = r1.m2865(r0)
            ᛵᲇᛳᲇ r1 = (defpackage.C0980) r1
            ᛴᛱᲇᛵ r2 = r6.f2651
            java.lang.Object r2 = r2.m2863(r0)
            ᛳᛴᲈᛳ r3 = r1.f4394
            byte[] r4 = r1.f4391
            if (r4 != 0) goto L23
            java.lang.String r4 = r1.f4392
            java.nio.charset.Charset r5 = defpackage.InterfaceC1711.f7614
            byte[] r4 = r4.getBytes(r5)
            r1.f4391 = r4
        L23:
            byte[] r1 = r1.f4391
            r3.mo661(r1, r2, r7)
            int r0 = r0 + 1
            goto L1
        L2b:
            return
    }
}
