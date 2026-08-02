package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class px0 extends t70 implements w70 {

    /* JADX INFO: renamed from: d */
    public static final px0 f8630d = new px0(true);

    /* JADX INFO: renamed from: e */
    public static final String f8631e = "ImageSend";

    /* JADX INFO: renamed from: f */
    public static final hx2 f8632f = new hx2(new C0146dy(18));

    /* JADX INFO: renamed from: g */
    public static final hx2 f8633g = new hx2(new C0146dy(19));

    /* JADX INFO: renamed from: h */
    public static final hx2 f8634h = new hx2(new C0146dy(20));

    /* JADX INFO: renamed from: i */
    public static final hx2 f8635i = new hx2(new C0146dy(21));

    /* JADX INFO: renamed from: j */
    public static final hx2 f8636j = new hx2(new C0146dy(22));

    /* JADX INFO: renamed from: k */
    public static final hx2 f8637k = new hx2(new C0146dy(23));

    /* JADX INFO: renamed from: l */
    public static final hx2 f8638l = new hx2(new C0146dy(24));

    /* JADX INFO: renamed from: m */
    public static final hx2 f8639m = new hx2(new C0146dy(25));

    /* JADX INFO: renamed from: j */
    public static Object m4014j(String str, String str2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object value = f8636j.getValue();
        value.getClass();
        Constructor declaredConstructor = ((Class) value).getDeclaredConstructor(null);
        declaredConstructor.getClass();
        ig1.m2344a(declaredConstructor);
        Object objNewInstance = declaredConstructor.newInstance(null);
        ((Field) f8637k.getValue()).setInt(objNewInstance, 4);
        Object objInvoke = ((Method) f8639m.getValue()).invoke(null, null);
        String str3 = objInvoke instanceof String ? (String) objInvoke : null;
        if (str3 == null) {
            str3 = "";
        }
        Object objNewInstance2 = ((Constructor) f8635i.getValue()).newInstance(str, 0, str3, str2, objNewInstance);
        f8630d.getClass();
        ((Field) f8638l.getValue()).set(objNewInstance2, "media_generate_send_img");
        objNewInstance2.getClass();
        return objNewInstance2;
    }

    /* JADX INFO: renamed from: k */
    public static pb1 m4015k(Class cls) {
        Class cls2;
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        while (cls != null) {
            cls2 = Object.class;
            Class<Object> clsM3691A = p40.m3691A(d72.m967a(cls2));
            if (cls.equals(clsM3691A != null ? clsM3691A : Object.class)) {
                break;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                field.getClass();
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            pb1VarM1424E.addAll(arrayList);
            cls = cls.getSuperclass();
        }
        return AbstractC0179eu.m1476z(pb1VarM1424E);
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo8a(ArrayList arrayList) {
        arrayList.add(ox0.f7867b);
        arrayList.add(lx0.f6370b);
        arrayList.add(mx0.f6913b);
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f8631e;
    }
}
