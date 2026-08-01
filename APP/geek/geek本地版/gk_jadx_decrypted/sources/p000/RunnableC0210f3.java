package p000;

import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0210f3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0657r3 f1874b;

    public /* synthetic */ RunnableC0210f3(LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3, int i) {
        this.f1873a = i;
        this.f1874b = layoutInflaterFactory2C0657r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f1873a;
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f1874b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                if ((layoutInflaterFactory2C0657r3.f4168Z & 1) != 0) {
                    layoutInflaterFactory2C0657r3.m2208v(0);
                }
                if ((layoutInflaterFactory2C0657r3.f4168Z & 4096) != 0) {
                    layoutInflaterFactory2C0657r3.m2208v(108);
                }
                layoutInflaterFactory2C0657r3.f4167Y = false;
                layoutInflaterFactory2C0657r3.f4168Z = 0;
                break;
            default:
                layoutInflaterFactory2C0657r3.f4189w.showAtLocation(layoutInflaterFactory2C0657r3.f4188v, 55, 0, 0);
                wa0 wa0Var = layoutInflaterFactory2C0657r3.f4191y;
                if (wa0Var != null) {
                    wa0Var.m2554b();
                }
                if (layoutInflaterFactory2C0657r3.f4192z && (viewGroup = layoutInflaterFactory2C0657r3.f4143A) != null) {
                    WeakHashMap weakHashMap = ja0.f2600a;
                    if (v90.m2496c(viewGroup)) {
                        layoutInflaterFactory2C0657r3.f4188v.setAlpha(0.0f);
                        wa0 wa0VarM1564a = ja0.m1564a(layoutInflaterFactory2C0657r3.f4188v);
                        wa0VarM1564a.m2553a(1.0f);
                        layoutInflaterFactory2C0657r3.f4191y = wa0VarM1564a;
                        wa0VarM1564a.m2556d(new C0284h3(0, this));
                    }
                }
                layoutInflaterFactory2C0657r3.f4188v.setAlpha(1.0f);
                layoutInflaterFactory2C0657r3.f4188v.setVisibility(0);
                break;
        }
    }
}
