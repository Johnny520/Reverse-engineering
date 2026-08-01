package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: ca */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0084ca implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f765d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f767f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f768g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f769h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f770i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0084ca(Context context, String str, String str2, kf1 kf1Var, Activity activity) {
        this.f765d = 2;
        this.f766e = context;
        this.f768g = str;
        this.f767f = str2;
        this.f769h = kf1Var;
        this.f770i = activity;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // java.lang.Runnable
    public final void run() {
        nh0 nh0VarMo805C;
        int i = this.f765d;
        Object obj = this.f770i;
        Object obj2 = this.f769h;
        Object obj3 = this.f767f;
        Object obj4 = this.f768g;
        Object obj5 = this.f766e;
        switch (i) {
            case 0:
                s71 s71Var = (s71) obj5;
                k50 k50Var = (k50) obj3;
                String str = (String) obj4;
                InterfaceC0968ym interfaceC0968ym = (InterfaceC0968ym) obj2;
                InterfaceC0369jv interfaceC0369jv = (InterfaceC0369jv) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    l21 l21VarM4172j = t21.m4172j();
                    nh0 nh0Var = l21VarM4172j instanceof nh0 ? (nh0) l21VarM4172j : null;
                    if (nh0Var == null || (nh0VarMo805C = nh0Var.mo805C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        l21 l21VarM1969j = nh0VarMo805C.m1969j();
                        try {
                            s71 s71VarM5426M = z60.m5426M(s71Var, k50Var);
                            C0294hs c0294hs = C0294hs.f2354d;
                            new C0080c6(str, s71VarM5426M, c0294hs, c0294hs, interfaceC0369jv, interfaceC0968ym).mo490c();
                            l21.m1966q(l21VarM1969j);
                            nh0VarMo805C.mo822w().mo2631f();
                            nh0VarMo805C.mo807c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            l21.m1966q(l21VarM1969j);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                AbstractC0293hr abstractC0293hr = (AbstractC0293hr) obj5;
                y51 y51Var = (y51) obj3;
                y51 y51Var2 = (y51) obj4;
                View view = (View) obj;
                Window window = ((MainActivity) obj2).getWindow();
                window.getClass();
                InterfaceC0742sw interfaceC0742sw = y51Var.f7546c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) interfaceC0742sw.invoke(resources)).booleanValue();
                InterfaceC0742sw interfaceC0742sw2 = y51Var2.f7546c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                abstractC0293hr.mo1499a(y51Var, y51Var2, window, view, zBooleanValue, ((Boolean) interfaceC0742sw2.invoke(resources2)).booleanValue());
                return;
            default:
                kf1.m1832Y((Context) obj5, (String) obj4, (String) obj3, (kf1) obj2, (Activity) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC0084ca(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f765d = i;
        this.f766e = obj;
        this.f767f = obj2;
        this.f768g = obj3;
        this.f769h = obj4;
        this.f770i = obj5;
    }
}
