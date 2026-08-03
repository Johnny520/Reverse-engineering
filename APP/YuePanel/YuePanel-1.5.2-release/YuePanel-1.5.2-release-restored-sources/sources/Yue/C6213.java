package Yue;

import Yue.C6212;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6213 extends C7710 {

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۦ$ۥ */
    public static final class C0941 extends C3520 {
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C0941 m19171(int i, int i2, ByteBuffer byteBuffer) {
            m584(i, i2, byteBuffer);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6213 m19172(int i) {
            return m19173(new C6213(), i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C6213 m19173(C6213 c6213, int i) {
            return c6213.m19160(C7710.m24508(m583(i), this.f5949), this.f5949);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m19146() {
        C4121.m1089();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m19148(C4866 c4866, int i) {
        c4866.m14903(1, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m19149(C4866 c4866, int i) {
        c4866.m14903(2, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m19150(C4866 c4866, int i) {
        c4866.m14899(0, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static int m19151(C4866 c4866, int[] iArr) {
        c4866.m14946(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c4866.m14902(iArr[length]);
        }
        return c4866.m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static int m19152(C4866 c4866, int i, int i2, int i3) {
        c4866.m14945(3);
        m19149(c4866, i3);
        m19148(c4866, i2);
        m19150(c4866, i);
        return m19153(c4866);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static int m19153(C4866 c4866) {
        return c4866.m14918();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m19154(C4866 c4866, int i) {
        c4866.m14920(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m19155(C4866 c4866, int i) {
        c4866.m14924(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static C6213 m19156(ByteBuffer byteBuffer) {
        return m19157(byteBuffer, new C6213());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static C6213 m19157(ByteBuffer byteBuffer, C6213 c6213) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c6213.m19160(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static void m19158(C4866 c4866, int i) {
        c4866.m14946(4, i, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static void m19159(C4866 c4866) {
        c4866.m14945(3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C6213 m19160(int i, ByteBuffer byteBuffer) {
        m19161(i, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m19161(int i, ByteBuffer byteBuffer) {
        m24516(i, byteBuffer);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public C6212 m19162(int i) {
        return m19163(new C6212(), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public C6212 m19163(C6212 c6212, int i) {
        int iM24514 = m24514(6);
        if (iM24514 != 0) {
            return c6212.m19129(m3813(m24519(iM24514) + (i * 4)), this.f3040);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int m19164() {
        int iM24514 = m24514(6);
        if (iM24514 != 0) {
            return m24522(iM24514);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C6212.C0940 m19165() {
        return m19166(new C6212.C0940());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C6212.C0940 m19166(C6212.C0940 c0940) {
        int iM24514 = m24514(6);
        if (iM24514 != 0) {
            return c0940.m19143(m24519(iM24514), 4, this.f3040);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public String m19167() {
        int iM24514 = m24514(8);
        if (iM24514 != 0) {
            return m24517(iM24514 + this.f3039);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public ByteBuffer m19168() {
        return m24520(8, 1);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public ByteBuffer m19169(ByteBuffer byteBuffer) {
        return m24521(byteBuffer, 8, 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public int m19170() {
        int iM24514 = m24514(4);
        if (iM24514 != 0) {
            return this.f3040.getInt(iM24514 + this.f3039);
        }
        return 0;
    }
}
