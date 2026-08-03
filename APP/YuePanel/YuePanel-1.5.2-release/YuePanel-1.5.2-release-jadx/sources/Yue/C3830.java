package Yue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class C3830 implements InterfaceC5585<Object>, InterfaceC3827 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0266 f7239 = new C0266(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final Map<Class<? extends InterfaceC5139<?>>, Integer> f7240;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final HashMap<String, String> f7241;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final HashMap<String, String> f7242;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final HashMap<String, String> f7243;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final Map<String, String> f7244;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<?> f7245;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۧۢ$ۥ */
    @InterfaceC7507({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class C0266 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۤۧۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0266(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final String m882(@InterfaceC6399 Class<?> cls) {
            String str;
            C5499.m17103(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) C3830.f7243.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C3830.f7243.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String m883(@InterfaceC6399 Class<?> cls) {
            String strM24159;
            String str;
            C5499.m17103(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    C5499.m17102(simpleName, "name");
                    strM24159 = C7628.m24159(simpleName, enclosingMethod.getName() + C8039.f23873, null, 2, null);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    C5499.m17102(simpleName, "name");
                    return C7628.m24158(simpleName, C8039.f23873, null, 2, null);
                }
                C5499.m17102(simpleName, "name");
                return C7628.m24159(simpleName, enclosingConstructor.getName() + C8039.f23873, null, 2, null);
            }
            if (!cls.isArray()) {
                String str3 = (String) C3830.f7244.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            strM24159 = "Array";
            if (componentType.isPrimitive() && (str = (String) C3830.f7244.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            if (str2 != null) {
                return str2;
            }
            return strM24159;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m10604(@InterfaceC6489 Object obj, @InterfaceC6399 Class<?> cls) {
            C5499.m17103(cls, "jClass");
            Map map = C3830.f7240;
            C5499.m17101(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return C8012.m25276(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C5564.m17349(C5564.m17351(cls));
            }
            return cls.isInstance(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0266() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        List listM10742 = C3880.m10742(InterfaceC5122.class, InterfaceC5124.class, InterfaceC5138.class, InterfaceC5140.class, InterfaceC5141.class, InterfaceC5142.class, InterfaceC5143.class, InterfaceC5144.class, InterfaceC5145.class, InterfaceC5146.class, InterfaceC5123.class, InterfaceC5125.class, InterfaceC5126.class, InterfaceC5127.class, InterfaceC5128.class, InterfaceC5129.class, InterfaceC5130.class, InterfaceC5131.class, InterfaceC5132.class, InterfaceC5133.class, InterfaceC5135.class, InterfaceC5136.class, InterfaceC5137.class);
        ArrayList arrayList = new ArrayList(C3881.m10756(listM10742, 10));
        int i = 0;
        for (Object obj : listM10742) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            arrayList.add(C8003.m4014((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f7240 = C5943.m18640(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f7241 = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f7242 = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        C5499.m17102(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C5499.m17102(str, "kotlinName");
            sb.append(C7628.m24162(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, null, 2, null));
            sb.append("CompanionObject");
            C6599 c6599M4014 = C8003.m4014(sb.toString(), str + ".Companion");
            map3.put(c6599M4014.m20938(), c6599M4014.m20939());
        }
        for (Map.Entry<Class<? extends InterfaceC5139<?>>, Integer> entry : f7240.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f7243 = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5942.m18568(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C7628.m24162((String) entry2.getValue(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, null, 2, null));
        }
        f7244 = linkedHashMap;
    }

    public C3830(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "jClass");
        this.f7245 = cls;
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ void m10580() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ void m10581() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ void m10582() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ void m10583() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ void m10584() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m10585() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m10586() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ void m10587() {
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ void m10588() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ void m10589() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m10590() {
    }

    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m10591() {
    }

    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m10592() {
    }

    @Override // Yue.InterfaceC5585
    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C3830) && C5499.m17094(C5564.m17349(this), C5564.m17349((InterfaceC5585) obj));
    }

    @Override // Yue.InterfaceC5583
    @InterfaceC6399
    public List<Annotation> getAnnotations() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6399
    public Collection<InterfaceC5590<Object>> getConstructors() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6489
    public String getSimpleName() {
        return f7239.m883(mo10566());
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6399
    public List<InterfaceC5611> getTypeParameters() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6489
    public EnumC5614 getVisibility() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    public int hashCode() {
        return C5564.m17349(this).hashCode();
    }

    @Override // Yue.InterfaceC5585
    public boolean isAbstract() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    public boolean isData() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    public boolean isFinal() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC7470(version = "1.1")
    public boolean isInstance(@InterfaceC6489 Object obj) {
        return f7239.m10604(obj, mo10566());
    }

    @Override // Yue.InterfaceC5585
    public boolean isOpen() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    public boolean isSealed() {
        m10603();
        throw new C5667();
    }

    @InterfaceC6399
    public String toString() {
        return mo10566().toString() + C7071.f2662;
    }

    @Override // Yue.InterfaceC5585, Yue.InterfaceC5589
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Collection<InterfaceC5584<?>> mo10593() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String mo10594() {
        return f7239.m882(mo10566());
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Collection<InterfaceC5585<?>> mo10595() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo10596() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public List<InterfaceC5585<? extends Object>> mo10597() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo10598() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC3827
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Class<?> mo10566() {
        return this.f7245;
    }

    @Override // Yue.InterfaceC5585
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean mo10599() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public List<InterfaceC5609> mo10600() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Object mo10601() {
        m10603();
        throw new C5667();
    }

    @Override // Yue.InterfaceC5585
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean mo10602() {
        m10603();
        throw new C5667();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Void m10603() {
        throw new C5670();
    }
}
