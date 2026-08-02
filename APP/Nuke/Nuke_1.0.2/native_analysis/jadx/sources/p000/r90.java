package p000;

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

    /* JADX INFO: renamed from: j */
    public static volatile String f9449j;

    /* JADX INFO: renamed from: d */
    public static final r90 f9443d = new r90(false);

    /* JADX INFO: renamed from: e */
    public static final int f9444e = R.string.display_contact_id;

    /* JADX INFO: renamed from: f */
    public static final int f9445f = R.string.display_contact_id_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f9446g = wm0.f12576j;

    /* JADX INFO: renamed from: h */
    public static final String f9447h = "DisplayContactId";

    /* JADX INFO: renamed from: i */
    public static final boolean f9448i = true;

    /* JADX INFO: renamed from: k */
    public static final ArrayList f9450k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public static final Set f9451l = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: m */
    public static final Map f9452m = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: q */
    public static void m4414q(jg3 jg3Var) {
        Adapter adapter;
        String str;
        Activity activity;
        Object x92Var;
        Object objM3099n0 = AbstractC0460mg.m3099n0(0, jg3Var.m2496a());
        AdapterView adapterView = objM3099n0 instanceof AdapterView ? (AdapterView) objM3099n0 : null;
        if (adapterView == null) {
            return;
        }
        Object objM3099n02 = AbstractC0460mg.m3099n0(2, jg3Var.m2496a());
        Integer num = objM3099n02 instanceof Integer ? (Integer) objM3099n02 : null;
        if (num == null || (adapter = adapterView.getAdapter()) == null) {
            return;
        }
        sg1 sg1VarM3244v = op0.m3602y(adapter).m3244v();
        sg1VarM3244v.m6411b();
        sg1VarM3244v.f13871b = "getItem";
        Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(num);
        if (objM6415g0 == null || (str = (String) f9452m.get(objM6415g0)) == null) {
            return;
        }
        jg3Var.m2497b(null);
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
                x92Var = up0.f11403k;
                if (x92Var == null) {
                    t11.m5067S("hostAct");
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
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(-775398181, true, new C0868x1(str, 1))));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4415r(Object obj, Class cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object x92Var;
        boolean zContains;
        String str;
        try {
            x92Var = up0.f11403k;
            if (x92Var == null) {
                t11.m5067S("hostAct");
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
            Set set = f9451l;
            set.getClass();
            synchronized (set) {
                zContains = set.contains(obj);
            }
            if (zContains) {
                return;
            }
            hi0 hi0VarM3241r = op0.m3602y(obj).m3241r();
            hi0VarM3241r.m6411b();
            hi0VarM3241r.f4030g = LinkedList.class;
            Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
            LinkedList linkedList = objM3867g0 instanceof LinkedList ? (LinkedList) objM3867g0 : null;
            if (linkedList == null || linkedList.size() == 1) {
                return;
            }
            String stringExtra = activity.getIntent().getStringExtra("Contact_User");
            if (stringExtra == null) {
                str = f9449j;
                if (str == null) {
                    return;
                }
            } else {
                str = pv2.m4006s0(stringExtra) ? null : stringExtra;
                if (str == null) {
                }
            }
            Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(activity);
            sg1 sg1VarM3244v = op0.m3602y(objNewInstance).m3244v();
            sg1VarM3244v.m6411b();
            sg1VarM3244v.f10113C = Void.TYPE;
            sg1VarM3244v.m4864d(String.class);
            ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0("nuke_display_contact_id");
            r91.f9453d.getClass();
            ((Method) r91.f9455f.getValue()).invoke(objNewInstance, activity.getString(R.string.display_contact_id));
            sg1 sg1VarM3244v2 = op0.m3602y(obj).m3244v();
            sg1VarM3244v2.m6411b();
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            sg1VarM3244v2.m4864d(cls, cls2);
            ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).m6415g0(objNewInstance, 0);
            synchronized (set) {
                set.add(obj);
            }
            Map map = f9452m;
            map.getClass();
            map.put(objNewInstance, str);
            f9447h.getClass();
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f9447h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f9448i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Object x92Var;
        ArrayList arrayList = new ArrayList();
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("onCreate", Bundle.class);
            declaredMethod.getClass();
            XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(declaredMethod, new kg3(this, null, new C0251gs(13)));
            unhookHookMethod.getClass();
            arrayList.add(unhookHookMethod);
            Class clsM5529H = up0.m5529H("com.tencent.mm.ui.base.preference.MMPreference");
            Class clsM5529H2 = up0.m5529H("com.tencent.mm.ui.base.preference.Preference");
            sg1 sg1VarM3244v = op0.m3602y(clsM5529H).m3244v();
            sg1VarM3244v.f13871b = "createAdapter";
            Constructor<?>[] declaredConstructors = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j.getReturnType().getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                r90 r90Var = f9443d;
                constructor.getClass();
                XC_MethodHook.Unhook unhookHookMethod2 = XposedBridge.hookMethod(constructor, new kg3(r90Var, null, new q90(0, clsM5529H2)));
                unhookHookMethod2.getClass();
                arrayList.add(unhookHookMethod2);
            }
            sg1 sg1VarM3244v2 = op0.m3602y(up0.m5529H("com.tencent.mm.ui.widget.listview.PullDownListView")).m3244v();
            sg1VarM3244v2.f13871b = "onItemClick";
            sg1VarM3244v2.f10117i = new C0251gs(14);
            Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).f13895j;
            method.getClass();
            XC_MethodHook.Unhook unhookHookMethod3 = XposedBridge.hookMethod(method, new kg3(this, new C0251gs(15), null));
            unhookHookMethod3.getClass();
            arrayList.add(unhookHookMethod3);
            ArrayList arrayList2 = f9450k;
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
        ArrayList arrayList = f9450k;
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
                f9443d.getClass();
                hg3.m2166d(f9447h, "Unable to remove contact ID hook: ".concat(fg1.m1624Q(thM6237a)));
            }
        }
        Set set = f9451l;
        set.getClass();
        synchronized (set) {
            set.clear();
        }
        f9452m.clear();
        f9449j = null;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f9445f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f9444e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f9446g;
    }
}
