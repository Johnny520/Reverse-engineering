package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r90 extends gx2 {
    public static volatile String j;
    public static final r90 d = new r90(false);
    public static final int e = R.string.display_contact_id;
    public static final int f = R.string.display_contact_id_description;
    public static final wm0 g = wm0.j;
    public static final String h = "DisplayContactId";
    public static final boolean i = true;
    public static final ArrayList k = new ArrayList();
    public static final Set l = Collections.newSetFromMap(new WeakHashMap());
    public static final Map m = Collections.synchronizedMap(new WeakHashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(jg3 jg3Var) {
        Adapter adapter;
        String str;
        Activity activity;
        Object x92Var;
        Object objN0 = mg.n0(0, jg3Var.a());
        AdapterView adapterView = objN0 instanceof AdapterView ? (AdapterView) objN0 : null;
        if (adapterView == null) {
            return;
        }
        Object objN02 = mg.n0(2, jg3Var.a());
        Integer num = objN02 instanceof Integer ? (Integer) objN02 : null;
        if (num == null || (adapter = adapterView.getAdapter()) == null) {
            return;
        }
        sg1 sg1VarV = op0.y(adapter).v();
        sg1VarV.b();
        sg1VarV.b = "getItem";
        Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(num);
        if (objG0 == null || (str = (String) m.get(objG0)) == null) {
            return;
        }
        jg3Var.b(null);
        Context context = adapterView.getContext();
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
            try {
                x92Var = up0.k;
                if (x92Var == null) {
                    t11.S("hostAct");
                    throw null;
                }
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            activity = (Activity) (x92Var instanceof x92 ? null : x92Var);
            if (activity == null) {
                return;
            }
        }
        activity.runOnUiThread(new t7(4, activity, new kw(-775398181, true, new x1(str, 1))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Object obj, Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object x92Var;
        boolean zContains;
        String str;
        try {
            x92Var = up0.k;
            if (x92Var == null) {
                t11.S("hostAct");
                throw null;
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        if (x92Var instanceof x92) {
            x92Var = null;
        }
        Activity activity = (Activity) x92Var;
        if (activity != null && activity.getClass().getName().equals("com.tencent.mm.plugin.profile.ui.ProfileSettingUI")) {
            Set set = l;
            set.getClass();
            synchronized (set) {
                zContains = set.contains(obj);
            }
            if (zContains) {
                return;
            }
            hi0 hi0VarR = op0.y(obj).r();
            hi0VarR.b();
            hi0VarR.g = LinkedList.class;
            Object objG0 = ((pi0) du.o0(hi0VarR.c())).g0();
            LinkedList linkedList = objG0 instanceof LinkedList ? (LinkedList) objG0 : null;
            if (linkedList == null || linkedList.size() == 1) {
                return;
            }
            String stringExtra = activity.getIntent().getStringExtra("Contact_User");
            if (stringExtra == null) {
                str = j;
                if (str == null) {
                    return;
                }
            } else {
                str = pv2.s0(stringExtra) ? null : stringExtra;
                if (str == null) {
                }
            }
            Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(activity);
            sg1 sg1VarV = op0.y(objNewInstance).v();
            sg1VarV.b();
            sg1VarV.C = Void.TYPE;
            sg1VarV.d(String.class);
            ((zg1) du.o0(sg1VarV.c())).g0("nuke_display_contact_id");
            r91.d.getClass();
            ((Method) r91.f.getValue()).invoke(objNewInstance, activity.getString(R.string.display_contact_id));
            sg1 sg1VarV2 = op0.y(obj).v();
            sg1VarV2.b();
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            sg1VarV2.d(cls, cls2);
            ((zg1) du.o0(sg1VarV2.c())).g0(objNewInstance, 0);
            synchronized (set) {
                set.add(obj);
            }
            Map map = m;
            map.getClass();
            map.put(objNewInstance, str);
            h.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final boolean e() {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        Object x92Var;
        ArrayList arrayList = new ArrayList();
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("onCreate", Bundle.class);
            declaredMethod.getClass();
            XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(declaredMethod, new kg3(this, null, new gs(13)));
            unhookHookMethod.getClass();
            arrayList.add(unhookHookMethod);
            Class clsH = up0.H("com.tencent.mm.ui.base.preference.MMPreference");
            Class clsH2 = up0.H("com.tencent.mm.ui.base.preference.Preference");
            sg1 sg1VarV = op0.y(clsH).v();
            sg1VarV.b = "createAdapter";
            Constructor<?>[] declaredConstructors = ((zg1) du.o0(sg1VarV.c())).j.getReturnType().getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                r90 r90Var = d;
                constructor.getClass();
                XC_MethodHook.Unhook unhookHookMethod2 = XposedBridge.hookMethod(constructor, new kg3(r90Var, null, new q90(0, clsH2)));
                unhookHookMethod2.getClass();
                arrayList.add(unhookHookMethod2);
            }
            sg1 sg1VarV2 = op0.y(up0.H("com.tencent.mm.ui.widget.listview.PullDownListView")).v();
            sg1VarV2.b = "onItemClick";
            sg1VarV2.i = new gs(14);
            Method method = ((zg1) du.o0(sg1VarV2.c())).j;
            method.getClass();
            XC_MethodHook.Unhook unhookHookMethod3 = XposedBridge.hookMethod(method, new kg3(this, new gs(15), null));
            unhookHookMethod3.getClass();
            arrayList.add(unhookHookMethod3);
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
                hg3.d(h, "Unable to remove contact ID hook: ".concat(fg1.Q(thA)));
            }
        }
        Set set = l;
        set.getClass();
        synchronized (set) {
            set.clear();
        }
        m.clear();
        j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
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
}
