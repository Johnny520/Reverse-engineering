package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Uc */
/* JADX INFO: loaded from: classes.dex */
public final class C0878Uc implements InterfaceC1331dl {

    /* JADX INFO: renamed from: a */
    public static final byte[] f2765a = null;

    /* JADX INFO: renamed from: b */
    public static final byte[] f2766b = null;

    /* JADX INFO: renamed from: c */
    public static final int[] f2767c = null;

    static {
        f2765a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        f2766b = "MPF".getBytes(Charset.forName("UTF-8"));
        f2767c = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    /* JADX INFO: renamed from: g */
    public static int m1719g(InterfaceC0835Tc r4, C2812zp r5) {
        int r1 = r4.mo236h();     // Catch: C0792Sc -> L22
        if ((r1 & 65496) != 65496) goto L6;
    L11:
        int r12 = m1723k(r4, 225);     // Catch: C0792Sc -> L22
        if (r12 == (-1)) goto L21;
        byte[] r2 = (byte[]) r5.m5441c(r12, byte[].class);     // Catch: C0792Sc -> L22
        int r42 = m1724l(r4, r2, r12);     // Catch: Throwable -> L18
        r5.m5445g(r2);     // Catch: C0792Sc -> L22
        return r42;
    L18:
        th = move-exception;
        r5.m5445g(r2);     // Catch: C0792Sc -> L22
        throw th;     // Catch: C0792Sc -> L22
    L6:
        if (r1 == 19789) goto L11;
        if (r1 == 18761) goto L11;
        return -1;
    L21:
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static ImageHeaderParser$ImageType m1720h(InterfaceC0835Tc r8) {
        int r0 = r8.mo236h();     // Catch: C0792Sc -> L82
        if (r0 == 65496) goto L5;
        int r02 = (r0 << 8) | r8.mo234f();     // Catch: C0792Sc -> L82
        if (r02 == 4671814) goto L9;
        int r03 = (r02 << 8) | r8.mo234f();     // Catch: C0792Sc -> L82
        if (r03 != (-1991225785)) goto L22;
        r8.skip(21);     // Catch: C0792Sc -> L82
        if (r8.mo234f() < 3) goto L18;
        return ImageHeaderParser$ImageType.PNG_A;
    L18:
        return ImageHeaderParser$ImageType.PNG;
    L20:
        return ImageHeaderParser$ImageType.PNG;
    L22:
        if (r03 != 1380533830) goto L24;
        r8.skip(4);     // Catch: C0792Sc -> L82
        if (((r8.mo236h() << 16) | r8.mo236h()) != 1464156752) goto L55;
        int r04 = (r8.mo236h() << 16) | r8.mo236h();     // Catch: C0792Sc -> L82
        if ((r04 & (-256)) != 1448097792) goto L59;
        int r05 = r04 & 255;     // Catch: C0792Sc -> L82
        if (r05 != 88) goto L73;
        r8.skip(4);     // Catch: C0792Sc -> L82
        short r82 = r8.mo234f();     // Catch: C0792Sc -> L82
        if ((r82 & 2) == 0) goto L67;
        return ImageHeaderParser$ImageType.ANIMATED_WEBP;
    L67:
        if ((r82 & 16) == 0) goto L71;
        return ImageHeaderParser$ImageType.WEBP_A;
    L71:
        return ImageHeaderParser$ImageType.WEBP;
    L73:
        if (r05 != 76) goto L81;
        r8.skip(4);     // Catch: C0792Sc -> L82
        if ((r8.mo234f() & 8) == 0) goto L79;
        return ImageHeaderParser$ImageType.WEBP_A;
    L79:
        return ImageHeaderParser$ImageType.WEBP;
    L81:
        return ImageHeaderParser$ImageType.WEBP;
    L59:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L55:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L24:
        if (((r8.mo236h() << 16) | r8.mo236h()) != 1718909296) goto L26;
        int r1 = (r8.mo236h() << 16) | r8.mo236h();     // Catch: C0792Sc -> L82
        if (r1 == 1635150195) goto L30;
        int r5 = 0;
        if (r1 != 1635150182) goto L34;
        boolean r12 = true;
    L35:
        r8.skip(4);     // Catch: C0792Sc -> L82
        int r06 = r03 - 16;
        if ((r06 % 4) == 0) goto L38;
    L47:
        if (r12 == false) goto L51;
        return ImageHeaderParser$ImageType.AVIF;
    L51:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L38:
        if (r5 >= 5) goto L47;
        if (r06 <= 0) goto L47;
        int r2 = (r8.mo236h() << 16) | r8.mo236h();     // Catch: C0792Sc -> L82
        if (r2 == 1635150195) goto L43;
        if (r2 != 1635150182) goto L46;
        r12 = true;
    L46:
        r5 = r5 + 1;     // Catch: C0792Sc -> L82
        r06 = r06 - 4;
        goto L38
    L43:
        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
    L34:
        r12 = false;
        goto L35
    L30:
        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
    L26:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L9:
        return ImageHeaderParser$ImageType.GIF;
    L5:
        return ImageHeaderParser$ImageType.JPEG;
    L83:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1721i(InterfaceC0835Tc r5, C2812zp r6) {
        if (m1720h(r5) != ImageHeaderParser$ImageType.JPEG) goto L19;
        int r1 = m1723k(r5, 226);
    L6:
        if (r1 <= 0) goto L19;
        byte[] r3 = (byte[]) r6.m5441c(r1, byte[].class);
        if (r5.mo239l(r1, r3) == r1) goto L11;
        boolean r12 = false;
    L12:
        if (r12 == true) goto L13;
        r6.m5445g(r3);
        r1 = m1723k(r5, 226);
        goto L6
    L13:
        r6.m5445g(r3);
        return true;
    L11:
        r12 = m1722j(r3, r1, f2766b);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        r6.m5445g(r3);
        throw th;
    L19:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1722j(byte[] r4, int r5, byte[] r6) {
        if (r4 == null) goto L8;
        if (r6 == null) goto L8;
        if (r5 <= r6.length) goto L8;
        boolean r52 = true;
    L9:
        if (r52 == false) goto L17;
        int r1 = 0;
    L12:
        if (r1 >= r6.length) goto L17;
        if (r4[r1] != r6[r1]) goto L15;
        r1 = r1 + 1;
        goto L12
    L15:
        return false;
    L17:
        return r52;
    L8:
        r52 = false;
        goto L9
    }

    /* JADX INFO: renamed from: k */
    public static int m1723k(InterfaceC0835Tc r4, int r5) {
    L3:
        if (r4.mo234f() != 255) goto L15;
        short r0 = r4.mo234f();
        if (r0 == 218) goto L24;
        if (r0 == 217) goto L25;
        int r1 = r4.mo236h() - 2;
        if (r0 == r5) goto L17;
        long r02 = r1;
        if (r4.skip(r02) == r02) goto L3;
        return -1;
    L17:
        return r1;
    L25:
        return -1;
    L24:
        return -1;
    L15:
        return -1;
    }

    /* JADX INFO: renamed from: l */
    public static int m1724l(InterfaceC0835Tc r8, byte[] r9, int r10) {
        if (r8.mo239l(r10, r9) == r10) goto L6;
    L67:
        return -1;
    L6:
        if (m1722j(r9, r10, f2765a) == false) goto L67;
        ByteBuffer r82 = (ByteBuffer) ByteBuffer.wrap(r9).order(ByteOrder.BIG_ENDIAN).limit(r10);
        if ((r82.remaining() - 6) < 2) goto L10;
        short r92 = r82.getShort(6);
    L12:
        if (r92 != 18761) goto L14;
        ByteOrder r93 = ByteOrder.LITTLE_ENDIAN;
    L18:
        r82.order(r93);
        if ((r82.remaining() - 10) < 4) goto L21;
        int r94 = r82.getInt(10);
    L22:
        int r102 = r94 + 6;
        if ((r82.remaining() - r102) < 2) goto L25;
        short r103 = r82.getShort(r102);
    L26:
        int r3 = 0;
    L27:
        if (r3 >= r103) goto L67;
        int r5 = (r3 * 12) + (r94 + 8);
        if ((r82.remaining() - r5) < 2) goto L31;
        short r4 = r82.getShort(r5);
    L33:
        if (r4 != 274) goto L66;
        int r42 = r5 + 2;
        if ((r82.remaining() - r42) < 2) goto L38;
        short r43 = r82.getShort(r42);
    L40:
        if (r43 < 1) goto L66;
        if (r43 > 12) goto L66;
        int r6 = r5 + 4;
        if ((r82.remaining() - r6) < 4) goto L47;
        int r62 = r82.getInt(r6);
    L48:
        if (r62 < 0) goto L66;
        int r63 = r62 + f2767c[r43];
        if (r63 > 4) goto L66;
        int r52 = r5 + 8;
        if (r52 < 0) goto L66;
        if (r52 > r82.remaining()) goto L66;
        if (r63 < 0) goto L66;
        if ((r63 + r52) > r82.remaining()) goto L66;
        if ((r82.remaining() - r52) >= 2) goto L65;
        return -1;
    L65:
        return r82.getShort(r52);
    L47:
        r62 = -1;
        goto L48
    L38:
        r43 = -1;
    L66:
        r3 = r3 + 1;
        goto L27
    L31:
        r4 = -1;
        goto L33
    L25:
        r103 = -1;
        goto L26
    L21:
        r94 = -1;
        goto L22
    L14:
        if (r92 == 19789) goto L16;
        r93 = ByteOrder.BIG_ENDIAN;
        goto L18
    L16:
        r93 = ByteOrder.BIG_ENDIAN;
        goto L18
    L10:
        r92 = -1;
        goto L12
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: a */
    public final ImageHeaderParser$ImageType mo566a(ByteBuffer r3) {
        AbstractC0714Qj.m1488j("Argument must not be null", r3);
        return m1720h(new C2400q6(1, r3));
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: b */
    public final int mo567b(InputStream r3, C2812zp r4) {
        C0132D2 r0 = new C0132D2(15, r3);
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        return m1719g(r0, r4);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: c */
    public final boolean mo568c(ByteBuffer r3, C2812zp r4) {
        C2400q6 r0 = new C2400q6(1, r3);
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        return m1721i(r0, r4);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: d */
    public final int mo569d(ByteBuffer r3, C2812zp r4) {
        C2400q6 r0 = new C2400q6(1, r3);
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        return m1719g(r0, r4);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: e */
    public final boolean mo570e(InputStream r4, C2812zp r5) {
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        C0132D2 r0 = new C0132D2(15, r4);
        AbstractC0714Qj.m1488j("Argument must not be null", r5);
        return m1721i(r0, r5);
    }

    @Override // p000.InterfaceC1331dl
    /* JADX INFO: renamed from: f */
    public final ImageHeaderParser$ImageType mo571f(InputStream r3) {
        return m1720h(new C0132D2(15, r3));
    }
}
