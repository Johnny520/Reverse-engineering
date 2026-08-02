package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oq0 extends w51 implements in0 {
    public static final oq0 A;
    public static final oq0 B;
    public static final oq0 C;
    public static final oq0 D;
    public static final oq0 E;
    public static final oq0 j;
    public static final oq0 k;
    public static final oq0 l;
    public static final oq0 m;
    public static final oq0 n;
    public static final oq0 o;
    public static final oq0 p;
    public static final oq0 q;
    public static final oq0 r;
    public static final oq0 s;
    public static final oq0 t;
    public static final oq0 u;
    public static final oq0 v;
    public static final oq0 w;
    public static final oq0 x;
    public static final oq0 y;
    public static final oq0 z;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        j = new oq0(i, 0);
        k = new oq0(i, 1);
        l = new oq0(i, 2);
        m = new oq0(i, 3);
        n = new oq0(i, 4);
        o = new oq0(i, 5);
        p = new oq0(i, 6);
        q = new oq0(i, 7);
        r = new oq0(i, 8);
        s = new oq0(i, 9);
        t = new oq0(i, 10);
        u = new oq0(i, 11);
        v = new oq0(i, 12);
        w = new oq0(i, 13);
        x = new oq0(i, 14);
        y = new oq0(i, 15);
        z = new oq0(i, 16);
        A = new oq0(i, 17);
        B = new oq0(i, 18);
        C = new oq0(i, 19);
        D = new oq0(i, 20);
        E = new oq0(i, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(int i, Object obj) {
        super(1);
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015c  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return a83Var;
            case 1:
                nc0.i0((nc0) obj, ju.f, 0L, 0L, 126);
                return a83Var;
            case 2:
                uz1 uz1Var = (uz1) obj;
                if (uz1Var.B()) {
                    kd1 kd1Var = uz1Var.i;
                    if (!kd1Var.r) {
                        in0 in0VarD = uz1Var.h.d();
                        rk1 rk1Var = kd1Var.u;
                        if (in0VarD != null) {
                            kd1Var.n0(uz1Var, 9223372034707292159L, 0L);
                            kd1Var.n = in0VarD;
                        } else if (rk1Var != null) {
                            Object[] objArr = rk1Var.c;
                            long[] jArr = rk1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j2) < 128) {
                                                kd1Var.F0((sk1) objArr[(i2 << 3) + i4]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 == 8) {
                                            if (i2 != length) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                            rk1Var.a();
                        }
                    }
                }
                return a83Var;
            case 3:
                yv1 yv1Var = ((zn1) obj).S;
                if (yv1Var != null) {
                    ((sq0) yv1Var).c();
                }
                return a83Var;
            case 4:
                zn1 zn1Var = (zn1) obj;
                r61 r61Var = zn1Var.v;
                try {
                    if (zn1Var.B()) {
                        zn1Var.s1(true);
                        break;
                    }
                    return a83Var;
                } catch (Throwable th) {
                    r61Var.Y(th);
                    throw null;
                }
            case 5:
                ps1 ps1Var = (ps1) obj;
                if (ps1Var.B()) {
                    ps1Var.h.L();
                }
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                r61 r61Var2 = (r61) obj;
                if (r61Var2.H()) {
                    r61Var2.U(false);
                }
                return a83Var;
            case 7:
                r61 r61Var3 = (r61) obj;
                if (r61Var3.H()) {
                    r61Var3.U(false);
                }
                return a83Var;
            case 8:
                r61 r61Var4 = (r61) obj;
                if (r61Var4.H()) {
                    r61Var4.S(false);
                }
                return a83Var;
            case 9:
                r61 r61Var5 = (r61) obj;
                if (r61Var5.H()) {
                    r61Var5.S(false);
                }
                return a83Var;
            case 10:
                r61 r61Var6 = (r61) obj;
                if (r61Var6.H()) {
                    r61.T(r61Var6, false, 7);
                }
                return a83Var;
            case 11:
                r61 r61Var7 = (r61) obj;
                if (r61Var7.H()) {
                    r61.V(r61Var7, false, 7);
                }
                return a83Var;
            case 12:
                r61 r61Var8 = (r61) obj;
                if (r61Var8.H()) {
                    r61Var8.F();
                }
                return a83Var;
            case 13:
                return a83Var;
            case 14:
                d22 d22Var = (d22) obj;
                if (d22Var.isAttachedToWindow()) {
                    d22Var.r();
                }
                return a83Var;
            case 15:
                return a83Var;
            case 16:
                return Integer.valueOf(((gl2) obj).b);
            case 17:
                d11 d11Var = ((gl2) obj).c;
                return Integer.valueOf(d11Var.d - d11Var.b);
            case 18:
                return a83Var;
            case 19:
                int i5 = ((wx0) obj).a;
                return a83Var;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return a83Var;
            case 21:
                int i6 = ((wx0) obj).a;
                return a83Var;
            case 22:
                ((wu0) obj).getClass();
                return Boolean.TRUE;
            default:
                xn2.b((zn2) obj);
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq0(int i, int i2) {
        super(i);
        this.i = i2;
    }
}
