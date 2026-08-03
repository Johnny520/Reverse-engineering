package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class C6684 extends Yue.AbstractC6680 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.nio.charset.Charset f23372 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f23373 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f23374 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f23375 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f23376 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f23377 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f23378 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f23379 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f23380 = 7;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f23381 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f23382 = 9;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f23383 = 10;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f23384 = 11;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f23385 = 12;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f23386 = 13;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f23387 = 14;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.io.DataInputStream f23388;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final java.io.DataOutputStream f23389;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.io.DataInputStream f23390;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.io.DataOutputStream f23391;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C6684.C6686 f23392;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f23393;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f23394;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f23395;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f23396;

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۣ$ۥ, reason: contains not printable characters */
    public class C6685 extends java.io.FilterInputStream {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6684 f23397;

        public C6685(Yue.C6684 r1, java.io.InputStream r2) {
                r0 = this;
                r0.f23397 = r1
                r0.<init>(r2)
                return
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
                r3 = this;
                Yue.ۥۣۢۦۣ r0 = r3.f23397
                int r1 = r0.f23396
                r2 = -1
                if (r1 == r2) goto L12
                int r0 = r0.f23394
                if (r0 >= r1) goto Lc
                goto L12
            Lc:
                java.io.IOException r0 = new java.io.IOException
                r0.<init>()
                throw r0
            L12:
                int r0 = super.read()
                Yue.ۥۣۢۦۣ r1 = r3.f23397
                int r2 = r1.f23394
                int r2 = r2 + 1
                r1.f23394 = r2
                return r0
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                Yue.ۥۣۢۦۣ r0 = r3.f23397
                int r1 = r0.f23396
                r2 = -1
                if (r1 == r2) goto L12
                int r0 = r0.f23394
                if (r0 >= r1) goto Lc
                goto L12
            Lc:
                java.io.IOException r4 = new java.io.IOException
                r4.<init>()
                throw r4
            L12:
                int r4 = super.read(r4, r5, r6)
                if (r4 <= 0) goto L1f
                Yue.ۥۣۢۦۣ r5 = r3.f23397
                int r6 = r5.f23394
                int r6 = r6 + r4
                r5.f23394 = r6
            L1f:
                return r4
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long r4) throws java.io.IOException {
                r3 = this;
                Yue.ۥۣۢۦۣ r0 = r3.f23397
                int r1 = r0.f23396
                r2 = -1
                if (r1 == r2) goto L12
                int r0 = r0.f23394
                if (r0 >= r1) goto Lc
                goto L12
            Lc:
                java.io.IOException r4 = new java.io.IOException
                r4.<init>()
                throw r4
            L12:
                long r4 = super.skip(r4)
                r0 = 0
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 <= 0) goto L24
                Yue.ۥۣۢۦۣ r0 = r3.f23397
                int r1 = r0.f23394
                int r2 = (int) r4
                int r1 = r1 + r2
                r0.f23394 = r1
            L24:
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۣ$ۥ۟, reason: contains not printable characters */
    public static class C6686 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.io.ByteArrayOutputStream f23398;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.io.DataOutputStream f23399;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f23400;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final java.io.DataOutputStream f23401;

        public C6686(int r3, java.io.DataOutputStream r4) {
                r2 = this;
                r2.<init>()
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r0.<init>()
                r2.f23398 = r0
                java.io.DataOutputStream r1 = new java.io.DataOutputStream
                r1.<init>(r0)
                r2.f23399 = r1
                r2.f23400 = r3
                r2.f23401 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m25843() throws java.io.IOException {
                r4 = this;
                java.io.DataOutputStream r0 = r4.f23399
                r0.flush()
                java.io.ByteArrayOutputStream r0 = r4.f23398
                int r0 = r0.size()
                int r1 = r4.f23400
                int r1 = r1 << 16
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r0 < r2) goto L16
                r3 = r2
                goto L17
            L16:
                r3 = r0
            L17:
                r1 = r1 | r3
                java.io.DataOutputStream r3 = r4.f23401
                r3.writeInt(r1)
                if (r0 < r2) goto L24
                java.io.DataOutputStream r1 = r4.f23401
                r1.writeInt(r0)
            L24:
                java.io.ByteArrayOutputStream r0 = r4.f23398
                java.io.DataOutputStream r1 = r4.f23401
                r0.writeTo(r1)
                return
        }
    }

    static {
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            Yue.C6684.f23372 = r0
            return
    }

    public C6684(java.io.InputStream r7, java.io.OutputStream r8) {
            r6 = this;
            Yue.ۥ۟ۡۨۡ r3 = new Yue.ۥ۟ۡۨۡ
            r3.<init>()
            Yue.ۥ۟ۡۨۡ r4 = new Yue.ۥ۟ۡۨۡ
            r4.<init>()
            Yue.ۥ۟ۡۨۡ r5 = new Yue.ۥ۟ۡۨۡ
            r5.<init>()
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public C6684(java.io.InputStream r1, java.io.OutputStream r2, Yue.C0573<java.lang.String, java.lang.reflect.Method> r3, Yue.C0573<java.lang.String, java.lang.reflect.Method> r4, Yue.C0573<java.lang.String, java.lang.Class> r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r3 = 0
            r0.f23394 = r3
            r3 = -1
            r0.f23395 = r3
            r0.f23396 = r3
            r3 = 0
            if (r1 == 0) goto L19
            java.io.DataInputStream r4 = new java.io.DataInputStream
            Yue.ۥۣۢۦۣ$ۥ r5 = new Yue.ۥۣۢۦۣ$ۥ
            r5.<init>(r0, r1)
            r4.<init>(r5)
            goto L1a
        L19:
            r4 = r3
        L1a:
            r0.f23388 = r4
            if (r2 == 0) goto L23
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r2)
        L23:
            r0.f23389 = r3
            r0.f23390 = r4
            r0.f23391 = r3
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ */
    public void mo25724() {
            r2 = this;
            Yue.ۥۣۢۦۣ$ۥ۟ r0 = r2.f23392
            if (r0 == 0) goto L1e
            java.io.ByteArrayOutputStream r0 = r0.f23398     // Catch: java.io.IOException -> L12
            int r0 = r0.size()     // Catch: java.io.IOException -> L12
            if (r0 == 0) goto L14
            Yue.ۥۣۢۦۣ$ۥ۟ r0 = r2.f23392     // Catch: java.io.IOException -> L12
            r0.m25843()     // Catch: java.io.IOException -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L18
        L14:
            r0 = 0
            r2.f23392 = r0
            goto L1e
        L18:
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
        L1e:
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.AbstractC6680 mo25726() {
            r7 = this;
            Yue.ۥۣۢۦۣ r6 = new Yue.ۥۣۢۦۣ
            java.io.DataInputStream r1 = r7.f23390
            java.io.DataOutputStream r2 = r7.f23391
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r3 = r7.f23358
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.reflect.Method> r4 = r7.f23359
            Yue.ۥ۟ۡۨۡ<java.lang.String, java.lang.Class> r5 = r7.f23360
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo25731() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo25734() {
            r2 = this;
            java.io.DataInputStream r0 = r2.f23390     // Catch: java.io.IOException -> L7
            boolean r0 = r0.readBoolean()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public android.os.Bundle mo25738() {
            r5 = this;
            int r0 = r5.mo25760()
            if (r0 >= 0) goto L8
            r0 = 0
            return r0
        L8:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 0
        Le:
            if (r2 >= r0) goto L1e
            java.lang.String r3 = r5.mo25777()
            int r4 = r5.mo25760()
            r5.m25841(r4, r3, r1)
            int r2 = r2 + 1
            goto Le
        L1e:
            return r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public byte[] mo25741() {
            r2 = this;
            java.io.DataInputStream r0 = r2.f23390     // Catch: java.io.IOException -> L10
            int r0 = r0.readInt()     // Catch: java.io.IOException -> L10
            if (r0 <= 0) goto L12
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L10
            java.io.DataInputStream r1 = r2.f23390     // Catch: java.io.IOException -> L10
            r1.readFully(r0)     // Catch: java.io.IOException -> L10
            return r0
        L10:
            r0 = move-exception
            goto L14
        L12:
            r0 = 0
            return r0
        L14:
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public java.lang.CharSequence mo25744() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public double mo25747() {
            r2 = this;
            java.io.DataInputStream r0 = r2.f23390     // Catch: java.io.IOException -> L7
            double r0 = r0.readDouble()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo25754(int r5) {
            r4 = this;
        L0:
            r0 = 0
            int r1 = r4.f23395     // Catch: java.io.IOException -> L43
            if (r1 != r5) goto L7
            r5 = 1
            return r5
        L7:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> L43
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch: java.io.IOException -> L43
            int r1 = r1.compareTo(r2)     // Catch: java.io.IOException -> L43
            if (r1 <= 0) goto L16
            return r0
        L16:
            int r1 = r4.f23394     // Catch: java.io.IOException -> L43
            int r2 = r4.f23396     // Catch: java.io.IOException -> L43
            if (r1 >= r2) goto L23
            java.io.DataInputStream r3 = r4.f23388     // Catch: java.io.IOException -> L43
            int r2 = r2 - r1
            long r1 = (long) r2     // Catch: java.io.IOException -> L43
            r3.skip(r1)     // Catch: java.io.IOException -> L43
        L23:
            r1 = -1
            r4.f23396 = r1     // Catch: java.io.IOException -> L43
            java.io.DataInputStream r1 = r4.f23388     // Catch: java.io.IOException -> L43
            int r1 = r1.readInt()     // Catch: java.io.IOException -> L43
            r4.f23394 = r0     // Catch: java.io.IOException -> L43
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = r1 & r2
            if (r3 != r2) goto L3b
            java.io.DataInputStream r3 = r4.f23388     // Catch: java.io.IOException -> L43
            int r3 = r3.readInt()     // Catch: java.io.IOException -> L43
        L3b:
            int r1 = r1 >> 16
            r1 = r1 & r2
            r4.f23395 = r1     // Catch: java.io.IOException -> L43
            r4.f23396 = r3     // Catch: java.io.IOException -> L43
            goto L0
        L43:
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public float mo25755() {
            r2 = this;
            java.io.DataInputStream r0 = r2.f23390     // Catch: java.io.IOException -> L7
            float r0 = r0.readFloat()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public int mo25760() {
            r2 = this;
            java.io.DataInputStream r0 = r2.f23390     // Catch: java.io.IOException -> L7
            int r0 = r0.readInt()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public long mo25765() {
            r2 = this;
            java.io.DataInputStream r0 = r2.f23390     // Catch: java.io.IOException -> L7
            long r0 = r0.readLong()     // Catch: java.io.IOException -> L7
            return r0
        L7:
            r0 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public <T extends android.os.Parcelable> T mo25770() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public java.lang.String mo25777() {
            r3 = this;
            java.io.DataInputStream r0 = r3.f23390     // Catch: java.io.IOException -> L17
            int r0 = r0.readInt()     // Catch: java.io.IOException -> L17
            if (r0 <= 0) goto L19
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L17
            java.io.DataInputStream r1 = r3.f23390     // Catch: java.io.IOException -> L17
            r1.readFully(r0)     // Catch: java.io.IOException -> L17
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L17
            java.nio.charset.Charset r2 = Yue.C6684.f23372     // Catch: java.io.IOException -> L17
            r1.<init>(r0, r2)     // Catch: java.io.IOException -> L17
            return r1
        L17:
            r0 = move-exception
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            Yue.ۥۣۢۦۡ$ۥ۟ r1 = new Yue.ۥۣۢۦۡ$ۥ۟
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public android.os.IBinder mo25779() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo25783(int r3) {
            r2 = this;
            r2.mo25724()
            Yue.ۥۣۢۦۣ$ۥ۟ r0 = new Yue.ۥۣۢۦۣ$ۥ۟
            java.io.DataOutputStream r1 = r2.f23389
            r0.<init>(r3, r1)
            r2.f23392 = r0
            java.io.DataOutputStream r3 = r0.f23399
            r2.f23391 = r3
            return
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo25784(boolean r1, boolean r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.f23393 = r2
            return
        L5:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Serialization of this object is not allowed"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo25787(boolean r2) {
            r1 = this;
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> L6
            r0.writeBoolean(r2)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r0 = new Yue.ۥۣۢۦۡ$ۥ۟
            r0.<init>(r2)
            throw r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo25791(android.os.Bundle r4) {
            r3 = this;
            if (r4 == 0) goto L2c
            java.util.Set r0 = r4.keySet()     // Catch: java.io.IOException -> L2a
            java.io.DataOutputStream r1 = r3.f23391     // Catch: java.io.IOException -> L2a
            int r2 = r0.size()     // Catch: java.io.IOException -> L2a
            r1.writeInt(r2)     // Catch: java.io.IOException -> L2a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.IOException -> L2a
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.io.IOException -> L2a
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.next()     // Catch: java.io.IOException -> L2a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.IOException -> L2a
            r3.mo25831(r1)     // Catch: java.io.IOException -> L2a
            java.lang.Object r1 = r4.get(r1)     // Catch: java.io.IOException -> L2a
            r3.m25842(r1)     // Catch: java.io.IOException -> L2a
            goto L13
        L2a:
            r4 = move-exception
            goto L33
        L2c:
            java.io.DataOutputStream r4 = r3.f23391     // Catch: java.io.IOException -> L2a
            r0 = -1
            r4.writeInt(r0)     // Catch: java.io.IOException -> L2a
        L32:
            return
        L33:
            Yue.ۥۣۢۦۡ$ۥ۟ r0 = new Yue.ۥۣۢۦۡ$ۥ۟
            r0.<init>(r4)
            throw r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo25794(byte[] r3) {
            r2 = this;
            if (r3 == 0) goto L10
            java.io.DataOutputStream r0 = r2.f23391     // Catch: java.io.IOException -> Le
            int r1 = r3.length     // Catch: java.io.IOException -> Le
            r0.writeInt(r1)     // Catch: java.io.IOException -> Le
            java.io.DataOutputStream r0 = r2.f23391     // Catch: java.io.IOException -> Le
            r0.write(r3)     // Catch: java.io.IOException -> Le
            goto L16
        Le:
            r3 = move-exception
            goto L17
        L10:
            java.io.DataOutputStream r3 = r2.f23391     // Catch: java.io.IOException -> Le
            r0 = -1
            r3.writeInt(r0)     // Catch: java.io.IOException -> Le
        L16:
            return
        L17:
            Yue.ۥۣۢۦۡ$ۥ۟ r0 = new Yue.ۥۣۢۦۡ$ۥ۟
            r0.<init>(r3)
            throw r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo25796(byte[] r2, int r3, int r4) {
            r1 = this;
            if (r2 == 0) goto Lf
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> Ld
            r0.writeInt(r4)     // Catch: java.io.IOException -> Ld
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> Ld
            r0.write(r2, r3, r4)     // Catch: java.io.IOException -> Ld
            goto L15
        Ld:
            r2 = move-exception
            goto L16
        Lf:
            java.io.DataOutputStream r2 = r1.f23391     // Catch: java.io.IOException -> Ld
            r3 = -1
            r2.writeInt(r3)     // Catch: java.io.IOException -> Ld
        L15:
            return
        L16:
            Yue.ۥۣۢۦۡ$ۥ۟ r3 = new Yue.ۥۣۢۦۡ$ۥ۟
            r3.<init>(r2)
            throw r3
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo25799(java.lang.CharSequence r2) {
            r1 = this;
            boolean r2 = r1.f23393
            if (r2 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "CharSequence cannot be written to an OutputStream"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo25803(double r2) {
            r1 = this;
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> L6
            r0.writeDouble(r2)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r3 = new Yue.ۥۣۢۦۡ$ۥ۟
            r3.<init>(r2)
            throw r3
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    public void mo25808(float r2) {
            r1 = this;
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> L6
            r0.writeFloat(r2)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r0 = new Yue.ۥۣۢۦۡ$ۥ۟
            r0.<init>(r2)
            throw r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public void mo25812(int r2) {
            r1 = this;
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> L6
            r0.writeInt(r2)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r0 = new Yue.ۥۣۢۦۡ$ۥ۟
            r0.<init>(r2)
            throw r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ */
    public void mo25817(long r2) {
            r1 = this;
            java.io.DataOutputStream r0 = r1.f23391     // Catch: java.io.IOException -> L6
            r0.writeLong(r2)     // Catch: java.io.IOException -> L6
            return
        L6:
            r2 = move-exception
            Yue.ۥۣۢۦۡ$ۥ۟ r3 = new Yue.ۥۣۢۦۡ$ۥ۟
            r3.<init>(r2)
            throw r3
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ */
    public void mo25823(android.os.Parcelable r2) {
            r1 = this;
            boolean r2 = r1.f23393
            if (r2 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Parcelables cannot be written to an OutputStream"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ */
    public void mo25831(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.nio.charset.Charset r0 = Yue.C6684.f23372     // Catch: java.io.IOException -> L14
            byte[] r3 = r3.getBytes(r0)     // Catch: java.io.IOException -> L14
            java.io.DataOutputStream r0 = r2.f23391     // Catch: java.io.IOException -> L14
            int r1 = r3.length     // Catch: java.io.IOException -> L14
            r0.writeInt(r1)     // Catch: java.io.IOException -> L14
            java.io.DataOutputStream r0 = r2.f23391     // Catch: java.io.IOException -> L14
            r0.write(r3)     // Catch: java.io.IOException -> L14
            goto L1c
        L14:
            r3 = move-exception
            goto L1d
        L16:
            java.io.DataOutputStream r3 = r2.f23391     // Catch: java.io.IOException -> L14
            r0 = -1
            r3.writeInt(r0)     // Catch: java.io.IOException -> L14
        L1c:
            return
        L1d:
            Yue.ۥۣۢۦۡ$ۥ۟ r0 = new Yue.ۥۣۢۦۡ$ۥ۟
            r0.<init>(r3)
            throw r0
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ */
    public void mo25833(android.os.IBinder r2) {
            r1 = this;
            boolean r2 = r1.f23393
            if (r2 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Binders cannot be written to an OutputStream"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.AbstractC6680
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ */
    public void mo25835(android.os.IInterface r2) {
            r1 = this;
            boolean r2 = r1.f23393
            if (r2 == 0) goto L5
            return
        L5:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Binders cannot be written to an OutputStream"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final void m25841(int r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            switch(r3) {
                case 0: goto L91;
                case 1: goto L89;
                case 2: goto L81;
                case 3: goto L79;
                case 4: goto L6c;
                case 5: goto L64;
                case 6: goto L5c;
                case 7: goto L54;
                case 8: goto L4c;
                case 9: goto L44;
                case 10: goto L3c;
                case 11: goto L34;
                case 12: goto L2c;
                case 13: goto L23;
                case 14: goto L1a;
                default: goto L3;
            }
        L3:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown type "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L1a:
            float[] r3 = r2.m25757()
            r5.putFloatArray(r4, r3)
            goto L95
        L23:
            float r3 = r2.mo25755()
            r5.putFloat(r4, r3)
            goto L95
        L2c:
            long[] r3 = r2.m25767()
            r5.putLongArray(r4, r3)
            goto L95
        L34:
            long r0 = r2.mo25765()
            r5.putLong(r4, r0)
            goto L95
        L3c:
            int[] r3 = r2.m25762()
            r5.putIntArray(r4, r3)
            goto L95
        L44:
            int r3 = r2.mo25760()
            r5.putInt(r4, r3)
            goto L95
        L4c:
            double[] r3 = r2.m25749()
            r5.putDoubleArray(r4, r3)
            goto L95
        L54:
            double r0 = r2.mo25747()
            r5.putDouble(r4, r0)
            goto L95
        L5c:
            boolean[] r3 = r2.m25736()
            r5.putBooleanArray(r4, r3)
            goto L95
        L64:
            boolean r3 = r2.mo25734()
            r5.putBoolean(r4, r3)
            goto L95
        L6c:
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r2.m25732(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r5.putStringArray(r4, r3)
            goto L95
        L79:
            java.lang.String r3 = r2.mo25777()
            r5.putString(r4, r3)
            goto L95
        L81:
            android.os.Bundle r3 = r2.mo25738()
            r5.putBundle(r4, r3)
            goto L95
        L89:
            android.os.Bundle r3 = r2.mo25738()
            r5.putBundle(r4, r3)
            goto L95
        L91:
            r3 = 0
            r5.putParcelable(r4, r3)
        L95:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public final void m25842(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L8
            r4 = 0
            r3.mo25812(r4)
            goto Lde
        L8:
            boolean r0 = r4 instanceof android.os.Bundle
            if (r0 == 0) goto L17
            r0 = 1
            r3.mo25812(r0)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r3.mo25791(r4)
            goto Lde
        L17:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L26
            r0 = 3
            r3.mo25812(r0)
            java.lang.String r4 = (java.lang.String) r4
            r3.mo25831(r4)
            goto Lde
        L26:
            boolean r0 = r4 instanceof java.lang.String[]
            if (r0 == 0) goto L35
            r0 = 4
            r3.mo25812(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.m25785(r4)
            goto Lde
        L35:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L48
            r0 = 5
            r3.mo25812(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r3.mo25787(r4)
            goto Lde
        L48:
            boolean r0 = r4 instanceof boolean[]
            if (r0 == 0) goto L57
            r0 = 6
            r3.mo25812(r0)
            boolean[] r4 = (boolean[]) r4
            r3.m25789(r4)
            goto Lde
        L57:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L6a
            r0 = 7
            r3.mo25812(r0)
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r3.mo25803(r0)
            goto Lde
        L6a:
            boolean r0 = r4 instanceof double[]
            if (r0 == 0) goto L79
            r0 = 8
            r3.mo25812(r0)
            double[] r4 = (double[]) r4
            r3.m25805(r4)
            goto Lde
        L79:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L8c
            r0 = 9
            r3.mo25812(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.mo25812(r4)
            goto Lde
        L8c:
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L9b
            r0 = 10
            r3.mo25812(r0)
            int[] r4 = (int[]) r4
            r3.m25814(r4)
            goto Lde
        L9b:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto Lae
            r0 = 11
            r3.mo25812(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r3.mo25817(r0)
            goto Lde
        Lae:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto Lbd
            r0 = 12
            r3.mo25812(r0)
            long[] r4 = (long[]) r4
            r3.m25819(r4)
            goto Lde
        Lbd:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto Ld0
            r0 = 13
            r3.mo25812(r0)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r3.mo25808(r4)
            goto Lde
        Ld0:
            boolean r0 = r4 instanceof float[]
            if (r0 == 0) goto Ldf
            r0 = 14
            r3.mo25812(r0)
            float[] r4 = (float[]) r4
            r3.m25810(r4)
        Lde:
            return
        Ldf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported type "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
