package p049d9;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.ImageView;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p011ab.C0042b;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0429d2;
import p062e8.C0828b;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: d9.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0752m {

    /* JADX INFO: renamed from: j */
    public static final Paint f2240j = new Paint(3);

    /* JADX INFO: renamed from: a */
    public final C3742g f2241a;

    /* JADX INFO: renamed from: b */
    public final C0042b f2242b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap.KeySetView f2243c;

    /* JADX INFO: renamed from: d */
    public final Map f2244d;

    /* JADX INFO: renamed from: e */
    public final Map f2245e;

    /* JADX INFO: renamed from: f */
    public final Map f2246f;

    /* JADX INFO: renamed from: g */
    public final Map f2247g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f2248h;

    /* JADX INFO: renamed from: i */
    public boolean f2249i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0752m(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f2241a = c3742g;
        this.f2242b = c0042b;
        this.f2243c = ConcurrentHashMap.newKeySet();
        this.f2244d = AbstractC3199a.m6843p();
        this.f2245e = AbstractC3199a.m6843p();
        this.f2246f = AbstractC3199a.m6843p();
        this.f2247g = AbstractC3199a.m6843p();
        this.f2248h = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1936a(C0752m c0752m, String str, EnumC0740a enumC0740a) {
        String str2;
        C0414a c0414a;
        String str3;
        C3742g c3742g = c0752m.f2241a;
        if (C0429d2.m1438q(str)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ConcurrentHashMap concurrentHashMap = c0752m.f2248h;
            C0749j c0749j = (C0749j) concurrentHashMap.get(str);
            Object obj = null;
            if (c0749j == null) {
                Iterator it = AbstractC0473o2.m1485i(c3742g.f12143a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C0429d2.m1421F(((C0414a) next).f1179a).equals(str)) {
                        obj = next;
                        break;
                    }
                }
                C0414a c0414a2 = (C0414a) obj;
                concurrentHashMap.put(str, new C0749j(jCurrentTimeMillis, c0414a2));
                c0414a = c0414a2;
                if (c0414a == null && (str3 = c0414a.f1186h) != null && (!AbstractC3149m.m6721t0(str3))) {
                    return true;
                }
            } else {
                if (jCurrentTimeMillis - c0749j.f2231a > 1000) {
                    c0749j = null;
                }
                if (c0749j != null) {
                    c0414a = c0749j.f2232b;
                }
                if (c0414a == null) {
                }
            }
        } else {
            Context context = c3742g.f12143a;
            if (AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean("enable", false)) {
                int iOrdinal = enumC0740a.ordinal();
                if (iOrdinal == 0) {
                    str2 = "scope_chat";
                } else if (iOrdinal == 1) {
                    str2 = "scope_conversation";
                } else if (iOrdinal == 2) {
                    str2 = "scope_contacts";
                } else if (iOrdinal == 3) {
                    str2 = "scope_profile";
                } else if (iOrdinal == 4) {
                    str2 = "scope_moments";
                } else {
                    if (iOrdinal != 5) {
                        C3193a.m6822k();
                        return false;
                    }
                    str2 = "scope_other_ui";
                }
                return AbstractC4302b.m8640c(context, "Hchat_custom_friend_avatar_config").getBoolean(str2, true);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final float m1937b(C0752m c0752m, Object[] objArr, int i9, int i10) {
        c0752m.getClass();
        Object objM8366C0 = AbstractC4165l.m8366C0(i10, objArr);
        Number number = objM8366C0 instanceof Number ? (Number) objM8366C0 : null;
        if (((number != null ? number.intValue() : 0) & 4) != 0) {
            return 0.1f;
        }
        Object objM8366C02 = AbstractC4165l.m8366C0(i9, objArr);
        Number number2 = objM8366C02 instanceof Number ? (Number) objM8366C02 : null;
        if (number2 == null) {
            return 0.1f;
        }
        float fFloatValue = number2.floatValue();
        Float fValueOf = fFloatValue > 0.0f ? Float.valueOf(fFloatValue) : null;
        if (fValueOf == null) {
            return 0.1f;
        }
        float fFloatValue2 = fValueOf.floatValue();
        if (fFloatValue2 > 0.5f) {
            return 0.5f;
        }
        return fFloatValue2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Bitmap m1938c(C0752m c0752m, Bitmap bitmap, Float f3) {
        Object c3959f;
        Bitmap bitmap2;
        float fM5018X = 0.1f;
        if (AbstractC4302b.m8640c(c0752m.f2241a.f12143a, "Hchat_round_avatar_config").getBoolean("round_avatar_enable", false)) {
            fM5018X = AbstractC2043a.m5018X(AbstractC3754e0.m7907q(AbstractC4302b.m8640c(c0752m.f2241a.f12143a, "Hchat_round_avatar_config").getFloat("round_avatar_radius_factor", 0.5f), 0.1f, 0.5f) * 100.0f) / 100.0f;
        } else if (f3 != null) {
            if (f3.floatValue() <= 0.0f) {
                f3 = null;
            }
            if (f3 != null) {
                float fFloatValue = f3.floatValue();
                fM5018X = fFloatValue > 0.5f ? 0.5f : fFloatValue;
            }
        }
        synchronized (C0742c.f2209a) {
            WeakHashMap weakHashMap = C0742c.f2210b;
            C0741b c0741b = (C0741b) weakHashMap.get(bitmap);
            if (c0741b != null) {
                if (c0741b.f2207a != fM5018X) {
                    c0741b = null;
                }
                if (c0741b != null && (bitmap2 = (Bitmap) c0741b.f2208b.get()) != null) {
                    Bitmap bitmap3 = bitmap2.isRecycled() ? null : bitmap2;
                    if (bitmap3 != null) {
                        return bitmap3;
                    }
                }
            }
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Paint paint = new Paint(3);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) * fM5018X;
                new Canvas(bitmapCreateBitmap).drawRoundRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), fMin, fMin, paint);
                weakHashMap.put(bitmap, new C0741b(fM5018X, new WeakReference(bitmapCreateBitmap)));
                c3959f = bitmapCreateBitmap;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            return (Bitmap) (c3959f instanceof C3959f ? bitmap : c3959f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m1939f(Method method) {
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && Arrays.equals(method.getParameterTypes(), new Class[]{ImageView.class, String.class, Float.TYPE, Boolean.TYPE});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m1940g(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes.length == 7 && parameterTypes[0].getName().equals("com.tencent.mm.sdk.coroutines.LifecycleScope") && AbstractC1416l.m3825a(parameterTypes[1], String.class) && AbstractC1416l.m3825a(parameterTypes[2], Float.TYPE)) {
            for (Class<?> cls : parameterTypes) {
                if (AbstractC1416l.m3825a(cls, Integer.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0067 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    public final List m1941d(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f2241a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0((String[]) Arrays.copyOf(strArr, strArr.length));
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                try {
                    boolean zM4352t = c1730o.m4352t();
                    ClassLoader classLoader = c3742g.f12145c;
                    if (zM4352t) {
                        classLoader.getClass();
                        c3959f2 = c1730o.m4348p().m6022a(classLoader);
                    } else {
                        c3959f2 = c1730o.m4350r(classLoader);
                    }
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Executable executable = (Executable) c3959f2;
                if (executable != null) {
                    c3959f.add(executable);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj = c3959f;
        if (thM8182b != null) {
            this.f2242b.invoke("定位头像入口失败", thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1942e(Executable executable, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        if (executable instanceof Method) {
            Method method = (Method) executable;
            if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
                return false;
            }
        }
        ConcurrentHashMap.KeySetView keySetView = this.f2243c;
        if (!keySetView.add(executable)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(executable, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            keySetView.remove(executable);
            this.f2242b.invoke("自定义好友头像 Hook 安装失败: " + executable, thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.lang.reflect.Method */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final C0748i m1943h() {
        Constructor constructor;
        Class cls;
        C0748i c0748i;
        Iterator it;
        boolean z9;
        C3742g c3742g = this.f2241a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_custom_friend_avatar_method_cache");
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strConcat = C0828b.m2091g(context, classLoader).concat("|custom_friend_avatar_v1");
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strConcat, classLoader, "legacy_load");
        if (methodM2087c == null || !m1939f(methodM2087c)) {
            methodM2087c = null;
        }
        Constructor constructorM2088d = C0828b.m2088d(sharedPreferencesM8640c, strConcat, classLoader, "worker_constructor");
        if (constructorM2088d == null || !m1940g(constructorM2088d)) {
            constructorM2088d = null;
        }
        if (methodM2087c != null && constructorM2088d != null) {
            Method methodM2087c2 = C0828b.m2087c(sharedPreferencesM8640c, strConcat, classLoader, "worker_modify");
            Method methodM2087c3 = C0828b.m2087c(sharedPreferencesM8640c, strConcat, classLoader, "worker_draw");
            if (methodM2087c3 != null && AbstractC1416l.m3825a(methodM2087c3.getDeclaringClass(), constructorM2088d.getDeclaringClass())) {
                return new C0748i(methodM2087c, constructorM2088d, methodM2087c2, methodM2087c3);
            }
        }
        List listM1941d = m1941d("MicroMsg.AvatarDrawable");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1941d) {
            if (obj instanceof Method) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (m1939f((Method) obj2)) {
                arrayList2.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (hashSet.add(((Method) obj3).toGenericString())) {
                arrayList3.add(obj3);
            }
        }
        List listM1941d2 = m1941d("workerScope", "username");
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listM1941d2) {
            if (obj4 instanceof Constructor) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : arrayList4) {
            if (m1940g((Constructor) obj5)) {
                arrayList5.add(obj5);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : arrayList5) {
            if (hashSet2.add(((Constructor) obj6).toGenericString())) {
                arrayList6.add(obj6);
            }
        }
        Method method = (Method) AbstractC4166m.m8400I1(arrayList3);
        if (method == null || (constructor = (Constructor) AbstractC4166m.m8400I1(arrayList6)) == null) {
            return null;
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : listM1941d2) {
            if (obj7 instanceof Method) {
                arrayList7.add(obj7);
            }
        }
        Iterator it2 = arrayList7.iterator();
        boolean z10 = false;
        Object obj8 = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            cls = Void.TYPE;
            if (!zHasNext) {
                c0748i = null;
                if (!z10) {
                    break;
                }
            } else {
                Object next = it2.next();
                Method method2 = (Method) next;
                c0748i = null;
                Class declaringClass = constructor.getDeclaringClass();
                declaringClass.getClass();
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (Modifier.isStatic(method2.getModifiers()) && AbstractC1416l.m3825a(method2.getReturnType(), cls) && AbstractC1416l.m3825a(method2.getDeclaringClass(), declaringClass)) {
                    it = it2;
                    if (parameterTypes.length == 8 && AbstractC1416l.m3825a(parameterTypes[0], declaringClass) && parameterTypes[1].getName().equals("com.tencent.mm.sdk.coroutines.LifecycleScope") && AbstractC1416l.m3825a(parameterTypes[2], String.class) && AbstractC1416l.m3825a(parameterTypes[3], Float.TYPE)) {
                        int length = parameterTypes.length;
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = length;
                            if (AbstractC1416l.m3825a(parameterTypes[i9], Integer.TYPE)) {
                                z9 = true;
                                break;
                            }
                            i9++;
                            length = i10;
                        }
                    }
                } else {
                    it = it2;
                }
                z9 = false;
                if (!z9) {
                    it2 = it;
                } else {
                    if (z10) {
                        break;
                    }
                    obj8 = next;
                    it2 = it;
                    z10 = true;
                }
            }
        }
        obj8 = c0748i;
        Method method3 = (Method) obj8;
        Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(constructor.getDeclaringClass(), "draw", Canvas.class);
        if (methodFindDeclaredMethod == null) {
            return c0748i;
        }
        boolean zM3825a = AbstractC1416l.m3825a(methodFindDeclaredMethod.getReturnType(), cls);
        Method method4 = methodFindDeclaredMethod;
        if (!zM3825a) {
            method4 = c0748i;
        }
        if (method4 == 0) {
            return c0748i;
        }
        C0828b.m2092h(sharedPreferencesM8640c, strConcat, "legacy_load", method);
        C0828b.m2093i(sharedPreferencesM8640c, strConcat, "worker_constructor", constructor);
        if (method3 != null) {
            C0828b.m2092h(sharedPreferencesM8640c, strConcat, "worker_modify", method3);
        }
        C0828b.m2092h(sharedPreferencesM8640c, strConcat, "worker_draw", method4);
        return new C0748i(method, constructor, method3, method4);
    }
}
