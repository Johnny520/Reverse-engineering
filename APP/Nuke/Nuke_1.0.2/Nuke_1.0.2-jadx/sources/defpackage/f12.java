package defpackage;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f12 extends vj implements w70 {
    public static final f12 d = new f12(true);
    public static final String e = "PlusMenuInject";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j() {
        Class cls;
        Activity activity = up0.k;
        if (activity == null) {
            t11.S("hostAct");
            throw null;
        }
        Activity activity2 = up0.k;
        if (activity2 == null) {
            t11.S("hostAct");
            throw null;
        }
        cls = HomeActivity.class;
        Class<HomeActivity> clsA = p40.A(d72.a(cls));
        activity.startActivity(new Intent(activity2, clsA != null ? clsA : HomeActivity.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String k(Object obj) {
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
            Class<Boolean> clsA = p40.A(d72.a(cls2));
            if (!t11.l(type, clsA != null ? clsA : Boolean.class)) {
                break;
            }
            i2++;
        }
        if (field != null) {
            ig1.a(field);
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
                    Class<String> clsA2 = p40.A(d72.a(cls));
                    if (t11.l(type2, clsA2 != null ? clsA2 : String.class)) {
                        break;
                    }
                    i++;
                }
                if (field2 != null) {
                    ig1.a(field2);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(d12.b);
        arrayList.add(e12.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        int i = 8;
        ld3.a(1699, new hn1(i), "Nuke");
        Constructor<?> constructor = up0.H("com.tencent.mm.ui.HomeUI$PlusActionView").getDeclaredConstructors()[0];
        constructor.getClass();
        XposedBridge.hookMethod(constructor, new kg3(this, null, new eq1(6))).getClass();
        sg1 sg1VarV = op0.y(d12.b.d()).v();
        sg1VarV.b = "getView";
        Method method = ((zg1) du.o0(sg1VarV.c())).j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new eq1(i))).getClass();
        sg1 sg1VarV2 = op0.y(e12.b.d()).v();
        sg1VarV2.b = "onItemClick";
        Method method2 = ((zg1) du.o0(sg1VarV2.c())).j;
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, null, new eq1(7))).getClass();
    }
}
