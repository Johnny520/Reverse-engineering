package p084q0;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.LruCache;
import android.view.View;
import android.widget.EditText;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0015O;
import p001A0.C0026a;
import p001A0.C0028b;
import p001A0.C0030c;
import p001A0.C0031d;
import p001A0.C0035h;
import p001A0.C0047t;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p059d0.InterfaceC0518c;
import p070i0.AbstractC0731a;
import p086r0.C0868S;
import p086r0.C0908i;
import p097x.InterfaceC1034b;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.C1128k;

/* JADX INFO: renamed from: q0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0804d implements InterfaceC0518c, InterfaceC0204l, InterfaceC0193a, InterfaceC1034b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2675a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.m.run():void, r0.d0.P0(java.lang.Object):void, r0.d0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.d0.l0(android.content.Context):void, r0.d0.m0(java.lang.Class, boolean):void, r0.w.b(java.lang.Object, java.lang.String):boolean, r0.w.f(java.lang.Object):android.widget.EditText, r0.w.i(java.lang.Object, android.app.Activity, java.lang.String, boolean):void] */
    public /* synthetic */ C0804d(int i2) {
        this.f2675a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0518c
    /* JADX INFO: renamed from: a */
    public boolean mo6a(AccessibleObject accessibleObject) {
        switch (this.f2675a) {
            case 0:
                return ((Field) accessibleObject).getType().getName().startsWith("com.tencent.mm.storage.");
            case 2:
                return AbstractC0120h.m254b0(new String[]{"b", "c", "d", "e"}, ((Method) accessibleObject).getName());
            case 6:
                Method method = (Method) accessibleObject;
                if (!C0908i.f3206h.contains(method.getName())) {
                    return false;
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                for (Class<?> cls : parameterTypes) {
                    if (ContentValues.class.isAssignableFrom(cls)) {
                        return true;
                    }
                }
                return false;
            case 7:
                Method method2 = (Method) accessibleObject;
                return AbstractC0223g.m414a(method2.getName(), "callback") && method2.getParameterTypes().length == 1 && method2.getParameterTypes()[0].getName().equals("com.tencent.mm.sdk.event.IEvent");
            case 21:
                Method method3 = (Method) accessibleObject;
                return AbstractC0223g.m414a(method3.getName(), "rawQueryWithFactory") && method3.getParameterTypes().length == 4;
            default:
                Method method4 = (Method) accessibleObject;
                return AbstractC0223g.m414a(method4.getName(), "rawQueryWithFactory") && method4.getParameterTypes().length == 4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        boolean z2 = false;
        switch (this.f2675a) {
            case 3:
                boolean z3 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2442r());
            case 8:
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2445u() && !AbstractC1129l.m2453c().isEmpty()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 9:
                if (AbstractC1129l.m2455e() != null && (!r2.f3800b.isEmpty())) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 18:
                boolean z5 = AbstractC1126i.f3786a;
                return Integer.valueOf(AbstractC0079h.m183g(C1124g.m2435k().getChatHistoryQuickUnhideClickCount(), 2, 8));
            default:
                boolean z6 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2449y());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) throws JSONException {
        Object c0104d;
        Object c0104d2;
        Object c0104d3;
        Object c0104d4;
        C0031d c0031d = null;
        c1128k = null;
        C1128k c1128k = null;
        c0031d = null;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        switch (this.f2675a) {
            case 1:
                return ((Class) obj).getName();
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 26:
            default:
                C0015O c0015o = (C0015O) obj;
                AbstractC0223g.m418e(c0015o, "it");
                return c0015o.f136a + "#" + c0015o.f138c + "/" + c0015o.f137b;
            case 4:
                Context context = (Context) obj;
                AbstractC0223g.m418e(context, "appContext");
                C0028b c0028bM65c = AbstractC0039l.m65c(context);
                if (c0028bM65c == null) {
                    if (AbstractC0038k.m60a()) {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        String str = applicationInfo != null ? applicationInfo.sourceDir : null;
                        if (str == null || AbstractC0307q.m534d0(str)) {
                            AbstractC0731a.m1387d("anti revoke dexkit apk path empty");
                            c0028bM65c = null;
                        } else {
                            try {
                                c0104d3 = (C0028b) AbstractC0039l.m62B(str, new C0026a(i4));
                            } catch (Throwable th) {
                                c0104d3 = new C0104d(th);
                            }
                            Throwable thM246a = AbstractC0105e.m246a(c0104d3);
                            if (thM246a != null) {
                                AbstractC0731a.m1387d("anti revoke dexkit resolve fail", thM246a);
                            }
                            if (c0104d3 instanceof C0104d) {
                                c0104d3 = null;
                            }
                            c0028bM65c = (C0028b) c0104d3;
                        }
                    } else {
                        c0028bM65c = null;
                    }
                    break;
                }
                C0030c c0030cM66d = AbstractC0039l.m66d(context);
                if (c0030cM66d == null) {
                    if (AbstractC0038k.m60a()) {
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        String str2 = applicationInfo2 != null ? applicationInfo2.sourceDir : null;
                        if (str2 == null || AbstractC0307q.m534d0(str2)) {
                            AbstractC0731a.m1387d("anti revoke storage dexkit apk path empty");
                            c0030cM66d = null;
                        } else {
                            try {
                                c0104d2 = (C0030c) AbstractC0039l.m62B(str2, new C0026a(i2));
                            } catch (Throwable th2) {
                                c0104d2 = new C0104d(th2);
                            }
                            Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
                            if (thM246a2 != null) {
                                AbstractC0731a.m1387d("anti revoke storage dexkit resolve fail", thM246a2);
                            }
                            if (c0104d2 instanceof C0104d) {
                                c0104d2 = null;
                            }
                            c0030cM66d = (C0030c) c0104d2;
                        }
                    } else {
                        c0030cM66d = null;
                    }
                    break;
                }
                C0031d c0031dM79q = AbstractC0039l.m79q(context);
                if (c0031dM79q == null) {
                    if (AbstractC0038k.m60a()) {
                        ApplicationInfo applicationInfo3 = context.getApplicationInfo();
                        String str3 = applicationInfo3 != null ? applicationInfo3.sourceDir : null;
                        if (str3 == null || AbstractC0307q.m534d0(str3)) {
                            AbstractC0731a.m1387d("xml parser dexkit apk path empty");
                        } else {
                            try {
                                c0104d = (C0031d) AbstractC0039l.m62B(str3, new C0026a(i3));
                            } catch (Throwable th3) {
                                c0104d = new C0104d(th3);
                            }
                            Throwable thM246a3 = AbstractC0105e.m246a(c0104d);
                            if (thM246a3 != null) {
                                AbstractC0731a.m1387d("xml parser dexkit resolve fail", thM246a3);
                            }
                            c0031d = (C0031d) (c0104d instanceof C0104d ? null : c0104d);
                        }
                    }
                    c0031dM79q = c0031d;
                    break;
                }
                if (c0028bM65c == null || c0030cM66d == null || c0031dM79q == null) {
                    AbstractC0039l.m81s("anti_revoke_scan_status", false);
                    return new C0047t(false, "未找到可用 Hook 点", true);
                }
                JSONObject jSONObjectPut = new JSONObject().put("className", c0028bM65c.f207a).put("methodName", c0028bM65c.f208b).put("methodSign", c0028bM65c.f209c);
                AbstractC0223g.m417d(jSONObjectPut, "put(...)");
                JSONObject jSONObjectM84v = AbstractC0039l.m84v(jSONObjectPut, 2);
                SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
                sharedPreferences.edit().putString("anti_revoke_revoke_method", jSONObjectM84v.toString()).apply();
                JSONObject jSONObjectPut2 = new JSONObject().put("className", c0030cM66d.f218a).put("methodName", c0030cM66d.f219b).put("methodSign", c0030cM66d.f220c);
                AbstractC0223g.m417d(jSONObjectPut2, "put(...)");
                JSONObject jSONObjectM84v2 = AbstractC0039l.m84v(jSONObjectPut2, 2);
                SharedPreferences sharedPreferences2 = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                AbstractC0223g.m417d(sharedPreferences2, "getSharedPreferences(...)");
                sharedPreferences2.edit().putString("anti_revoke_message_storage_method_v1", jSONObjectM84v2.toString()).apply();
                JSONObject jSONObjectPut3 = new JSONObject().put("className", c0031dM79q.f221a).put("methodName", c0031dM79q.f222b).put("methodSign", c0031dM79q.f223c);
                AbstractC0223g.m417d(jSONObjectPut3, "put(...)");
                JSONObject jSONObjectM84v3 = AbstractC0039l.m84v(jSONObjectPut3, 2);
                SharedPreferences sharedPreferences3 = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                AbstractC0223g.m417d(sharedPreferences3, "getSharedPreferences(...)");
                sharedPreferences3.edit().putString("wechat_xml_parser_method_v1", jSONObjectM84v3.toString()).apply();
                AbstractC0039l.m81s("anti_revoke_scan_status", true);
                return new C0047t(true, "防撤回适配成功", true);
            case 5:
                AbstractC0223g.m418e((Context) obj, "appContext");
                AbstractC0039l.m81s("anti_revoke_scan_status", true);
                return C0109i.f404a;
            case 10:
                Context context2 = (Context) obj;
                AbstractC0223g.m418e(context2, "appContext");
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo4 = context2.getApplicationInfo();
                    String str4 = applicationInfo4 != null ? applicationInfo4.sourceDir : null;
                    if (str4 == null || AbstractC0307q.m534d0(str4)) {
                        AbstractC0731a.m1387d("custom avatar dexkit apk path empty");
                    } else {
                        try {
                            c0104d4 = (C1128k) AbstractC0039l.m62B(str4, new C0035h(context2, i3));
                        } catch (Throwable th4) {
                            c0104d4 = new C0104d(th4);
                        }
                        Throwable thM246a4 = AbstractC0105e.m246a(c0104d4);
                        if (thM246a4 != null) {
                            AbstractC0731a.m1387d("custom avatar dexkit resolve fail", thM246a4);
                        }
                        c1128k = (C1128k) (c0104d4 instanceof C0104d ? null : c0104d4);
                    }
                    break;
                }
                if (c1128k == null) {
                    return new C0047t(false, "未找到本地头像 Hook 点", true);
                }
                LruCache lruCache = AbstractC1129l.f3803a;
                JSONObject jSONObjectPut4 = new JSONObject().put("versionCode", AbstractC1135r.m2494p()).put("versionName", AbstractC1135r.m2495q());
                List list = c1128k.f3799a;
                JSONObject jSONObjectPut5 = jSONObjectPut4.put("loadMethods", AbstractC1129l.m2458h(AbstractC0123k.m281w0(AbstractC0123k.m264A0(list))));
                List list2 = c1128k.f3800b;
                JSONObject jSONObjectPut6 = jSONObjectPut5.put("hdGalleryMethods", AbstractC1129l.m2458h(AbstractC0123k.m281w0(AbstractC0123k.m264A0(list2)))).put("updatedAt", System.currentTimeMillis());
                boolean z2 = AbstractC1126i.f3786a;
                C1124g.m2438n().edit().putString("custom_local_avatar_methods", jSONObjectPut6.toString()).commit();
                if (list2.isEmpty()) {
                    return new C0047t(false, "未找到高清头像页 Hook 点", true);
                }
                return new C0047t(true, "头像加载 " + list.size() + " 项，大头像 " + list2.size() + " 项", true);
            case 11:
                return ((Class) obj).getName();
            case 12:
                return ((Class) obj).getName();
            case 13:
                return ((Class) obj).getName();
            case 14:
                return ((Class) obj).getName();
            case 19:
                MaskItemBean maskItemBean = (MaskItemBean) obj;
                AbstractC0223g.m418e(maskItemBean, "it");
                return AbstractC0299i.m507C0(maskItemBean.getMaskId()).toString();
            case 20:
                AbstractC0223g.m418e((String) obj, "it");
                return Boolean.valueOf(!AbstractC0307q.m534d0(r15));
            case 22:
                String str5 = (String) obj;
                AbstractC0223g.m418e(str5, "it");
                return "\"" + str5 + "\"";
            case 23:
                return ((Class) obj).getName();
            case 24:
                return ((Class) obj).getName();
            case 25:
                C0868S c0868s = (C0868S) obj;
                AbstractC0223g.m418e(c0868s, "it");
                return c0868s.f2987a + "#" + c0868s.f2989c + "/" + c0868s.f2988b;
            case 27:
                return ((Class) obj).getName();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p097x.InterfaceC1034b
    public boolean test(Object obj) {
        View view = (View) obj;
        switch (this.f2675a) {
            case 15:
                return view instanceof EditText;
            case 16:
                return (view instanceof EditText) && view.getVisibility() == 0;
            default:
                return (view instanceof EditText) && view.getVisibility() == 0;
        }
    }
}
