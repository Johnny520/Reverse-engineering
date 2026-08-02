package p000;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import nuke.p003ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f12 extends AbstractC0812vj implements w70 {

    /* JADX INFO: renamed from: d */
    public static final f12 f2735d = new f12(true);

    /* JADX INFO: renamed from: e */
    public static final String f2736e = "PlusMenuInject";

    /* JADX INFO: renamed from: j */
    public static void m1490j() {
        Class cls;
        Activity activity = up0.f11403k;
        if (activity == null) {
            t11.m5067S("hostAct");
            throw null;
        }
        Activity activity2 = up0.f11403k;
        if (activity2 == null) {
            t11.m5067S("hostAct");
            throw null;
        }
        cls = HomeActivity.class;
        Class<HomeActivity> clsM3691A = p40.m3691A(d72.m967a(cls));
        activity.startActivity(new Intent(activity2, clsM3691A != null ? clsM3691A : HomeActivity.class));
    }

    /* JADX INFO: renamed from: k */
    public static String m1491k(Object obj) {
        Field field;
        Field field2;
        Object obj2;
        Class cls;
        Class cls2;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        declaredFields.getClass();
        int length = declaredFields.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i2];
            Class<?> type = field.getType();
            cls2 = Boolean.class;
            Class<Boolean> clsM3691A = p40.m3691A(d72.m967a(cls2));
            if (!t11.m5086l(type, clsM3691A != null ? clsM3691A : Boolean.class)) {
                break;
            }
            i2++;
        }
        if (field != null) {
            ig1.m2344a(field);
            Object obj3 = field.get(obj);
            if (obj3 != null) {
                Field[] declaredFields2 = obj3.getClass().getDeclaredFields();
                declaredFields2.getClass();
                int length2 = declaredFields2.length;
                while (true) {
                    if (i >= length2) {
                        field2 = null;
                        break;
                    }
                    field2 = declaredFields2[i];
                    Class<?> type2 = field2.getType();
                    cls = String.class;
                    Class<String> clsM3691A2 = p40.m3691A(d72.m967a(cls));
                    if (t11.m5086l(type2, clsM3691A2 != null ? clsM3691A2 : String.class)) {
                        break;
                    }
                    i++;
                }
                if (field2 != null) {
                    ig1.m2344a(field2);
                    obj2 = field2.get(obj3);
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
            }
        }
        return null;
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(d12.f1811b);
        arrayList.add(e12.f2294b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f2736e;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        int i = 8;
        ld3.m2898a(1699, new hn1(i), "Nuke");
        Constructor<?> constructor = up0.m5529H("com.tencent.mm.ui.HomeUI$PlusActionView").getDeclaredConstructors()[0];
        constructor.getClass();
        XposedBridge.hookMethod(constructor, new kg3(this, null, new eq1(6))).getClass();
        sg1 sg1VarM3244v = op0.m3602y(d12.f1811b.m5639d()).m3244v();
        sg1VarM3244v.f13871b = "getView";
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new eq1(i))).getClass();
        sg1 sg1VarM3244v2 = op0.m3602y(e12.f2294b.m5639d()).m3244v();
        sg1VarM3244v2.f13871b = "onItemClick";
        Method method2 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v2.m4863c())).f13895j;
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, null, new eq1(7))).getClass();
    }
}
