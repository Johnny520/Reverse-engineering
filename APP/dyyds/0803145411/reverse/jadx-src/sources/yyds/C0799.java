package yyds;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛴᛲᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0799 implements InterfaceC0652 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2175 f3665;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final List f3666;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2133 f3667;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2556 f3668;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f3669;

    public C0799(C2133 c2133, int i, C2175 c2175, C2556 c2556, List list) {
        this.f3667 = c2133;
        this.f3669 = i;
        this.f3665 = c2175;
        this.f3668 = c2556;
        this.f3666 = list;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m1843(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC1301.m2587(field) + " and " + AbstractC1301.m2587(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        Class cls = c2805.f13682;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC1741 abstractC1741 = AbstractC1301.f5958;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C1289();
        }
        C2810.m4947(this.f3666);
        return AbstractC1301.f5958.mo2341(cls) ? new C2211(cls, m1844(c0114, c2805, cls, true)) : new C1810(this.f3667.m4051(c2805, true), m1844(c0114, c2805, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [yyds.ᛴᛲᛴᛵ] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1821 m1844(C0114 c0114, C2805 c2805, Class cls, boolean z) {
        ?? r26;
        ?? r262;
        Method method;
        InterfaceC0770 interfaceC0770;
        List listAsList;
        String name;
        boolean z2;
        ?? SingletonList;
        InterfaceC0048 interfaceC0048;
        C0114 c01142;
        boolean z3;
        Field field;
        ?? r27;
        AbstractC2720 abstractC2720M521;
        C1782 c1782;
        if (cls.isInterface()) {
            return C1821.f9147;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C2805 c28052 = c2805;
        Class cls2 = cls;
        while (true) {
            Type type = c28052.f13683;
            if (cls2 == Object.class) {
                return new C1821(linkedHashMap, new ArrayList(linkedHashMap2.values()));
            }
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                C2810.m4947(this.f3666);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i = 0;
            while (i < length) {
                Field field2 = declaredFields[i];
                boolean zM1845 = m1845(field2, true);
                boolean zM18452 = m1845(field2, r14);
                if (zM1845 || zM18452) {
                    if (!z) {
                        r26 = zM18452;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        r26 = r14;
                    } else {
                        Method methodMo2342 = AbstractC1301.f5958.mo2342(cls2, field2);
                        AbstractC1301.m2588(methodMo2342);
                        if (methodMo2342.getAnnotation(InterfaceC0770.class) != null && field2.getAnnotation(InterfaceC0770.class) == null) {
                            throw new C1600(AbstractC2104.m4014("@SerializedName on ", AbstractC1301.m2589(methodMo2342, r14), " is not supported"));
                        }
                        r262 = zM18452;
                        method = methodMo2342;
                        if (method == null) {
                            AbstractC1301.m2588(field2);
                        }
                        Type typeM3708 = AbstractC1917.m3708(type, cls2, field2.getGenericType(), new HashMap());
                        interfaceC0770 = (InterfaceC0770) field2.getAnnotation(InterfaceC0770.class);
                        if (interfaceC0770 != null) {
                            switch (this.f3669) {
                                case 1:
                                    name = field2.getName();
                                    break;
                                case 2:
                                    name = AbstractC2104.m4008(field2.getName());
                                    break;
                                case 3:
                                    name = AbstractC2104.m4008(AbstractC2104.m4004(field2.getName(), ' '));
                                    break;
                                case 4:
                                    name = AbstractC2104.m4004(field2.getName(), '_').toUpperCase(Locale.ENGLISH);
                                    break;
                                case 5:
                                    name = AbstractC2104.m4004(field2.getName(), '_').toLowerCase(Locale.ENGLISH);
                                    break;
                                case 6:
                                    name = AbstractC2104.m4004(field2.getName(), '-').toLowerCase(Locale.ENGLISH);
                                    break;
                                default:
                                    name = AbstractC2104.m4004(field2.getName(), '.').toLowerCase(Locale.ENGLISH);
                                    break;
                            }
                            listAsList = Collections.EMPTY_LIST;
                        } else {
                            String strValue = interfaceC0770.value();
                            listAsList = Arrays.asList(interfaceC0770.alternate());
                            name = strValue;
                        }
                        if (listAsList.isEmpty()) {
                            z2 = true;
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(name);
                            arrayList.addAll(listAsList);
                            SingletonList = arrayList;
                        } else {
                            z2 = true;
                            SingletonList = Collections.singletonList(name);
                        }
                        String str = (String) SingletonList.get(r14);
                        C2805 c28053 = new C2805(typeM3708);
                        Class cls3 = c28053.f13682;
                        ?? r22 = (cls3 == null && cls3.isPrimitive()) ? z2 : r14;
                        int modifiers = field2.getModifiers();
                        ?? r23 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z2;
                        interfaceC0048 = (InterfaceC0048) field2.getAnnotation(InterfaceC0048.class);
                        if (interfaceC0048 == null) {
                            field = field2;
                            z3 = z2;
                            r27 = SingletonList;
                            c01142 = c0114;
                            abstractC2720M521 = this.f3668.m4641(this.f3667, c01142, c28053, interfaceC0048, false);
                        } else {
                            c01142 = c0114;
                            z3 = z2;
                            field = field2;
                            r27 = SingletonList;
                            abstractC2720M521 = null;
                        }
                        ?? r2 = abstractC2720M521 == null ? z3 : r14;
                        if (abstractC2720M521 == null) {
                            abstractC2720M521 = c01142.m521(c28053);
                        }
                        C1782 c17822 = new C1782(str, field, method, zM1845 ? abstractC2720M521 : r2 != 0 ? abstractC2720M521 : new C1627(c01142, abstractC2720M521, c28053.f13683, 2), abstractC2720M521, r22, r23);
                        Field field3 = field;
                        if (r262 != 0) {
                            for (String str2 : r27) {
                                C1782 c17823 = (C1782) linkedHashMap.put(str2, c17822);
                                if (c17823 != null) {
                                    m1843(cls, str2, c17823.f8975, field3);
                                    throw null;
                                }
                            }
                        }
                        if (zM1845 && (c1782 = (C1782) linkedHashMap2.put(str, c17822)) != null) {
                            m1843(cls, str, c1782.f8975, field3);
                            throw null;
                        }
                    }
                    method = null;
                    r262 = r26;
                    if (method == null) {
                    }
                    Type typeM37082 = AbstractC1917.m3708(type, cls2, field2.getGenericType(), new HashMap());
                    interfaceC0770 = (InterfaceC0770) field2.getAnnotation(InterfaceC0770.class);
                    if (interfaceC0770 != null) {
                    }
                    if (listAsList.isEmpty()) {
                    }
                    String str3 = (String) SingletonList.get(r14);
                    C2805 c280532 = new C2805(typeM37082);
                    Class cls32 = c280532.f13682;
                    if (cls32 == null) {
                        int modifiers2 = field2.getModifiers();
                        if (Modifier.isStatic(modifiers2)) {
                            interfaceC0048 = (InterfaceC0048) field2.getAnnotation(InterfaceC0048.class);
                            if (interfaceC0048 == null) {
                            }
                            if (abstractC2720M521 == null) {
                            }
                            if (abstractC2720M521 == null) {
                            }
                            if (zM1845) {
                            }
                            C1782 c178222 = new C1782(str3, field, method, zM1845 ? abstractC2720M521 : r2 != 0 ? abstractC2720M521 : new C1627(c01142, abstractC2720M521, c280532.f13683, 2), abstractC2720M521, r22, r23);
                            Field field32 = field;
                            if (r262 != 0) {
                            }
                            if (zM1845) {
                                continue;
                            }
                        }
                    }
                }
                i++;
                r14 = 0;
            }
            C2805 c28054 = new C2805(AbstractC1917.m3708(type, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = c28054.f13682;
            c28052 = c28054;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m1845(Field field, boolean z) {
        boolean z2;
        C2175 c2175 = this.f3665;
        c2175.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c2175.m4145(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? c2175.f10660 : c2175.f10661;
            z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    C0188.m794();
                    return false;
                }
            }
        }
        return !z2;
    }
}
