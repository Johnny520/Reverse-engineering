package p049b0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0140f;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.C0406i;

/* JADX INFO: renamed from: b0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0566p {
    /* JADX INFO: renamed from: a */
    public static Object m1376a(Object obj, String[] strArr) {
        Method method;
        Object objM116u;
        Object[] objArr = new Object[0];
        AbstractC0307g.m703e(obj, "receiver");
        for (String str : strArr) {
            Class<?> cls = obj.getClass();
            int length = objArr.length;
            AbstractC0307g.m703e(str, "name");
            C0406i c0406iM861K = AbstractC0358S.m861K(new C0565o(cls, null));
            while (true) {
                if (!c0406iM861K.hasNext()) {
                    method = null;
                    break;
                }
                C0172c c0172cM714c = AbstractC0317q.m714c(((Class) c0406iM861K.next()).getDeclaredMethods());
                while (c0172cM714c.hasNext()) {
                    method = (Method) c0172cM714c.next();
                    if (AbstractC0307g.m699a(method.getName(), str) && method.getParameterTypes().length == length) {
                        method.setAccessible(true);
                        break;
                    }
                }
            }
            if (method != null) {
                try {
                    method.setAccessible(true);
                    objM116u = method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    return null;
                }
                return objM116u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m1377b(Object obj) {
        AbstractC0307g.m703e(obj, "instance");
        ArrayList arrayList = new ArrayList();
        C0406i c0406iM861K = AbstractC0358S.m861K(new C0565o(obj.getClass(), null));
        while (c0406iM861K.hasNext()) {
            C0172c c0172cM714c = AbstractC0317q.m714c(((Class) c0406iM861K.next()).getDeclaredFields());
            while (c0172cM714c.hasNext()) {
                Field field = (Field) c0172cM714c.next();
                try {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && ((obj2 instanceof List) || AbstractC0317q.m713b(obj2))) {
                        arrayList.add(new C0139e(field, obj2));
                    }
                } catch (Throwable th) {
                    AbstractC0040p.m116u(th);
                }
            }
        }
        return arrayList;
    }
}
