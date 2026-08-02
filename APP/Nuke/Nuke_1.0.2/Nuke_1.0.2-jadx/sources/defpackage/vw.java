package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vw extends w92 implements mn0 {
    public int j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ww o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(ww wwVar, t00 t00Var) {
        super(2, t00Var);
        this.o = wwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((vw) p((t00) obj2, (vo2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        vw vwVar = new vw(this.o, t00Var);
        vwVar.n = obj;
        return vwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        vo2 vo2Var;
        int i;
        int i2;
        int i3;
        String strG;
        int i4;
        int i5;
        String str;
        ww wwVar = this.o;
        lk1 lk1Var = wwVar.h;
        yj1 yj1Var = wwVar.j;
        int i6 = this.m;
        if (i6 == 0) {
            fg1.T(obj);
            vo2Var = (vo2) this.n;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.l;
            i2 = this.k;
            i3 = this.j;
            vo2Var = (vo2) this.n;
            fg1.T(obj);
        }
        if (i3 >= Math.min(wwVar.k + 10, yj1Var.b)) {
            return a83.a;
        }
        int i7 = i3 + 1;
        int iC = yj1Var.c(i3);
        switch (iC) {
            case 0:
                strG = "up";
                break;
            case 1:
                Object objF = lk1Var.f(i2);
                i2++;
                strG = "down " + objF;
                break;
            case 2:
                strG = "remove " + yj1Var.c(i7) + ' ' + yj1Var.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strG = "move " + yj1Var.c(i7) + ' ' + yj1Var.c(i3 + 2) + ' ' + yj1Var.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strG = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC2 = yj1Var.c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC2 + ' ' + lk1Var.f(i2);
                int i8 = i4;
                strG = str;
                i7 = i8;
                i2 = i5;
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                i4 = i3 + 2;
                int iC3 = yj1Var.c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iC3 + ' ' + lk1Var.f(i2);
                int i82 = i4;
                strG = str;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object objF2 = lk1Var.f(i2);
                objF2.getClass();
                xe1.f(2, objF2);
                i2 += 2;
                strG = "apply " + ((mn0) objF2);
                break;
            case 8:
                strG = "reuse " + wwVar.i.f(i);
                i++;
                break;
            case 9:
                strG = "recompose pending";
                break;
            default:
                strG = vi0.g("unknown op: ", iC);
                break;
        }
        this.n = vo2Var;
        this.j = i7;
        this.k = i2;
        this.l = i;
        this.m = 1;
        vo2Var.b(this, i3 + ": " + strG);
        return k20.h;
    }
}
