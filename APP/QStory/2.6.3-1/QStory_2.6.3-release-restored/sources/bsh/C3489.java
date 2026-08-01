package bsh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8294 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f8293 = new ConcurrentHashMap();

    public C3489(Class cls) {
        Class superclass = cls;
        while (superclass != null) {
            Object[] objArr = AbstractC3500.f8347;
            if ((C3488.m5920() || !AbstractC3500.f8343.matcher(superclass.getName()).matches()) && ((AbstractC3500.f8344.matcher(superclass.getName()).matches() && !Modifier.isPrivate(superclass.getModifiers())) || Modifier.isPublic(superclass.getModifiers()) || C3488.m5920())) {
                C3489 c3489 = cls == superclass ? null : (C3489) C3493.f8305.m14429(superclass);
                for (Field field : superclass.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) || C3488.m5920()) {
                        C3468 c3468 = new C3468(field);
                        ConcurrentHashMap concurrentHashMap = this.f8293;
                        String str = c3468.f8225;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap.put(str, c3468);
                        }
                    }
                }
                for (Method method : superclass.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C3488.m5920()) {
                        if (cls == superclass) {
                            m5926(new C3453(method));
                        } else {
                            m5926(c3489.m5923(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                    if (cls == superclass) {
                        m5926(new C3470(constructor));
                    } else {
                        m5926(c3489.m5923(constructor.getName(), constructor.getParameterTypes()));
                    }
                }
            }
            m5927(superclass.getInterfaces());
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m5921(String str) {
        return (List) this.f8294.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3458 m5922(String str) {
        if (!this.f8294.containsKey(str)) {
            return null;
        }
        for (AbstractC3458 abstractC3458 : m5921(str)) {
            if (abstractC3458.mo5854()) {
                return abstractC3458;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3458 m5923(String str, Class... clsArr) {
        if (!this.f8294.containsKey(str)) {
            return null;
        }
        List listM5921 = m5921(str);
        if (listM5921.isEmpty()) {
            return null;
        }
        if (listM5921.size() == 1) {
            return (AbstractC3458) listM5921.get(0);
        }
        Object[] objArr = AbstractC3500.f8347;
        Interpreter.debug("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM6000 = AbstractC3500.m6000(clsArr, listM5921);
        if (iM6000 == -1) {
            return null;
        }
        return (AbstractC3458) listM5921.get(iM6000);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC3458 m5924(String str) {
        if (!this.f8294.containsKey(str)) {
            return null;
        }
        for (AbstractC3458 abstractC3458 : m5921(str)) {
            if (abstractC3458.mo5857()) {
                return abstractC3458;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5925(String str, AbstractC3458 abstractC3458) {
        ConcurrentHashMap concurrentHashMap = this.f8294;
        if (!concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.put(str, Collections.singletonList(abstractC3458)) == null;
        }
        if (m5921(str).size() == 1) {
            concurrentHashMap.put(str, new ArrayList(m5921(str)));
        }
        return m5921(str).add(abstractC3458);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5926(AbstractC3458 abstractC3458) {
        if (abstractC3458 == null) {
            return;
        }
        boolean zMo5857 = abstractC3458.mo5857();
        String str = abstractC3458.f8225;
        if (!zMo5857 && !abstractC3458.mo5854()) {
            m5925(str, abstractC3458);
            return;
        }
        String strReplaceFirst = str.replaceFirst("[gs]et|is", "");
        if (strReplaceFirst.length() == 1 || Character.isLowerCase(str.charAt(1))) {
            char[] charArray = strReplaceFirst.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            strReplaceFirst = new String(charArray);
        }
        if (m5925(str, abstractC3458)) {
            m5925(strReplaceFirst, abstractC3458);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5927(Class[] clsArr) {
        for (Class cls : clsArr) {
            Object[] objArr = AbstractC3500.f8347;
            if (C3488.m5920() || !AbstractC3500.f8343.matcher(cls.getName()).matches()) {
                C3489 c3489 = (C3489) C3493.f8305.m14429(cls);
                for (Field field : cls.getDeclaredFields()) {
                    C3468 c3468 = new C3468(field);
                    ConcurrentHashMap concurrentHashMap = this.f8293;
                    String str = c3468.f8225;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, c3468);
                    }
                }
                for (Method method : cls.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C3488.m5920()) {
                        m5926(c3489.m5923(method.getName(), method.getParameterTypes()));
                    }
                }
            }
            m5927(cls.getInterfaces());
        }
    }
}
