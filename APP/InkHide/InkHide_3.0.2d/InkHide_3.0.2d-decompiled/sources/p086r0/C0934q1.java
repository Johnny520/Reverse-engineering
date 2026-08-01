package p086r0;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import p001A0.C0026a;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0934q1 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3328a;

    /* JADX INFO: renamed from: b */
    public final Object f3329b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0934q1(C0943t1 c0943t1, int i2) {
        this.f3328a = i2;
        this.f3329b = c0943t1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3328a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C0943t1 c0943t1 = (C0943t1) this.f3329b;
                    if (!c0943t1.m2084H(activity)) {
                        C0943t1.m2066a(c0943t1, activity, "activity-create-after");
                    } else {
                        C0943t1.m2069c(c0943t1, activity);
                    }
                    break;
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity2 != null) {
                    C0943t1 c0943t12 = (C0943t1) this.f3329b;
                    if (!c0943t12.m2084H(activity2)) {
                        C0943t1.m2066a(c0943t12, activity2, "activity-resume");
                    } else {
                        c0943t12.m2101t(activity2);
                    }
                    break;
                }
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                Activity activity3 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity3 != null) {
                    Object obj4 = methodHookParam.args[0];
                    Intent intent = obj4 instanceof Intent ? (Intent) obj4 : null;
                    if (intent != null) {
                        C0943t1 c0943t13 = (C0943t1) this.f3329b;
                        c0943t13.getClass();
                        String strM2064W = C0943t1.m2064W(intent);
                        if (strM2064W != null) {
                            if (C0943t1.m2056E(intent)) {
                                c0943t13.m2093V(strM2064W, "activity-new-intent");
                            } else {
                                c0943t13.m2092U(strM2064W, "activity-new-intent");
                            }
                            activity3.setIntent(intent);
                        }
                        if (!c0943t13.m2084H(activity3)) {
                            c0943t13.m2098k(intent, "activity-new-intent");
                        } else {
                            c0943t13.m2101t(activity3);
                        }
                        break;
                    }
                }
                break;
            case 3:
            case 4:
            case 5:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 6:
                try {
                    XC_MethodHook xC_MethodHook = (XC_MethodHook) this.f3329b;
                    if (xC_MethodHook instanceof AbstractC0509a) {
                        ((AbstractC0509a) xC_MethodHook).afterHookedMethod(methodHookParam);
                    } else {
                        XposedHelpers.callMethod(xC_MethodHook, "afterHookedMethod", new Object[]{methodHookParam});
                    }
                } catch (Throwable th) {
                    C0026a c0026a = (C0026a) AbstractC0514f.f1621a.f443b;
                    if (c0026a == null) {
                        return;
                    }
                    c0026a.m9d(th);
                    return;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object intent;
        Object intent2;
        Object intent3;
        switch (this.f3328a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null) {
                    C0943t1.m2066a((C0943t1) this.f3329b, activity, "activity-create-before");
                    break;
                }
                break;
            case 1:
            case 2:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity2 != null) {
                    C0943t1 c0943t1 = (C0943t1) this.f3329b;
                    if (c0943t1.m2084H(activity2)) {
                        boolean zM2095Z = false;
                        if (AbstractC0223g.m414a(methodHookParam.args[0], 4)) {
                            String strM2099m = c0943t1.m2099m(activity2);
                            if (strM2099m != null) {
                                Intent intent4 = activity2.getIntent();
                                Intent intent5 = activity2.getIntent();
                                if (intent5 == null || (intent = intent5.getExtras()) == null) {
                                    intent = activity2.getIntent();
                                }
                                zM2095Z = c0943t1.m2095Z(strM2099m, intent4, C0943t1.m2065X(intent), "activity-current:".concat(activity2.getClass().getName()));
                            }
                            if (zM2095Z) {
                                String strM2099m2 = c0943t1.m2099m(activity2);
                                if (strM2099m2 == null) {
                                    strM2099m2 = "unknown";
                                }
                                c0943t1.m2100s(activity2, strM2099m2);
                                methodHookParam.setResult(Boolean.TRUE);
                            }
                        }
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.args[0];
                Intent intent6 = obj3 instanceof Intent ? (Intent) obj3 : null;
                if (intent6 != null) {
                    C0943t1 c0943t12 = (C0943t1) this.f3329b;
                    c0943t12.getClass();
                    String strM355k = AbstractC0174d.m355k("enabled=", C0943t1.m2052A());
                    Object extras = intent6.getExtras();
                    if (extras == null) {
                        extras = intent6;
                    }
                    AbstractC0731a.m1384a("voip route", strM355k, C0943t1.m2065X(extras));
                    String strM2064W = C0943t1.m2064W(intent6);
                    if (strM2064W != null) {
                        Object extras2 = intent6.getExtras();
                        if (extras2 == null) {
                            extras2 = intent6;
                        }
                        if (c0943t12.m2094Y(strM2064W, intent6, C0943t1.m2065X(extras2), "flutter-route")) {
                            c0943t12.m2092U(strM2064W, "flutter-route");
                            AbstractC0731a.m1384a("block voip route", strM2064W);
                            c0943t12.m2087O("flutter-route", strM2064W);
                            methodHookParam.setResult((Object) null);
                            break;
                        }
                    }
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                Activity activity3 = obj4 instanceof Activity ? (Activity) obj4 : null;
                if (activity3 != null) {
                    C0943t1 c0943t13 = (C0943t1) this.f3329b;
                    if (c0943t13.m2084H(activity3)) {
                        String strM2099m3 = c0943t13.m2099m(activity3);
                        String name = activity3.getClass().getName();
                        String strM355k2 = AbstractC0174d.m355k("enabled=", C0943t1.m2052A());
                        String strM352h = AbstractC0174d.m352h("masked=", strM2099m3);
                        Intent intent7 = activity3.getIntent();
                        if (intent7 == null || (intent2 = intent7.getExtras()) == null) {
                            intent2 = activity3.getIntent();
                        }
                        AbstractC0731a.m1384a("voip activity guard", name, strM355k2, strM352h, C0943t1.m2065X(intent2));
                        if (strM2099m3 != null) {
                            Intent intent8 = activity3.getIntent();
                            Intent intent9 = activity3.getIntent();
                            if (intent9 == null || (intent3 = intent9.getExtras()) == null) {
                                intent3 = activity3.getIntent();
                            }
                            if (c0943t13.m2095Z(strM2099m3, intent8, C0943t1.m2065X(intent3), "activity-guard:".concat(activity3.getClass().getName()))) {
                                AbstractC0731a.m1384a("block voip activity guard", activity3.getClass().getName(), strM2099m3);
                                c0943t13.m2087O("activity-guard:".concat(activity3.getClass().getName()), strM2099m3);
                                c0943t13.m2100s(activity3, strM2099m3);
                                methodHookParam.setResult((Object) null);
                            }
                        }
                        break;
                    }
                }
                break;
            case 6:
                try {
                    XC_MethodHook xC_MethodHook = (XC_MethodHook) this.f3329b;
                    if (xC_MethodHook instanceof AbstractC0509a) {
                        ((AbstractC0509a) xC_MethodHook).beforeHookedMethod(methodHookParam);
                    } else {
                        XposedHelpers.callMethod(xC_MethodHook, "beforeHookedMethod", new Object[]{methodHookParam});
                    }
                } catch (Throwable th) {
                    C0026a c0026a = (C0026a) AbstractC0514f.f1621a.f443b;
                    if (c0026a == null) {
                        return;
                    }
                    c0026a.m9d(th);
                    return;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0934q1(XC_MethodHook xC_MethodHook) {
        super(xC_MethodHook.priority);
        this.f3328a = 6;
        this.f3329b = xC_MethodHook;
    }
}
