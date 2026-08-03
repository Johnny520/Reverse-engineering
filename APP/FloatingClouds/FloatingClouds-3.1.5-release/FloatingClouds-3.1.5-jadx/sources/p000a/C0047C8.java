package p000a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.C8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047C8 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HashSet f175b;

    public /* synthetic */ C0047C8(C0065D8 c0065d8, HashSet hashSet, int i) {
        this.f174a = i;
        this.f175b = hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo53f(Object obj) {
        Object objM2206a;
        String str;
        HashSet hashSet;
        Class<?> superclass;
        Object next;
        Method method;
        switch (this.f174a) {
            case 0:
                if (obj == null) {
                    return Boolean.FALSE;
                }
                boolean z = true;
                try {
                    superclass = obj.getClass();
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                while (superclass != null && !superclass.equals(Object.class)) {
                    C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                    while (c0112g1M2122I.hasNext()) {
                        Field field = (Field) c0112g1M2122I.next();
                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive() && !C0631i9.m1478a(field.getType(), String.class) && !Collection.class.isAssignableFrom(field.getType())) {
                            field.setAccessible(z);
                            Object obj2 = field.get(obj);
                            if (obj2 != null) {
                                C0112G1 c0112g1M2122I2 = C0889w1.m2122I(obj2.getClass().getDeclaredFields());
                                while (c0112g1M2122I2.hasNext()) {
                                    Field field2 = (Field) c0112g1M2122I2.next();
                                    if (Collection.class.isAssignableFrom(field2.getType())) {
                                        field2.setAccessible(z);
                                        Object obj3 = field2.get(obj2);
                                        Collection collection = obj3 instanceof Collection ? (Collection) obj3 : null;
                                        if (collection != null) {
                                            Iterator it = collection.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    if (next != null) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            if (next != null) {
                                                Method[] methods = next.getClass().getMethods();
                                                C0631i9.m1481d(methods, "getMethods(...)");
                                                int length = methods.length;
                                                int i = 0;
                                                while (true) {
                                                    if (i < length) {
                                                        method = methods[i];
                                                        if (C0631i9.m1478a(method.getName(), "o") && C0631i9.m1478a(method.getReturnType(), String.class)) {
                                                            Class<?>[] parameterTypes = method.getParameterTypes();
                                                            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                                                            if (parameterTypes.length == 0) {
                                                            }
                                                        }
                                                        i++;
                                                    } else {
                                                        method = null;
                                                    }
                                                }
                                                if (method != null) {
                                                    Object objInvoke = method.invoke(next, null);
                                                    str = objInvoke instanceof String ? (String) objInvoke : null;
                                                    if (str != null && !C0034Be.m101P(str)) {
                                                        hashSet = this.f175b;
                                                        if (str == null && hashSet.contains(str)) {
                                                            return Boolean.TRUE;
                                                        }
                                                        String strM156a = C0065D8.m156a(obj);
                                                        return Boolean.valueOf(strM156a == null && hashSet.contains(strM156a));
                                                    }
                                                }
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                    z = true;
                }
                objM2206a = C0065D8.m156a(obj);
                str = (String) (objM2206a instanceof C0901wd.a ? null : objM2206a);
                hashSet = this.f175b;
                if (str == null) {
                }
                String strM156a2 = C0065D8.m156a(obj);
                return Boolean.valueOf(strM156a2 == null && hashSet.contains(strM156a2));
            default:
                if (obj == null) {
                    return Boolean.FALSE;
                }
                String strM156a3 = C0065D8.m156a(obj);
                HashSet hashSet2 = this.f175b;
                if (strM156a3 != null) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"HideTextStatus: [StoreK] item wxid=" + strM156a3 + " masked=" + hashSet2.contains(strM156a3)}, 1));
                }
                return Boolean.valueOf(strM156a3 != null && hashSet2.contains(strM156a3));
        }
    }
}
