package p086r0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0014N;
import p001A0.C0015O;
import p001A0.C0016P;
import p001A0.C0034g;
import p001A0.C0035h;
import p001A0.C0037j;
import p001A0.C0047t;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p059d0.InterfaceC0518c;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1135r;

/* JADX INFO: renamed from: r0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0915k0 implements InterfaceC0204l, InterfaceC0518c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3242a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0842H0 f3243b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0915k0(C0842H0 c0842h0, int i2) {
        this.f3242a = i2;
        this.f3243b = c0842h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0518c
    /* JADX INFO: renamed from: a */
    public boolean mo6a(AccessibleObject accessibleObject) {
        Method method = (Method) accessibleObject;
        AbstractC0223g.m415b(method);
        this.f3243b.getClass();
        if (!Modifier.isAbstract(method.getModifiers()) && !Modifier.isAbstract(method.getDeclaringClass().getModifiers())) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length >= 2 && AbstractC0223g.m414a(parameterTypes[1], Integer.TYPE) && ((AbstractC0299i.m511i0(parameterTypes[0].getName(), "RecyclerView", true) || parameterTypes[0].getName().equals("androidx.recyclerview.widget.k3")) && (AbstractC0223g.m414a(method.getName(), "onBindViewHolder") || (AbstractC0223g.m414a(method.getReturnType(), Void.TYPE) && (parameterTypes.length == 2 || (parameterTypes.length == 3 && List.class.isAssignableFrom(parameterTypes[2]))))))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public Boolean m1998b(Class cls, String str, Object obj) {
        this.f3243b.getClass();
        return Boolean.valueOf(C0842H0.m1611V0(cls, str, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) throws JSONException {
        Object c0104d;
        Object c0104d2;
        switch (this.f3242a) {
            case 1:
                Class cls = (Class) obj;
                AbstractC0223g.m418e(cls, "clazz");
                return Boolean.valueOf(this.f3243b.m1670K0(cls));
            case 2:
                this.f3243b.getClass();
                return C0842H0.m1599O(obj);
            case 3:
                C0842H0 c0842h0 = this.f3243b;
                Context context = (Context) obj;
                AbstractC0223g.m418e(context, "appContext");
                if (AbstractC1135r.m2496r(3060)) {
                    return new C0047t(true, "\\u5df2\\u542f\\u7528\\u65e7\\u7248\\u4f1a\\u8bdd\\u5217\\u8868\\u4e34\\u65f6\\u5b66\\u4e60\\uff0c\\u8fdb\\u5165\\u5fae\\u4fe1\\u4e3b\\u9875\\u540e\\u81ea\\u52a8\\u5b8c\\u6210", true);
                }
                C0034g.m41q("conversation dexkit resolve start");
                C0037j c0037j = null;
                c0037j = null;
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String str = applicationInfo != null ? applicationInfo.sourceDir : null;
                    if (str == null || AbstractC0307q.m534d0(str)) {
                        C0034g.m41q("conversation dexkit unresolved apk path empty");
                    } else {
                        try {
                            c0104d = (C0037j) AbstractC0039l.m62B(str, new C0035h(context, 1));
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("conversation dexkit resolve fail", thM246a);
                        }
                        c0037j = (C0037j) (c0104d instanceof C0104d ? null : c0104d);
                    }
                    break;
                } else {
                    C0034g.m41q("conversation dexkit unresolved dexkit library not loaded");
                }
                if (c0037j == null) {
                    return new C0047t(true, "\\u6682\\u672a\\u627e\\u5230\\uff0c\\u5c06\\u542f\\u7528\\u4e34\\u65f6\\u5b66\\u4e60\\uff0c\\u8fdb\\u5165\\u5fae\\u4fe1\\u4e3b\\u9875\\u540e\\u81ea\\u52a8\\u5b8c\\u6210", true);
                }
                AbstractC0039l.m86x(context, c0037j);
                c0842h0.f2846W = c0037j;
                String str2 = (String) AbstractC0123k.m268j0(c0037j.f241a);
                if (str2 == null) {
                    str2 = "";
                }
                return new C0047t(true, AbstractC0174d.m353i("\\u5df2\\u627e\\u5230 ", str2, "\\uff0c\\u91cd\\u542f\\u5fae\\u4fe1\\u540e\\u751f\\u6548"), true);
            case 4:
                C0842H0 c0842h02 = this.f3243b;
                Context context2 = (Context) obj;
                AbstractC0223g.m418e(context2, "appContext");
                C0014N c0014n = null;
                c0014n = null;
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo2 = context2.getApplicationInfo();
                    String str3 = applicationInfo2 != null ? applicationInfo2.sourceDir : null;
                    if (str3 == null || AbstractC0307q.m534d0(str3)) {
                        AbstractC0731a.m1387d("quick add dexkit apk path empty");
                    } else {
                        try {
                            c0104d2 = (C0014N) AbstractC0039l.m62B(str3, new C0035h(context2, 4));
                        } catch (Throwable th2) {
                            c0104d2 = new C0104d(th2);
                        }
                        Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
                        if (thM246a2 != null) {
                            AbstractC0731a.m1387d("quick add dexkit resolve fail", thM246a2);
                        }
                        c0014n = (C0014N) (c0104d2 instanceof C0104d ? null : c0104d2);
                    }
                    break;
                }
                if (c0014n == null) {
                    return new C0047t(false, "\\u672a\\u627e\\u5230\\u5feb\\u6377\\u52a0\\u5165 Hook \\u70b9", true);
                }
                JSONArray jSONArray = new JSONArray();
                for (C0015O c0015o : c0014n.f129d) {
                    jSONArray.put(new JSONObject().put("popupClassName", c0015o.f136a).put("callbackClassName", c0015o.f137b).put("methodName", c0015o.f138c));
                }
                JSONArray jSONArray2 = new JSONArray();
                for (C0016P c0016p : c0014n.f130e) {
                    jSONArray2.put(new JSONObject().put("popupClassName", c0016p.f139a).put("methodName", c0016p.f140b));
                }
                JSONObject jSONObjectPut = new JSONObject().put("conversationLongClickClassNames", AbstractC0039l.m88z(c0014n.f126a)).put("conversationMenuCallbackClassNames", AbstractC0039l.m88z(c0014n.f127b)).put("popupClassNames", AbstractC0039l.m88z(c0014n.f128c)).put("popupCreateSpecs", jSONArray).put("popupBuildSpecs", jSONArray2).put("popupClickHandlerClassNames", AbstractC0039l.m88z(c0014n.f131f)).put("popupAdapterClassNames", AbstractC0039l.m88z(c0014n.f132g)).put("contactMenuCallbackClassNames", AbstractC0039l.m88z(c0014n.f133h)).put("addressMenuCreateClassNames", AbstractC0039l.m88z(c0014n.f134i)).put("addressMenuClickClassNames", AbstractC0039l.m88z(c0014n.f135j));
                AbstractC0223g.m417d(jSONObjectPut, "put(...)");
                JSONObject jSONObjectM84v = AbstractC0039l.m84v(jSONObjectPut, 5);
                SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
                sharedPreferences.edit().putString("quick_add_menu_v10", jSONObjectM84v.toString()).apply();
                c0842h02.f2847X = c0014n;
                return new C0047t(true, "\\u5df2\\u8865\\u5168\\u5feb\\u6377\\u52a0\\u5165\\u7c7b\\u540d\\uff0c\\u91cd\\u542f\\u5fae\\u4fe1\\u540e\\u751f\\u6548", true);
            case 5:
            default:
                Class cls2 = (Class) obj;
                AbstractC0223g.m418e(cls2, "clazz");
                return Boolean.valueOf(this.f3243b.m1669J0(cls2));
            case 6:
                Class cls3 = (Class) obj;
                AbstractC0223g.m418e(cls3, "clazz");
                this.f3243b.getClass();
                return Boolean.valueOf(C0842H0.m1583D0(cls3));
        }
    }
}
