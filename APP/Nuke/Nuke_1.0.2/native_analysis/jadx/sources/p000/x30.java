package p000;

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

    /* JADX INFO: renamed from: d */
    public static final x30 f12787d = new x30(false);

    /* JADX INFO: renamed from: e */
    public static final int f12788e = R.string.custom_input_hint;

    /* JADX INFO: renamed from: f */
    public static final int f12789f = R.string.custom_input_hint_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f12790g = wm0.f12578l;

    /* JADX INFO: renamed from: h */
    public static final String f12791h = "CustomInputHint";

    /* JADX INFO: renamed from: i */
    public static final boolean f12792i = true;

    /* JADX INFO: renamed from: j */
    public static final boolean f12793j = true;

    /* JADX INFO: renamed from: k */
    public static final ArrayList f12794k = new ArrayList();

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f12791h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f12793j;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Object x92Var;
        ArrayList arrayList = new ArrayList();
        try {
            Constructor<?>[] declaredConstructors = up0.m5529H("com.tencent.mm.ui.widget.cedit.api.MMFlexEditText").getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                x30 x30Var = f12787d;
                constructor.getClass();
                XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(constructor, new kg3(x30Var, null, new C0251gs(10)));
                unhookHookMethod.getClass();
                arrayList.add(unhookHookMethod);
            }
            ArrayList arrayList2 = f12794k;
            synchronized (arrayList2) {
                AbstractC0325iu.m2393g0(arrayList, arrayList2);
            }
        } catch (Throwable th) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((XC_MethodHook.Unhook) it.next()).unhook();
                    x92Var = a83.f116a;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    th.addSuppressed(thM6237a);
                }
            }
            throw th;
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        List listM1148F0;
        Object x92Var;
        ArrayList arrayList = f12794k;
        synchronized (arrayList) {
            listM1148F0 = AbstractC0142du.m1148F0(arrayList);
            arrayList.clear();
        }
        Iterator it = listM1148F0.iterator();
        while (it.hasNext()) {
            try {
                ((XC_MethodHook.Unhook) it.next()).unhook();
                x92Var = a83.f116a;
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            Throwable thM6237a = y92.m6237a(x92Var);
            if (thM6237a != null) {
                f12787d.getClass();
                hg3.m2166d(f12791h, "Unable to remove input hint hook: ".concat(fg1.m1624Q(thM6237a)));
            }
        }
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        String strM3606c = pp1.m3931c().m3606c("CustomInputHint/text");
        if (strM3606c == null) {
            strM3606c = "";
        }
        if (!pv2.m4006s0(strM3606c)) {
            return strM3606c;
        }
        String string = context.getString(R.string.custom_input_hint_not_configured);
        string.getClass();
        return string;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f12789f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f12792i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f12788e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f12790g;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: p */
    public final void mo323p(View view, xm0 xm0Var) {
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
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(-461428650, true, new C0370k0(xm0Var, 1))));
    }
}
