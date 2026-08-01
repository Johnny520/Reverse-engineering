package bsh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/* JADX INFO: renamed from: bsh.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1241q2 implements Member {

    /* JADX INFO: renamed from: r */
    public final boolean f3775r;

    /* JADX INFO: renamed from: s */
    public final boolean f3776s;

    /* JADX INFO: renamed from: t */
    public final String f3777t;

    /* JADX INFO: renamed from: u */
    public final String f3778u;

    /* JADX INFO: renamed from: v */
    public final int f3779v;

    /* JADX INFO: renamed from: w */
    public final Class f3780w;

    /* JADX INFO: renamed from: q */
    public MethodHandle f3774q = null;

    /* JADX INFO: renamed from: x */
    public final List f3781x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public int f3782y = 0;

    /* JADX INFO: renamed from: bsh.q2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public List f3783a;

        /* JADX INFO: renamed from: b */
        public boolean f3784b;

        public a(List list, boolean z10) {
            this.f3783a = list;
            this.f3784b = z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1241q2(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f3779v = member.getModifiers();
        this.f3780w = member.getDeclaringClass();
        this.f3778u = member.getName();
        this.f3777t = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        this.f3775r = AbstractC1143c4.m4188p0(member2);
        this.f3776s = member2.isSynthetic();
        if (!C1180g1.m4328e() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String[] m5051c(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: f */
    public static C1181g2 m5052f(Field field) {
        return new C1181g2(field);
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC1241q2 m5053g(Constructor constructor) {
        return new C1135b2(constructor);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC1241q2 m5054h(Method method) {
        return new C1277w2(method);
    }

    /* JADX INFO: renamed from: d */
    public Object m5055d(Object obj, Class cls) {
        Class<?> clsM5141k = AbstractC1273v4.m5141k(obj);
        if (clsM5141k == null || !cls.isAssignableFrom(clsM5141k)) {
            obj = AbstractC1273v4.m5138h(obj, cls, 0);
        }
        return Primitive.unwrap(obj);
    }

    /* JADX INFO: renamed from: e */
    public a mo4106e(Object obj, Object[] objArr) throws InvocationTargetException {
        if (m5056i() > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + getName() + Arrays.asList(mo4321m()));
        }
        this.f3781x.clear();
        int i10 = 0;
        while (true) {
            int iM5056i = m5056i();
            List list = this.f3781x;
            if (i10 >= iM5056i) {
                return new a(list, false);
            }
            list.add(m5055d(objArr[i10], mo4321m()[i10]));
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1241q2 abstractC1241q2 = (AbstractC1241q2) obj;
        if (!getName().equals(abstractC1241q2.getName()) || getDeclaringClass() != abstractC1241q2.getDeclaringClass() || mo4320l() != abstractC1241q2.mo4320l() || mo4107n() != abstractC1241q2.mo4107n() || getModifiers() != abstractC1241q2.getModifiers()) {
            return false;
        }
        for (int i10 = 0; i10 < mo4320l(); i10++) {
            if (mo4321m()[i10] != abstractC1241q2.mo4321m()[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.reflect.Member
    public Class getDeclaringClass() {
        return this.f3780w;
    }

    @Override // java.lang.reflect.Member
    public int getModifiers() {
        return this.f3779v;
    }

    @Override // java.lang.reflect.Member
    public String getName() {
        return this.f3778u;
    }

    public int hashCode() {
        return (((((getClass().hashCode() ^ getName().hashCode()) ^ getDeclaringClass().hashCode()) ^ mo4320l()) ^ mo4107n().hashCode()) ^ getModifiers()) ^ ((Integer) Stream.of((Object[]) mo4321m()).map(new Function() { // from class: bsh.o2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Class cls = (Class) obj;
                return Integer.valueOf(cls == null ? 39 : cls.hashCode());
            }
        }).reduce(75, new BinaryOperator() { // from class: bsh.p2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Integer.valueOf(((Integer) obj).intValue() ^ ((Integer) obj2).intValue());
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: i */
    public int m5056i() {
        return this.f3782y;
    }

    @Override // java.lang.reflect.Member
    public boolean isSynthetic() {
        return this.f3776s;
    }

    /* JADX INFO: renamed from: j */
    public MethodHandle m5057j() {
        if (this.f3774q == null) {
            this.f3774q = mo4110x(null);
        }
        return this.f3774q;
    }

    /* JADX INFO: renamed from: k */
    public String[] m5058k() {
        return (String[]) m5063y().parameterList().stream().map(new Function() { // from class: bsh.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C1221n0.m4923y((Class) obj);
            }
        }).toArray(new IntFunction() { // from class: bsh.n2
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return AbstractC1241q2.m5051c(i10);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public abstract int mo4320l();

    /* JADX INFO: renamed from: m */
    public abstract Class[] mo4321m();

    /* JADX INFO: renamed from: n */
    public abstract Class mo4107n();

    /* JADX INFO: renamed from: o */
    public String m5059o() {
        return C1221n0.m4923y(mo4107n());
    }

    /* JADX INFO: renamed from: p */
    public Class mo4322p() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: q */
    public synchronized Object mo4332q(Object obj, Object... objArr) {
        InvocationTargetException invocationTargetException;
        if (objArr == null) {
            objArr = AbstractC1143c4.f3483a;
            try {
            } finally {
            }
        }
        return Primitive.wrap(m5060r(obj, objArr), (Class<?>) mo4107n());
    }

    /* JADX INFO: renamed from: r */
    public final synchronized Object m5060r(Object obj, Object[] objArr) {
        try {
            AbstractC1143c4.m4192r0("Invoking method (entry): ", this, objArr);
            a aVarMo4106e = mo4106e(obj, objArr);
            List<?> list = aVarMo4106e.f3783a;
            AbstractC1143c4.m4190q0("Invoking method (after): ", this, list);
            if (mo4320l() > 0) {
                MethodHandle methodHandleM5057j = m5057j();
                if (aVarMo4106e.f3784b) {
                    methodHandleM5057j = methodHandleM5057j.asFixedArity();
                }
                return methodHandleM5057j.invokeWithArguments(list);
            }
            if (!mo4109v() && !(this instanceof C1135b2)) {
                return (Object) m5057j().invoke(list.get(0));
            }
            return (Object) m5057j().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean mo5061s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo4108t() {
        return false;
    }

    public String toString() {
        return this.f3777t;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo5062u() {
        return false;
    }

    /* JADX INFO: renamed from: v */
    public boolean mo4109v() {
        return this.f3775r;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo4323w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public abstract MethodHandle mo4110x(MethodHandle methodHandle);

    /* JADX INFO: renamed from: y */
    public MethodType m5063y() {
        return MethodType.methodType((Class<?>) mo4107n(), (Class<?>[]) mo4321m());
    }
}
