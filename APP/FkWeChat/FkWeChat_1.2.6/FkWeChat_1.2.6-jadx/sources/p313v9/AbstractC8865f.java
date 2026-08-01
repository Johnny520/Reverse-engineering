package p313v9;

import ae.C0307f;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0174b;
import p010a9.InterfaceC0175c;
import p010a9.InterfaceC0176d;
import p010a9.InterfaceC0177e;
import p010a9.InterfaceC0178f;
import p010a9.InterfaceC0179g;
import p010a9.InterfaceC0180h;
import p010a9.InterfaceC0181i;
import p010a9.InterfaceC0182j;
import p010a9.InterfaceC0183k;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0185m;
import p010a9.InterfaceC0186n;
import p010a9.InterfaceC0187o;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p010a9.InterfaceC0190r;
import p010a9.InterfaceC0191s;
import p010a9.InterfaceC0192t;
import p010a9.InterfaceC0193u;
import p010a9.InterfaceC0194v;
import p010a9.InterfaceC0195w;
import p024b9.AbstractC1052o0;
import p098g9.InterfaceC2549c;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p299ub.AbstractC8611a0;
import p372z8.AbstractC9886a;
import sb.AbstractC7291q;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: v9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8865f {

    /* JADX INFO: renamed from: a */
    public static final List f29431a;

    /* JADX INFO: renamed from: b */
    public static final Map f29432b;

    /* JADX INFO: renamed from: c */
    public static final Map f29433c;

    /* JADX INFO: renamed from: d */
    public static final Map f29434d;

    static {
        int i10 = 0;
        List<InterfaceC2549c> listM20803r = AbstractC5114x.m20803r(AbstractC1052o0.m3807b(Boolean.TYPE), AbstractC1052o0.m3807b(Byte.TYPE), AbstractC1052o0.m3807b(Character.TYPE), AbstractC1052o0.m3807b(Double.TYPE), AbstractC1052o0.m3807b(Float.TYPE), AbstractC1052o0.m3807b(Integer.TYPE), AbstractC1052o0.m3807b(Long.TYPE), AbstractC1052o0.m3807b(Short.TYPE));
        f29431a = listM20803r;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20803r, 10));
        for (InterfaceC2549c interfaceC2549c : listM20803r) {
            arrayList.add(AbstractC4717x.m18815a(AbstractC9886a.m38368c(interfaceC2549c), AbstractC9886a.m38369d(interfaceC2549c)));
        }
        f29432b = AbstractC5109u0.m20778s(arrayList);
        List<InterfaceC2549c> list = f29431a;
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(list, 10));
        for (InterfaceC2549c interfaceC2549c2 : list) {
            arrayList2.add(AbstractC4717x.m18815a(AbstractC9886a.m38369d(interfaceC2549c2), AbstractC9886a.m38368c(interfaceC2549c2)));
        }
        f29433c = AbstractC5109u0.m20778s(arrayList2);
        List listM20803r2 = AbstractC5114x.m20803r(InterfaceC0173a.class, InterfaceC0184l.class, InterfaceC0188p.class, InterfaceC0189q.class, InterfaceC0190r.class, InterfaceC0191s.class, InterfaceC0192t.class, InterfaceC0193u.class, InterfaceC0194v.class, InterfaceC0195w.class, InterfaceC0174b.class, InterfaceC0175c.class, InterfaceC0176d.class, InterfaceC0177e.class, InterfaceC0178f.class, InterfaceC0179g.class, InterfaceC0180h.class, InterfaceC0181i.class, InterfaceC0182j.class, InterfaceC0183k.class, InterfaceC0185m.class, InterfaceC0186n.class, InterfaceC0187o.class);
        ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(listM20803r2, 10));
        for (Object obj : listM20803r2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            arrayList3.add(AbstractC4717x.m18815a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f29434d = AbstractC5109u0.m20778s(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static final ParameterizedType m34025a(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC7282h m34026b(ParameterizedType parameterizedType) {
        parameterizedType.getClass();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return AbstractC5106t.m20694M(actualTypeArguments);
    }

    /* JADX INFO: renamed from: e */
    public static final C5691b m34029e(Class cls) {
        C5691b c5691bM34029e;
        cls.getClass();
        if (cls.isPrimitive()) {
            C0307f.m923a("Can't compute ClassId for primitive type: ", cls);
            return null;
        }
        if (cls.isArray()) {
            C0307f.m923a("Can't compute ClassId for array type: ", cls);
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C5692c c5692c = new C5692c(cls.getName());
            return new C5691b(c5692c.m22997d(), C5692c.f17898c.m23003a(c5692c.m22999f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null && (c5691bM34029e = m34029e(declaringClass)) != null) {
            C5695f c5695fM23027j = C5695f.m23027j(cls.getSimpleName());
            c5695fM23027j.getClass();
            C5691b c5691bM22984d = c5691bM34029e.m22984d(c5695fM23027j);
            if (c5691bM22984d != null) {
                return c5691bM22984d;
            }
        }
        return C5691b.f17894d.m22993c(new C5692c(cls.getName()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static final String m34030f(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return AbstractC8611a0.m33068M(cls.getName(), '.', '/', false, 4, null);
            }
            return "L" + AbstractC8611a0.m33068M(cls.getName(), '.', '/', false, 4, null) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        C0307f.m923a("Unsupported primitive type: ", cls);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final Integer m34031g(Class cls) {
        cls.getClass();
        return (Integer) f29434d.get(cls);
    }

    /* JADX INFO: renamed from: h */
    public static final List m34032h(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return AbstractC5114x.m20800o();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC7294t.m28908P(AbstractC7294t.m28896D(AbstractC7291q.m28888p(type, C8861d.f29427q), C8863e.f29429q));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return AbstractC5106t.m20713V0(actualTypeArguments);
    }

    /* JADX INFO: renamed from: i */
    public static final Class m34033i(Class cls) {
        cls.getClass();
        return (Class) f29432b.get(cls);
    }

    /* JADX INFO: renamed from: j */
    public static final ClassLoader m34034j(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    /* JADX INFO: renamed from: k */
    public static final Class m34035k(Class cls) {
        cls.getClass();
        return (Class) f29433c.get(cls);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m34036l(Class cls) {
        cls.getClass();
        return Enum.class.isAssignableFrom(cls);
    }
}
