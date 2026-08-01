package p086r0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONObject;
import p001A0.AbstractC0038k;
import p001A0.AbstractC0039l;
import p001A0.C0021V;
import p001A0.C0035h;
import p001A0.C0047t;
import p006D.AbstractC0079h;
import p007D0.C0095c;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;
import p097x.InterfaceC1034b;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1119b;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.n1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0925n1 implements InterfaceC0204l, InterfaceC1034b, InterfaceC0193a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3299a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.x.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, com.lu.wxmask.MainHook.initTargetPlugins(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.r1.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, r0.t1.P(java.lang.reflect.Method):java.lang.String, r0.t1.d0():java.lang.String, s0.h.onClick(android.content.DialogInterface, int):void, z0.c.b(java.lang.String):java.lang.String, z0.i.<clinit>():void, z0.r.B(boolean):void, z0.r.c(java.lang.String):java.lang.String, z0.r.k(java.lang.Class, java.lang.String, java.lang.String, java.lang.Class):java.lang.reflect.Method, z0.r.m():java.lang.String, z0.r.n(android.content.pm.PackageInfo):java.lang.String, z0.r.w(java.lang.reflect.Method):java.lang.String] */
    public /* synthetic */ C0925n1(int i2) {
        this.f3299a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        switch (this.f3299a) {
            case 5:
                boolean z2 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2416G());
            case 6:
            case 8:
            case 10:
            default:
                SharedPreferences sharedPreferencesM350f = AbstractC0174d.m350f("mask_wechat_config", 4, "getSharedPreferences(...)");
                sharedPreferencesM350f.registerOnSharedPreferenceChangeListener(AbstractC1126i.f3793h);
                return sharedPreferencesM350f;
            case 7:
                boolean z3 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2443s() && C1124g.m2435k().getEnableSearchCommand());
            case 9:
                boolean z4 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2414E());
            case 11:
                boolean z5 = AbstractC1126i.f3786a;
                return Integer.valueOf(AbstractC0079h.m183g(C1124g.m2435k().getQuickDisplayClickCount(), 2, 8) - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) throws Throwable {
        Object c0104d;
        switch (this.f3299a) {
            case 0:
                return ((Class) obj).getName();
            case 1:
                WeakReference weakReference = (WeakReference) obj;
                AbstractC0223g.m418e(weakReference, "it");
                return Boolean.valueOf(weakReference.get() == null);
            case 2:
                return ((Class) obj).getSimpleName();
            case 3:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 11:
            case 16:
            case 17:
            case 24:
            default:
                AbstractC0223g.m418e((C0095c) obj, "it");
                return C0109i.f404a;
            case 8:
                Context context = (Context) obj;
                AbstractC0223g.m418e(context, "appContext");
                C0021V c0021v = null;
                c0021v = null;
                if (AbstractC0038k.m60a()) {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String str = applicationInfo != null ? applicationInfo.sourceDir : null;
                    if (str == null || AbstractC0307q.m534d0(str)) {
                        AbstractC0731a.m1387d("search command dexkit apk path empty");
                    } else {
                        try {
                            c0104d = (C0021V) AbstractC0039l.m62B(str, new C0035h(context, 6));
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("search command dexkit resolve fail", thM246a);
                        }
                        c0021v = (C0021V) (c0104d instanceof C0104d ? null : c0104d);
                    }
                    break;
                }
                if (c0021v == null) {
                    return new C0047t(false, "未找到搜索框结构", true);
                }
                JSONObject jSONObjectPut = new JSONObject().put("searchViewClassNames", AbstractC0039l.m88z(c0021v.f161a)).put("editTextFieldNames", AbstractC0039l.m88z(c0021v.f162b));
                AbstractC0223g.m417d(jSONObjectPut, "put(...)");
                JSONObject jSONObjectM84v = AbstractC0039l.m84v(jSONObjectPut, 2);
                SharedPreferences sharedPreferences = AbstractC0503h.m991x().getSharedPreferences("hook_point_cache", 0);
                AbstractC0223g.m417d(sharedPreferences, "getSharedPreferences(...)");
                sharedPreferences.edit().putString("search_command_v1", jSONObjectM84v.toString()).apply();
                return new C0047t(true, "已找到搜索框结构", true);
            case 10:
                AbstractC0223g.m418e((Context) obj, "appContext");
                AbstractC0039l.m81s("text_status_scan_status_v1", true);
                return C0109i.f404a;
            case 12:
                AbstractC0223g.m418e((Throwable) obj, "it");
                AbstractC0503h.m978P("下载链接打开失败");
                return C0109i.f404a;
            case 13:
                AbstractC0223g.m418e((Throwable) obj, "it");
                AbstractC0503h.m978P("链接打开失败");
                return C0109i.f404a;
            case 14:
                Throwable th2 = (Throwable) obj;
                AbstractC0223g.m418e(th2, "it");
                throw th2;
            case 15:
                Throwable th3 = (Throwable) obj;
                AbstractC0223g.m418e(th3, "e");
                AbstractC0503h.m978P("下载链接打开失败");
                AbstractC0731a.m1387d(th3);
                return C0109i.f404a;
            case 18:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b}, 1));
            case 19:
                AbstractC0223g.m418e((C1119b) obj, "it");
                return C0109i.f404a;
            case 20:
                AbstractC0223g.m418e((C1119b) obj, "it");
                return C0109i.f404a;
            case 21:
                AbstractC0223g.m418e((C1119b) obj, "it");
                return C0109i.f404a;
            case 22:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 23:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02X", Arrays.copyOf(new Object[]{b2}, 1));
            case 25:
                Class cls = (Class) obj;
                AbstractC0223g.m415b(cls);
                return AbstractC1135r.m2478F(cls);
            case 26:
                Method method = (Method) obj;
                return method.getName() + AbstractC1135r.m2501w(method);
            case 27:
                Throwable th4 = (Throwable) obj;
                AbstractC0223g.m418e(th4, "it");
                return th4.getCause();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p097x.InterfaceC1034b
    public boolean test(Object obj) {
        View view = (View) obj;
        switch (this.f3299a) {
            case 4:
                return (view instanceof Button) && ((Button) view).getId() > 0;
            default:
                return view instanceof EditText;
        }
    }
}
