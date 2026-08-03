package lb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ba.C0226f;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p036c9.RunnableC0496w;
import p036c9.ThreadFactoryC0478q;
import p062e8.C0828b;
import p063e9.RunnableC0844o;
import p068eh.AbstractC0921a;
import p078f9.C1093d;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p091g3.RunnableC1309g;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatQuoteMsg;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.AbstractC2094e;
import p136j8.C2105p;
import p136j8.C2114y;
import p153k8.C2343g;
import p153k8.C2355s;
import p153k8.C2356t;
import p167l8.C2529d;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p242q8.C3458m;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import tf.AbstractC4165l;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: lb.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2547i {

    /* JADX INFO: renamed from: A */
    public static final String[] f8251A = {"androidx.recyclerview.widget.RecyclerView", "android.support.v7.widget.RecyclerView"};

    /* JADX INFO: renamed from: a */
    public final C3742g f8252a;

    /* JADX INFO: renamed from: b */
    public final C2026t f8253b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f8254c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f8255d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f8256e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f8257f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f8258g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f8259h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f8260i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f8261j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f8262k;

    /* JADX INFO: renamed from: l */
    public final Handler f8263l;

    /* JADX INFO: renamed from: m */
    public final ExecutorService f8264m;

    /* JADX INFO: renamed from: n */
    public volatile Method f8265n;

    /* JADX INFO: renamed from: o */
    public volatile WeakReference f8266o;

    /* JADX INFO: renamed from: p */
    public final Map f8267p;

    /* JADX INFO: renamed from: q */
    public final Map f8268q;

    /* JADX INFO: renamed from: r */
    public final Map f8269r;

    /* JADX INFO: renamed from: s */
    public final ConcurrentHashMap f8270s;

    /* JADX INFO: renamed from: t */
    public final Set f8271t;

    /* JADX INFO: renamed from: u */
    public final SharedPreferences f8272u;

    /* JADX INFO: renamed from: v */
    public volatile boolean f8273v;

    /* JADX INFO: renamed from: w */
    public volatile boolean f8274w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f8275x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f8276y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f8277z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2547i(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f8252a = c3742g;
        this.f8253b = c2026t;
        this.f8254c = new ConcurrentHashMap();
        this.f8255d = new ConcurrentHashMap();
        this.f8256e = new ConcurrentHashMap();
        this.f8257f = new ConcurrentHashMap();
        this.f8258g = new ConcurrentHashMap();
        this.f8259h = new ConcurrentHashMap();
        this.f8260i = new ConcurrentHashMap();
        this.f8261j = new ConcurrentHashMap();
        this.f8262k = new ConcurrentHashMap();
        this.f8263l = new Handler(Looper.getMainLooper());
        this.f8264m = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(20));
        this.f8266o = new WeakReference(null);
        this.f8267p = AbstractC3199a.m6843p();
        this.f8268q = AbstractC3199a.m6843p();
        this.f8269r = AbstractC3199a.m6843p();
        this.f8270s = new ConcurrentHashMap();
        this.f8271t = AbstractC2091b.m5168o();
        this.f8272u = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_swipe_quote_method_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static Long m5960A(Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6743g0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Object m5961B(Object obj, String str, String str2, String str3) {
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), str, new Class[0]), obj, new Object[0]);
        if (objInvoke != null) {
            return objInvoke;
        }
        Object field = KavaReflector.readField(obj, str2);
        return field != null ? field : KavaReflector.readField(obj, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m5962E(View view) {
        for (int i9 = 0; i9 < 4 && view != null; i9++) {
            view.requestLayout();
            view.invalidate();
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5963G(WeChatMessage weChatMessage, String str) {
        C2343g c2343g;
        String strBodyContent;
        Object c3959f;
        if (AbstractC3149m.m6721t0(str) || weChatMessage.msgId <= 0 || WeChatApis.message() == null || (c2343g = WeChatApis.messageApi) == null) {
            return false;
        }
        WeChatQuoteMsg quoteMsg = weChatMessage.getQuoteMsg();
        if (quoteMsg == null || (strBodyContent = quoteMsg.title) == null) {
            C2529d c2529d = WeChatMessage.Companion;
            String strBodyContent2 = weChatMessage.bodyContent();
            c2529d.getClass();
            String strM5949o = C2529d.m5949o(strBodyContent2, "title");
            String str2 = AbstractC3149m.m6721t0(strM5949o) ? null : strM5949o;
            strBodyContent = str2 != null ? str2 : weChatMessage.bodyContent();
        } else {
            if (AbstractC3149m.m6721t0(strBodyContent)) {
                strBodyContent = null;
            }
            if (strBodyContent == null) {
            }
        }
        try {
            c3959f = Boolean.valueOf(c2343g.m5598u(weChatMessage.msgId, str, strBodyContent));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m5964I(C2545g c2545g) {
        View view = c2545g.f8240d;
        if (view != null) {
            view.animate().cancel();
            view.animate().translationX(0.0f).alpha(1.0f).setDuration(96L).withEndAction(new RunnableC1309g(view, 2)).start();
            c2545g.f8240d = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m5965J(int i9, Object obj, Set set) {
        Object field;
        Object objM5965J;
        if (obj != null && i9 <= 4 && set.add(obj)) {
            String name = obj.getClass().getName();
            if (AbstractC0921a.m2263z("com.tencent.mm.storage.", obj, false)) {
                if (m5976x(obj) > 0) {
                    return obj;
                }
                if (!AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false) || (obj instanceof View) || (obj instanceof ViewGroup)) {
                    return null;
                }
                if (obj instanceof Collection) {
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        Object objM5965J2 = m5965J(i9 + 1, it.next(), set);
                        if (objM5965J2 != null) {
                            return objM5965J2;
                        }
                    }
                } else {
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                            Class<?> type = field2.getType();
                            if (!type.isPrimitive() && !type.isArray() && !type.equals(String.class) && !Number.class.isAssignableFrom(type) && (field = KavaReflector.readField(field2, obj)) != null && (objM5965J = m5965J(i9 + 1, field, set)) != null) {
                                return objM5965J;
                            }
                        }
                    }
                }
            } else {
                List<Method> listDeclaredMethods = KavaReflector.declaredMethods(obj.getClass());
                if (listDeclaredMethods == null || !listDeclaredMethods.isEmpty()) {
                    for (Method method : listDeclaredMethods) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && (AbstractC1416l.m3825a(method.getName(), "getMsgId") || AbstractC1416l.m3825a(method.getName(), "getMsgID"))) {
                            if (AbstractC1416l.m3825a(method.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Long.class)) {
                                if (m5976x(obj) > 0) {
                                }
                            }
                        }
                    }
                }
                if (AbstractC3156t.m6740d0(name, "java.", false)) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static Object m5966K(Object obj) {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        return m5965J(0, obj, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static int m5967L(ArrayList arrayList, Object obj, String str) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WeChatMessage) next).msgId > 0) {
                break;
            }
        }
        WeChatMessage weChatMessage = (WeChatMessage) next;
        long j3 = weChatMessage != null ? weChatMessage.msgId : 0L;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WeChatMessage weChatMessage2 = (WeChatMessage) it2.next();
            C4329c c4329cM7E = AbstractC0000a.m7E();
            c4329cM7E.add(weChatMessage2.bodyContent());
            if (!AbstractC1416l.m3825a(weChatMessage2.content, weChatMessage2.bodyContent())) {
                c4329cM7E.add(weChatMessage2.content);
            }
            AbstractC4171r.m8432h1(arrayList2, AbstractC0000a.m90t(c4329cM7E));
        }
        return AbstractC2094e.m5193d(obj, str, j3, arrayList2, 1000);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final void m5968N(ArrayList arrayList, WeChatMessage weChatMessage) {
        if (weChatMessage == null || !weChatMessage.isVoice()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((WeChatMessage) it.next()) == weChatMessage) {
                    return;
                }
            }
        }
        arrayList.add(weChatMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5969a(Object obj, MenuItem menuItem, C2542d c2542d) {
        try {
            menuItem.setIcon(c2542d);
        } catch (Throwable unused) {
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                if (List.class.isAssignableFrom(field.getType())) {
                    Object field2 = KavaReflector.readField(field, obj);
                    List list = AbstractC1428x.m3840e(field2) ? (List) field2 : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i9 = -1;
                                break;
                            }
                            Object next = it.next();
                            if (next == menuItem) {
                                break;
                            }
                            MenuItem menuItem2 = next instanceof MenuItem ? (MenuItem) next : null;
                            if (menuItem2 != null && menuItem2.getItemId() == 1212371536) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (i9 > 0) {
                            try {
                                list.add(0, list.remove(i9));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (i9 >= 0) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5970b(View view) {
        view.animate().cancel();
        if (view.getTranslationX() != 0.0f) {
            view.setTranslationX(0.0f);
        }
        if (view.getAlpha() == 1.0f) {
            return;
        }
        view.setAlpha(1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static MenuItem m5971f(Object obj) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "findItem", 1212371536);
        if (objInvokeMethod instanceof MenuItem) {
            return (MenuItem) objInvokeMethod;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Object m5972h(Object obj, int i9, Set set, int i10) {
        Object field;
        Object objM5972h;
        if (i9 >= 0 && i10 <= 3 && set.add(obj)) {
            Object objM5975v = m5975v(i9, obj);
            if (objM5975v != null) {
                if (!(m5966K(objM5975v) != null)) {
                    objM5975v = null;
                }
                if (objM5975v != null) {
                    return objM5975v;
                }
            }
            String name = obj.getClass().getName();
            if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false) && !(obj instanceof View) && !(obj instanceof ViewGroup)) {
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    for (Field field2 : KavaReflector.declaredFields(superclass)) {
                        Class<?> type = field2.getType();
                        if (!type.isPrimitive() && !type.isArray() && !type.equals(String.class) && !Number.class.isAssignableFrom(type) && (field = KavaReflector.readField(field2, obj)) != null && (objM5972h = m5972h(field, i9, set, i10 + 1)) != null) {
                            return objM5972h;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m5973t(Method method) {
        return method.getDeclaringClass().getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && method.getParameterTypes().length == 3 && AbstractC1416l.m3825a(method.getParameterTypes()[0], String.class) && (AbstractC1416l.m3825a(method.getParameterTypes()[1], Long.TYPE) || AbstractC1416l.m3825a(method.getParameterTypes()[1], Long.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m5974u(Method method) {
        return method.getDeclaringClass().getName().equals("com.tencent.mm.ui.transmit.MsgRetransmitUI") && method.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method.getParameterTypes()[0], String.class) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Object m5975v(int i9, Object obj) {
        if (obj == null || i9 < 0) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (i9 < list.size()) {
                return list.get(i9);
            }
        }
        Class<?> cls = obj.getClass();
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(cls, "get", cls2), obj, Integer.valueOf(i9));
        return objInvoke != null ? objInvoke : KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "get", cls2), obj, Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static long m5976x(Object obj) {
        String[] strArr = {"getMsgId", "getMsgID", "getId"};
        for (int i9 = 0; i9 < 3; i9++) {
            Long lM5960A = m5960A(KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), strArr[i9], new Class[0]), obj, new Object[0]));
            if (lM5960A != null) {
                long jLongValue = lM5960A.longValue();
                if (jLongValue > 0) {
                    return jLongValue;
                }
            }
        }
        String[] strArr2 = {"field_msgId", "msgId", "msgID", "id"};
        for (int i10 = 0; i10 < 4; i10++) {
            Long lM5960A2 = m5960A(KavaReflector.readField(obj, strArr2[i10]));
            if (lM5960A2 != null) {
                long jLongValue2 = lM5960A2.longValue();
                if (jLongValue2 > 0) {
                    return jLongValue2;
                }
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static Integer m5977z(Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return AbstractC3156t.m6742f0(AbstractC3149m.m6703R0((String) obj).toString());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m5978C(Object obj, long j3) {
        Object objInvoke;
        Object objInvokeMethod;
        Object field;
        Object objInvokeMethod2 = KavaReflector.invokeMethod(obj, "getChattingContext", new Object[0]);
        if (objInvokeMethod2 == null || (objInvokeMethod = KavaReflector.invokeMethod(objInvokeMethod2, "a", new Object[0])) == null || (field = KavaReflector.readField(objInvokeMethod, "c")) == null) {
            objInvoke = null;
        } else {
            Class<?> clsLoadClass = KavaReflector.loadClass("rb4.i1", this.f8252a.f12145c);
            for (Class cls : clsLoadClass != null ? AbstractC0000a.m99x0(clsLoadClass) : C4173t.f13710g) {
                Method methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(field.getClass(), "a", cls);
                if (methodFindCompatibleMethod != null && (objInvoke = KavaReflector.invoke(methodFindCompatibleMethod, field, cls)) != null && !m5985e(objInvoke.getClass()).isEmpty()) {
                    break;
                }
            }
            objInvoke = null;
        }
        if (objInvoke != null) {
            Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(objInvoke.getClass(), "i");
            if (fieldFindFieldRecursive != null && (AbstractC1416l.m3825a(fieldFindFieldRecursive.getType(), Long.TYPE) || AbstractC1416l.m3825a(fieldFindFieldRecursive.getType(), Long.class))) {
                KavaReflector.writeField(fieldFindFieldRecursive, objInvoke, Long.valueOf(j3));
            }
            Field fieldFindFieldRecursive2 = KavaReflector.findFieldRecursive(objInvoke.getClass(), "g");
            if (fieldFindFieldRecursive2 != null && AbstractC1416l.m3825a(fieldFindFieldRecursive2.getType(), String.class)) {
                Object objInvokeMethod3 = KavaReflector.invokeMethod(obj, "getLastText", new Object[0]);
                String str = objInvokeMethod3 instanceof String ? (String) objInvokeMethod3 : null;
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                KavaReflector.writeField(fieldFindFieldRecursive2, objInvoke, str);
            }
            Iterator it = m5985e(objInvoke.getClass()).iterator();
            while (it.hasNext()) {
                KavaReflector.invokeSuccessfully((Method) it.next(), objInvoke, new Object[0]);
            }
            m5962E(obj instanceof View ? (View) obj : null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m5979D(Object obj) {
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f8260i;
        Method methodAccessible = (Method) concurrentHashMap.get(cls);
        if (methodAccessible == null) {
            for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                for (Method method : KavaReflector.declaredMethods(superclass)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getName(), "setMsgQuoteRlVisibility") && parameterTypes.length == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        Class cls3 = Integer.TYPE;
                        if (AbstractC1416l.m3825a(cls2, cls3) || AbstractC1416l.m3825a(parameterTypes[0], cls3)) {
                            methodAccessible = KavaReflector.accessible(method);
                            if (methodAccessible != null) {
                                concurrentHashMap.put(cls, methodAccessible);
                            }
                        }
                    }
                }
            }
            methodAccessible = null;
        }
        if (methodAccessible != null && KavaReflector.invokeSuccessfully(methodAccessible, obj, 0)) {
            m5962E(obj instanceof View ? (View) obj : null);
            return;
        }
        Class<?> superclass2 = obj.getClass();
        loop2: while (true) {
            if (superclass2 == null || superclass2.equals(Object.class)) {
                break;
            }
            for (Field field : KavaReflector.declaredFields(superclass2)) {
                if (View.class.isAssignableFrom(field.getType())) {
                    Object field2 = KavaReflector.readField(field, obj);
                    View view = field2 instanceof View ? (View) field2 : null;
                    if (view != null && view.getTag() != null) {
                        view = view;
                        break loop2;
                    }
                }
            }
            superclass2 = superclass2.getSuperclass();
        }
        if (view != null) {
            view.setVisibility(0);
            m5962E(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x009e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lb.i] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.Hchat.hooks.api.model.WeChatMessage] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5980F(C2541c c2541c) {
        ?? r2;
        Throwable th2;
        Object c3959f;
        ?? r22;
        Throwable thM8182b;
        ?? r23;
        C2543e c2543eM5981H;
        C2105p c2105pMedia;
        C2114y c2114y;
        Object obj = c2541c.f8226c;
        C3458m c3458mChatPage = WeChatApis.chatPage();
        String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
        if (strM7258a == null) {
            strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str = strM7258a;
        if (str.length() != 0 && str.equals(c2541c.f8224a)) {
            try {
                c2543eM5981H = m5981H(c2541c);
            } catch (Throwable th3) {
                th = th3;
                r2 = this;
            }
            if (c2543eM5981H != null) {
                r2 = c2543eM5981H.f8230a;
                if (!r2.isRedPacket()) {
                    try {
                        boolean z9 = r2.isTransfer();
                        if (!z9) {
                            if (r2.isQuote()) {
                                if (m5963G(r2, str)) {
                                    return true;
                                }
                            }
                            try {
                                if (r2.isVoice()) {
                                    WeChatMessage[] weChatMessageArr = {c2543eM5981H.f8231b, c2543eM5981H.f8232c};
                                    if (!AbstractC3149m.m6721t0(str) && (c2105pMedia = WeChatApis.media()) != null && (c2114y = c2105pMedia.f7036b) != null && c2114y.m5308b()) {
                                        try {
                                            this.f8264m.execute(new RunnableC0496w(this, (WeChatMessage) r2, weChatMessageArr, c2114y, obj, str));
                                            return true;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r2 = this;
                                            th2 = th;
                                            r23 = r2;
                                            c3959f = new C3959f(th2);
                                            r22 = r23;
                                            thM8182b = C3960g.m8182b(c3959f);
                                            if (thM8182b != null) {
                                            }
                                            return ((Boolean) c3959f).booleanValue();
                                        }
                                    }
                                }
                                r22 = this;
                                C2356t c2356tM3195e = AbstractC1184v0.m3195e(r2, obj);
                                if (c2356tM3195e != null) {
                                    c3959f = Boolean.valueOf(m5982M(str, c2356tM3195e));
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        r23 = this;
                        c3959f = new C3959f(th2);
                        r22 = r23;
                    }
                }
                thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    r22.f8253b.invoke("复读消息处理失败", thM8182b);
                    c3959f = Boolean.FALSE;
                }
                return ((Boolean) c3959f).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final C2543e m5981H(C2541c c2541c) {
        Object c3959f;
        Object c3959f2;
        long j3 = c2541c.f8225b;
        try {
            try {
                C2355s c2355sMessageStore = WeChatApis.messageStore();
                c3959f2 = c2355sMessageStore != null ? c2355sMessageStore.m5661c(j3) : null;
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            if (c3959f2 instanceof C3959f) {
                c3959f2 = null;
            }
            WeChatMessage weChatMessage = (WeChatMessage) c3959f2;
            WeChatMessage weChatMessageM5998w = m5998w(j3, c2541c.f8224a, c2541c.f8226c);
            WeChatMessage weChatMessage2 = ((weChatMessageM5998w != null && AbstractC1184v0.m3215y(weChatMessageM5998w) && (weChatMessage == null || !AbstractC1184v0.m3215y(weChatMessage) || AbstractC3149m.m6721t0(weChatMessage.bodyContent()))) || weChatMessage == null) ? weChatMessageM5998w : weChatMessage;
            c3959f = weChatMessage2 != null ? new C2543e(weChatMessage2, weChatMessage, weChatMessageM5998w) : null;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        return (C2543e) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final boolean m5982M(String str, C2356t c2356t) {
        Object c3959f;
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
        C3742g c3742g = this.f8252a;
        Context context = activityM7263a != null ? activityM7263a : c3742g.f12143a;
        Intent intent = new Intent();
        intent.setClassName(c3742g.f12143a.getPackageName(), "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        if (activityM7263a == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("Select_Conv_User", str);
        intent.putExtra("custom_send_text", HttpUrl.FRAGMENT_ENCODE_SET);
        intent.putExtra("Retr_Msg_Type", c2356t.f7744d);
        intent.putExtra("Retr_Msg_Id", c2356t.f7741a);
        intent.putExtra("Retr_MsgTalker", c2356t.f7742b);
        intent.putExtra("Retr_Msg_content", c2356t.f7743c);
        intent.putExtra("Retr_File_Name", c2356t.f7746f);
        intent.putExtra("Edit_Mode_Sigle_Msg", true);
        intent.putExtra("Retr_MsgFromScene", c2356t.f7745e);
        intent.putExtra("Retr_show_success_tips", false);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_start_where_you_are", true);
        intent.putExtra("hchat_silent_repeat", true);
        intent.putExtra("scene_from", 17);
        int i9 = c2356t.f7747g;
        if (i9 > 0) {
            intent.putExtra("Retr_length", i9);
        }
        try {
            context.startActivity(intent);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f8253b.invoke("复读启动微信转发失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final float m5983c(float f3) {
        return f3 * this.f8252a.f12143a.getResources().getDisplayMetrics().density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m5984d(View view) {
        for (Class<?> superclass = view.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            if (superclass.getName().equals("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")) {
                this.f8266o = new WeakReference(view);
                return view;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            Object objM5984d = m5984d(childAt);
            if (objM5984d != null) {
                return objM5984d;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final List m5985e(Class cls) {
        Method methodAccessible;
        ConcurrentHashMap concurrentHashMap = this.f8261j;
        List list = (List) concurrentHashMap.get(cls);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Method method : KavaReflector.declaredMethods(superclass)) {
                if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !Modifier.isStatic(method.getModifiers())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && AbstractC1416l.m3825a(method.getName(), "M0") && (methodAccessible = KavaReflector.accessible(method)) != null) {
                        arrayList.add(methodAccessible);
                    }
                }
            }
        }
        concurrentHashMap.put(cls, arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0052 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public final List m5986g(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f8252a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    c3959f.add(method);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj = c3959f;
        if (thM8182b != null) {
            this.f8253b.invoke("左滑引用定位方法失败", thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field m5987i(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f8256e;
        Field field = (Field) concurrentHashMap.get(cls);
        if (field != null) {
            return field;
        }
        Class superclass = cls;
        while (true) {
            Object obj = null;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Field field2 = (Field) next;
                if (AbstractC1416l.m3825a(field2.getName(), "itemView") || AbstractC1416l.m3825a(field2.getType(), View.class)) {
                    obj = next;
                    break;
                }
            }
            Field field3 = (Field) obj;
            if (field3 != null) {
                concurrentHashMap.put(cls, field3);
                return field3;
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C2541c m5988j(View view) {
        C2541c c2541c = (C2541c) this.f8267p.get(view);
        if (c2541c != null) {
            return c2541c;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            C2541c c2541cM5988j = m5988j(childAt);
            if (c2541cM5988j != null) {
                return c2541cM5988j;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m5989k(Object obj) {
        Boolean bool = Boolean.TRUE;
        KavaReflector.invokeMethod(obj, "U0", bool);
        KavaReflector.invokeMethod(obj, "setToSendTextColor", bool);
        Class<?> cls = obj.getClass();
        Class cls2 = Integer.TYPE;
        cls2.getClass();
        Method methodFindMethod = KavaReflector.findMethod(cls, "setMode", cls2);
        if ((methodFindMethod != null || (methodFindMethod = KavaReflector.findMethod(obj.getClass(), "setMode", cls2)) != null) && !KavaReflector.invokeSuccessfully(methodFindMethod, obj, 1)) {
            KavaReflector.invokeSuccessfully(methodFindMethod, obj, 0);
        }
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            view.postDelayed(new RunnableC0844o(this, view, 0, 1), 80L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m5990l(Class cls, String str) {
        Object c3959f;
        Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls, str, MotionEvent.class);
        if (methodFindMethodRecursive == null) {
            return false;
        }
        if (!methodFindMethodRecursive.getDeclaringClass().getName().equals(cls.getName())) {
            methodFindMethodRecursive = null;
        }
        if (methodFindMethodRecursive == null) {
            return false;
        }
        try {
            C3744i.f12154b.m7763b(methodFindMethodRecursive, new C2546h(this, 0));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f8253b.invoke("左滑引用列表触摸Hook失败: ".concat(str), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m5991m(Method method, boolean z9) {
        Object c3959f;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        Set set = this.f8271t;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, new C1093d(z9, this, 1));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f8253b.invoke("长按复读菜单Hook安装失败: " + method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5992n() {
        Object next;
        Object c3959f;
        if (this.f8273v) {
            return true;
        }
        String strM5999y = m5999y();
        SharedPreferences sharedPreferences = this.f8272u;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM5999y, this.f8252a.f12145c, "adapter_bind");
        if (methodM2087c == null) {
            List listM5986g = m5986g("MicroMsg.ChattingDataAdapterV3", "_onBindViewHolder[", "msgInfo");
            if (listM5986g.isEmpty()) {
                listM5986g = m5986g("MicroMsg.ChattingDataAdapterV3", "holder", "itemView");
            }
            Iterator it = listM5986g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (m5997s((Method) next)) {
                    break;
                }
            }
            methodM2087c = (Method) next;
            if (methodM2087c != null) {
                C0828b.m2092h(sharedPreferences, strM5999y, "adapter_bind", methodM2087c);
            } else {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM5999y)) {
                        editorEdit.clear().putString("cache.key", strM5999y);
                    }
                    editorEdit.remove("adapter_bind").apply();
                } catch (Throwable unused) {
                }
            }
        } else {
            if (!m5997s(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c == null) {
            }
        }
        if (methodM2087c == null) {
            this.f8253b.invoke("左滑引用定位聊天适配器失败", null);
            return false;
        }
        try {
            C3744i.f12154b.m7763b(methodM2087c, new C2546h(this, 1));
            this.f8273v = true;
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f8253b.invoke("左滑引用聊天适配器Hook失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m5993o() {
        Method methodFindMethodRecursive;
        Object c3959f;
        if (this.f8276y) {
            return true;
        }
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter", this.f8252a.f12145c);
        if (clsLoadClass == null || (methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "onAttachedToWindow", new Class[0])) == null) {
            return false;
        }
        Method methodFindMethodRecursive2 = KavaReflector.findMethodRecursive(clsLoadClass, "onDetachedFromWindow", new Class[0]);
        try {
            C3744i c3744i = C3744i.f12154b;
            c3744i.m7763b(methodFindMethodRecursive, new C2546h(this, 2));
            if (methodFindMethodRecursive2 != null) {
                c3744i.m7763b(methodFindMethodRecursive2, new C2546h(this, 3));
            }
            this.f8276y = true;
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f8253b.invoke("左滑引用输入栏生命周期Hook失败", thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m5994p() {
        if (this.f8274w && this.f8275x) {
            return true;
        }
        boolean zM5990l = this.f8274w;
        boolean zM5990l2 = this.f8275x;
        String[] strArr = f8251A;
        for (int i9 = 0; i9 < 2; i9++) {
            Class<?> clsLoadClass = KavaReflector.loadClass(strArr[i9], this.f8252a.f12145c);
            if (clsLoadClass != null) {
                if (!zM5990l) {
                    zM5990l = m5990l(clsLoadClass, "onInterceptTouchEvent");
                }
                if (!zM5990l2) {
                    zM5990l2 = m5990l(clsLoadClass, "onTouchEvent");
                }
            }
        }
        this.f8274w = zM5990l;
        this.f8275x = zM5990l2;
        return zM5990l && zM5990l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x0111 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x0145 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [e8.b] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public final boolean m5995q() {
        ?? c3959f;
        Object c3959f2;
        XC_MethodHook.Unhook c3959f3;
        if (this.f8277z) {
            return true;
        }
        String strM5999y = m5999y();
        ?? r2 = C0828b.f2478a;
        SharedPreferences sharedPreferences = this.f8272u;
        C3742g c3742g = this.f8252a;
        List listM2090f = C0828b.m2090f(sharedPreferences, strM5999y, c3742g.f12145c, "retransmit_done");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM2090f) {
            if (m5974u((Method) obj)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ?? arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Method) obj2).toGenericString())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                c1253k.m3369l0(5, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
                C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("sendResult", "SendMsgUsernames"));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    try {
                        c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method = (Method) c3959f2;
                    if (method != null) {
                        arrayList3.add(method);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (m5974u((Method) obj3)) {
                        arrayList4.add(obj3);
                    }
                }
                HashSet hashSet2 = new HashSet();
                c3959f = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (hashSet2.add(((Method) obj4).toGenericString())) {
                        c3959f.add(obj4);
                    }
                }
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            C4173t c4173t = C4173t.f13710g;
            boolean z9 = c3959f instanceof C3959f;
            ?? r72 = c3959f;
            if (z9) {
                r72 = c4173t;
            }
            arrayList2 = (List) r72;
            if (arrayList2.isEmpty()) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM5999y)) {
                        editorEdit.clear().putString("cache.key", strM5999y);
                    }
                    editorEdit.remove("retransmit_done").apply();
                } catch (Throwable unused) {
                }
            } else {
                r2.m2097j(sharedPreferences, strM5999y, "retransmit_done", arrayList2);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Method methodAccessible = KavaReflector.accessible((Method) it2.next());
            if (methodAccessible != null) {
                try {
                    c3959f3 = C3744i.f12154b.m7763b(methodAccessible, new C0226f(17));
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f3);
                if (thM8182b != null) {
                    this.f8253b.invoke("左滑右滑重发完成Hook失败", thM8182b);
                    return false;
                }
            }
        }
        this.f8277z = true;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m5996r(Object obj, long j3) {
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f8259h;
        Method methodAccessible = (Method) concurrentHashMap.get(cls);
        if (methodAccessible == null) {
            for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                for (Method method : KavaReflector.declaredMethods(superclass)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getName(), "setLastQuoteMsgId") && parameterTypes.length == 1 && (AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE) || AbstractC1416l.m3825a(parameterTypes[0], Long.class))) {
                        methodAccessible = KavaReflector.accessible(method);
                        if (methodAccessible != null) {
                            concurrentHashMap.put(cls, methodAccessible);
                        }
                    }
                }
            }
            methodAccessible = null;
        }
        if (methodAccessible != null) {
            if (KavaReflector.invokeSuccessfully(methodAccessible, obj, Long.valueOf(j3))) {
                return true;
            }
            concurrentHashMap.remove(obj.getClass());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m5997s(Method method) {
        Class<?> superclass;
        Object c3959f;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 2 || !AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE) || (superclass = parameterTypes[0]) == null) {
            return false;
        }
        try {
            c3959f = Boolean.valueOf(this.f8252a.f12145c.loadClass("androidx.recyclerview.widget.RecyclerView$ViewHolder").isAssignableFrom(superclass));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        if (!((Boolean) c3959f).booleanValue() && m5987i(superclass) == null) {
            while (superclass != null && !superclass.equals(Object.class)) {
                List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                if (listDeclaredFields == null || !listDeclaredFields.isEmpty()) {
                    Iterator<T> it = listDeclaredFields.iterator();
                    while (it.hasNext()) {
                        if (AbstractC1416l.m3825a(((Field) it.next()).getType(), View.class)) {
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:133:0x020f */
    /* JADX DEBUG: Type inference failed for r8v6. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[PHI: r1
  0x001f: PHI (r1v48 java.lang.String) = (r1v23 java.lang.String), (r1v49 java.lang.String) binds: [B:23:0x0042, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Integer, java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WeChatMessage m5998w(long j3, String str, Object obj) {
        String str2;
        WeChatMessage weChatMessage;
        int i9;
        ?? r30;
        Object next;
        Method method;
        String str3;
        C3958e c3958e;
        int i10;
        int iM5940f;
        Object field = KavaReflector.readField(obj, "field_content");
        String str4 = field instanceof String ? (String) field : null;
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        int i11 = 0;
        if (str4 == null) {
            Object field2 = KavaReflector.readField(obj, "content");
            str4 = field2 instanceof String ? (String) field2 : null;
            if (str4 != null) {
                if (AbstractC3149m.m6721t0(str4)) {
                    str4 = null;
                }
                if (str4 != null) {
                    r30 = str4;
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    i9 = 0;
                    weChatMessage = null;
                }
            }
            Class<?> cls = obj.getClass();
            ConcurrentHashMap concurrentHashMap = this.f8262k;
            Object obj2 = concurrentHashMap.get(cls);
            if (obj2 == null) {
                List<Method> listDeclaredMethods = KavaReflector.declaredMethods(cls);
                ArrayList<Method> arrayList = new ArrayList();
                Iterator it = listDeclaredMethods.iterator();
                while (true) {
                    weChatMessage = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    Method method2 = (Method) next2;
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0 && AbstractC1416l.m3825a(method2.getReturnType(), String.class) && AbstractC4165l.m8378m0(new String[]{"getContent", "j", "A1", "U1", "W0"}, method2.getName())) {
                        arrayList.add(next2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Method method3 : arrayList) {
                    Object objInvoke = KavaReflector.invoke(method3, obj, new Object[i11]);
                    String str6 = objInvoke instanceof String ? (String) objInvoke : null;
                    if (str6 != null) {
                        if (AbstractC3149m.m6721t0(str6)) {
                            str3 = str5;
                            i10 = 0;
                        } else {
                            str3 = str5;
                            int i12 = (AbstractC3149m.m6709h0(str6, "voicelength", true) || AbstractC3149m.m6709h0(str6, "length=", true)) ? 13 : 1;
                            if (AbstractC3149m.m6710i0(str6, ':')) {
                                i12 += 4;
                            }
                            i10 = AbstractC3149m.m6710i0(str6, '<') ? i12 + 2 : i12;
                        }
                        if (i10 > 0) {
                            c3958e = new C3958e(method3, Integer.valueOf(i10));
                        }
                        if (c3958e == null) {
                            arrayList2.add(c3958e);
                        }
                        str5 = str3;
                        i11 = 0;
                    } else {
                        str3 = str5;
                    }
                    c3958e = null;
                    if (c3958e == null) {
                    }
                    str5 = str3;
                    i11 = 0;
                }
                str2 = str5;
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        Integer numValueOf = Integer.valueOf(((Number) ((C3958e) next).f12962h).intValue());
                        do {
                            Object next3 = it2.next();
                            Integer numValueOf2 = Integer.valueOf(((Number) ((C3958e) next3).f12962h).intValue());
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                next = next3;
                                numValueOf = numValueOf2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                C3958e c3958e2 = (C3958e) next;
                if (c3958e2 == null || (method = (Method) c3958e2.f12961g) == null) {
                    String[] strArr = {"getContent", "j", "A1", "U1", "W0"};
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 5) {
                            method = null;
                            break;
                        }
                        Method methodFindMethod = KavaReflector.findMethod(cls, strArr[i13], new Class[0]);
                        if (methodFindMethod != null) {
                            Class<?>[] parameterTypes2 = methodFindMethod.getParameterTypes();
                            parameterTypes2.getClass();
                            if (parameterTypes2.length != 0 || !AbstractC1416l.m3825a(methodFindMethod.getReturnType(), String.class)) {
                                methodFindMethod = null;
                            }
                            if (methodFindMethod != null) {
                                method = methodFindMethod;
                                break;
                            }
                            i13++;
                        }
                    }
                }
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, method);
                obj2 = objPutIfAbsent == null ? method : objPutIfAbsent;
            } else {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                weChatMessage = null;
            }
            Method method4 = (Method) obj2;
            if (method4 != null) {
                Object objInvoke2 = KavaReflector.invoke(method4, obj, new Object[0]);
                ?? r12 = objInvoke2 instanceof String ? (String) objInvoke2 : weChatMessage;
                if (r12 != 0) {
                    boolean zM6721t0 = AbstractC3149m.m6721t0(r12);
                    ?? r13 = r12;
                    if (zM6721t0) {
                        r13 = weChatMessage;
                    }
                    if (r13 != 0) {
                        r30 = r13;
                        i9 = 0;
                    } else {
                        i9 = 0;
                        Object objInvoke3 = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getContent", new Class[0]), obj, new Object[0]);
                        Object obj3 = objInvoke3 instanceof String ? (String) objInvoke3 : weChatMessage;
                        r30 = obj3 == null ? str2 : obj3;
                    }
                }
            }
        } else {
            if (AbstractC3149m.m6721t0(str4)) {
                str4 = null;
            }
            if (str4 != null) {
            }
        }
        ?? M5977z = m5977z(m5961B(obj, "getType", "field_type", "type"));
        if (M5977z == 0) {
            WeChatMessage.Companion.getClass();
            iM5940f = C2529d.m5940f(r30);
        } else {
            if ((M5977z.intValue() > 0 ? 1 : i9) == 0) {
                M5977z = weChatMessage;
            }
            if (M5977z != 0) {
                iM5940f = M5977z.intValue();
            }
        }
        int i14 = iM5940f;
        if (i14 <= 0) {
            return weChatMessage;
        }
        Object objM5961B = m5961B(obj, "getImgPath", "field_imgPath", "imgPath");
        Object obj4 = objM5961B instanceof String ? (String) objM5961B : weChatMessage;
        ?? r31 = obj4 != null ? obj4 : str2;
        Object objM5961B2 = m5961B(obj, "getTalker", "field_talker", "talker");
        Object obj5 = objM5961B2 instanceof String ? (String) objM5961B2 : weChatMessage;
        ?? r29 = obj5 != null ? obj5 : str;
        Object objM5961B3 = m5961B(obj, "getMsgSource", "field_msgSource", "msgSource");
        Object obj6 = objM5961B3 instanceof String ? (String) objM5961B3 : weChatMessage;
        ?? r35 = obj6 != null ? obj6 : str2;
        Integer numM5977z = m5977z(m5961B(obj, "getIsSend", "field_isSend", "isSend"));
        return new WeChatMessage(j3, 0L, i14, 0, numM5977z != null ? numM5977z.intValue() : i9, 0L, r29, r30, r31, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, r35, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final String m5999y() {
        C3742g c3742g = this.f8252a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }
}
