package p000;

import java.lang.reflect.Method;
import nuke.data.cipher.NativeCrypto;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n31 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6979h;

    public /* synthetic */ n31(int i) {
        this.f6979h = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        t00 t00Var = null;
        switch (this.f6979h) {
            case 0:
                return x31.f12796b;
            case 1:
                return g41.f3303b;
            case 2:
                return c31.f1123b;
            case 3:
                return new d91(0, 0);
            case 4:
                return q91.f8835b.m5640e();
            case 5:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case AIChatConfig.DefaultContextRounds /* 6 */:
                C0478my c0478my = cc1.f1478a;
                return null;
            case 7:
                C0478my c0478my2 = dc1.f1983a;
                return null;
            case 8:
                tu2 tu2Var = ec1.f2389a;
                return C0700sn.f10205I;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 10:
                c60 c60Var = o90.f7590a;
                AbstractC0570p7.m3745A(fq0.f3108h, t50.f10560j, new C0688sb(2, t00Var, 5), 2);
                return a83.f116a;
            case 11:
                tu2 tu2Var2 = ff1.f2950a;
                return Boolean.FALSE;
            case 12:
                return li1.f6136a;
            case 13:
                return pg1.f8308b.m5639d();
            case 14:
                xi1.f13042d.getClass();
                return ((Method) xi1.f13045g.getValue()).getDeclaringClass();
            case 15:
                return wi1.f12517b.m5640e();
            case 16:
                bj1.f895d.getClass();
                return ((Method) bj1.f898g.getValue()).getDeclaringClass();
            case 17:
                return aj1.f227b.m5640e();
            case 18:
                return Boolean.valueOf(NativeCrypto.warmUpAsync$lambda$0());
            case 19:
                return Boolean.valueOf(NativeCrypto.nativeIsConfigured());
            case AIChatConfig.MaxContextRounds /* 20 */:
                return Boolean.valueOf(NativeCrypto.nativeSelfTest());
            case 21:
                return NativeCrypto.nativeKid();
            case 22:
                return ym1.f13517b.m5640e();
            case 23:
                zm1.f13950d.getClass();
                return ((Method) zm1.f13952f.getValue()).getDeclaringClass();
            case 24:
                return an1.f287b.m5639d();
            case 25:
                bn1.f944d.getClass();
                hx2 hx2Var = bn1.f946f;
                hi0 hi0VarM3241r = op0.m3602y((Class) hx2Var.getValue()).m3241r();
                hi0VarM3241r.m6411b();
                hi0VarM3241r.f4030g = (Class) hx2Var.getValue();
                Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
                objM3867g0.getClass();
                return objM3867g0;
            case 26:
                bn1.f944d.getClass();
                sg1 sg1VarM3244v = op0.m3602y((Class) bn1.f946f.getValue()).m3244v();
                sg1VarM3244v.m6411b();
                sg1VarM3244v.f10113C = Boolean.TYPE;
                sg1VarM3244v.f10120l = 1;
                return ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
            case 27:
                return cn1.f1627b.m5640e();
            case 28:
                dn1.f2122d.getClass();
                return ((Method) dn1.f2124f.getValue()).getDeclaringClass();
            default:
                return en1.f2516b.m5639d();
        }
    }
}
