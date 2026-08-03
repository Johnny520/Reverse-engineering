package p153k8;

import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p068eh.AbstractC0921a;
import p099h.Hchat.utils.KavaReflector;
import tf.C4173t;

/* JADX INFO: renamed from: k8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2338b {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f7663a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f7664b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m5563a(Object obj) {
        int i9;
        long jLongValue;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                boolean z9 = false;
                if (AbstractC0921a.m2263z("com.tencent.mm.storage.", obj3, false)) {
                    String[] strArr = {"getMsgId", "getMsgID", "getId"};
                    i9 = 0;
                    while (true) {
                        if (i9 < 3) {
                        }
                        i9++;
                    }
                    if (jLongValue > 0) {
                    }
                } else {
                    List<Method> listDeclaredMethods = KavaReflector.declaredMethods(obj3.getClass());
                    if (listDeclaredMethods == null || !listDeclaredMethods.isEmpty()) {
                        for (Method method : listDeclaredMethods) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && (AbstractC1416l.m3825a(method.getName(), "getMsgId") || AbstractC1416l.m3825a(method.getName(), "getMsgID"))) {
                                if (AbstractC1416l.m3825a(method.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Long.class)) {
                                    String[] strArr2 = {"getMsgId", "getMsgID", "getId"};
                                    i9 = 0;
                                    while (true) {
                                        if (i9 < 3) {
                                            String[] strArr3 = {"field_msgId", "msgId", "msgID", "id"};
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= 4) {
                                                    jLongValue = 0;
                                                    break;
                                                }
                                                Object field = KavaReflector.readField(obj3, strArr3[i10]);
                                                Number number = field instanceof Number ? (Number) field : null;
                                                if (number != null) {
                                                    long jLongValue2 = number.longValue();
                                                    Long lValueOf = Long.valueOf(jLongValue2);
                                                    if (jLongValue2 <= 0) {
                                                        lValueOf = null;
                                                    }
                                                    if (lValueOf != null) {
                                                        jLongValue = lValueOf.longValue();
                                                        break;
                                                    }
                                                }
                                                i10++;
                                            }
                                        } else {
                                            Object objInvokeMethod = KavaReflector.invokeMethod(obj3, strArr2[i9], new Object[0]);
                                            Number number2 = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
                                            if (number2 != null) {
                                                long jLongValue3 = number2.longValue();
                                                Long lValueOf2 = Long.valueOf(jLongValue3);
                                                if (jLongValue3 <= 0) {
                                                    lValueOf2 = null;
                                                }
                                                if (lValueOf2 != null) {
                                                    jLongValue = lValueOf2.longValue();
                                                    break;
                                                }
                                            }
                                            i9++;
                                        }
                                    }
                                    if (jLongValue > 0) {
                                        z9 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if (z9) {
                    arrayList2.add(obj3);
                }
            }
            if (arrayList2.size() == list.size()) {
                return arrayList2;
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m5564b(Object obj) {
        List listM5563a;
        List listM5563a2;
        Object field;
        C4173t c4173t = C4173t.f13710g;
        if (obj != null) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            ArrayDeque arrayDeque = new ArrayDeque();
            setNewSetFromMap.add(obj);
            arrayDeque.add(new C2337a(obj, 0));
            while (!arrayDeque.isEmpty()) {
                C2337a c2337a = (C2337a) arrayDeque.removeFirst();
                Object obj2 = c2337a.f7661a;
                int i9 = c2337a.f7662b;
                Class<?> cls = obj2.getClass();
                ConcurrentHashMap concurrentHashMap = f7663a;
                Field field2 = (Field) concurrentHashMap.get(cls);
                if (field2 != null) {
                    listM5563a = m5563a(KavaReflector.readField(field2, obj2));
                    if (listM5563a.isEmpty()) {
                        listM5563a = null;
                    }
                    if (listM5563a == null) {
                        for (Class<?> superclass = obj2.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                            for (Field field3 : KavaReflector.declaredFields(superclass)) {
                                if (!Modifier.isStatic(field3.getModifiers()) && List.class.isAssignableFrom(field3.getType())) {
                                    List listM5563a3 = m5563a(KavaReflector.readField(field3, obj2));
                                    if (!listM5563a3.isEmpty()) {
                                        concurrentHashMap.put(obj2.getClass(), field3);
                                        listM5563a = listM5563a3;
                                        break;
                                    }
                                }
                            }
                        }
                        listM5563a = c4173t;
                    }
                }
                if (listM5563a.isEmpty()) {
                    listM5563a = null;
                }
                if (listM5563a != null) {
                    return listM5563a;
                }
                Class<?> cls2 = obj2.getClass();
                ConcurrentHashMap concurrentHashMap2 = f7664b;
                Method method = (Method) concurrentHashMap2.get(cls2);
                if (method != null) {
                    listM5563a2 = m5563a(KavaReflector.invoke(method, obj2, new Object[0]));
                    if (listM5563a2.isEmpty()) {
                        listM5563a2 = null;
                    }
                    if (listM5563a2 == null) {
                        for (Class<?> superclass2 = obj2.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                            for (Method method2 : KavaReflector.declaredMethods(superclass2)) {
                                if (!Modifier.isStatic(method2.getModifiers())) {
                                    Class<?>[] parameterTypes = method2.getParameterTypes();
                                    parameterTypes.getClass();
                                    if (parameterTypes.length == 0 && List.class.isAssignableFrom(method2.getReturnType())) {
                                        List listM5563a4 = m5563a(KavaReflector.invoke(method2, obj2, new Object[0]));
                                        if (!listM5563a4.isEmpty()) {
                                            concurrentHashMap2.put(obj2.getClass(), method2);
                                            listM5563a2 = listM5563a4;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        listM5563a2 = c4173t;
                    }
                }
                List list = listM5563a2.isEmpty() ? null : listM5563a2;
                if (list != null) {
                    return list;
                }
                if (i9 < 4) {
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass3 = obj2.getClass(); superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                        for (Field field4 : KavaReflector.declaredFields(superclass3)) {
                            if (!Modifier.isStatic(field4.getModifiers()) && !field4.getType().isPrimitive() && !field4.getType().isArray() && (field = KavaReflector.readField(field4, obj2)) != null && AbstractC0921a.m2263z("com.tencent.mm.ui.chatting.component.", field, false)) {
                                arrayList.add(field);
                            }
                        }
                    }
                    for (Object obj3 : arrayList) {
                        if (setNewSetFromMap.add(obj3)) {
                            arrayDeque.add(new C2337a(obj3, i9 + 1));
                        }
                    }
                }
            }
        }
        return c4173t;
    }
}
