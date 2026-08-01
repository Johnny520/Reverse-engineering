package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0138 implements defpackage.InterfaceC0590, defpackage.InterfaceC0565, defpackage.InterfaceC0468 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.nio.ByteBuffer f1085;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1086;

    public C0138(int r1) {
            r0 = this;
            r0.f1086 = r1
            switch(r1) {
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.f1085 = r1
            return
        L11:
            r0.<init>()
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r0.f1085 = r1
            return
    }

    public C0138(java.nio.ByteBuffer r1, int r2) {
            r0 = this;
            r0.f1086 = r2
            switch(r2) {
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.f1085 = r1
            return
        Lb:
            r0.<init>()
            r0.f1085 = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r0)
            return
    }

    @Override // defpackage.InterfaceC0565
    public long skip(long r3) {
            r2 = this;
            java.nio.ByteBuffer r2 = r2.f1085
            int r0 = r2.remaining()
            long r0 = (long) r0
            long r3 = java.lang.Math.min(r0, r3)
            int r3 = (int) r3
            int r4 = r2.position()
            int r4 = r4 + r3
            r2.position(r4)
            long r2 = (long) r3
            return r2
    }

    @Override // defpackage.InterfaceC0565
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public short mo658() {
            r2 = this;
            java.nio.ByteBuffer r2 = r2.f1085
            int r0 = r2.remaining()
            r1 = 1
            if (r0 < r1) goto L11
            byte r2 = r2.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            return r2
        L11:
            ᛱᲇᛷ r2 = new ᛱᲇᛷ
            r2.<init>()
            throw r2
    }

    @Override // defpackage.InterfaceC0590
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public java.lang.Object mo229() {
            r1 = this;
            r0 = 0
            java.nio.ByteBuffer r1 = r1.f1085
            r1.position(r0)
            return r1
    }

    @Override // defpackage.InterfaceC0565
    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int mo659(int r2, byte[] r3) {
            r1 = this;
            java.nio.ByteBuffer r1 = r1.f1085
            int r0 = r1.remaining()
            int r2 = java.lang.Math.min(r2, r0)
            if (r2 != 0) goto Le
            r1 = -1
            return r1
        Le:
            r0 = 0
            r1.get(r3, r0, r2)
            return r2
    }

    @Override // defpackage.InterfaceC0590
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo230() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC0565
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int mo660() {
            r1 = this;
            short r0 = r1.mo658()
            int r0 = r0 << 8
            short r1 = r1.mo658()
            r1 = r1 | r0
            return r1
    }

    @Override // defpackage.InterfaceC0468
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo661(byte[] r3, java.lang.Object r4, java.security.MessageDigest r5) {
            r2 = this;
            int r0 = r2.f1086
            r1 = 0
            switch(r0) {
                case 2: goto L2c;
                default: goto L6;
            }
        L6:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto Lb
            goto L28
        Lb:
            r5.update(r3)
            java.nio.ByteBuffer r0 = r2.f1085
            monitor-enter(r0)
            java.nio.ByteBuffer r3 = r2.f1085     // Catch: java.lang.Throwable -> L29
            r3.position(r1)     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r2 = r2.f1085     // Catch: java.lang.Throwable -> L29
            int r3 = r4.intValue()     // Catch: java.lang.Throwable -> L29
            java.nio.ByteBuffer r2 = r2.putInt(r3)     // Catch: java.lang.Throwable -> L29
            byte[] r2 = r2.array()     // Catch: java.lang.Throwable -> L29
            r5.update(r2)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
        L28:
            return
        L29:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r2
        L2c:
            java.lang.Long r4 = (java.lang.Long) r4
            r5.update(r3)
            java.nio.ByteBuffer r3 = r2.f1085
            monitor-enter(r3)
            java.nio.ByteBuffer r0 = r2.f1085     // Catch: java.lang.Throwable -> L4c
            r0.position(r1)     // Catch: java.lang.Throwable -> L4c
            java.nio.ByteBuffer r2 = r2.f1085     // Catch: java.lang.Throwable -> L4c
            long r0 = r4.longValue()     // Catch: java.lang.Throwable -> L4c
            java.nio.ByteBuffer r2 = r2.putLong(r0)     // Catch: java.lang.Throwable -> L4c
            byte[] r2 = r2.array()     // Catch: java.lang.Throwable -> L4c
            r5.update(r2)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            return
        L4c:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4c
            throw r2
    }
}
