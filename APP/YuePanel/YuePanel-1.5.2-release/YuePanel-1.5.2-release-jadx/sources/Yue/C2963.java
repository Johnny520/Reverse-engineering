package Yue;

import Yue.C3600;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
@InterfaceC5572(name = "-SegmentedByteString")
public final class C2963 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3600.C0192 f13 = new C3600.C0192();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f14 = -1234567890;

    /* JADX INFO: renamed from: ۥ */
    public static final int m29(byte b, int i) {
        return b & i;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m30(byte b, long j) {
        return ((long) b) & j;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m5675(int i, long j) {
        return ((long) i) & j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m5676(@InterfaceC6399 byte[] bArr, int i, @InterfaceC6399 byte[] bArr2, int i2, int i3) {
        C5499.m17103(bArr, C6608.f2171);
        C5499.m17103(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m5677(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m5678() {
        return f14;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C3600.C0192 m5679() {
        return f13;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m5680() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m5681(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m5682(int i, long j) {
        return Math.min(i, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m5683(long j, int i) {
        return Math.min(j, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m5684(@InterfaceC6399 C3630 c3630, int i) {
        C5499.m17103(c3630, "<this>");
        return i == f14 ? c3630.m9852() : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m5685(@InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(bArr, "<this>");
        return i == f14 ? bArr.length : i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final C3600.C0192 m5686(@InterfaceC6399 C3600.C0192 c0192) {
        C5499.m17103(c0192, "unsafeCursor");
        return c0192 == f13 ? new C3600.C0192() : c0192;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m5687(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m5688(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final short m5689(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long m5690(long j, int i) {
        return (j << (64 - i)) | (j >>> i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int m5691(byte b, int i) {
        return b << i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m5692(byte b, int i) {
        return b >> i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String m5693(byte b) {
        return C7627.m23957(new char[]{C2949.m5545()[(b >> 4) & 15], C2949.m5545()[b & 15]});
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String m5694(int i) {
        int i2 = 0;
        if (i == 0) {
            return "0";
        }
        char[] cArr = {C2949.m5545()[(i >> 28) & 15], C2949.m5545()[(i >> 24) & 15], C2949.m5545()[(i >> 20) & 15], C2949.m5545()[(i >> 16) & 15], C2949.m5545()[(i >> 12) & 15], C2949.m5545()[(i >> 8) & 15], C2949.m5545()[(i >> 4) & 15], C2949.m5545()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return C7627.m23958(cArr, i2, 8);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String m5695(long j) {
        if (j == 0) {
            return "0";
        }
        char[] cArr = {C2949.m5545()[(int) ((j >> 60) & 15)], C2949.m5545()[(int) ((j >> 56) & 15)], C2949.m5545()[(int) ((j >> 52) & 15)], C2949.m5545()[(int) ((j >> 48) & 15)], C2949.m5545()[(int) ((j >> 44) & 15)], C2949.m5545()[(int) ((j >> 40) & 15)], C2949.m5545()[(int) ((j >> 36) & 15)], C2949.m5545()[(int) ((j >> 32) & 15)], C2949.m5545()[(int) ((j >> 28) & 15)], C2949.m5545()[(int) ((j >> 24) & 15)], C2949.m5545()[(int) ((j >> 20) & 15)], C2949.m5545()[(int) ((j >> 16) & 15)], C2949.m5545()[(int) ((j >> 12) & 15)], C2949.m5545()[(int) ((j >> 8) & 15)], C2949.m5545()[(int) ((j >> 4) & 15)], C2949.m5545()[(int) (j & 15)]};
        int i = 0;
        while (i < 16 && cArr[i] == '0') {
            i++;
        }
        return C7627.m23958(cArr, i, 16);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final byte m5696(byte b, byte b2) {
        return (byte) (b ^ b2);
    }
}
