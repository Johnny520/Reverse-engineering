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
public final class C2656 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f7949 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f7948 = new ConcurrentHashMap();

    public C2656(Class cls) {
        Class superclass = cls;
        while (superclass != null) {
            Object[] objArr = AbstractC2667.f8002;
            if ((C2655.m5360() || !AbstractC2667.f7998.matcher(superclass.getName()).matches()) && ((AbstractC2667.f7999.matcher(superclass.getName()).matches() && !Modifier.isPrivate(superclass.getModifiers())) || Modifier.isPublic(superclass.getModifiers()) || C2655.m5360())) {
                C2656 c2656 = cls == superclass ? null : (C2656) C2660.f7960.m13870(superclass);
                for (Field field : superclass.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) || C2655.m5360()) {
                        C2635 c2635 = new C2635(field);
                        ConcurrentHashMap concurrentHashMap = this.f7948;
                        String str = c2635.f7880;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap.put(str, c2635);
                        }
                    }
                }
                for (Method method : superclass.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C2655.m5360()) {
                        if (cls == superclass) {
                            m5366(new C2620(method));
                        } else {
                            m5366(c2656.m5363(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                    if (cls == superclass) {
                        m5366(new C2637(constructor));
                    } else {
                        m5366(c2656.m5363(constructor.getName(), constructor.getParameterTypes()));
                    }
                }
            }
            m5367(superclass.getInterfaces());
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m5361(String str) {
        return (List) this.f7949.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2625 m5362(String str) {
        if (!this.f7949.containsKey(str)) {
            return null;
        }
        for (AbstractC2625 abstractC2625 : m5361(str)) {
            if (abstractC2625.mo5294()) {
                return abstractC2625;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2625 m5363(String str, Class... clsArr) {
        if (!this.f7949.containsKey(str)) {
            return null;
        }
        List listM5361 = m5361(str);
        if (listM5361.isEmpty()) {
            return null;
        }
        if (listM5361.size() == 1) {
            return (AbstractC2625) listM5361.get(0);
        }
        Object[] objArr = AbstractC2667.f8002;
        Interpreter.debug("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM5440 = AbstractC2667.m5440(clsArr, listM5361);
        if (iM5440 == -1) {
            return null;
        }
        return (AbstractC2625) listM5361.get(iM5440);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2625 m5364(String str) {
        if (!this.f7949.containsKey(str)) {
            return null;
        }
        for (AbstractC2625 abstractC2625 : m5361(str)) {
            if (abstractC2625.mo5297()) {
                return abstractC2625;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5365(String str, AbstractC2625 abstractC2625) {
        ConcurrentHashMap concurrentHashMap = this.f7949;
        if (!concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.put(str, Collections.singletonList(abstractC2625)) == null;
        }
        if (m5361(str).size() == 1) {
            concurrentHashMap.put(str, new ArrayList(m5361(str)));
        }
        return m5361(str).add(abstractC2625);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5366(AbstractC2625 abstractC2625) {
        if (abstractC2625 == null) {
            return;
        }
        boolean zMo5297 = abstractC2625.mo5297();
        String str = abstractC2625.f7880;
        if (!zMo5297 && !abstractC2625.mo5294()) {
            m5365(str, abstractC2625);
            return;
        }
        String strReplaceFirst = str.replaceFirst("[gs]et|is", "");
        if (strReplaceFirst.length() == 1 || Character.isLowerCase(str.charAt(1))) {
            char[] charArray = strReplaceFirst.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            strReplaceFirst = new String(charArray);
        }
        if (m5365(str, abstractC2625)) {
            m5365(strReplaceFirst, abstractC2625);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5367(Class[] clsArr) {
        for (Class cls : clsArr) {
            Object[] objArr = AbstractC2667.f8002;
            if (C2655.m5360() || !AbstractC2667.f7998.matcher(cls.getName()).matches()) {
                C2656 c2656 = (C2656) C2660.f7960.m13870(cls);
                for (Field field : cls.getDeclaredFields()) {
                    C2635 c2635 = new C2635(field);
                    ConcurrentHashMap concurrentHashMap = this.f7948;
                    String str = c2635.f7880;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, c2635);
                    }
                }
                for (Method method : cls.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C2655.m5360()) {
                        m5366(c2656.m5363(method.getName(), method.getParameterTypes()));
                    }
                }
            }
            m5367(cls.getInterfaces());
        }
    }
}
