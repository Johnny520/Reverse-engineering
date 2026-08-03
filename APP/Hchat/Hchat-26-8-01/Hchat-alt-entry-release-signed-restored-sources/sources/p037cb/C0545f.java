package p037cb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import android.view.View;
import android.widget.ImageView;
import ca.RunnableC0531r;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p011ab.C0042b;
import p024b9.C0219e;
import p051db.C0763a;
import p051db.C0765c;
import p051db.C0767e;
import p051db.C0768f;
import p051db.C0769g;
import p051db.RunnableC0766d;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p109hb.C1687k;
import p109hb.C1688k0;
import p109hb.C1696s;
import p109hb.C1697t;
import p115hh.C1730o;
import p115hh.C1731p;
import p119i2.C1955z;
import p126ia.C2026t;
import p136j8.C2097h;
import p136j8.C2105p;
import p153k8.C2343g;
import p210o8.C3085i;
import p210o8.C3086j;
import p210o8.C3087k;
import p211o9.C3092e;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p230p8.C3351d0;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import p343x6.AbstractC5700d;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: cb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0545f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1718a = 0;

    /* JADX INFO: renamed from: b */
    public final C3742g f1719b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f1720c;

    /* JADX INFO: renamed from: d */
    public final Object f1721d;

    /* JADX INFO: renamed from: e */
    public final Object f1722e;

    /* JADX INFO: renamed from: f */
    public final Object f1723f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0545f(C3742g c3742g) {
        c3742g.getClass();
        this.f1719b = c3742g;
        this.f1721d = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_round_avatar_method_cache");
        this.f1722e = ConcurrentHashMap.newKeySet();
        this.f1723f = ConcurrentHashMap.newKeySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1535b(C0765c c0765c) {
        int size;
        if (c0765c.f2305r != 1 && (size = c0765c.f2293f.size()) >= 1) {
            return size;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m1536h(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.") && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], View.class) && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m1537i(Method method) {
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && Arrays.equals(method.getParameterTypes(), new Class[]{ImageView.class, String.class, Float.TYPE, Boolean.TYPE});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m1538j(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.chatting.component.") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], Integer.TYPE) && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m1539k(Constructor constructor) {
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
    /* JADX INFO: renamed from: l */
    public static boolean m1540l(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC1416l.m3825a(method.getDeclaringClass(), cls) && parameterTypes.length == 8 && AbstractC1416l.m3825a(parameterTypes[0], cls) && parameterTypes[1].getName().equals("com.tencent.mm.sdk.coroutines.LifecycleScope") && AbstractC1416l.m3825a(parameterTypes[2], String.class) && AbstractC1416l.m3825a(parameterTypes[3], Float.TYPE)) {
            for (Class<?> cls2 : parameterTypes) {
                if (AbstractC1416l.m3825a(cls2, Integer.TYPE)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m1541m(Class[] clsArr) {
        int length = clsArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i9 = length - 1;
                Class cls = clsArr[length];
                Class cls2 = Integer.TYPE;
                if (AbstractC1416l.m3825a(cls, cls2) || AbstractC1416l.m3825a(cls, cls2)) {
                    return length;
                }
                if (i9 < 0) {
                    break;
                }
                length = i9;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static C3086j m1542u() {
        WeChatApis.runtime().getClass();
        C3086j c3086j = WeChatApis.taskApi;
        return c3086j != null ? c3086j : WeChatApis.tasks();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static C0765c m1543v(C0765c c0765c, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).longValue() > 0) {
                arrayList.add(next);
            }
        }
        List listM8401J1 = AbstractC4166m.m8401J1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)));
        Long l10 = (Long) AbstractC4166m.m8424v1(listM8401J1);
        return C0765c.m1980a(c0765c, 0, null, null, null, null, l10 != null ? l10.longValue() : 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, listM8401J1, 2097087);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C3958e m1544a(int i9, int i10, InterfaceC1231l interfaceC1231l) {
        boolean zAwait;
        if (i9 <= 0 || i10 <= 0) {
            if (i10 < 1) {
                i10 = 1;
            }
            return new C3958e(0, Integer.valueOf(i10));
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C1696s c1696s = (C1696s) interfaceC1231l.invoke(new C0768f(atomicInteger, 0, countDownLatch));
        if (c1696s == null) {
            return new C3958e(0, Integer.valueOf(i10));
        }
        try {
            zAwait = countDownLatch.await(30L, TimeUnit.MINUTES);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            zAwait = false;
        }
        if (zAwait) {
            int iM7909r = AbstractC3754e0.m7909r(atomicInteger.get() / i9, 0, i10);
            return new C3958e(Integer.valueOf(iM7909r), Integer.valueOf(i10 - iM7909r));
        }
        c1696s.m4332a();
        ((C0042b) this.f1721d).invoke("定时任务等待发送通道完成超时", null);
        return new C3958e(0, Integer.valueOf(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0067 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public List m1545c(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f1719b;
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
            AbstractC0921a.m2261x("[Hchat:RoundAvatar] 定位头像入口异常: ", thM8182b.getMessage(), thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public synchronized void m1546d(C0765c c0765c, int i9, int i10) {
        try {
            C0765c c0765cM1982b = ((C0769g) this.f1722e).m1982b(c0765c.f2288a);
            if (c0765cM1982b != null) {
                List listM188v = C0014a.m188v(c0765cM1982b);
                if (!listM188v.contains(Long.valueOf(c0765c.f2294g))) {
                    if (c0765cM1982b.f2300m.equals("running")) {
                        ((C0769g) this.f1722e).m1984d(C0765c.m1980a(c0765cM1982b, 0, null, null, null, null, 0L, 0, null, 0, 0, false, "pending", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207));
                    }
                    m1554r();
                    return;
                }
                int i11 = c0765cM1982b.f2295h;
                if (i11 == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM188v) {
                        if (!(((Number) obj).longValue() == c0765c.f2294g)) {
                            arrayList.add(obj);
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    C0769g c0769g = (C0769g) this.f1722e;
                    if (zIsEmpty) {
                        c0769g.m1981a(c0765c.f2288a);
                    } else {
                        c0769g.m1984d(C0765c.m1980a(m1543v(c0765cM1982b, arrayList), 0, null, null, null, null, 0L, 0, null, 0, 0, false, "pending", System.currentTimeMillis(), i9, i10, null, 0, 0, null, 0, null, 4132863));
                        m1554r();
                    }
                    return;
                }
                long jM170F = C0014a.m170F(c0765c.f2294g, i11, c0765cM1982b.f2296i, System.currentTimeMillis());
                if (jM170F <= 0) {
                    ((C0769g) this.f1722e).m1981a(c0765c.f2288a);
                    return;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM188v));
                Iterator it = listM188v.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    if (jLongValue == c0765c.f2294g) {
                        jLongValue = jM170F;
                    }
                    arrayList2.add(Long.valueOf(jLongValue));
                }
                ((C0769g) this.f1722e).m1984d(C0014a.m184r(C0765c.m1980a(m1543v(c0765cM1982b, arrayList2), 0, null, null, null, null, 0L, 0, null, 0, 0, false, "pending", System.currentTimeMillis(), i9, i10, null, 0, 0, null, 0, null, 4132863)));
                m1554r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m1547e(Method method) {
        XC_MethodHook.Unhook c3959f;
        ConcurrentHashMap.KeySetView keySetView = (ConcurrentHashMap.KeySetView) this.f1723f;
        if (method == null || !keySetView.add(method)) {
            return;
        }
        try {
            c3959f = C3744i.f12154b.m7763b(method, new C0543d(this, 2));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            keySetView.remove(method);
            AbstractC0921a.m2261x("[Hchat:RoundAvatar] 安装通知提交头像 Hook 失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean m1548f(Executable executable, int i9, int i10) {
        Object c3959f;
        ConcurrentHashMap.KeySetView keySetView = (ConcurrentHashMap.KeySetView) this.f1722e;
        if (keySetView.contains(executable)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(executable, new C0544e(this, i9, i10));
            keySetView.add(executable);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC1184v0.m3204n("[Hchat:RoundAvatar] 安装头像弧度 Hook 失败: " + executable + ", error=" + thM8182b.getMessage(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public synchronized boolean m1549g(boolean z9) {
        Object c3959f;
        Object c3959f2;
        switch (this.f1718a) {
            case 2:
                synchronized (this) {
                    if (this.f1720c) {
                        return true;
                    }
                    Method methodM1550n = m1550n(z9);
                    if (methodM1550n == null) {
                        return false;
                    }
                    try {
                        C3744i.f12154b.m7763b(methodM1550n, new C0219e(this, 17));
                        this.f1720c = true;
                        c3959f = Boolean.TRUE;
                        break;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        ((C2026t) this.f1722e).invoke("禁止拍一拍 Hook 安装失败: " + methodM1550n.toGenericString(), thM8182b);
                        c3959f = Boolean.FALSE;
                    }
                    return ((Boolean) c3959f).booleanValue();
                }
            default:
                synchronized (this) {
                    if (this.f1720c) {
                        return true;
                    }
                    Method methodM1552p = m1552p(z9);
                    if (methodM1552p == null) {
                        return false;
                    }
                    try {
                        C3744i.f12154b.m7763b(methodM1552p, new C0219e(this, 22));
                        this.f1720c = true;
                        c3959f2 = Boolean.TRUE;
                        break;
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                    if (thM8182b2 != null) {
                        ((C2026t) this.f1722e).invoke("正在输入上报 Hook 安装失败: " + methodM1552p.toGenericString(), thM8182b2);
                        c3959f2 = Boolean.FALSE;
                    }
                    return ((Boolean) c3959f2).booleanValue();
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x00e5 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: n */
    public Method m1550n(boolean z9) {
        Object c3959f;
        Object c3959f2;
        C2026t c2026t = (C2026t) this.f1722e;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1723f;
        C3742g c3742g = this.f1719b;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|disable_pat_v1_avatar_double_click") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "avatar_double_click_method");
        if (methodM2087c != null) {
            if (m1536h(methodM2087c)) {
                return methodM2087c;
            }
            C0828b.m2085a(sharedPreferences, strConcat, "avatar_double_click_method");
        }
        if (!z9) {
            return null;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.AvatarDoubleClickListener", "onDoubleClick tag null", "onDoubleClick: %s");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
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
                if (m1536h((Method) obj)) {
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
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c2026t.invoke("定位聊天头像双击入口失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "avatar_double_click_method", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("avatar_double_click_method").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c2026t.invoke("聊天头像双击入口定位结果不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C1955z(25), 31)), null);
            }
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public C0542c m1551o() {
        C3958e c3958e;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1721d;
        C3742g c3742g = this.f1719b;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Method method = null;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|round_avatar_v1") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "legacy_load");
        if (methodM2087c == null || !m1537i(methodM2087c)) {
            methodM2087c = null;
        }
        Constructor constructorM2088d = C0828b.m2088d(sharedPreferences, strConcat, classLoader, "worker_constructor");
        if (constructorM2088d == null || !m1539k(constructorM2088d)) {
            constructorM2088d = null;
        }
        Method methodM2087c2 = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "worker_modify");
        if (methodM2087c != null && constructorM2088d != null) {
            if (methodM2087c2 != null) {
                Class declaringClass = constructorM2088d.getDeclaringClass();
                declaringClass.getClass();
                if (m1540l(declaringClass, methodM2087c2)) {
                    method = methodM2087c2;
                }
            }
            return new C0542c(methodM2087c, constructorM2088d, method);
        }
        List listM1545c = m1545c("MicroMsg.AvatarDrawable");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1545c) {
            if (obj instanceof Method) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (m1537i((Method) obj2)) {
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
        Method method2 = (Method) AbstractC4166m.m8400I1(arrayList3);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "legacy_load", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("legacy_load").apply();
            } catch (Throwable unused) {
            }
            if (arrayList3.size() > 1) {
                AbstractC1184v0.m3203m("[Hchat:RoundAvatar] 旧式头像入口候选不唯一");
            }
        }
        if (method2 != null) {
            List listM1545c2 = m1545c("workerScope", "username");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : listM1545c2) {
                if (obj4 instanceof Constructor) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : arrayList4) {
                if (m1539k((Constructor) obj5)) {
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
            Constructor constructor = (Constructor) AbstractC4166m.m8400I1(arrayList6);
            if (constructor != null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj7 : listM1545c2) {
                    if (obj7 instanceof Method) {
                        arrayList7.add(obj7);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj8 : arrayList7) {
                    Class declaringClass2 = constructor.getDeclaringClass();
                    declaringClass2.getClass();
                    if (m1540l(declaringClass2, (Method) obj8)) {
                        arrayList8.add(obj8);
                    }
                }
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj9 : arrayList8) {
                    if (hashSet3.add(((Method) obj9).toGenericString())) {
                        arrayList9.add(obj9);
                    }
                }
                Method method3 = (Method) AbstractC4166m.m8400I1(arrayList9);
                C0828b.m2093i(sharedPreferences, strConcat, "worker_constructor", constructor);
                if (method3 != null) {
                    C0828b.m2092h(sharedPreferences, strConcat, "worker_modify", method3);
                } else {
                    C0828b.m2085a(sharedPreferences, strConcat, "worker_modify");
                    if (arrayList9.size() > 1) {
                        AbstractC1184v0.m3203m("[Hchat:RoundAvatar] 新式头像更新入口候选不唯一");
                    }
                }
                c3958e = new C3958e(constructor, method3);
            } else {
                try {
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                        editorEdit2.clear().putString("cache.key", strConcat);
                    }
                    editorEdit2.remove("worker_constructor").apply();
                } catch (Throwable unused2) {
                }
                if (arrayList6.size() > 1) {
                    AbstractC1184v0.m3203m("[Hchat:RoundAvatar] 新式头像构造入口候选不唯一");
                }
                c3958e = null;
            }
            if (c3958e != null) {
                return new C0542c(method2, (Constructor) c3958e.f12961g, (Method) c3958e.f12962h);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x00e3 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: p */
    public Method m1552p(boolean z9) {
        Object c3959f;
        Object c3959f2;
        C2026t c2026t = (C2026t) this.f1722e;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1723f;
        C3742g c3742g = this.f1719b;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|block_typing_report_v1_direct_send") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "send_typing_method");
        if (methodM2087c != null) {
            if (m1538j(methodM2087c)) {
                return methodM2087c;
            }
            C0828b.m2085a(sharedPreferences, strConcat, "send_typing_method");
        }
        if (!z9) {
            return null;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("MicroMsg.SignallingComponent", "[doDirectSend] mChattingContext is null!");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
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
                if (m1538j((Method) obj)) {
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
        Object obj3 = c3959f;
        if (thM8182b != null) {
            c2026t.invoke("定位正在输入上报方法失败", thM8182b);
            obj3 = C4173t.f13710g;
        }
        List list = (List) obj3;
        Method method2 = (Method) AbstractC4166m.m8400I1(list);
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "send_typing_method", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("send_typing_method").apply();
            } catch (Throwable unused) {
            }
            if (list.size() > 1) {
                c2026t.invoke("正在输入上报方法定位结果不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C3092e(16), 31)), null);
            }
        }
        return method2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public void m1553q(PowerManager.WakeLock wakeLock) {
        Object c3959f;
        if (wakeLock == null) {
            return;
        }
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            ((C0042b) this.f1721d).invoke("定时任务 WakeLock 释放失败", thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public synchronized void m1554r() {
        try {
            if (this.f1720c) {
                Set setKeySet = ((ConcurrentHashMap) this.f1723f).keySet();
                setKeySet.getClass();
                for (String str : AbstractC4166m.m8407P1(setKeySet)) {
                    str.getClass();
                    ((ConcurrentHashMap) this.f1723f).remove(str);
                    C3086j c3086jM1542u = m1542u();
                    if (c3086jM1542u != null) {
                        c3086jM1542u.m6550a(str);
                    }
                }
                if (((C0769g) this.f1722e).m1983c()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    boolean z9 = false;
                    for (C0765c c0765c : ((C0769g) this.f1722e).m1986f()) {
                        C0765c c0765cM1543v = m1543v(c0765c, C0014a.m188v(c0765c));
                        boolean z10 = true;
                        if (!c0765cM1543v.equals(c0765c)) {
                            z9 = true;
                        }
                        if (c0765cM1543v.f2300m.equals("running")) {
                            c0765cM1543v = C0765c.m1980a(c0765cM1543v, 0, null, null, null, null, 0L, 0, null, 0, 0, false, "pending", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207);
                            z9 = true;
                        }
                        long j3 = c0765cM1543v.f2294g;
                        if (j3 > 0) {
                            if (c0765cM1543v.f2295h == 0) {
                                List list = c0765cM1543v.f2309v;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : list) {
                                    long jLongValue = ((Number) obj).longValue();
                                    if (jLongValue > jCurrentTimeMillis || (c0765cM1543v.f2299l && jCurrentTimeMillis - jLongValue < 600000)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                if (arrayList2.equals(c0765cM1543v.f2309v)) {
                                    z10 = z9;
                                } else if (!arrayList2.isEmpty()) {
                                    c0765cM1543v = m1543v(c0765cM1543v, arrayList2);
                                }
                                if (jCurrentTimeMillis < c0765cM1543v.f2294g) {
                                    arrayList.add(c0765cM1543v);
                                    m1555s(c0765cM1543v, c0765cM1543v.f2294g - jCurrentTimeMillis);
                                } else if (c0765cM1543v.f2299l) {
                                    arrayList.add(c0765cM1543v);
                                    m1555s(c0765cM1543v, 1000L);
                                }
                            } else if (jCurrentTimeMillis < j3) {
                                arrayList.add(c0765cM1543v);
                                m1555s(c0765cM1543v, c0765cM1543v.f2294g - jCurrentTimeMillis);
                            } else if (c0765cM1543v.f2299l) {
                                arrayList.add(c0765cM1543v);
                                m1555s(c0765cM1543v, 1000L);
                                z10 = z9;
                            } else {
                                List list2 = c0765cM1543v.f2309v;
                                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list2));
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(Long.valueOf(C0014a.m170F(((Number) it.next()).longValue(), c0765cM1543v.f2295h, c0765cM1543v.f2296i, jCurrentTimeMillis)));
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj2 : arrayList3) {
                                    if (((Number) obj2).longValue() > jCurrentTimeMillis) {
                                        arrayList4.add(obj2);
                                    }
                                }
                                if (!arrayList4.isEmpty()) {
                                    C0765c c0765cM1980a = C0765c.m1980a(m1543v(c0765cM1543v, arrayList4), 0, null, null, null, null, 0L, 0, null, 0, 0, false, "pending", 0L, 0, 0, null, 0, 0, null, 0, null, 4190207);
                                    arrayList.add(c0765cM1980a);
                                    m1555s(c0765cM1980a, c0765cM1980a.f2294g - jCurrentTimeMillis);
                                }
                            }
                        }
                        z9 = z10;
                    }
                    if (z9) {
                        ((C0769g) this.f1722e).m1985e(arrayList);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m1555s(C0765c c0765c, long j3) {
        Object c3959f;
        Object c3959f2;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f1723f;
        String str = c0765c.f2288a;
        C3086j c3086jM1542u = m1542u();
        Object obj = null;
        if (c3086jM1542u == null) {
            ((C0042b) this.f1721d).invoke("定时任务公共调度不可用", null);
            return;
        }
        String strM9263g = AbstractC4855en.m9263g("scheduled_task:", str);
        String str2 = "scheduled_task:" + str;
        concurrentHashMap.remove(str2);
        C3086j c3086jM1542u2 = m1542u();
        if (c3086jM1542u2 != null) {
            c3086jM1542u2.m6550a(str2);
        }
        concurrentHashMap.put(strM9263g, Boolean.TRUE);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j4 = c0765c.f2294g;
        if (j4 <= jCurrentTimeMillis) {
            j4 = (j3 < 0 ? 0L : j3) + jCurrentTimeMillis;
        }
        long j5 = j4;
        RunnableC0766d runnableC0766d = new RunnableC0766d(this, c0765c, 1);
        String str3 = strM9263g.length() > 0 ? strM9263g : null;
        if (str3 == null) {
            c3086jM1542u.m6555f(null, j5 - System.currentTimeMillis(), runnableC0766d);
            return;
        }
        c3086jM1542u.m6550a(str3);
        long jIncrementAndGet = c3086jM1542u.f9972h.incrementAndGet();
        Context context = c3086jM1542u.f9970f;
        try {
            Intent intent = new Intent("h.Hchat.action.EXACT_TASK");
            intent.setPackage(context.getPackageName());
            intent.setData(new Uri.Builder().scheme("hchat-scheduled-task").authority("runtime").appendPath(str3).build());
            intent.putExtra("h.Hchat.extra.EXACT_TASK_KEY", str3);
            intent.putExtra("h.Hchat.extra.EXACT_TASK_TOKEN", jIncrementAndGet);
            c3959f = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            obj = c3959f;
        } else {
            c3086jM1542u.m6552c("精确定时 PendingIntent 创建失败: " + thM8182b.getMessage());
        }
        PendingIntent pendingIntent = (PendingIntent) obj;
        if (pendingIntent == null) {
            c3086jM1542u.m6555f(str3, j5 - System.currentTimeMillis(), runnableC0766d);
            return;
        }
        RunnableC0531r runnableC0531r = new RunnableC0531r(c3086jM1542u, str3, jIncrementAndGet, 4);
        c3086jM1542u.f9968d.put(str3, new C3085i(jIncrementAndGet, pendingIntent, runnableC0531r, runnableC0766d));
        Handler handler = c3086jM1542u.f9965a;
        long jCurrentTimeMillis2 = j5 - System.currentTimeMillis();
        handler.postDelayed(runnableC0531r, jCurrentTimeMillis2 >= 0 ? jCurrentTimeMillis2 : 0L);
        Object c3959f3 = C3967n.f12976a;
        AlarmManager alarmManager = c3086jM1542u.f9971g;
        if (alarmManager == null || !c3086jM1542u.f9973i) {
            c3086jM1542u.m6552c("精确定时不可用，已回退进程内调度");
            return;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        if (j5 < jCurrentTimeMillis3) {
            j5 = jCurrentTimeMillis3;
        }
        try {
            alarmManager.setExactAndAllowWhileIdle(0, j5, pendingIntent);
            c3959f2 = c3959f3;
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
        if (thM8182b2 != null) {
            try {
                alarmManager.setAndAllowWhileIdle(0, j5, pendingIntent);
            } catch (Throwable th4) {
                c3959f3 = new C3959f(th4);
            }
            Throwable thM8182b3 = C3960g.m8182b(c3959f3);
            if (thM8182b3 != null) {
                c3086jM1542u.m6552c("精确定时安装失败: exact=" + thM8182b2.getMessage() + ", fallback=" + thM8182b3.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f7  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3958e m1556t(C0765c c0765c) {
        boolean z9;
        Object c3959f;
        Iterator it;
        String str;
        char c10;
        boolean z10;
        boolean z11;
        boolean zM5601x;
        boolean zM5301a;
        C2097h c2097h;
        Iterator it2;
        String str2;
        boolean z12;
        String strM4293j;
        Object next;
        Object next2;
        boolean zM7087u = false;
        int i9 = c0765c.f2305r;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        char c11 = 2;
        if (i9 == 1) {
            C0042b c0042b = (C0042b) this.f1721d;
            String strM181o = C0014a.m181o(c0765c);
            if (strM181o != null) {
                c0042b.invoke("朋友圈定时任务配置无效: ".concat(strM181o), null);
            } else {
                C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                if (c3351d0SnsApi == null || !c3351d0SnsApi.f10782b.hasSnsUploadApi()) {
                    c0042b.invoke("朋友圈定时任务公共 API 不可用", null);
                } else {
                    List listM187u = C0014a.m187u(c0765c);
                    Iterator it3 = listM187u.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (((C0763a) next).f2286a == 0) {
                            break;
                        }
                    }
                    C0763a c0763a = (C0763a) next;
                    String str4 = c0763a != null ? c0763a.f2287b : null;
                    if (str4 == null) {
                        str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM187u) {
                        if (((C0763a) obj).f2286a == 1) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((C0763a) it4.next()).f2287b);
                    }
                    Iterator it5 = listM187u.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                        if (((C0763a) next2).f2286a == 2) {
                            break;
                        }
                    }
                    C0763a c0763a2 = (C0763a) next2;
                    String str5 = c0763a2 != null ? c0763a2.f2287b : null;
                    if (str5 == null) {
                        str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    int i10 = c0765c.f2306s;
                    if (i10 == 0) {
                        zM7087u = c3351d0SnsApi.m7087u(str4, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else if (i10 == 1) {
                        zM7087u = c3351d0SnsApi.m7090x(str4, arrayList2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else if (i10 == 2) {
                        zM7087u = c3351d0SnsApi.m7091y(str4, str5, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else if (i10 == 3) {
                        zM7087u = c3351d0SnsApi.m7090x(HttpUrl.FRAGMENT_ENCODE_SET, arrayList2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                    } else if (i10 == 4) {
                        zM7087u = c3351d0SnsApi.m7091y(HttpUrl.FRAGMENT_ENCODE_SET, str5, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }
                zM7087u = false;
            }
            return zM7087u ? new C3958e(1, 0) : new C3958e(0, 1);
        }
        ArrayList arrayListM186t = C0014a.m186t(c0765c);
        if (arrayListM186t.isEmpty()) {
            z9 = false;
        } else {
            Iterator it6 = arrayListM186t.iterator();
            while (it6.hasNext()) {
                if (((C0763a) it6.next()).f2286a == 8) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
        }
        if (z9) {
            if (arrayListM186t.isEmpty()) {
                z12 = false;
            } else {
                Iterator it7 = arrayListM186t.iterator();
                while (it7.hasNext()) {
                    if (((C0763a) it7.next()).f2286a != 8) {
                        z12 = true;
                        break;
                    }
                }
                z12 = false;
            }
            if (z12) {
                ((C0042b) this.f1721d).invoke("自选聊天记录定时任务不能与普通内容混合", null);
                return new C3958e(0, Integer.valueOf(m1535b(c0765c)));
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it8 = arrayListM186t.iterator();
            while (it8.hasNext()) {
                C1697t c1697tM10292s = AbstractC5700d.m10292s(((C0763a) it8.next()).f2287b);
                if (c1697tM10292s != null) {
                    arrayList3.add(c1697tM10292s);
                }
            }
            if (arrayList3.size() != arrayListM186t.size() || arrayList3.isEmpty()) {
                ((C0042b) this.f1721d).invoke("自选聊天记录定时任务快照无效", null);
                return new C3958e(0, Integer.valueOf(m1535b(c0765c)));
            }
            int i11 = c0765c.f2308u;
            if (arrayList3.isEmpty()) {
                strM4293j = "请选择发送内容";
            } else {
                C1688k0 c1688k0 = AbstractC0000a.f0g;
                if (c1688k0 == null) {
                    strM4293j = "群发助手尚未就绪";
                } else if (i11 != 1) {
                    strM4293j = null;
                } else if (c1688k0.f5612c.m4300g()) {
                    List listM4305o = c1688k0.f5612c.m4305o(arrayList3);
                    if (listM4305o.isEmpty()) {
                        c1688k0.f5612c.getClass();
                        strM4293j = C1687k.m4293j(arrayList3);
                    } else {
                        strM4293j = "微信原生群发助手不支持: ".concat(AbstractC4166m.m8392A1(listM4305o, "、", null, null, null, 62));
                    }
                } else {
                    strM4293j = "微信原生群发助手通道不可用";
                }
            }
            if (strM4293j == null) {
                return m1544a(arrayList3.size(), c0765c.f2293f.size(), new C0767e(c0765c, arrayList3));
            }
            ((C0042b) this.f1721d).invoke("定时转发配置无效: ".concat(strM4293j), null);
            return new C3958e(0, Integer.valueOf(m1535b(c0765c)));
        }
        if (c0765c.f2308u == 1) {
            String strM52a1 = AbstractC0000a.m52a1(1, arrayListM186t);
            if (strM52a1 == null) {
                return m1544a(arrayListM186t.size(), c0765c.f2293f.size(), new C0767e(arrayListM186t, c0765c));
            }
            ((C0042b) this.f1721d).invoke("微信原生定时任务配置无效: ".concat(strM52a1), null);
            return new C3958e(0, Integer.valueOf(m1535b(c0765c)));
        }
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        if (c2343gM6844q == null) {
            c2343gM6844q = WeChatApis.messages();
        }
        C2343g c2343g = c2343gM6844q;
        C2105p c2105pMedia = WeChatApis.media();
        Iterator it9 = c0765c.f2293f.iterator();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (it9.hasNext()) {
            Object next3 = it9.next();
            int i15 = i12 + 1;
            if (i12 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            String str6 = (String) next3;
            ArrayList arrayListM186t2 = C0014a.m186t(c0765c);
            if (arrayListM186t2.isEmpty()) {
                it = it9;
                str = str3;
                c10 = c11;
                z10 = false;
            } else {
                try {
                    WeChatApis.contact().getClass();
                    C1368i c1368i = WeChatApis.contactApi;
                    c3959f = c1368i != null ? c1368i.m3729r(str6) : null;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                String str7 = (String) c3959f;
                if (str7 == null) {
                    str7 = str3;
                }
                if (AbstractC3149m.m6721t0(str7)) {
                    str7 = str6;
                }
                Iterator it10 = arrayListM186t2.iterator();
                int i16 = 0;
                while (true) {
                    if (it10.hasNext()) {
                        Object next4 = it10.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            AbstractC0000a.m32Q0();
                            throw null;
                        }
                        C0763a c0763a3 = (C0763a) next4;
                        int i18 = c0763a3.f2286a;
                        String str8 = c0763a3.f2287b;
                        switch (i18) {
                            case 0:
                                it = it9;
                                c10 = 2;
                                if (c2343g == null) {
                                    z11 = false;
                                    zM5601x = false;
                                } else {
                                    z11 = false;
                                    String strM6737a0 = AbstractC3156t.m6737a0(str8, "%friendName%", str7, false);
                                    zM5601x = AbstractC3149m.m6721t0(strM6737a0) ? false : c2343g.m5601x(str6, strM6737a0);
                                }
                                break;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                if (c2105pMedia == null) {
                                    it = it9;
                                    z11 = false;
                                    zM5601x = false;
                                    c10 = 2;
                                } else {
                                    File file = new File(str8);
                                    if (file.isFile()) {
                                        int i19 = c0763a3.f2286a;
                                        if (i19 == 1) {
                                            it = it9;
                                            zM5301a = c2105pMedia.m5301a(str6, str8);
                                        } else if (i19 != 2) {
                                            it = it9;
                                            if (i19 == 3) {
                                                zM5301a = c2105pMedia.f7039e.m588T(str6, str8, file.getName());
                                            } else if (i19 == 4) {
                                                zM5301a = c2105pMedia.f7038d.m5219v(str6, str8);
                                            } else if (i19 == 5) {
                                                zM5301a = c2105pMedia.f7036b.m5324t(str6, str8);
                                            }
                                        } else {
                                            it = it9;
                                            zM5301a = c2105pMedia.f7037c.m972q(str6, str8);
                                        }
                                        zM5601x = zM5301a;
                                        z11 = false;
                                        c10 = 2;
                                        break;
                                    }
                                    z11 = false;
                                    zM5601x = false;
                                    c10 = 2;
                                }
                                break;
                            case 6:
                                if (c2343g != null) {
                                    String strM6737a02 = AbstractC3156t.m6737a0(str8, "%friendName%", str7, false);
                                    if (!AbstractC3149m.m6721t0(strM6737a02)) {
                                        zM5601x = c2343g.m5603z(str6, strM6737a02);
                                        it = it9;
                                        z11 = false;
                                        c10 = 2;
                                    }
                                }
                                it = it9;
                                z11 = false;
                                zM5601x = false;
                                c10 = 2;
                                break;
                            case 7:
                                if (c2105pMedia != null && (c2097h = c2105pMedia.f7040f) != null && c2097h.m5236A(str6, str8)) {
                                    it = it9;
                                    z11 = false;
                                    zM5601x = true;
                                    c10 = 2;
                                }
                                it = it9;
                                z11 = false;
                                zM5601x = false;
                                c10 = 2;
                                break;
                        }
                        if (zM5601x) {
                            if (i16 < arrayListM186t2.size() - 1) {
                                it2 = it10;
                                long j3 = ((long) c0765c.f2298k) * 1000;
                                if (j3 > 0) {
                                    str2 = str3;
                                    try {
                                        Thread.sleep(Math.min(j3, 3600000L));
                                    } catch (InterruptedException unused) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                                str3 = str2;
                                it10 = it2;
                                c11 = c10;
                                i16 = i17;
                                it9 = it;
                            } else {
                                it2 = it10;
                            }
                            str2 = str3;
                            str3 = str2;
                            it10 = it2;
                            c11 = c10;
                            i16 = i17;
                            it9 = it;
                        } else {
                            str = str3;
                            z10 = z11;
                        }
                    } else {
                        it = it9;
                        str = str3;
                        c10 = c11;
                        z10 = true;
                    }
                }
            }
            if (z10) {
                i13++;
            } else {
                i14++;
            }
            if (i12 < c0765c.f2293f.size() - 1) {
                long j4 = ((long) c0765c.f2297j) * 1000;
                if (j4 > 0) {
                    try {
                        Thread.sleep(Math.min(j4, 3600000L));
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            str3 = str;
            i12 = i15;
            c11 = c10;
            it9 = it;
        }
        return new C3958e(Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public C0545f(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f1719b = c3742g;
        this.f1722e = c2026t;
        Context context = c3742g.f12143a;
        this.f1721d = AbstractC4302b.m8640c(context, "Hchat_disable_pat_config");
        this.f1723f = AbstractC4302b.m8640c(context, "Hchat_disable_pat_method_cache");
    }

    public C0545f(C3742g c3742g, C2026t c2026t, byte b10) {
        c3742g.getClass();
        this.f1719b = c3742g;
        this.f1722e = c2026t;
        Context context = c3742g.f12143a;
        this.f1721d = AbstractC4302b.m8640c(context, "Hchat_block_typing_report_config");
        this.f1723f = AbstractC4302b.m8640c(context, "Hchat_block_typing_report_method_cache");
    }

    public C0545f(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f1719b = c3742g;
        this.f1721d = c0042b;
        this.f1722e = new C0769g(c3742g.f12143a);
        this.f1723f = new ConcurrentHashMap();
    }
}
