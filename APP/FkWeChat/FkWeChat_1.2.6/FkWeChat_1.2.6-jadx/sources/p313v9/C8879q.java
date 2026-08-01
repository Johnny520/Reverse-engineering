package p313v9;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1055q;
import p024b9.C1060s0;
import p081fa.EnumC2376d0;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2379g;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.AbstractC6051w1;
import p229p9.C6048v1;
import p284t9.C8206a;
import p284t9.C8207b;
import p284t9.C8208c;
import p299ub.AbstractC8621f0;
import sb.AbstractC7291q;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: v9.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8879q extends AbstractC8883u implements InterfaceC8872j, InterfaceC8856a0, InterfaceC2379g {

    /* JADX INFO: renamed from: a */
    public final Class f29455a;

    /* JADX INFO: renamed from: v9.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f29456y = new a();

        public a() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(Member member) {
            member.getClass();
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* JADX INFO: renamed from: v9.q$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final b f29457y = new b();

        public b() {
            super(1, C8882t.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C8882t mo27m(Constructor constructor) {
            constructor.getClass();
            return new C8882t(constructor);
        }
    }

    /* JADX INFO: renamed from: v9.q$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class c extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final c f29458y = new c();

        public c() {
            super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(Member member) {
            member.getClass();
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* JADX INFO: renamed from: v9.q$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class d extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final d f29459y = new d();

        public d() {
            super(1, C8885w.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C8885w mo27m(Field field) {
            field.getClass();
            return new C8885w(field);
        }
    }

    /* JADX INFO: renamed from: v9.q$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class e extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final e f29460y = new e();

        public e() {
            super(1, C8888z.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final C8888z mo27m(Method method) {
            method.getClass();
            return new C8888z(method);
        }
    }

    public C8879q(Class cls) {
        cls.getClass();
        this.f29455a = cls;
    }

    /* JADX INFO: renamed from: U */
    public static final boolean m34048U(Class cls) {
        return cls.getSimpleName().length() == 0;
    }

    /* JADX INFO: renamed from: V */
    public static final C5695f m34049V(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!C5695f.m23028l(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C5695f.m23027j(simpleName);
        }
        return null;
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m34050W(C8879q c8879q, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        return (c8879q.mo8608E() && c8879q.m34060g0(method)) ? false : true;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: E */
    public boolean mo8608E() {
        return this.f29455a.isEnum();
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: H */
    public boolean mo8610H() throws IllegalAccessException, InvocationTargetException {
        Boolean boolM34012f = C8857b.f29413a.m34012f(this.f29455a);
        if (boolM34012f != null) {
            return boolM34012f.booleanValue();
        }
        return false;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: K */
    public boolean mo8611K() {
        return this.f29455a.isInterface();
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: L */
    public EnumC2376d0 mo8612L() {
        return null;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: Q */
    public InterfaceC7282h mo8615Q() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArrM34009c = C8857b.f29413a.m34009c(this.f29455a);
        if (clsArrM34009c != null) {
            ArrayList arrayList = new ArrayList(clsArrM34009c.length);
            for (Class cls : clsArrM34009c) {
                arrayList.add(new C8881s(cls));
            }
            InterfaceC7282h interfaceC7282hM20555Y = AbstractC5081g0.m20555Y(arrayList);
            if (interfaceC7282hM20555Y != null) {
                return interfaceC7282hM20555Y;
            }
        }
        return AbstractC7291q.m28881i();
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: T */
    public boolean mo8643T() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public List mo8617l() {
        Constructor<?>[] declaredConstructors = this.f29455a.getDeclaredConstructors();
        declaredConstructors.getClass();
        return AbstractC7294t.m28908P(AbstractC7294t.m28901I(AbstractC7294t.m28916z(AbstractC5106t.m20694M(declaredConstructors), a.f29456y), b.f29457y));
    }

    @Override // p313v9.InterfaceC8872j, p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public C8867g mo8603b(C5692c c5692c) {
        Annotation[] declaredAnnotations;
        c5692c.getClass();
        AnnotatedElement annotatedElementMo34038z = mo34038z();
        if (annotatedElementMo34038z == null || (declaredAnnotations = annotatedElementMo34038z.getDeclaredAnnotations()) == null) {
            return null;
        }
        return AbstractC8873k.m34045a(declaredAnnotations, c5692c);
    }

    @Override // p313v9.InterfaceC8872j
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Class mo34038z() {
        return this.f29455a;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public List mo8609G() {
        Field[] declaredFields = this.f29455a.getDeclaredFields();
        declaredFields.getClass();
        return AbstractC7294t.m28908P(AbstractC7294t.m28901I(AbstractC7294t.m28916z(AbstractC5106t.m20694M(declaredFields), c.f29458y), d.f29459y));
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: d */
    public C5692c mo8616d() {
        return AbstractC8865f.m34029e(this.f29455a).m22982a();
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public List mo8613N() {
        Class<?>[] declaredClasses = this.f29455a.getDeclaredClasses();
        declaredClasses.getClass();
        return AbstractC7294t.m28908P(AbstractC7294t.m28902J(AbstractC7294t.m28916z(AbstractC5106t.m20694M(declaredClasses), C8876n.f29452q), C8877o.f29453q));
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public List mo8614P() {
        Method[] declaredMethods = this.f29455a.getDeclaredMethods();
        declaredMethods.getClass();
        return AbstractC7294t.m28908P(AbstractC7294t.m28901I(AbstractC7294t.m28915y(AbstractC5106t.m20694M(declaredMethods), new C8878p(this)), e.f29460y));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8879q) && AbstractC1061t.m3842c(this.f29455a, ((C8879q) obj).f29455a);
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C8879q mo8619o() {
        Class<?> declaringClass = this.f29455a.getDeclaringClass();
        if (declaringClass != null) {
            return new C8879q(declaringClass);
        }
        return null;
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: g */
    public AbstractC6051w1 mo8644g() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? C6048v1.h.f19010c : Modifier.isPrivate(modifiers) ? C6048v1.e.f19007c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C8208c.f27519c : C8207b.f27518c : C8206a.f27517c;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m34060g0(Method method) {
        String name = method.getName();
        if (AbstractC1061t.m3842c(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            return parameterTypes.length == 0;
        }
        if (AbstractC1061t.m3842c(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // p313v9.InterfaceC8872j, p081fa.InterfaceC2375d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listM34046b;
        AnnotatedElement annotatedElementMo34038z = mo34038z();
        return (annotatedElementMo34038z == null || (declaredAnnotations = annotatedElementMo34038z.getDeclaredAnnotations()) == null || (listM34046b = AbstractC8873k.m34046b(declaredAnnotations)) == null) ? AbstractC5114x.m20800o() : listM34046b;
    }

    @Override // p313v9.InterfaceC8856a0
    public int getModifiers() {
        return this.f29455a.getModifiers();
    }

    @Override // p081fa.InterfaceC2392t
    public C5695f getName() {
        boolean zIsAnonymousClass = this.f29455a.isAnonymousClass();
        Class cls = this.f29455a;
        if (zIsAnonymousClass) {
            C5695f c5695fM23027j = C5695f.m23027j(AbstractC8621f0.m33147k1(cls.getName(), ".", null, 2, null));
            c5695fM23027j.getClass();
            return c5695fM23027j;
        }
        C5695f c5695fM23027j2 = C5695f.m23027j(cls.getSimpleName());
        c5695fM23027j2.getClass();
        return c5695fM23027j2;
    }

    @Override // p081fa.InterfaceC2398z
    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f29455a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C8866f0(typeVariable));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f29455a.hashCode();
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: j */
    public boolean mo8645j() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return false;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: n */
    public Collection mo8618n() {
        Class cls;
        cls = Object.class;
        if (AbstractC1061t.m3842c(this.f29455a, cls)) {
            return AbstractC5114x.m20800o();
        }
        C1060s0 c1060s0 = new C1060s0(2);
        Type genericSuperclass = this.f29455a.getGenericSuperclass();
        c1060s0.m3836a(genericSuperclass != null ? genericSuperclass : Object.class);
        c1060s0.m3837b(this.f29455a.getGenericInterfaces());
        List listM20803r = AbstractC5114x.m20803r(c1060s0.m3839d(new Type[c1060s0.m3838c()]));
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20803r, 10));
        Iterator it = listM20803r.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8881s((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: p */
    public Collection mo8620p() {
        Object[] objArrM34010d = C8857b.f29413a.m34010d(this.f29455a);
        if (objArrM34010d == null) {
            objArrM34010d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrM34010d.length);
        for (Object obj : objArrM34010d) {
            arrayList.add(new C8862d0(obj));
        }
        return arrayList;
    }

    @Override // p081fa.InterfaceC2391s
    /* JADX INFO: renamed from: r */
    public boolean mo8646r() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: t */
    public boolean mo8621t() {
        return this.f29455a.isAnnotation();
    }

    public String toString() {
        return C8879q.class.getName() + ": " + this.f29455a;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: v */
    public boolean mo8622v() throws IllegalAccessException, InvocationTargetException {
        Boolean boolM34011e = C8857b.f29413a.m34011e(this.f29455a);
        if (boolM34011e != null) {
            return boolM34011e.booleanValue();
        }
        return false;
    }

    @Override // p081fa.InterfaceC2379g
    /* JADX INFO: renamed from: x */
    public boolean mo8623x() {
        return false;
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC2369a mo8603b(C5692c c5692c) {
        return mo8603b(c5692c);
    }

    @Override // p081fa.InterfaceC2375d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
