package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.ActionMode;
import de.robv.android.xposed.XposedBridge;
import java.io.IOException;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lb(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object x92Var;
        int i = this.h;
        Object x92Var2 = a83.a;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                nb nbVar = (nb) obj3;
                kb kbVar = (kb) obj;
                ActionMode actionModeStartActionMode = nbVar.a.startActionMode(new yj0((jb) obj2), 1);
                t11.l(nbVar.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    kbVar.close();
                }
                break;
            case 1:
                Activity activity = (Activity) obj3;
                Intent intent = (Intent) obj2;
                gh ghVar = (gh) obj;
                String str = ghVar.a;
                String str2 = hh.h;
                hh hhVar = hh.d;
                try {
                    activity.startActivity(intent);
                } catch (Throwable th) {
                    x92Var2 = new x92(th);
                }
                if (!(x92Var2 instanceof x92)) {
                    hhVar.getClass();
                    hg3.f(str2, "Opened red packet receive UI: sendId=" + str);
                }
                Throwable thA = y92.a(x92Var2);
                if (thA != null) {
                    hh.j.remove(str, ghVar);
                    hhVar.getClass();
                    hg3.d(str2, "Open red packet receive UI failed: ".concat(fg1.Q(thA)));
                }
                break;
            case 2:
                cp cpVar = (cp) obj2;
                q92 q92Var = (q92) obj;
                a50 a50Var = (a50) ((sz0) obj3).j;
                if (!a50Var.i.e()) {
                    cpVar.b(a50Var, q92Var);
                } else {
                    cpVar.d(a50Var, new IOException("Canceled"));
                }
                break;
            case 3:
                ((cp) obj2).d((a50) ((sz0) obj3).j, (Throwable) obj);
                break;
            case 4:
                try {
                    te.e0((vj[]) obj3, (pb1) obj2, (vu0) obj);
                    x92Var = x92Var2;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thA2 = y92.a(x92Var);
                if (thA2 != null) {
                    String string = "Dex analysis failed: ".concat(fg1.Q(thA2)).toString();
                    try {
                        XposedBridge.log("[NukeCore]" + string);
                    } catch (Throwable th3) {
                        x92Var2 = new x92(th3);
                    }
                    if (x92Var2 instanceof x92) {
                        Log.println(6, "NukeCore", string);
                    }
                    te.a.N(te.j0(R.string.nuke_core_dex_analysis_failed, thA2.getClass().getSimpleName()), null);
                }
                break;
            case 5:
                String str3 = (String) obj2;
                Float f = (Float) obj;
                sz0 sz0Var = (sz0) ((sz0) obj3).j;
                if (sz0Var != null) {
                    ((nx1) sz0Var.i).setValue(str3);
                    if (f != null) {
                        ((jx1) sz0Var.j).h(ci0.C(ci0.C(f.floatValue(), 0.0f, 1.0f), 0.0f, 1.0f));
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
