package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: vw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0825vw extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public int f12190j;

    /* JADX INFO: renamed from: k */
    public int f12191k;

    /* JADX INFO: renamed from: l */
    public int f12192l;

    /* JADX INFO: renamed from: m */
    public int f12193m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f12194n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C0862ww f12195o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825vw(C0862ww c0862ww, t00 t00Var) {
        super(2, t00Var);
        this.f12195o = c0862ww;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((C0825vw) mo13p((t00) obj2, (vo2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        C0825vw c0825vw = new C0825vw(this.f12195o, t00Var);
        c0825vw.f12194n = obj;
        return c0825vw;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        vo2 vo2Var;
        int i;
        int i2;
        int i3;
        String strM5688g;
        int i4;
        int i5;
        String str;
        C0862ww c0862ww = this.f12195o;
        lk1 lk1Var = c0862ww.f12691h;
        yj1 yj1Var = c0862ww.f12693j;
        int i6 = this.f12193m;
        if (i6 == 0) {
            fg1.m1627T(obj);
            vo2Var = (vo2) this.f12194n;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f12192l;
            i2 = this.f12191k;
            i3 = this.f12190j;
            vo2Var = (vo2) this.f12194n;
            fg1.m1627T(obj);
        }
        if (i3 >= Math.min(c0862ww.f12694k + 10, yj1Var.f13491b)) {
            return a83.f116a;
        }
        int i7 = i3 + 1;
        int iM6283c = yj1Var.m6283c(i3);
        switch (iM6283c) {
            case 0:
                strM5688g = "up";
                break;
            case 1:
                Object objM2930f = lk1Var.m2930f(i2);
                i2++;
                strM5688g = "down " + objM2930f;
                break;
            case 2:
                strM5688g = "remove " + yj1Var.m6283c(i7) + ' ' + yj1Var.m6283c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                strM5688g = "move " + yj1Var.m6283c(i7) + ' ' + yj1Var.m6283c(i3 + 2) + ' ' + yj1Var.m6283c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                strM5688g = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iM6283c2 = yj1Var.m6283c(i7);
                i5 = i2 + 1;
                str = "insertBottomUp " + iM6283c2 + ' ' + lk1Var.m2930f(i2);
                int i8 = i4;
                strM5688g = str;
                i7 = i8;
                i2 = i5;
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                i4 = i3 + 2;
                int iM6283c3 = yj1Var.m6283c(i7);
                i5 = i2 + 1;
                str = "insertTopDown " + iM6283c3 + ' ' + lk1Var.m2930f(i2);
                int i82 = i4;
                strM5688g = str;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object objM2930f2 = lk1Var.m2930f(i2);
                objM2930f2.getClass();
                xe1.m6119f(2, objM2930f2);
                i2 += 2;
                strM5688g = "apply " + ((mn0) objM2930f2);
                break;
            case 8:
                strM5688g = "reuse " + c0862ww.f12692i.m2930f(i);
                i++;
                break;
            case 9:
                strM5688g = "recompose pending";
                break;
            default:
                strM5688g = vi0.m5688g("unknown op: ", iM6283c);
                break;
        }
        this.f12194n = vo2Var;
        this.f12190j = i7;
        this.f12191k = i2;
        this.f12192l = i;
        this.f12193m = 1;
        vo2Var.m5746b(this, i3 + ": " + strM5688g);
        return k20.f5323h;
    }
}
