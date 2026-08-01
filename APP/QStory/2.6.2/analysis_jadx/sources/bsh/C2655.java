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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f7947 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f7946 = new ConcurrentHashMap();

    public C2655(Class cls) {
        Class superclass = cls;
        while (superclass != null) {
            Object[] objArr = AbstractC2666.f8000;
            if ((C2654.m5315() || !AbstractC2666.f7996.matcher(superclass.getName()).matches()) && ((AbstractC2666.f7997.matcher(superclass.getName()).matches() && !Modifier.isPrivate(superclass.getModifiers())) || Modifier.isPublic(superclass.getModifiers()) || C2654.m5315())) {
                C2655 c2655 = cls == superclass ? null : (C2655) C2659.f7958.m13853(superclass);
                for (Field field : superclass.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) || C2654.m5315()) {
                        C2634 c2634 = new C2634(field);
                        ConcurrentHashMap concurrentHashMap = this.f7946;
                        String str = c2634.f7878;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap.put(str, c2634);
                        }
                    }
                }
                for (Method method : superclass.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C2654.m5315()) {
                        if (cls == superclass) {
                            m5321(new C2619(method));
                        } else {
                            m5321(c2655.m5318(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                    if (cls == superclass) {
                        m5321(new C2636(constructor));
                    } else {
                        m5321(c2655.m5318(constructor.getName(), constructor.getParameterTypes()));
                    }
                }
            }
            m5322(superclass.getInterfaces());
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m5316(String str) {
        return (List) this.f7947.get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2624 m5317(String str) {
        if (!this.f7947.containsKey(str)) {
            return null;
        }
        for (AbstractC2624 abstractC2624 : m5316(str)) {
            if (abstractC2624.mo5249()) {
                return abstractC2624;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2624 m5318(String str, Class... clsArr) {
        if (!this.f7947.containsKey(str)) {
            return null;
        }
        List listM5316 = m5316(str);
        if (listM5316.isEmpty()) {
            return null;
        }
        if (listM5316.size() == 1) {
            return (AbstractC2624) listM5316.get(0);
        }
        Object[] objArr = AbstractC2666.f8000;
        Interpreter.debug("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM5395 = AbstractC2666.m5395(clsArr, listM5316);
        if (iM5395 == -1) {
            return null;
        }
        return (AbstractC2624) listM5316.get(iM5395);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC2624 m5319(String str) {
        if (!this.f7947.containsKey(str)) {
            return null;
        }
        for (AbstractC2624 abstractC2624 : m5316(str)) {
            if (abstractC2624.mo5252()) {
                return abstractC2624;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5320(String str, AbstractC2624 abstractC2624) {
        ConcurrentHashMap concurrentHashMap = this.f7947;
        if (!concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.put(str, Collections.singletonList(abstractC2624)) == null;
        }
        if (m5316(str).size() == 1) {
            concurrentHashMap.put(str, new ArrayList(m5316(str)));
        }
        return m5316(str).add(abstractC2624);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5321(AbstractC2624 abstractC2624) {
        if (abstractC2624 == null) {
            return;
        }
        boolean zMo5252 = abstractC2624.mo5252();
        String str = abstractC2624.f7878;
        if (!zMo5252 && !abstractC2624.mo5249()) {
            m5320(str, abstractC2624);
            return;
        }
        String strReplaceFirst = str.replaceFirst("[gs]et|is", "");
        if (strReplaceFirst.length() == 1 || Character.isLowerCase(str.charAt(1))) {
            char[] charArray = strReplaceFirst.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            strReplaceFirst = new String(charArray);
        }
        if (m5320(str, abstractC2624)) {
            m5320(strReplaceFirst, abstractC2624);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5322(Class[] clsArr) {
        for (Class cls : clsArr) {
            Object[] objArr = AbstractC2666.f8000;
            if (C2654.m5315() || !AbstractC2666.f7996.matcher(cls.getName()).matches()) {
                C2655 c2655 = (C2655) C2659.f7958.m13853(cls);
                for (Field field : cls.getDeclaredFields()) {
                    C2634 c2634 = new C2634(field);
                    ConcurrentHashMap concurrentHashMap = this.f7946;
                    String str = c2634.f7878;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, c2634);
                    }
                }
                for (Method method : cls.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C2654.m5315()) {
                        m5321(c2655.m5318(method.getName(), method.getParameterTypes()));
                    }
                }
            }
            m5322(cls.getInterfaces());
        }
    }
}
