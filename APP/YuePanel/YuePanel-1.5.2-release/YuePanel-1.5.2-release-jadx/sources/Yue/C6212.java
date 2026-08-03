package Yue;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6212 extends C7710 {

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۥ$ۥ */
    public static final class C0940 extends C3520 {
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C0940 m19143(int i, int i2, ByteBuffer byteBuffer) {
            m584(i, i2, byteBuffer);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6212 m19144(int i) {
            return m19145(new C6212(), i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public C6212 m19145(C6212 c6212, int i) {
            return c6212.m19129(C7710.m24508(m583(i), this.f5949), this.f5949);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m19113() {
        C4121.m1089();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m19115(C4866 c4866, int i) {
        c4866.m14903(6, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m19116(C4866 c4866, short s) {
        c4866.m14904(3, s, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m19117(C4866 c4866, boolean z) {
        c4866.m1769(1, z, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m19118(C4866 c4866, short s) {
        c4866.m14904(5, s, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m19119(C4866 c4866, int i) {
        c4866.m14899(0, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m19120(C4866 c4866, short s) {
        c4866.m14904(2, s, 0);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m19121(C4866 c4866, short s) {
        c4866.m14904(4, s, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static int m19122(C4866 c4866, int[] iArr) {
        c4866.m14946(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c4866.m14898(iArr[length]);
        }
        return c4866.m14919();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static int m19123(C4866 c4866, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        c4866.m14945(7);
        m19115(c4866, i2);
        m19119(c4866, i);
        m19118(c4866, s4);
        m19121(c4866, s3);
        m19116(c4866, s2);
        m19120(c4866, s);
        m19117(c4866, z);
        return m19124(c4866);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static int m19124(C4866 c4866) {
        return c4866.m14918();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static C6212 m19125(ByteBuffer byteBuffer) {
        return m19126(byteBuffer, new C6212());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static C6212 m19126(ByteBuffer byteBuffer, C6212 c6212) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c6212.m19129(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m19127(C4866 c4866, int i) {
        c4866.m14946(4, i, 4);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m19128(C4866 c4866) {
        c4866.m14945(7);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C6212 m19129(int i, ByteBuffer byteBuffer) {
        m19130(i, byteBuffer);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m19130(int i, ByteBuffer byteBuffer) {
        m24516(i, byteBuffer);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int m19131(int i) {
        int iM24514 = m24514(16);
        if (iM24514 != 0) {
            return this.f3040.getInt(m24519(iM24514) + (i * 4));
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public ByteBuffer m19132() {
        return m24520(16, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public ByteBuffer m19133(ByteBuffer byteBuffer) {
        return m24521(byteBuffer, 16, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int m19134() {
        int iM24514 = m24514(16);
        if (iM24514 != 0) {
            return m24522(iM24514);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public C5461 m19135() {
        return m19136(new C5461());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public C5461 m19136(C5461 c5461) {
        int iM24514 = m24514(16);
        if (iM24514 != 0) {
            return c5461.m16978(m24519(iM24514), this.f3040);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public short m19137() {
        int iM24514 = m24514(10);
        if (iM24514 != 0) {
            return this.f3040.getShort(iM24514 + this.f3039);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean m19138() {
        int iM24514 = m24514(6);
        return (iM24514 == 0 || this.f3040.get(iM24514 + this.f3039) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public short m19139() {
        int iM24514 = m24514(14);
        if (iM24514 != 0) {
            return this.f3040.getShort(iM24514 + this.f3039);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int m19140() {
        int iM24514 = m24514(4);
        if (iM24514 != 0) {
            return this.f3040.getInt(iM24514 + this.f3039);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public short m19141() {
        int iM24514 = m24514(8);
        if (iM24514 != 0) {
            return this.f3040.getShort(iM24514 + this.f3039);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public short m19142() {
        int iM24514 = m24514(12);
        if (iM24514 != 0) {
            return this.f3040.getShort(iM24514 + this.f3039);
        }
        return (short) 0;
    }
}
