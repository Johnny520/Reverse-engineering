package ac;

import ag.AbstractC0085a;
import ai.C0089b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RenderEffect;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import be.AbstractC0283h;
import bg.AbstractC0311a;
import bsh.C0353j;
import ch.C0570e;
import gg.AbstractC1416l;
import gh.C1431c;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import na.C2913a;
import na.C2922j;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.luckypray.dexkit.DexKitBridge;
import p005a5.C0016a;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p046d6.C0709f;
import p057e1.C0807b;
import p057e1.C0808c;
import p057e1.C0809d;
import p057e1.C0810e;
import p061e5.C0826a;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p069f.C0933f0;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1013l;
import p071f1.AbstractC1018n0;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.C1015m;
import p074f5.AbstractC1066b;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p086fh.C1252j;
import p086fh.C1253k;
import p086fh.C1254l;
import p092g4.AbstractC1341a;
import p094g6.AbstractC1355c;
import p099h.Hchat.R;
import p105h6.C1609a;
import p105h6.C1615g;
import p115hh.C1716a;
import p115hh.C1717b;
import p115hh.C1719d;
import p115hh.C1730o;
import p115hh.C1731p;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p119i2.C1955z;
import p126ia.C2007a0;
import p134j6.C2066d;
import p136j8.C2104o;
import p143jh.C2137a;
import p143jh.C2138b;
import p143jh.C2139c;
import p143jh.C2140d;
import p143jh.C2141e;
import p143jh.C2142f;
import p143jh.C2143g;
import p143jh.C2144h;
import p143jh.C2145i;
import p143jh.C2146j;
import p143jh.C2147k;
import p143jh.C2148l;
import p143jh.C2149m;
import p143jh.C2150n;
import p143jh.C2151o;
import p143jh.C2152p;
import p150k5.C2245b;
import p174m.C2571a;
import p174m.EnumC2640p1;
import p187n.C2851e;
import p187n.C2857k;
import p218og.AbstractC3149m;
import p218og.AbstractC3155s;
import p218og.AbstractC3156t;
import p224p1.C3286a;
import p224p1.C3287b;
import p251r.C3631p;
import p251r.C3632q;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p279t1.C4082b;
import p281t3.AbstractC4106c;
import p293u2.C4231a;
import p294u3.InterfaceC4250c;
import p300ub.AbstractC4302b;
import p304uf.C4333g;
import p304uf.C4335i;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4428t;
import p321w.AbstractC4634s;
import p378z6.C6102b;
import p378z6.EnumC6103c;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: ac.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0063p {

    /* JADX INFO: renamed from: a */
    public static volatile ExecutorService f215a;

    /* JADX INFO: renamed from: b */
    public static volatile C2007a0 f216b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m391A(Method method) {
        if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && !Modifier.isStatic(method.getModifiers()) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.component.")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m392B(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], Long.TYPE) && AbstractC1416l.m3825a(method.getReturnType(), cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m393C(Class cls, Method method) {
        if (!Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static String m394D(List list) {
        if (list == null) {
            return "null";
        }
        if (list.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (list.size() == 1) {
            return Objects.toString(list.get(0));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        sb2.append(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00e4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX INFO: renamed from: E */
    public static final Method m395E(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        Object c3959f2;
        c3742g.getClass();
        interfaceC1235p.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_multi_select_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, "menu_click_v1");
        if (methodM2087c != null) {
            if (!m432y(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("onMMMenuItemSelected", 5);
            C1253k.m3366q0(c1253k, "void");
            c1253k.m3372o0("android.view.MenuItem", "int");
            c1253k.m3374r0("FinalShareCountByType");
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                try {
                    c1730o.getClass();
                    c3959f2 = c1730o.m4348p().m6023b(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m432y((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke("定位多选消息菜单点击方法失败", thM8182b);
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r12 = c3959f;
        if (z9) {
            r12 = C4173t.f13710g;
        }
        return m403M(sharedPreferencesM8640c, strM2091g, "menu_click_v1", (List) r12, "菜单点击", interfaceC1235p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x00e8 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX INFO: renamed from: F */
    public static final Method m396F(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        Object c3959f2;
        c3742g.getClass();
        interfaceC1235p.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_multi_select_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, "menu_create_v2");
        if (methodM2087c != null) {
            if (!m433z(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.f4103g = new C1431c("onCreateMMMenu", 5);
            C1253k.m3366q0(c1253k, "void");
            C1253k c1253k2 = new C1253k();
            c1253k2.m3369l0(5, "com.tencent.wework.api.WWAPIFactory");
            C1254l c1254l = c1253k.f4109m;
            if (c1254l == null) {
                c1254l = new C1254l();
            }
            c1253k.f4109m = c1254l;
            c1254l.m3377k0(c1253k2);
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                try {
                    c1730o.getClass();
                    c3959f2 = c1730o.m4348p().m6023b(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m433z((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke("定位多选消息菜单创建方法失败", thM8182b);
        }
        boolean z9 = c3959f instanceof C3959f;
        ?? r12 = c3959f;
        if (z9) {
            r12 = C4173t.f13710g;
        }
        return m403M(sharedPreferencesM8640c, strM2091g, "menu_create_v2", (List) r12, "菜单创建", interfaceC1235p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x00f0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX INFO: renamed from: G */
    public static final Method m397G(C3742g c3742g, Method method, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        Object c3959f2;
        C4173t c4173t = C4173t.f13710g;
        c3742g.getClass();
        interfaceC1235p.getClass();
        Context context = c3742g.f12143a;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_multi_select_menu_method_cache");
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, "multi_select_exit_v1");
        if (methodM2087c != null) {
            if (!m391A(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3366q0(c1253k, "void");
            C1252j c1252j = new C1252j(1);
            c1252j.f4101h = new ArrayList(c4173t);
            c1253k.f4106j = c1252j;
            c1253k.m3369l0(2, "com.tencent.mm.ui.chatting.component.");
            C1253k c1253k2 = new C1253k(method);
            C1254l c1254l = c1253k.f4110n;
            if (c1254l == null) {
                c1254l = new C1254l();
            }
            c1253k.f4110n = c1254l;
            c1254l.m3377k0(c1253k2);
            c0570e.f1764h = c1253k;
            C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            for (C1730o c1730o : c1731pFindMethod) {
                try {
                    c1730o.getClass();
                    c3959f2 = c1730o.m4348p().m6023b(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method2 = (Method) c3959f2;
                if (method2 != null) {
                    arrayList.add(method2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m391A((Method) obj)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (hashSet.add(((Method) obj2).toGenericString())) {
                    c3959f.add(obj2);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            interfaceC1235p.invoke("定位多选消息原生退出方法失败", thM8182b);
        }
        ?? r12 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r12 = c3959f;
        }
        return m403M(sharedPreferencesM8640c, strM2091g, "multi_select_exit_v1", (List) r12, "原生退出", interfaceC1235p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static final long m398H(C3287b c3287b, EnumC2640p1 enumC2640p1, C3286a c3286a, boolean z9) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j3;
        long j4 = c3287b.f10456g;
        if (enumC2640p1 != null) {
            int i9 = c3286a.f10449a;
            if (i9 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            } else if (i9 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j4 & 4294967295L));
            }
            if (enumC2640p1 == EnumC2640p1.f8623h) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j3 = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j3 = jFloatToRawIntBits3 << 32;
            }
            j4 = j3 | (jFloatToRawIntBits & 4294967295L);
        }
        long jM2041d = C0807b.m2041d(m399I(c3287b, enumC2640p1, c3286a), j4);
        if (z9 || !c3287b.f10458i) {
            return jM2041d;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static final long m399I(C3287b c3287b, EnumC2640p1 enumC2640p1, C3286a c3286a) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j3;
        if (enumC2640p1 == null) {
            return c3287b.f10452c;
        }
        int i9 = c3286a.f10449a;
        if (i9 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c3287b.f10452c >> 32));
        } else {
            if (i9 != 2) {
                return c3287b.f10452c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c3287b.f10452c & 4294967295L));
        }
        if (enumC2640p1 == EnumC2640p1.f8623h) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j3 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j3 = jFloatToRawIntBits3 << 32;
        }
        return j3 | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static List m400J(Resources resources, int i9) {
        if (i9 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i9);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i9);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC0996c0 m401K(long j3, float f3, EnumC6103c enumC6103c) {
        double[] dArrM10859a;
        char c10;
        char c11;
        enumC6103c.getClass();
        int i9 = (int) (j3 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i9);
        int i10 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10);
        float fM2055b = C0810e.m2055b(j3) * 0.5f;
        if (f3 == 0.0f) {
            return new C1012k0(new C0808c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2));
        }
        if (enumC6103c == EnumC6103c.f24634g || (fIntBitsToFloat == fIntBitsToFloat2 && f3 >= fM2055b)) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
            return new C1014l0(new C0809d(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i9);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
        C1009j c1009jM2609a = AbstractC1013l.m2609a();
        Path path = c1009jM2609a.f3191a;
        C6102b c6102b = C6102b.f24622l;
        double d10 = fIntBitsToFloat3;
        double d11 = fIntBitsToFloat4;
        double d12 = f3;
        double d13 = ((d10 * 0.5d) - d12) / d12;
        if (d13 < 0.0d) {
            d13 = 0.0d;
        }
        if (d13 > 1.0d) {
            d13 = 1.0d;
        }
        double d14 = ((0.5d * d11) - d12) / d12;
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        if (d14 > 1.0d) {
            d14 = 1.0d;
        }
        c6102b.getClass();
        if (d13 == 0.0d) {
            c10 = 0;
        } else {
            if (d13 != 1.0d) {
                dArrM10859a = d13 == d14 ? c6102b.m10859a(d13) : c6102b.m10860b(d13, d14);
                if (dArrM10859a.length >= 20) {
                    double d15 = d10 - d12;
                    path.moveTo((float) ((dArrM10859a[0] * d12) + d15), (float) ((dArrM10859a[1] * d12) + 0.0d));
                    c1009jM2609a.m2602d((float) ((dArrM10859a[2] * d12) + d15), (float) ((dArrM10859a[3] * d12) + 0.0d), (float) ((dArrM10859a[4] * d12) + d15), (float) ((dArrM10859a[5] * d12) + 0.0d), (float) ((dArrM10859a[6] * d12) + d15), (float) ((dArrM10859a[7] * d12) + 0.0d));
                    c1009jM2609a.m2602d((float) ((dArrM10859a[8] * d12) + d15), (float) ((dArrM10859a[9] * d12) + 0.0d), (float) ((dArrM10859a[10] * d12) + d15), (float) ((dArrM10859a[11] * d12) + 0.0d), (float) ((dArrM10859a[12] * d12) + d15), (float) ((dArrM10859a[13] * d12) + 0.0d));
                    c1009jM2609a.m2602d((float) ((dArrM10859a[14] * d12) + d15), (float) ((dArrM10859a[15] * d12) + 0.0d), (float) ((dArrM10859a[16] * d12) + d15), (float) ((dArrM10859a[17] * d12) + 0.0d), (float) ((dArrM10859a[18] * d12) + d15), (float) ((dArrM10859a[19] * d12) + 0.0d));
                    c1009jM2609a.m2604f((float) ((dArrM10859a[18] * d12) + d15), (float) (d11 - (dArrM10859a[19] * d12)));
                    c1009jM2609a.m2602d((float) ((dArrM10859a[16] * d12) + d15), (float) (d11 - (dArrM10859a[17] * d12)), (float) ((dArrM10859a[14] * d12) + d15), (float) (d11 - (dArrM10859a[15] * d12)), (float) ((dArrM10859a[12] * d12) + d15), (float) (d11 - (dArrM10859a[13] * d12)));
                    c1009jM2609a.m2602d((float) ((dArrM10859a[10] * d12) + d15), (float) (d11 - (dArrM10859a[11] * d12)), (float) ((dArrM10859a[8] * d12) + d15), (float) (d11 - (dArrM10859a[9] * d12)), (float) ((dArrM10859a[6] * d12) + d15), (float) (d11 - (dArrM10859a[7] * d12)));
                    c1009jM2609a.m2602d((float) ((dArrM10859a[4] * d12) + d15), (float) (d11 - (dArrM10859a[5] * d12)), (float) ((dArrM10859a[2] * d12) + d15), (float) (d11 - (dArrM10859a[3] * d12)), (float) ((dArrM10859a[0] * d12) + d15), (float) (d11 - (dArrM10859a[1] * d12)));
                    c1009jM2609a.m2604f((float) (d12 - (dArrM10859a[0] * d12)), (float) (d11 - (dArrM10859a[1] * d12)));
                    c1009jM2609a.m2602d((float) (d12 - (dArrM10859a[2] * d12)), (float) (d11 - (dArrM10859a[3] * d12)), (float) (d12 - (dArrM10859a[4] * d12)), (float) (d11 - (dArrM10859a[5] * d12)), (float) (d12 - (dArrM10859a[6] * d12)), (float) (d11 - (dArrM10859a[7] * d12)));
                    c1009jM2609a.m2602d((float) (d12 - (dArrM10859a[8] * d12)), (float) (d11 - (dArrM10859a[9] * d12)), (float) (d12 - (dArrM10859a[10] * d12)), (float) (d11 - (dArrM10859a[11] * d12)), (float) (d12 - (dArrM10859a[12] * d12)), (float) (d11 - (dArrM10859a[13] * d12)));
                    c1009jM2609a.m2602d((float) (d12 - (dArrM10859a[14] * d12)), (float) (d11 - (dArrM10859a[15] * d12)), (float) (d12 - (dArrM10859a[16] * d12)), (float) (d11 - (dArrM10859a[17] * d12)), (float) (d12 - (dArrM10859a[18] * d12)), (float) (d11 - (dArrM10859a[19] * d12)));
                    c1009jM2609a.m2604f((float) (d12 - (dArrM10859a[18] * d12)), (float) ((dArrM10859a[19] * d12) + 0.0d));
                    c1009jM2609a.m2602d((float) (d12 - (dArrM10859a[16] * d12)), (float) ((dArrM10859a[17] * d12) + 0.0d), (float) (d12 - (dArrM10859a[14] * d12)), (float) ((dArrM10859a[15] * d12) + 0.0d), (float) (d12 - (dArrM10859a[12] * d12)), (float) ((dArrM10859a[13] * d12) + 0.0d));
                    c1009jM2609a.m2602d((float) (d12 - (dArrM10859a[10] * d12)), (float) ((dArrM10859a[11] * d12) + 0.0d), (float) (d12 - (dArrM10859a[8] * d12)), (float) ((dArrM10859a[9] * d12) + 0.0d), (float) (d12 - (dArrM10859a[6] * d12)), (float) ((dArrM10859a[7] * d12) + 0.0d));
                    c1009jM2609a.m2602d((float) (d12 - (dArrM10859a[4] * d12)), (float) ((dArrM10859a[5] * d12) + 0.0d), (float) (d12 - (dArrM10859a[2] * d12)), (float) ((dArrM10859a[3] * d12) + 0.0d), (float) (d12 - (dArrM10859a[0] * d12)), (float) ((dArrM10859a[1] * d12) + 0.0d));
                    path.close();
                }
                return new C1010j0(c1009jM2609a);
            }
            c10 = 1;
        }
        if (d14 == 0.0d) {
            c11 = 0;
        } else {
            if (d14 != 1.0d) {
                dArrM10859a = d13 == d14 ? c6102b.m10859a(d13) : c6102b.m10860b(d13, d14);
                if (dArrM10859a.length >= 20) {
                }
                return new C1010j0(c1009jM2609a);
            }
            c11 = 1;
        }
        dArrM10859a = c6102b.f24633k[c10][c11];
        if (dArrM10859a.length >= 20) {
        }
        return new C1010j0(c1009jM2609a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static final C1015m m402L(C0089b c0089b, String str) {
        c0089b.getClass();
        RenderEffect renderEffectCreateRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(c0089b.f255a, str);
        renderEffectCreateRuntimeShaderEffect.getClass();
        return new C1015m(renderEffectCreateRuntimeShaderEffect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static Method m403M(SharedPreferences sharedPreferences, String str, String str2, List list, String str3, InterfaceC1235p interfaceC1235p) {
        Method method = (Method) AbstractC4166m.m8400I1(list);
        if (method != null) {
            C0828b.m2092h(sharedPreferences, str, str2, method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear().putString("cache.key", str);
            }
            editorEdit.remove(str2).apply();
        } catch (Throwable unused) {
        }
        if (list.size() > 1) {
            interfaceC1235p.invoke(AbstractC0255e.m1021j("多选消息", str3, "候选不唯一: ", AbstractC4166m.m8392A1(list, null, null, null, new C1955z(18), 31)), null);
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static Set m404N(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static final C0808c m405O(InterfaceC4428t interfaceC4428t) {
        C0808c c0808cM8882f = AbstractC4434w.m8882f(interfaceC4428t, true);
        long jMo8860R = interfaceC4428t.mo8860R(c0808cM8882f.m2048d());
        float f3 = c0808cM8882f.f2418c;
        float f10 = c0808cM8882f.f2419d;
        long jMo8860R2 = interfaceC4428t.mo8860R((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L));
        return new C0808c(Float.intBitsToFloat((int) (jMo8860R >> 32)), Float.intBitsToFloat((int) (jMo8860R & 4294967295L)), Float.intBitsToFloat((int) (jMo8860R2 >> 32)), Float.intBitsToFloat((int) (jMo8860R2 & 4294967295L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: P */
    public static final int m406P(C3631p c3631p) {
        ?? r02 = c3631p.f11746k;
        if (r02.isEmpty()) {
            return 0;
        }
        int size = r02.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += ((C3632q) r02.get(i10)).f11768p;
        }
        return (i9 / r02.size()) + c3631p.f11752q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static void m407Q(C0826a c0826a, Set set) {
        Iterator it = set.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            C2245b c2245b = (C2245b) it.next();
            if (!z9) {
                c0826a.write(10);
            }
            c0826a.write(".annotation ");
            int i9 = c2245b.f7442h;
            if (i9 < 0 || i9 >= 3) {
                throw new C0709f(null, "Invalid annotation visibility %d", Integer.valueOf(i9));
            }
            c0826a.write(AbstractC1066b.f3421a[i9]);
            c0826a.write(32);
            c0826a.write(c2245b.getType());
            c0826a.write(10);
            c0826a.m2082x(c2245b.m5493a());
            c0826a.write(".end annotation\n");
            z9 = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C0808c m408a(long j3, long j4) {
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (j3 & 4294967295L);
        return new C0808c(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m409b(C2571a c2571a, C3287b c3287b, EnumC2640p1 enumC2640p1, C3286a c3286a, C0016a c0016a, long j3) {
        float fIntBitsToFloat;
        C0933f0 c0933f0 = (C0933f0) c0016a.f56i;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c3287b.f10452c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c3287b.f10452c & 4294967295L));
        if (m417j(c3287b)) {
            c0016a.f55h = 0;
            c0933f0.m2289d();
        }
        if (!m410c(c3287b) && !m417j(c3287b)) {
            if (c0933f0.f2924b == 3) {
                int i9 = c0016a.f55h;
                c0016a.f55h = i9 + 1;
                c0933f0.m2299n(i9, c3287b);
            } else {
                c0933f0.m2286a(c3287b);
            }
            if (c0016a.f55h == 3) {
                c0016a.f55h = 0;
            }
            Object[] objArr = c0933f0.f2923a;
            int i10 = c0933f0.f2924b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C3287b) objArr[i11]).f10452c >> 32));
            }
            int i12 = c0933f0.f2924b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i12;
            Object[] objArr2 = c0933f0.f2923a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i13 = 0; i13 < i12; i13++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C3287b) objArr2[i13]).f10452c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / c0933f0.f2924b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (enumC2640p1 != null) {
            int i14 = c3286a.f10449a;
            if (i14 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i14 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = enumC2640p1 == EnumC2640p1.f8623h ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C4082b) c2571a.f8339h).m8264a(c3287b.f10451b, C0807b.m2042e(jFloatToRawIntBits, j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m410c(C3287b c3287b) {
        return c3287b.f10457h && !c3287b.f10453d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C2913a m411d(C2922j c2922j, String str, C2913a c2913a) {
        boolean z9;
        boolean z10;
        String str2 = AbstractC3149m.m6721t0(str) ? c2922j.f9513b : str;
        boolean z11 = c2922j.f9514c;
        int i9 = c2922j.f9515d;
        int i10 = c2922j.f9516e;
        long j3 = c2922j.f9517f;
        long j4 = c2922j.f9518g;
        long j5 = c2922j.f9519h;
        boolean z12 = c2922j.f9520i;
        int i11 = c2922j.f9524m;
        String str3 = c2922j.f9525n;
        boolean z13 = c2922j.f9526o;
        int i12 = c2922j.f9527p;
        int i13 = c2922j.f9528q;
        int i14 = c2922j.f9529r;
        String str4 = c2922j.f9530s;
        long j10 = c2922j.f9531t;
        boolean z14 = c2922j.f9532u;
        List list = c2922j.f9533v;
        List list2 = c2922j.f9534w;
        List list3 = list2 != null ? list2 : list;
        boolean z15 = c2922j.f9535x;
        if (z15) {
            z9 = z15;
            z10 = c2922j.f9536y;
        } else {
            z9 = z15;
            z10 = c2913a.f9444w;
        }
        return new C2913a(str2, z11, i9, i10, j3, j4, j5, z12, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, i11, str3, z13, i12, i13, i14, str4, j10, z14, list, list3, z10, z9 ? c2922j.f9537z : c2913a.f9445x, z9 ? c2922j.f9500A : c2913a.f9446y, z9 ? c2922j.f9501B : c2913a.f9447z, z9 ? c2922j.f9502C : c2913a.f9412A, z9 ? c2922j.f9503D : c2913a.f9413B, z9 ? c2922j.f9504E : c2913a.f9414C, z9 ? c2922j.f9505F : c2913a.f9415D, z9 ? c2922j.f9506G : c2913a.f9416E, z9 ? c2922j.f9507H : c2913a.f9417F, z9 ? c2922j.f9508I : c2913a.f9418G, z9 ? c2922j.f9509J : c2913a.f9419H, z9 ? c2922j.f9510K : c2913a.f9420I, z9 ? c2922j.f9511L : c2913a.f9421J);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m412e(Throwable th2, Throwable th3) {
        th2.getClass();
        th3.getClass();
        if (th2 != th3) {
            Integer num = AbstractC0311a.f888a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = AbstractC0085a.f250a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m413f(StringBuilder sb2, Object obj, InterfaceC1231l interfaceC1231l) {
        if (interfaceC1231l != null) {
            sb2.append((CharSequence) interfaceC1231l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: g */
    public static boolean m414g(String str, Map map) {
        String str2;
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() != 0;
        }
        if (obj instanceof String) {
            String lowerCase = AbstractC3149m.m6703R0((String) obj).toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case 48:
                    if (lowerCase.equals("0")) {
                        return false;
                    }
                    break;
                case 49:
                    str2 = "1";
                    lowerCase.equals(str2);
                    return true;
                case 3521:
                    if (lowerCase.equals("no")) {
                        return false;
                    }
                    break;
                case 3551:
                    str2 = "on";
                    lowerCase.equals(str2);
                    return true;
                case 109935:
                    if (lowerCase.equals("off")) {
                        return false;
                    }
                    break;
                case 119527:
                    str2 = "yes";
                    lowerCase.equals(str2);
                    return true;
                case 3569038:
                    str2 = "true";
                    lowerCase.equals(str2);
                    return true;
                case 97196323:
                    if (lowerCase.equals("false")) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C4335i m415h(C4335i c4335i) {
        C4333g c4333g = c4335i.f14493g;
        c4333g.m8780c();
        return c4333g.f14485o > 0 ? c4335i : C4335i.f14492h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final AbstractC1018n0 m416i(AbstractC1018n0 abstractC1018n0, AbstractC1018n0 abstractC1018n02) {
        if (abstractC1018n0 == null) {
            return abstractC1018n02;
        }
        RenderEffect renderEffectCreateChainEffect = RenderEffect.createChainEffect(abstractC1018n02.m2619f(), abstractC1018n0.m2619f());
        renderEffectCreateChainEffect.getClass();
        return new C1015m(renderEffectCreateChainEffect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final boolean m417j(C3287b c3287b) {
        return !c3287b.f10457h && c3287b.f10453d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m418k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0353j.m1305c(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m419l(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() != 0) {
            if (!AbstractC3156t.m6740d0(string, "#", false)) {
                string = "#".concat(string);
            }
            String strSubstring = string.substring(1);
            if (strSubstring.length() == 6 || strSubstring.length() == 8) {
                for (int i9 = 0; i9 < strSubstring.length(); i9++) {
                    char cCharAt = strSubstring.charAt(i9);
                    if (('0' <= cCharAt && cCharAt < ':') || ('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G')) {
                    }
                }
                String upperCase = strSubstring.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return "#".concat(upperCase);
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m420m(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{','}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            String strM419l = m419l((String) it.next());
            if (!(strM419l.length() > 0)) {
                strM419l = null;
            }
            if (strM419l != null) {
                arrayList.add(strM419l);
            }
        }
        List listM8403L1 = AbstractC4166m.m8403L1(2, arrayList);
        if (listM8403L1.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (listM8403L1.size() == 1 || AbstractC1416l.m3825a(listM8403L1.get(0), listM8403L1.get(1))) {
            return (String) listM8403L1.get(0);
        }
        return listM8403L1.get(0) + "," + listM8403L1.get(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC1809a1 m421n(C2857k c2857k, C1836h0 c1836h0) {
        Object objM4514P = c1836h0.m4514P();
        C1823e c1823e = C1851l.f6155a;
        if (objM4514P == c1823e) {
            objM4514P = AbstractC1874r.m4639u(Boolean.FALSE);
            c1836h0.m4545k0(objM4514P);
        }
        InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
        Object objM4514P2 = c1836h0.m4514P();
        if (objM4514P2 == c1823e) {
            objM4514P2 = new C2851e(c2857k, interfaceC1809a1, null, 2);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4624f((InterfaceC1235p) objM4514P2, c1836h0, c2857k);
        return interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static List m422o(List list, List list2) {
        int size = list.size();
        int size2 = list2.size();
        if (size == 0 && size2 == 0) {
            return Collections.EMPTY_LIST;
        }
        if (size == 0) {
            return list2;
        }
        if (size2 == 0) {
            return list;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(size + size2);
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return new ArrayList(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C1615g m423p() {
        C1615g c1615g = new C1615g();
        c1615g.f5312l = false;
        C2066d c2066dM5121b = c1615g.f5301a.clone();
        c2066dM5121b.f6944g = false;
        c1615g.f5301a = c2066dM5121b;
        c1615g.f5311k = 3;
        C1609a c1609a = C1609a.f5282e;
        Objects.requireNonNull(c1609a);
        c1615g.f5310j = c1609a;
        return c1615g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final long m424q(long j3, boolean z9, int i9, float f3) {
        int iM8504h = ((z9 || i9 == 2 || i9 == 4 || i9 == 5) && C4231a.m8500d(j3)) ? C4231a.m8504h(j3) : Integer.MAX_VALUE;
        if (C4231a.m8506j(j3) != iM8504h) {
            iM8504h = AbstractC3754e0.m7909r(AbstractC4634s.m9071n(f3), C4231a.m8506j(j3), iM8504h);
        }
        return AbstractC1089i.m2793u(0, iM8504h, 0, C4231a.m8503g(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static float m425r(String str, Map map) {
        Float fValueOf = null;
        Object obj = map != null ? map.get(str) : null;
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (!(obj instanceof String)) {
            return 12.0f;
        }
        String str2 = (String) obj;
        try {
            if (AbstractC3155s.m6730T(str2)) {
                fValueOf = Float.valueOf(Float.parseFloat(str2));
            }
        } catch (NumberFormatException unused) {
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 12.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C1716a m426s(DexKitBridge dexKitBridge, C2139c c2139c) {
        int i9;
        Object objValueOf;
        dexKitBridge.getClass();
        int iM3645b = c2139c.m3645b(4);
        if (iM3645b != 0) {
            c2139c.f4500b.getInt(iM3645b + c2139c.f4499a);
        }
        int i10 = 6;
        int iM3645b2 = c2139c.m3645b(6);
        if (iM3645b2 != 0) {
            c2139c.f4500b.getInt(iM3645b2 + c2139c.f4499a);
        }
        int iM3645b3 = c2139c.m3645b(8);
        String strM3647d = iM3645b3 != 0 ? c2139c.m3647d(iM3645b3 + c2139c.f4499a) : null;
        strM3647d.getClass();
        int iM3645b4 = c2139c.m3645b(10);
        byte b10 = 0;
        byte b11 = iM3645b4 != 0 ? c2139c.f4500b.get(iM3645b4 + c2139c.f4499a) : (byte) 0;
        if (b11 == 0) {
            i9 = 1;
        } else {
            i9 = 2;
            if (b11 != 1) {
                if (b11 == 2) {
                    i9 = 3;
                } else {
                    if (b11 != 3) {
                        C2104o.m5294t(AbstractC0921a.m2249l(b11, "Unknown AnnotationVisibilityType: "));
                        return null;
                    }
                    i9 = 0;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int iM3645b5 = c2139c.m3645b(12);
        int iM3649f = iM3645b5 != 0 ? c2139c.m3649f(iM3645b5) : 0;
        int i11 = 0;
        while (i11 < iM3649f) {
            C2137a c2137a = new C2137a();
            int iM3645b6 = c2139c.m3645b(12);
            if (iM3645b6 != 0) {
                int iM3644a = c2139c.m3644a((i11 * 4) + c2139c.m3648e(iM3645b6));
                ByteBuffer byteBuffer = c2139c.f4500b;
                byteBuffer.getClass();
                c2137a.m3646c(iM3644a, byteBuffer);
            } else {
                c2137a = null;
            }
            c2137a.getClass();
            C2137a c2137a2 = new C2137a();
            int iM3645b7 = c2137a.m3645b(i10);
            if (iM3645b7 != 0) {
                int iM3644a2 = c2137a.m3644a(iM3645b7 + c2137a.f4499a);
                ByteBuffer byteBuffer2 = c2137a.f4500b;
                byteBuffer2.getClass();
                c2137a2.m3646c(iM3644a2, byteBuffer2);
            } else {
                c2137a2 = null;
            }
            c2137a2.getClass();
            int iM3645b8 = c2137a.m3645b(4);
            String strM3647d2 = iM3645b8 != 0 ? c2137a.m3647d(iM3645b8 + c2137a.f4499a) : null;
            strM3647d2.getClass();
            int iM3645b9 = c2137a2.m3645b(i10);
            int iM257u = AbstractC0018a.m257u(iM3645b9 != 0 ? c2137a2.f4500b.get(iM3645b9 + c2137a2.f4499a) : b10);
            switch (AbstractC4106c.m8279b(iM257u)) {
                case 0:
                    AbstractC1355c abstractC1355cM5372p = c2137a2.m5372p(new C2142f());
                    abstractC1355cM5372p.getClass();
                    C2142f c2142f = (C2142f) abstractC1355cM5372p;
                    int iM3645b10 = c2142f.m3645b(4);
                    objValueOf = Byte.valueOf(iM3645b10 != 0 ? c2142f.f4500b.get(iM3645b10 + c2142f.f4499a) : (byte) 0);
                    break;
                case 1:
                    AbstractC1355c abstractC1355cM5372p2 = c2137a2.m5372p(new C2149m());
                    abstractC1355cM5372p2.getClass();
                    C2149m c2149m = (C2149m) abstractC1355cM5372p2;
                    int iM3645b11 = c2149m.m3645b(4);
                    objValueOf = Short.valueOf(iM3645b11 != 0 ? c2149m.f4500b.getShort(iM3645b11 + c2149m.f4499a) : (short) 0);
                    break;
                case 2:
                    AbstractC1355c abstractC1355cM5372p3 = c2137a2.m5372p(new C2143g());
                    abstractC1355cM5372p3.getClass();
                    C2143g c2143g = (C2143g) abstractC1355cM5372p3;
                    int iM3645b12 = c2143g.m3645b(4);
                    objValueOf = Short.valueOf(iM3645b12 != 0 ? c2143g.f4500b.getShort(iM3645b12 + c2143g.f4499a) : (short) 0);
                    break;
                case 3:
                    AbstractC1355c abstractC1355cM5372p4 = c2137a2.m5372p(new C2146j());
                    abstractC1355cM5372p4.getClass();
                    C2146j c2146j = (C2146j) abstractC1355cM5372p4;
                    int iM3645b13 = c2146j.m3645b(4);
                    objValueOf = Integer.valueOf(iM3645b13 != 0 ? c2146j.f4500b.getInt(iM3645b13 + c2146j.f4499a) : 0);
                    break;
                case 4:
                    AbstractC1355c abstractC1355cM5372p5 = c2137a2.m5372p(new C2147k());
                    abstractC1355cM5372p5.getClass();
                    C2147k c2147k = (C2147k) abstractC1355cM5372p5;
                    int iM3645b14 = c2147k.m3645b(4);
                    objValueOf = Long.valueOf(iM3645b14 != 0 ? c2147k.f4500b.getLong(iM3645b14 + c2147k.f4499a) : 0L);
                    break;
                case 5:
                    AbstractC1355c abstractC1355cM5372p6 = c2137a2.m5372p(new C2145i());
                    abstractC1355cM5372p6.getClass();
                    C2145i c2145i = (C2145i) abstractC1355cM5372p6;
                    int iM3645b15 = c2145i.m3645b(4);
                    objValueOf = Float.valueOf(iM3645b15 != 0 ? c2145i.f4500b.getFloat(iM3645b15 + c2145i.f4499a) : 0.0f);
                    break;
                case 6:
                    AbstractC1355c abstractC1355cM5372p7 = c2137a2.m5372p(new C2144h());
                    abstractC1355cM5372p7.getClass();
                    C2144h c2144h = (C2144h) abstractC1355cM5372p7;
                    int iM3645b16 = c2144h.m3645b(4);
                    objValueOf = Double.valueOf(iM3645b16 != 0 ? c2144h.f4500b.getDouble(iM3645b16 + c2144h.f4499a) : 0.0d);
                    break;
                case 7:
                    AbstractC1355c abstractC1355cM5372p8 = c2137a2.m5372p(new C2150n());
                    abstractC1355cM5372p8.getClass();
                    C2150n c2150n = (C2150n) abstractC1355cM5372p8;
                    int iM3645b17 = c2150n.m3645b(4);
                    objValueOf = iM3645b17 != 0 ? c2150n.m3647d(iM3645b17 + c2150n.f4499a) : null;
                    objValueOf.getClass();
                    break;
                case 8:
                    AbstractC1355c abstractC1355cM5372p9 = c2137a2.m5372p(new C2140d());
                    abstractC1355cM5372p9.getClass();
                    objValueOf = AbstractC1089i.m2795v(dexKitBridge, (C2140d) abstractC1355cM5372p9);
                    break;
                case 9:
                    AbstractC1355c abstractC1355cM5372p10 = c2137a2.m5372p(new C2152p());
                    abstractC1355cM5372p10.getClass();
                    objValueOf = AbstractC1341a.m3600p(dexKitBridge, (C2152p) abstractC1355cM5372p10);
                    break;
                case 10:
                    AbstractC1355c abstractC1355cM5372p11 = c2137a2.m5372p(new C2151o());
                    abstractC1355cM5372p11.getClass();
                    objValueOf = AbstractC1184v0.m3208r(dexKitBridge, (C2151o) abstractC1355cM5372p11);
                    break;
                case 11:
                    AbstractC1355c abstractC1355cM5372p12 = c2137a2.m5372p(new C2138b());
                    abstractC1355cM5372p12.getClass();
                    objValueOf = AbstractC0283h.m1188z(dexKitBridge, (C2138b) abstractC1355cM5372p12);
                    break;
                case 12:
                    AbstractC1355c abstractC1355cM5372p13 = c2137a2.m5372p(new C2139c());
                    abstractC1355cM5372p13.getClass();
                    objValueOf = m426s(dexKitBridge, (C2139c) abstractC1355cM5372p13);
                    break;
                case 13:
                    AbstractC1355c abstractC1355cM5372p14 = c2137a2.m5372p(new C2148l());
                    abstractC1355cM5372p14.getClass();
                    objValueOf = (C2148l) abstractC1355cM5372p14;
                    break;
                case 14:
                    AbstractC1355c abstractC1355cM5372p15 = c2137a2.m5372p(new C2141e());
                    abstractC1355cM5372p15.getClass();
                    C2141e c2141e = (C2141e) abstractC1355cM5372p15;
                    int iM3645b18 = c2141e.m3645b(4);
                    objValueOf = Boolean.valueOf((iM3645b18 == 0 || ((byte) b10) == c2141e.f4500b.get(iM3645b18 + c2141e.f4499a)) ? false : true);
                    break;
                default:
                    C3193a.m6822k();
                    return null;
            }
            arrayList.add(new C1717b(dexKitBridge, strM3647d2, new C1719d(objValueOf, iM257u)));
            i11++;
            i10 = 6;
            b10 = 0;
        }
        return new C1716a(dexKitBridge, strM3647d, i9, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC4250c m427t(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            InterfaceC4250c interfaceC4250c = tag instanceof InterfaceC4250c ? (InterfaceC4250c) tag : null;
            if (interfaceC4250c != null) {
                return interfaceC4250c;
            }
            Object objM3210t = AbstractC1184v0.m3210t(view);
            view = objM3210t instanceof View ? (View) objM3210t : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m428u(ClassLoader classLoader, String str) throws ClassNotFoundException {
        classLoader.getClass();
        str.getClass();
        if (AbstractC3156t.m6733W(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false)) {
            return Array.newInstance((Class<?>) m428u(classLoader, str.substring(0, str.length() - 2)), 0).getClass();
        }
        int iHashCode = str.hashCode();
        Class<?> clsLoadClass = Integer.TYPE;
        switch (iHashCode) {
            case -1325958191:
                clsLoadClass = !str.equals("double") ? classLoader.loadClass(str) : Double.TYPE;
                break;
            case 104431:
                if (!str.equals("int")) {
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    clsLoadClass = Byte.TYPE;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    clsLoadClass = Character.TYPE;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    clsLoadClass = Long.TYPE;
                    break;
                }
                break;
            case 3625364:
                if (str.equals("void")) {
                    clsLoadClass = Void.TYPE;
                    break;
                }
                break;
            case 64711720:
                if (!str.equals("boolean")) {
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    clsLoadClass = Float.TYPE;
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    clsLoadClass = Short.TYPE;
                    break;
                }
                break;
        }
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Set m429v() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static Executor m430w() {
        if (f215a == null) {
            synchronized (AbstractC0063p.class) {
                try {
                    if (f215a == null) {
                        f215a = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f215a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static boolean m431x(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return (parameterTypes.length != 2 || !AbstractC1416l.m3825a(parameterTypes[0], cls) || parameterTypes[1].isPrimitive() || method.getReturnType().isPrimitive() || AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m432y(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC1416l.m3825a(method.getName(), "onMMMenuItemSelected") && parameterTypes.length == 2 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.component.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m433z(Method method) {
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC1416l.m3825a(method.getName(), "onCreateMMMenu") && method.getParameterTypes().length == 1 && AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.component.");
    }
}
