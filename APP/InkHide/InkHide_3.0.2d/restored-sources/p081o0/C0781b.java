package p081o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p055lu.wxmask.bean.OptionData;
import com.p055lu.wxmask.p057ui.MainActivity;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A0.AbstractC0039l;
import p001A0.C0037j;
import p001A0.RunnableC0045r;
import p007D0.C0095c;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0123k;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0291a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p059d0.InterfaceC0518c;
import p070i0.AbstractC0731a;
import p084q0.C0801a;
import p086r0.C0842H0;
import p086r0.C0893d;
import p086r0.C0894d0;
import p086r0.C0919l1;
import p086r0.C0925n1;
import p088s0.C0976J;
import p092u0.AbstractC1015a;
import p098x0.C1036b;
import p102z0.AbstractC1121d;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1134q;
import p102z0.AbstractC1135r;
import p102z0.C1119b;
import p102z0.C1120c;
import p102z0.C1124g;
import p102z0.C1133p;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0781b implements InterfaceC0204l, InterfaceC0518c, InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2619c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0781b(Object obj, Object obj2, int i2) {
        this.f2617a = i2;
        this.f2618b = obj;
        this.f2619c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0518c
    /* JADX INFO: renamed from: a */
    public boolean mo6a(AccessibleObject accessibleObject) throws IllegalAccessException {
        switch (this.f2617a) {
            case 1:
                Method method = (Method) accessibleObject;
                if (!Modifier.isStatic(method.getModifiers())) {
                    if (!AbstractC0223g.m414a(method.getName(), ((C0893d) this.f2618b).f3084f)) {
                        Class<?> cls = (Class) this.f2619c;
                        if (cls != null) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            for (Class<?> cls2 : parameterTypes) {
                                if (cls2.isAssignableFrom(cls)) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                Object obj = ((Field) accessibleObject).get(((XC_MethodHook.MethodHookParam) this.f2618b).thisObject);
                if (obj != null) {
                    String name = obj.getClass().getName();
                    ((C0801a) this.f2619c).getClass();
                    if (name.equals("com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI")) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7b() {
        boolean z2;
        switch (this.f2617a) {
            case 4:
                C0842H0 c0842h0 = (C0842H0) this.f2618b;
                Context context = (Context) this.f2619c;
                c0842h0.getClass();
                C0037j c0037jM68f = AbstractC0039l.m68f(context);
                boolean z3 = true;
                if (c0037jM68f != null || (c0037jM68f = c0842h0.f2846W) != null) {
                    int i2 = -1;
                    if (AbstractC1135r.f3833e == -1) {
                        try {
                            i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
                        } catch (Exception e2) {
                            AbstractC0731a.m1385b(e2);
                        }
                        AbstractC1135r.f3833e = i2;
                    }
                    z2 = AbstractC1135r.f3833e < 3060 ? !c0037jM68f.f241a.isEmpty() : (c0037jM68f.f241a.isEmpty() || c0037jM68f.f242b.isEmpty() || c0037jM68f.f243c.isEmpty() || c0037jM68f.f245e.isEmpty() || AbstractC0307q.m534d0(c0037jM68f.f247g) || AbstractC0307q.m534d0(c0037jM68f.f249i)) ? false : true;
                    break;
                }
                if (!z2 && (!AbstractC1135r.m2496r(3060) || AbstractC0039l.m70h(context) == null)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            default:
                String str = ((C1119b) this.f2619c).f3775i;
                try {
                    Context context2 = ((C0976J) this.f2618b).getContext();
                    AbstractC0223g.m417d(context2, "getContext(...)");
                    AbstractC1015a.m2216b(context2, str, new C0925n1(12));
                    break;
                } catch (Exception unused) {
                    AbstractC0503h.m978P("下载链接打开失败");
                }
                return C0109i.f404a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8c(Object obj) {
        String strM1881Q;
        String strM1824O;
        int i2;
        Object c0104d;
        Object c0104d2;
        String string;
        String string2;
        strM1881Q = "";
        C0109i c0109i = C0109i.f404a;
        Object obj2 = this.f2619c;
        Object obj3 = this.f2618b;
        switch (this.f2617a) {
            case 0:
                break;
            case 1:
            case 2:
            case 4:
            case 8:
            default:
                C0095c c0095c = (C0095c) obj;
                AbstractC0223g.m418e(c0095c, "response");
                C1133p c1133p = (C1133p) obj3;
                if (c0095c.f380d != null || 200 > (i2 = c0095c.f377a) || i2 >= 300) {
                    AbstractC0731a.m1387d("read trace poll fail", c1133p.f3820b, Integer.valueOf(c0095c.f377a), c0095c.f380d);
                } else {
                    Handler handler = AbstractC1134q.f3825a;
                    String str = new String(c0095c.f379c, AbstractC0291a.f663a);
                    Object obj4 = C0131s.f426a;
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("times");
                        if (jSONArrayOptJSONArray == null || (string2 = jSONArrayOptJSONArray.toString()) == null) {
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("results");
                            c0104d = (jSONArrayOptJSONArray2 == null || (string = jSONArrayOptJSONArray2.toString()) == null) ? obj4 : AbstractC1134q.m2468i(string);
                        } else {
                            c0104d = AbstractC1134q.m2468i(string2);
                        }
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (AbstractC0105e.m246a(c0104d) != null) {
                        try {
                            c0104d2 = AbstractC1134q.m2468i(str);
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        if (!(c0104d2 instanceof C0104d)) {
                            obj4 = c0104d2;
                        }
                        c0104d = (List) obj4;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : (List) c0104d) {
                        String str2 = (String) obj5;
                        if (!AbstractC0307q.m534d0(str2) && !str2.equals(c1133p.f3823e)) {
                            arrayList.add(obj5);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AbstractC1134q.f3825a.post(new RunnableC0045r((Context) obj2, c1133p, (String) AbstractC0123k.m267i0(arrayList), 16));
                    }
                }
                break;
            case 3:
                String name = obj != null ? obj.getClass().getName() : null;
                if (name == null) {
                    name = "";
                }
                C0894d0 c0894d0 = (C0894d0) obj3;
                String strM1826R = c0894d0.m1869G0(obj) ? C0894d0.m1826R(obj) : null;
                if (strM1826R == null) {
                    strM1826R = "";
                }
                if (c0894d0.m1869G0(obj)) {
                    strM1881Q = c0894d0.m1881Q(obj);
                } else {
                    strM1824O = C0894d0.m1853o0(obj) ? C0894d0.m1824O(obj) : null;
                    if (strM1824O != null) {
                        strM1881Q = strM1824O;
                    }
                }
                break;
            case 5:
                ((C0842H0) obj3).getClass();
                break;
            case 6:
                TextView textView = (TextView) obj;
                AbstractC0223g.m418e(textView, "textView");
                CharSequence text = textView.getText();
                strM1824O = text != null ? text.toString() : null;
                strM1881Q = strM1824O != null ? strM1824O : "";
                C0919l1 c0919l1 = (C0919l1) obj3;
                c0919l1.getClass();
                String string3 = AbstractC0299i.m507C0(strM1881Q).toString();
                if (AbstractC0299i.m511i0(string3, "文件大小", false) || AbstractC0299i.m511i0(string3, "file size", true)) {
                    c0919l1.m2032t(C0919l1.m2015m(textView, (View) obj2));
                } else {
                    Set setM2030r = c0919l1.m2030r();
                    if (!setM2030r.isEmpty()) {
                        Iterator it = setM2030r.iterator();
                        while (it.hasNext()) {
                            if (AbstractC0299i.m511i0(strM1881Q, (String) it.next(), true)) {
                                c0919l1.m2032t(C0919l1.m2015m(textView, (View) obj2));
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                OptionData optionData = ((C0976J) obj3).f3494l;
                optionData.setHideSelfSnsPosts(zBooleanValue);
                boolean z2 = AbstractC1126i.f3786a;
                C1124g.m2424O(optionData);
                if (zBooleanValue) {
                    FrameLayout frameLayout = (FrameLayout) obj2;
                    Context context = frameLayout.getContext();
                    AbstractC0223g.m417d(context, "getContext(...)");
                    if (AbstractC0039l.m75m(context) == null) {
                        AbstractC0223g.m417d(frameLayout.getContext(), "getContext(...)");
                        AbstractC0039l.m81s("unified_dexkit_scan_status_v16", false);
                    }
                }
                break;
            case 9:
                C1119b c1119b = (C1119b) obj;
                AbstractC0223g.m418e(c1119b, "result");
                C1036b c1036b = (C1036b) obj3;
                MainActivity mainActivity = (MainActivity) obj2;
                if (!c1119b.f3767a) {
                    c1036b.m2224c(mainActivity, c1119b);
                } else if (c1119b.m2400b()) {
                    boolean z3 = c1119b.f3773g;
                    if (!z3) {
                        C1120c c1120c = AbstractC1121d.f3779a;
                        SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("app", 4, "getSharedPreferences(...)");
                        try {
                            Method declaredMethod = sharedPreferencesM350f.getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(sharedPreferencesM350f, null);
                            break;
                        } catch (Throwable unused) {
                        }
                        if (sharedPreferencesM350f.getBoolean("check_app_update_on_enter", true)) {
                        }
                    }
                    c1036b.m2225d(mainActivity, c1119b, !z3);
                } else {
                    c1036b.f3652d = false;
                }
                break;
        }
        return c0109i;
    }
}
