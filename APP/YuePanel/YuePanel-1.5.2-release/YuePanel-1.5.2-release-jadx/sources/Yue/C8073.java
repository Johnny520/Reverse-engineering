package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "UNumbersKt")
public final class C8073 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ */
    public static final int m4105(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m4106(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m26495(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26496(short s) {
        return Integer.numberOfLeadingZeros(s & C8080.f23970) - 16;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26497(byte b) {
        return Integer.bitCount(C8057.m26318(b & 255));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m26498(long j) {
        return Long.bitCount(j);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m26499(int i) {
        return Integer.bitCount(i);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m26500(short s) {
        return Integer.bitCount(C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26501(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m26502(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m26503(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m26504(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m26505(long j, int i) {
        return C8064.m26408(Long.rotateLeft(j, i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte m26506(byte b, int i) {
        return C8048.m26193(C6496.m20583(b, i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m26507(int i, int i2) {
        return C8057.m26318(Integer.rotateLeft(i, i2));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final short m26508(short s, int i) {
        return C8080.m26590(C6496.m20584(s, i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long m26509(long j, int i) {
        return C8064.m26408(Long.rotateRight(j, i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final byte m26510(byte b, int i) {
        return C8048.m26193(C6496.m20585(b, i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int m26511(int i, int i2) {
        return C8057.m26318(Integer.rotateRight(i, i2));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final short m26512(short s, int i) {
        return C8080.m26590(C6496.m20586(s, i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final byte m26513(byte b) {
        return C8048.m26193((byte) Integer.highestOneBit(b & 255));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long m26514(long j) {
        return C8064.m26408(Long.highestOneBit(j));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int m26515(int i) {
        return C8057.m26318(Integer.highestOneBit(i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final short m26516(short s) {
        return C8080.m26590((short) Integer.highestOneBit(s & C8080.f23970));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final byte m26517(byte b) {
        return C8048.m26193((byte) Integer.lowestOneBit(b & 255));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final long m26518(long j) {
        return C8064.m26408(Long.lowestOneBit(j));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int m26519(int i) {
        return C8057.m26318(Integer.lowestOneBit(i));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class, InterfaceC4772.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final short m26520(short s) {
        return C8080.m26590((short) Integer.lowestOneBit(s & C8080.f23970));
    }
}
