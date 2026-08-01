package p361yc;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1029d;
import p024b9.C1031e;
import p024b9.C1035g;
import p024b9.C1045l;
import p024b9.C1047m;
import p024b9.C1058r0;
import p024b9.C1059s;
import p024b9.C1062t0;
import p024b9.C1069x;
import p098g9.InterfaceC2549c;
import p172l8.C4684a0;
import p172l8.C4686b0;
import p172l8.C4688c0;
import p172l8.C4690d0;
import p172l8.C4694f0;
import p172l8.C4696g0;
import p172l8.C4699i;
import p172l8.C4700i0;
import p172l8.C4718y;
import p172l8.C4719z;
import p185m8.AbstractC5107t0;
import p300uc.C8653g;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8650d;
import p300uc.InterfaceC8660n;
import p314vb.C8895b;
import p314vb.C8904k;
import p344xb.C9479b;
import p372z8.AbstractC9886a;
import vc.AbstractC8920a;

/* JADX INFO: renamed from: yc.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9684d2 {
    /* JADX INFO: renamed from: a */
    public static final Object m37843a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8647b m37844b(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return m37845c(interfaceC2549c, new InterfaceC8647b[0]);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8647b m37845c(InterfaceC2549c interfaceC2549c, InterfaceC8647b... interfaceC8647bArr) {
        interfaceC2549c.getClass();
        interfaceC8647bArr.getClass();
        return m37846d(AbstractC9886a.m38367b(interfaceC2549c), (InterfaceC8647b[]) Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length));
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8647b m37846d(Class cls, InterfaceC8647b... interfaceC8647bArr) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        interfaceC8647bArr.getClass();
        if (cls.isEnum() && m37855m(cls)) {
            return m37847e(cls);
        }
        InterfaceC8647b interfaceC8647bM37853k = m37853k(cls, (InterfaceC8647b[]) Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length));
        if (interfaceC8647bM37853k != null) {
            return interfaceC8647bM37853k;
        }
        InterfaceC8647b interfaceC8647bM37850h = m37850h(cls);
        if (interfaceC8647bM37850h != null) {
            return interfaceC8647bM37850h;
        }
        InterfaceC8647b interfaceC8647bM37848f = m37848f(cls, (InterfaceC8647b[]) Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length));
        if (interfaceC8647bM37848f != null) {
            return interfaceC8647bM37848f;
        }
        if (m37856n(cls)) {
            return new C8653g(AbstractC9886a.m38370e(cls));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8647b m37847e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        enumConstants.getClass();
        return new C9707i0(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC8647b m37848f(Class cls, InterfaceC8647b... interfaceC8647bArr) {
        Field field;
        InterfaceC8647b interfaceC8647bM37852j;
        Object objM37849g = m37849g(cls);
        if (objM37849g != null && (interfaceC8647bM37852j = m37852j(objM37849g, (InterfaceC8647b[]) Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length))) != null) {
            return interfaceC8647bM37852j;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            declaredClasses.getClass();
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (AbstractC1061t.m3842c(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof InterfaceC8647b) {
                return (InterfaceC8647b) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m37849g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        declaredClasses.getClass();
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(InterfaceC9743p1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        return m37843a(cls, cls2.getSimpleName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        r5 = null;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p300uc.InterfaceC8647b m37850h(java.lang.Class r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto La8
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = p299ub.AbstractC8611a0.m33075T(r0, r2, r3, r4, r1)
            if (r2 != 0) goto La8
            java.lang.String r2 = "kotlin."
            boolean r0 = p299ub.AbstractC8611a0.m33075T(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto La8
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            r0.getClass()
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L26:
            r7 = 1
            if (r4 >= r2) goto L54
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = p024b9.AbstractC1061t.m3842c(r9, r10)
            if (r9 == 0) goto L51
            java.lang.Class r9 = r8.getType()
            boolean r9 = p024b9.AbstractC1061t.m3842c(r9, r11)
            if (r9 == 0) goto L51
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L51
            if (r5 == 0) goto L4f
        L4d:
            r6 = r1
            goto L57
        L4f:
            r5 = r7
            r6 = r8
        L51:
            int r4 = r4 + 1
            goto L26
        L54:
            if (r5 != 0) goto L57
            goto L4d
        L57:
            if (r6 != 0) goto L5a
            return r1
        L5a:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            r11.getClass()
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L68:
            if (r3 >= r2) goto L97
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = p024b9.AbstractC1061t.m3842c(r8, r9)
            if (r8 == 0) goto L94
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L94
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<uc.b> r9 = p300uc.InterfaceC8647b.class
            boolean r8 = p024b9.AbstractC1061t.m3842c(r8, r9)
            if (r8 == 0) goto L94
            if (r4 == 0) goto L92
        L90:
            r5 = r1
            goto L9a
        L92:
            r5 = r6
            r4 = r7
        L94:
            int r3 = r3 + 1
            goto L68
        L97:
            if (r4 != 0) goto L9a
            goto L90
        L9a:
            if (r5 != 0) goto L9d
            return r1
        L9d:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof p300uc.InterfaceC8647b
            if (r0 == 0) goto La8
            uc.b r11 = (p300uc.InterfaceC8647b) r11
            return r11
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p361yc.AbstractC9684d2.m37850h(java.lang.Class):uc.b");
    }

    /* JADX INFO: renamed from: i */
    public static final Map m37851i() {
        Map mapM20761c = AbstractC5107t0.m20761c();
        mapM20761c.put(AbstractC1052o0.m3807b(String.class), AbstractC8920a.m34224D(C1062t0.f3215a));
        mapM20761c.put(AbstractC1052o0.m3807b(Character.TYPE), AbstractC8920a.m34256x(C1035g.f3196a));
        mapM20761c.put(AbstractC1052o0.m3807b(char[].class), AbstractC8920a.m34236d());
        mapM20761c.put(AbstractC1052o0.m3807b(Double.TYPE), AbstractC8920a.m34257y(C1045l.f3204a));
        mapM20761c.put(AbstractC1052o0.m3807b(double[].class), AbstractC8920a.m34237e());
        mapM20761c.put(AbstractC1052o0.m3807b(Float.TYPE), AbstractC8920a.m34258z(C1047m.f3206a));
        mapM20761c.put(AbstractC1052o0.m3807b(float[].class), AbstractC8920a.m34238f());
        mapM20761c.put(AbstractC1052o0.m3807b(Long.TYPE), AbstractC8920a.m34222B(C1069x.f3220a));
        mapM20761c.put(AbstractC1052o0.m3807b(long[].class), AbstractC8920a.m34241i());
        mapM20761c.put(AbstractC1052o0.m3807b(C4688c0.class), AbstractC8920a.m34227G(C4688c0.f13894r));
        mapM20761c.put(AbstractC1052o0.m3807b(Integer.TYPE), AbstractC8920a.m34221A(C1059s.f3213a));
        mapM20761c.put(AbstractC1052o0.m3807b(int[].class), AbstractC8920a.m34239g());
        mapM20761c.put(AbstractC1052o0.m3807b(C4684a0.class), AbstractC8920a.m34226F(C4684a0.f13888r));
        mapM20761c.put(AbstractC1052o0.m3807b(Short.TYPE), AbstractC8920a.m34223C(C1058r0.f3212a));
        mapM20761c.put(AbstractC1052o0.m3807b(short[].class), AbstractC8920a.m34247o());
        mapM20761c.put(AbstractC1052o0.m3807b(C4694f0.class), AbstractC8920a.m34228H(C4694f0.f13904r));
        mapM20761c.put(AbstractC1052o0.m3807b(Byte.TYPE), AbstractC8920a.m34255w(C1031e.f3187a));
        mapM20761c.put(AbstractC1052o0.m3807b(byte[].class), AbstractC8920a.m34235c());
        mapM20761c.put(AbstractC1052o0.m3807b(C4718y.class), AbstractC8920a.m34225E(C4718y.f13942r));
        mapM20761c.put(AbstractC1052o0.m3807b(Boolean.TYPE), AbstractC8920a.m34254v(C1029d.f3184a));
        mapM20761c.put(AbstractC1052o0.m3807b(boolean[].class), AbstractC8920a.m34234b());
        mapM20761c.put(AbstractC1052o0.m3807b(C4700i0.class), AbstractC8920a.m34229I(C4700i0.f13910a));
        mapM20761c.put(AbstractC1052o0.m3807b(Void.class), AbstractC8920a.m34244l());
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C8895b.class), AbstractC8920a.m34230J(C8895b.f29484r));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C4690d0.class), AbstractC8920a.m34251s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C4686b0.class), AbstractC8920a.m34250r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C4696g0.class), AbstractC8920a.m34252t());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C4719z.class), AbstractC8920a.m34249q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C9479b.class), AbstractC8920a.m34232L(C9479b.f32211s));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            mapM20761c.put(AbstractC1052o0.m3807b(C8904k.class), AbstractC8920a.m34231K(C8904k.f29505s));
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        return AbstractC5107t0.m20760b(mapM20761c);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC8647b m37852j(Object obj, InterfaceC8647b... interfaceC8647bArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC8647bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC8647bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = InterfaceC8647b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length));
            if (objInvoke instanceof InterfaceC8647b) {
                return (InterfaceC8647b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC8647b m37853k(Class cls, InterfaceC8647b... interfaceC8647bArr) {
        Object objM37843a = m37843a(cls, "Companion");
        if (objM37843a == null) {
            return null;
        }
        return m37852j(objM37843a, (InterfaceC8647b[]) Arrays.copyOf(interfaceC8647bArr, interfaceC8647bArr.length));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m37854l(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return AbstractC9886a.m38367b(interfaceC2549c).isInterface();
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m37855m(Class cls) {
        return cls.getAnnotation(InterfaceC8660n.class) == null && cls.getAnnotation(InterfaceC8650d.class) == null;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m37856n(Class cls) {
        if (cls.getAnnotation(InterfaceC8650d.class) != null) {
            return true;
        }
        InterfaceC8660n interfaceC8660n = (InterfaceC8660n) cls.getAnnotation(InterfaceC8660n.class);
        return interfaceC8660n != null && AbstractC1061t.m3842c(AbstractC1052o0.m3807b(interfaceC8660n.with()), AbstractC1052o0.m3807b(C8653g.class));
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m37857o(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        return AbstractC9886a.m38367b(interfaceC2549c).isArray();
    }

    /* JADX INFO: renamed from: p */
    public static final Void m37858p(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        AbstractC9689e2.m37883f(interfaceC2549c);
        throw new C4699i();
    }

    /* JADX INFO: renamed from: q */
    public static final Object[] m37859q(ArrayList arrayList, InterfaceC2549c interfaceC2549c) {
        arrayList.getClass();
        interfaceC2549c.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC9886a.m38367b(interfaceC2549c), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }
}
