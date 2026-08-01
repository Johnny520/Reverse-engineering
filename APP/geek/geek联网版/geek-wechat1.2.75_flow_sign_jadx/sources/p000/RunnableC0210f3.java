package p000;

import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: f3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0210f3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0656r3 f1724b;

    public /* synthetic */ RunnableC0210f3(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3, int i) {
        this.f1723a = i;
        this.f1724b = layoutInflaterFactory2C0656r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f1723a;
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = this.f1724b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                if ((layoutInflaterFactory2C0656r3.f4029Z & 1) != 0) {
                    layoutInflaterFactory2C0656r3.m2219v(0);
                }
                if ((layoutInflaterFactory2C0656r3.f4029Z & 4096) != 0) {
                    layoutInflaterFactory2C0656r3.m2219v(108);
                }
                layoutInflaterFactory2C0656r3.f4028Y = false;
                layoutInflaterFactory2C0656r3.f4029Z = 0;
                break;
            default:
                layoutInflaterFactory2C0656r3.f4050w.showAtLocation(layoutInflaterFactory2C0656r3.f4049v, 55, 0, 0);
                bb0 bb0Var = layoutInflaterFactory2C0656r3.f4052y;
                if (bb0Var != null) {
                    bb0Var.m508b();
                }
                if (layoutInflaterFactory2C0656r3.f4053z && (viewGroup = layoutInflaterFactory2C0656r3.f4004A) != null) {
                    WeakHashMap weakHashMap = oa0.f3426a;
                    if (aa0.m40c(viewGroup)) {
                        layoutInflaterFactory2C0656r3.f4049v.setAlpha(0.0f);
                        bb0 bb0VarM2001a = oa0.m2001a(layoutInflaterFactory2C0656r3.f4049v);
                        bb0VarM2001a.m507a(1.0f);
                        layoutInflaterFactory2C0656r3.f4052y = bb0VarM2001a;
                        bb0VarM2001a.m510d(new C0284h3(0, this));
                    }
                }
                layoutInflaterFactory2C0656r3.f4049v.setAlpha(1.0f);
                layoutInflaterFactory2C0656r3.f4049v.setVisibility(0);
                break;
        }
    }
}
