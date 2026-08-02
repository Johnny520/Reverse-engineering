package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.ActionMode;
import de.robv.android.xposed.XposedBridge;
import java.io.IOException;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: lb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0418lb implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6016h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6017i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6018j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6019k;

    public /* synthetic */ RunnableC0418lb(Object obj, Object obj2, Object obj3, int i) {
        this.f6016h = i;
        this.f6017i = obj;
        this.f6018j = obj2;
        this.f6019k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object x92Var;
        int i = this.f6016h;
        Object x92Var2 = a83.f116a;
        Object obj = this.f6019k;
        Object obj2 = this.f6018j;
        Object obj3 = this.f6017i;
        switch (i) {
            case 0:
                C0492nb c0492nb = (C0492nb) obj3;
                C0381kb c0381kb = (C0381kb) obj;
                ActionMode actionModeStartActionMode = c0492nb.f7091a.startActionMode(new yj0((C0344jb) obj2), 1);
                t11.m5086l(c0492nb.f7098h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c0381kb.close();
                }
                break;
            case 1:
                Activity activity = (Activity) obj3;
                Intent intent = (Intent) obj2;
                C0240gh c0240gh = (C0240gh) obj;
                String str = c0240gh.f3513a;
                String str2 = C0277hh.f4008h;
                C0277hh c0277hh = C0277hh.f4004d;
                try {
                    activity.startActivity(intent);
                } catch (Throwable th) {
                    x92Var2 = new x92(th);
                }
                if (!(x92Var2 instanceof x92)) {
                    c0277hh.getClass();
                    hg3.m2168f(str2, "Opened red packet receive UI: sendId=" + str);
                }
                Throwable thM6237a = y92.m6237a(x92Var2);
                if (thM6237a != null) {
                    C0277hh.f4010j.remove(str, c0240gh);
                    c0277hh.getClass();
                    hg3.m2166d(str2, "Open red packet receive UI failed: ".concat(fg1.m1624Q(thM6237a)));
                }
                break;
            case 2:
                InterfaceC0101cp interfaceC0101cp = (InterfaceC0101cp) obj2;
                q92 q92Var = (q92) obj;
                a50 a50Var = (a50) ((sz0) obj3).f10437j;
                if (!a50Var.f63i.mo95e()) {
                    interfaceC0101cp.mo879b(a50Var, q92Var);
                } else {
                    interfaceC0101cp.mo880d(a50Var, new IOException("Canceled"));
                }
                break;
            case 3:
                ((InterfaceC0101cp) obj2).mo880d((a50) ((sz0) obj3).f10437j, (Throwable) obj);
                break;
            case 4:
                try {
                    AbstractC0731te.m5207e0((AbstractC0812vj[]) obj3, (pb1) obj2, (vu0) obj);
                    x92Var = x92Var2;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thM6237a2 = y92.m6237a(x92Var);
                if (thM6237a2 != null) {
                    String string = "Dex analysis failed: ".concat(fg1.m1624Q(thM6237a2)).toString();
                    try {
                        XposedBridge.log("[NukeCore]" + string);
                    } catch (Throwable th3) {
                        x92Var2 = new x92(th3);
                    }
                    if (x92Var2 instanceof x92) {
                        Log.println(6, "NukeCore", string);
                    }
                    AbstractC0731te.f10689a.m5041N(AbstractC0731te.m5217j0(R.string.nuke_core_dex_analysis_failed, thM6237a2.getClass().getSimpleName()), null);
                }
                break;
            case 5:
                String str3 = (String) obj2;
                Float f = (Float) obj;
                sz0 sz0Var = (sz0) ((sz0) obj3).f10437j;
                if (sz0Var != null) {
                    ((nx1) sz0Var.f10436i).setValue(str3);
                    if (f != null) {
                        ((jx1) sz0Var.f10437j).m2592h(ci0.m778C(ci0.m778C(f.floatValue(), 0.0f, 1.0f), 0.0f, 1.0f));
                    }
                    break;
                }
                break;
            default:
                ((SharedPreferences.OnSharedPreferenceChangeListener) obj2).onSharedPreferenceChanged((bi0) obj3, (String) obj);
                break;
        }
    }
}
