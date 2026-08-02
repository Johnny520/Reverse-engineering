package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rv implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ dw i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rv(dw dwVar, int i) {
        this.h = i;
        this.i = dwVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        dw dwVar = this.i;
        switch (i) {
            case 0:
                dwVar.reportFullyDrawn();
                return a83.a;
            case 1:
                return dw.b(dwVar);
            case 2:
                q80 q80Var = new q80();
                dwVar.getNavigationEventDispatcher().b(q80Var);
                return q80Var;
            case 3:
                return new uc2(dwVar.getApplication(), dwVar, dwVar.getIntent() != null ? dwVar.getIntent().getExtras() : null);
            case 4:
                int i2 = 0;
                ot1 ot1Var = new ot1(new qv(dwVar, 0));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (t11.l(Looper.myLooper(), Looper.getMainLooper())) {
                        dwVar.getLifecycle().a(new sv(i2, ot1Var, dwVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new t7(1, dwVar, ot1Var));
                    }
                }
                return ot1Var;
            default:
                return up0.w(dwVar);
        }
    }
}
