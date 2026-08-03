package p000a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0021B1;
import p000a.C0186K3;
import p000a.C0518ca;
import p000a.C0582fh;
import p000a.C0816s4;
import p000a.C0901wd;
import top.mmjz.floatingclouds.bean.MaskItemBean;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.s4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816s4 implements IPlugin {

    /* JADX INFO: renamed from: F */
    public static volatile boolean f3217F;

    /* JADX INFO: renamed from: G */
    public static volatile boolean f3218G;

    /* JADX INFO: renamed from: H */
    public static volatile boolean f3219H;

    /* JADX INFO: renamed from: I */
    public static C0816s4 f3220I;

    /* JADX INFO: renamed from: J */
    public static volatile boolean f3221J;

    /* JADX INFO: renamed from: K */
    public static volatile long f3222K;

    /* JADX INFO: renamed from: L */
    public static volatile long f3223L;

    /* JADX INFO: renamed from: M */
    public static volatile C0664k4 f3224M;

    /* JADX INFO: renamed from: N */
    public static volatile Method f3225N;

    /* JADX INFO: renamed from: O */
    public static volatile Field f3226O;

    /* JADX INFO: renamed from: P */
    public static volatile Field f3227P;

    /* JADX INFO: renamed from: Q */
    public static volatile Method f3228Q;

    /* JADX INFO: renamed from: A */
    public final C0643j2 f3229A;

    /* JADX INFO: renamed from: B */
    public final ConcurrentLinkedQueue<String> f3230B;

    /* JADX INFO: renamed from: C */
    public final C0233Me f3231C;

    /* JADX INFO: renamed from: D */
    public boolean f3232D;

    /* JADX INFO: renamed from: E */
    public final ConcurrentHashMap<String, Field> f3233E;

    /* JADX INFO: renamed from: a */
    public volatile Class<?> f3234a;

    /* JADX INFO: renamed from: b */
    public volatile Class<?> f3235b;

    /* JADX INFO: renamed from: c */
    public volatile Class<?> f3236c;

    /* JADX INFO: renamed from: d */
    public volatile List<String> f3237d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f3238e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final Handler f3239f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public RunnableC0645j4 f3240g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f3241h;

    /* JADX INFO: renamed from: i */
    public View f3242i;

    /* JADX INFO: renamed from: j */
    public WeakReference<ListView> f3243j;

    /* JADX INFO: renamed from: k */
    public ClassLoader f3244k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList<XposedInterface.HookHandle> f3245l;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap<Object, int[]> f3246m;

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap<Object, Boolean> f3247n;

    /* JADX INFO: renamed from: o */
    public final ConcurrentHashMap<Object, Integer> f3248o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentHashMap<Object, Integer> f3249p;

    /* JADX INFO: renamed from: q */
    public final ConcurrentHashMap<Object, Long> f3250q;

    /* JADX INFO: renamed from: r */
    public final ConcurrentHashMap<Object, Long> f3251r;

    /* JADX INFO: renamed from: s */
    public final ConcurrentHashMap<Object, String> f3252s;

    /* JADX INFO: renamed from: t */
    public final AtomicInteger f3253t;

    /* JADX INFO: renamed from: u */
    public final Set<Class<?>> f3254u;

    /* JADX INFO: renamed from: v */
    public final ThreadLocal<Boolean> f3255v;

    /* JADX INFO: renamed from: w */
    public final Map<Object, String> f3256w;

    /* JADX INFO: renamed from: x */
    public int f3257x;

    /* JADX INFO: renamed from: y */
    public int f3258y;

    /* JADX INFO: renamed from: z */
    public final ConcurrentHashMap<Class<?>, Boolean> f3259z;

    /* JADX INFO: renamed from: a.s4$a */
    public static final class a {

        /* JADX INFO: renamed from: a.s4$a$a, reason: collision with other inner class name */
        public static final class C1338a {

            /* JADX INFO: renamed from: a */
            public static final C1338a f3260a = new C1338a();

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: a.s4$a$a$a, reason: collision with other inner class name */
            public static final class EnumC1339a {

                /* JADX INFO: renamed from: a */
                public static final EnumC1339a f3261a;

                /* JADX INFO: renamed from: b */
                public static final EnumC1339a f3262b;

                /* JADX INFO: renamed from: c */
                public static final EnumC1339a f3263c;

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ EnumC1339a[] f3264d;

                static {
                    EnumC1339a enumC1339a = new EnumC1339a("HIDDEN", 0);
                    f3261a = enumC1339a;
                    EnumC1339a enumC1339a2 = new EnumC1339a("UNHIDDEN_USER", 1);
                    f3262b = enumC1339a2;
                    EnumC1339a enumC1339a3 = new EnumC1339a("UNHIDDEN_COMMAND", 2);
                    f3263c = enumC1339a3;
                    f3264d = new EnumC1339a[]{enumC1339a, enumC1339a2, enumC1339a3};
                }

                public EnumC1339a() {
                    throw null;
                }

                public static EnumC1339a valueOf(String str) {
                    return (EnumC1339a) Enum.valueOf(EnumC1339a.class, str);
                }

                public static EnumC1339a[] values() {
                    return (EnumC1339a[]) f3264d.clone();
                }
            }

            /* JADX INFO: renamed from: a */
            public static boolean m1918a(EnumC1339a enumC1339a) {
                C0518ca.b bVar;
                C0915x8 c0915x8 = C0915x8.f3530a;
                int iOrdinal = enumC1339a.ordinal();
                if (iOrdinal == 0) {
                    bVar = C0518ca.b.f1897a;
                } else if (iOrdinal == 1) {
                    bVar = C0518ca.b.f1898b;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0266Ob();
                    }
                    bVar = C0518ca.b.f1899c;
                }
                return C0915x8.f3531b == bVar;
            }

            public final String toString() {
                C0915x8 c0915x8 = C0915x8.f3530a;
                return C0915x8.f3531b.name();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: a.s4$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static final b f3265a;

            /* JADX INFO: renamed from: b */
            public static final b f3266b;

            /* JADX INFO: renamed from: c */
            public static final b f3267c;

            /* JADX INFO: renamed from: d */
            public static final /* synthetic */ b[] f3268d;

            static {
                b bVar = new b("NONE", 0);
                f3265a = bVar;
                b bVar2 = new b("USER_INTERACTION", 1);
                f3266b = bVar2;
                b bVar3 = new b("COMMAND", 2);
                f3267c = bVar3;
                f3268d = new b[]{bVar, bVar2, bVar3};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f3268d.clone();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m1916a() {
            C0816s4 c0816s4 = C0816s4.f3220I;
            if (c0816s4 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z = jCurrentTimeMillis - C0816s4.f3223L < 500;
                C0816s4.f3223L = jCurrentTimeMillis;
                if (!z) {
                    C1338a.EnumC1339a enumC1339a = C1338a.EnumC1339a.f3262b;
                    c0816s4.m1914y(false, enumC1339a, new C0664k4(c0816s4, 5));
                    c0816s4.m1915z(false, enumC1339a);
                }
                c0816s4.f3247n.clear();
                c0816s4.f3256w.clear();
                View view = c0816s4.f3242i;
                C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2231k("HideMainUI: onStateUnhideUser immediate refresh rootView=", view != null ? view.getClass().getSimpleName() : null)}, 1));
                View view2 = c0816s4.f3242i;
                if (view2 != null) {
                    try {
                        c0816s4.m1898d(view2);
                        C0413Wf c0413Wf = C0413Wf.f1577a;
                    } catch (Throwable th) {
                        C0920xd.m2206a(th);
                    }
                }
                C0816s4.m1894x();
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m1917b(C0816s4 c0816s4) {
            C0631i9.m1482e(c0816s4, "instance");
            C0915x8.f3530a.m2204b(C0518ca.c.f1904d);
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = jCurrentTimeMillis - C0816s4.f3222K < 500;
            C0816s4.f3222K = jCurrentTimeMillis;
            if (!z) {
                C1338a.EnumC1339a enumC1339a = C1338a.EnumC1339a.f3261a;
                c0816s4.m1915z(true, enumC1339a);
                c0816s4.m1914y(true, enumC1339a, new C0664k4(c0816s4, 4));
            }
            c0816s4.f3241h = true;
            C0816s4.m1894x();
            c0816s4.m1903k();
            View view = c0816s4.f3242i;
            if (view != null) {
                try {
                    c0816s4.m1897c(view);
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                } catch (Throwable th) {
                    C0920xd.m2206a(th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.s4$b */
    public static final class b extends IdentityHashMap<Object, String> {
        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj == null ? true : obj instanceof String) {
                return super.containsValue((String) obj);
            }
            return false;
        }

        @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            String str = (String) obj2;
            C0631i9.m1482e(obj, "key");
            C0631i9.m1482e(str, "value");
            if (super.size() >= 1024) {
                clear();
            }
            return (String) super.put(obj, str);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj2 == null ? true : obj2 instanceof String) {
                return super.remove(obj, (String) obj2);
            }
            return false;
        }
    }

    public C0816s4() {
        int i = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i;
        }
        int i2 = C0021B1.f64a;
        if (i2 != 2140 && ((2140 <= i2 && i2 < 2481) || i2 == 2589)) {
        }
        this.f3245l = new CopyOnWriteArrayList<>();
        this.f3246m = new ConcurrentHashMap<>();
        this.f3247n = new ConcurrentHashMap<>();
        this.f3248o = new ConcurrentHashMap<>();
        this.f3249p = new ConcurrentHashMap<>();
        this.f3250q = new ConcurrentHashMap<>();
        this.f3251r = new ConcurrentHashMap<>();
        this.f3252s = new ConcurrentHashMap<>();
        this.f3253t = new AtomicInteger();
        this.f3254u = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f3255v = new ThreadLocal<>();
        Map<Object, String> mapSynchronizedMap = Collections.synchronizedMap(new b());
        C0631i9.m1481d(mapSynchronizedMap, "synchronizedMap(...)");
        this.f3256w = mapSynchronizedMap;
        this.f3259z = new ConcurrentHashMap<>();
        this.f3229A = new C0643j2(1, this);
        this.f3230B = new ConcurrentLinkedQueue<>();
        this.f3231C = new C0233Me(new C0891w3(3));
        this.f3233E = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: A */
    public static final void m1889A(HashSet hashSet, Object obj, int i) {
        Method method;
        Object objM2206a;
        if (i > 2 || hashSet.contains(obj.getClass())) {
            return;
        }
        hashSet.add(obj.getClass());
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i2];
            if (C0631i9.m1478a(method.getName(), "k") && method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], Integer.TYPE) && C0631i9.m1478a(method.getParameterTypes()[1], String.class)) {
                break;
            } else {
                i2++;
            }
        }
        if (method != null) {
            C0889w1.m2144c(obj, method);
            String str = "DataSource captured via adapter probe: " + obj.getClass().getName() + ".k(int,String)";
            C0631i9.m1482e(str, "msg");
            C0908x1.m2194b("[ConvRV] ".concat(str));
            return;
        }
        if (i < 2) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                while (c0112g1M2122I.hasNext()) {
                    Field field = (Field) c0112g1M2122I.next();
                    if (!field.getType().isPrimitive() && !C0015Ae.m49H(field.getType().getName(), "android.", false) && !C0015Ae.m49H(field.getType().getName(), "java.", false) && !C0015Ae.m49H(field.getType().getName(), "kotlin.", false)) {
                        field.setAccessible(true);
                        try {
                            objM2206a = field.get(obj);
                        } catch (Throwable th) {
                            objM2206a = C0920xd.m2206a(th);
                        }
                        if (objM2206a instanceof C0901wd.a) {
                            objM2206a = null;
                        }
                        if (objM2206a == null) {
                            continue;
                        } else {
                            m1889A(hashSet, objM2206a, i + 1);
                            if (C0889w1.f3490r != null && C0889w1.f3491s != null) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m1890e(Object obj) {
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class) && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                Field field = (Field) c0112g1M2122I.next();
                if (!Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(obj);
                        if ((obj2 instanceof String) && C0943yh.m2221a((String) obj2)) {
                            return (String) obj2;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1891j(Class cls) {
        for (int i = 0; cls != null && !cls.equals(Object.class) && i < 5; i++) {
            C0112G1 c0112g1M2122I = C0889w1.m2122I(cls.getDeclaredFields());
            while (c0112g1M2122I.hasNext()) {
                if (C0631i9.m1478a(((Field) c0112g1M2122I.next()).getName(), "field_username")) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static Class m1892v(ClassLoader classLoader) {
        Object objM2206a;
        try {
            List listM2162u = C0889w1.m2162u(C0739o3.m1757d0("I", "Ljava/lang/String;"));
            ArrayList<C0144Hf> arrayList = new ArrayList();
            for (Object obj : listM2162u) {
                if (C0015Ae.m49H((String) ((C0144Hf) obj).f500a, "com.tencent.mm.ui.conversation", false)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                loop1: for (C0144Hf c0144Hf : arrayList) {
                    String str = (String) c0144Hf.f500a;
                    String str2 = (String) c0144Hf.f501b;
                    Class clsM13b = C0002A1.m13b(classLoader, str);
                    if (clsM13b != null) {
                        Method[] declaredMethods = clsM13b.getDeclaredMethods();
                        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                        for (Method method : declaredMethods) {
                            if (method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], Integer.TYPE) && C0631i9.m1478a(method.getParameterTypes()[1], String.class) && C0631i9.m1478a(method.getReturnType(), Void.TYPE)) {
                                String str3 = "hookConvEventFilter: DataSource located via DexKit: " + str + "." + str2;
                                C0631i9.m1482e(str3, "msg");
                                C0908x1.m2194b("[ConvRV] " + str3);
                                objM2206a = clsM13b;
                                break loop1;
                            }
                        }
                    }
                }
            } else {
                String str4 = "resolveDataSourceViaDexKit: no (int,String) event method in conversation pkg (hits=" + listM2162u.size() + ")";
                C0631i9.m1482e(str4, "msg");
                C0908x1.m2194b("[ConvRV] " + str4);
            }
            objM2206a = null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        return (Class) (objM2206a instanceof C0901wd.a ? null : objM2206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1 = "resolveSnapshotClassViaDexKit: candidate " + r2;
        p000a.C0631i9.m1482e(r1, "msg");
        p000a.C0908x1.m2194b("[ConvRV] " + r1);
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m1893w(ClassLoader classLoader) {
        Object objM2206a;
        try {
            Iterator it = C0889w1.m2165x(null, "void", C0889w1.m2124K("java.util.List"), "notifyDataSetChanged", 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    objM2206a = null;
                    break;
                }
                String str = ((C0690lb) it.next()).m1551b().f2126a;
                if (C0015Ae.m49H(str, "com.tencent.mm.ui", false) && !C0015Ae.m49H(str, "com.tencent.mm.ui.contact", false) && !C0015Ae.m49H(str, "com.tencent.mm.ui.banner", false) && !C0015Ae.m49H(str, "com.tencent.mm.ui.tools", false) && !C0015Ae.m49H(str, "com.tencent.mm.ui.chatting", false) && (objM2206a = C0002A1.m13b(classLoader, str)) != null) {
                    break;
                }
            }
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        return (Class) (objM2206a instanceof C0901wd.a ? null : objM2206a);
    }

    /* JADX INFO: renamed from: x */
    public static void m1894x() {
        C0611h8 c0611h8 = C0611h8.f2258l;
        if (c0611h8 != null) {
            c0611h8.m1464j();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x002a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0157 A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #3 {all -> 0x0136, blocks: (B:105:0x0120, B:108:0x012b, B:110:0x0133, B:115:0x013b, B:125:0x0153, B:127:0x0157, B:118:0x0142, B:121:0x014a), top: B:149:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x001d, TryCatch #7 {all -> 0x001d, blocks: (B:7:0x0012, B:9:0x001a, B:14:0x0022, B:19:0x002c, B:21:0x0034, B:24:0x003a), top: B:157:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.wd$a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1895a(Object obj) {
        ?? M2206a;
        Object objM2206a;
        Object objM2206a2;
        Object objM2206a3;
        String str;
        Object objM2206a4;
        String str2 = this.f3256w.get(obj);
        if (str2 != null) {
            return str2;
        }
        if (this.f3244k == null) {
            try {
                Object objM19h = C0002A1.m19h(obj, "field_username");
                String str3 = objM19h instanceof String ? (String) objM19h : null;
                if (str3 == null) {
                    Object objM18g = C0002A1.m18g(obj);
                    M2206a = objM18g instanceof String ? (String) objM18g : 0;
                    if (M2206a != 0) {
                        if (C0034Be.m101P(M2206a)) {
                            M2206a = 0;
                        }
                    }
                } else {
                    M2206a = !C0034Be.m101P(str3) ? str3 : 0;
                    if (M2206a == 0) {
                    }
                }
            } catch (Throwable th) {
                M2206a = C0920xd.m2206a(th);
            }
            String str4 = (String) (M2206a instanceof C0901wd.a ? 0 : M2206a);
            if (str4 != null) {
                this.f3256w.put(obj, str4);
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
            return str4;
        }
        if (f3225N == null) {
            try {
                f3225N = TextView.class.getDeclaredMethod("setText", CharSequence.class);
                Method method = f3225N;
                if (method != null) {
                    method.setAccessible(true);
                }
                for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    try {
                        f3226O = superclass.getDeclaredField("field_username");
                        Field field = f3226O;
                        if (field == null) {
                            break;
                        }
                        field.setAccessible(true);
                        break;
                    } catch (NoSuchFieldException unused) {
                    }
                }
                for (Class<?> superclass2 = obj.getClass(); superclass2 != null; superclass2 = superclass2.getSuperclass()) {
                    try {
                        f3227P = superclass2.getDeclaredField("field_content");
                        Field field2 = f3227P;
                        if (field2 == null) {
                            break;
                        }
                        field2.setAccessible(true);
                        break;
                    } catch (NoSuchFieldException unused2) {
                    }
                }
                f3228Q = obj.getClass().getMethod("getItem", Integer.TYPE);
                Method method2 = f3228Q;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (Exception unused3) {
            }
        }
        try {
            Field field3 = f3226O;
            if (field3 != null) {
                try {
                    Object obj2 = field3.get(obj);
                    objM2206a4 = obj2 instanceof String ? (String) obj2 : null;
                } catch (Throwable th2) {
                    objM2206a4 = C0920xd.m2206a(th2);
                }
                boolean z = objM2206a4 instanceof C0901wd.a;
                Object obj3 = objM2206a4;
                if (z) {
                    obj3 = null;
                }
                String str5 = (String) obj3;
                if (str5 != null) {
                    boolean zM101P = C0034Be.m101P(str5);
                    objM2206a = str5;
                    if (zM101P) {
                        objM2206a = null;
                    }
                }
            }
        } catch (Throwable th3) {
            objM2206a = C0920xd.m2206a(th3);
        }
        boolean z2 = objM2206a instanceof C0901wd.a;
        Object obj4 = objM2206a;
        if (z2) {
            obj4 = null;
        }
        String str6 = (String) obj4;
        try {
            Object objM18g2 = C0002A1.m18g(obj);
            objM2206a2 = objM18g2 instanceof String ? (String) objM18g2 : null;
        } catch (Throwable th4) {
            objM2206a2 = C0920xd.m2206a(th4);
        }
        boolean z3 = objM2206a2 instanceof C0901wd.a;
        Object obj5 = objM2206a2;
        if (z3) {
            obj5 = null;
        }
        String str7 = (String) obj5;
        if (str7 == null || C0034Be.m101P(str7)) {
            str7 = null;
        }
        if (str6 == null) {
            if (str7 == null) {
                try {
                    Object objM19h2 = C0002A1.m19h(obj, "d");
                    if (objM19h2 == null) {
                        objM2206a3 = null;
                    } else {
                        Object objM19h3 = C0002A1.m19h(objM19h2, "field_username");
                        String str8 = objM19h3 instanceof String ? (String) objM19h3 : null;
                        if (str8 == null || !C0943yh.m2221a(str8)) {
                            String strM1890e = m1890e(objM19h2);
                            str = strM1890e;
                            if (strM1890e == null) {
                                if (str8 == null || C0034Be.m101P(str8)) {
                                    str = null;
                                }
                            }
                            objM2206a3 = str;
                            if (!this.f3232D) {
                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] extractChat: item=" + obj.getClass().getSimpleName() + " cachedFieldUser=" + str6 + " origin=" + str7 + " l4.field=" + str8 + " final=" + str}, 1));
                                objM2206a3 = str;
                            }
                        }
                        str = str8;
                        objM2206a3 = str;
                        if (!this.f3232D) {
                        }
                    }
                } catch (Throwable th5) {
                    objM2206a3 = C0920xd.m2206a(th5);
                }
                str6 = (String) (objM2206a3 instanceof C0901wd.a ? null : objM2206a3);
            } else {
                str6 = str7;
            }
        }
        if (!this.f3232D) {
            this.f3232D = true;
        }
        if (str6 != null) {
            this.f3256w.put(obj, str6);
        }
        return str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe A[RETURN] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1896b(XposedInterface.Chain chain) {
        boolean zIsEmpty;
        long j;
        Object objM2206a;
        Method method;
        int i;
        int i2;
        String str;
        Object objM2206a2;
        if (this.f3238e.get()) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] filterGetCount blocked by isInBackAnimation=true"}, 1));
        }
        C0186K3.f638a.getClass();
        C0653jc c0653jcM508i = C0186K3.a.m508i();
        if (!c0653jcM508i.f2444n || !C0186K3.a.m511l()) {
            return chain.proceed();
        }
        Boolean bool = C0186K3.f649l;
        if (bool != null) {
            zIsEmpty = bool.booleanValue();
        } else {
            zIsEmpty = C0186K3.a.m505f().isEmpty();
            C0186K3.f649l = Boolean.valueOf(zIsEmpty);
        }
        if (zIsEmpty) {
            return chain.proceed();
        }
        Boolean bool2 = this.f3255v.get();
        Boolean bool3 = Boolean.TRUE;
        if (!C0631i9.m1478a(bool2, bool3)) {
            C0915x8 c0915x8 = C0915x8.f3530a;
            if (!C0915x8.m2203a()) {
                Object thisObject = chain.getThisObject();
                if (thisObject != null && m1900g(thisObject, c0653jcM508i) != 0) {
                    Object objProceed = chain.proceed();
                    Integer num = objProceed instanceof Integer ? (Integer) objProceed : null;
                    if (num == null) {
                        return null;
                    }
                    int iIntValue = num.intValue();
                    Integer num2 = this.f3248o.get(thisObject);
                    Integer num3 = this.f3249p.get(thisObject);
                    int i3 = 0;
                    if (!C0631i9.m1478a(this.f3247n.get(thisObject), bool3) && num2 != null && num3 != null && num3.intValue() == iIntValue && (str = this.f3252s.get(thisObject)) != null) {
                        Method method2 = f3228Q;
                        if (method2 != null) {
                            try {
                                objM2206a2 = method2.invoke(thisObject, 0);
                            } catch (Throwable th) {
                                objM2206a2 = C0920xd.m2206a(th);
                            }
                            if (objM2206a2 instanceof C0901wd.a) {
                                objM2206a2 = null;
                            }
                            if (str.equals(objM2206a2 == null ? m1895a(objM2206a2) : null)) {
                                return num2;
                            }
                        } else {
                            try {
                                objM2206a2 = C0002A1.m12a(thisObject, "getItem", 0);
                            } catch (Throwable th2) {
                                objM2206a2 = C0920xd.m2206a(th2);
                            }
                            if (objM2206a2 instanceof C0901wd.a) {
                            }
                            if (str.equals(objM2206a2 == null ? m1895a(objM2206a2) : null)) {
                            }
                        }
                    }
                    if (iIntValue <= 0) {
                        this.f3246m.put(thisObject, new int[0]);
                        this.f3248o.put(thisObject, 0);
                        this.f3247n.put(thisObject, Boolean.FALSE);
                        return 0;
                    }
                    this.f3255v.set(Boolean.TRUE);
                    try {
                        long jNanoTime = System.nanoTime();
                        int[] iArr = new int[iIntValue];
                        Method method3 = f3228Q;
                        C0186K3.f638a.getClass();
                        ArrayList arrayListM505f = C0186K3.a.m505f();
                        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
                        Iterator it = arrayListM505f.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MaskItemBean) it.next()).getMaskId());
                        }
                        HashSet hashSet = new HashSet(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int i4 = 0;
                        int i5 = 0;
                        int i6 = 0;
                        String str2 = null;
                        while (i4 < iIntValue) {
                            if (method3 != null) {
                                try {
                                    objM2206a = method3.invoke(thisObject, Integer.valueOf(i4));
                                } catch (Throwable th3) {
                                    objM2206a = C0920xd.m2206a(th3);
                                }
                                if (objM2206a instanceof C0901wd.a) {
                                    objM2206a = null;
                                }
                            } else {
                                try {
                                    objM2206a = C0002A1.m12a(thisObject, "getItem", Integer.valueOf(i4));
                                } catch (Throwable th4) {
                                    objM2206a = C0920xd.m2206a(th4);
                                }
                                if (objM2206a instanceof C0901wd.a) {
                                    objM2206a = null;
                                }
                            }
                            if (objM2206a != null) {
                                String strM1895a = m1895a(objM2206a);
                                if (strM1895a == null) {
                                    i3++;
                                }
                                if (i4 == 0) {
                                    str2 = strM1895a;
                                }
                                if (strM1895a == null || !hashSet.contains(strM1895a)) {
                                    method = method3;
                                    int i7 = i6;
                                    i6 = i7 + 1;
                                    iArr[i7] = i4;
                                    i = i5;
                                    if (i < 5 && strM1895a != null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(i4);
                                        i2 = i4;
                                        sb.append(":");
                                        sb.append(strM1895a);
                                        arrayList3.add(sb.toString());
                                        i++;
                                    }
                                    i4 = i2 + 1;
                                    i5 = i;
                                    method3 = method;
                                } else {
                                    method = method3;
                                    if (arrayList2.size() < 10) {
                                        arrayList2.add(strM1895a);
                                    }
                                    i = i5;
                                }
                            } else {
                                method = method3;
                                i = i5;
                            }
                            i2 = i4;
                            i4 = i2 + 1;
                            i5 = i;
                            method3 = method;
                        }
                        int i8 = i6;
                        if (i3 > 0) {
                            int i9 = (i3 * 100) / iIntValue;
                            if (i9 >= 50) {
                                String name = thisObject.getClass().getName();
                                StringBuilder sb2 = new StringBuilder();
                                j = jNanoTime;
                                sb2.append("⚠️ LEAK-RISK: wxid 提取失败率 ");
                                sb2.append(i9);
                                sb2.append("% (");
                                sb2.append(i3);
                                sb2.append("/");
                                sb2.append(iIntValue);
                                sb2.append(") adapter=");
                                sb2.append(name);
                                sb2.append(" — 密友可能全部可见，请检查解析链/微信版本！");
                                C0889w1.m2152k(sb2.toString());
                                if (this.f3253t.incrementAndGet() >= 3) {
                                    C0889w1.m2152k("🚨 LEAK-ALERT: 连续 3 次扫描提取失败率≥50%，解析链可能已失效，密友会话可能全部泄露！");
                                    this.f3253t.set(0);
                                }
                            } else {
                                j = jNanoTime;
                                C0908x1.m2197e(Arrays.copyOf(new Object[]{"[DIAG-FILTER] wxid 提取失败 " + i3 + "/" + iIntValue + " (" + i9 + "%)"}, 1));
                                this.f3253t.set(0);
                            }
                        } else {
                            j = jNanoTime;
                            this.f3253t.set(0);
                        }
                        ConcurrentHashMap<Object, String> concurrentHashMap = this.f3252s;
                        if (str2 == null) {
                            str2 = "";
                        }
                        concurrentHashMap.put(thisObject, str2);
                        long jNanoTime2 = (System.nanoTime() - j) / ((long) 1000);
                        int i10 = iIntValue - i8;
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-FILTER] adapter=" + thisObject.getClass().getName() + " total=" + iIntValue + " vis=" + i8 + " filtered=" + i10 + " masks=" + hashSet.size() + " " + jNanoTime2 + "μs"}, 1));
                        if (!arrayList2.isEmpty()) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-FILTER] matched (hidden): " + C0834t3.m1952p0(arrayList2, ",", null, 62)}, 1));
                        }
                        if (!arrayList3.isEmpty()) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-FILTER] unmatched sample: " + C0834t3.m1952p0(arrayList3, ",", null, 62)}, 1));
                        }
                        if (i10 > 0) {
                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-FILTER] maskSet items: " + C0834t3.m1952p0(C0834t3.m1955s0(10, hashSet), ",", null, 62)}, 1));
                        }
                        this.f3246m.put(thisObject, iArr);
                        this.f3248o.put(thisObject, Integer.valueOf(i8));
                        this.f3249p.put(thisObject, num);
                        ConcurrentHashMap<Object, Boolean> concurrentHashMap2 = this.f3247n;
                        Boolean bool4 = Boolean.FALSE;
                        concurrentHashMap2.put(thisObject, bool4);
                        this.f3251r.put(thisObject, Long.valueOf(System.currentTimeMillis()));
                        Integer numValueOf = Integer.valueOf(i8);
                        this.f3255v.set(bool4);
                        return numValueOf;
                    } catch (Throwable th5) {
                        this.f3255v.set(Boolean.FALSE);
                        throw th5;
                    }
                }
                return chain.proceed();
            }
        }
        return chain.proceed();
    }

    /* JADX INFO: renamed from: c */
    public final void m1897c(View view) {
        if (view instanceof ListView) {
            this.f3243j = new WeakReference<>(view);
            m1912t(((ListView) view).getAdapter());
            return;
        }
        if (C0034Be.m94I(view.getClass().getName(), "RecyclerView", false)) {
            m1913u(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C0631i9.m1481d(childAt, "getChildAt(...)");
                m1897c(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1898d(View view) {
        if (view instanceof ListView) {
            m1912t(((ListView) view).getAdapter());
            return;
        }
        if (C0034Be.m94I(view.getClass().getName(), "RecyclerView", false)) {
            m1913u(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C0631i9.m1481d(childAt, "getChildAt(...)");
                m1898d(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1899f() {
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f3230B;
        for (String strPoll = concurrentLinkedQueue.poll(); strPoll != null; strPoll = concurrentLinkedQueue.poll()) {
            boolean zM1413b = C0569f4.m1413b(strPoll, true);
            C0122Gb.f389a.getClass();
            ((Handler) C0122Gb.f400l.m625a()).post(new RunnableC0104Fb(strPoll, true));
            String str = "MSG-REHIDE flush: talker=" + strPoll + " ok=" + zM1413b;
            C0631i9.m1482e(str, "msg");
            C0908x1.m2194b("[ConvRV] ".concat(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m1900g(Object obj, C0653jc c0653jc) {
        if (!C0015Ae.m49H(obj.getClass().getName(), "com.tencent.mm.ui.contact", false)) {
            if (this.f3246m.containsKey(obj)) {
                return c0653jc.f2444n ? 1 : 0;
            }
            if (m1911s(obj)) {
                return c0653jc.f2444n ? 1 : 0;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m1901h(C0173J8 c0173j8) {
        Object objM2206a;
        Class clsM13b;
        ClassLoader classLoader;
        Method method;
        Object objM2206a2;
        Method method2;
        int i = -1;
        if (C0021B1.f64a == -1) {
            try {
                Context context = C0889w1.f3488p;
                C0631i9.m1479b(context);
                i = context.getPackageManager().getPackageInfo("com.tencent.mm", 0).versionCode;
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{e}, 1));
            }
            C0021B1.f64a = i;
        }
        if (C0021B1.f64a >= 2560) {
            C0889w1.m2117C("hookRecyclerView entered");
            try {
                clsM13b = C0002A1.m13b(c0173j8.f608a, "androidx.recyclerview.widget.RecyclerView");
                classLoader = c0173j8.f608a;
                if (clsM13b == null) {
                    clsM13b = C0002A1.m13b(classLoader, "android.support.v7.widget.RecyclerView");
                }
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            if (clsM13b == null) {
                C0889w1.m2117C("RecyclerView class not found");
            } else {
                Method[] methods = clsM13b.getMethods();
                C0631i9.m1481d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i2];
                    if (C0631i9.m1478a(method.getName(), "setAdapter") && method.getParameterTypes().length == 1) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (method == null) {
                    C0908x1.m2194b("[ConvRV] RecyclerView.setAdapter method not found");
                } else {
                    C0889w1.m2117C("hooked RecyclerView.setAdapter (param=" + method.getParameterTypes()[0].getName() + ")");
                    m1910r(c0173j8, method, "RecyclerView");
                    try {
                        Class clsM13b2 = C0002A1.m13b(classLoader, "com.tencent.mm.view.recyclerview.WxRecyclerView");
                        if (clsM13b2 != null) {
                            Method[] methods2 = clsM13b2.getMethods();
                            C0631i9.m1481d(methods2, "getMethods(...)");
                            int length2 = methods2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    method2 = null;
                                    break;
                                }
                                method2 = methods2[i3];
                                if (C0631i9.m1478a(method2.getName(), "setAdapter") && method2.getParameterTypes().length == 1) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (method2 == null || C0631i9.m1478a(method2.getDeclaringClass(), clsM13b)) {
                                C0908x1.m2194b("[ConvRV] WxRecyclerView: no override or class not found, parent hook sufficient");
                            } else {
                                m1910r(c0173j8, method2, "WxRecyclerView");
                                String str = "hooked WxRecyclerView.setAdapter (override in " + method2.getDeclaringClass().getName() + ")";
                                C0631i9.m1482e(str, "msg");
                                C0908x1.m2194b("[ConvRV] " + str);
                            }
                        } else {
                            C0889w1.m2117C("WxRecyclerView class not found");
                        }
                        objM2206a2 = C0413Wf.f1577a;
                    } catch (Throwable th2) {
                        objM2206a2 = C0920xd.m2206a(th2);
                    }
                    Throwable thM2189a = C0901wd.m2189a(objM2206a2);
                    if (thM2189a != null) {
                        String str2 = "WxRecyclerView hook failed: " + thM2189a.getMessage();
                        C0631i9.m1482e(str2, "msg");
                        C0908x1.m2194b("[ConvRV] " + str2);
                    }
                    objM2206a = new C0901wd(objM2206a2);
                }
                Throwable thM2189a2 = C0901wd.m2189a(objM2206a);
                if (thM2189a2 != null) {
                    String str3 = "hookRecyclerView FAILED: " + thM2189a2.getMessage();
                    C0631i9.m1482e(str3, "msg");
                    C0908x1.m2194b("[ConvRV] ".concat(str3));
                }
            }
        }
        m1909q(c0173j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3  */
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(final C0173J8 c0173j8) {
        Object objM2206a;
        Object objM2206a2;
        Object objM2206a3;
        Object objM2206a4;
        Object objM2206a5;
        Object objM2206a6;
        Object objM2206a7;
        Object objM2206a8;
        Object objM2206a9;
        Object objM2206a10;
        Object objM2206a11;
        Object objM2206a12;
        Object objM2206a13;
        Class<?> clsM1893w;
        Method methodM15d;
        Object objM2206a14;
        Object objM2206a15;
        String str;
        final int i = 2;
        final int i2 = 3;
        final int i3 = 0;
        final int i4 = 1;
        C0631i9.m1482e(c0173j8, "session");
        f3220I = this;
        this.f3244k = c0173j8.f608a;
        f3224M = new C0664k4(this, i2);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("=== HideMainUIListPluginPart handleHook START, wxVer=", C0021B1.a.m54a(), " ===")}, 1));
        C0578fd c0578fd = new C0578fd(C0021B1.a.m55b(), c0173j8.f608a);
        C0616hd.f2278a.getClass();
        C0597gd c0597gdM1467a = C0616hd.m1467a("conv_list_classes", c0578fd);
        this.f3234a = c0597gdM1467a.f2209b;
        this.f3235b = c0597gdM1467a.m1426a("dataSourceClass");
        this.f3236c = c0597gdM1467a.m1426a("snapshotClass");
        Map<String, Object> map = c0597gdM1467a.f2214g;
        Object obj = map != null ? map.get("adapterNames") : null;
        this.f3237d = obj instanceof List ? (List) obj : null;
        EnumC0521cd enumC0521cd = c0597gdM1467a.f2211d;
        Class<?> cls = this.f3234a;
        String name = cls != null ? cls.getName() : null;
        Class<?> cls2 = this.f3235b;
        String name2 = cls2 != null ? cls2.getName() : null;
        Class<?> cls3 = this.f3236c;
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] conv_list_classes via=" + enumC0521cd + " adapter=" + name + " ds=" + name2 + " snapshot=" + (cls3 != null ? cls3.getName() : null)}, 1));
        try {
            final Class clsM13b = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.LauncherUI");
            Iterator it = (clsM13b != null ? C0739o3.m1757d0(clsM13b.getName(), "android.app.Activity") : C0889w1.m2124K("android.app.Activity")).iterator();
            while (true) {
                if (!it.hasNext()) {
                    C0908x1.m2193a("[DIAG] onKeyDown hook failed on all candidates");
                    break;
                }
                String str2 = (String) it.next();
                C0631i9.m1479b(str2);
                if (C0173J8.m463a(c0173j8, str2, "onKeyDown", new Class[]{Integer.TYPE, KeyEvent.class}, new InterfaceC0064D7() { // from class: a.r4
                    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo53f(Object obj2) {
                        C0376Ue c0376Ue;
                        C0816s4.a.b bVar;
                        Window window;
                        ListView listView;
                        C0376Ue c0376Ue2;
                        int i5 = 2;
                        int i6 = 0;
                        int i7 = 1;
                        switch (i3) {
                            case 0:
                                Class cls4 = clsM13b;
                                C0816s4 c0816s4 = this;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                Object thisObject = chain.getThisObject();
                                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                Object obj3 = chain.getArgs().get(0);
                                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                                if ((number != null ? number.intValue() : 0) == 4 && activity != null && cls4 != null && cls4.isInstance(activity)) {
                                    C0915x8 c0915x8 = C0915x8.f3530a;
                                    if (C0915x8.m2203a()) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2422N) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onKeyDown BACK in LauncherUI: rehiding (rehideOnLeaveChat)"}, 1));
                                            c0915x8.m2204b(C0518ca.c.f1905e);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s4.m1915z(true, enumC1339a);
                                            c0816s4.m1914y(true, enumC1339a, new C0664k4(c0816s4, i6));
                                            C0816s4.f3217F = false;
                                            c0816s4.f3241h = true;
                                            C0816s4.m1894x();
                                            c0816s4.m1903k();
                                            View view = c0816s4.f3242i;
                                            if (view != null) {
                                                try {
                                                    c0816s4.m1897c(view);
                                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                                } catch (Throwable th) {
                                                    C0920xd.m2206a(th);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return chain.proceed();
                            case 1:
                                Class cls5 = clsM13b;
                                final C0816s4 c0816s42 = this;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                Object objProceed = chain2.proceed();
                                if (cls5 == null || cls5.isInstance(chain2.getThisObject())) {
                                    Object thisObject2 = chain2.getThisObject();
                                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                    if (activity2 != null) {
                                        new WeakReference(activity2);
                                        C0698m0.f2635a.getClass();
                                        C0698m0.m1589b(activity2);
                                        C0816s4.f3217F = false;
                                        RunnableC0645j4 runnableC0645j4 = c0816s42.f3240g;
                                        if (runnableC0645j4 != null) {
                                            c0816s42.f3239f.removeCallbacks(runnableC0645j4);
                                        }
                                        c0816s42.f3240g = null;
                                        C0816s4.f3218G = false;
                                        C0816s4.f3219H = false;
                                        View decorView = activity2.getWindow().getDecorView();
                                        C0631i9.m1481d(decorView, "getDecorView(...)");
                                        c0816s42.f3242i = decorView;
                                        C0186K3.f638a.getClass();
                                        boolean zM511l = C0186K3.a.m511l();
                                        boolean z = C0186K3.a.m508i().f2444n;
                                        boolean z2 = C0186K3.a.m508i().f2447q;
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] DEBUG onResume: masterEnabled=" + zM511l + " hideMainConvList=" + z + " hideConversation=" + z2 + " masks=" + C0186K3.a.m505f().size()}, 1));
                                        C0915x8 c0915x82 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            ((Handler) c0816s42.f3231C.m625a()).post(new RunnableC0721n4(z2));
                                        }
                                        if (c0816s42.f3241h) {
                                            c0816s42.m1897c(decorView);
                                            c0816s42.f3241h = false;
                                        }
                                        C0653jc c0653jcM508i = C0186K3.a.m508i();
                                        if (C0186K3.a.m511l() && ((c0653jcM508i.f2451u || c0653jcM508i.f2454x) && (c0376Ue = C0376Ue.f1410t) != null)) {
                                            c0376Ue.m1003a(activity2, decorView);
                                        }
                                        if (c0816s42.f3238e.get()) {
                                            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: a.i4
                                                @Override // android.os.MessageQueue.IdleHandler
                                                public final boolean queueIdle() {
                                                    c0816s42.f3238e.set(false);
                                                    C0816s4.f3217F = false;
                                                    return false;
                                                }
                                            });
                                            decorView.postDelayed(new RunnableC0645j4(c0816s42, i6), 500L);
                                        }
                                    }
                                }
                                return objProceed;
                            case 2:
                                Class cls6 = clsM13b;
                                C0816s4 c0816s43 = this;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                Object objProceed2 = chain3.proceed();
                                if (cls6 == null || cls6.isInstance(chain3.getThisObject())) {
                                    C0915x8 c0915x83 = C0915x8.f3530a;
                                    boolean zM2203a = C0915x8.m2203a();
                                    int iOrdinal = C0915x8.f3531b.ordinal();
                                    if (iOrdinal == 0) {
                                        bVar = C0816s4.a.b.f3265a;
                                    } else if (iOrdinal == 1) {
                                        bVar = C0816s4.a.b.f3266b;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new C0266Ob();
                                        }
                                        bVar = C0816s4.a.b.f3267c;
                                    }
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] onPause fired, tempUnhideMainConv=" + zM2203a + " source=" + bVar}, 1));
                                    c0816s43.f3238e.set(true);
                                    C0816s4.f3217F = false;
                                    if (zM2203a && C0915x8.f3531b == C0518ca.b.f1898b) {
                                        RunnableC0645j4 runnableC0645j42 = c0816s43.f3240g;
                                        Handler handler = c0816s43.f3239f;
                                        if (runnableC0645j42 != null) {
                                            handler.removeCallbacks(runnableC0645j42);
                                        }
                                        RunnableC0645j4 runnableC0645j43 = new RunnableC0645j4(c0816s43, i7);
                                        c0816s43.f3240g = runnableC0645j43;
                                        handler.postDelayed(runnableC0645j43, 500L);
                                    }
                                    C0376Ue c0376Ue3 = C0376Ue.f1410t;
                                    if (c0376Ue3 != null) {
                                        c0376Ue3.f1416f = 0;
                                        c0376Ue3.f1417g = 0L;
                                        c0376Ue3.f1411a = null;
                                        c0376Ue3.f1418h = false;
                                        c0376Ue3.f1422l.removeCallbacks(c0376Ue3.f1423m);
                                        c0376Ue3.f1419i = false;
                                        c0376Ue3.f1415e = false;
                                        c0376Ue3.f1429s = 0;
                                        c0376Ue3.f1412b = null;
                                        WeakReference<Activity> weakReference = c0376Ue3.f1413c;
                                        Activity activity3 = weakReference != null ? weakReference.get() : null;
                                        Window.Callback callback = (activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getCallback();
                                        if (callback instanceof WindowCallbackC0941yf) {
                                            activity3.getWindow().setCallback(((WindowCallbackC0941yf) callback).f3552a);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: TouchInterceptingCallback restored"}, 1));
                                        }
                                        c0376Ue3.f1413c = null;
                                        c0376Ue3.f1427q = false;
                                        c0376Ue3.f1426p.removeCallbacks(c0376Ue3.f1428r);
                                    }
                                    c0816s43.f3242i = null;
                                }
                                return objProceed2;
                            case 3:
                                Class cls7 = clsM13b;
                                C0816s4 c0816s44 = this;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                Object objProceed3 = chain4.proceed();
                                Object thisObject3 = chain4.getThisObject();
                                Activity activity4 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                if (activity4 != null && (cls7 == null || activity4.getClass().getName().equals(cls7.getName()))) {
                                    Object obj4 = chain4.getArgs().get(0);
                                    C0631i9.m1480c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    C0186K3.f638a.getClass();
                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                    if (!zBooleanValue) {
                                        C0915x8 c0915x84 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            if (zBooleanValue) {
                                                C0915x8 c0915x85 = C0915x8.f3530a;
                                                if (!C0915x8.m2203a()) {
                                                    try {
                                                        C0653jc c0653jcM508i3 = C0186K3.a.m508i();
                                                        if (C0186K3.a.m511l() && ((c0653jcM508i3.f2451u || c0653jcM508i3.f2454x) && (c0376Ue2 = C0376Ue.f1410t) != null)) {
                                                            View decorView2 = activity4.getWindow().getDecorView();
                                                            C0631i9.m1481d(decorView2, "getDecorView(...)");
                                                            c0376Ue2.m1003a(activity4, decorView2);
                                                        }
                                                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                    } catch (Throwable th2) {
                                                        C0920xd.m2206a(th2);
                                                    }
                                                    C0186K3.f638a.getClass();
                                                    if (C0186K3.a.m511l() && !C0186K3.a.m505f().isEmpty() && C0186K3.a.m508i().f2444n) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"window focus gained, refreshing ListView"}, 1));
                                                        if (c0816s44.f3242i != null) {
                                                            try {
                                                                WeakReference<ListView> weakReference2 = c0816s44.f3243j;
                                                                if (weakReference2 != null && (listView = weakReference2.get()) != null) {
                                                                    if (listView.getWindowToken() != null) {
                                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                                        Long l = c0816s44.f3251r.get(listView.getAdapter());
                                                                        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 500) {
                                                                            c0816s44.m1912t(listView.getAdapter());
                                                                        }
                                                                    } else {
                                                                        c0816s44.f3243j = null;
                                                                    }
                                                                    C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                                                }
                                                            } catch (Throwable th3) {
                                                                C0920xd.m2206a(th3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        } else if (C0816s4.f3218G || C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] focus lost while whitelisted page open, skip rehideOnLeaveApp (profile=" + C0816s4.f3218G + " chatInfo=" + C0816s4.f3219H + ")"}, 1));
                                        } else if (c0653jcM508i2.f2423O && C0915x8.f3531b != C0518ca.b.f1899c) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"rehideOnLeaveApp: focus lost, rehiding (state=" + C0915x8.f3531b + ")"}, 1));
                                            c0915x84.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a2 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s44.m1915z(true, enumC1339a2);
                                            c0816s44.m1914y(true, enumC1339a2, new C0664k4(c0816s44, i7));
                                            C0816s4.f3217F = false;
                                            c0816s44.f3241h = true;
                                            c0816s44.f3238e.set(false);
                                            View view2 = c0816s44.f3242i;
                                            if (view2 != null) {
                                                c0816s44.m1897c(view2);
                                                c0816s44.m1903k();
                                            }
                                            c0816s44.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed3;
                            default:
                                Class cls8 = clsM13b;
                                C0816s4 c0816s45 = this;
                                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain5, "chain");
                                Object objProceed4 = chain5.proceed();
                                if (cls8 == null || cls8.isInstance(chain5.getThisObject())) {
                                    C0915x8 c0915x86 = C0915x8.f3530a;
                                    if (C0915x8.m2203a() && C0915x8.f3531b == C0518ca.b.f1899c) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2423O && !C0816s4.f3218G && !C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onStop: COMMAND source rehide (HOME key)"}, 1));
                                            c0915x86.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a3 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s45.m1915z(true, enumC1339a3);
                                            c0816s45.m1914y(true, enumC1339a3, new C0664k4(c0816s45, i5));
                                            C0816s4.f3217F = false;
                                            c0816s45.f3241h = true;
                                            c0816s45.f3238e.set(false);
                                            View view3 = c0816s45.f3242i;
                                            if (view3 != null) {
                                                c0816s45.m1897c(view3);
                                                c0816s45.m1903k();
                                            }
                                            c0816s45.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed4;
                        }
                    }
                }) != null) {
                    C0908x1.m2194b("[DIAG] onKeyDown hooked on " + str2);
                    break;
                }
            }
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a("onKeyDown hook fail", thM2189a);
        }
        C0186K3.f638a.getClass();
        boolean zIsEmpty = C0186K3.a.m505f().isEmpty();
        C0186K3.a.m508i();
        C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.LauncherUI");
        try {
            m1909q(c0173j8);
            objM2206a2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a2 = C0920xd.m2206a(th2);
        }
        Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
        if (thM2189a2 != null) {
            C0908x1.m2193a("hook ListView.setAdapter fail", thM2189a2);
        }
        try {
            m1901h(c0173j8);
            objM2206a3 = C0413Wf.f1577a;
        } catch (Throwable th3) {
            objM2206a3 = C0920xd.m2206a(th3);
        }
        Throwable thM2189a3 = C0901wd.m2189a(objM2206a3);
        if (thM2189a3 != null) {
            C0908x1.m2193a("hide mainUI listview fail, try to old function.", thM2189a3);
            int iM55b = C0021B1.a.m55b();
            if (iM55b == 2140) {
                str = "com.tencent.mm.ui.conversation.k";
            } else if (2300 > iM55b || iM55b >= 2341) {
                str = iM55b == 2360 ? "com.tencent.mm.ui.conversation.r" : (2360 > iM55b || iM55b >= 2442) ? iM55b == 2560 ? "com.tencent.mm.ui.conversation.p3" : iM55b == 2701 ? "com.tencent.mm.ui.conversation.q3" : null : "com.tencent.mm.ui.conversation.x";
            } else if (!C0021B1.a.m56c().equals("8.0.35")) {
                str = "com.tencent.mm.ui.conversation.p";
            }
            if (str == null) {
                C0173J8.m463a(c0173j8, "android.widget.ListView", "setAdapter", new Class[]{ListAdapter.class}, new C0588g4(this, c0173j8, i3));
            } else {
                ClassLoader classLoader = c0173j8.f608a;
                Class<?> clsM13b2 = classLoader == null ? null : C0002A1.m13b(classLoader, str);
                if (clsM13b2 != null) {
                    m1908p(c0173j8, clsM13b2);
                }
            }
        }
        try {
            objM2206a4 = C0413Wf.f1577a;
        } catch (Throwable th4) {
            objM2206a4 = C0920xd.m2206a(th4);
        }
        Throwable thM2189a4 = C0901wd.m2189a(objM2206a4);
        if (thM2189a4 != null) {
            C0908x1.m2193a(Arrays.copyOf(new Object[]{"hookConvDataSource fail", thM2189a4}, 2));
        }
        final Class clsM13b3 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.LauncherUI");
        C0908x1.m2194b("[DIAG-T2-1] LauncherUI class lookup: ".concat(clsM13b3 != null ? clsM13b3.getName() : "NULL"));
        try {
            Iterator it2 = (clsM13b3 != null ? C0739o3.m1757d0(clsM13b3.getName(), "android.app.Activity") : C0889w1.m2124K("android.app.Activity")).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    C0908x1.m2193a("[DIAG-T2-1] onResume hook failed on all candidates");
                    break;
                }
                String str3 = (String) it2.next();
                C0631i9.m1479b(str3);
                if (C0173J8.m463a(c0173j8, str3, "onResume", new Class[0], new InterfaceC0064D7() { // from class: a.r4
                    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo53f(Object obj2) {
                        C0376Ue c0376Ue;
                        C0816s4.a.b bVar;
                        Window window;
                        ListView listView;
                        C0376Ue c0376Ue2;
                        int i5 = 2;
                        int i6 = 0;
                        int i7 = 1;
                        switch (i4) {
                            case 0:
                                Class cls4 = clsM13b3;
                                C0816s4 c0816s4 = this;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                Object thisObject = chain.getThisObject();
                                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                Object obj3 = chain.getArgs().get(0);
                                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                                if ((number != null ? number.intValue() : 0) == 4 && activity != null && cls4 != null && cls4.isInstance(activity)) {
                                    C0915x8 c0915x8 = C0915x8.f3530a;
                                    if (C0915x8.m2203a()) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2422N) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onKeyDown BACK in LauncherUI: rehiding (rehideOnLeaveChat)"}, 1));
                                            c0915x8.m2204b(C0518ca.c.f1905e);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s4.m1915z(true, enumC1339a);
                                            c0816s4.m1914y(true, enumC1339a, new C0664k4(c0816s4, i6));
                                            C0816s4.f3217F = false;
                                            c0816s4.f3241h = true;
                                            C0816s4.m1894x();
                                            c0816s4.m1903k();
                                            View view = c0816s4.f3242i;
                                            if (view != null) {
                                                try {
                                                    c0816s4.m1897c(view);
                                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                                } catch (Throwable th5) {
                                                    C0920xd.m2206a(th5);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return chain.proceed();
                            case 1:
                                Class cls5 = clsM13b3;
                                final C0816s4 c0816s42 = this;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                Object objProceed = chain2.proceed();
                                if (cls5 == null || cls5.isInstance(chain2.getThisObject())) {
                                    Object thisObject2 = chain2.getThisObject();
                                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                    if (activity2 != null) {
                                        new WeakReference(activity2);
                                        C0698m0.f2635a.getClass();
                                        C0698m0.m1589b(activity2);
                                        C0816s4.f3217F = false;
                                        RunnableC0645j4 runnableC0645j4 = c0816s42.f3240g;
                                        if (runnableC0645j4 != null) {
                                            c0816s42.f3239f.removeCallbacks(runnableC0645j4);
                                        }
                                        c0816s42.f3240g = null;
                                        C0816s4.f3218G = false;
                                        C0816s4.f3219H = false;
                                        View decorView = activity2.getWindow().getDecorView();
                                        C0631i9.m1481d(decorView, "getDecorView(...)");
                                        c0816s42.f3242i = decorView;
                                        C0186K3.f638a.getClass();
                                        boolean zM511l = C0186K3.a.m511l();
                                        boolean z = C0186K3.a.m508i().f2444n;
                                        boolean z2 = C0186K3.a.m508i().f2447q;
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] DEBUG onResume: masterEnabled=" + zM511l + " hideMainConvList=" + z + " hideConversation=" + z2 + " masks=" + C0186K3.a.m505f().size()}, 1));
                                        C0915x8 c0915x82 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            ((Handler) c0816s42.f3231C.m625a()).post(new RunnableC0721n4(z2));
                                        }
                                        if (c0816s42.f3241h) {
                                            c0816s42.m1897c(decorView);
                                            c0816s42.f3241h = false;
                                        }
                                        C0653jc c0653jcM508i = C0186K3.a.m508i();
                                        if (C0186K3.a.m511l() && ((c0653jcM508i.f2451u || c0653jcM508i.f2454x) && (c0376Ue = C0376Ue.f1410t) != null)) {
                                            c0376Ue.m1003a(activity2, decorView);
                                        }
                                        if (c0816s42.f3238e.get()) {
                                            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: a.i4
                                                @Override // android.os.MessageQueue.IdleHandler
                                                public final boolean queueIdle() {
                                                    c0816s42.f3238e.set(false);
                                                    C0816s4.f3217F = false;
                                                    return false;
                                                }
                                            });
                                            decorView.postDelayed(new RunnableC0645j4(c0816s42, i6), 500L);
                                        }
                                    }
                                }
                                return objProceed;
                            case 2:
                                Class cls6 = clsM13b3;
                                C0816s4 c0816s43 = this;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                Object objProceed2 = chain3.proceed();
                                if (cls6 == null || cls6.isInstance(chain3.getThisObject())) {
                                    C0915x8 c0915x83 = C0915x8.f3530a;
                                    boolean zM2203a = C0915x8.m2203a();
                                    int iOrdinal = C0915x8.f3531b.ordinal();
                                    if (iOrdinal == 0) {
                                        bVar = C0816s4.a.b.f3265a;
                                    } else if (iOrdinal == 1) {
                                        bVar = C0816s4.a.b.f3266b;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new C0266Ob();
                                        }
                                        bVar = C0816s4.a.b.f3267c;
                                    }
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] onPause fired, tempUnhideMainConv=" + zM2203a + " source=" + bVar}, 1));
                                    c0816s43.f3238e.set(true);
                                    C0816s4.f3217F = false;
                                    if (zM2203a && C0915x8.f3531b == C0518ca.b.f1898b) {
                                        RunnableC0645j4 runnableC0645j42 = c0816s43.f3240g;
                                        Handler handler = c0816s43.f3239f;
                                        if (runnableC0645j42 != null) {
                                            handler.removeCallbacks(runnableC0645j42);
                                        }
                                        RunnableC0645j4 runnableC0645j43 = new RunnableC0645j4(c0816s43, i7);
                                        c0816s43.f3240g = runnableC0645j43;
                                        handler.postDelayed(runnableC0645j43, 500L);
                                    }
                                    C0376Ue c0376Ue3 = C0376Ue.f1410t;
                                    if (c0376Ue3 != null) {
                                        c0376Ue3.f1416f = 0;
                                        c0376Ue3.f1417g = 0L;
                                        c0376Ue3.f1411a = null;
                                        c0376Ue3.f1418h = false;
                                        c0376Ue3.f1422l.removeCallbacks(c0376Ue3.f1423m);
                                        c0376Ue3.f1419i = false;
                                        c0376Ue3.f1415e = false;
                                        c0376Ue3.f1429s = 0;
                                        c0376Ue3.f1412b = null;
                                        WeakReference<Activity> weakReference = c0376Ue3.f1413c;
                                        Activity activity3 = weakReference != null ? weakReference.get() : null;
                                        Window.Callback callback = (activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getCallback();
                                        if (callback instanceof WindowCallbackC0941yf) {
                                            activity3.getWindow().setCallback(((WindowCallbackC0941yf) callback).f3552a);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: TouchInterceptingCallback restored"}, 1));
                                        }
                                        c0376Ue3.f1413c = null;
                                        c0376Ue3.f1427q = false;
                                        c0376Ue3.f1426p.removeCallbacks(c0376Ue3.f1428r);
                                    }
                                    c0816s43.f3242i = null;
                                }
                                return objProceed2;
                            case 3:
                                Class cls7 = clsM13b3;
                                C0816s4 c0816s44 = this;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                Object objProceed3 = chain4.proceed();
                                Object thisObject3 = chain4.getThisObject();
                                Activity activity4 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                if (activity4 != null && (cls7 == null || activity4.getClass().getName().equals(cls7.getName()))) {
                                    Object obj4 = chain4.getArgs().get(0);
                                    C0631i9.m1480c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    C0186K3.f638a.getClass();
                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                    if (!zBooleanValue) {
                                        C0915x8 c0915x84 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            if (zBooleanValue) {
                                                C0915x8 c0915x85 = C0915x8.f3530a;
                                                if (!C0915x8.m2203a()) {
                                                    try {
                                                        C0653jc c0653jcM508i3 = C0186K3.a.m508i();
                                                        if (C0186K3.a.m511l() && ((c0653jcM508i3.f2451u || c0653jcM508i3.f2454x) && (c0376Ue2 = C0376Ue.f1410t) != null)) {
                                                            View decorView2 = activity4.getWindow().getDecorView();
                                                            C0631i9.m1481d(decorView2, "getDecorView(...)");
                                                            c0376Ue2.m1003a(activity4, decorView2);
                                                        }
                                                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                    } catch (Throwable th22) {
                                                        C0920xd.m2206a(th22);
                                                    }
                                                    C0186K3.f638a.getClass();
                                                    if (C0186K3.a.m511l() && !C0186K3.a.m505f().isEmpty() && C0186K3.a.m508i().f2444n) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"window focus gained, refreshing ListView"}, 1));
                                                        if (c0816s44.f3242i != null) {
                                                            try {
                                                                WeakReference<ListView> weakReference2 = c0816s44.f3243j;
                                                                if (weakReference2 != null && (listView = weakReference2.get()) != null) {
                                                                    if (listView.getWindowToken() != null) {
                                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                                        Long l = c0816s44.f3251r.get(listView.getAdapter());
                                                                        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 500) {
                                                                            c0816s44.m1912t(listView.getAdapter());
                                                                        }
                                                                    } else {
                                                                        c0816s44.f3243j = null;
                                                                    }
                                                                    C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                                                }
                                                            } catch (Throwable th32) {
                                                                C0920xd.m2206a(th32);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        } else if (C0816s4.f3218G || C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] focus lost while whitelisted page open, skip rehideOnLeaveApp (profile=" + C0816s4.f3218G + " chatInfo=" + C0816s4.f3219H + ")"}, 1));
                                        } else if (c0653jcM508i2.f2423O && C0915x8.f3531b != C0518ca.b.f1899c) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"rehideOnLeaveApp: focus lost, rehiding (state=" + C0915x8.f3531b + ")"}, 1));
                                            c0915x84.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a2 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s44.m1915z(true, enumC1339a2);
                                            c0816s44.m1914y(true, enumC1339a2, new C0664k4(c0816s44, i7));
                                            C0816s4.f3217F = false;
                                            c0816s44.f3241h = true;
                                            c0816s44.f3238e.set(false);
                                            View view2 = c0816s44.f3242i;
                                            if (view2 != null) {
                                                c0816s44.m1897c(view2);
                                                c0816s44.m1903k();
                                            }
                                            c0816s44.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed3;
                            default:
                                Class cls8 = clsM13b3;
                                C0816s4 c0816s45 = this;
                                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain5, "chain");
                                Object objProceed4 = chain5.proceed();
                                if (cls8 == null || cls8.isInstance(chain5.getThisObject())) {
                                    C0915x8 c0915x86 = C0915x8.f3530a;
                                    if (C0915x8.m2203a() && C0915x8.f3531b == C0518ca.b.f1899c) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2423O && !C0816s4.f3218G && !C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onStop: COMMAND source rehide (HOME key)"}, 1));
                                            c0915x86.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a3 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s45.m1915z(true, enumC1339a3);
                                            c0816s45.m1914y(true, enumC1339a3, new C0664k4(c0816s45, i5));
                                            C0816s4.f3217F = false;
                                            c0816s45.f3241h = true;
                                            c0816s45.f3238e.set(false);
                                            View view3 = c0816s45.f3242i;
                                            if (view3 != null) {
                                                c0816s45.m1897c(view3);
                                                c0816s45.m1903k();
                                            }
                                            c0816s45.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed4;
                        }
                    }
                }) != null) {
                    C0908x1.m2194b("[DIAG-T2-1] onResume hooked on " + str3);
                    break;
                }
            }
            objM2206a5 = C0413Wf.f1577a;
        } catch (Throwable th5) {
            objM2206a5 = C0920xd.m2206a(th5);
        }
        Throwable thM2189a5 = C0901wd.m2189a(objM2206a5);
        if (thM2189a5 != null) {
            C0908x1.m2193a("LauncherUI.onResume hook fail", thM2189a5);
        }
        try {
            Iterator it3 = (clsM13b3 != null ? C0739o3.m1757d0(clsM13b3.getName(), "android.app.Activity") : C0889w1.m2124K("android.app.Activity")).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    C0908x1.m2193a("[DIAG] onPause hook failed on all candidates");
                    break;
                }
                String str4 = (String) it3.next();
                C0631i9.m1479b(str4);
                if (C0173J8.m463a(c0173j8, str4, "onPause", new Class[0], new InterfaceC0064D7() { // from class: a.r4
                    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo53f(Object obj2) {
                        C0376Ue c0376Ue;
                        C0816s4.a.b bVar;
                        Window window;
                        ListView listView;
                        C0376Ue c0376Ue2;
                        int i5 = 2;
                        int i6 = 0;
                        int i7 = 1;
                        switch (i) {
                            case 0:
                                Class cls4 = clsM13b3;
                                C0816s4 c0816s4 = this;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                Object thisObject = chain.getThisObject();
                                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                Object obj3 = chain.getArgs().get(0);
                                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                                if ((number != null ? number.intValue() : 0) == 4 && activity != null && cls4 != null && cls4.isInstance(activity)) {
                                    C0915x8 c0915x8 = C0915x8.f3530a;
                                    if (C0915x8.m2203a()) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2422N) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onKeyDown BACK in LauncherUI: rehiding (rehideOnLeaveChat)"}, 1));
                                            c0915x8.m2204b(C0518ca.c.f1905e);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s4.m1915z(true, enumC1339a);
                                            c0816s4.m1914y(true, enumC1339a, new C0664k4(c0816s4, i6));
                                            C0816s4.f3217F = false;
                                            c0816s4.f3241h = true;
                                            C0816s4.m1894x();
                                            c0816s4.m1903k();
                                            View view = c0816s4.f3242i;
                                            if (view != null) {
                                                try {
                                                    c0816s4.m1897c(view);
                                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                                } catch (Throwable th52) {
                                                    C0920xd.m2206a(th52);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return chain.proceed();
                            case 1:
                                Class cls5 = clsM13b3;
                                final C0816s4 c0816s42 = this;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                Object objProceed = chain2.proceed();
                                if (cls5 == null || cls5.isInstance(chain2.getThisObject())) {
                                    Object thisObject2 = chain2.getThisObject();
                                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                    if (activity2 != null) {
                                        new WeakReference(activity2);
                                        C0698m0.f2635a.getClass();
                                        C0698m0.m1589b(activity2);
                                        C0816s4.f3217F = false;
                                        RunnableC0645j4 runnableC0645j4 = c0816s42.f3240g;
                                        if (runnableC0645j4 != null) {
                                            c0816s42.f3239f.removeCallbacks(runnableC0645j4);
                                        }
                                        c0816s42.f3240g = null;
                                        C0816s4.f3218G = false;
                                        C0816s4.f3219H = false;
                                        View decorView = activity2.getWindow().getDecorView();
                                        C0631i9.m1481d(decorView, "getDecorView(...)");
                                        c0816s42.f3242i = decorView;
                                        C0186K3.f638a.getClass();
                                        boolean zM511l = C0186K3.a.m511l();
                                        boolean z = C0186K3.a.m508i().f2444n;
                                        boolean z2 = C0186K3.a.m508i().f2447q;
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] DEBUG onResume: masterEnabled=" + zM511l + " hideMainConvList=" + z + " hideConversation=" + z2 + " masks=" + C0186K3.a.m505f().size()}, 1));
                                        C0915x8 c0915x82 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            ((Handler) c0816s42.f3231C.m625a()).post(new RunnableC0721n4(z2));
                                        }
                                        if (c0816s42.f3241h) {
                                            c0816s42.m1897c(decorView);
                                            c0816s42.f3241h = false;
                                        }
                                        C0653jc c0653jcM508i = C0186K3.a.m508i();
                                        if (C0186K3.a.m511l() && ((c0653jcM508i.f2451u || c0653jcM508i.f2454x) && (c0376Ue = C0376Ue.f1410t) != null)) {
                                            c0376Ue.m1003a(activity2, decorView);
                                        }
                                        if (c0816s42.f3238e.get()) {
                                            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: a.i4
                                                @Override // android.os.MessageQueue.IdleHandler
                                                public final boolean queueIdle() {
                                                    c0816s42.f3238e.set(false);
                                                    C0816s4.f3217F = false;
                                                    return false;
                                                }
                                            });
                                            decorView.postDelayed(new RunnableC0645j4(c0816s42, i6), 500L);
                                        }
                                    }
                                }
                                return objProceed;
                            case 2:
                                Class cls6 = clsM13b3;
                                C0816s4 c0816s43 = this;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                Object objProceed2 = chain3.proceed();
                                if (cls6 == null || cls6.isInstance(chain3.getThisObject())) {
                                    C0915x8 c0915x83 = C0915x8.f3530a;
                                    boolean zM2203a = C0915x8.m2203a();
                                    int iOrdinal = C0915x8.f3531b.ordinal();
                                    if (iOrdinal == 0) {
                                        bVar = C0816s4.a.b.f3265a;
                                    } else if (iOrdinal == 1) {
                                        bVar = C0816s4.a.b.f3266b;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new C0266Ob();
                                        }
                                        bVar = C0816s4.a.b.f3267c;
                                    }
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] onPause fired, tempUnhideMainConv=" + zM2203a + " source=" + bVar}, 1));
                                    c0816s43.f3238e.set(true);
                                    C0816s4.f3217F = false;
                                    if (zM2203a && C0915x8.f3531b == C0518ca.b.f1898b) {
                                        RunnableC0645j4 runnableC0645j42 = c0816s43.f3240g;
                                        Handler handler = c0816s43.f3239f;
                                        if (runnableC0645j42 != null) {
                                            handler.removeCallbacks(runnableC0645j42);
                                        }
                                        RunnableC0645j4 runnableC0645j43 = new RunnableC0645j4(c0816s43, i7);
                                        c0816s43.f3240g = runnableC0645j43;
                                        handler.postDelayed(runnableC0645j43, 500L);
                                    }
                                    C0376Ue c0376Ue3 = C0376Ue.f1410t;
                                    if (c0376Ue3 != null) {
                                        c0376Ue3.f1416f = 0;
                                        c0376Ue3.f1417g = 0L;
                                        c0376Ue3.f1411a = null;
                                        c0376Ue3.f1418h = false;
                                        c0376Ue3.f1422l.removeCallbacks(c0376Ue3.f1423m);
                                        c0376Ue3.f1419i = false;
                                        c0376Ue3.f1415e = false;
                                        c0376Ue3.f1429s = 0;
                                        c0376Ue3.f1412b = null;
                                        WeakReference<Activity> weakReference = c0376Ue3.f1413c;
                                        Activity activity3 = weakReference != null ? weakReference.get() : null;
                                        Window.Callback callback = (activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getCallback();
                                        if (callback instanceof WindowCallbackC0941yf) {
                                            activity3.getWindow().setCallback(((WindowCallbackC0941yf) callback).f3552a);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: TouchInterceptingCallback restored"}, 1));
                                        }
                                        c0376Ue3.f1413c = null;
                                        c0376Ue3.f1427q = false;
                                        c0376Ue3.f1426p.removeCallbacks(c0376Ue3.f1428r);
                                    }
                                    c0816s43.f3242i = null;
                                }
                                return objProceed2;
                            case 3:
                                Class cls7 = clsM13b3;
                                C0816s4 c0816s44 = this;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                Object objProceed3 = chain4.proceed();
                                Object thisObject3 = chain4.getThisObject();
                                Activity activity4 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                if (activity4 != null && (cls7 == null || activity4.getClass().getName().equals(cls7.getName()))) {
                                    Object obj4 = chain4.getArgs().get(0);
                                    C0631i9.m1480c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    C0186K3.f638a.getClass();
                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                    if (!zBooleanValue) {
                                        C0915x8 c0915x84 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            if (zBooleanValue) {
                                                C0915x8 c0915x85 = C0915x8.f3530a;
                                                if (!C0915x8.m2203a()) {
                                                    try {
                                                        C0653jc c0653jcM508i3 = C0186K3.a.m508i();
                                                        if (C0186K3.a.m511l() && ((c0653jcM508i3.f2451u || c0653jcM508i3.f2454x) && (c0376Ue2 = C0376Ue.f1410t) != null)) {
                                                            View decorView2 = activity4.getWindow().getDecorView();
                                                            C0631i9.m1481d(decorView2, "getDecorView(...)");
                                                            c0376Ue2.m1003a(activity4, decorView2);
                                                        }
                                                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                    } catch (Throwable th22) {
                                                        C0920xd.m2206a(th22);
                                                    }
                                                    C0186K3.f638a.getClass();
                                                    if (C0186K3.a.m511l() && !C0186K3.a.m505f().isEmpty() && C0186K3.a.m508i().f2444n) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"window focus gained, refreshing ListView"}, 1));
                                                        if (c0816s44.f3242i != null) {
                                                            try {
                                                                WeakReference<ListView> weakReference2 = c0816s44.f3243j;
                                                                if (weakReference2 != null && (listView = weakReference2.get()) != null) {
                                                                    if (listView.getWindowToken() != null) {
                                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                                        Long l = c0816s44.f3251r.get(listView.getAdapter());
                                                                        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 500) {
                                                                            c0816s44.m1912t(listView.getAdapter());
                                                                        }
                                                                    } else {
                                                                        c0816s44.f3243j = null;
                                                                    }
                                                                    C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                                                }
                                                            } catch (Throwable th32) {
                                                                C0920xd.m2206a(th32);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        } else if (C0816s4.f3218G || C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] focus lost while whitelisted page open, skip rehideOnLeaveApp (profile=" + C0816s4.f3218G + " chatInfo=" + C0816s4.f3219H + ")"}, 1));
                                        } else if (c0653jcM508i2.f2423O && C0915x8.f3531b != C0518ca.b.f1899c) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"rehideOnLeaveApp: focus lost, rehiding (state=" + C0915x8.f3531b + ")"}, 1));
                                            c0915x84.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a2 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s44.m1915z(true, enumC1339a2);
                                            c0816s44.m1914y(true, enumC1339a2, new C0664k4(c0816s44, i7));
                                            C0816s4.f3217F = false;
                                            c0816s44.f3241h = true;
                                            c0816s44.f3238e.set(false);
                                            View view2 = c0816s44.f3242i;
                                            if (view2 != null) {
                                                c0816s44.m1897c(view2);
                                                c0816s44.m1903k();
                                            }
                                            c0816s44.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed3;
                            default:
                                Class cls8 = clsM13b3;
                                C0816s4 c0816s45 = this;
                                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain5, "chain");
                                Object objProceed4 = chain5.proceed();
                                if (cls8 == null || cls8.isInstance(chain5.getThisObject())) {
                                    C0915x8 c0915x86 = C0915x8.f3530a;
                                    if (C0915x8.m2203a() && C0915x8.f3531b == C0518ca.b.f1899c) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2423O && !C0816s4.f3218G && !C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onStop: COMMAND source rehide (HOME key)"}, 1));
                                            c0915x86.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a3 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s45.m1915z(true, enumC1339a3);
                                            c0816s45.m1914y(true, enumC1339a3, new C0664k4(c0816s45, i5));
                                            C0816s4.f3217F = false;
                                            c0816s45.f3241h = true;
                                            c0816s45.f3238e.set(false);
                                            View view3 = c0816s45.f3242i;
                                            if (view3 != null) {
                                                c0816s45.m1897c(view3);
                                                c0816s45.m1903k();
                                            }
                                            c0816s45.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed4;
                        }
                    }
                }) != null) {
                    C0908x1.m2194b("[DIAG] onPause hooked on " + str4);
                    break;
                }
            }
            objM2206a6 = C0413Wf.f1577a;
        } catch (Throwable th6) {
            objM2206a6 = C0920xd.m2206a(th6);
        }
        Throwable thM2189a6 = C0901wd.m2189a(objM2206a6);
        if (thM2189a6 != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"Activity.onPause hook fail", thM2189a6}, 2));
        }
        try {
            Iterator it4 = (clsM13b3 != null ? C0739o3.m1757d0(clsM13b3.getName(), "android.app.Activity") : C0889w1.m2124K("android.app.Activity")).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    C0908x1.m2193a("[DIAG] onWindowFocusChanged hook failed on all candidates");
                    break;
                }
                String str5 = (String) it4.next();
                C0631i9.m1479b(str5);
                if (C0173J8.m463a(c0173j8, str5, "onWindowFocusChanged", new Class[]{Boolean.TYPE}, new InterfaceC0064D7() { // from class: a.r4
                    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo53f(Object obj2) {
                        C0376Ue c0376Ue;
                        C0816s4.a.b bVar;
                        Window window;
                        ListView listView;
                        C0376Ue c0376Ue2;
                        int i5 = 2;
                        int i6 = 0;
                        int i7 = 1;
                        switch (i2) {
                            case 0:
                                Class cls4 = clsM13b3;
                                C0816s4 c0816s4 = this;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                Object thisObject = chain.getThisObject();
                                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                Object obj3 = chain.getArgs().get(0);
                                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                                if ((number != null ? number.intValue() : 0) == 4 && activity != null && cls4 != null && cls4.isInstance(activity)) {
                                    C0915x8 c0915x8 = C0915x8.f3530a;
                                    if (C0915x8.m2203a()) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2422N) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onKeyDown BACK in LauncherUI: rehiding (rehideOnLeaveChat)"}, 1));
                                            c0915x8.m2204b(C0518ca.c.f1905e);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s4.m1915z(true, enumC1339a);
                                            c0816s4.m1914y(true, enumC1339a, new C0664k4(c0816s4, i6));
                                            C0816s4.f3217F = false;
                                            c0816s4.f3241h = true;
                                            C0816s4.m1894x();
                                            c0816s4.m1903k();
                                            View view = c0816s4.f3242i;
                                            if (view != null) {
                                                try {
                                                    c0816s4.m1897c(view);
                                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                                } catch (Throwable th52) {
                                                    C0920xd.m2206a(th52);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return chain.proceed();
                            case 1:
                                Class cls5 = clsM13b3;
                                final C0816s4 c0816s42 = this;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                Object objProceed = chain2.proceed();
                                if (cls5 == null || cls5.isInstance(chain2.getThisObject())) {
                                    Object thisObject2 = chain2.getThisObject();
                                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                    if (activity2 != null) {
                                        new WeakReference(activity2);
                                        C0698m0.f2635a.getClass();
                                        C0698m0.m1589b(activity2);
                                        C0816s4.f3217F = false;
                                        RunnableC0645j4 runnableC0645j4 = c0816s42.f3240g;
                                        if (runnableC0645j4 != null) {
                                            c0816s42.f3239f.removeCallbacks(runnableC0645j4);
                                        }
                                        c0816s42.f3240g = null;
                                        C0816s4.f3218G = false;
                                        C0816s4.f3219H = false;
                                        View decorView = activity2.getWindow().getDecorView();
                                        C0631i9.m1481d(decorView, "getDecorView(...)");
                                        c0816s42.f3242i = decorView;
                                        C0186K3.f638a.getClass();
                                        boolean zM511l = C0186K3.a.m511l();
                                        boolean z = C0186K3.a.m508i().f2444n;
                                        boolean z2 = C0186K3.a.m508i().f2447q;
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] DEBUG onResume: masterEnabled=" + zM511l + " hideMainConvList=" + z + " hideConversation=" + z2 + " masks=" + C0186K3.a.m505f().size()}, 1));
                                        C0915x8 c0915x82 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            ((Handler) c0816s42.f3231C.m625a()).post(new RunnableC0721n4(z2));
                                        }
                                        if (c0816s42.f3241h) {
                                            c0816s42.m1897c(decorView);
                                            c0816s42.f3241h = false;
                                        }
                                        C0653jc c0653jcM508i = C0186K3.a.m508i();
                                        if (C0186K3.a.m511l() && ((c0653jcM508i.f2451u || c0653jcM508i.f2454x) && (c0376Ue = C0376Ue.f1410t) != null)) {
                                            c0376Ue.m1003a(activity2, decorView);
                                        }
                                        if (c0816s42.f3238e.get()) {
                                            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: a.i4
                                                @Override // android.os.MessageQueue.IdleHandler
                                                public final boolean queueIdle() {
                                                    c0816s42.f3238e.set(false);
                                                    C0816s4.f3217F = false;
                                                    return false;
                                                }
                                            });
                                            decorView.postDelayed(new RunnableC0645j4(c0816s42, i6), 500L);
                                        }
                                    }
                                }
                                return objProceed;
                            case 2:
                                Class cls6 = clsM13b3;
                                C0816s4 c0816s43 = this;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                Object objProceed2 = chain3.proceed();
                                if (cls6 == null || cls6.isInstance(chain3.getThisObject())) {
                                    C0915x8 c0915x83 = C0915x8.f3530a;
                                    boolean zM2203a = C0915x8.m2203a();
                                    int iOrdinal = C0915x8.f3531b.ordinal();
                                    if (iOrdinal == 0) {
                                        bVar = C0816s4.a.b.f3265a;
                                    } else if (iOrdinal == 1) {
                                        bVar = C0816s4.a.b.f3266b;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new C0266Ob();
                                        }
                                        bVar = C0816s4.a.b.f3267c;
                                    }
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] onPause fired, tempUnhideMainConv=" + zM2203a + " source=" + bVar}, 1));
                                    c0816s43.f3238e.set(true);
                                    C0816s4.f3217F = false;
                                    if (zM2203a && C0915x8.f3531b == C0518ca.b.f1898b) {
                                        RunnableC0645j4 runnableC0645j42 = c0816s43.f3240g;
                                        Handler handler = c0816s43.f3239f;
                                        if (runnableC0645j42 != null) {
                                            handler.removeCallbacks(runnableC0645j42);
                                        }
                                        RunnableC0645j4 runnableC0645j43 = new RunnableC0645j4(c0816s43, i7);
                                        c0816s43.f3240g = runnableC0645j43;
                                        handler.postDelayed(runnableC0645j43, 500L);
                                    }
                                    C0376Ue c0376Ue3 = C0376Ue.f1410t;
                                    if (c0376Ue3 != null) {
                                        c0376Ue3.f1416f = 0;
                                        c0376Ue3.f1417g = 0L;
                                        c0376Ue3.f1411a = null;
                                        c0376Ue3.f1418h = false;
                                        c0376Ue3.f1422l.removeCallbacks(c0376Ue3.f1423m);
                                        c0376Ue3.f1419i = false;
                                        c0376Ue3.f1415e = false;
                                        c0376Ue3.f1429s = 0;
                                        c0376Ue3.f1412b = null;
                                        WeakReference<Activity> weakReference = c0376Ue3.f1413c;
                                        Activity activity3 = weakReference != null ? weakReference.get() : null;
                                        Window.Callback callback = (activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getCallback();
                                        if (callback instanceof WindowCallbackC0941yf) {
                                            activity3.getWindow().setCallback(((WindowCallbackC0941yf) callback).f3552a);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: TouchInterceptingCallback restored"}, 1));
                                        }
                                        c0376Ue3.f1413c = null;
                                        c0376Ue3.f1427q = false;
                                        c0376Ue3.f1426p.removeCallbacks(c0376Ue3.f1428r);
                                    }
                                    c0816s43.f3242i = null;
                                }
                                return objProceed2;
                            case 3:
                                Class cls7 = clsM13b3;
                                C0816s4 c0816s44 = this;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                Object objProceed3 = chain4.proceed();
                                Object thisObject3 = chain4.getThisObject();
                                Activity activity4 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                if (activity4 != null && (cls7 == null || activity4.getClass().getName().equals(cls7.getName()))) {
                                    Object obj4 = chain4.getArgs().get(0);
                                    C0631i9.m1480c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    C0186K3.f638a.getClass();
                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                    if (!zBooleanValue) {
                                        C0915x8 c0915x84 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            if (zBooleanValue) {
                                                C0915x8 c0915x85 = C0915x8.f3530a;
                                                if (!C0915x8.m2203a()) {
                                                    try {
                                                        C0653jc c0653jcM508i3 = C0186K3.a.m508i();
                                                        if (C0186K3.a.m511l() && ((c0653jcM508i3.f2451u || c0653jcM508i3.f2454x) && (c0376Ue2 = C0376Ue.f1410t) != null)) {
                                                            View decorView2 = activity4.getWindow().getDecorView();
                                                            C0631i9.m1481d(decorView2, "getDecorView(...)");
                                                            c0376Ue2.m1003a(activity4, decorView2);
                                                        }
                                                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                    } catch (Throwable th22) {
                                                        C0920xd.m2206a(th22);
                                                    }
                                                    C0186K3.f638a.getClass();
                                                    if (C0186K3.a.m511l() && !C0186K3.a.m505f().isEmpty() && C0186K3.a.m508i().f2444n) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"window focus gained, refreshing ListView"}, 1));
                                                        if (c0816s44.f3242i != null) {
                                                            try {
                                                                WeakReference<ListView> weakReference2 = c0816s44.f3243j;
                                                                if (weakReference2 != null && (listView = weakReference2.get()) != null) {
                                                                    if (listView.getWindowToken() != null) {
                                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                                        Long l = c0816s44.f3251r.get(listView.getAdapter());
                                                                        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 500) {
                                                                            c0816s44.m1912t(listView.getAdapter());
                                                                        }
                                                                    } else {
                                                                        c0816s44.f3243j = null;
                                                                    }
                                                                    C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                                                }
                                                            } catch (Throwable th32) {
                                                                C0920xd.m2206a(th32);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        } else if (C0816s4.f3218G || C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] focus lost while whitelisted page open, skip rehideOnLeaveApp (profile=" + C0816s4.f3218G + " chatInfo=" + C0816s4.f3219H + ")"}, 1));
                                        } else if (c0653jcM508i2.f2423O && C0915x8.f3531b != C0518ca.b.f1899c) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"rehideOnLeaveApp: focus lost, rehiding (state=" + C0915x8.f3531b + ")"}, 1));
                                            c0915x84.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a2 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s44.m1915z(true, enumC1339a2);
                                            c0816s44.m1914y(true, enumC1339a2, new C0664k4(c0816s44, i7));
                                            C0816s4.f3217F = false;
                                            c0816s44.f3241h = true;
                                            c0816s44.f3238e.set(false);
                                            View view2 = c0816s44.f3242i;
                                            if (view2 != null) {
                                                c0816s44.m1897c(view2);
                                                c0816s44.m1903k();
                                            }
                                            c0816s44.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed3;
                            default:
                                Class cls8 = clsM13b3;
                                C0816s4 c0816s45 = this;
                                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain5, "chain");
                                Object objProceed4 = chain5.proceed();
                                if (cls8 == null || cls8.isInstance(chain5.getThisObject())) {
                                    C0915x8 c0915x86 = C0915x8.f3530a;
                                    if (C0915x8.m2203a() && C0915x8.f3531b == C0518ca.b.f1899c) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2423O && !C0816s4.f3218G && !C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onStop: COMMAND source rehide (HOME key)"}, 1));
                                            c0915x86.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a3 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s45.m1915z(true, enumC1339a3);
                                            c0816s45.m1914y(true, enumC1339a3, new C0664k4(c0816s45, i5));
                                            C0816s4.f3217F = false;
                                            c0816s45.f3241h = true;
                                            c0816s45.f3238e.set(false);
                                            View view3 = c0816s45.f3242i;
                                            if (view3 != null) {
                                                c0816s45.m1897c(view3);
                                                c0816s45.m1903k();
                                            }
                                            c0816s45.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed4;
                        }
                    }
                }) != null) {
                    C0908x1.m2194b("[DIAG] onWindowFocusChanged hooked on " + str5);
                    break;
                }
            }
            objM2206a7 = C0413Wf.f1577a;
        } catch (Throwable th7) {
            objM2206a7 = C0920xd.m2206a(th7);
        }
        Throwable thM2189a7 = C0901wd.m2189a(objM2206a7);
        if (thM2189a7 != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"hook onWindowFocusChanged fail", thM2189a7}, 2));
        }
        try {
            Iterator it5 = (clsM13b3 != null ? C0739o3.m1757d0(clsM13b3.getName(), "android.app.Activity") : C0889w1.m2124K("android.app.Activity")).iterator();
            while (true) {
                if (!it5.hasNext()) {
                    C0908x1.m2193a("[DIAG] onStop hook failed");
                    break;
                }
                String str6 = (String) it5.next();
                C0631i9.m1479b(str6);
                final int i5 = 4;
                if (C0173J8.m463a(c0173j8, str6, "onStop", new Class[0], new InterfaceC0064D7() { // from class: a.r4
                    /* JADX WARN: Removed duplicated region for block: B:53:0x016a  */
                    @Override // p000a.InterfaceC0064D7
                    /* JADX INFO: renamed from: f */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo53f(Object obj2) {
                        C0376Ue c0376Ue;
                        C0816s4.a.b bVar;
                        Window window;
                        ListView listView;
                        C0376Ue c0376Ue2;
                        int i52 = 2;
                        int i6 = 0;
                        int i7 = 1;
                        switch (i5) {
                            case 0:
                                Class cls4 = clsM13b3;
                                C0816s4 c0816s4 = this;
                                XposedInterface.Chain chain = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain, "chain");
                                Object thisObject = chain.getThisObject();
                                Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
                                Object obj3 = chain.getArgs().get(0);
                                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                                if ((number != null ? number.intValue() : 0) == 4 && activity != null && cls4 != null && cls4.isInstance(activity)) {
                                    C0915x8 c0915x8 = C0915x8.f3530a;
                                    if (C0915x8.m2203a()) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2422N) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onKeyDown BACK in LauncherUI: rehiding (rehideOnLeaveChat)"}, 1));
                                            c0915x8.m2204b(C0518ca.c.f1905e);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s4.m1915z(true, enumC1339a);
                                            c0816s4.m1914y(true, enumC1339a, new C0664k4(c0816s4, i6));
                                            C0816s4.f3217F = false;
                                            c0816s4.f3241h = true;
                                            C0816s4.m1894x();
                                            c0816s4.m1903k();
                                            View view = c0816s4.f3242i;
                                            if (view != null) {
                                                try {
                                                    c0816s4.m1897c(view);
                                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                                } catch (Throwable th52) {
                                                    C0920xd.m2206a(th52);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                return chain.proceed();
                            case 1:
                                Class cls5 = clsM13b3;
                                final C0816s4 c0816s42 = this;
                                XposedInterface.Chain chain2 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain2, "chain");
                                Object objProceed = chain2.proceed();
                                if (cls5 == null || cls5.isInstance(chain2.getThisObject())) {
                                    Object thisObject2 = chain2.getThisObject();
                                    Activity activity2 = thisObject2 instanceof Activity ? (Activity) thisObject2 : null;
                                    if (activity2 != null) {
                                        new WeakReference(activity2);
                                        C0698m0.f2635a.getClass();
                                        C0698m0.m1589b(activity2);
                                        C0816s4.f3217F = false;
                                        RunnableC0645j4 runnableC0645j4 = c0816s42.f3240g;
                                        if (runnableC0645j4 != null) {
                                            c0816s42.f3239f.removeCallbacks(runnableC0645j4);
                                        }
                                        c0816s42.f3240g = null;
                                        C0816s4.f3218G = false;
                                        C0816s4.f3219H = false;
                                        View decorView = activity2.getWindow().getDecorView();
                                        C0631i9.m1481d(decorView, "getDecorView(...)");
                                        c0816s42.f3242i = decorView;
                                        C0186K3.f638a.getClass();
                                        boolean zM511l = C0186K3.a.m511l();
                                        boolean z = C0186K3.a.m508i().f2444n;
                                        boolean z2 = C0186K3.a.m508i().f2447q;
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"[HideMainUI] DEBUG onResume: masterEnabled=" + zM511l + " hideMainConvList=" + z + " hideConversation=" + z2 + " masks=" + C0186K3.a.m505f().size()}, 1));
                                        C0915x8 c0915x82 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            ((Handler) c0816s42.f3231C.m625a()).post(new RunnableC0721n4(z2));
                                        }
                                        if (c0816s42.f3241h) {
                                            c0816s42.m1897c(decorView);
                                            c0816s42.f3241h = false;
                                        }
                                        C0653jc c0653jcM508i = C0186K3.a.m508i();
                                        if (C0186K3.a.m511l() && ((c0653jcM508i.f2451u || c0653jcM508i.f2454x) && (c0376Ue = C0376Ue.f1410t) != null)) {
                                            c0376Ue.m1003a(activity2, decorView);
                                        }
                                        if (c0816s42.f3238e.get()) {
                                            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: a.i4
                                                @Override // android.os.MessageQueue.IdleHandler
                                                public final boolean queueIdle() {
                                                    c0816s42.f3238e.set(false);
                                                    C0816s4.f3217F = false;
                                                    return false;
                                                }
                                            });
                                            decorView.postDelayed(new RunnableC0645j4(c0816s42, i6), 500L);
                                        }
                                    }
                                }
                                return objProceed;
                            case 2:
                                Class cls6 = clsM13b3;
                                C0816s4 c0816s43 = this;
                                XposedInterface.Chain chain3 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain3, "chain");
                                Object objProceed2 = chain3.proceed();
                                if (cls6 == null || cls6.isInstance(chain3.getThisObject())) {
                                    C0915x8 c0915x83 = C0915x8.f3530a;
                                    boolean zM2203a = C0915x8.m2203a();
                                    int iOrdinal = C0915x8.f3531b.ordinal();
                                    if (iOrdinal == 0) {
                                        bVar = C0816s4.a.b.f3265a;
                                    } else if (iOrdinal == 1) {
                                        bVar = C0816s4.a.b.f3266b;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new C0266Ob();
                                        }
                                        bVar = C0816s4.a.b.f3267c;
                                    }
                                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG] onPause fired, tempUnhideMainConv=" + zM2203a + " source=" + bVar}, 1));
                                    c0816s43.f3238e.set(true);
                                    C0816s4.f3217F = false;
                                    if (zM2203a && C0915x8.f3531b == C0518ca.b.f1898b) {
                                        RunnableC0645j4 runnableC0645j42 = c0816s43.f3240g;
                                        Handler handler = c0816s43.f3239f;
                                        if (runnableC0645j42 != null) {
                                            handler.removeCallbacks(runnableC0645j42);
                                        }
                                        RunnableC0645j4 runnableC0645j43 = new RunnableC0645j4(c0816s43, i7);
                                        c0816s43.f3240g = runnableC0645j43;
                                        handler.postDelayed(runnableC0645j43, 500L);
                                    }
                                    C0376Ue c0376Ue3 = C0376Ue.f1410t;
                                    if (c0376Ue3 != null) {
                                        c0376Ue3.f1416f = 0;
                                        c0376Ue3.f1417g = 0L;
                                        c0376Ue3.f1411a = null;
                                        c0376Ue3.f1418h = false;
                                        c0376Ue3.f1422l.removeCallbacks(c0376Ue3.f1423m);
                                        c0376Ue3.f1419i = false;
                                        c0376Ue3.f1415e = false;
                                        c0376Ue3.f1429s = 0;
                                        c0376Ue3.f1412b = null;
                                        WeakReference<Activity> weakReference = c0376Ue3.f1413c;
                                        Activity activity3 = weakReference != null ? weakReference.get() : null;
                                        Window.Callback callback = (activity3 == null || (window = activity3.getWindow()) == null) ? null : window.getCallback();
                                        if (callback instanceof WindowCallbackC0941yf) {
                                            activity3.getWindow().setCallback(((WindowCallbackC0941yf) callback).f3552a);
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"TempUnhideTrigger: TouchInterceptingCallback restored"}, 1));
                                        }
                                        c0376Ue3.f1413c = null;
                                        c0376Ue3.f1427q = false;
                                        c0376Ue3.f1426p.removeCallbacks(c0376Ue3.f1428r);
                                    }
                                    c0816s43.f3242i = null;
                                }
                                return objProceed2;
                            case 3:
                                Class cls7 = clsM13b3;
                                C0816s4 c0816s44 = this;
                                XposedInterface.Chain chain4 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain4, "chain");
                                Object objProceed3 = chain4.proceed();
                                Object thisObject3 = chain4.getThisObject();
                                Activity activity4 = thisObject3 instanceof Activity ? (Activity) thisObject3 : null;
                                if (activity4 != null && (cls7 == null || activity4.getClass().getName().equals(cls7.getName()))) {
                                    Object obj4 = chain4.getArgs().get(0);
                                    C0631i9.m1480c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    C0186K3.f638a.getClass();
                                    C0653jc c0653jcM508i2 = C0186K3.a.m508i();
                                    if (!zBooleanValue) {
                                        C0915x8 c0915x84 = C0915x8.f3530a;
                                        if (!C0915x8.m2203a()) {
                                            if (zBooleanValue) {
                                                C0915x8 c0915x85 = C0915x8.f3530a;
                                                if (!C0915x8.m2203a()) {
                                                    try {
                                                        C0653jc c0653jcM508i3 = C0186K3.a.m508i();
                                                        if (C0186K3.a.m511l() && ((c0653jcM508i3.f2451u || c0653jcM508i3.f2454x) && (c0376Ue2 = C0376Ue.f1410t) != null)) {
                                                            View decorView2 = activity4.getWindow().getDecorView();
                                                            C0631i9.m1481d(decorView2, "getDecorView(...)");
                                                            c0376Ue2.m1003a(activity4, decorView2);
                                                        }
                                                        C0413Wf c0413Wf2 = C0413Wf.f1577a;
                                                    } catch (Throwable th22) {
                                                        C0920xd.m2206a(th22);
                                                    }
                                                    C0186K3.f638a.getClass();
                                                    if (C0186K3.a.m511l() && !C0186K3.a.m505f().isEmpty() && C0186K3.a.m508i().f2444n) {
                                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"window focus gained, refreshing ListView"}, 1));
                                                        if (c0816s44.f3242i != null) {
                                                            try {
                                                                WeakReference<ListView> weakReference2 = c0816s44.f3243j;
                                                                if (weakReference2 != null && (listView = weakReference2.get()) != null) {
                                                                    if (listView.getWindowToken() != null) {
                                                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                                                        Long l = c0816s44.f3251r.get(listView.getAdapter());
                                                                        if (jCurrentTimeMillis - (l != null ? l.longValue() : 0L) >= 500) {
                                                                            c0816s44.m1912t(listView.getAdapter());
                                                                        }
                                                                    } else {
                                                                        c0816s44.f3243j = null;
                                                                    }
                                                                    C0413Wf c0413Wf3 = C0413Wf.f1577a;
                                                                }
                                                            } catch (Throwable th32) {
                                                                C0920xd.m2206a(th32);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        } else if (C0816s4.f3218G || C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"[ProfileWhitelist] focus lost while whitelisted page open, skip rehideOnLeaveApp (profile=" + C0816s4.f3218G + " chatInfo=" + C0816s4.f3219H + ")"}, 1));
                                        } else if (c0653jcM508i2.f2423O && C0915x8.f3531b != C0518ca.b.f1899c) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"rehideOnLeaveApp: focus lost, rehiding (state=" + C0915x8.f3531b + ")"}, 1));
                                            c0915x84.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a2 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s44.m1915z(true, enumC1339a2);
                                            c0816s44.m1914y(true, enumC1339a2, new C0664k4(c0816s44, i7));
                                            C0816s4.f3217F = false;
                                            c0816s44.f3241h = true;
                                            c0816s44.f3238e.set(false);
                                            View view2 = c0816s44.f3242i;
                                            if (view2 != null) {
                                                c0816s44.m1897c(view2);
                                                c0816s44.m1903k();
                                            }
                                            c0816s44.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed3;
                            default:
                                Class cls8 = clsM13b3;
                                C0816s4 c0816s45 = this;
                                XposedInterface.Chain chain5 = (XposedInterface.Chain) obj2;
                                C0631i9.m1482e(chain5, "chain");
                                Object objProceed4 = chain5.proceed();
                                if (cls8 == null || cls8.isInstance(chain5.getThisObject())) {
                                    C0915x8 c0915x86 = C0915x8.f3530a;
                                    if (C0915x8.m2203a() && C0915x8.f3531b == C0518ca.b.f1899c) {
                                        C0186K3.f638a.getClass();
                                        if (C0186K3.a.m508i().f2423O && !C0816s4.f3218G && !C0816s4.f3219H) {
                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"onStop: COMMAND source rehide (HOME key)"}, 1));
                                            c0915x86.m2204b(C0518ca.c.f1906f);
                                            C0816s4.a.C1338a.EnumC1339a enumC1339a3 = C0816s4.a.C1338a.EnumC1339a.f3261a;
                                            c0816s45.m1915z(true, enumC1339a3);
                                            c0816s45.m1914y(true, enumC1339a3, new C0664k4(c0816s45, i52));
                                            C0816s4.f3217F = false;
                                            c0816s45.f3241h = true;
                                            c0816s45.f3238e.set(false);
                                            View view3 = c0816s45.f3242i;
                                            if (view3 != null) {
                                                c0816s45.m1897c(view3);
                                                c0816s45.m1903k();
                                            }
                                            c0816s45.f3243j = null;
                                            C0816s4.m1894x();
                                        }
                                    }
                                }
                                return objProceed4;
                        }
                    }
                }) != null) {
                    break;
                }
            }
            objM2206a8 = C0413Wf.f1577a;
        } catch (Throwable th8) {
            objM2206a8 = C0920xd.m2206a(th8);
        }
        Throwable thM2189a8 = C0901wd.m2189a(objM2206a8);
        if (thM2189a8 != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"hook onStop fail", thM2189a8}, 2));
        }
        for (String str7 : C0739o3.m1757d0("com.tencent.mm.ui.SingleChatInfoUI", "com.tencent.mm.chatroom.ui.ChatroomInfoUI", "com.tencent.mm.plugin.profile.ui.ContactInfoUI")) {
            try {
                if (C0002A1.m13b(c0173j8.f608a, str7) != null) {
                    C0173J8.m463a(c0173j8, str7, "onCreate", new Class[]{Bundle.class}, new C0586g2(5, str7));
                }
                objM2206a15 = C0413Wf.f1577a;
            } catch (Throwable th9) {
                objM2206a15 = C0920xd.m2206a(th9);
            }
            Throwable thM2189a9 = C0901wd.m2189a(objM2206a15);
            if (thM2189a9 != null) {
                C0908x1.m2193a(C0944z.m2231k("hook info page onCreate fail: ", str7), thM2189a9);
            }
        }
        try {
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.plugin.profile.ui.ContactInfoUI") != null) {
                C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", "onCreate", new Class[]{Bundle.class}, new C0586g2(6));
            }
            objM2206a9 = C0413Wf.f1577a;
        } catch (Throwable th10) {
            objM2206a9 = C0920xd.m2206a(th10);
        }
        Throwable thM2189a10 = C0901wd.m2189a(objM2206a9);
        if (thM2189a10 != null) {
            C0908x1.m2193a("hook ContactInfoUI.onCreate (whitelist) fail", thM2189a10);
        }
        for (String str8 : C0739o3.m1757d0("com.tencent.mm.ui.SingleChatInfoUI", "com.tencent.mm.chatroom.ui.ChatroomInfoUI")) {
            try {
                if (C0002A1.m13b(c0173j8.f608a, str8) != null) {
                    C0173J8.m463a(c0173j8, str8, "onCreate", new Class[]{Bundle.class}, new C0168J3(str8, 1));
                }
                objM2206a14 = C0413Wf.f1577a;
            } catch (Throwable th11) {
                objM2206a14 = C0920xd.m2206a(th11);
            }
            Throwable thM2189a11 = C0901wd.m2189a(objM2206a14);
            if (thM2189a11 != null) {
                C0908x1.m2193a(C0944z.m2231k("hook chat info page onCreate (whitelist) fail: ", str8), thM2189a11);
            }
        }
        try {
            Class clsM13b4 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.chatting.ChattingUI");
            if (clsM13b4 != null) {
                C0173J8.m463a(c0173j8, "com.tencent.mm.ui.chatting.ChattingUI", "onResume", new Class[0], new C0830t(1, clsM13b4));
            }
            objM2206a10 = C0413Wf.f1577a;
        } catch (Throwable th12) {
            objM2206a10 = C0920xd.m2206a(th12);
        }
        Throwable thM2189a12 = C0901wd.m2189a(objM2206a10);
        if (thM2189a12 != null) {
            C0908x1.m2193a("hook ChattingUI.onResume fail", thM2189a12);
        }
        try {
            final Class clsM13b5 = C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.chatting.ChattingUIProxy");
            if (clsM13b5 != null && (methodM15d = C0002A1.m15d(clsM13b5, "onEnterBegin", new Object[0])) != null) {
                c0173j8.m470f(methodM15d).intercept(new XposedInterface.Hooker() { // from class: a.q4
                    public final Object intercept(XposedInterface.Chain chain) {
                        String str9;
                        String string;
                        Object objM2206a16;
                        Object next;
                        C0173J8 c0173j82 = c0173j8;
                        Class cls4 = clsM13b5;
                        C0631i9.m1482e(chain, "chain");
                        Object objProceed = chain.proceed();
                        C0186K3.f638a.getClass();
                        if (C0186K3.a.m511l()) {
                            C0915x8 c0915x8 = C0915x8.f3530a;
                            if (C0915x8.m2203a()) {
                                try {
                                    List args = chain.getArgs();
                                    C0631i9.m1481d(args, "getArgs(...)");
                                    Iterator it6 = args.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it6.next();
                                        if (next instanceof Bundle) {
                                            break;
                                        }
                                    }
                                    Bundle bundle = next instanceof Bundle ? (Bundle) next : null;
                                    string = bundle != null ? bundle.getString("Chat_User") : null;
                                } catch (Throwable th13) {
                                    th = th13;
                                    str9 = null;
                                }
                                try {
                                    C0413Wf c0413Wf = C0413Wf.f1577a;
                                } catch (Throwable th14) {
                                    str9 = string;
                                    th = th14;
                                    C0920xd.m2206a(th);
                                    string = str9;
                                }
                                if (string == null) {
                                    try {
                                        Class clsM13b6 = C0002A1.m13b(c0173j82.f608a, "com.tencent.mm.ui.chatting.BaseChattingUIFragment");
                                        C0631i9.m1479b(clsM13b6);
                                        Field fieldM14c = C0002A1.m14c(cls4, clsM13b6);
                                        if (fieldM14c != null) {
                                            fieldM14c.setAccessible(true);
                                        }
                                        Object objM12a = C0002A1.m12a(fieldM14c != null ? fieldM14c.get(chain.getThisObject()) : null, "getArguments", new Object[0]);
                                        Bundle bundle2 = objM12a instanceof Bundle ? (Bundle) objM12a : null;
                                        String string2 = bundle2 != null ? bundle2.getString("Chat_User") : null;
                                        try {
                                            objM2206a16 = C0413Wf.f1577a;
                                            string = string2;
                                        } catch (Throwable th15) {
                                            th = th15;
                                            string = string2;
                                            objM2206a16 = C0920xd.m2206a(th);
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                    }
                                    Throwable thM2189a13 = C0901wd.m2189a(objM2206a16);
                                    if (thM2189a13 != null) {
                                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"get Chat_User from fragment field fail", thM2189a13}, 2));
                                    }
                                }
                                this.f3069a.m1902i(string, "onEnterBegin");
                            }
                        }
                        return objProceed;
                    }
                });
            }
            objM2206a11 = C0413Wf.f1577a;
        } catch (Throwable th13) {
            objM2206a11 = C0920xd.m2206a(th13);
        }
        Throwable thM2189a13 = C0901wd.m2189a(objM2206a11);
        if (thM2189a13 != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"ChattingUIProxy.onEnterBegin hook fail", thM2189a13}, 2));
        }
        try {
            if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.ui.chatting.BaseChattingUIFragment") != null) {
                C0173J8.m463a(c0173j8, "com.tencent.mm.ui.chatting.BaseChattingUIFragment", "onActivityCreated", new Class[]{Bundle.class}, new C0607h4(this, 5));
            }
            objM2206a12 = C0413Wf.f1577a;
        } catch (Throwable th14) {
            objM2206a12 = C0920xd.m2206a(th14);
        }
        Throwable thM2189a14 = C0901wd.m2189a(objM2206a12);
        if (thM2189a14 != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"hook BaseChattingUIFragment.onActivityCreated fail", thM2189a14}, 2));
        }
        C0854u4.f3353a.m1985d(c0173j8, this.f3235b);
        CopyOnWriteArrayList<C0518ca.d> copyOnWriteArrayList = C0518ca.f1891a;
        C0518ca.m1280b(this.f3229A);
        C0908x1.m2194b("[ConvRV] hookMessageInsertReHide: subscribed to MaskEventBus (no direct hook)");
        try {
            ClassLoader classLoader2 = c0173j8.f608a;
            clsM1893w = this.f3236c;
            if (clsM1893w == null && (clsM1893w = m1893w(classLoader2)) != null) {
                String strConcat = "hookConvSnapshotFilter: snapshot located via DexKit: ".concat(clsM1893w.getName());
                C0631i9.m1482e(strConcat, "msg");
                C0908x1.m2194b("[ConvRV] ".concat(strConcat));
            }
        } catch (Throwable th15) {
            objM2206a13 = C0920xd.m2206a(th15);
        }
        if (clsM1893w == null) {
            C0908x1.m2194b("[ConvRV] hookConvSnapshotFilter: no snapshot class, skip");
            m1907o(c0173j8);
            if (zIsEmpty) {
                C0186K3.f638a.getClass();
                if (C0186K3.a.m508i().f2444n) {
                    this.f3241h = true;
                    return;
                }
                return;
            }
            return;
        }
        Method[] declaredMethods = clsM1893w.getDeclaredMethods();
        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList<Method> arrayList = new ArrayList();
        int length = declaredMethods.length;
        int i6 = 0;
        while (i6 < length) {
            Method method = declaredMethods[i6];
            int i7 = i3;
            if (method.getParameterTypes().length == 1 && !method.getParameterTypes()[i7].isPrimitive() && !C0631i9.m1478a(method.getParameterTypes()[i7], String.class)) {
                arrayList.add(method);
            }
            i6++;
            i3 = i7;
        }
        int i8 = i3;
        for (Method method2 : arrayList) {
            C0631i9.m1479b(method2);
            int i9 = i8;
            C0173J8.m469h(c0173j8, "F001", method2, new C0607h4(this, i9));
            i8 = i9;
        }
        String str9 = "hookConvSnapshotFilter: hooked " + arrayList.size() + " methods on " + clsM1893w.getName() + " (non-destructive)";
        C0631i9.m1482e(str9, "msg");
        C0908x1.m2194b("[ConvRV] " + str9);
        objM2206a13 = C0413Wf.f1577a;
        Throwable thM2189a15 = C0901wd.m2189a(objM2206a13);
        if (thM2189a15 != null) {
            String str10 = "hookConvSnapshotFilter FAILED: " + thM2189a15.getMessage();
            C0631i9.m1482e(str10, "msg");
            C0908x1.m2194b("[ConvRV] ".concat(str10));
        }
        m1907o(c0173j8);
        if (zIsEmpty) {
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1902i(String str, String str2) {
        C0186K3.f638a.getClass();
        C0653jc c0653jcM508i = C0186K3.a.m508i();
        C0915x8 c0915x8 = C0915x8.f3530a;
        boolean zM2203a = C0915x8.m2203a();
        boolean z = c0653jcM508i.f2422N;
        StringBuilder sbM2229i = C0944z.m2229i("enter chatting [", str2, "], Chat_User=", str, ", tempUnhide=");
        sbM2229i.append(zM2203a);
        sbM2229i.append(" rehideOnLeaveChat=");
        sbM2229i.append(z);
        C0908x1.m2194b(Arrays.copyOf(new Object[]{sbM2229i.toString()}, 1));
        if (str != null) {
            ExecutorService executorService = C0582fh.f2149G;
            if (C0582fh.a.m1423a(str)) {
                if (c0653jcM508i.f2422N && !f3218G && !f3219H) {
                    f3217F = true;
                    a.m1917b(this);
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"enter masked chat, rehideOnLeaveChat=true → rehiding"}, 1));
                    return;
                } else {
                    if (f3218G || f3219H) {
                        C0908x1.m2194b(Arrays.copyOf(new Object[]{"enter masked chat from whitelisted page, skip enter-rehide (profile=" + f3218G + " chatInfo=" + f3219H + ")"}, 1));
                        return;
                    }
                    return;
                }
            }
        }
        if (str == null) {
            C0908x1.m2197e(Arrays.copyOf(new Object[]{"Chat_User is null, keep tempUnhide=" + C0915x8.m2203a()}, 1));
            return;
        }
        if (c0653jcM508i.f2422N) {
            a.m1917b(this);
            f3217F = false;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x007e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.wd$a] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1903k() {
        ListView listView;
        ListAdapter adapter;
        ?? M2206a;
        int positionForView;
        Object objM2206a;
        Object objM19h;
        WeakReference<ListView> weakReference = this.f3243j;
        if (weakReference == null || (listView = weakReference.get()) == null || listView.getWindowToken() == null || (adapter = listView.getAdapter()) == null) {
            return;
        }
        C0186K3.f638a.getClass();
        ArrayList arrayListM505f = C0186K3.a.m505f();
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(arrayListM505f, 10));
        Iterator it = arrayListM505f.iterator();
        while (it.hasNext()) {
            arrayList.add(((MaskItemBean) it.next()).getMaskId());
        }
        HashSet hashSet = new HashSet(arrayList);
        boolean z = true;
        try {
            for (Class<?> superclass = adapter.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    M2206a = superclass.getDeclaredMethod("getItem", Integer.TYPE);
                    M2206a.setAccessible(true);
                    break;
                } catch (Exception unused) {
                }
            }
            M2206a = 0;
        } catch (Throwable th) {
            M2206a = C0920xd.m2206a(th);
        }
        boolean z2 = M2206a instanceof C0901wd.a;
        ?? r8 = M2206a;
        if (z2) {
            r8 = 0;
        }
        Method method = (Method) r8;
        if (method == null) {
            return;
        }
        int childCount = listView.getChildCount();
        int i = 0;
        int i2 = 0;
        while (i < childCount) {
            View childAt = listView.getChildAt(i);
            if (childAt != null && (positionForView = listView.getPositionForView(childAt)) >= 0) {
                try {
                    objM2206a = method.invoke(adapter, Integer.valueOf(positionForView));
                } catch (Throwable th2) {
                    objM2206a = C0920xd.m2206a(th2);
                }
                if (objM2206a instanceof C0901wd.a) {
                    objM2206a = null;
                }
                if (objM2206a != null) {
                    try {
                        objM19h = C0002A1.m19h(objM2206a, "d");
                    } catch (Exception unused2) {
                    }
                    if (objM19h != null) {
                        Object objM19h2 = C0002A1.m19h(objM19h, "field_username");
                        String str = objM19h2 instanceof String ? (String) objM19h2 : null;
                        if (str == null || !C0943yh.m2221a(str)) {
                            Class<?> superclass2 = objM2206a.getClass();
                            while (superclass2 != null && !superclass2.equals(Object.class) && !superclass2.equals(Object.class)) {
                                C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass2.getDeclaredFields());
                                while (c0112g1M2122I.hasNext()) {
                                    Field field = (Field) c0112g1M2122I.next();
                                    if (!Modifier.isStatic(field.getModifiers())) {
                                        field.setAccessible(z);
                                        try {
                                            Object obj = field.get(objM2206a);
                                            if ((obj instanceof String) && C0943yh.m2221a((String) obj)) {
                                                str = (String) obj;
                                                break;
                                            }
                                        } catch (Exception unused3) {
                                        }
                                        z = true;
                                    }
                                }
                                superclass2 = superclass2.getSuperclass();
                                z = true;
                            }
                            str = null;
                        }
                        if (str != null && hashSet.contains(str)) {
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            layoutParams.height = 0;
                            childAt.setLayoutParams(layoutParams);
                            childAt.setVisibility(8);
                            i2++;
                        }
                    }
                }
            }
            i++;
            z = true;
        }
        if (i2 > 0) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2223c(i2, "[DIAG] hideMaskedConvViewsSync: hid ", " masked views in ListView")}, 1));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1904l(View view) {
        Method method;
        if (this.f3238e.get() || (method = f3225N) == null) {
            return;
        }
        try {
            String name = view.getClass().getName();
            Field field = this.f3233E.get(name);
            if (field == null && !this.f3233E.containsKey(name)) {
                Field[] declaredFields = view.getClass().getDeclaredFields();
                C0631i9.m1481d(declaredFields, "getDeclaredFields(...)");
                for (Field field2 : declaredFields) {
                    if (!C0034Be.m94I(field2.getType().getName(), "NoMeasuredTextView", false) && !C0034Be.m94I(field2.getType().getName(), "TextView", false)) {
                    }
                    field = field2;
                    break;
                }
                field = null;
                if (field != null) {
                    field.setAccessible(true);
                }
                this.f3233E.put(name, field);
            }
            Object obj = field != null ? field.get(view) : null;
            View view2 = obj instanceof View ? (View) obj : null;
            if (view2 != null) {
                method.invoke(view2, "");
            }
            C0413Wf c0413Wf = C0413Wf.f1577a;
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1905m(View view) {
        String str;
        View viewFindViewById;
        View viewFindViewById2;
        if (this.f3238e.get()) {
            return;
        }
        int iM55b = C0021B1.a.m55b();
        if (iM55b >= 0 && iM55b < 2141) {
            str = "tipcnt_tv";
        } else if (iM55b == 2429) {
            str = "oqu";
        } else {
            if (2140 <= iM55b) {
            }
            str = "kmv";
        }
        int iM1247a = C0502bd.m1247a(str);
        if (iM1247a != 0 && (viewFindViewById2 = view.findViewById(iM1247a)) != null) {
            viewFindViewById2.setVisibility(4);
        }
        int iM55b2 = C0021B1.a.m55b();
        int iM1247a2 = C0502bd.m1247a((iM55b2 < 0 || iM55b2 >= 2421) ? iM55b2 == 2429 ? "a_w" : "o_u" : "a2f");
        if (iM1247a2 == 0 || (viewFindViewById = view.findViewById(iM1247a2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(4);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003a -> B:41:0x003d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: n */
    public final void m1906n(C0173J8 c0173j8, Class<?> cls) {
        int i = 2;
        Class cls2 = Integer.TYPE;
        CopyOnWriteArrayList<XposedInterface.HookHandle> copyOnWriteArrayList = this.f3245l;
        Set<Class<?>> set = this.f3254u;
        if (set.contains(cls)) {
            return;
        }
        set.add(cls);
        try {
            Method methodM15d = C0002A1.m15d(cls, "getCount", new Object[0]);
            if (methodM15d != null) {
                copyOnWriteArrayList.add(C0173J8.m469h(c0173j8, "F001", methodM15d, new C0607h4(this, c0173j8, i)));
            } else {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass != null) {
                    m1906n(c0173j8, superclass);
                    C0413Wf c0413Wf = C0413Wf.f1577a;
                }
            }
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
        try {
            Method methodM15d2 = C0002A1.m15d(cls, "getItem", cls2);
            if (methodM15d2 != null) {
                copyOnWriteArrayList.add(C0173J8.m469h(c0173j8, "F001", methodM15d2, new C0607h4(this, c0173j8, 3)));
            }
            C0413Wf c0413Wf2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
        try {
            Method methodM15d3 = C0002A1.m15d(cls, "getView", cls2, View.class, ViewGroup.class);
            if (methodM15d3 != null) {
                copyOnWriteArrayList.add(C0173J8.m469h(c0173j8, "F001", methodM15d3, new C0588g4(this, c0173j8, i)));
            }
            C0413Wf c0413Wf3 = C0413Wf.f1577a;
        } catch (Throwable th3) {
            C0920xd.m2206a(th3);
        }
        try {
            Method methodM15d4 = C0002A1.m15d(cls, "notifyDataSetChanged", new Object[0]);
            if (methodM15d4 != null) {
                copyOnWriteArrayList.add(C0173J8.m469h(c0173j8, "F001", methodM15d4, new C0607h4(this, 4)));
            }
            C0413Wf c0413Wf4 = C0413Wf.f1577a;
        } catch (Throwable th4) {
            C0920xd.m2206a(th4);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1907o(C0173J8 c0173j8) {
        Object objM2206a;
        char c;
        Method method;
        Object objM2206a2;
        Method method2;
        ClassLoader classLoader;
        Class<?> cls;
        Iterator it;
        Class<?> cls2;
        Method method3;
        ClassLoader classLoader2;
        C0112G1 c0112g1;
        try {
            ClassLoader classLoader3 = c0173j8.f608a;
            Class<?> clsM1892v = this.f3235b;
            Class cls3 = Integer.TYPE;
            if (clsM1892v == null) {
                C0908x1.m2194b("[ConvRV] hookConvEventFilter: dataSourceClass not resolved, probing from adapter class");
                c = 1;
                Class<?> superclass = this.f3234a;
                if (superclass != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (superclass != null && !superclass.equals(Object.class)) {
                        C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                        while (true) {
                            classLoader2 = classLoader3;
                            if (!c0112g1M2122I.hasNext()) {
                                break;
                            }
                            Field field = (Field) c0112g1M2122I.next();
                            if (field.getType().isPrimitive()) {
                                classLoader3 = classLoader2;
                            } else {
                                Class<?> cls4 = clsM1892v;
                                Class<?> cls5 = superclass;
                                if (!C0015Ae.m49H(field.getType().getName(), "java.", false) && !C0015Ae.m49H(field.getType().getName(), "android.", false)) {
                                    Class<?> type = field.getType();
                                    C0631i9.m1481d(type, "getType(...)");
                                    linkedHashSet.add(type);
                                }
                                classLoader3 = classLoader2;
                                superclass = cls5;
                                clsM1892v = cls4;
                            }
                        }
                        Class<?> cls6 = clsM1892v;
                        Class<?> cls7 = superclass;
                        C0112G1 c0112g1M2122I2 = C0889w1.m2122I(cls7.getDeclaredMethods());
                        while (c0112g1M2122I2.hasNext()) {
                            Method method4 = (Method) c0112g1M2122I2.next();
                            if (method4.getReturnType().isPrimitive()) {
                                c0112g1 = c0112g1M2122I2;
                            } else {
                                c0112g1 = c0112g1M2122I2;
                                if (!C0015Ae.m49H(method4.getReturnType().getName(), "java.", false) && !C0015Ae.m49H(method4.getReturnType().getName(), "android.", false)) {
                                    Class<?> returnType = method4.getReturnType();
                                    C0631i9.m1481d(returnType, "getReturnType(...)");
                                    linkedHashSet.add(returnType);
                                }
                            }
                            C0112G1 c0112g1M2122I3 = C0889w1.m2122I(method4.getParameterTypes());
                            while (c0112g1M2122I3.hasNext()) {
                                Class cls8 = (Class) c0112g1M2122I3.next();
                                if (!cls8.isPrimitive()) {
                                    C0112G1 c0112g12 = c0112g1M2122I3;
                                    if (!C0015Ae.m49H(cls8.getName(), "java.", false) && !C0015Ae.m49H(cls8.getName(), "android.", false)) {
                                        linkedHashSet.add(cls8);
                                    }
                                    c0112g1M2122I3 = c0112g12;
                                }
                            }
                            c0112g1M2122I2 = c0112g1;
                        }
                        superclass = cls7.getSuperclass();
                        classLoader3 = classLoader2;
                        clsM1892v = cls6;
                    }
                    classLoader = classLoader3;
                    cls = clsM1892v;
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        Class<?> cls9 = (Class) it2.next();
                        Method[] declaredMethods = cls9.getDeclaredMethods();
                        C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                        int length = declaredMethods.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                it = it2;
                                cls2 = cls9;
                                method3 = null;
                                break;
                            }
                            method3 = declaredMethods[i];
                            it = it2;
                            cls2 = cls9;
                            if (method3.getParameterTypes().length == 2 && C0631i9.m1478a(method3.getParameterTypes()[0], cls3) && C0631i9.m1478a(method3.getParameterTypes()[1], String.class) && C0631i9.m1478a(method3.getReturnType(), Void.TYPE)) {
                                break;
                            }
                            i++;
                            it2 = it;
                            cls9 = cls2;
                        }
                        if (method3 != null) {
                            String str = "hookConvEventFilter: found DataSource via adapter probe: " + cls2.getName() + "." + method3.getName() + "(int,String)";
                            C0631i9.m1482e(str, "msg");
                            C0908x1.m2194b("[ConvRV] " + str);
                            clsM1892v = cls2;
                            break;
                        }
                        it2 = it;
                    }
                } else {
                    classLoader = classLoader3;
                    cls = clsM1892v;
                }
                clsM1892v = cls;
                if (clsM1892v == null) {
                    clsM1892v = m1892v(classLoader);
                }
            } else {
                c = 1;
            }
            if (clsM1892v == null) {
                C0908x1.m2194b("[ConvRV] hookConvEventFilter: no DataSource class found, event-layer SKIPPED (rely on memory/render layers)");
                return;
            }
            Method[] declaredMethods2 = clsM1892v.getDeclaredMethods();
            C0631i9.m1481d(declaredMethods2, "getDeclaredMethods(...)");
            int length2 = declaredMethods2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    method = null;
                    break;
                }
                method = declaredMethods2[i2];
                Method[] methodArr = declaredMethods2;
                if (method.getParameterTypes().length == 2 && C0631i9.m1478a(method.getParameterTypes()[0], cls3) && C0631i9.m1478a(method.getParameterTypes()[c], String.class)) {
                    break;
                }
                i2++;
                declaredMethods2 = methodArr;
            }
            if (method == null) {
                String str2 = "hookConvEventFilter: k(int,String) not found on " + clsM1892v.getName();
                C0631i9.m1482e(str2, "msg");
                C0908x1.m2194b("[ConvRV] " + str2);
                return;
            }
            C0173J8.m469h(c0173j8, "F001", method, new C0683l4(method, 0, this));
            C0908x1.m2194b("[ConvRV] hookConvEventFilter: hooked fh5.w.k(int,String)");
            try {
                Class<?> cls10 = this.f3234a;
                if (cls10 != null) {
                    Method[] declaredMethods3 = cls10.getDeclaredMethods();
                    C0631i9.m1481d(declaredMethods3, "getDeclaredMethods(...)");
                    int length3 = declaredMethods3.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            method2 = null;
                            break;
                        }
                        Method method5 = declaredMethods3[i3];
                        if (C0631i9.m1478a(method5.getName(), "i") && method5.getParameterTypes().length == 3) {
                            if (C0631i9.m1478a(method5.getParameterTypes()[0], cls3)) {
                                method2 = method5;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (method2 != null) {
                        C0173J8.m469h(c0173j8, "F001", method2, new C0607h4(this, 1));
                        C0908x1.m2194b("[ConvRV] hookConvEventFilter: also hooked fh5.w0.i(int,a1,Object)");
                    }
                }
                objM2206a2 = C0413Wf.f1577a;
            } catch (Throwable th) {
                objM2206a2 = C0920xd.m2206a(th);
            }
            objM2206a = new C0901wd(objM2206a2);
        } catch (Throwable th2) {
            objM2206a = C0920xd.m2206a(th2);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            String str3 = "hookConvEventFilter FAILED: " + thM2189a.getMessage();
            C0631i9.m1482e(str3, "msg");
            C0908x1.m2194b("[ConvRV] ".concat(str3));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1908p(C0173J8 c0173j8, Class<?> cls) {
        Method methodM15d = C0002A1.m15d(cls, "getView", Integer.TYPE, View.class, ViewGroup.class);
        if (methodM15d == null) {
            return;
        }
        ClassLoader classLoader = C0889w1.f3479g;
        if (classLoader != null) {
            C0002A1.m13b(classLoader, "com.tencent.mm.autogen.table.BaseConversation");
        }
        c0173j8.m470f(methodM15d).intercept(new C0759p4(this, 0));
    }

    /* JADX INFO: renamed from: q */
    public final void m1909q(C0173J8 c0173j8) {
        C0908x1.m2194b("[DIAG-T3-LV] hooking ListView.setAdapter");
        C0173J8.m466d(c0173j8, "F001", "android.widget.ListView", "setAdapter", new Class[]{ListAdapter.class}, new C0588g4(this, c0173j8, 1));
    }

    /* JADX INFO: renamed from: r */
    public final void m1910r(C0173J8 c0173j8, Method method, String str) {
        XposedInterface.HookHandle hookHandleM2206a;
        try {
            hookHandleM2206a = c0173j8.m470f(method).intercept(new C0740o4(this, 0, c0173j8));
        } catch (Throwable th) {
            hookHandleM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(hookHandleM2206a);
        if (thM2189a != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{C0944z.m2227g("installConvSetAdapterHook(", str, ") fail"), thM2189a}, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        r5 = p000a.C0889w1.m2122I(r0.getDeclaredMethods());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        if (r5.hasNext() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0104, code lost:
    
        r6 = (java.lang.reflect.Method) r5.next();
        r7 = r6.getReturnType();
        p000a.C0631i9.m1481d(r7, "getReturnType(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (m1891j(r7) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        r6 = p000a.C0889w1.m2122I(r6.getParameterTypes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        if (r6.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0128, code lost:
    
        r7 = (java.lang.Class) r6.next();
        p000a.C0631i9.m1479b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
    
        if (m1891j(r7) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0138, code lost:
    
        r0 = r0.getSuperclass();
        r1 = r1 + 1;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1911s(Object obj) {
        Object objM2206a;
        boolean z;
        boolean z2;
        String name = obj.getClass().getName();
        List<String> list = this.f3237d;
        if (list == null || !list.contains(name)) {
            boolean z3 = false;
            if (!C0015Ae.m49H(name, "com.tencent.mm.ui.conversation", false)) {
                Class<?> cls = obj.getClass();
                boolean zM49H = C0015Ae.m49H(cls.getName(), "com.tencent.mm.ui.contact", false);
                ConcurrentHashMap<Class<?>, Boolean> concurrentHashMap = this.f3259z;
                if (zM49H) {
                    concurrentHashMap.put(cls, Boolean.FALSE);
                    return false;
                }
                Boolean bool = concurrentHashMap.get(cls);
                if (bool != null) {
                    return bool.booleanValue();
                }
                try {
                    Method[] methods = cls.getMethods();
                    C0631i9.m1481d(methods, "getMethods(...)");
                    int length = methods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        Method method = methods[i];
                        if (C0631i9.m1478a(method.getName(), "getCount") || C0631i9.m1478a(method.getName(), "getItemCount")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            C0631i9.m1481d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                z = true;
                                break;
                            }
                        }
                        i++;
                    }
                    Method[] methods2 = cls.getMethods();
                    C0631i9.m1481d(methods2, "getMethods(...)");
                    int length2 = methods2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z2 = false;
                            break;
                        }
                        Method method2 = methods2[i2];
                        if (C0631i9.m1478a(method2.getName(), "getItem") && method2.getParameterTypes().length == 1 && C0631i9.m1478a(method2.getParameterTypes()[0], Integer.TYPE)) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    if (z || z2) {
                        Class<?> superclass = cls;
                        int i3 = 0;
                        loop2: while (superclass != null && !superclass.equals(Object.class) && i3 < 4) {
                            C0112G1 c0112g1M2122I = C0889w1.m2122I(superclass.getDeclaredFields());
                            while (true) {
                                if (!c0112g1M2122I.hasNext()) {
                                    break;
                                }
                                Field field = (Field) c0112g1M2122I.next();
                                if (!Modifier.isStatic(field.getModifiers())) {
                                    Class<?> type = field.getType();
                                    C0631i9.m1479b(type);
                                    if (m1891j(type)) {
                                        break loop2;
                                    }
                                }
                            }
                            z3 = true;
                            break loop2;
                        }
                    }
                    objM2206a = Boolean.valueOf(z3);
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                Object obj2 = Boolean.FALSE;
                if (objM2206a instanceof C0901wd.a) {
                    objM2206a = obj2;
                }
                Boolean bool2 = (Boolean) objM2206a;
                boolean zBooleanValue = bool2.booleanValue();
                concurrentHashMap.put(cls, bool2);
                if (zBooleanValue) {
                    C0908x1.m2194b(Arrays.copyOf(new Object[]{"[DIAG-PROBE] probeIsConvAdapter=true: ".concat(cls.getName())}, 1));
                }
                return zBooleanValue;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final void m1912t(ListAdapter listAdapter) {
        Object objM2206a;
        if (listAdapter == null) {
            return;
        }
        try {
            try {
                objM2206a = C0002A1.m12a(listAdapter, "getWrappedAdapter", new Object[0]);
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            if (objM2206a instanceof C0901wd.a) {
                objM2206a = null;
            }
            Object obj = objM2206a == null ? listAdapter : objM2206a;
            this.f3247n.put(obj, Boolean.TRUE);
            this.f3256w.clear();
            C0002A1.m12a(obj, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable th2) {
            C0920xd.m2206a(th2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1913u(View view) {
        try {
            Object objInvoke = view.getClass().getMethod("getAdapter", null).invoke(view, null);
            if (objInvoke == null) {
                return;
            }
            this.f3247n.put(objInvoke, Boolean.TRUE);
            this.f3256w.clear();
            C0002A1.m12a(objInvoke, "notifyDataSetChanged", new Object[0]);
        } catch (Throwable th) {
            C0920xd.m2206a(th);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1914y(boolean z, a.C1338a.EnumC1339a enumC1339a, InterfaceC0819s7<C0413Wf> interfaceC0819s7) {
        ((Handler) this.f3231C.m625a()).post(new RunnableC0641j0(enumC1339a, z, this, interfaceC0819s7));
    }

    /* JADX INFO: renamed from: z */
    public final void m1915z(boolean z, a.C1338a.EnumC1339a enumC1339a) {
        ((Handler) this.f3231C.m625a()).post(new RunnableC0702m4(enumC1339a, z, this, 0));
    }
}
