package p127i9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p024b9.AbstractC1061t;
import p098g9.AbstractC2567u;
import p098g9.InterfaceC2548b;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2551e;
import p098g9.InterfaceC2552f;
import p098g9.InterfaceC2553g;
import p098g9.InterfaceC2557k;
import p098g9.InterfaceC2560n;
import p110h9.AbstractC2902d;
import p128ia.C3368a;
import p142j9.AbstractC3656b0;
import p142j9.AbstractC3708l2;
import p142j9.AbstractC3714m3;
import p142j9.C3751v2;
import p142j9.C3754w1;
import p158k9.InterfaceC4210h;
import p298u9.C8571f;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: i9.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3366d {

    /* JADX INFO: renamed from: i9.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9155a;

        static {
            int[] iArr = new int[C3368a.a.values().length];
            try {
                iArr[C3368a.a.f9171v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3368a.a.f9173x.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3368a.a.f9174y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9155a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2552f m12579a(Collection collection, Method method) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC2548b interfaceC2548b = (InterfaceC2548b) it.next();
            if (interfaceC2548b instanceof InterfaceC2552f) {
                InterfaceC2552f interfaceC2552f = (InterfaceC2552f) interfaceC2548b;
                if (AbstractC1061t.m3842c(interfaceC2552f.getName(), method.getName()) && AbstractC1061t.m3842c(m12583e(interfaceC2552f), method)) {
                    return interfaceC2552f;
                }
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC2548b interfaceC2548b2 = (InterfaceC2548b) it2.next();
            if (interfaceC2548b2 instanceof InterfaceC2552f) {
                InterfaceC2552f interfaceC2552f2 = (InterfaceC2552f) interfaceC2548b2;
                if (!AbstractC1061t.m3842c(interfaceC2552f2.getName(), method.getName()) && AbstractC1061t.m3842c(m12583e(interfaceC2552f2), method)) {
                    return interfaceC2552f2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Constructor m12580b(InterfaceC2552f interfaceC2552f) {
        InterfaceC4210h interfaceC4210hMo13637R;
        interfaceC2552f.getClass();
        AbstractC3656b0 abstractC3656b0M13805b = AbstractC3714m3.m13805b(interfaceC2552f);
        Member memberMo16638b = (abstractC3656b0M13805b == null || (interfaceC4210hMo13637R = abstractC3656b0M13805b.mo13637R()) == null) ? null : interfaceC4210hMo13637R.mo16638b();
        if (memberMo16638b instanceof Constructor) {
            return (Constructor) memberMo16638b;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final Field m12581c(InterfaceC2557k interfaceC2557k) {
        interfaceC2557k.getClass();
        AbstractC3708l2 abstractC3708l2M13807d = AbstractC3714m3.m13807d(interfaceC2557k);
        if (abstractC3708l2M13807d != null) {
            return abstractC3708l2M13807d.m13790i0();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final Method m12582d(InterfaceC2557k interfaceC2557k) {
        interfaceC2557k.getClass();
        return m12583e(interfaceC2557k.mo13656h0());
    }

    /* JADX INFO: renamed from: e */
    public static final Method m12583e(InterfaceC2552f interfaceC2552f) {
        InterfaceC4210h interfaceC4210hMo13637R;
        interfaceC2552f.getClass();
        AbstractC3656b0 abstractC3656b0M13805b = AbstractC3714m3.m13805b(interfaceC2552f);
        Member memberMo16638b = (abstractC3656b0M13805b == null || (interfaceC4210hMo13637R = abstractC3656b0M13805b.mo13637R()) == null) ? null : interfaceC4210hMo13637R.mo16638b();
        if (memberMo16638b instanceof Method) {
            return (Method) memberMo16638b;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final Method m12584f(InterfaceC2553g interfaceC2553g) {
        interfaceC2553g.getClass();
        return m12583e(interfaceC2553g.mo3773i());
    }

    /* JADX INFO: renamed from: g */
    public static final Type m12585g(InterfaceC2560n interfaceC2560n) {
        interfaceC2560n.getClass();
        Type typeMo3852b = ((C3751v2) interfaceC2560n).mo3852b();
        return typeMo3852b == null ? AbstractC2567u.m9098f(interfaceC2560n) : typeMo3852b;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2551e m12586h(Member member) {
        C3368a c3368aMo10733b;
        C8571f.a aVar = C8571f.f28610c;
        Class<?> declaringClass = member.getDeclaringClass();
        declaringClass.getClass();
        C8571f c8571fM32986a = aVar.m32986a(declaringClass);
        C3368a.a aVarM12592c = (c8571fM32986a == null || (c3368aMo10733b = c8571fM32986a.mo10733b()) == null) ? null : c3368aMo10733b.m12592c();
        int i10 = aVarM12592c == null ? -1 : a.f9155a[aVarM12592c.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            return null;
        }
        Class<?> declaringClass2 = member.getDeclaringClass();
        declaringClass2.getClass();
        return new C3754w1(declaringClass2);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC2552f m12587i(Method method) {
        InterfaceC2552f interfaceC2552fM12579a;
        method.getClass();
        if (Modifier.isStatic(method.getModifiers())) {
            InterfaceC2551e interfaceC2551eM12586h = m12586h(method);
            if (interfaceC2551eM12586h != null) {
                return m12579a(interfaceC2551eM12586h.mo3776t(), method);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            declaringClass.getClass();
            InterfaceC2549c interfaceC2549cM10549a = AbstractC2902d.m10549a(AbstractC9886a.m38370e(declaringClass));
            if (interfaceC2549cM10549a != null) {
                Class clsM38367b = AbstractC9886a.m38367b(interfaceC2549cM10549a);
                String name = method.getName();
                name.getClass();
                Class<?>[] parameterTypes = method.getParameterTypes();
                Method methodM13812i = AbstractC3714m3.m13812i(clsM38367b, name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                if (methodM13812i != null && (interfaceC2552fM12579a = m12579a(AbstractC2902d.m10550b(interfaceC2549cM10549a), methodM13812i)) != null) {
                    return interfaceC2552fM12579a;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        declaringClass2.getClass();
        return m12579a(AbstractC2902d.m10550b(AbstractC9886a.m38370e(declaringClass2)), method);
    }
}
