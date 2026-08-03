package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4550 extends Yue.C4549 {
    public C4550() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final int m18107(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
            int r0 = r0 + (-24)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final int m18108(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r1 + (-16)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final int m18109(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.bitCount(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final int m18110(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.bitCount(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final int m18111(byte r0) {
            r0 = r0 | 256(0x100, float:3.59E-43)
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final int m18112(short r1) {
            r0 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 | r0
            int r1 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final byte m18113(byte r1, int r2) {
            r2 = r2 & 7
            int r0 = r1 << r2
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = 8 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            byte r1 = (byte) r1
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final short m18114(short r2, int r3) {
            r3 = r3 & 15
            int r0 = r2 << r3
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r3 = 16 - r3
            int r2 = r2 >>> r3
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final byte m18115(byte r1, int r2) {
            r2 = r2 & 7
            int r0 = 8 - r2
            int r0 = r1 << r0
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 >>> r2
            r1 = r1 | r0
            byte r1 = (byte) r1
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final short m18116(short r2, int r3) {
            r3 = r3 & 15
            int r0 = 16 - r3
            int r0 = r2 << r0
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = r2 >>> r3
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final byte m18117(byte r0) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = java.lang.Integer.highestOneBit(r0)
            byte r0 = (byte) r0
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final short m18118(short r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r1 = java.lang.Integer.highestOneBit(r1)
            short r1 = (short) r1
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final byte m18119(byte r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            byte r0 = (byte) r0
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2310.class})
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final short m18120(short r0) {
            int r0 = java.lang.Integer.lowestOneBit(r0)
            short r0 = (short) r0
            return r0
    }
}
