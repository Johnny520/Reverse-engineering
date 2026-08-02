package p000;

import android.app.Activity;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oh1 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7684b;

    public /* synthetic */ oh1(int i, Object obj) {
        this.f7683a = i;
        this.f7684b = obj;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f7683a) {
            case 0:
                methodHookParam.getClass();
                Object obj = methodHookParam.thisObject;
                mh1 mh1Var = (mh1) this.f7684b;
                Map map = i42.f4259f;
                try {
                    Field declaredField = obj.getClass().getDeclaredField("$__handler");
                    declaredField.setAccessible(true);
                    declaredField.set(obj, mh1Var);
                    return;
                } catch (IllegalAccessException e) {
                    C0676s.m4650i(e);
                    return;
                } catch (NoSuchFieldException e2) {
                    throw new IllegalArgumentException("Not a valid proxy instance", e2);
                }
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws NoSuchMethodException {
        switch (this.f7683a) {
            case 1:
                methodHookParam.getClass();
                z70 z70Var = (z70) this.f7684b;
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                stackTrace.getClass();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (t11.m5086l(stackTraceElement.getClassName(), ((Class) z70Var.f13753d).getName())) {
                        Object obj = methodHookParam.args[0];
                        ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                        if (arrayList != null && arrayList.size() > 2) {
                            Object objM1161q0 = AbstractC0142du.m1161q0(arrayList);
                            if (t11.m5086l(objM1161q0 != null ? objM1161q0.getClass().getSimpleName() : null, "SettingAdditionHeaderSearch")) {
                                Class cls = (Class) z70Var.f13763n;
                                if (cls == null) {
                                    t11.m5067S("generatedItemClass");
                                    throw null;
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        if (cls.isInstance(it.next())) {
                                            return;
                                        }
                                    }
                                }
                                Class cls2 = (Class) z70Var.f13763n;
                                if (cls2 == null) {
                                    t11.m5067S("generatedItemClass");
                                    throw null;
                                }
                                Class cls3 = (Class) z70Var.f13764o;
                                if (cls3 == null) {
                                    t11.m5067S("activityConstructorType");
                                    throw null;
                                }
                                Constructor declaredConstructor = cls2.getDeclaredConstructor(cls3);
                                declaredConstructor.setAccessible(true);
                                Activity activity = up0.f11403k;
                                if (activity != null) {
                                    arrayList.add(1, declaredConstructor.newInstance(activity));
                                    return;
                                } else {
                                    t11.m5067S("hostAct");
                                    throw null;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
        }
    }
}
