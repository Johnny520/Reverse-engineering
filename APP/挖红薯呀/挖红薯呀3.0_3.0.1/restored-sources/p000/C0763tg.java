package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: tg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0763tg implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5998d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ MainActivity f5999e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0763tg(MainActivity mainActivity, int i) {
        this.f5998d = i;
        this.f5999e = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f5998d;
        MainActivity mainActivity = this.f5999e;
        switch (i) {
            case 0:
                int i2 = 0;
                bl0 bl0Var = new bl0(new RunnableC0802ug(mainActivity, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (p30.m3002l(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity.getLifecycle().mo4014a(new C0851vg(i2, bl0Var, mainActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0751t4(1, mainActivity, bl0Var));
                    }
                }
                return bl0Var;
            case 1:
                mainActivity.reportFullyDrawn();
                return na1.f4229a;
            case 2:
                return AbstractActivityC0246gh.m1242b(mainActivity);
            case 3:
                C0025ao c0025ao = new C0025ao();
                mainActivity.getNavigationEventDispatcher().m3507a(c0025ao);
                return c0025ao;
            case 4:
                return new ox0(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            default:
                return AbstractC0398kl.m1930p(mainActivity);
        }
    }
}
