package p086r0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0039l;
import p001A0.C0018S;
import p001A0.C0019T;
import p001A0.C0026a;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0051x;
import p001A0.C0052y;
import p005C0.AbstractC0068b;
import p005C0.C0067a;
import p005C0.C0069c;
import p006D.AbstractC0079h;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1134q;
import p102z0.AbstractC1135r;
import p102z0.C1124g;
import p102z0.InterfaceC1125h;

/* JADX INFO: renamed from: r0.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0955x1 implements InterfaceC0551a, InterfaceC1125h {

    /* JADX INFO: renamed from: a */
    public final Handler f3434a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public C0018S f3435b;

    /* JADX INFO: renamed from: c */
    public WeakReference f3436c;

    /* JADX INFO: renamed from: d */
    public boolean f3437d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m2130c(String str) {
        return AbstractC0307q.m537g0(AbstractC0307q.m537g0(AbstractC0307q.m537g0(AbstractC0307q.m537g0(AbstractC0307q.m537g0(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2131d(String str, String str2) {
        CharSequence charSequenceSubSequence;
        String strM509E0 = AbstractC0299i.m509E0(str, '/');
        char[] cArr = {'/'};
        int length = str2.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            char cCharAt = str2.charAt(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= 1) {
                    i3 = -1;
                    break;
                }
                if (cCharAt == cArr[i3]) {
                    break;
                }
                i3++;
            }
            if (!(i3 >= 0)) {
                charSequenceSubSequence = str2.subSequence(i2, str2.length());
                break;
            }
            i2++;
        }
        return strM509E0 + "/" + charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m2132f(Class cls) {
        return cls.isArray() ? AbstractC0307q.m536f0(cls.getName(), '.', '/') : cls.equals(Void.TYPE) ? "V" : cls.equals(Boolean.TYPE) ? "Z" : cls.equals(Byte.TYPE) ? "B" : cls.equals(Character.TYPE) ? "C" : cls.equals(Short.TYPE) ? "S" : cls.equals(Integer.TYPE) ? "I" : cls.equals(Long.TYPE) ? "J" : cls.equals(Float.TYPE) ? "F" : cls.equals(Double.TYPE) ? "D" : AbstractC0174d.m353i("L", AbstractC0307q.m536f0(cls.getName(), '.', '/'), ";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p102z0.InterfaceC1125h
    /* JADX INFO: renamed from: a */
    public final void mo1472a() {
        Context context;
        Object c0104d;
        WeakReference weakReference = this.f3436c;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            return;
        }
        boolean z2 = AbstractC1126i.f3786a;
        if (!C1124g.m2416G()) {
            AbstractC1134q.m2466g(null);
            CopyOnWriteArrayList<C0067a> copyOnWriteArrayList = (CopyOnWriteArrayList) AbstractC0068b.f315a.remove("read-trace-send-hooks");
            if (copyOnWriteArrayList != null) {
                for (C0067a c0067a : copyOnWriteArrayList) {
                    try {
                        c0067a.f314b.unhook();
                        c0104d = C0109i.f404a;
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    Throwable thM246a = AbstractC0105e.m246a(c0104d);
                    if (thM246a != null) {
                        AbstractC0731a.m1387d("hook lifecycle unhook fail", "read-trace-send-hooks", thM246a);
                    }
                    String str = c0067a.f313a;
                    if (str != null) {
                        MainHook.uniqueMetaStore.remove(str);
                    }
                }
            }
        }
        m2133b(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[PHI: r0
  0x001f: PHI (r0v3 A0.S) = (r0v2 A0.S), (r0v35 A0.S) binds: [B:6:0x000d, B:11:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2133b(Context context) {
        Context context2;
        Object c0104d;
        Method method;
        Object c0104d2;
        Object objPutIfAbsent;
        boolean z2 = AbstractC1126i.f3786a;
        if (C1124g.m2416G()) {
            C0018S c0018sM72j = this.f3435b;
            if (c0018sM72j != null) {
                List<C0019T> listM167E = c0018sM72j.f147d;
                if (listM167E.isEmpty()) {
                    listM167E = AbstractC0079h.m167E(new C0019T(c0018sM72j.f144a, c0018sM72j.f145b, c0018sM72j.f146c));
                }
                for (C0019T c0019t : listM167E) {
                    String str = c0019t.f154a;
                    StringBuilder sbM357m = AbstractC0174d.m357m("read-trace-send-click:", str, "#");
                    String str2 = c0019t.f155b;
                    sbM357m.append(str2);
                    String str3 = c0019t.f156c;
                    sbM357m.append(str3);
                    String string = sbM357m.toString();
                    if (MainHook.uniqueMetaStore.add(string)) {
                        int i2 = 0;
                        try {
                            c0104d = Class.forName(str, false, context.getClassLoader());
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        Class cls = (Class) c0104d;
                        if (cls != null) {
                            Method[] declaredMethods = cls.getDeclaredMethods();
                            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                            int length = declaredMethods.length;
                            while (true) {
                                if (i2 >= length) {
                                    method = null;
                                    break;
                                }
                                method = declaredMethods[i2];
                                if (AbstractC0223g.m414a(method.getName(), str2) && AbstractC0223g.m414a(m2134e(method), str3)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (method == null) {
                                AbstractC0731a.m1387d("read trace send hook method not found", str, str2, str3);
                                MainHook.uniqueMetaStore.remove(string);
                                context2 = context;
                            } else {
                                try {
                                    method.setAccessible(true);
                                    context2 = context;
                                    try {
                                        XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(method, new C0898e1(c0019t, this, context2, method, 1));
                                        ConcurrentHashMap concurrentHashMap = AbstractC0068b.f315a;
                                        if (unhookHookMethod != null) {
                                            ConcurrentHashMap concurrentHashMap2 = AbstractC0068b.f315a;
                                            Object copyOnWriteArrayList = concurrentHashMap2.get("read-trace-send-hooks");
                                            if (copyOnWriteArrayList == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent("read-trace-send-hooks", (copyOnWriteArrayList = new CopyOnWriteArrayList()))) != null) {
                                                copyOnWriteArrayList = objPutIfAbsent;
                                            }
                                            ((CopyOnWriteArrayList) copyOnWriteArrayList).add(new C0067a(string, unhookHookMethod));
                                        }
                                        AbstractC0731a.m1384a("read trace send hook installed", str, str2, m2134e(method));
                                        c0104d2 = C0109i.f404a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c0104d2 = new C0104d(th);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    context2 = context;
                                }
                                Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                                if (thM246a != null) {
                                    AbstractC0731a.m1387d("read trace send hook install fail", thM246a);
                                }
                            }
                        }
                    } else {
                        context2 = context;
                    }
                    context = context2;
                }
            } else {
                c0018sM72j = AbstractC0039l.m72j(context);
                if (c0018sM72j != null) {
                    this.f3435b = c0018sM72j;
                } else {
                    c0018sM72j = null;
                }
                if (c0018sM72j != null) {
                }
            }
            AbstractC1135r.m2503y(context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m2134e(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        String strM260h0 = AbstractC0120h.m260h0(parameterTypes, "", new C0946u1(this, 1), 24);
        Class<?> returnType = method.getReturnType();
        AbstractC0223g.m417d(returnType, "getReturnType(...)");
        return strM260h0 + m2132f(returnType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Object c0104d;
        Object c0104d2;
        int i2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f3436c = new WeakReference(applicationContext);
        if (!this.f3437d) {
            boolean z2 = AbstractC1126i.f3786a;
            ArrayList arrayList = AbstractC1126i.f3795j;
            if (!arrayList.contains(this) && !arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.f3437d = true;
        }
        this.f3435b = AbstractC0039l.m72j(context);
        boolean z3 = AbstractC1126i.f3786a;
        if (C1124g.m2416G() && AbstractC0039l.m72j(context) == null) {
            AbstractC0039l.m81s("unified_dexkit_scan_status_v16", false);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
        C0052y.m98c(context, new C0048u("read-trace", "已读追踪消息发送", new C0925n1(5), new C0035h(context, 18), new C0946u1(this, 0), new C0026a(16)));
        C0069c c0069c = C0069c.f316a;
        if (!C0069c.f320e) {
            synchronized (c0069c) {
                try {
                    if (!C0069c.f320e) {
                        try {
                            c0104d = Class.forName("com.tencent.mm.pluginsdk.ui.chat.ChatFooter", false, context.getClassLoader());
                        } catch (Throwable th) {
                            c0104d = new C0104d(th);
                        }
                        if (c0104d instanceof C0104d) {
                            c0104d = null;
                        }
                        Class cls = (Class) c0104d;
                        if (cls != null) {
                            Method[] declaredMethods = cls.getDeclaredMethods();
                            AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                            ArrayList<Method> arrayList2 = new ArrayList();
                            for (Method method : declaredMethods) {
                                if (AbstractC0223g.m414a(method.getName(), "setUserName") && Arrays.equals(method.getParameterTypes(), new Class[]{String.class})) {
                                    arrayList2.add(method);
                                }
                            }
                            int i3 = 0;
                            for (Method method2 : arrayList2) {
                                String str = "wechat-chat-session:" + method2.getDeclaringClass().getName() + "#" + method2.getName();
                                if (MainHook.uniqueMetaStore.add(str)) {
                                    C0069c c0069c2 = C0069c.f316a;
                                    try {
                                        AbstractC0514f.m1027d(method2, new C0051x(1));
                                        i2 = i3 + 1;
                                        try {
                                            c0104d2 = Integer.valueOf(i3);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i3 = i2;
                                            c0104d2 = new C0104d(th);
                                            i2 = i3;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                                    if (thM246a != null) {
                                        MainHook.uniqueMetaStore.remove(str);
                                        AbstractC0731a.m1387d("chat session hook install fail", method2, thM246a);
                                    }
                                    i3 = i2;
                                } else {
                                    i3++;
                                }
                            }
                            C0069c.f320e = i3 > 0;
                            if (C0069c.f320e) {
                                AbstractC0731a.m1384a("wechat chat session hub installed", "methods=" + i3);
                            }
                            C0069c c0069c3 = C0069c.f316a;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        m2133b(context);
    }
}
