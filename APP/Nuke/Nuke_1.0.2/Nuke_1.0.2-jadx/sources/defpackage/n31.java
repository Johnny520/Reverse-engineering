package defpackage;

import java.lang.reflect.Method;
import nuke.data.cipher.NativeCrypto;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n31 implements xm0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [nuke.data.cipher.NativeCrypto.isConfigured():boolean, nuke.data.cipher.NativeCrypto.kid():java.lang.String, nuke.data.cipher.NativeCrypto.selfTest():boolean, nuke.data.cipher.NativeCrypto.warmUpAsync():void, nx0.j(java.lang.Object):java.lang.Object, rg3.d(int, int, s8, yf, pk, px, n50, in0, d91, uh1, jw1, boolean):void] */
    public /* synthetic */ n31(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: nuke.data.cipher.NativeCrypto.a():java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        t00 t00Var = null;
        switch (this.h) {
            case 0:
                return x31.b;
            case 1:
                return g41.b;
            case 2:
                return c31.b;
            case 3:
                return new d91(0, 0);
            case 4:
                return q91.b.e();
            case 5:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case AIChatConfig.DefaultContextRounds /* 6 */:
                my myVar = cc1.a;
                return null;
            case 7:
                my myVar2 = dc1.a;
                return null;
            case 8:
                tu2 tu2Var = ec1.a;
                return sn.I;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 10:
                c60 c60Var = o90.a;
                p7.A(fq0.h, t50.j, new sb(2, t00Var, 5), 2);
                return a83.a;
            case 11:
                tu2 tu2Var2 = ff1.a;
                return Boolean.FALSE;
            case 12:
                return li1.a;
            case 13:
                return pg1.b.d();
            case 14:
                xi1.d.getClass();
                return ((Method) xi1.g.getValue()).getDeclaringClass();
            case 15:
                return wi1.b.e();
            case 16:
                bj1.d.getClass();
                return ((Method) bj1.g.getValue()).getDeclaringClass();
            case 17:
                return aj1.b.e();
            case 18:
                return Boolean.valueOf(NativeCrypto.warmUpAsync$lambda$0());
            case 19:
                return Boolean.valueOf(NativeCrypto.nativeIsConfigured());
            case AIChatConfig.MaxContextRounds /* 20 */:
                return Boolean.valueOf(NativeCrypto.nativeSelfTest());
            case 21:
                return NativeCrypto.nativeKid();
            case 22:
                return ym1.b.e();
            case 23:
                zm1.d.getClass();
                return ((Method) zm1.f.getValue()).getDeclaringClass();
            case 24:
                return an1.b.d();
            case 25:
                bn1.d.getClass();
                hx2 hx2Var = bn1.f;
                hi0 hi0VarR = op0.y((Class) hx2Var.getValue()).r();
                hi0VarR.b();
                hi0VarR.g = (Class) hx2Var.getValue();
                Object objG0 = ((pi0) du.o0(hi0VarR.c())).g0();
                objG0.getClass();
                return objG0;
            case 26:
                bn1.d.getClass();
                sg1 sg1VarV = op0.y((Class) bn1.f.getValue()).v();
                sg1VarV.b();
                sg1VarV.C = Boolean.TYPE;
                sg1VarV.l = 1;
                return ((zg1) du.o0(sg1VarV.c())).j;
            case 27:
                return cn1.b.e();
            case 28:
                dn1.d.getClass();
                return ((Method) dn1.f.getValue()).getDeclaringClass();
            default:
                return en1.b.d();
        }
    }
}
