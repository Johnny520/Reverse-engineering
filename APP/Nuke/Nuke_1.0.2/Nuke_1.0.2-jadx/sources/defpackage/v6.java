package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 extends w51 implements in0 {
    public static final v6 A;
    public static final v6 B;
    public static final v6 C;
    public static final v6 D;
    public static final v6 E;
    public static final v6 F;
    public static final v6 G;
    public static final v6 H;
    public static final v6 I;
    public static final v6 J;
    public static final v6 K;
    public static final v6 L;
    public static final v6 M;
    public static final v6 j;
    public static final v6 k;
    public static final v6 l;
    public static final v6 m;
    public static final v6 n;
    public static final v6 o;
    public static final v6 p;
    public static final v6 q;
    public static final v6 r;
    public static final v6 s;
    public static final v6 t;
    public static final v6 u;
    public static final v6 v;
    public static final v6 w;
    public static final v6 x;
    public static final v6 y;
    public static final v6 z;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        j = new v6(i, 0);
        k = new v6(i, 1);
        l = new v6(i, 2);
        m = new v6(i, 3);
        n = new v6(i, 4);
        o = new v6(i, 5);
        p = new v6(i, 6);
        q = new v6(i, 7);
        r = new v6(i, 8);
        s = new v6(i, 9);
        t = new v6(i, 10);
        u = new v6(i, 11);
        v = new v6(i, 12);
        w = new v6(i, 13);
        x = new v6(i, 14);
        y = new v6(i, 15);
        z = new v6(i, 16);
        A = new v6(i, 17);
        B = new v6(i, 18);
        C = new v6(i, 19);
        D = new v6(i, 20);
        E = new v6(i, 21);
        F = new v6(i, 22);
        G = new v6(i, 23);
        H = new v6(i, 24);
        I = new v6(i, 25);
        J = new v6(i, 26);
        K = new v6(i, 27);
        L = new v6(i, 28);
        M = new v6(i, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(int i, int i2) {
        super(i);
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                yy1 yy1Var = (yy1) obj;
                my myVar = r7.a;
                yy1Var.getClass();
                op0.w(yy1Var, myVar);
                break;
            case 3:
                break;
            case 4:
                v41[] v41VarArr = xn2.a;
                ((zn2) obj).a(vn2.y, a83Var);
                break;
            case 5:
                ((Number) obj).longValue();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                break;
            case 7:
                v41[] v41VarArr2 = xn2.a;
                ((zn2) obj).a(vn2.x, a83Var);
                break;
            case 8:
                break;
            case 9:
                ic icVar = (ic) obj;
                icVar.getHandler().post(new l6(icVar.y, 4));
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 14:
                us usVar = (us) obj;
                usVar.getClass();
                break;
            case 15:
                long jA = ju.a(((ju) obj).a, uu.x);
                break;
            case 16:
                ((Number) obj).longValue();
                break;
            case 17:
                hx hxVar = (hx) obj;
                r61 r61Var = hxVar instanceof r61 ? (r61) hxVar : null;
                if (r61Var != null && r61Var.X) {
                    kz0.b("Apply is called on deactivated node " + hxVar);
                }
                break;
            case 18:
                break;
            case 19:
                float[] fArr = ((hf1) obj).a;
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                float[] fArr2 = ((hf1) obj).a;
                break;
            case 21:
                String str = (String) obj;
                str.getClass();
                break;
            case 22:
                Class cls = (Class) obj;
                cls.getClass();
                break;
            case 23:
                break;
            case 24:
                long j2 = ((m33) obj).a;
                break;
            case 25:
                kd kdVar = (kd) obj;
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return a83Var;
    }
}
