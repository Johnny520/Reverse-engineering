package p230r2;

import com.bumptech.glide.AbstractC1923e;
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
import p011B4.AbstractC0231b;
import p154e2.C2029h;
import p213o2.AbstractC2770B;
import p213o2.C2781j;
import p213o2.C2785n;
import p213o2.C2789r;
import p213o2.EnumC2779h;
import p213o2.InterfaceC2771C;
import p219p2.InterfaceC2890a;
import p219p2.InterfaceC2891b;
import p224q2.AbstractC2917h;
import p224q2.C2913d;
import p241t2.AbstractC3211c;
import p252v2.C3352a;

/* JADX INFO: renamed from: r2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3147w implements InterfaceC2771C {

    /* JADX INFO: renamed from: d */
    public final C2029h f9905d;

    /* JADX INFO: renamed from: e */
    public final EnumC2779h f9906e;

    /* JADX INFO: renamed from: f */
    public final C2913d f9907f;

    /* JADX INFO: renamed from: g */
    public final C3136l f9908g;

    /* JADX INFO: renamed from: h */
    public final List f9909h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3147w(C2029h c2029h, EnumC2779h enumC2779h, C2913d c2913d, C3136l c3136l, List list) {
        this.f9905d = c2029h;
        this.f9906e = enumC2779h;
        this.f9907f = c2913d;
        this.f9908g = c3136l;
        this.f9909h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5419b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC3211c.m5489c(field) + " and " + AbstractC3211c.m5489c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.InterfaceC2771C
    /* JADX INFO: renamed from: a */
    public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
        Class cls = c3352a.f10417a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC1923e abstractC1923e = AbstractC3211c.f9992a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C2781j(2);
        }
        AbstractC2917h.m5114f(this.f9909h);
        return AbstractC3211c.f9992a.mo3488I(cls) ? new C3146v(cls, m5420c(c2785n, c3352a, cls, true)) : new C3144t(this.f9905d.m3725c(c3352a, true), m5420c(c2785n, c3352a, cls, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
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
    /* JADX WARN: Type inference failed for: r29v0, types: [r2.w] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3145u m5420c(C2785n c2785n, C3352a c3352a, Class cls, boolean z5) {
        ?? r26;
        ?? r262;
        Method method;
        InterfaceC2891b interfaceC2891b;
        List listAsList;
        String strMo4968b;
        boolean z6;
        ?? SingletonList;
        InterfaceC2890a interfaceC2890a;
        C2785n c2785n2;
        boolean z7;
        Field field;
        ?? r27;
        AbstractC2770B abstractC2770BM4973b;
        C3142r c3142r;
        if (cls.isInterface()) {
            return C3145u.f9898c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C3352a c3352a2 = c3352a;
        Class cls2 = cls;
        while (true) {
            Type type = c3352a2.f10418b;
            if (cls2 == Object.class) {
                return new C3145u(linkedHashMap, new ArrayList(linkedHashMap2.values()));
            }
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                AbstractC2917h.m5114f(this.f9909h);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i5 = 0;
            while (i5 < length) {
                Field field2 = declaredFields[i5];
                boolean zM5421d = m5421d(field2, true);
                boolean zM5421d2 = m5421d(field2, r14);
                if (zM5421d || zM5421d2) {
                    if (!z5) {
                        r26 = zM5421d2;
                    } else if (Modifier.isStatic(field2.getModifiers())) {
                        r26 = r14;
                    } else {
                        Method methodMo3489x = AbstractC3211c.f9992a.mo3489x(cls2, field2);
                        AbstractC3211c.m5492f(methodMo3489x);
                        if (methodMo3489x.getAnnotation(InterfaceC2891b.class) != null && field2.getAnnotation(InterfaceC2891b.class) == null) {
                            throw new C2789r(AbstractC0231b.m400k("@SerializedName on ", AbstractC3211c.m5490d(methodMo3489x, r14), " is not supported"));
                        }
                        r262 = zM5421d2;
                        method = methodMo3489x;
                        if (method == null) {
                            AbstractC3211c.m5492f(field2);
                        }
                        Type typeM5118j = AbstractC2917h.m5118j(type, cls2, field2.getGenericType(), new HashMap());
                        interfaceC2891b = (InterfaceC2891b) field2.getAnnotation(InterfaceC2891b.class);
                        if (interfaceC2891b != null) {
                            strMo4968b = this.f9906e.mo4968b(field2);
                            listAsList = Collections.EMPTY_LIST;
                        } else {
                            String strValue = interfaceC2891b.value();
                            listAsList = Arrays.asList(interfaceC2891b.alternate());
                            strMo4968b = strValue;
                        }
                        if (listAsList.isEmpty()) {
                            z6 = true;
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(strMo4968b);
                            arrayList.addAll(listAsList);
                            SingletonList = arrayList;
                        } else {
                            z6 = true;
                            SingletonList = Collections.singletonList(strMo4968b);
                        }
                        String str = (String) SingletonList.get(r14);
                        C3352a c3352a3 = new C3352a(typeM5118j);
                        Class cls3 = c3352a3.f10417a;
                        ?? r22 = (cls3 == null && cls3.isPrimitive()) ? z6 : r14;
                        int modifiers = field2.getModifiers();
                        ?? r23 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z6;
                        interfaceC2890a = (InterfaceC2890a) field2.getAnnotation(InterfaceC2890a.class);
                        if (interfaceC2890a == null) {
                            field = field2;
                            z7 = z6;
                            r27 = SingletonList;
                            c2785n2 = c2785n;
                            abstractC2770BM4973b = this.f9908g.m5411b(this.f9905d, c2785n2, c3352a3, interfaceC2890a, false);
                        } else {
                            c2785n2 = c2785n;
                            z7 = z6;
                            field = field2;
                            r27 = SingletonList;
                            abstractC2770BM4973b = null;
                        }
                        ?? r24 = abstractC2770BM4973b == null ? z7 : r14;
                        if (abstractC2770BM4973b == null) {
                            abstractC2770BM4973b = c2785n2.m4973b(c3352a3);
                        }
                        C3142r c3142r2 = new C3142r(str, field, method, zM5421d ? abstractC2770BM4973b : r24 != 0 ? abstractC2770BM4973b : new C3138n(c2785n2, abstractC2770BM4973b, c3352a3.f10418b), abstractC2770BM4973b, r22, r23);
                        Field field3 = field;
                        if (r262 != 0) {
                            for (String str2 : r27) {
                                C3142r c3142r3 = (C3142r) linkedHashMap.put(str2, c3142r2);
                                if (c3142r3 != null) {
                                    m5419b(cls, str2, c3142r3.f9889b, field3);
                                    throw null;
                                }
                            }
                        }
                        if (zM5421d && (c3142r = (C3142r) linkedHashMap2.put(str, c3142r2)) != null) {
                            m5419b(cls, str, c3142r.f9889b, field3);
                            throw null;
                        }
                    }
                    method = null;
                    r262 = r26;
                    if (method == null) {
                    }
                    Type typeM5118j2 = AbstractC2917h.m5118j(type, cls2, field2.getGenericType(), new HashMap());
                    interfaceC2891b = (InterfaceC2891b) field2.getAnnotation(InterfaceC2891b.class);
                    if (interfaceC2891b != null) {
                    }
                    if (listAsList.isEmpty()) {
                    }
                    String str3 = (String) SingletonList.get(r14);
                    C3352a c3352a32 = new C3352a(typeM5118j2);
                    Class cls32 = c3352a32.f10417a;
                    if (cls32 == null) {
                        int modifiers2 = field2.getModifiers();
                        if (Modifier.isStatic(modifiers2)) {
                            interfaceC2890a = (InterfaceC2890a) field2.getAnnotation(InterfaceC2890a.class);
                            if (interfaceC2890a == null) {
                            }
                            if (abstractC2770BM4973b == null) {
                            }
                            if (abstractC2770BM4973b == null) {
                            }
                            if (zM5421d) {
                            }
                            C3142r c3142r22 = new C3142r(str3, field, method, zM5421d ? abstractC2770BM4973b : r24 != 0 ? abstractC2770BM4973b : new C3138n(c2785n2, abstractC2770BM4973b, c3352a32.f10418b), abstractC2770BM4973b, r22, r23);
                            Field field32 = field;
                            if (r262 != 0) {
                            }
                            if (zM5421d) {
                                continue;
                            }
                        }
                    }
                }
                i5++;
                r14 = 0;
            }
            C3352a c3352a4 = new C3352a(AbstractC2917h.m5118j(type, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = c3352a4.f10417a;
            c3352a2 = c3352a4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m5421d(Field field, boolean z5) {
        boolean z6;
        C2913d c2913d = this.f9907f;
        c2913d.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c2913d.m5108e(field.getType(), z5)) {
            z6 = true;
        } else {
            List list = z5 ? c2913d.f9208d : c2913d.f9209e;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            z6 = false;
        }
        return !z6;
    }
}
