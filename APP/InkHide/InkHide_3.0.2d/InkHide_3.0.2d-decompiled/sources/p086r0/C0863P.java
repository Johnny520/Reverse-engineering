package p086r0;

import android.content.ContentValues;
import android.content.Context;
import android.media.AudioAttributes;
import android.view.View;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p001A0.AbstractC0039l;
import p009E0.C0103c;
import p011F0.AbstractC0120h;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;
import p059d0.InterfaceC0518c;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0863P implements InterfaceC0204l, InterfaceC0193a, InterfaceC0518c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2971a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [r0.H0.<clinit>():void, r0.H0.E(java.lang.Class):java.lang.reflect.Method, r0.H0.F(java.lang.Object, int, java.util.Set):r0.A0, r0.H0.G(java.lang.Object, int, java.util.Set):r0.B0, r0.H0.f1(java.lang.reflect.Method):java.lang.String, r0.H0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.H0.p():java.lang.String, r0.H0.s0(android.content.Context):void, r0.L0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.Y0.a(r0.Y0, de.robv.android.xposed.XC_MethodHook$MethodHookParam, java.lang.Class, java.lang.Class):r0.P0, r0.Y0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.d0.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.f1.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.l1.H(java.lang.reflect.Method):java.lang.String, r0.l1.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.t1.<clinit>():void] */
    public /* synthetic */ C0863P(int i2) {
        this.f2971a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p059d0.InterfaceC0518c
    /* JADX INFO: renamed from: a */
    public boolean mo6a(AccessibleObject accessibleObject) {
        switch (this.f2971a) {
            case 8:
                Method method = (Method) accessibleObject;
                if (!C0842H0.f2822p0.contains(method.getName())) {
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
            case 9:
            default:
                Method method2 = (Method) accessibleObject;
                Class cls2 = Byte.TYPE;
                Class cls3 = Short.TYPE;
                Class cls4 = Long.TYPE;
                Class cls5 = Float.TYPE;
                Class cls6 = Double.TYPE;
                Class cls7 = Boolean.TYPE;
                Class cls8 = Integer.TYPE;
                return method2.getParameterTypes().length == 1 && AbstractC0223g.m414a(method2.getParameterTypes()[0], cls8) && !AbstractC0120h.m254b0(new Class[]{Object.class, String.class, cls2, cls3, cls4, cls5, cls6, String.class, cls7, cls2, cls3, cls7, cls8, cls4, cls5, cls6, Void.TYPE}, method2.getReturnType()) && Modifier.isPublic(method2.getModifiers()) && !Modifier.isAbstract(method2.getModifiers());
            case 10:
                Method method3 = (Method) accessibleObject;
                if (AbstractC0223g.m414a(method3.getName(), "onResume")) {
                    Class<?>[] parameterTypes2 = method3.getParameterTypes();
                    AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                    if (parameterTypes2.length == 0) {
                        return true;
                    }
                }
                return false;
            case 11:
                Method method4 = (Method) accessibleObject;
                return AbstractC0223g.m414a(method4.getName(), "rawQuery") || AbstractC0223g.m414a(method4.getName(), "rawQueryWithFactory");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        switch (this.f2971a) {
            case 3:
                boolean z2 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2448x());
            case 6:
                boolean z3 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2448x());
            case 9:
                boolean z4 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2448x());
            case 12:
                return new AudioAttributes.Builder().setUsage(4).setContentType(4).build();
            case 13:
                boolean z5 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2415F());
            case 21:
                boolean z6 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2448x());
            case 25:
                boolean z7 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2412C() || (C1124g.m2443s() && C1124g.m2435k().getHideSnsLike()) || ((C1124g.m2443s() && C1124g.m2435k().getHideSnsCloseFriendPosts()) || C1124g.m2410A()));
            case 27:
                boolean z8 = AbstractC1126i.f3786a;
                return Boolean.valueOf(C1124g.m2413D());
            default:
                return new AudioAttributes.Builder().setUsage(4).setContentType(4).build();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        switch (this.f2971a) {
            case 0:
                AbstractC0223g.m418e((Context) obj, "appContext");
                AbstractC0039l.m81s("contact_scan_status_v2", true);
                break;
            case 1:
                String str = (String) obj;
                AbstractC0223g.m418e(str, "it");
                break;
            case 2:
                String string = obj != null ? obj.toString() : null;
                if (string == null) {
                }
                break;
            case 4:
                String string2 = obj != null ? obj.toString() : null;
                if (string2 == null) {
                }
                break;
            case 5:
                String string3 = obj != null ? obj.toString() : null;
                if (string3 == null) {
                }
                break;
            case 14:
                Method method = (Method) obj;
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                break;
            case 15:
                MaskItemBean maskItemBean = (MaskItemBean) obj;
                AbstractC0223g.m418e(maskItemBean, "it");
                break;
            case 16:
                AbstractC0223g.m418e((String) obj, "it");
                break;
            case 18:
                Method method2 = (Method) obj;
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                break;
            case 19:
                C0103c c0103c = (C0103c) obj;
                AbstractC0223g.m418e(c0103c, "<destruct>");
                break;
            case 23:
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                }
                break;
        }
        return ((Class) obj).getName();
    }
}
