package p042W;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p022L.AbstractC0174d;
import p024M.C0191e;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.C0265p;
import p037T.EnumC0257h;
import p037T.InterfaceC0275z;
import p039U.InterfaceC0289a;
import p039U.InterfaceC0290b;
import p041V.AbstractC0311d;
import p041V.C0315h;
import p045Y.AbstractC0357c;
import p049a0.C0367a;

/* JADX INFO: renamed from: W.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0346r implements InterfaceC0275z {

    /* JADX INFO: renamed from: a */
    public final C0191e f783a;

    /* JADX INFO: renamed from: b */
    public final EnumC0257h f784b;

    /* JADX INFO: renamed from: c */
    public final C0315h f785c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f786d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0346r(C0191e c0191e, EnumC0257h enumC0257h, C0315h c0315h, C0331c c0331c, ArrayList arrayList) {
        this.f783a = c0191e;
        this.f784b = enumC0257h;
        this.f785c = c0315h;
        this.f786d = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        Class cls = c0367a.f860a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC0311d.m543e(this.f786d);
        return AbstractC0357c.f834a.mo199C(cls) ? new C0345q(cls, m605b(c0261l, c0367a, cls, true)) : new C0344p(this.f783a.m401b(c0367a), m605b(c0261l, c0367a, cls, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d1, code lost:
    
        r14 = new p049a0.C0367a(p041V.AbstractC0311d.m547i(r6, r15, r15.getGenericSuperclass(), new java.util.HashMap()));
        r15 = r14.f860a;
        r0 = r26;
        r9 = r27;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap m605b(C0261l c0261l, C0367a c0367a, Class cls, boolean z2) {
        boolean z3;
        Method methodMo207q;
        Field[] fieldArr;
        InterfaceC0290b interfaceC0290b;
        List list;
        List listSingletonList;
        int size;
        int i2;
        int i3;
        int i4;
        C0342n c0342n;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        C0342n c0342n2;
        boolean z7;
        C0346r c0346r = this;
        C0261l c0261l2 = c0261l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls.isInterface()) {
            C0367a c0367a2 = c0367a;
            Class cls2 = cls;
            while (cls2 != Object.class) {
                Field[] declaredFields = cls2.getDeclaredFields();
                if (cls2 != cls && declaredFields.length > 0) {
                    AbstractC0311d.m543e(c0346r.f786d);
                }
                int length = declaredFields.length;
                boolean z8 = false;
                int i6 = 0;
                while (true) {
                    Type type = c0367a2.f861b;
                    if (i6 < length) {
                        int i7 = length;
                        Field field = declaredFields[i6];
                        boolean zM606c = c0346r.m606c(field, true);
                        boolean zM606c2 = c0346r.m606c(field, z8);
                        if (!zM606c && !zM606c2) {
                            fieldArr = declaredFields;
                            z4 = z8;
                            i3 = i6;
                            i4 = i7;
                        } else if (!z2) {
                            z3 = true;
                            methodMo207q = null;
                            if (methodMo207q == null) {
                                AbstractC0357c.m616e(field);
                            }
                            fieldArr = declaredFields;
                            Type typeM547i = AbstractC0311d.m547i(type, cls2, field.getGenericType(), new HashMap());
                            interfaceC0290b = (InterfaceC0290b) field.getAnnotation(InterfaceC0290b.class);
                            if (interfaceC0290b == null) {
                                listSingletonList = Collections.singletonList(c0346r.f784b.mo471b(field));
                            } else {
                                String strValue = interfaceC0290b.value();
                                String[] strArrAlternate = interfaceC0290b.alternate();
                                if (strArrAlternate.length == 0) {
                                    listSingletonList = Collections.singletonList(strValue);
                                } else {
                                    ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
                                    arrayList.add(strValue);
                                    Collections.addAll(arrayList, strArrAlternate);
                                    list = arrayList;
                                    size = list.size();
                                    C0342n c0342n3 = null;
                                    i2 = 0;
                                    while (i2 < size) {
                                        String str = (String) list.get(i2);
                                        if (i2 != 0) {
                                            zM606c = false;
                                        }
                                        List list2 = list;
                                        C0367a c0367a3 = new C0367a(typeM547i);
                                        Type type2 = typeM547i;
                                        Class cls3 = c0367a3.f860a;
                                        if (cls3 == null || !cls3.isPrimitive()) {
                                            i5 = i6;
                                            z5 = zM606c2;
                                            z6 = false;
                                        } else {
                                            i5 = i6;
                                            z5 = zM606c2;
                                            z6 = z3;
                                        }
                                        int modifiers = field.getModifiers();
                                        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                                            c0342n2 = c0342n3;
                                            z7 = z3;
                                        } else {
                                            c0342n2 = c0342n3;
                                            z7 = false;
                                        }
                                        int i8 = i5;
                                        InterfaceC0289a interfaceC0289a = (InterfaceC0289a) field.getAnnotation(InterfaceC0289a.class);
                                        Field field2 = field;
                                        AbstractC0274y abstractC0274yM561b = interfaceC0289a != null ? C0331c.m561b(c0346r.f783a, c0261l2, c0367a3, interfaceC0289a) : null;
                                        int i9 = i7;
                                        boolean z9 = abstractC0274yM561b != null ? z3 : false;
                                        if (abstractC0274yM561b == null) {
                                            abstractC0274yM561b = c0261l2.m481d(c0367a3);
                                        }
                                        Method method = methodMo207q;
                                        int i10 = i2;
                                        C0342n c0342n4 = c0342n2;
                                        field = field2;
                                        int i11 = size;
                                        boolean z10 = zM606c;
                                        boolean z11 = z3;
                                        c0342n3 = (C0342n) linkedHashMap.put(str, new C0342n(str, field, z10, z5, method, z9, abstractC0274yM561b, c0261l2, c0367a3, z6, z7));
                                        if (c0342n4 != null) {
                                            c0342n3 = c0342n4;
                                        }
                                        c0261l2 = c0261l;
                                        zM606c = z10;
                                        zM606c2 = z5;
                                        methodMo207q = method;
                                        i7 = i9;
                                        z3 = z11;
                                        typeM547i = type2;
                                        list = list2;
                                        i6 = i8;
                                        size = i11;
                                        i2 = i10 + 1;
                                        c0346r = this;
                                    }
                                    i3 = i6;
                                    i4 = i7;
                                    c0342n = c0342n3;
                                    z4 = false;
                                    if (c0342n == null) {
                                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + c0342n.f765a + "'; conflict is caused by fields " + AbstractC0357c.m614c(c0342n.f766b) + " and " + AbstractC0357c.m614c(field));
                                    }
                                }
                            }
                            list = listSingletonList;
                            size = list.size();
                            C0342n c0342n32 = null;
                            i2 = 0;
                            while (i2 < size) {
                            }
                            i3 = i6;
                            i4 = i7;
                            c0342n = c0342n32;
                            z4 = false;
                            if (c0342n == null) {
                            }
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            zM606c2 = z8;
                            z3 = true;
                            methodMo207q = null;
                            if (methodMo207q == null) {
                            }
                            fieldArr = declaredFields;
                            Type typeM547i2 = AbstractC0311d.m547i(type, cls2, field.getGenericType(), new HashMap());
                            interfaceC0290b = (InterfaceC0290b) field.getAnnotation(InterfaceC0290b.class);
                            if (interfaceC0290b == null) {
                            }
                            list = listSingletonList;
                            size = list.size();
                            C0342n c0342n322 = null;
                            i2 = 0;
                            while (i2 < size) {
                            }
                            i3 = i6;
                            i4 = i7;
                            c0342n = c0342n322;
                            z4 = false;
                            if (c0342n == null) {
                            }
                        } else {
                            z3 = true;
                            methodMo207q = AbstractC0357c.f834a.mo207q(cls2, field);
                            AbstractC0357c.m616e(methodMo207q);
                            if (methodMo207q.getAnnotation(InterfaceC0290b.class) != null && field.getAnnotation(InterfaceC0290b.class) == null) {
                                throw new C0265p(AbstractC0174d.m353i("@SerializedName on ", AbstractC0357c.m615d(methodMo207q, z8), " is not supported"));
                            }
                            if (methodMo207q == null) {
                            }
                            fieldArr = declaredFields;
                            Type typeM547i22 = AbstractC0311d.m547i(type, cls2, field.getGenericType(), new HashMap());
                            interfaceC0290b = (InterfaceC0290b) field.getAnnotation(InterfaceC0290b.class);
                            if (interfaceC0290b == null) {
                            }
                            list = listSingletonList;
                            size = list.size();
                            C0342n c0342n3222 = null;
                            i2 = 0;
                            while (i2 < size) {
                            }
                            i3 = i6;
                            i4 = i7;
                            c0342n = c0342n3222;
                            z4 = false;
                            if (c0342n == null) {
                            }
                        }
                        i6 = i3 + 1;
                        c0346r = this;
                        c0261l2 = c0261l;
                        length = i4;
                        declaredFields = fieldArr;
                        z8 = z4;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m606c(Field field, boolean z2) {
        Class<?> type = field.getType();
        C0315h c0315h = this.f785c;
        c0315h.getClass();
        if (C0315h.m550c(type)) {
            return false;
        }
        c0315h.m551b(z2);
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || C0315h.m550c(field.getType())) {
            return false;
        }
        List list = z2 ? c0315h.f696a : c0315h.f697b;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
