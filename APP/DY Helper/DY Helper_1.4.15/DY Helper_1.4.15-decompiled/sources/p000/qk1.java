package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements p000.InterfaceC1053zc {

    /* JADX INFO: renamed from: ε */
    public final p000.iw1 f9028;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0793sc f9029;

    /* JADX INFO: renamed from: η */
    public boolean f9030;

    public qk1(p000.iw1 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9028 = r1
            sc r1 = new sc
            r1.<init>()
            r0.f9029 = r1
            return
    }

    @Override // p000.iw1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            iw1 r0 = r6.f9028
            boolean r1 = r6.f9030
            if (r1 != 0) goto L26
            sc r1 = r6.f9029     // Catch: java.lang.Throwable -> L14
            long r2 = r1.f9828     // Catch: java.lang.Throwable -> L14
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L16
            r0.mo2507(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L17
        L16:
            r1 = 0
        L17:
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            if (r1 != 0) goto L1f
            r1 = r0
        L1f:
            r0 = 1
            r6.f9030 = r0
            if (r1 != 0) goto L25
            goto L26
        L25:
            throw r1
        L26:
            return
    }

    @Override // p000.InterfaceC1053zc, p000.iw1, java.io.Flushable
    public final void flush() {
            r5 = this;
            boolean r0 = r5.f9030
            if (r0 != 0) goto L17
            sc r0 = r5.f9029
            long r1 = r0.f9828
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            iw1 r5 = r5.f9028
            if (r3 <= 0) goto L13
            r5.mo2507(r1, r0)
        L13:
            r5.flush()
            return
        L17:
            java.lang.String r5 = "closed"
            p000.C1080.m7279(r5)
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.f9030
            r0 = r0 ^ 1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            iw1 r2 = r2.f9028
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.f9030
            if (r0 != 0) goto L11
            sc r0 = r1.f9029
            int r2 = r0.write(r2)
            r1.m4892()
            return r2
        L11:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC1053zc
    public final p000.InterfaceC1053zc write(byte[] r3) {
            r2 = this;
            boolean r0 = r2.f9030
            if (r0 != 0) goto Le
            sc r0 = r2.f9029
            int r1 = r3.length
            r0.m5464(r3, r1)
            r2.m4892()
            return r2
        Le:
            java.lang.String r2 = "closed"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    @Override // p000.InterfaceC1053zc
    public final p000.InterfaceC1053zc writeByte(int r2) {
            r1 = this;
            boolean r0 = r1.f9030
            if (r0 != 0) goto Ld
            sc r0 = r1.f9029
            r0.m5466(r2)
            r1.m4892()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC1053zc
    public final p000.InterfaceC1053zc writeInt(int r2) {
            r1 = this;
            boolean r0 = r1.f9030
            if (r0 != 0) goto Ld
            sc r0 = r1.f9029
            r0.m5448(r2)
            r1.m4892()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC1053zc
    public final p000.InterfaceC1053zc writeShort(int r2) {
            r1 = this;
            boolean r0 = r1.f9030
            if (r0 != 0) goto Ld
            sc r0 = r1.f9029
            r0.m5449(r2)
            r1.m4892()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2505() {
            r0 = this;
            iw1 r0 = r0.f9028
            m42 r0 = r0.mo2505()
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final p000.InterfaceC1053zc m4892() {
            r8 = this;
            boolean r0 = r8.f9030
            if (r0 != 0) goto L33
            sc r0 = r8.f9029
            long r1 = r0.f9828
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            r1 = r3
            goto L29
        L10:
            rr1 r5 = r0.f9827
            r5.getClass()
            rr1 r5 = r5.f9477
            r5.getClass()
            int r6 = r5.f9473
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 >= r7) goto L29
            boolean r7 = r5.f9475
            if (r7 == 0) goto L29
            int r5 = r5.f9472
            int r6 = r6 - r5
            long r5 = (long) r6
            long r1 = r1 - r5
        L29:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L32
            iw1 r3 = r8.f9028
            r3.mo2507(r1, r0)
        L32:
            return r8
        L33:
            java.lang.String r8 = "closed"
            p000.C1080.m7279(r8)
            r8 = 0
            return r8
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r2, p000.C0793sc r4) {
            r1 = this;
            r4.getClass()
            boolean r0 = r1.f9030
            if (r0 != 0) goto L10
            sc r0 = r1.f9029
            r0.mo2507(r2, r4)
            r1.m4892()
            return
        L10:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            return
    }

    @Override // p000.InterfaceC1053zc
    /* JADX INFO: renamed from: ν */
    public final p000.InterfaceC1053zc mo4893(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.f9030
            if (r0 != 0) goto Ld
            sc r0 = r1.f9029
            r0.m5451(r2)
            r1.m4892()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC1053zc
    /* JADX INFO: renamed from: ο */
    public final p000.InterfaceC1053zc mo4894(p000.C0208dd r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.f9030
            if (r0 != 0) goto L10
            sc r0 = r1.f9029
            r0.m5463(r2)
            r1.m4892()
            return r1
        L10:
            java.lang.String r1 = "closed"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }
}
