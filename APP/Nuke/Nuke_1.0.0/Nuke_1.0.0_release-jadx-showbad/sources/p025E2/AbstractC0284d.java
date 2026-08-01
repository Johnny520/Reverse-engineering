package p025E2;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p000A.C0006D;
import p000A.C0027N0;
import p002A1.C0115D;
import p003A2.AbstractC0155b;
import p009B2.AbstractC0220a;
import p011B4.AbstractC0231b;
import p056K2.C0882h;
import p056K2.InterfaceC0877c;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p061L2.C0979s;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p127Z2.AbstractC1784a;
import p137b3.InterfaceC1854b;
import p143c3.C1904f;
import p143c3.InterfaceC1905g;
import p149d3.AbstractC1983k;
import p179i4.AbstractC2352g;
import p269y2.C3491a;
import p269y2.C3492b;
import p275z2.AbstractC3517c;
import p275z2.C3516b;

/* JADX INFO: renamed from: E2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0284d {

    /* JADX INFO: renamed from: a */
    public static final C0115D f912a = new C0115D(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1904f m487a(C0979s c0979s, AbstractC3517c abstractC3517c, C3516b c3516b) {
        return m499m(m499m(m499m(m499m(m499m(m499m(m499m(m499m(m499m(m499m(c0979s, c3516b, "name", abstractC3517c.f10965b, new C0027N0(16)), c3516b, "nameCondition", null, new C0027N0(18)), c3516b, "modifiers", abstractC3517c.f10966c, new C0027N0(19)), c3516b, "modifiersNot", abstractC3517c.f10967d, new C0027N0(20)), c3516b, "modifiersCondition", null, new C0027N0(21)), c3516b, "isSynthetic", null, new C0027N0(22)), c3516b, "isSyntheticNot", null, new C0027N0(23)), c3516b, "annotations", abstractC3517c.f10968e, new C0281a(c3516b, 15)), c3516b, "annotationsNot", abstractC3517c.f10969f, new C0281a(c3516b, 16)), c3516b, "genericString", null, new C0027N0(24));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m488b(String str) {
        long j5 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            j5 += ((long) str.charAt(i5)) > 127 ? 2L : 1L;
        }
        return (int) j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final String m489c(String str, int i5) {
        int iM488b = i5 - m488b(str);
        if (iM488b <= 0) {
            return str;
        }
        return str + AbstractC1983k.m3652O(" ", iM488b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m490d(Collection collection, List list, C3516b c3516b) {
        Class cls;
        if (collection.size() == list.size()) {
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(m504r(it.next(), c3516b, null));
            }
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            for (Object obj : arrayList) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    AbstractC2352g.m4187J();
                    throw null;
                }
                Class cls2 = (Class) obj;
                Class cls3 = (Class) list.get(i5);
                cls = AbstractC0155b.class;
                Class<AbstractC0155b> clsM3240z = AbstractC1784a.m3240z(AbstractC1676u.m2995a(cls));
                if (AbstractC1665j.m2981a(cls2, clsM3240z != null ? clsM3240z : AbstractC0155b.class) || AbstractC1665j.m2981a(cls3, cls2)) {
                    arrayList2.add(obj);
                }
                i5 = i6;
            }
            if (arrayList2.size() == list.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m491e(C3516b c3516b, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
        }
        return m490d(set, arrayList, c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m492f(C3516b c3516b, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
        }
        return !m490d(set, arrayList, c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m493g(C3516b c3516b, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
        }
        return m490d(set, arrayList, c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m494h(C3516b c3516b, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
        }
        return !m490d(set, arrayList, c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final boolean m495i(C3516b c3516b, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return m490d(set, AbstractC0974n.m2030L(arrayList), c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m496j(C3516b c3516b, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return !m490d(set, AbstractC0974n.m2030L(arrayList), c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m497k(C3516b c3516b, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return m490d(set, AbstractC0974n.m2030L(arrayList), c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m498l(C3516b c3516b, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
            }
            arrayList.add(arrayList2);
        }
        return !m490d(set, AbstractC0974n.m2030L(arrayList), c3516b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C1904f m499m(InterfaceC1905g interfaceC1905g, C3516b c3516b, String str, Object obj, InterfaceC1603e interfaceC1603e) {
        return new C1904f(interfaceC1905g, new C0006D(obj, interfaceC1603e, c3516b, str, 1), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Annotation[] m500n(Member member) {
        if (member instanceof AnnotatedElement) {
            return ((AnnotatedElement) member).getDeclaredAnnotations();
        }
        throw new IllegalStateException(("Unsupported member type: " + member).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static List m501o(AbstractC3517c abstractC3517c, C3516b c3516b, Class cls, InterfaceC1601c interfaceC1601c) {
        Class cls2;
        if (cls != null) {
            cls2 = Object.class;
            Class<Object> clsM3240z = AbstractC1784a.m3240z(AbstractC1676u.m2995a(cls2));
            if (!cls.equals(clsM3240z != null ? clsM3240z : Object.class)) {
                Collection collectionM501o = (Collection) interfaceC1601c.mo1h(cls);
                if (collectionM501o.isEmpty()) {
                    if (!c3516b.f10963c) {
                        m502p(abstractC3517c, c3516b);
                        throw null;
                    }
                    collectionM501o = m501o(abstractC3517c, c3516b, cls.getSuperclass(), interfaceC1601c);
                }
                return (List) collectionM501o;
            }
        }
        m502p(abstractC3517c, c3516b);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m502p(AbstractC3517c abstractC3517c, C3516b c3516b) throws NoSuchMethodException {
        String strM503q;
        boolean z5 = abstractC3517c instanceof C3492b;
        if (z5) {
            strM503q = m503q(c3516b, abstractC3517c, "method");
        } else {
            if (!(abstractC3517c instanceof C3491a)) {
                throw new IllegalStateException(("Unsupported condition type: " + abstractC3517c).toString());
            }
            strM503q = m503q(c3516b, abstractC3517c, "field");
        }
        c3516b.getClass();
        if (z5) {
            throw new NoSuchMethodException(strM503q + "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n");
        }
        if (!(abstractC3517c instanceof C3491a)) {
            throw new IllegalStateException(("Unsupported condition type: " + abstractC3517c).toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM503q);
        sb.append("\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final String m503q(C3516b c3516b, AbstractC3517c abstractC3517c, String str) {
        String strConcat;
        String strM227a;
        boolean z5 = c3516b.f10963c;
        Class cls = c3516b.f10961a;
        String str2 = z5 ? " (Also tried for superclass)" : "";
        try {
            Map mapMo5749a = abstractC3517c.mo5749a();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo5749a.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strM227a = value instanceof InterfaceC0877c ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : AbstractC0155b.m227a(value);
                }
                String strM3654Q = strM227a != null ? AbstractC1983k.m3654Q(strM227a.toString(), " (Kotlin reflection is not available)", "") : null;
                C0882h c0882h = strM3654Q != null ? new C0882h(str3, strM3654Q) : null;
                if (c0882h != null) {
                    arrayList.add(c0882h);
                }
            }
            if (arrayList.isEmpty()) {
                strConcat = cls.toString();
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                final int iM488b = m488b((String) ((C0882h) it.next()).f2769d);
                while (it.hasNext()) {
                    int iM488b2 = m488b((String) ((C0882h) it.next()).f2769d);
                    if (iM488b < iM488b2) {
                        iM488b = iM488b2;
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM488b3 = m488b((String) ((C0882h) it2.next()).f2770e);
                while (it2.hasNext()) {
                    int iM488b4 = m488b((String) ((C0882h) it2.next()).f2770e);
                    if (iM488b3 < iM488b4) {
                        iM488b3 = iM488b4;
                    }
                }
                String strM3654Q2 = AbstractC1983k.m3654Q(cls.toString(), " (Kotlin reflection is not available)", "");
                int iM488b5 = m488b(strM3654Q2) - ((iM488b + iM488b3) + 3);
                if (iM488b5 < 0) {
                    iM488b5 = 0;
                }
                final int i5 = iM488b3 + iM488b5;
                String str4 = "+-" + AbstractC1983k.m3652O("-", iM488b) + "-+-" + AbstractC1983k.m3652O("-", i5) + "-+";
                int i6 = iM488b + i5 + 3;
                strConcat = AbstractC0973m.m2016W(AbstractC0972l.m1987K(new String[]{"+-" + AbstractC1983k.m3652O("-", i6) + "-+", "| " + m489c(strM3654Q2, i6) + " |", str4, AbstractC0973m.m2016W(arrayList, "\n", null, null, new InterfaceC1601c() { // from class: E2.b
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1601c
                    /* JADX INFO: renamed from: h */
                    public final Object mo1h(Object obj) {
                        C0882h c0882h2 = (C0882h) obj;
                        String str5 = (String) c0882h2.f2769d;
                        String str6 = (String) c0882h2.f2770e;
                        return "| " + AbstractC0284d.m489c(str5, iM488b) + " | " + AbstractC0284d.m489c(str6, i5) + " |";
                    }
                }, 30), str4}), "\n", null, null, null, 62);
            }
        } catch (Throwable th) {
            AbstractC1784a.m3229o(th);
            strConcat = AbstractC1983k.m3654Q(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        }
        String str5 = !c3516b.f10963c ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ";
        StringBuilder sbM405p = AbstractC0231b.m405p("No ", str, " found matching the condition for current class", str2, ".\n");
        sbM405p.append(strConcat);
        sbM405p.append("\nSuggestion: ");
        sbM405p.append(str5);
        return sbM405p.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Class m504r(Object obj, C3516b c3516b, String str) {
        Class<?> clsM324a;
        Class cls;
        if (obj instanceof Class) {
            clsM324a = (Class) obj;
        } else if (obj instanceof InterfaceC1854b) {
            clsM324a = AbstractC1784a.m3238x((InterfaceC1854b) obj);
        } else if (obj instanceof String) {
            c3516b.getClass();
            clsM324a = AbstractC0220a.m324a(c3516b.f10961a.getClassLoader(), (String) obj);
        } else {
            if (!(obj instanceof AbstractC0155b)) {
                throw new IllegalStateException(("Unsupported type: " + obj + ", supported types are Class, KClass, String and VagueType.").toString());
            }
            clsM324a = obj.getClass();
        }
        cls = AbstractC0155b.class;
        Class<AbstractC0155b> clsM3240z = AbstractC1784a.m3240z(AbstractC1676u.m2995a(cls));
        if (!clsM324a.equals(clsM3240z != null ? clsM3240z : AbstractC0155b.class) || str == null) {
            return clsM324a;
        }
        throw new IllegalStateException(("VagueType is not supported for \"" + str + "\".").toString());
    }
}
