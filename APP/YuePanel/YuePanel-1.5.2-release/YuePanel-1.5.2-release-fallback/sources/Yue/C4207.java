package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC0412
@Yue.InterfaceC5336(19)
public class C4207 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f12975 = 1164798569;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f12976 = 1701669481;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12977 = 1835365473;

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ, reason: contains not printable characters */
    public static class C4208 implements Yue.C4207.InterfaceC4211 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final java.nio.ByteBuffer f12978;

        public C4208(@Yue.InterfaceC4410 java.nio.ByteBuffer r2) {
                r1 = this;
                r1.<init>()
                r1.f12978 = r2
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r2.order(r0)
                return
        }

        @Override // Yue.C4207.InterfaceC4211
        public long getPosition() {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f12978
                int r0 = r0.position()
                long r0 = (long) r0
                return r0
        }

        @Override // Yue.C4207.InterfaceC4211
        public int readUnsignedShort() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.f12978
                short r0 = r0.getShort()
                int r0 = Yue.C4207.m16424(r0)
                return r0
        }

        @Override // Yue.C4207.InterfaceC4211
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int mo16425() throws java.io.IOException {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.f12978
                int r0 = r0.getInt()
                return r0
        }

        @Override // Yue.C4207.InterfaceC4211
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo16426(int r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f12978
                int r1 = r0.position()
                int r1 = r1 + r3
                r0.position(r1)
                return
        }

        @Override // Yue.C4207.InterfaceC4211
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long mo16427() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f12978
                int r0 = r0.getInt()
                long r0 = Yue.C4207.m16423(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ۟, reason: contains not printable characters */
    public static class C4209 implements Yue.C4207.InterfaceC4211 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final byte[] f12979;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final java.nio.ByteBuffer f12980;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final java.io.InputStream f12981;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long f12982;

        public C4209(@Yue.InterfaceC4410 java.io.InputStream r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f12982 = r0
                r2.f12981 = r3
                r3 = 4
                byte[] r3 = new byte[r3]
                r2.f12979 = r3
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
                r2.f12980 = r3
                java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
                r3.order(r0)
                return
        }

        @Override // Yue.C4207.InterfaceC4211
        public long getPosition() {
                r2 = this;
                long r0 = r2.f12982
                return r0
        }

        @Override // Yue.C4207.InterfaceC4211
        public int readUnsignedShort() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f12980
                r1 = 0
                r0.position(r1)
                r0 = 2
                r2.m16428(r0)
                java.nio.ByteBuffer r0 = r2.f12980
                short r0 = r0.getShort()
                int r0 = Yue.C4207.m16424(r0)
                return r0
        }

        @Override // Yue.C4207.InterfaceC4211
        /* JADX INFO: renamed from: ۥ */
        public int mo16425() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f12980
                r1 = 0
                r0.position(r1)
                r0 = 4
                r2.m16428(r0)
                java.nio.ByteBuffer r0 = r2.f12980
                int r0 = r0.getInt()
                return r0
        }

        @Override // Yue.C4207.InterfaceC4211
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo16426(int r6) throws java.io.IOException {
                r5 = this;
            L0:
                if (r6 <= 0) goto L1d
                java.io.InputStream r0 = r5.f12981
                long r1 = (long) r6
                long r0 = r0.skip(r1)
                int r0 = (int) r0
                r1 = 1
                if (r0 < r1) goto L15
                int r6 = r6 - r0
                long r1 = r5.f12982
                long r3 = (long) r0
                long r1 = r1 + r3
                r5.f12982 = r1
                goto L0
            L15:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "Skip didn't move at least 1 byte forward"
                r6.<init>(r0)
                throw r6
            L1d:
                return
        }

        @Override // Yue.C4207.InterfaceC4211
        /* JADX INFO: renamed from: ۥ۟۟ */
        public long mo16427() throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.f12980
                r1 = 0
                r0.position(r1)
                r0 = 4
                r2.m16428(r0)
                java.nio.ByteBuffer r0 = r2.f12980
                int r0 = r0.getInt()
                long r0 = Yue.C4207.m16423(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m16428(@Yue.InterfaceC3281(from = 0, to = 4) int r5) throws java.io.IOException {
                r4 = this;
                java.io.InputStream r0 = r4.f12981
                byte[] r1 = r4.f12979
                r2 = 0
                int r0 = r0.read(r1, r2, r5)
                if (r0 != r5) goto L12
                long r0 = r4.f12982
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.f12982 = r0
                return
            L12:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = "read failed"
                r5.<init>(r0)
                throw r5
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C4210 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final long f12983;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final long f12984;

        public C4210(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.f12983 = r1
                r0.f12984 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long m16429() {
                r2 = this;
                long r0 = r2.f12984
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public long m16430() {
                r2 = this;
                long r0 = r2.f12983
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC4211 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final int f12985 = 2;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final int f12986 = 4;

        long getPosition();

        int readUnsignedShort() throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ */
        int mo16425() throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ۟ */
        void mo16426(int r1) throws java.io.IOException;

        /* JADX INFO: renamed from: ۥ۟۟ */
        long mo16427() throws java.io.IOException;
    }

    public C4207() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C4207.C4210 m16419(Yue.C4207.InterfaceC4211 r12) throws java.io.IOException {
            r0 = 4
            r12.mo16426(r0)
            int r1 = r12.readUnsignedShort()
            r2 = 100
            java.lang.String r3 = "Cannot read metadata."
            if (r1 > r2) goto L73
            r2 = 6
            r12.mo16426(r2)
            r2 = 0
            r4 = r2
        L14:
            r5 = -1
            if (r4 >= r1) goto L2f
            int r7 = r12.mo16425()
            r12.mo16426(r0)
            long r8 = r12.mo16427()
            r12.mo16426(r0)
            r10 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r10 != r7) goto L2c
            goto L30
        L2c:
            int r4 = r4 + 1
            goto L14
        L2f:
            r8 = r5
        L30:
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L6d
            long r0 = r12.getPosition()
            long r0 = r8 - r0
            int r0 = (int) r0
            r12.mo16426(r0)
            r0 = 12
            r12.mo16426(r0)
            long r0 = r12.mo16427()
        L47:
            long r4 = (long) r2
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L6d
            int r4 = r12.mo16425()
            long r5 = r12.mo16427()
            long r10 = r12.mo16427()
            r7 = 1164798569(0x456d6a69, float:3798.6506)
            if (r7 == r4) goto L66
            r7 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r7 != r4) goto L63
            goto L66
        L63:
            int r2 = r2 + 1
            goto L47
        L66:
            Yue.ۥۡۡ۠ۧ$ۥ۟۟ r12 = new Yue.ۥۡۡ۠ۧ$ۥ۟۟
            long r5 = r5 + r8
            r12.<init>(r5, r10)
            return r12
        L6d:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r3)
            throw r12
        L73:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r3)
            throw r12
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C4205 m16420(android.content.res.AssetManager r0, java.lang.String r1) throws java.io.IOException {
            java.io.InputStream r0 = r0.open(r1)
            Yue.ۥۡۡ۠ۦ r1 = m16421(r0)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Ld
            r0.close()
        Ld:
            return r1
        Le:
            r1 = move-exception
            if (r0 == 0) goto L19
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C4205 m16421(java.io.InputStream r6) throws java.io.IOException {
            Yue.ۥۡۡ۠ۧ$ۥ۟ r0 = new Yue.ۥۡۡ۠ۧ$ۥ۟
            r0.<init>(r6)
            Yue.ۥۡۡ۠ۧ$ۥ۟۟ r1 = m16419(r0)
            long r2 = r1.m16430()
            long r4 = r0.getPosition()
            long r2 = r2 - r4
            int r2 = (int) r2
            r0.mo16426(r2)
            long r2 = r1.m16429()
            int r0 = (int) r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            byte[] r2 = r0.array()
            int r6 = r6.read(r2)
            long r2 = (long) r6
            long r4 = r1.m16429()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L35
            Yue.ۥۡۡ۠ۦ r6 = Yue.C4205.m16401(r0)
            return r6
        L35:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Needed "
            r2.append(r3)
            long r3 = r1.m16429()
            r2.append(r3)
            java.lang.String r1 = " bytes, got "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.<init>(r6)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C4205 m16422(java.nio.ByteBuffer r2) throws java.io.IOException {
            java.nio.ByteBuffer r2 = r2.duplicate()
            Yue.ۥۡۡ۠ۧ$ۥ r0 = new Yue.ۥۡۡ۠ۧ$ۥ
            r0.<init>(r2)
            Yue.ۥۡۡ۠ۧ$ۥ۟۟ r0 = m16419(r0)
            long r0 = r0.m16430()
            int r0 = (int) r0
            r2.position(r0)
            Yue.ۥۡۡ۠ۦ r2 = Yue.C4205.m16401(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m16423(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m16424(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            return r1
    }
}
