package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class px0 extends t70 implements w70 {
    public static final px0 d = new px0(true);
    public static final String e = "ImageSend";
    public static final hx2 f = new hx2(new dy(18));
    public static final hx2 g = new hx2(new dy(19));
    public static final hx2 h = new hx2(new dy(20));
    public static final hx2 i = new hx2(new dy(21));
    public static final hx2 j = new hx2(new dy(22));
    public static final hx2 k = new hx2(new dy(23));
    public static final hx2 l = new hx2(new dy(24));
    public static final hx2 m = new hx2(new dy(25));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object j(String str, String str2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object value = j.getValue();
        value.getClass();
        Constructor declaredConstructor = ((Class) value).getDeclaredConstructor(null);
        declaredConstructor.getClass();
        ig1.a(declaredConstructor);
        Object objNewInstance = declaredConstructor.newInstance(null);
        ((Field) k.getValue()).setInt(objNewInstance, 4);
        Object objInvoke = ((Method) m.getValue()).invoke(null, null);
        String str3 = objInvoke instanceof String ? (String) objInvoke : null;
        if (str3 == null) {
            str3 = "";
        }
        Object objNewInstance2 = ((Constructor) i.getValue()).newInstance(str, 0, str3, str2, objNewInstance);
        d.getClass();
        ((Field) l.getValue()).set(objNewInstance2, "media_generate_send_img");
        objNewInstance2.getClass();
        return objNewInstance2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pb1 k(Class cls) {
        Class cls2;
        pb1 pb1VarE = eu.E();
        while (cls != null) {
            cls2 = Object.class;
            Class<Object> clsA = p40.A(d72.a(cls2));
            if (cls.equals(clsA != null ? clsA : Object.class)) {
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
            pb1VarE.addAll(arrayList);
            cls = cls.getSuperclass();
        }
        return eu.z(pb1VarE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(ox0.b);
        arrayList.add(lx0.b);
        arrayList.add(mx0.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }
}
