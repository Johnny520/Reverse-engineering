package p098g9;

import ae.C0307f;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p024b9.InterfaceC1063u;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p215oc.C5729x;
import p299ub.AbstractC8611a0;
import p372z8.AbstractC9886a;
import sb.AbstractC7291q;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: g9.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2567u {

    /* JADX INFO: renamed from: g9.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6833a;

        static {
            int[] iArr = new int[EnumC2563q.values().length];
            try {
                iArr[EnumC2563q.f6824r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2563q.f6823q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2563q.f6825s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6833a = iArr;
        }
    }

    /* JADX INFO: renamed from: g9.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class b extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final b f6834y = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Class mo27m(Class cls) {
            cls.getClass();
            return cls.getComponentType();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Type m9095c(InterfaceC2560n interfaceC2560n, boolean z10) {
        InterfaceC2550d interfaceC2550dMo3877e = interfaceC2560n.mo3877e();
        if (interfaceC2550dMo3877e instanceof InterfaceC2561o) {
            return new C2564r((InterfaceC2561o) interfaceC2550dMo3877e);
        }
        if (!(interfaceC2550dMo3877e instanceof InterfaceC2549c)) {
            C2566t.m9092a("Unsupported type classifier: ", interfaceC2560n);
            return null;
        }
        InterfaceC2549c interfaceC2549c = (InterfaceC2549c) interfaceC2550dMo3877e;
        Class clsM38368c = z10 ? AbstractC9886a.m38368c(interfaceC2549c) : AbstractC9886a.m38367b(interfaceC2549c);
        List listMo3876c = interfaceC2560n.mo3876c();
        if (listMo3876c.isEmpty()) {
            return clsM38368c;
        }
        if (!clsM38368c.isArray()) {
            return m9097e(clsM38368c, listMo3876c);
        }
        if (clsM38368c.getComponentType().isPrimitive()) {
            return clsM38368c;
        }
        C2562p c2562p = (C2562p) AbstractC5081g0.m20539K0(listMo3876c);
        if (c2562p == null) {
            C0307f.m923a("kotlin.Array must have exactly one type argument: ", interfaceC2560n);
            return null;
        }
        EnumC2563q enumC2563qM9082a = c2562p.m9082a();
        InterfaceC2560n interfaceC2560nM9083b = c2562p.m9083b();
        int i10 = enumC2563qM9082a == null ? -1 : a.f6833a[enumC2563qM9082a.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsM38368c;
        }
        if (i10 != 2 && i10 != 3) {
            C5729x.m23182a();
            return null;
        }
        interfaceC2560nM9083b.getClass();
        Type typeM9096d = m9096d(interfaceC2560nM9083b, false, 1, null);
        return typeM9096d instanceof Class ? clsM38368c : new C2547a(typeM9096d);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Type m9096d(InterfaceC2560n interfaceC2560n, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m9095c(interfaceC2560n, z10);
    }

    /* JADX INFO: renamed from: e */
    public static final Type m9097e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m9099g((C2562p) it.next()));
            }
            return new C2565s(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m9099g((C2562p) it2.next()));
            }
            return new C2565s(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeM9097e = m9097e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m9099g((C2562p) it3.next()));
        }
        return new C2565s(cls, typeM9097e, arrayList3);
    }

    /* JADX INFO: renamed from: f */
    public static final Type m9098f(InterfaceC2560n interfaceC2560n) {
        Type typeMo3852b;
        interfaceC2560n.getClass();
        return (!(interfaceC2560n instanceof InterfaceC1063u) || (typeMo3852b = ((InterfaceC1063u) interfaceC2560n).mo3852b()) == null) ? m9096d(interfaceC2560n, false, 1, null) : typeMo3852b;
    }

    /* JADX INFO: renamed from: g */
    public static final Type m9099g(C2562p c2562p) {
        EnumC2563q enumC2563qM9085d = c2562p.m9085d();
        if (enumC2563qM9085d == null) {
            return C2568v.f6835s.m9103a();
        }
        InterfaceC2560n interfaceC2560nM9084c = c2562p.m9084c();
        interfaceC2560nM9084c.getClass();
        int i10 = a.f6833a[enumC2563qM9085d.ordinal()];
        if (i10 == 1) {
            return new C2568v(null, m9095c(interfaceC2560nM9084c, true));
        }
        if (i10 == 2) {
            return m9095c(interfaceC2560nM9084c, true);
        }
        if (i10 == 3) {
            return new C2568v(m9095c(interfaceC2560nM9084c, true), null);
        }
        C5729x.m23182a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final String m9100h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC7282h interfaceC7282hM28888p = AbstractC7291q.m28888p(type, b.f6834y);
        return ((Class) AbstractC7294t.m28900H(interfaceC7282hM28888p)).getName() + AbstractC8611a0.m33065J(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI, AbstractC7294t.m28913w(interfaceC7282hM28888p));
    }
}
