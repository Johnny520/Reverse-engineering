package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 extends w51 implements in0 {

    /* JADX INFO: renamed from: A */
    public static final oq0 f7767A;

    /* JADX INFO: renamed from: B */
    public static final oq0 f7768B;

    /* JADX INFO: renamed from: C */
    public static final oq0 f7769C;

    /* JADX INFO: renamed from: D */
    public static final oq0 f7770D;

    /* JADX INFO: renamed from: E */
    public static final oq0 f7771E;

    /* JADX INFO: renamed from: j */
    public static final oq0 f7772j;

    /* JADX INFO: renamed from: k */
    public static final oq0 f7773k;

    /* JADX INFO: renamed from: l */
    public static final oq0 f7774l;

    /* JADX INFO: renamed from: m */
    public static final oq0 f7775m;

    /* JADX INFO: renamed from: n */
    public static final oq0 f7776n;

    /* JADX INFO: renamed from: o */
    public static final oq0 f7777o;

    /* JADX INFO: renamed from: p */
    public static final oq0 f7778p;

    /* JADX INFO: renamed from: q */
    public static final oq0 f7779q;

    /* JADX INFO: renamed from: r */
    public static final oq0 f7780r;

    /* JADX INFO: renamed from: s */
    public static final oq0 f7781s;

    /* JADX INFO: renamed from: t */
    public static final oq0 f7782t;

    /* JADX INFO: renamed from: u */
    public static final oq0 f7783u;

    /* JADX INFO: renamed from: v */
    public static final oq0 f7784v;

    /* JADX INFO: renamed from: w */
    public static final oq0 f7785w;

    /* JADX INFO: renamed from: x */
    public static final oq0 f7786x;

    /* JADX INFO: renamed from: y */
    public static final oq0 f7787y;

    /* JADX INFO: renamed from: z */
    public static final oq0 f7788z;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7789i;

    static {
        int i = 1;
        f7772j = new oq0(i, 0);
        f7773k = new oq0(i, 1);
        f7774l = new oq0(i, 2);
        f7775m = new oq0(i, 3);
        f7776n = new oq0(i, 4);
        f7777o = new oq0(i, 5);
        f7778p = new oq0(i, 6);
        f7779q = new oq0(i, 7);
        f7780r = new oq0(i, 8);
        f7781s = new oq0(i, 9);
        f7782t = new oq0(i, 10);
        f7783u = new oq0(i, 11);
        f7784v = new oq0(i, 12);
        f7785w = new oq0(i, 13);
        f7786x = new oq0(i, 14);
        f7787y = new oq0(i, 15);
        f7788z = new oq0(i, 16);
        f7767A = new oq0(i, 17);
        f7768B = new oq0(i, 18);
        f7769C = new oq0(i, 19);
        f7770D = new oq0(i, 20);
        f7771E = new oq0(i, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(int i, Object obj) {
        super(1);
        this.f7789i = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x015c  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        int i = this.f7789i;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return a83Var;
            case 1:
                nc0.m3270i0((nc0) obj, C0363ju.f5216f, 0L, 0L, 126);
                return a83Var;
            case 2:
                uz1 uz1Var = (uz1) obj;
                if (uz1Var.mo298B()) {
                    kd1 kd1Var = uz1Var.f11568i;
                    if (!kd1Var.f5468r) {
                        in0 in0VarMo107d = uz1Var.f11567h.mo107d();
                        rk1 rk1Var = kd1Var.f5471u;
                        if (in0VarMo107d != null) {
                            kd1Var.m2638n0(uz1Var, 9223372034707292159L, 0L);
                            kd1Var.f5464n = in0VarMo107d;
                        } else if (rk1Var != null) {
                            Object[] objArr = rk1Var.f9620c;
                            long[] jArr = rk1Var.f9618a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j) < 128) {
                                                kd1Var.m2634F0((sk1) objArr[(i2 << 3) + i4]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i3 == 8) {
                                            if (i2 != length) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                            rk1Var.m4499a();
                        }
                    }
                }
                return a83Var;
            case 3:
                yv1 yv1Var = ((zn1) obj).f13984S;
                if (yv1Var != null) {
                    ((sq0) yv1Var).m4969c();
                }
                return a83Var;
            case 4:
                zn1 zn1Var = (zn1) obj;
                r61 r61Var = zn1Var.f13985v;
                try {
                    if (zn1Var.mo298B()) {
                        zn1Var.m6474s1(true);
                        break;
                    }
                    return a83Var;
                } catch (Throwable th) {
                    r61Var.m4364Y(th);
                    throw null;
                }
            case 5:
                ps1 ps1Var = (ps1) obj;
                if (ps1Var.mo298B()) {
                    ps1Var.f8551h.mo1847L();
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                r61 r61Var2 = (r61) obj;
                if (r61Var2.m4350H()) {
                    r61Var2.m4362U(false);
                }
                return a83Var;
            case 7:
                r61 r61Var3 = (r61) obj;
                if (r61Var3.m4350H()) {
                    r61Var3.m4362U(false);
                }
                return a83Var;
            case 8:
                r61 r61Var4 = (r61) obj;
                if (r61Var4.m4350H()) {
                    r61Var4.m4361S(false);
                }
                return a83Var;
            case 9:
                r61 r61Var5 = (r61) obj;
                if (r61Var5.m4350H()) {
                    r61Var5.m4361S(false);
                }
                return a83Var;
            case 10:
                r61 r61Var6 = (r61) obj;
                if (r61Var6.m4350H()) {
                    r61.m4340T(r61Var6, false, 7);
                }
                return a83Var;
            case 11:
                r61 r61Var7 = (r61) obj;
                if (r61Var7.m4350H()) {
                    r61.m4341V(r61Var7, false, 7);
                }
                return a83Var;
            case 12:
                r61 r61Var8 = (r61) obj;
                if (r61Var8.m4350H()) {
                    r61Var8.m4348F();
                }
                return a83Var;
            case 13:
                return a83Var;
            case 14:
                d22 d22Var = (d22) obj;
                if (d22Var.isAttachedToWindow()) {
                    d22Var.m934r();
                }
                return a83Var;
            case 15:
                return a83Var;
            case 16:
                return Integer.valueOf(((gl2) obj).f3576b);
            case 17:
                d11 d11Var = ((gl2) obj).f3577c;
                return Integer.valueOf(d11Var.f1810d - d11Var.f1808b);
            case 18:
                return a83Var;
            case 19:
                int i5 = ((wx0) obj).f12704a;
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return a83Var;
            case 21:
                int i6 = ((wx0) obj).f12704a;
                return a83Var;
            case 22:
                ((wu0) obj).getClass();
                return Boolean.TRUE;
            default:
                xn2.m6162b((zn2) obj);
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(int i, int i2) {
        super(i);
        this.f7789i = i2;
    }
}
