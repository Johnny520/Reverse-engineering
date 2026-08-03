package p343x6;

import gg.AbstractC1416l;
import gg.AbstractC1426v;
import gg.C1410f;
import gg.InterfaceC1409e;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import mg.InterfaceC2840b;
import ng.AbstractC3015m;
import ng.C3011i;
import ng.C3022t;
import ng.InterfaceC3012j;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p240q6.C3441a;
import p240q6.C3442b;
import p240q6.C3443c;
import p256r6.AbstractC3707a;
import p256r6.AbstractC3710d;
import p256r6.C3709c;
import p256r6.EnumC3708b;
import p272s6.AbstractC3931b;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.InterfaceC3955b;
import p284t6.AbstractC4132a;
import p304uf.C4329c;
import p332wb.C4819dj;
import p332wb.C5094m0;
import p332wb.C5319sr;
import p362y6.AbstractC5998b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: x6.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5703g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: a */
    public static final List m10300a(C3441a c3441a, C3709c c3709c) {
        ?? c3959f;
        C3022t c3022tM6413W;
        c3709c.getClass();
        try {
            Constructor<?>[] declaredConstructors = c3709c.f12064a.getDeclaredConstructors();
            c3959f = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor != null) {
                    c3959f.add(constructor);
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            AbstractC5998b.f24364a.ordinal();
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r12 = c3959f;
        if (z9) {
            r12 = 0;
        }
        Object obj = (List) r12;
        if (obj == null) {
            obj = C4173t.f13710g;
        }
        C3022t c3022tM6413W2 = AbstractC3015m.m6413W(m10306g(m10301b(new C0795n(obj, 6), c3441a, c3709c), c3441a, c3709c), new C5319sr(17));
        C1410f c1410fM3834a = AbstractC1426v.m3834a(Constructor.class);
        if (c1410fM3834a.equals(AbstractC1426v.m3834a(Method.class))) {
            c3022tM6413W = AbstractC3015m.m6413W(c3022tM6413W2, new C5701e(c3709c, 0));
        } else if (c1410fM3834a.equals(AbstractC1426v.m3834a(Constructor.class))) {
            c3022tM6413W = AbstractC3015m.m6413W(c3022tM6413W2, new C5701e(c3709c, 1));
        } else {
            if (!c1410fM3834a.equals(AbstractC1426v.m3834a(Field.class))) {
                C3193a.m6826p(c3022tM6413W2, "Unsupported member type: ");
                return null;
            }
            c3022tM6413W = AbstractC3015m.m6413W(c3022tM6413W2, new C5701e(c3709c, 2));
        }
        return AbstractC3015m.m6418b0(c3022tM6413W);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3011i m10301b(C0795n c0795n, AbstractC3710d abstractC3710d, C3709c c3709c) {
        return m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(AbstractC3015m.m6413W(c0795n, new C5319sr(18)), c3709c, "name", abstractC3710d.f12067b, new C5699c(0)), c3709c, "nameCondition", null, new C5699c(1)), c3709c, "modifiers", abstractC3710d.f12068c, new C5699c(2)), c3709c, "modifiersNot", abstractC3710d.f12069d, new C5699c(3)), c3709c, "modifiersCondition", null, new C5699c(4)), c3709c, "isSynthetic", null, new C5699c(6)), c3709c, "isSyntheticNot", null, new C5699c(7)), c3709c, "annotations", abstractC3710d.f12070e, new C5697a(c3709c, 16)), c3709c, "annotationsNot", abstractC3710d.f12071f, new C5697a(c3709c, 17)), c3709c, "genericString", null, new C5699c(8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final int m10302c(String str) {
        long j3 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            j3 += ((long) str.charAt(i9)) > 127 ? 2L : 1L;
        }
        return (int) j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final String m10303d(int i9, String str) {
        int iM10302c = i9 - m10302c(str);
        return iM10302c > 0 ? AbstractC0255e.m1020i(str, AbstractC3156t.m6736Z(iM10302c, " ")) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static List m10304e(AnnotatedElement[] annotatedElementArr) {
        int length = 0;
        for (AnnotatedElement annotatedElement : annotatedElementArr) {
            length += annotatedElement.getAnnotations().length;
        }
        if (length == 0) {
            return C4173t.f13710g;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        for (AnnotatedElement annotatedElement2 : annotatedElementArr) {
            for (Annotation annotation : annotatedElement2.getAnnotations()) {
                Class clsMo3818a = AbstractC0000a.m31Q(annotation).mo3818a();
                clsMo3818a.getClass();
                c4329cM7E.add(clsMo3818a);
            }
        }
        return AbstractC0000a.m90t(c4329cM7E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m10305f(Collection collection, List list, C3709c c3709c) {
        Class cls;
        if (collection.size() == list.size()) {
            int i9 = 0;
            for (Object obj : collection) {
                int i10 = i9 + 1;
                Class cls2 = (Class) list.get(i9);
                Class clsM10310k = m10310k(obj, c3709c, null);
                cls = AbstractC3931b.class;
                Class<AbstractC3931b> clsM51a0 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls));
                if (clsM10310k.equals(clsM51a0 != null ? clsM51a0 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls2, clsM10310k)) {
                    i9 = i10;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C3011i m10306g(C3011i c3011i, AbstractC3707a abstractC3707a, C3709c c3709c) {
        return m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(m10307h(AbstractC3015m.m6413W(c3011i, C5702f.f23172h), c3709c, "parameters", abstractC3707a.f12040g, new C5697a(c3709c, 1)), c3709c, "parametersNot", abstractC3707a.f12041h, new C5697a(c3709c, 8)), c3709c, "parametersCondition", null, new C5094m0(23)), c3709c, "parameterCount", null, new C5094m0(24)), c3709c, "parameterCountCondition", null, new C5094m0(25)), c3709c, "typeParameters", abstractC3707a.f12042i, new C5094m0(26)), c3709c, "typeParametersNot", abstractC3707a.f12043j, new C5094m0(27)), c3709c, "exceptionTypes", abstractC3707a.f12044k, new C5697a(c3709c, 14)), c3709c, "exceptionTypesNot", abstractC3707a.f12045l, new C5697a(c3709c, 15)), c3709c, "genericExceptionTypes", abstractC3707a.f12046m, new C5094m0(29)), c3709c, "genericExceptionTypesNot", abstractC3707a.f12047n, new C5094m0(17)), c3709c, "genericParameters", abstractC3707a.f12048o, new C5094m0(18)), c3709c, "genericParametersNot", abstractC3707a.f12049p, new C5094m0(19)), c3709c, "isVarArgs", null, new C5094m0(20)), c3709c, "isVarArgsNot", null, new C5094m0(21)), c3709c, "parameterAnnotations", abstractC3707a.f12050q, new C5697a(c3709c, 3)), c3709c, "parameterAnnotationsNot", abstractC3707a.f12051r, new C5697a(c3709c, 4)), c3709c, "annotatedReturnType", abstractC3707a.f12052s, new C5697a(c3709c, 5)), c3709c, "annotatedReturnTypeNot", abstractC3707a.f12053t, new C5697a(c3709c, 6)), c3709c, "annotatedReceiverType", abstractC3707a.f12054u, new C5697a(c3709c, 7)), c3709c, "annotatedReceiverTypeNot", abstractC3707a.f12055v, new C5697a(c3709c, 9)), c3709c, "annotatedParameterTypes", abstractC3707a.f12056w, new C5697a(c3709c, 10)), c3709c, "annotatedParameterTypesNot", abstractC3707a.f12057x, new C5697a(c3709c, 11)), c3709c, "annotatedExceptionTypes", abstractC3707a.f12058y, new C5697a(c3709c, 12)), c3709c, "annotatedExceptionTypesNot", abstractC3707a.f12059z, new C5697a(c3709c, 13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C3011i m10307h(InterfaceC3012j interfaceC3012j, C3709c c3709c, String str, Object obj, InterfaceC1235p interfaceC1235p) {
        return new C3011i(interfaceC3012j, true, new C4819dj(obj, interfaceC1235p, c3709c, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m10308i(AbstractC3710d abstractC3710d, C3709c c3709c, Class cls, InterfaceC1231l interfaceC1231l) {
        Class cls2;
        Collection collection;
        C4173t c4173t = C4173t.f13710g;
        if (cls != null) {
            cls2 = Object.class;
            Class<Object> clsM51a0 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls2));
            if (!cls.equals(clsM51a0 != null ? clsM51a0 : Object.class)) {
                Collection collection2 = (Collection) interfaceC1231l.invoke(cls);
                if (collection2.isEmpty()) {
                    c3709c.getClass();
                    m10309j(abstractC3710d, c3709c);
                    collection = c4173t;
                } else {
                    collection = collection2;
                }
                return (List) collection;
            }
        }
        m10309j(abstractC3710d, c3709c);
        return c4173t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m10309j(AbstractC3710d abstractC3710d, C3709c c3709c) {
        Object c3959f;
        String string;
        String strM8122a;
        c3709c.getClass();
        Class cls = c3709c.f12064a;
        try {
            Map mapMo7223a = abstractC3710d.mo7223a();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo7223a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strM8122a = value instanceof InterfaceC3955b ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : AbstractC3931b.m8122a(value);
                }
                String strM6737a0 = strM8122a != null ? AbstractC3156t.m6737a0(strM8122a.toString(), " (Kotlin reflection is not available)", HttpUrl.FRAGMENT_ENCODE_SET, false) : null;
                C3958e c3958e = strM6737a0 != null ? new C3958e(str, strM6737a0) : null;
                if (c3958e != null) {
                    arrayList.add(c3958e);
                }
            }
            if (arrayList.isEmpty()) {
                c3959f = cls.toString();
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                final int iM10302c = m10302c((String) ((C3958e) it.next()).f12961g);
                while (it.hasNext()) {
                    int iM10302c2 = m10302c((String) ((C3958e) it.next()).f12961g);
                    if (iM10302c < iM10302c2) {
                        iM10302c = iM10302c2;
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM10302c3 = m10302c((String) ((C3958e) it2.next()).f12962h);
                while (it2.hasNext()) {
                    int iM10302c4 = m10302c((String) ((C3958e) it2.next()).f12962h);
                    if (iM10302c3 < iM10302c4) {
                        iM10302c3 = iM10302c4;
                    }
                }
                String strM6737a02 = AbstractC3156t.m6737a0(cls.toString(), " (Kotlin reflection is not available)", HttpUrl.FRAGMENT_ENCODE_SET, false);
                int iM10302c5 = m10302c(strM6737a02) - ((iM10302c + iM10302c3) + 3);
                if (iM10302c5 < 0) {
                    iM10302c5 = 0;
                }
                final int i9 = iM10302c3 + iM10302c5;
                String str2 = "+-" + AbstractC3156t.m6736Z(iM10302c, "-") + "-+-" + AbstractC3156t.m6736Z(i9, "-") + "-+";
                int i10 = iM10302c + i9 + 3;
                c3959f = AbstractC4166m.m8392A1(AbstractC0000a.m101y0("+-" + AbstractC3156t.m6736Z(i10, "-") + "-+", "| " + m10303d(i10, strM6737a02) + " |", str2, AbstractC4166m.m8392A1(arrayList, "\n", null, null, new InterfaceC1231l() { // from class: x6.b
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1231l
                    public final Object invoke(Object obj) {
                        C3958e c3958e2 = (C3958e) obj;
                        return AbstractC0255e.m1022k("| ", C5703g.m10303d(iM10302c, (String) c3958e2.f12961g), " | ", C5703g.m10303d(i9, (String) c3958e2.f12962h), " |");
                    }
                }, 30), str2), "\n", null, null, null, 62);
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objConcat = AbstractC3156t.m6737a0(cls.toString(), " (Kotlin reflection is not available)", HttpUrl.FRAGMENT_ENCODE_SET, false).concat("\nFailed to build condition table.");
        if (c3959f instanceof C3959f) {
            c3959f = objConcat;
        }
        String str3 = (String) c3959f;
        boolean z9 = abstractC3710d instanceof C3443c;
        if (z9) {
            StringBuilder sbM1027p = AbstractC0255e.m1027p("No method found matching the condition for current class", HttpUrl.FRAGMENT_ENCODE_SET, ".\n", str3, "\nSuggestion: ");
            sbM1027p.append("Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. ");
            string = sbM1027p.toString();
        } else if (abstractC3710d instanceof C3441a) {
            string = AbstractC0921a.m2251n("No constructor found matching the condition for current class.\n", str3, "\nSuggestion: Constructors are not inherited from superclass, check if the conditions are correct and valid, and try again. ");
        } else if (!(abstractC3710d instanceof C3442b)) {
            C3193a.m6826p(abstractC3710d, "Unsupported condition type: ");
            return;
        } else {
            StringBuilder sbM1027p2 = AbstractC0255e.m1027p("No field found matching the condition for current class", HttpUrl.FRAGMENT_ENCODE_SET, ".\n", str3, "\nSuggestion: ");
            sbM1027p2.append("Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. ");
            string = sbM1027p2.toString();
        }
        EnumC3708b enumC3708b = c3709c.f12065b;
        if (enumC3708b != EnumC3708b.f12060g) {
            if (enumC3708b == EnumC3708b.f12061h) {
                AbstractC3149m.m6703R0(string).toString();
                AbstractC5998b.f24364a.ordinal();
                return;
            }
            return;
        }
        if (z9) {
            throw new NoSuchMethodException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
        }
        if (abstractC3710d instanceof C3441a) {
            throw new NoSuchMethodException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
        }
        if (abstractC3710d instanceof C3442b) {
            throw new NoSuchFieldException(string.concat("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"));
        }
        C3193a.m6826p(abstractC3710d, "Unsupported condition type: ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Class m10310k(Object obj, C3709c c3709c, String str) {
        Class clsM8316a;
        Object c3959f;
        Class cls;
        if (obj instanceof Class) {
            clsM8316a = (Class) obj;
        } else if (obj instanceof InterfaceC2840b) {
            InterfaceC2840b interfaceC2840b = (InterfaceC2840b) obj;
            interfaceC2840b.getClass();
            clsM8316a = ((InterfaceC1409e) interfaceC2840b).mo3818a();
            clsM8316a.getClass();
        } else if (obj instanceof String) {
            EnumC3708b enumC3708b = c3709c.f12065b;
            Class cls2 = c3709c.f12064a;
            if (enumC3708b == EnumC3708b.f12060g) {
                clsM8316a = AbstractC4132a.m8316a(cls2.getClassLoader(), (String) obj);
            } else {
                try {
                    c3959f = AbstractC4132a.m8316a(cls2.getClassLoader(), (String) obj);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                clsM8316a = (Class) c3959f;
                if (clsM8316a == null) {
                    clsM8316a = AbstractC5700d.class;
                    Class clsM51a0 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(clsM8316a));
                    if (clsM51a0 != null) {
                        clsM8316a = clsM51a0;
                    }
                }
            }
        } else {
            if (!(obj instanceof AbstractC3931b)) {
                C3193a.m6824m(obj, "Unsupported type: ", ", supported types are Class, KClass, String and VagueType.");
                return null;
            }
            clsM8316a = obj.getClass();
        }
        cls = AbstractC3931b.class;
        Class<AbstractC3931b> clsM51a02 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls));
        if (!clsM8316a.equals(clsM51a02 != null ? clsM51a02 : AbstractC3931b.class) || str == null) {
            return clsM8316a;
        }
        C3193a.m6824m(str, "VagueType is not supported for \"", "\".");
        return null;
    }
}
