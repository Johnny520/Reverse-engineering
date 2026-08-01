package p142j9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1027c;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p024b9.InterfaceC1037h;
import p098g9.InterfaceC2557k;
import p142j9.AbstractC3659b3;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p213oa.C5695f;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;
import p259ra.AbstractC6569n;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p298u9.AbstractC8570e;
import p298u9.C8576k;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.C8632n;
import p299ub.InterfaceC8626i;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: j9.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3672e1 implements InterfaceC1037h {

    /* JADX INFO: renamed from: q */
    public static final a f10173q = new a(null);

    /* JADX INFO: renamed from: r */
    public static final Class f10174r = AbstractC1043k.class;

    /* JADX INFO: renamed from: s */
    public static final C8632n f10175s = new C8632n("<v#(\\d+)>");

    /* JADX INFO: renamed from: j9.e1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public abstract class b {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ InterfaceC2557k[] f10176c = {AbstractC1052o0.m3814i(new C1038h0(b.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a */
        public final AbstractC3659b3.a f10177a;

        public b() {
            this.f10177a = AbstractC3659b3.m13645b(new C3677f1(AbstractC3672e1.this));
        }

        /* JADX INFO: renamed from: c */
        public static final C8576k m13690c(AbstractC3672e1 abstractC3672e1) {
            return AbstractC3654a3.m13610a(abstractC3672e1.mo3775b());
        }

        /* JADX INFO: renamed from: b */
        public final C8576k m13691b() {
            Object objM13649c = this.f10177a.m13649c(this, f10176c[0]);
            objM13649c.getClass();
            return (C8576k) objM13649c;
        }
    }

    /* JADX INFO: renamed from: j9.e1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final List f10179a;

        /* JADX INFO: renamed from: b */
        public final Class f10180b;

        public c(List list, Class cls) {
            list.getClass();
            this.f10179a = list;
            this.f10180b = cls;
        }

        /* JADX INFO: renamed from: a */
        public final List m13692a() {
            return this.f10179a;
        }

        /* JADX INFO: renamed from: b */
        public final Class m13693b() {
            return this.f10180b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: j9.e1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {

        /* JADX INFO: renamed from: q */
        public static final d f10181q = new d("DECLARED", 0);

        /* JADX INFO: renamed from: r */
        public static final d f10182r = new d("INHERITED", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ d[] f10183s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f10184t;

        static {
            d[] dVarArrM13694a = m13694a();
            f10183s = dVarArrM13694a;
            f10184t = AbstractC7198b.m28437a(dVarArrM13694a);
        }

        public d(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ d[] m13694a() {
            return new d[]{f10181q, f10182r};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f10183s.clone();
        }

        /* JADX INFO: renamed from: c */
        public final boolean m13695c(InterfaceC5986b interfaceC5986b) {
            interfaceC5986b.getClass();
            return interfaceC5986b.mo12678j().m23992a() == (this == f10181q);
        }
    }

    /* JADX INFO: renamed from: j9.e1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends C3695j {
        public e(AbstractC3672e1 abstractC3672e1) {
            super(abstractC3672e1);
        }

        @Override // p273s9.AbstractC7229o, p229p9.InterfaceC6025o
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC3656b0 mo13696c(InterfaceC6016l interfaceC6016l, C4700i0 c4700i0) {
            interfaceC6016l.getClass();
            c4700i0.getClass();
            throw new IllegalStateException("No constructors should appear here: " + interfaceC6016l);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final CharSequence m13661A(InterfaceC6055y0 interfaceC6055y0) {
        interfaceC6055y0.getClass();
        return AbstractC6569n.f20555k.mo25906M(interfaceC6055y0) + " | " + C3689h3.f10209a.m13736f(interfaceC6055y0).mo13842a();
    }

    /* JADX INFO: renamed from: n */
    public static final CharSequence m13667n(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        return AbstractC6569n.f20555k.mo25906M(interfaceC6056z) + " | " + C3689h3.f10209a.m13737g(interfaceC6056z).mo13824a();
    }

    /* JADX INFO: renamed from: q */
    public static final int m13668q(AbstractC6043u abstractC6043u, AbstractC6043u abstractC6043u2) {
        Integer numM24075d = AbstractC6040t.m24075d(abstractC6043u, abstractC6043u2);
        if (numM24075d != null) {
            return numM24075d.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public static final int m13669z(InterfaceC0188p interfaceC0188p, Object obj, Object obj2) {
        return ((Number) interfaceC0188p.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: B */
    public abstract Collection mo13670B();

    /* JADX INFO: renamed from: C */
    public abstract Collection mo13671C(C5695f c5695f);

    /* JADX INFO: renamed from: D */
    public abstract InterfaceC6055y0 mo13672D(int i10);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection m13673E(za.InterfaceC9913k r8, p142j9.AbstractC3672e1.d r9) {
        /*
            r7 = this;
            r8.getClass()
            r9.getClass()
            j9.e1$e r0 = new j9.e1$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = za.InterfaceC9916n.a.m38461a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1c:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r8.next()
            p9.m r3 = (p229p9.InterfaceC6019m) r3
            boolean r4 = r3 instanceof p229p9.InterfaceC5986b
            if (r4 == 0) goto L4a
            r4 = r3
            p9.b r4 = (p229p9.InterfaceC5986b) r4
            p9.u r5 = r4.mo5587g()
            p9.u r6 = p229p9.AbstractC6040t.f18989h
            boolean r5 = p024b9.AbstractC1061t.m3842c(r5, r6)
            if (r5 != 0) goto L4a
            boolean r4 = r9.m13695c(r4)
            if (r4 == 0) goto L4a
            l8.i0 r4 = p172l8.C4700i0.f13910a
            java.lang.Object r3 = r3.mo12663M0(r0, r4)
            j9.b0 r3 = (p142j9.AbstractC3656b0) r3
            goto L4b
        L4a:
            r3 = r2
        L4b:
            if (r3 == 0) goto L1c
            r1.add(r3)
            goto L1c
        L51:
            java.util.List r8 = p185m8.AbstractC5081g0.m20554X0(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p142j9.AbstractC3672e1.m13673E(za.k, j9.e1$d):java.util.Collection");
    }

    /* JADX INFO: renamed from: F */
    public Class mo13674F() {
        Class clsM34035k = AbstractC8865f.m34035k(mo3775b());
        return clsM34035k == null ? mo3775b() : clsM34035k;
    }

    /* JADX INFO: renamed from: G */
    public abstract Collection mo13675G(C5695f c5695f);

    /* JADX INFO: renamed from: H */
    public final Method m13676H(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        String str2;
        Class[] clsArr2;
        Class cls3;
        boolean z11;
        Class clsM32984a;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodM13680L = m13680L(cls, str, clsArr, cls2);
        if (methodM13680L != null) {
            return methodM13680L;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodM13676H = m13676H(superclass, str, clsArr, cls2, z10);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
            if (methodM13676H != null) {
                return methodM13676H;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
        }
        Iterator itM3774a = AbstractC1027c.m3774a(cls.getInterfaces());
        while (itM3774a.hasNext()) {
            Class cls4 = (Class) itM3774a.next();
            cls4.getClass();
            Method methodM13676H2 = m13676H(cls4, str2, clsArr2, cls3, z11);
            if (methodM13676H2 != null) {
                return methodM13676H2;
            }
            if (z11 && (clsM32984a = AbstractC8570e.m32984a(AbstractC8865f.m34034j(cls4), cls4.getName().concat("$DefaultImpls"))) != null) {
                clsArr2[0] = cls4;
                Method methodM13680L2 = m13680L(clsM32984a, str2, clsArr2, cls3);
                if (methodM13680L2 != null) {
                    return methodM13680L2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final c m13677I(String str, boolean z10) {
        String str2;
        int iM33150m0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (str.charAt(i10) == ')') {
                String str3 = str;
                return new c(arrayList, z10 ? m13678J(str3, i10 + 1, str3.length()) : null);
            }
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (AbstractC8621f0.m33124Z("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i12 = i11 + 1;
                str2 = str;
                iM33150m0 = i12;
            } else {
                if (cCharAt != 'L') {
                    throw new C3767z2("Unknown type prefix in the method signature: ".concat(str));
                }
                str2 = str;
                iM33150m0 = AbstractC8621f0.m33150m0(str2, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(m13678J(str2, i10, iM33150m0));
            i10 = iM33150m0;
            str = str2;
        }
    }

    /* JADX INFO: renamed from: J */
    public final Class m13678J(String str, int i10, int i11) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            Class<?> clsLoadClass = AbstractC8865f.m34034j(mo3775b()).loadClass(AbstractC8611a0.m33068M(str.substring(i10 + 1, i11 - 1), '/', '.', false, 4, null));
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return AbstractC3714m3.m13809f(m13678J(str, i10 + 1, i11));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new C3767z2("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: K */
    public final Constructor m13679K(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public final Method m13680L(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (AbstractC1061t.m3842c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC1061t.m3842c(method.getName(), str) && AbstractC1061t.m3842c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m13681h(List list, List list2, boolean z10) {
        if (AbstractC1061t.m3842c(AbstractC5081g0.m20589w0(list2), f10174r)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls = Integer.TYPE;
            cls.getClass();
            list.add(cls);
        }
        Class cls2 = z10 ? f10174r : Object.class;
        cls2.getClass();
        list.add(cls2);
    }

    /* JADX INFO: renamed from: i */
    public final Constructor m13682i(String str) {
        str.getClass();
        return m13679K(mo3775b(), m13677I(str, false).m13692a());
    }

    /* JADX INFO: renamed from: j */
    public final Constructor m13683j(String str) {
        str.getClass();
        Class clsMo3775b = mo3775b();
        ArrayList arrayList = new ArrayList();
        m13681h(arrayList, m13677I(str, false).m13692a(), true);
        C4700i0 c4700i0 = C4700i0.f13910a;
        return m13679K(clsMo3775b, arrayList);
    }

    /* JADX INFO: renamed from: k */
    public final Method m13684k(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        if (AbstractC1061t.m3842c(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(mo3775b());
        }
        c cVarM13677I = m13677I(str2, true);
        m13681h(arrayList, cVarM13677I.m13692a(), false);
        Class clsMo13674F = mo13674F();
        String str3 = str + "$default";
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsM13693b = cVarM13677I.m13693b();
        clsM13693b.getClass();
        return m13676H(clsMo13674F, str3, clsArr, clsM13693b, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p229p9.InterfaceC6056z m13685m(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p142j9.AbstractC3672e1.m13685m(java.lang.String, java.lang.String):p9.z");
    }

    /* JADX INFO: renamed from: o */
    public final Method m13686o(String str, String str2) {
        Method methodM13676H;
        str.getClass();
        str2.getClass();
        if (AbstractC1061t.m3842c(str, "<init>")) {
            return null;
        }
        c cVarM13677I = m13677I(str2, true);
        Class[] clsArr = (Class[]) cVarM13677I.m13692a().toArray(new Class[0]);
        Class clsM13693b = cVarM13677I.m13693b();
        clsM13693b.getClass();
        Method methodM13676H2 = m13676H(mo13674F(), str, clsArr, clsM13693b, false);
        if (methodM13676H2 != null) {
            return methodM13676H2;
        }
        if (!mo13674F().isInterface() || (methodM13676H = m13676H(Object.class, str, clsArr, clsM13693b, false)) == null) {
            return null;
        }
        return methodM13676H;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC6055y0 m13687p(String str, String str2) {
        str.getClass();
        str2.getClass();
        InterfaceC8626i interfaceC8626iM33216h = f10175s.m33216h(str2);
        if (interfaceC8626iM33216h != null) {
            String str3 = (String) interfaceC8626iM33216h.mo33181a().m33186a().mo33182b().get(1);
            InterfaceC6055y0 interfaceC6055y0Mo13672D = mo13672D(Integer.parseInt(str3));
            if (interfaceC6055y0Mo13672D != null) {
                return interfaceC6055y0Mo13672D;
            }
            throw new C3767z2("Local property #" + str3 + " not found in " + mo3775b());
        }
        C5695f c5695fM23027j = C5695f.m23027j(str);
        c5695fM23027j.getClass();
        Collection collectionMo13675G = mo13675G(c5695fM23027j);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo13675G) {
            if (AbstractC1061t.m3842c(C3689h3.f10209a.m13736f((InterfaceC6055y0) obj).mo13842a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new C3767z2("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (InterfaceC6055y0) AbstractC5081g0.m20537I0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC6043u abstractC6043uMo5587g = ((InterfaceC6055y0) obj2).mo5587g();
            Object arrayList2 = linkedHashMap.get(abstractC6043uMo5587g);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(abstractC6043uMo5587g, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = AbstractC5107t0.m20766h(linkedHashMap, new C3657b1(C3652a1.f10147q)).values();
        collectionValues.getClass();
        List list = (List) AbstractC5081g0.m20586t0(collectionValues);
        if (list.size() == 1) {
            return (InterfaceC6055y0) AbstractC5081g0.m20576j0(list);
        }
        C5695f c5695fM23027j2 = C5695f.m23027j(str);
        c5695fM23027j2.getClass();
        String strM20585s0 = AbstractC5081g0.m20585s0(mo13675G(c5695fM23027j2), "\n", null, null, 0, null, C3662c1.f10162q, 30, null);
        StringBuilder sb2 = new StringBuilder("Property '");
        sb2.append(str);
        sb2.append("' (JVM signature: ");
        sb2.append(str2);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strM20585s0.length() == 0 ? " no members found" : "\n" + strM20585s0);
        throw new C3767z2(sb2.toString());
    }

    /* JADX INFO: renamed from: j9.e1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8632n m13688a() {
            return AbstractC3672e1.f10175s;
        }

        public a() {
        }
    }
}
