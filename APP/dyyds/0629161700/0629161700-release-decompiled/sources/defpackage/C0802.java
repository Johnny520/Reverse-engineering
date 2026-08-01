package defpackage;

/* JADX INFO: renamed from: ᛴᲈᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0802 implements defpackage.InterfaceC1711 {

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final defpackage.C0763 f3702 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0533 f3703;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC0660 f3704;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f3705;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC1711 f3706;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1711 f3707;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2063 f3708;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f3709;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Class f3710;

    static {
            ᛴᲁᛳᛴ r0 = new ᛴᲁᛳᛴ
            r1 = 50
            r0.<init>(r1)
            defpackage.C0802.f3702 = r0
            return
    }

    public C0802(defpackage.C2063 r1, defpackage.InterfaceC1711 r2, defpackage.InterfaceC1711 r3, int r4, int r5, defpackage.InterfaceC0660 r6, java.lang.Class r7, defpackage.C0533 r8) {
            r0 = this;
            r0.<init>()
            r0.f3708 = r1
            r0.f3707 = r2
            r0.f3706 = r3
            r0.f3705 = r4
            r0.f3709 = r5
            r0.f3704 = r6
            r0.f3710 = r7
            r0.f3703 = r8
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.C0802
            r1 = 0
            if (r0 == 0) goto L47
            ᛴᲈᲇᛶ r4 = (defpackage.C0802) r4
            int r0 = r3.f3709
            int r2 = r4.f3709
            if (r0 != r2) goto L47
            int r0 = r3.f3705
            int r2 = r4.f3705
            if (r0 != r2) goto L47
            ᛴᛴᲀᛶ r0 = r3.f3704
            ᛴᛴᲀᛶ r2 = r4.f3704
            boolean r0 = defpackage.AbstractC1754.m3144(r0, r2)
            if (r0 == 0) goto L47
            java.lang.Class r0 = r3.f3710
            java.lang.Class r2 = r4.f3710
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L47
            ᲀᛷᛶᲈ r0 = r3.f3707
            ᲀᛷᛶᲈ r2 = r4.f3707
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L47
            ᲀᛷᛶᲈ r0 = r3.f3706
            ᲀᛷᛶᲈ r2 = r4.f3706
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L47
            ᛳᛸᲁᛶ r3 = r3.f3703
            ᛳᛸᲁᛶ r4 = r4.f3703
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L47
            r3 = 1
            return r3
        L47:
            return r1
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r2 = this;
            ᲀᛷᛶᲈ r0 = r2.f3707
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ᲀᛷᛶᲈ r1 = r2.f3706
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f3705
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f3709
            int r1 = r1 + r0
            ᛴᛴᲀᛶ r0 = r2.f3704
            if (r0 == 0) goto L24
            int r1 = r1 * 31
            int r0 = r0.hashCode()
            int r1 = r1 + r0
        L24:
            int r1 = r1 * 31
            java.lang.Class r0 = r2.f3710
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            ᛳᛸᲁᛶ r2 = r2.f3703
            ᛴᛱᲇᛵ r2 = r2.f2651
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResourceCacheKey{sourceKey="
            r0.<init>(r1)
            ᲀᛷᛶᲈ r1 = r2.f3707
            r0.append(r1)
            java.lang.String r1 = ", signature="
            r0.append(r1)
            ᲀᛷᛶᲈ r1 = r2.f3706
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.f3705
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.f3709
            r0.append(r1)
            java.lang.String r1 = ", decodedResourceClass="
            r0.append(r1)
            java.lang.Class r1 = r2.f3710
            r0.append(r1)
            java.lang.String r1 = ", transformation='"
            r0.append(r1)
            ᛴᛴᲀᛶ r1 = r2.f3704
            r0.append(r1)
            java.lang.String r1 = "', options="
            r0.append(r1)
            ᛳᛸᲁᛶ r2 = r2.f3703
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r6) {
            r5 = this;
            ᲇᛶᛳᛱ r0 = r5.f3708
            java.lang.Class<byte[]> r1 = byte[].class
            monitor-enter(r0)
            ᛲᛷᲀᛷ r2 = r0.f8869     // Catch: java.lang.Throwable -> L74
            java.lang.Object r3 = r2.f7642     // Catch: java.lang.Throwable -> L74
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L74
            ᛶᛷᛶᛵ r3 = (defpackage.InterfaceC1111) r3     // Catch: java.lang.Throwable -> L74
            if (r3 != 0) goto L17
            ᛶᛷᛶᛵ r3 = r2.m998()     // Catch: java.lang.Throwable -> L74
        L17:
            ᲁᲈᛸᛵ r3 = (defpackage.C1969) r3     // Catch: java.lang.Throwable -> L74
            r2 = 8
            r3.f8547 = r2     // Catch: java.lang.Throwable -> L74
            r3.f8545 = r1     // Catch: java.lang.Throwable -> L74
            java.lang.Object r1 = r0.m3462(r3, r1)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r0)
            byte[] r1 = (byte[]) r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
            int r2 = r5.f3705
            java.nio.ByteBuffer r0 = r0.putInt(r2)
            int r2 = r5.f3709
            java.nio.ByteBuffer r0 = r0.putInt(r2)
            r0.array()
            ᲀᛷᛶᲈ r0 = r5.f3706
            r0.mo1225(r6)
            ᲀᛷᛶᲈ r0 = r5.f3707
            r0.mo1225(r6)
            r6.update(r1)
            ᛴᛴᲀᛶ r0 = r5.f3704
            if (r0 == 0) goto L4d
            r0.mo1225(r6)
        L4d:
            ᛳᛸᲁᛶ r0 = r5.f3703
            r0.mo1225(r6)
            ᛴᲁᛳᛴ r0 = defpackage.C0802.f3702
            java.lang.Class r2 = r5.f3710
            java.lang.Object r3 = r0.m1693(r2)
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L6b
            java.lang.String r3 = r2.getName()
            java.nio.charset.Charset r4 = defpackage.InterfaceC1711.f7614
            byte[] r3 = r3.getBytes(r4)
            r0.m1692(r2, r3)
        L6b:
            r6.update(r3)
            ᲇᛶᛳᛱ r5 = r5.f3708
            r5.m3468(r1)
            return
        L74:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            throw r5
    }
}
