package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6131 extends C6130 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final double m18728(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final float m18729(float f, float f2) {
        return (float) Math.IEEEremainder(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final double m18730(double d) {
        return Math.abs(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final float m18731(float f) {
        return Math.abs(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m18732(int i) {
        return Math.abs(i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m18733(long j) {
        return Math.abs(j);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final double m18734(double d) {
        return Math.acos(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final float m18735(float f) {
        return (float) Math.acos(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final double m18736(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > C4120.f8255) {
            return Math.log(d) + C4120.f692;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= C4120.f8254) {
            return Math.log(d + Math.sqrt((d * d) - d2));
        }
        double dSqrt = Math.sqrt(d3);
        if (dSqrt >= C4120.f8253) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final float m18737(float f) {
        return (float) m18736(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final double m18738(double d) {
        return Math.asin(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final float m18739(float f) {
        return (float) Math.asin(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final double m18740(double d) {
        double d2 = C4120.f8254;
        if (d < d2) {
            return d <= (-d2) ? -m18740(-d) : Math.abs(d) >= C4120.f8253 ? d - (((d * d) * d) / ((double) 6)) : d;
        }
        if (d <= C4120.f8256) {
            return Math.log(d + Math.sqrt((d * d) + ((double) 1)));
        }
        if (d > C4120.f8255) {
            return Math.log(d) + C4120.f692;
        }
        double d3 = d * ((double) 2);
        return Math.log(d3 + (((double) 1) / d3));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final float m18741(float f) {
        return (float) m18740(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final double m18742(double d) {
        return Math.atan(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final float m18743(float f) {
        return (float) Math.atan(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final double m18744(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final float m18745(float f, float f2) {
        return (float) Math.atan2(f, f2);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final double m18746(double d) {
        if (Math.abs(d) < C4120.f8254) {
            return Math.abs(d) > C4120.f8253 ? d + (((d * d) * d) / ((double) 3)) : d;
        }
        double d2 = 1;
        return Math.log((d2 + d) / (d2 - d)) / ((double) 2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final float m18747(float f) {
        return (float) m18746(f);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final double m18748(double d) {
        return Math.cbrt(d);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final float m18749(float f) {
        return (float) Math.cbrt(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final double m18750(double d) {
        return Math.ceil(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final float m18751(float f) {
        return (float) Math.ceil(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final double m18752(double d) {
        return Math.cos(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final float m18753(float f) {
        return (float) Math.cos(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final double m18754(double d) {
        return Math.cosh(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final float m18755(float f) {
        return (float) Math.cosh(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final double m18756(double d) {
        return Math.exp(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final float m18757(float f) {
        return (float) Math.exp(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final double m18758(double d) {
        return Math.expm1(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final float m18759(float f) {
        return (float) Math.expm1(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final double m18760(double d) {
        return Math.floor(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final float m18761(float f) {
        return (float) Math.floor(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final double m18762(double d) {
        return Math.abs(d);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final float m18763(float f) {
        return Math.abs(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m18764(int i) {
        return Math.abs(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final long m18765(long j) {
        return Math.abs(j);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m18766(double d) {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m18767(float f) {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m18768(int i) {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static /* synthetic */ void m18769(long j) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final double m18770(double d) {
        return Math.signum(d);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final float m18771(float f) {
        return Math.signum(f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static int m18772(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static int m18773(long j) {
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m18774(double d) {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m18775(float f) {
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m18776(int i) {
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m18777(long j) {
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final double m18778(double d) {
        return Math.ulp(d);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final float m18779(float f) {
        return Math.ulp(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m18780(double d) {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m18781(float f) {
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final double m18782(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final float m18783(float f, float f2) {
        return (float) Math.hypot(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final double m18784(double d) {
        return Math.log(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final float m18785(float f) {
        return (float) Math.log(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final double m18786(double d) {
        return Math.log1p(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final float m18787(float f) {
        return (float) Math.log1p(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final double m18788(double d, double d2) {
        if (d2 <= 0.0d || d2 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d) / Math.log(d2);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final float m18789(float f, float f2) {
        if (f2 <= 0.0f || f2 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f) / Math.log(f2));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final double m18790(double d) {
        return Math.log10(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final float m18791(float f) {
        return (float) Math.log10(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final double m18792(double d) {
        return Math.log(d) / C4120.f692;
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final float m18793(float f) {
        return (float) (Math.log(f) / C4120.f692);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final double m18794(double d, double d2) {
        return Math.max(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final float m18795(float f, float f2) {
        return Math.max(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final int m18796(int i, int i2) {
        return Math.max(i, i2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final long m18797(long j, long j2) {
        return Math.max(j, j2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final double m18798(double d, double d2) {
        return Math.min(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final float m18799(float f, float f2) {
        return Math.min(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final int m18800(int i, int i2) {
        return Math.min(i, i2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final long m18801(long j, long j2) {
        return Math.min(j, j2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final double m18802(double d) {
        return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final float m18803(float f) {
        return Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final double m18804(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final float m18805(float f, float f2) {
        return Math.nextAfter(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final double m18806(double d) {
        return Math.nextUp(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final float m18807(float f) {
        return Math.nextUp(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final double m18808(double d, double d2) {
        return Math.pow(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final double m18809(double d, int i) {
        return Math.pow(d, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final float m18810(float f, float f2) {
        return (float) Math.pow(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final float m18811(float f, int i) {
        return (float) Math.pow(f, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final double m18812(double d) {
        return Math.rint(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final float m18813(float f) {
        return (float) Math.rint(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static int m18814(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int m18815(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static long m18816(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final long m18817(float f) {
        return m18816(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final double m18818(double d) {
        return Math.signum(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final float m18819(float f) {
        return Math.signum(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final double m18820(double d) {
        return Math.sin(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final float m18821(float f) {
        return (float) Math.sin(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final double m18822(double d) {
        return Math.sinh(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final float m18823(float f) {
        return (float) Math.sinh(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final double m18824(double d) {
        return Math.sqrt(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final float m18825(float f) {
        return (float) Math.sqrt(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final double m18826(double d) {
        return Math.tan(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final float m18827(float f) {
        return (float) Math.tan(f);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final double m18828(double d) {
        return Math.tanh(d);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final float m18829(float f) {
        return (float) Math.tanh(f);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final double m18830(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d : d > 0.0d ? Math.floor(d) : Math.ceil(d);
    }

    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final float m18831(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        return (float) (f > 0.0f ? Math.floor(f) : Math.ceil(f));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final double m18832(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final double m18833(double d, int i) {
        return Math.copySign(d, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final float m18834(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final float m18835(float f, int i) {
        return Math.copySign(f, i);
    }
}
