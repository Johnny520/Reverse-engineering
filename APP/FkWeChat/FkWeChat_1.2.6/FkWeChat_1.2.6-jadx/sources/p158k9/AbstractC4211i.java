package p158k9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1060s0;
import p158k9.InterfaceC4210h;
import p172l8.C4700i0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p376zd.C9987e;

/* JADX INFO: renamed from: k9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4211i implements InterfaceC4210h {

    /* JADX INFO: renamed from: e */
    public static final d f12360e = new d(null);

    /* JADX INFO: renamed from: a */
    public final Member f12361a;

    /* JADX INFO: renamed from: b */
    public final Type f12362b;

    /* JADX INFO: renamed from: c */
    public final Class f12363c;

    /* JADX INFO: renamed from: d */
    public final List f12364d;

    /* JADX INFO: renamed from: k9.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC4211i implements InterfaceC4209g {

        /* JADX INFO: renamed from: f */
        public final Object f12365f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Constructor constructor, Object obj) {
            constructor.getClass();
            Class declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : AbstractC5102r.m20668t(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f12365f = obj;
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            mo16665d(objArr);
            Constructor constructor = (Constructor) mo16638b();
            C1060s0 c1060s0 = new C1060s0(3);
            c1060s0.m3836a(this.f12365f);
            c1060s0.m3837b(objArr);
            c1060s0.m3836a(null);
            return constructor.newInstance(c1060s0.m3839d(new Object[c1060s0.m3838c()]));
        }
    }

    /* JADX INFO: renamed from: k9.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC4211i {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(Constructor constructor) {
            constructor.getClass();
            Class declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC5102r.m20668t(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            mo16665d(objArr);
            Constructor constructor = (Constructor) mo16638b();
            C1060s0 c1060s0 = new C1060s0(2);
            c1060s0.m3837b(objArr);
            c1060s0.m3836a(null);
            return constructor.newInstance(c1060s0.m3839d(new Object[c1060s0.m3838c()]));
        }
    }

    /* JADX INFO: renamed from: k9.i$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC4211i implements InterfaceC4209g {

        /* JADX INFO: renamed from: f */
        public final Object f12366f;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(Constructor constructor, Object obj) {
            constructor.getClass();
            Class declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f12366f = obj;
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            mo16665d(objArr);
            Constructor constructor = (Constructor) mo16638b();
            C1060s0 c1060s0 = new C1060s0(2);
            c1060s0.m3836a(this.f12366f);
            c1060s0.m3837b(objArr);
            return constructor.newInstance(c1060s0.m3839d(new Object[c1060s0.m3838c()]));
        }
    }

    /* JADX INFO: renamed from: k9.i$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC4211i {
        /* JADX WARN: Illegal instructions before constructor call */
        public e(Constructor constructor) {
            constructor.getClass();
            Class declaringClass = constructor.getDeclaringClass();
            declaringClass.getClass();
            Class declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            genericParameterTypes.getClass();
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            mo16665d(objArr);
            return ((Constructor) mo16638b()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC4211i(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f12361a = r1
            r0.f12362b = r2
            r0.f12363c = r3
            if (r3 == 0) goto L27
            b9.s0 r1 = new b9.s0
            r2 = 2
            r1.<init>(r2)
            r1.m3836a(r3)
            r1.m3837b(r4)
            int r2 = r1.m3838c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.m3839d(r2)
            java.util.List r1 = p185m8.AbstractC5114x.m20803r(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = p185m8.AbstractC5106t.m20713V0(r4)
        L2b:
            r0.f12364d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158k9.AbstractC4211i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: a */
    public List mo16637a() {
        return this.f12364d;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: b */
    public final Member mo16638b() {
        return this.f12361a;
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: c */
    public boolean mo16639c() {
        return InterfaceC4210h.a.m16664b(this);
    }

    /* JADX INFO: renamed from: d */
    public void mo16665d(Object[] objArr) {
        InterfaceC4210h.a.m16663a(this, objArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m16666e(Object obj) {
        if (obj == null || !this.f12361a.getDeclaringClass().isInstance(obj)) {
            C9987e.m38645a("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // p158k9.InterfaceC4210h
    /* JADX INFO: renamed from: f */
    public final Type mo16642f() {
        return this.f12362b;
    }

    /* JADX INFO: renamed from: g */
    public final Class m16667g() {
        return this.f12363c;
    }

    /* JADX INFO: renamed from: k9.i$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d {
        public /* synthetic */ d(AbstractC1043k abstractC1043k) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: renamed from: k9.i$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class f extends AbstractC4211i {

        /* JADX INFO: renamed from: k9.i$f$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends f implements InterfaceC4209g {

            /* JADX INFO: renamed from: f */
            public final Object f12367f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                field.getClass();
                this.f12367f = obj;
            }

            @Override // p158k9.AbstractC4211i.f, p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                return ((Field) mo16638b()).get(this.f12367f);
            }
        }

        /* JADX INFO: renamed from: k9.i$f$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends f implements InterfaceC4209g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                field.getClass();
            }
        }

        /* JADX INFO: renamed from: k9.i$f$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                field.getClass();
            }
        }

        /* JADX INFO: renamed from: k9.i$f$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                field.getClass();
            }

            @Override // p158k9.AbstractC4211i
            /* JADX INFO: renamed from: d */
            public void mo16665d(Object[] objArr) {
                objArr.getClass();
                super.mo16665d(objArr);
                m16666e(AbstractC5106t.m20720Z(objArr));
            }
        }

        /* JADX INFO: renamed from: k9.i$f$e */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, null);
                field.getClass();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Field field, boolean z10) {
            Type genericType = field.getGenericType();
            genericType.getClass();
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) {
            objArr.getClass();
            mo16665d(objArr);
            return ((Field) mo16638b()).get(m16667g() != null ? AbstractC5106t.m20716X(objArr) : null);
        }

        public /* synthetic */ f(Field field, boolean z10, AbstractC1043k abstractC1043k) {
            this(field, z10);
        }
    }

    /* JADX INFO: renamed from: k9.i$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class g extends AbstractC4211i {

        /* JADX INFO: renamed from: f */
        public final boolean f12368f;

        /* JADX INFO: renamed from: k9.i$g$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends g implements InterfaceC4209g {

            /* JADX INFO: renamed from: g */
            public final Object f12369g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, null);
                field.getClass();
                this.f12369g = obj;
            }

            @Override // p158k9.AbstractC4211i.g, p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) throws IllegalAccessException {
                objArr.getClass();
                mo16665d(objArr);
                ((Field) mo16638b()).set(this.f12369g, AbstractC5106t.m20716X(objArr));
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: k9.i$g$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends g implements InterfaceC4209g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, null);
                field.getClass();
            }

            @Override // p158k9.AbstractC4211i.g, p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) throws IllegalAccessException {
                objArr.getClass();
                mo16665d(objArr);
                ((Field) mo16638b()).set(null, AbstractC5106t.m20755v0(objArr));
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: k9.i$g$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, null);
                field.getClass();
            }
        }

        /* JADX INFO: renamed from: k9.i$g$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, null);
                field.getClass();
            }

            @Override // p158k9.AbstractC4211i.g, p158k9.AbstractC4211i
            /* JADX INFO: renamed from: d */
            public void mo16665d(Object[] objArr) {
                objArr.getClass();
                super.mo16665d(objArr);
                m16666e(AbstractC5106t.m20720Z(objArr));
            }
        }

        /* JADX INFO: renamed from: k9.i$g$e */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, null);
                field.getClass();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public g(Field field, boolean z10, boolean z11) {
            Class cls = Void.TYPE;
            cls.getClass();
            super(field, cls, z11 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f12368f = z10;
        }

        @Override // p158k9.AbstractC4211i
        /* JADX INFO: renamed from: d */
        public void mo16665d(Object[] objArr) {
            objArr.getClass();
            super.mo16665d(objArr);
            if (this.f12368f && AbstractC5106t.m20755v0(objArr) == null) {
                C9987e.m38645a("null is not allowed as a value for this property.");
            }
        }

        @Override // p158k9.InterfaceC4210h
        /* JADX INFO: renamed from: o */
        public Object mo16643o(Object[] objArr) throws IllegalAccessException {
            objArr.getClass();
            mo16665d(objArr);
            ((Field) mo16638b()).set(m16667g() != null ? AbstractC5106t.m20716X(objArr) : null, AbstractC5106t.m20755v0(objArr));
            return C4700i0.f13910a;
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, AbstractC1043k abstractC1043k) {
            this(field, z10, z11);
        }
    }

    /* JADX INFO: renamed from: k9.i$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class h extends AbstractC4211i {

        /* JADX INFO: renamed from: f */
        public final boolean f12370f;

        /* JADX INFO: renamed from: k9.i$h$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends h implements InterfaceC4209g {

            /* JADX INFO: renamed from: g */
            public final Object f12371g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4, null);
                method.getClass();
                this.f12371g = obj;
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                return m16668h(this.f12371g, objArr);
            }
        }

        /* JADX INFO: renamed from: k9.i$h$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends h implements InterfaceC4209g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4, null);
                method.getClass();
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                return m16668h(null, objArr);
            }
        }

        /* JADX INFO: renamed from: k9.i$h$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends h implements InterfaceC4209g {

            /* JADX INFO: renamed from: g */
            public final boolean f12372g;

            /* JADX INFO: renamed from: h */
            public final Object f12373h;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(Method method, boolean z10, Object obj) {
                method.getClass();
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC5102r.m20668t(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.f12372g = z10;
                this.f12373h = obj;
            }

            /* JADX INFO: renamed from: i */
            public final Object m16669i() {
                return this.f12373h;
            }

            /* JADX INFO: renamed from: j */
            public final boolean m16670j() {
                return this.f12372g;
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                C1060s0 c1060s0 = new C1060s0(2);
                c1060s0.m3836a(this.f12373h);
                c1060s0.m3837b(objArr);
                return m16668h(null, c1060s0.m3839d(new Object[c1060s0.m3838c()]));
            }
        }

        /* JADX INFO: renamed from: k9.i$h$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends h implements InterfaceC4209g {

            /* JADX INFO: renamed from: g */
            public final Object[] f12374g;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(Method method, Object[] objArr) {
                method.getClass();
                objArr.getClass();
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                genericParameterTypes.getClass();
                super(method, false, (Type[]) AbstractC5106t.m20708T(genericParameterTypes, objArr.length).toArray(new Type[0]), null);
                this.f12374g = objArr;
            }

            /* JADX INFO: renamed from: i */
            public final Object[] m16671i() {
                return this.f12374g;
            }

            /* JADX INFO: renamed from: j */
            public final int m16672j() {
                return this.f12374g.length;
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                C1060s0 c1060s0 = new C1060s0(2);
                c1060s0.m3837b(this.f12374g);
                c1060s0.m3837b(objArr);
                return m16668h(null, c1060s0.m3839d(new Object[c1060s0.m3838c()]));
            }
        }

        /* JADX INFO: renamed from: k9.i$h$e */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, null, 6, null);
                method.getClass();
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                return m16668h(objArr[0], objArr.length <= 1 ? new Object[0] : AbstractC5102r.m20668t(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: k9.i$h$f */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, null, 4, null);
                method.getClass();
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                m16666e(AbstractC5106t.m20720Z(objArr));
                return m16668h(null, objArr.length <= 1 ? new Object[0] : AbstractC5102r.m20668t(objArr, 1, objArr.length));
            }
        }

        /* JADX INFO: renamed from: k9.i$h$g */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, null, 6, null);
                method.getClass();
            }

            @Override // p158k9.InterfaceC4210h
            /* JADX INFO: renamed from: o */
            public Object mo16643o(Object[] objArr) {
                objArr.getClass();
                mo16665d(objArr);
                return m16668h(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public h(Method method, boolean z10, Type[] typeArr) {
            Type genericReturnType = method.getGenericReturnType();
            genericReturnType.getClass();
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f12370f = AbstractC1061t.m3842c(mo16642f(), Void.TYPE);
        }

        /* JADX INFO: renamed from: h */
        public final Object m16668h(Object obj, Object[] objArr) {
            objArr.getClass();
            return this.f12370f ? C4700i0.f13910a : ((Method) mo16638b()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, AbstractC1043k abstractC1043k) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, AbstractC1043k abstractC1043k) {
            this(method, z10, typeArr);
        }
    }

    public /* synthetic */ AbstractC4211i(Member member, Type type, Class cls, Type[] typeArr, AbstractC1043k abstractC1043k) {
        this(member, type, cls, typeArr);
    }
}
