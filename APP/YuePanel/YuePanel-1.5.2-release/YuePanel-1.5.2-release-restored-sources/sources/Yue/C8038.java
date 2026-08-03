package Yue;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class C8038 {

    /* JADX INFO: renamed from: Yue.ۥۢۢۥ۟$ۥ */
    public /* synthetic */ class C1412 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f3210;

        static {
            int[] iArr = new int[EnumC5613.values().length];
            try {
                iArr[EnumC5613.f13573.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5613.f13572.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5613.f13574.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3210 = iArr;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۥ۟$ۥ۟ */
    public /* synthetic */ class C1413 extends C5153 implements InterfaceC5124<Class<?>, Class<?>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1413 f23872 = new C1413();

        public C1413() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Class<?> invoke(@InterfaceC6399 Class<?> cls) {
            C5499.m17103(cls, "p0");
            return cls.getComponentType();
        }
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Type m25413(InterfaceC5609 interfaceC5609, boolean z) {
        InterfaceC5588 interfaceC5588Mo17390 = interfaceC5609.mo17390();
        if (interfaceC5588Mo17390 instanceof InterfaceC5611) {
            return new C8018((InterfaceC5611) interfaceC5588Mo17390);
        }
        if (!(interfaceC5588Mo17390 instanceof InterfaceC5585)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC5609);
        }
        InterfaceC5585 interfaceC5585 = (InterfaceC5585) interfaceC5588Mo17390;
        Class clsM17349 = z ? C5564.m17349(interfaceC5585) : C5564.m17346(interfaceC5585);
        List<C5612> listMo17389 = interfaceC5609.mo17389();
        if (listMo17389.isEmpty()) {
            return clsM17349;
        }
        if (!clsM17349.isArray()) {
            return m25415(clsM17349, listMo17389);
        }
        if (clsM17349.getComponentType().isPrimitive()) {
            return clsM17349;
        }
        C5612 c5612 = (C5612) C3888.m11025(listMo17389);
        if (c5612 == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC5609);
        }
        EnumC5613 enumC5613M2319 = c5612.m2319();
        InterfaceC5609 interfaceC5609M2320 = c5612.m2320();
        int i = enumC5613M2319 == null ? -1 : C1412.f3210[enumC5613M2319.ordinal()];
        if (i == -1 || i == 1) {
            return clsM17349;
        }
        if (i != 2 && i != 3) {
            throw new C6380();
        }
        C5499.m17100(interfaceC5609M2320);
        Type typeM25414 = m25414(interfaceC5609M2320, false, 1, null);
        return typeM25414 instanceof Class ? clsM17349 : new C5156(typeM25414);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Type m25414(InterfaceC5609 interfaceC5609, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m25413(interfaceC5609, z);
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Type m25415(Class<?> cls, List<C5612> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m25417((C5612) it.next()));
            }
            return new C6604(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C3881.m10756(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m25417((C5612) it2.next()));
            }
            return new C6604(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeM25415 = m25415(declaringClass, list.subList(length, list.size()));
        List<C5612> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C3881.m10756(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m25417((C5612) it3.next()));
        }
        return new C6604(cls, typeM25415, arrayList3);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Type m25416(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
        Type typeM17391;
        C5499.m17103(interfaceC5609, "<this>");
        return (!(interfaceC5609 instanceof InterfaceC5610) || (typeM17391 = ((InterfaceC5610) interfaceC5609).m17391()) == null) ? m25414(interfaceC5609, false, 1, null) : typeM17391;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Type m25417(C5612 c5612) {
        EnumC5613 enumC5613M17400 = c5612.m17400();
        if (enumC5613M17400 == null) {
            return C8433.f25283.m4416();
        }
        InterfaceC5609 interfaceC5609M17399 = c5612.m17399();
        C5499.m17100(interfaceC5609M17399);
        int i = C1412.f3210[enumC5613M17400.ordinal()];
        if (i == 1) {
            return new C8433(null, m25413(interfaceC5609M17399, true));
        }
        if (i == 2) {
            return m25413(interfaceC5609M17399, true);
        }
        if (i == 3) {
            return new C8433(m25413(interfaceC5609M17399, true), null);
        }
        throw new C6380();
    }

    @InterfaceC5890
    @InterfaceC7470(version = "1.4")
    @InterfaceC4772
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m25418(InterfaceC5609 interfaceC5609) {
    }

    @InterfaceC4772
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m25419(C5612 c5612) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String m25420(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            InterfaceC7326 interfaceC7326M22878 = C7332.m22878(type, C1413.f23872);
            name = ((Class) C7342.m22980(interfaceC7326M22878)).getName() + C7627.m23994(C5385.f13236, C7342.m22929(interfaceC7326M22878));
        } else {
            name = cls.getName();
        }
        C5499.m17102(name, "{\n        if (type.isArr…   } else type.name\n    }");
        return name;
    }
}
