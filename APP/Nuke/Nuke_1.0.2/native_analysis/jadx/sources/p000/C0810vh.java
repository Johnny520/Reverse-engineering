package p000;

import android.content.Context;
import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: vh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0810vh implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11955h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f11956i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f11957j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f11958k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ xk1 f11959l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ xk1 f11960m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f11961n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f11962o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f11963p;

    public /* synthetic */ C0810vh(kf2 kf2Var, Context context, xk1 xk1Var, j20 j20Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5) {
        this.f11961n = kf2Var;
        this.f11962o = context;
        this.f11956i = xk1Var;
        this.f11963p = j20Var;
        this.f11957j = xk1Var2;
        this.f11958k = xk1Var3;
        this.f11959l = xk1Var4;
        this.f11960m = xk1Var5;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        Object x92Var;
        int i = this.f11955h;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f11957j;
        Object obj = this.f11963p;
        xk1 xk1Var2 = this.f11956i;
        Object obj2 = this.f11962o;
        Object obj3 = this.f11961n;
        switch (i) {
            case 0:
                Long l = (Long) obj3;
                in0 in0Var = (in0) obj2;
                xk1 xk1Var3 = (xk1) obj;
                if (l != null) {
                    in0Var.mo5j(new C0091ch(l.longValue(), ((Number) xk1Var2.getValue()).intValue(), ((Boolean) xk1Var.getValue()).booleanValue(), (Set) this.f11958k.getValue(), (Set) this.f11959l.getValue(), new C0203fh(pv2.m3993I0((String) xk1Var3.getValue()).toString(), ((Boolean) this.f11960m.getValue()).booleanValue())));
                }
                break;
            default:
                kf2 kf2Var = (kf2) obj3;
                Context context = (Context) obj2;
                j20 j20Var = (j20) obj;
                try {
                    x92Var = rg3.m4456J(kf2Var, (String) xk1Var2.getValue(), context);
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                boolean z = x92Var instanceof x92;
                xk1 xk1Var4 = this.f11959l;
                if (!z) {
                    j31 j31Var = (j31) x92Var;
                    String str = (String) xk1Var.getValue();
                    if (str != null) {
                        AbstractC0570p7.m3745A(j20Var, null, new ok2(str, kf2Var, j31Var, this.f11958k, xk1Var4, this.f11960m, context, null), 3);
                    }
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    String message = thM6237a.getMessage();
                    if (message == null) {
                        message = context.getString(R.string.script_settings_invalid_input);
                        message.getClass();
                    }
                    xk1Var4.setValue(message);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0810vh(Long l, in0 in0Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3, xk1 xk1Var4, xk1 xk1Var5, xk1 xk1Var6) {
        this.f11961n = l;
        this.f11962o = in0Var;
        this.f11956i = xk1Var;
        this.f11957j = xk1Var2;
        this.f11958k = xk1Var3;
        this.f11959l = xk1Var4;
        this.f11960m = xk1Var5;
        this.f11963p = xk1Var6;
    }
}
