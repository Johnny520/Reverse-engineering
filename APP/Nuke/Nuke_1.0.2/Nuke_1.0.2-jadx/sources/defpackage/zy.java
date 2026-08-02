package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy {
    public static final zj1 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ka2 ka2Var = uu.e;
        int i = ka2Var.c;
        wy wyVar = new wy(ka2Var, ka2Var, 1);
        int i2 = ka2Var.c;
        ft1 ft1Var = uu.x;
        int i3 = (ft1Var.c << 6) | i2;
        yy yyVar = new yy(ka2Var, ft1Var, 0);
        int i4 = (i2 << 6) | ft1Var.c;
        yy yyVar2 = new yy(ft1Var, ka2Var, 0);
        zj1 zj1Var = y01.a;
        zj1 zj1Var2 = new zj1();
        zj1Var2.h(i | (i << 6), wyVar);
        zj1Var2.h(i3, yyVar);
        zj1Var2.h(i4, yyVar2);
        a = zj1Var2;
    }
}
