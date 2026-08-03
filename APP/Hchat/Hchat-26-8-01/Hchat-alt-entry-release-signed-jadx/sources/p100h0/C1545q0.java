package p100h0;

import af.C0081d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import ke.C2399h;
import p012ah.C0086a;
import p069f.C0952p;
import p077f8.AbstractC1089i;
import p089g1.C1275d;
import p119i2.C1939m0;
import p125i8.C2002f;
import p134j6.AbstractC2070h;
import p134j6.C2076n;
import p134j6.InterfaceC2077o;
import p165l6.AbstractC2512c;
import p190n2.C2884s;
import p194n6.C2901a;
import p227p4.C3315t;
import p267s1.AbstractC3913s;
import p267s1.C3916v;
import p321w.EnumC4602h0;

/* JADX INFO: renamed from: h0.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1545q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5151a;

    /* JADX INFO: renamed from: b */
    public boolean f5152b;

    /* JADX INFO: renamed from: c */
    public Object f5153c;

    /* JADX INFO: renamed from: d */
    public final Object f5154d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1545q0(HashMap map, boolean z9, ArrayList arrayList) {
        this.f5151a = 2;
        this.f5153c = map;
        this.f5152b = z9;
        this.f5154d = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m4040b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m4041a(long j3) {
        Object obj;
        List list = (List) ((C3315t) this.f5154d).f10677h;
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i9);
            if (AbstractC3913s.m8112e(((C3916v) obj).f12854a, j3)) {
                break;
            }
            i9++;
        }
        C3916v c3916v = (C3916v) obj;
        if (c3916v != null) {
            return c3916v.f12861h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC2077o m4042c(C2901a c2901a, boolean z9) {
        final String str;
        InterfaceC2077o c2399h;
        final Type type = c2901a.f9369b;
        Class cls = c2901a.f9368a;
        HashMap map = (HashMap) this.f5153c;
        C2002f c2002f = null;
        if (map.get(type) != null) {
            C0086a.m445d();
            return null;
        }
        if (map.get(cls) != null) {
            C0086a.m445d();
            return null;
        }
        final int i9 = 0;
        final int i10 = 1;
        InterfaceC2077o interfaceC2077o = EnumSet.class.isAssignableFrom(cls) ? new InterfaceC2077o() { // from class: j6.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p134j6.InterfaceC2077o
            /* JADX INFO: renamed from: d */
            public final Object mo4937d() {
                switch (i10) {
                    case 0:
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return new EnumMap((Class) type3);
                            }
                            C2002f.m4936b(type2, "Invalid EnumMap type: ");
                        } else {
                            C2002f.m4936b(type2, "Invalid EnumMap type: ");
                        }
                        return null;
                    default:
                        Type type4 = type;
                        if (type4 instanceof ParameterizedType) {
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return EnumSet.noneOf((Class) type5);
                            }
                            C2002f.m4936b(type4, "Invalid EnumSet type: ");
                        } else {
                            C2002f.m4936b(type4, "Invalid EnumSet type: ");
                        }
                        return null;
                }
            }
        } : cls == EnumMap.class ? new InterfaceC2077o() { // from class: j6.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p134j6.InterfaceC2077o
            /* JADX INFO: renamed from: d */
            public final Object mo4937d() {
                switch (i9) {
                    case 0:
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return new EnumMap((Class) type3);
                            }
                            C2002f.m4936b(type2, "Invalid EnumMap type: ");
                        } else {
                            C2002f.m4936b(type2, "Invalid EnumMap type: ");
                        }
                        return null;
                    default:
                        Type type4 = type;
                        if (type4 instanceof ParameterizedType) {
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return EnumSet.noneOf((Class) type5);
                            }
                            C2002f.m4936b(type4, "Invalid EnumSet type: ");
                        } else {
                            C2002f.m4936b(type4, "Invalid EnumSet type: ");
                        }
                        return null;
                }
            }
        } : null;
        if (interfaceC2077o != null) {
            return interfaceC2077o;
        }
        AbstractC2070h.m5126d((ArrayList) this.f5154d);
        int i11 = 17;
        if (Modifier.isAbstract(cls.getModifiers())) {
            c2399h = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC1089i abstractC1089i = AbstractC2512c.f8137a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e6) {
                    str = "Failed making constructor '" + AbstractC2512c.m5900b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e6.getMessage() + AbstractC2512c.m5903e(e6);
                }
                c2399h = str != null ? new InterfaceC2077o() { // from class: j6.b
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p134j6.InterfaceC2077o
                    /* JADX INFO: renamed from: d */
                    public final Object mo4937d() {
                        switch (i9) {
                            case 0:
                                throw new C0081d(str);
                            case 1:
                                throw new C0081d(str);
                            case 2:
                                throw new C0081d(str);
                            default:
                                throw new C0081d(str);
                        }
                    }
                } : new C2399h(declaredConstructor, i11);
            } catch (NoSuchMethodException unused) {
                c2399h = null;
            }
        }
        if (c2399h != null) {
            return c2399h;
        }
        int i12 = 18;
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                c2002f = new C2002f(22);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                c2002f = new C2002f(23);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                c2002f = new C2002f(24);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                c2002f = new C2002f(25);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(C2076n.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length != 0 && AbstractC2070h.m5128f(actualTypeArguments[0]) == String.class) {
                    }
                }
                c2002f = new C2002f(i11);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                c2002f = new C2002f(i12);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                c2002f = new C2002f(19);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                c2002f = new C2002f(20);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c2002f = new C2002f(21);
            }
        }
        if (c2002f != null) {
            return c2002f;
        }
        final String strM4040b = m4040b(cls);
        if (strM4040b != null) {
            return new InterfaceC2077o() { // from class: j6.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p134j6.InterfaceC2077o
                /* JADX INFO: renamed from: d */
                public final Object mo4937d() {
                    switch (i10) {
                        case 0:
                            throw new C0081d(strM4040b);
                        case 1:
                            throw new C0081d(strM4040b);
                        case 2:
                            throw new C0081d(strM4040b);
                        default:
                            throw new C0081d(strM4040b);
                    }
                }
            };
        }
        if (!z9) {
            final String str2 = "Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.";
            final int i13 = 2;
            return new InterfaceC2077o() { // from class: j6.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p134j6.InterfaceC2077o
                /* JADX INFO: renamed from: d */
                public final Object mo4937d() {
                    switch (i13) {
                        case 0:
                            throw new C0081d(str2);
                        case 1:
                            throw new C0081d(str2);
                        case 2:
                            throw new C0081d(str2);
                        default:
                            throw new C0081d(str2);
                    }
                }
            };
        }
        if (this.f5152b) {
            return new C2399h(cls, i12);
        }
        final String strConcat = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            strConcat = strConcat.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        final int i14 = 3;
        return new InterfaceC2077o() { // from class: j6.b
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p134j6.InterfaceC2077o
            /* JADX INFO: renamed from: d */
            public final Object mo4937d() {
                switch (i14) {
                    case 0:
                        throw new C0081d(strConcat);
                    case 1:
                        throw new C0081d(strConcat);
                    case 2:
                        throw new C0081d(strConcat);
                    default:
                        throw new C0081d(strConcat);
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public EnumC1521h m4043d() {
        C1548s c1548s = (C1548s) this.f5154d;
        int i9 = c1548s.f5161b;
        int i10 = c1548s.f5162c;
        return i9 < i10 ? EnumC1521h.f5081h : i9 > i10 ? EnumC1521h.f5080g : EnumC1521h.f5082i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m4044e() {
        if (this.f5152b) {
            C1511d1.m4016b((C1511d1) this.f5154d, (C1939m0) this.f5153c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public long m4045f(C2884s c2884s, long j3, boolean z9, C1275d c1275d) {
        C1511d1 c1511d1 = (C1511d1) this.f5154d;
        long jM4017c = C1511d1.m4017c(c1511d1, c2884s, j3, z9, false, c1275d, false, null);
        if (!C1939m0.m4811a((C1939m0) this.f5153c, jM4017c)) {
            this.f5152b = false;
        }
        c1511d1.m4031q(C1939m0.m4813c(jM4017c) ? EnumC4602h0.f15182i : EnumC4602h0.f15181h);
        return jM4017c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f5151a) {
            case 0:
                return "SingleSelectionLayout(isStartHandle=" + this.f5152b + ", crossed=" + m4043d() + ", info=\n\t" + ((C1548s) this.f5154d) + ')';
            case 1:
            default:
                return super.toString();
            case 2:
                return ((HashMap) this.f5153c).toString();
        }
    }

    public C1545q0(C0952p c0952p, C3315t c3315t) {
        this.f5151a = 3;
        this.f5153c = c0952p;
        this.f5154d = c3315t;
    }

    public C1545q0(boolean z9, C1554v c1554v, C1548s c1548s) {
        this.f5151a = 0;
        this.f5152b = z9;
        this.f5153c = c1554v;
        this.f5154d = c1548s;
    }

    public C1545q0(C1511d1 c1511d1) {
        this.f5151a = 1;
        this.f5154d = c1511d1;
        this.f5152b = true;
    }
}
