package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: rv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0671rv implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9762h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractActivityC0144dw f9763i;

    public /* synthetic */ C0671rv(AbstractActivityC0144dw abstractActivityC0144dw, int i) {
        this.f9762h = i;
        this.f9763i = abstractActivityC0144dw;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f9762h;
        AbstractActivityC0144dw abstractActivityC0144dw = this.f9763i;
        switch (i) {
            case 0:
                abstractActivityC0144dw.reportFullyDrawn();
                return a83.f116a;
            case 1:
                return AbstractActivityC0144dw.m1201b(abstractActivityC0144dw);
            case 2:
                q80 q80Var = new q80();
                abstractActivityC0144dw.getNavigationEventDispatcher().m1663b(q80Var);
                return q80Var;
            case 3:
                return new uc2(abstractActivityC0144dw.getApplication(), abstractActivityC0144dw, abstractActivityC0144dw.getIntent() != null ? abstractActivityC0144dw.getIntent().getExtras() : null);
            case 4:
                int i2 = 0;
                ot1 ot1Var = new ot1(new RunnableC0633qv(abstractActivityC0144dw, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (t11.m5086l(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0144dw.getLifecycle().mo505a(new C0709sv(i2, ot1Var, abstractActivityC0144dw));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0724t7(1, abstractActivityC0144dw, ot1Var));
                    }
                }
                return ot1Var;
            default:
                return up0.m5557w(abstractActivityC0144dw);
        }
    }
}
