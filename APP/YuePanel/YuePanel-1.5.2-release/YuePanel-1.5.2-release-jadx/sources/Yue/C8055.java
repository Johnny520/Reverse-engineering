package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8055 {
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ */
    public static final short m4077(short s, short s2) {
        return C5499.m17107(s & C8080.f23970, 65535 & s2) >= 0 ? s : s2;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ */
    public static int m4078(int i, int i2) {
        return Integer.compareUnsigned(i, i2) >= 0 ? i : i2;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final byte m26271(byte b, byte b2) {
        return C5499.m17107(b & 255, b2 & 255) >= 0 ? b : b2;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26272(int i, @InterfaceC6399 int... iArr) {
        C5499.m17103(iArr, "other");
        int iM26380 = C8058.m26380(iArr);
        for (int i2 = 0; i2 < iM26380; i2++) {
            i = m4078(i, C8058.m26379(iArr, i2));
        }
        return i;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m26273(long j, @InterfaceC6399 long... jArr) {
        C5499.m17103(jArr, "other");
        int iM26470 = C8065.m26470(jArr);
        for (int i = 0; i < iM26470; i++) {
            j = m26278(j, C8065.m26469(jArr, i));
        }
        return j;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final short m26274(short s, short s2, short s3) {
        return m4077(s, m4077(s2, s3));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m26275(int i, int i2, int i3) {
        return m4078(i, m4078(i2, i3));
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte m26276(byte b, @InterfaceC6399 byte... bArr) {
        C5499.m17103(bArr, "other");
        int iM26253 = C8049.m26253(bArr);
        for (int i = 0; i < iM26253; i++) {
            b = m26271(b, C8049.m26252(bArr, i));
        }
        return b;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final byte m26277(byte b, byte b2, byte b3) {
        return m26271(b, m26271(b2, b3));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static long m26278(long j, long j2) {
        return Long.compareUnsigned(j, j2) >= 0 ? j : j2;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m26279(long j, long j2, long j3) {
        return m26278(j, m26278(j2, j3));
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final short m26280(short s, @InterfaceC6399 short... sArr) {
        C5499.m17103(sArr, "other");
        int iM26650 = C8081.m26650(sArr);
        for (int i = 0; i < iM26650; i++) {
            s = m4077(s, C8081.m26649(sArr, i));
        }
        return s;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final short m26281(short s, short s2) {
        return C5499.m17107(s & C8080.f23970, 65535 & s2) <= 0 ? s : s2;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m26282(int i, int i2) {
        return Integer.compareUnsigned(i, i2) <= 0 ? i : i2;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final byte m26283(byte b, byte b2) {
        return C5499.m17107(b & 255, b2 & 255) <= 0 ? b : b2;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m26284(int i, @InterfaceC6399 int... iArr) {
        C5499.m17103(iArr, "other");
        int iM26380 = C8058.m26380(iArr);
        for (int i2 = 0; i2 < iM26380; i2++) {
            i = m26282(i, C8058.m26379(iArr, i2));
        }
        return i;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long m26285(long j, @InterfaceC6399 long... jArr) {
        C5499.m17103(jArr, "other");
        int iM26470 = C8065.m26470(jArr);
        for (int i = 0; i < iM26470; i++) {
            j = m26290(j, C8065.m26469(jArr, i));
        }
        return j;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final short m26286(short s, short s2, short s3) {
        return m26281(s, m26281(s2, s3));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int m26287(int i, int i2, int i3) {
        return m26282(i, m26282(i2, i3));
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final byte m26288(byte b, @InterfaceC6399 byte... bArr) {
        C5499.m17103(bArr, "other");
        int iM26253 = C8049.m26253(bArr);
        for (int i = 0; i < iM26253; i++) {
            b = m26283(b, C8049.m26252(bArr, i));
        }
        return b;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final byte m26289(byte b, byte b2, byte b3) {
        return m26283(b, m26283(b2, b3));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static long m26290(long j, long j2) {
        return Long.compareUnsigned(j, j2) <= 0 ? j : j2;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long m26291(long j, long j2, long j3) {
        return m26290(j, m26290(j2, j3));
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final short m26292(short s, @InterfaceC6399 short... sArr) {
        C5499.m17103(sArr, "other");
        int iM26650 = C8081.m26650(sArr);
        for (int i = 0; i < iM26650; i++) {
            s = m26281(s, C8081.m26649(sArr, i));
        }
        return s;
    }
}
