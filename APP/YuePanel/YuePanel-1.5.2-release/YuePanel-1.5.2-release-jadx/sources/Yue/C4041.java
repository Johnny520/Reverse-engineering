package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4041 extends C4033 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final byte m11412(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final byte m11413(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final byte m11414(byte b, @InterfaceC6399 byte... bArr) {
        C5499.m17103(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final double m11415(double d, double d2) {
        return Math.max(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final double m11416(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final double m11417(double d, @InterfaceC6399 double... dArr) {
        C5499.m17103(dArr, "other");
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final float m11418(float f, float f2) {
        return Math.max(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final float m11419(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final float m11420(float f, @InterfaceC6399 float... fArr) {
        C5499.m17103(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int m11421(int i, int i2) {
        return Math.max(i, i2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int m11422(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int m11423(int i, @InterfaceC6399 int... iArr) {
        C5499.m17103(iArr, "other");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final long m11424(long j, long j2) {
        return Math.max(j, j2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final long m11425(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m11426(long j, @InterfaceC6399 long... jArr) {
        C5499.m17103(jArr, "other");
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static <T extends Comparable<? super T>> T m11427(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, C6608.f2171);
        C5499.m17103(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m11428(@InterfaceC6399 T t, @InterfaceC6399 T t2, @InterfaceC6399 T t3) {
        C5499.m17103(t, C6608.f2171);
        C5499.m17103(t2, "b");
        C5499.m17103(t3, "c");
        return (T) m11427(t, m11427(t2, t3));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m11429(@InterfaceC6399 T t, @InterfaceC6399 T... tArr) {
        C5499.m17103(t, C6608.f2171);
        C5499.m17103(tArr, "other");
        for (T t2 : tArr) {
            t = (T) m11427(t, t2);
        }
        return t;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final short m11430(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final short m11431(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final short m11432(short s, @InterfaceC6399 short... sArr) {
        C5499.m17103(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final byte m11433(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final byte m11434(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final byte m11435(byte b, @InterfaceC6399 byte... bArr) {
        C5499.m17103(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final double m11436(double d, double d2) {
        return Math.min(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final double m11437(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final double m11438(double d, @InterfaceC6399 double... dArr) {
        C5499.m17103(dArr, "other");
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final float m11439(float f, float f2) {
        return Math.min(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final float m11440(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final float m11441(float f, @InterfaceC6399 float... fArr) {
        C5499.m17103(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final int m11442(int i, int i2) {
        return Math.min(i, i2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final int m11443(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final int m11444(int i, @InterfaceC6399 int... iArr) {
        C5499.m17103(iArr, "other");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final long m11445(long j, long j2) {
        return Math.min(j, j2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final long m11446(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final long m11447(long j, @InterfaceC6399 long... jArr) {
        C5499.m17103(jArr, "other");
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m11448(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, C6608.f2171);
        C5499.m17103(t2, "b");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m11449(@InterfaceC6399 T t, @InterfaceC6399 T t2, @InterfaceC6399 T t3) {
        C5499.m17103(t, C6608.f2171);
        C5499.m17103(t2, "b");
        C5499.m17103(t3, "c");
        return (T) m11448(t, m11448(t2, t3));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m11450(@InterfaceC6399 T t, @InterfaceC6399 T... tArr) {
        C5499.m17103(t, C6608.f2171);
        C5499.m17103(tArr, "other");
        for (T t2 : tArr) {
            t = (T) m11448(t, t2);
        }
        return t;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final short m11451(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final short m11452(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final short m11453(short s, @InterfaceC6399 short... sArr) {
        C5499.m17103(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }
}
