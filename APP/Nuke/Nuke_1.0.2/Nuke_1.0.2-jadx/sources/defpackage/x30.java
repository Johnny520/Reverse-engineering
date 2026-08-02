package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x30 extends gx2 {
    public static final x30 d = new x30(false);
    public static final int e = R.string.custom_input_hint;
    public static final int f = R.string.custom_input_hint_description;
    public static final wm0 g = wm0.l;
    public static final String h = "CustomInputHint";
    public static final boolean i = true;
    public static final boolean j = true;
    public static final ArrayList k = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean e() {
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        Object x92Var;
        ArrayList arrayList = new ArrayList();
        try {
            Constructor<?>[] declaredConstructors = up0.H("com.tencent.mm.ui.widget.cedit.api.MMFlexEditText").getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                x30 x30Var = d;
                constructor.getClass();
                XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(constructor, new kg3(x30Var, null, new gs(10)));
                unhookHookMethod.getClass();
                arrayList.add(unhookHookMethod);
            }
            ArrayList arrayList2 = k;
            synchronized (arrayList2) {
                iu.g0(arrayList, arrayList2);
            }
        } catch (Throwable th) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((XC_MethodHook.Unhook) it.next()).unhook();
                    x92Var = a83.a;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    th.addSuppressed(thA);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void i() {
        List listF0;
        Object x92Var;
        ArrayList arrayList = k;
        synchronized (arrayList) {
            listF0 = du.F0(arrayList);
            arrayList.clear();
        }
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            try {
                ((XC_MethodHook.Unhook) it.next()).unhook();
                x92Var = a83.a;
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            Throwable thA = y92.a(x92Var);
            if (thA != null) {
                d.getClass();
                hg3.d(h, "Unable to remove input hint hook: ".concat(fg1.Q(thA)));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final String j(Context context) {
        context.getClass();
        String strC = pp1.c().c("CustomInputHint/text");
        if (strC == null) {
            strC = "";
        }
        if (!pv2.s0(strC)) {
            return strC;
        }
        String string = context.getString(R.string.custom_input_hint_not_configured);
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final boolean l() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final void p(View view, xm0 xm0Var) {
        Activity activity;
        view.getClass();
        xm0Var.getClass();
        Context context = view.getContext();
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new t7(4, activity, new kw(-461428650, true, new k0(xm0Var, 1))));
    }
}
