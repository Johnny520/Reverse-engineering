package Yue;

import Yue.C7148;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4732 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1084 = m14255(Throwable.class, -1);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final AbstractC4255 f1085;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ */
    public static final class C0474<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C4033.m11389(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟ */
    public static final class C0475 extends AbstractC5673 implements InterfaceC5124 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0475 f10174 = new C0475();

        public C0475() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Void invoke(@InterfaceC6399 Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4733 extends AbstractC5673 implements InterfaceC5124<Throwable, Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Constructor f10175;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4733(Constructor constructor) {
            super(1);
            this.f10175 = constructor;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Throwable invoke(@InterfaceC6399 Throwable th) {
            Object objM3438;
            Object objNewInstance;
            try {
                C7148.C1189 c1189 = C7148.f21560;
                objNewInstance = this.f10175.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objM3438 = C7148.m3438((Throwable) objNewInstance);
            if (C7148.m22407(objM3438)) {
                objM3438 = null;
            }
            return (Throwable) objM3438;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4734 extends AbstractC5673 implements InterfaceC5124<Throwable, Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Constructor f10176;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4734(Constructor constructor) {
            super(1);
            this.f10176 = constructor;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Throwable invoke(@InterfaceC6399 Throwable th) {
            Object objM3438;
            Object objNewInstance;
            try {
                C7148.C1189 c1189 = C7148.f21560;
                objNewInstance = this.f10176.newInstance(th);
            } catch (Throwable th2) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objM3438 = C7148.m3438((Throwable) objNewInstance);
            if (C7148.m22407(objM3438)) {
                objM3438 = null;
            }
            return (Throwable) objM3438;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4735 extends AbstractC5673 implements InterfaceC5124<Throwable, Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Constructor f10177;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4735(Constructor constructor) {
            super(1);
            this.f10177 = constructor;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Throwable invoke(@InterfaceC6399 Throwable th) {
            Object objM3438;
            Object objNewInstance;
            try {
                C7148.C1189 c1189 = C7148.f21560;
                objNewInstance = this.f10177.newInstance(th.getMessage());
            } catch (Throwable th2) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objM3438 = C7148.m3438(th3);
            if (C7148.m22407(objM3438)) {
                objM3438 = null;
            }
            return (Throwable) objM3438;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4736 extends AbstractC5673 implements InterfaceC5124<Throwable, Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Constructor f10178;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4736(Constructor constructor) {
            super(1);
            this.f10178 = constructor;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Throwable invoke(@InterfaceC6399 Throwable th) {
            Object objM3438;
            Object objNewInstance;
            try {
                C7148.C1189 c1189 = C7148.f21560;
                objNewInstance = this.f10178.newInstance(null);
            } catch (Throwable th2) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objM3438 = C7148.m3438(th3);
            return (Throwable) (C7148.m22407(objM3438) ? null : objM3438);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۢۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C4737 extends AbstractC5673 implements InterfaceC5124<Throwable, Throwable> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<Throwable, Throwable> f10179;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, ? extends java.lang.Throwable> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4737(InterfaceC5124<? super Throwable, ? extends Throwable> interfaceC5124) {
            super(1);
            this.f10179 = interfaceC5124;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Throwable invoke(@InterfaceC6399 Throwable th) {
            Object objM3438;
            InterfaceC5124<Throwable, Throwable> interfaceC5124 = this.f10179;
            try {
                C7148.C1189 c1189 = C7148.f21560;
                objM3438 = C7148.m3438(interfaceC5124.invoke(th));
            } catch (Throwable th2) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th2));
            }
            if (C7148.m22407(objM3438)) {
                objM3438 = null;
            }
            return (Throwable) objM3438;
        }
    }

    static {
        AbstractC4255 abstractC4255;
        try {
            abstractC4255 = C4793.m1698() ? C8407.f3475 : C3832.f532;
        } catch (Throwable unused) {
            abstractC4255 = C8407.f3475;
        }
        f1085 = abstractC4255;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E extends Throwable> InterfaceC5124<Throwable, Throwable> m1651(Class<E> cls) {
        C0475 c0475 = C0475.f10174;
        if (f1084 != m14255(cls, 0)) {
            return c0475;
        }
        Iterator it = C3411.m8773(cls.getConstructors(), new C0474()).iterator();
        while (it.hasNext()) {
            InterfaceC5124<Throwable, Throwable> interfaceC5124M14252 = m14252((Constructor) it.next());
            if (interfaceC5124M14252 != null) {
                return interfaceC5124M14252;
            }
        }
        return c0475;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC5124<Throwable, Throwable> m14252(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C4736(constructor);
        }
        if (length != 1) {
            if (length == 2 && C5499.m17094(parameterTypes[0], String.class) && C5499.m17094(parameterTypes[1], Throwable.class)) {
                return new C4733(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (C5499.m17094(cls, Throwable.class)) {
            return new C4734(constructor);
        }
        if (C5499.m17094(cls, String.class)) {
            return new C4735(constructor);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m14253(Class<?> cls, int i) {
        do {
            int length = cls.getDeclaredFields().length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(r0[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m14254(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m14253(cls, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m14255(Class<?> cls, int i) {
        Object objM3438;
        C5564.m17351(cls);
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objM3438 = C7148.m3438(Integer.valueOf(m14254(cls, 0, 1, null)));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        Integer numValueOf = Integer.valueOf(i);
        if (C7148.m22407(objM3438)) {
            objM3438 = numValueOf;
        }
        return ((Number) objM3438).intValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC5124<Throwable, Throwable> m14256(InterfaceC5124<? super Throwable, ? extends Throwable> interfaceC5124) {
        return new C4737(interfaceC5124);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Yue.ۥ۟ۧۨۦ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <E extends Throwable> E m14257(@InterfaceC6399 E e) {
        Object objM3438;
        if (!(e instanceof InterfaceC4224)) {
            return (E) f1085.mo885(e.getClass()).invoke(e);
        }
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objM3438 = C7148.m3438(((InterfaceC4224) e).mo1189());
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22407(objM3438)) {
            objM3438 = null;
        }
        return (E) objM3438;
    }
}
