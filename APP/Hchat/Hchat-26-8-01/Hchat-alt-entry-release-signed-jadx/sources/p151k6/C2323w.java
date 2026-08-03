package p151k6;

import af.C0081d;
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
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p100h0.C1545q0;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p123i6.InterfaceC1989a;
import p123i6.InterfaceC1990b;
import p134j6.AbstractC2070h;
import p134j6.C2066d;
import p165l6.AbstractC2512c;
import p194n6.C2901a;

/* JADX INFO: renamed from: k6.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2323w implements InterfaceC1623o {

    /* JADX INFO: renamed from: g */
    public final C1545q0 f7649g;

    /* JADX INFO: renamed from: h */
    public final int f7650h;

    /* JADX INFO: renamed from: i */
    public final C2066d f7651i;

    /* JADX INFO: renamed from: j */
    public final C2301l f7652j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f7653k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2323w(C1545q0 c1545q0, int i9, C2066d c2066d, C2301l c2301l, ArrayList arrayList) {
        this.f7649g = c1545q0;
        this.f7650h = i9;
        this.f7651i = c2066d;
        this.f7652j = c2301l;
        this.f7653k = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5531b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC2512c.m5901c(field) + " and " + AbstractC2512c.m5901c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        Class cls = c2901a.f9368a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC1089i abstractC1089i = AbstractC2512c.f8137a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C2307o(1);
        }
        AbstractC2070h.m5126d(this.f7653k);
        if (AbstractC2512c.f8137a.mo2810X(cls)) {
            return new C2321v(cls, m5532c(c1614f, c2901a, cls, true));
        }
        this.f7649g.m4042c(c2901a, true);
        return new C2317t(m5532c(c1614f, c2901a, cls, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x01f2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [k6.w] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2319u m5532c(C1614f c1614f, C2901a c2901a, Class cls, boolean z9) {
        ?? r18;
        ?? r182;
        Method methodMo2814x;
        InterfaceC1990b interfaceC1990b;
        List listAsList;
        String name;
        boolean z10;
        ?? SingletonList;
        ?? r2;
        C2901a c2901a2;
        Class cls2;
        int modifiers;
        InterfaceC1989a interfaceC1989a;
        C1614f c1614f2;
        boolean z11;
        Field field;
        ?? r21;
        Field[] fieldArr;
        int i9;
        Method method;
        String str;
        AbstractC1622n c2327y;
        C2313r c2313r;
        C2323w c2323w = this;
        if (cls.isInterface()) {
            return C2319u.f7640b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C2901a c2901a3 = c2901a;
        Class cls3 = cls;
        while (true) {
            Type type = c2901a3.f9369b;
            if (cls3 == Object.class) {
                return new C2319u(new ArrayList(linkedHashMap2.values()));
            }
            Field[] declaredFields = cls3.getDeclaredFields();
            if (cls3 != cls && declaredFields.length > 0) {
                AbstractC2070h.m5126d(c2323w.f7653k);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i10 = 0;
            ?? r02 = c2323w;
            while (i10 < length) {
                Field field2 = declaredFields[i10];
                boolean zM5533d = r02.m5533d(field2, true);
                boolean zM5533d2 = r02.m5533d(field2, r14);
                if (zM5533d || zM5533d2) {
                    if (!z9) {
                        r18 = zM5533d2;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        r18 = r14;
                    } else {
                        methodMo2814x = AbstractC2512c.f8137a.mo2814x(cls3, field2);
                        AbstractC2512c.m5904f(methodMo2814x);
                        if (methodMo2814x.getAnnotation(InterfaceC1990b.class) != null && field2.getAnnotation(InterfaceC1990b.class) == null) {
                            throw new C0081d(AbstractC0921a.m2251n("@SerializedName on ", AbstractC2512c.m5902d(methodMo2814x, r14), " is not supported"));
                        }
                        r182 = zM5533d2;
                        if (methodMo2814x == null) {
                            AbstractC2512c.m5904f(field2);
                        }
                        Type typeM5130h = AbstractC2070h.m5130h(type, cls3, field2.getGenericType(), new HashMap());
                        interfaceC1990b = (InterfaceC1990b) field2.getAnnotation(InterfaceC1990b.class);
                        if (interfaceC1990b != null) {
                            switch (r02.f7650h) {
                                case 1:
                                    name = field2.getName();
                                    break;
                                case 2:
                                    name = AbstractC0921a.m2239b(field2.getName());
                                    break;
                                case 3:
                                    name = AbstractC0921a.m2239b(AbstractC0921a.m2238a(field2.getName(), ' '));
                                    break;
                                case 4:
                                    name = AbstractC0921a.m2238a(field2.getName(), '_').toUpperCase(Locale.ENGLISH);
                                    break;
                                case 5:
                                    name = AbstractC0921a.m2238a(field2.getName(), '_').toLowerCase(Locale.ENGLISH);
                                    break;
                                case 6:
                                    name = AbstractC0921a.m2238a(field2.getName(), '-').toLowerCase(Locale.ENGLISH);
                                    break;
                                default:
                                    name = AbstractC0921a.m2238a(field2.getName(), '.').toLowerCase(Locale.ENGLISH);
                                    break;
                            }
                            listAsList = Collections.EMPTY_LIST;
                        } else {
                            String strValue = interfaceC1990b.value();
                            listAsList = Arrays.asList(interfaceC1990b.alternate());
                            name = strValue;
                        }
                        if (listAsList.isEmpty()) {
                            z10 = true;
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(name);
                            arrayList.addAll(listAsList);
                            SingletonList = arrayList;
                            r2 = 0;
                        } else {
                            z10 = true;
                            r2 = r14;
                            SingletonList = Collections.singletonList(name);
                        }
                        String str2 = (String) SingletonList.get(r2);
                        c2901a2 = new C2901a(typeM5130h);
                        cls2 = c2901a2.f9368a;
                        if (cls2 != null) {
                            cls2.isPrimitive();
                        }
                        modifiers = field2.getModifiers();
                        if (Modifier.isStatic(modifiers)) {
                            Modifier.isFinal(modifiers);
                        }
                        interfaceC1989a = (InterfaceC1989a) field2.getAnnotation(InterfaceC1989a.class);
                        if (interfaceC1989a == null) {
                            ?? r20 = r2;
                            C1545q0 c1545q0 = r02.f7649g;
                            C2301l c2301l = r02.f7652j;
                            field = field2;
                            r21 = r20 == true ? 1 : 0;
                            i9 = length;
                            str = str2;
                            z11 = z10;
                            fieldArr = declaredFields;
                            method = methodMo2814x;
                            c1614f2 = c1614f;
                            c2327y = c2301l.m5529b(c1545q0, c1614f2, c2901a2, interfaceC1989a, false);
                        } else {
                            c1614f2 = c1614f;
                            z11 = z10;
                            field = field2;
                            r21 = r2;
                            fieldArr = declaredFields;
                            i9 = length;
                            method = methodMo2814x;
                            str = str2;
                            c2327y = null;
                        }
                        boolean z12 = c2327y == null ? z11 : r21 == true ? 1 : 0;
                        if (c2327y == null) {
                            c2327y = c1614f2.m4130b(c2901a2);
                        }
                        if (zM5533d && !z12) {
                            c2327y = new C2327y(c1614f2, c2327y, c2901a2.f9369b);
                        }
                        C2313r c2313r2 = new C2313r(str, field, method, c2327y);
                        if (r182 != 0) {
                            for (String str3 : SingletonList) {
                                C2313r c2313r3 = (C2313r) linkedHashMap.put(str3, c2313r2);
                                if (c2313r3 != null) {
                                    m5531b(cls, str3, c2313r3.f7633b, field);
                                    throw null;
                                }
                            }
                        }
                        if (zM5533d && (c2313r = (C2313r) linkedHashMap2.put(str, c2313r2)) != null) {
                            m5531b(cls, str, c2313r.f7633b, field);
                            throw null;
                        }
                    }
                    methodMo2814x = null;
                    r182 = r18;
                    if (methodMo2814x == null) {
                    }
                    Type typeM5130h2 = AbstractC2070h.m5130h(type, cls3, field2.getGenericType(), new HashMap());
                    interfaceC1990b = (InterfaceC1990b) field2.getAnnotation(InterfaceC1990b.class);
                    if (interfaceC1990b != null) {
                    }
                    if (listAsList.isEmpty()) {
                    }
                    String str22 = (String) SingletonList.get(r2);
                    c2901a2 = new C2901a(typeM5130h2);
                    cls2 = c2901a2.f9368a;
                    if (cls2 != null) {
                    }
                    modifiers = field2.getModifiers();
                    if (Modifier.isStatic(modifiers)) {
                    }
                    interfaceC1989a = (InterfaceC1989a) field2.getAnnotation(InterfaceC1989a.class);
                    if (interfaceC1989a == null) {
                    }
                    if (c2327y == null) {
                    }
                    if (c2327y == null) {
                    }
                    if (zM5533d) {
                        c2327y = new C2327y(c1614f2, c2327y, c2901a2.f9369b);
                    }
                    C2313r c2313r22 = new C2313r(str, field, method, c2327y);
                    if (r182 != 0) {
                    }
                    if (zM5533d) {
                        continue;
                    }
                } else {
                    fieldArr = declaredFields;
                    i9 = length;
                    r21 = r14;
                }
                i10++;
                r02 = this;
                declaredFields = fieldArr;
                length = i9;
                r14 = r21;
            }
            c2901a3 = new C2901a(AbstractC2070h.m5130h(type, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = c2901a3.f9368a;
            c2323w = this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m5533d(Field field, boolean z9) {
        boolean z10;
        C2066d c2066d = this.f7651i;
        c2066d.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c2066d.m5122c(field.getType(), z9)) {
            z10 = true;
        } else {
            List list = z9 ? c2066d.f6945h : c2066d.f6946i;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    C0086a.m445d();
                    return false;
                }
            }
            z10 = false;
        }
        return !z10;
    }
}
