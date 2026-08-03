package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6496 extends C6495 {
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final int m20577(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final int m20578(short s) {
        return Integer.numberOfLeadingZeros(s & C8080.f23970) - 16;
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final int m20579(byte b) {
        return Integer.bitCount(b & 255);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final int m20580(short s) {
        return Integer.bitCount(s & C8080.f23970);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final int m20581(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final int m20582(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final byte m20583(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> (8 - i2)) | (b << i2));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final short m20584(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> (16 - i2)) | (s << i2));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final byte m20585(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> i2) | (b << (8 - i2)));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final short m20586(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> i2) | (s << (16 - i2)));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final byte m20587(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final short m20588(short s) {
        return (short) Integer.highestOneBit(s & C8080.f23970);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final byte m20589(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final short m20590(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
