package ca;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0119x;
import bb.C0240b;
import be.AbstractC0283h;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p011ab.C0041a;
import p011ab.C0042b;
import p015b0.C0136d0;
import p019b4.C0178b;
import p020b5.C0184c;
import p036c9.C0442h;
import p036c9.C0490u;
import p036c9.RunnableC0474p;
import p036c9.RunnableC0487t;
import p036c9.ThreadFactoryC0478q;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p109hb.C1687k;
import p109hb.C1688k0;
import p109hb.C1689l;
import p109hb.C1690m;
import p109hb.C1696s;
import p109hb.C1697t;
import p136j8.AbstractC2091b;
import p136j8.C2097h;
import p136j8.C2098i;
import p136j8.C2105p;
import p153k8.C2356t;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p230p8.C3350d;
import p230p8.C3363o;
import p230p8.C3370v;
import p242q8.C3460o;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p276sf.EnumC3957d;
import p300ub.AbstractC4302b;
import p332wb.C5491y2;
import p332wb.InterfaceC5059kv;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ca.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517e0 {

    /* JADX INFO: renamed from: q */
    public static final Set f1576q = AbstractC4156d0.m8355W(43, 62);

    /* JADX INFO: renamed from: r */
    public static final Set f1577r = AbstractC4156d0.m8355W(1, 3, 43, 62);

    /* JADX INFO: renamed from: s */
    public static final Set f1578s = AbstractC4156d0.m8355W(1, 3, 34, 42, 43, 47, 48, 49, 62);

    /* JADX INFO: renamed from: a */
    public final C3742g f1579a;

    /* JADX INFO: renamed from: b */
    public final C3363o f1580b;

    /* JADX INFO: renamed from: c */
    public final C0042b f1581c;

    /* JADX INFO: renamed from: d */
    public final Handler f1582d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f1583e;

    /* JADX INFO: renamed from: f */
    public final Set f1584f;

    /* JADX INFO: renamed from: g */
    public final Map f1585g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f1586h;

    /* JADX INFO: renamed from: i */
    public final Map f1587i;

    /* JADX INFO: renamed from: j */
    public volatile long f1588j;

    /* JADX INFO: renamed from: k */
    public volatile WeakReference f1589k;

    /* JADX INFO: renamed from: l */
    public volatile long f1590l;

    /* JADX INFO: renamed from: m */
    public final ConcurrentHashMap f1591m;

    /* JADX INFO: renamed from: n */
    public final ExecutorService f1592n;

    /* JADX INFO: renamed from: o */
    public final C0119x f1593o;

    /* JADX INFO: renamed from: p */
    public final C0184c f1594p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0517e0(C3742g c3742g, C3363o c3363o, C0042b c0042b) {
        c3742g.getClass();
        this.f1579a = c3742g;
        this.f1580b = c3363o;
        this.f1581c = c0042b;
        this.f1582d = new Handler(Looper.getMainLooper());
        this.f1583e = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_message_forward_config");
        this.f1584f = AbstractC2091b.m5168o();
        this.f1585g = AbstractC3199a.m6843p();
        this.f1586h = new ConcurrentHashMap();
        this.f1587i = AbstractC3199a.m6843p();
        this.f1591m = new ConcurrentHashMap();
        this.f1592n = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(2));
        this.f1593o = new C0119x(c3742g);
        c3742g.getClass();
        C0184c c0184c = new C0184c();
        c0184c.f469a = c3742g;
        c0184c.f470b = c0042b;
        c0184c.f471c = AbstractC0283h.m1127G(EnumC3957d.f12958g, new C0041a(c0184c, 10));
        this.f1594p = c0184c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[PHI: r12
  0x0025: PHI (r12v8 android.content.Context) = (r12v3 android.content.Context), (r12v10 android.content.Context) binds: [B:14:0x0023, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MenuItem m1515a(Object obj, View view, int i9, int i10) {
        int identifier;
        Object next;
        MenuItem menuItemM1517c = m1517c(i10, obj);
        if (menuItemM1517c != null) {
            return menuItemM1517c;
        }
        if (view == null || (contextM7263a = view.getContext()) == null) {
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            Context contextM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
            if (contextM7263a != null) {
                Resources resources = contextM7263a.getResources();
                String packageName = contextM7263a.getPackageName();
                String[] strArr = {"raw", "drawable"};
                for (int i11 = 0; i11 < 2; i11++) {
                    identifier = resources.getIdentifier("icons_filled_share", strArr[i11], packageName);
                    if (identifier != 0) {
                        break;
                    }
                }
                identifier = 0;
            } else {
                identifier = 0;
            }
        }
        if (identifier != 0) {
            Iterator<T> it = KavaReflector.declaredMethods(obj.getClass()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Method method = (Method) next;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (AbstractC1416l.m3825a(method.getName(), "c") && parameterTypes.length == 5) {
                    Class<?> cls = parameterTypes[0];
                    Class cls2 = Integer.TYPE;
                    if (AbstractC1416l.m3825a(cls, cls2) && AbstractC1416l.m3825a(parameterTypes[1], cls2) && AbstractC1416l.m3825a(parameterTypes[2], cls2) && parameterTypes[3].isAssignableFrom(String.class) && AbstractC1416l.m3825a(parameterTypes[4], cls2)) {
                        break;
                    }
                }
            }
            if (KavaReflector.invokeSuccessfully((Method) next, obj, Integer.valueOf(i9), Integer.valueOf(i10), 0, "转发[H]", Integer.valueOf(identifier))) {
                return m1517c(i10, obj);
            }
        }
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i9), Integer.valueOf(i10), 0, "转发[H]");
        if (objInvokeMethod == null) {
            objInvokeMethod = KavaReflector.invokeMethod(obj, "add", Integer.valueOf(i9), Integer.valueOf(i10), 0, "转发[H]");
        }
        if (objInvokeMethod instanceof MenuItem) {
            if (identifier != 0) {
                try {
                    ((MenuItem) objInvokeMethod).setIcon(identifier);
                } catch (Throwable unused) {
                }
            }
            return (MenuItem) objInvokeMethod;
        }
        if (objInvokeMethod != null) {
            return m1517c(i10, obj);
        }
        Object objInvokeMethod2 = KavaReflector.invokeMethod(obj, "f", Integer.valueOf(i10), "转发[H]");
        if (objInvokeMethod2 == null) {
            objInvokeMethod2 = KavaReflector.invokeMethod(obj, "f", Integer.valueOf(i10), "转发[H]");
        }
        MenuItem menuItem = objInvokeMethod2 instanceof MenuItem ? (MenuItem) objInvokeMethod2 : null;
        return menuItem != null ? menuItem : m1517c(i10, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Activity m1516b() {
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
        if (activityM7263a == null) {
            activityM7263a = null;
        }
        if (activityM7263a != null) {
            if (!(activityM7263a.isFinishing() || activityM7263a.isDestroyed())) {
                return activityM7263a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static MenuItem m1517c(int i9, Object obj) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "findItem", Integer.valueOf(i9));
        if (objInvokeMethod instanceof MenuItem) {
            return (MenuItem) objInvokeMethod;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1518h(ArrayList arrayList) {
        int i9;
        if (arrayList.isEmpty()) {
            return "朋友圈仅支持文字、图片和视频消息";
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!f1577r.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                    return "朋友圈仅支持文字、图片和视频消息";
                }
            }
        }
        int i10 = 0;
        if (arrayList.isEmpty()) {
            i9 = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i9 = 0;
            while (it2.hasNext()) {
                if ((((Number) it2.next()).intValue() == 3) && (i9 = i9 + 1) < 0) {
                    AbstractC0000a.m30P0();
                    throw null;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (f1576q.contains(Integer.valueOf(((Number) it3.next()).intValue())) && (i10 = i10 + 1) < 0) {
                    AbstractC0000a.m30P0();
                    throw null;
                }
            }
        }
        if (i9 > 9) {
            return "朋友圈最多选择 9 张图片";
        }
        if (i10 > 1) {
            return "朋友圈一次只能选择一个视频";
        }
        if (i9 <= 0 || i10 <= 0) {
            return null;
        }
        return "图片和视频不能同时转发到朋友圈";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Integer m1519i(Object obj) {
        int iIntValue;
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getType", new Object[0]);
        Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
        if (number != null) {
            iIntValue = number.intValue();
        } else {
            Object field = KavaReflector.readField(obj, "field_type");
            Number number2 = field instanceof Number ? (Number) field : null;
            if (number2 != null) {
                iIntValue = number2.intValue();
            } else {
                Object field2 = KavaReflector.readField(obj, "type");
                Number number3 = field2 instanceof Number ? (Number) field2 : null;
                Integer numValueOf = number3 != null ? Integer.valueOf(number3.intValue()) : null;
                if (numValueOf == null) {
                    return null;
                }
                iIntValue = numValueOf.intValue();
            }
        }
        if (iIntValue > 0) {
            int i9 = iIntValue & 255;
            int i10 = 65535 & iIntValue;
            if ((iIntValue >>> 16) != 0) {
                if (i10 == 10000 || i10 == 10002) {
                    iIntValue = i10;
                } else if (i9 != 0 && i10 == i9) {
                    iIntValue = i9;
                }
            }
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m1520m(Object obj) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "size", new Object[0]);
        Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
        int iIntValue = number != null ? number.intValue() : 0;
        for (int i9 = 0; i9 < iIntValue; i9++) {
            Object objInvokeMethod2 = KavaReflector.invokeMethod(obj, "getItem", Integer.valueOf(i9));
            MenuItem menuItem = objInvokeMethod2 instanceof MenuItem ? (MenuItem) objInvokeMethod2 : null;
            if (menuItem != null) {
                return menuItem.getGroupId();
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1521d(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        Set set = this.f1584f;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i c3744i = C3744i.f12154b;
            Method methodAccessible = KavaReflector.accessible(method);
            if (methodAccessible == null) {
                methodAccessible = method;
            }
            c3744i.m7763b(methodAccessible, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f1581c.invoke("转发菜单Hook安装失败: " + method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1522e(Activity activity, InterfaceC1231l interfaceC1231l, String str, boolean z9) {
        C0525l c0525l = new C0525l(activity, this, interfaceC1231l);
        C1689l c1689l = C1690m.f5615a;
        List listM4307a = C1690m.m4307a(z9);
        if (listM4307a != null) {
            c0525l.invoke(listM4307a);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.f1592n.execute(new RunnableC0474p(this, z9, atomicBoolean, atomicBoolean2, C5491y2.m9813X1(activity, new C0442h(atomicBoolean2, atomicBoolean, 2), str, "正在载入联系人..."), activity, c0525l, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1523f(final long j3, final Activity activity, final InterfaceC1231l interfaceC1231l, String str) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        final InterfaceC5059kv interfaceC5059kvM9813X1 = C5491y2.m9813X1(activity, new C0442h(atomicBoolean2, atomicBoolean, 3), str, "正在读取收藏...");
        this.f1592n.execute(new Runnable() { // from class: ca.t
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                final Object c3959f;
                C2105p c2105pMedia;
                C2097h c2097h;
                String strM5249v;
                String strM5224D;
                final long j4 = j3;
                try {
                    c2105pMedia = WeChatApis.media();
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c2105pMedia == null || (c2097h = c2105pMedia.f7040f) == null) {
                    throw new IllegalStateException("收藏接口不可用");
                }
                C2098i c2098iM5241i = c2097h.m5241i(c2097h.m5245r(j4));
                if (c2098iM5241i == null) {
                    throw new IllegalStateException("收藏内容不可用");
                }
                String str2 = c2098iM5241i.f7021c;
                int i9 = c2098iM5241i.f7020b;
                String str3 = null;
                if (i9 == 1) {
                    Object objM5245r = c2097h.m5245r(j4);
                    if (objM5245r == null || C2097h.m5230k(objM5245r) != 1) {
                        strM5224D = null;
                        if (strM5224D == null) {
                            strM5224D = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(strM5224D)) {
                            str2 = strM5224D;
                        }
                    } else {
                        strM5224D = C2097h.m5224D(C2097h.m5231l(objM5245r), "desc", "content", "title");
                        if (AbstractC3149m.m6721t0(strM5224D)) {
                            strM5224D = null;
                        }
                        if (strM5224D == null) {
                            C2098i c2098iM5241i2 = c2097h.m5241i(objM5245r);
                            if (c2098iM5241i2 != null) {
                                strM5224D = c2098iM5241i2.f7021c;
                                if (!AbstractC3149m.m6721t0(strM5224D)) {
                                }
                            }
                        }
                        if (strM5224D == null) {
                        }
                        if (AbstractC3149m.m6721t0(strM5224D)) {
                        }
                    }
                    final C0517e0 c0517e0 = this.f1662g;
                    Handler handler = c0517e0.f1582d;
                    final AtomicBoolean atomicBoolean3 = atomicBoolean;
                    final AtomicBoolean atomicBoolean4 = atomicBoolean2;
                    final InterfaceC5059kv interfaceC5059kv = interfaceC5059kvM9813X1;
                    final Activity activity2 = activity;
                    final InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
                    handler.post(new Runnable() { // from class: ca.w
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            View decorView;
                            final AtomicBoolean atomicBoolean5 = atomicBoolean3;
                            if (atomicBoolean5.get()) {
                                return;
                            }
                            atomicBoolean4.set(true);
                            interfaceC5059kv.close();
                            final Activity activity3 = activity2;
                            Window window = activity3.getWindow();
                            if (window == null || (decorView = window.getDecorView()) == null) {
                                return;
                            }
                            final Object obj = c3959f;
                            final InterfaceC1231l interfaceC1231l3 = interfaceC1231l2;
                            final C0517e0 c0517e02 = c0517e0;
                            final long j5 = j4;
                            decorView.postOnAnimation(new Runnable() { // from class: ca.y
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (atomicBoolean5.get()) {
                                        return;
                                    }
                                    Activity activity4 = activity3;
                                    if (activity4.isFinishing() || activity4.isDestroyed()) {
                                        return;
                                    }
                                    Object obj2 = obj;
                                    if (!(obj2 instanceof C3959f)) {
                                        interfaceC1231l3.invoke(obj2);
                                    }
                                    Throwable thM8182b = C3960g.m8182b(obj2);
                                    if (thM8182b != null) {
                                        C0517e0 c0517e03 = c0517e02;
                                        c0517e03.f1581c.invoke("读取收藏转发内容失败: localId=" + j5, thM8182b);
                                        String message = thM8182b.getMessage();
                                        if (message == null) {
                                            message = "收藏内容不可用";
                                        }
                                        c0517e03.m1532r(activity4, message);
                                    }
                                }
                            });
                        }
                    });
                }
                if ((i9 == 2 || i9 == 4) && (strM5249v = c2097h.m5249v(j4)) != null && new File(strM5249v).isFile()) {
                    str3 = strM5249v;
                }
                c3959f = new C0539z(i9, str2, str3);
                final C0517e0 c0517e02 = this.f1662g;
                Handler handler2 = c0517e02.f1582d;
                final AtomicBoolean atomicBoolean32 = atomicBoolean;
                final AtomicBoolean atomicBoolean42 = atomicBoolean2;
                final InterfaceC5059kv interfaceC5059kv2 = interfaceC5059kvM9813X1;
                final Activity activity22 = activity;
                final InterfaceC1231l interfaceC1231l22 = interfaceC1231l;
                handler2.post(new Runnable() { // from class: ca.w
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        View decorView;
                        final AtomicBoolean atomicBoolean5 = atomicBoolean32;
                        if (atomicBoolean5.get()) {
                            return;
                        }
                        atomicBoolean42.set(true);
                        interfaceC5059kv2.close();
                        final Activity activity3 = activity22;
                        Window window = activity3.getWindow();
                        if (window == null || (decorView = window.getDecorView()) == null) {
                            return;
                        }
                        final Object obj = c3959f;
                        final InterfaceC1231l interfaceC1231l3 = interfaceC1231l22;
                        final C0517e0 c0517e022 = c0517e02;
                        final long j5 = j4;
                        decorView.postOnAnimation(new Runnable() { // from class: ca.y
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (atomicBoolean5.get()) {
                                    return;
                                }
                                Activity activity4 = activity3;
                                if (activity4.isFinishing() || activity4.isDestroyed()) {
                                    return;
                                }
                                Object obj2 = obj;
                                if (!(obj2 instanceof C3959f)) {
                                    interfaceC1231l3.invoke(obj2);
                                }
                                Throwable thM8182b = C3960g.m8182b(obj2);
                                if (thM8182b != null) {
                                    C0517e0 c0517e03 = c0517e022;
                                    c0517e03.f1581c.invoke("读取收藏转发内容失败: localId=" + j5, thM8182b);
                                    String message = thM8182b.getMessage();
                                    if (message == null) {
                                        message = "收藏内容不可用";
                                    }
                                    c0517e03.m1532r(activity4, message);
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final long m1524g(Object obj) {
        Object next;
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = this.f1591m;
        Method method = (Method) concurrentHashMap.get(cls);
        if (method != null) {
            Object objInvoke = KavaReflector.invoke(method, obj, new Object[0]);
            Number number = objInvoke instanceof Number ? (Number) objInvoke : null;
            if (number != null) {
                return number.longValue();
            }
        }
        Iterator<T> it = KavaReflector.declaredMethods(obj.getClass()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Method method2 = (Method) next;
            Class<?>[] parameterTypes = method2.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && AbstractC4156d0.m8355W("getMsgId", "getMsgID", "getId").contains(method2.getName()) && (AbstractC1416l.m3825a(method2.getReturnType(), Long.TYPE) || AbstractC1416l.m3825a(method2.getReturnType(), Long.class))) {
                break;
            }
        }
        Method method3 = (Method) next;
        if (method3 != null) {
            concurrentHashMap.putIfAbsent(obj.getClass(), method3);
            Object objInvoke2 = KavaReflector.invoke(method3, obj, new Object[0]);
            Number number2 = objInvoke2 instanceof Number ? (Number) objInvoke2 : null;
            if (number2 != null) {
                return number2.longValue();
            }
        }
        String[] strArr = {"field_msgId", "msgId", "msgID"};
        for (int i9 = 0; i9 < 3; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            Number number3 = field instanceof Number ? (Number) field : null;
            if (number3 != null) {
                return number3.longValue();
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01be  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0513c0 m1525j(Activity activity, List list) {
        Object next;
        String absolutePath;
        Object next2;
        C0240b c0240b;
        if (list.isEmpty()) {
            return new C0513c0(null, "未找到选中的消息", 1);
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i9 = ((C1697t) it.next()).f5647b;
            if (i9 > 0) {
                int i10 = i9 & 255;
                int i11 = 65535 & i9;
                if ((i9 >>> 16) != 0) {
                    if (i11 == 10000 || i11 == 10002) {
                        i9 = i11;
                    } else if (i10 != 0 && i11 == i10) {
                        i9 = i10;
                    }
                }
            }
            arrayList.add(Integer.valueOf(i9));
        }
        String strM1518h = m1518h(arrayList);
        if (strM1518h != null) {
            return new C0513c0(null, strM1518h, 1);
        }
        String strM6412V = AbstractC3015m.m6412V(new C3011i(AbstractC3015m.m6413W(new C3011i(new C0795n(list, 6), true, new C0178b(10)), new C0178b(11)), true, new C0178b(12)), "\n\n", null, 62);
        List listM6418b0 = AbstractC3015m.m6418b0(AbstractC3015m.m6413W(new C3011i(new C0795n(list, 6), true, new C0178b(13)), new C0136d0(this, 5)));
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM6418b0));
        Iterator it2 = listM6418b0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C3350d) it2.next()).f10775a);
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            int i12 = ((C1697t) next).f5647b;
            if (i12 > 0) {
                int i13 = i12 & 255;
                int i14 = i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if ((i12 >>> 16) != 0) {
                    if (i14 == 10000 || i14 == 10002) {
                        i12 = i14;
                    } else if (i13 != 0 && i14 == i13) {
                        i12 = i13;
                    }
                }
            }
            if (f1576q.contains(Integer.valueOf(i12))) {
                break;
            }
        }
        C1697t c1697t = (C1697t) next;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (c1697t != null) {
            C2356t c2356t = c1697t.f5652g;
            String str2 = c2356t != null ? c2356t.f7746f : null;
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            List listM101y0 = AbstractC0000a.m101y0(str2, c1697t.f5650e);
            ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM101y0));
            Iterator it4 = listM101y0.iterator();
            while (it4.hasNext()) {
                AbstractC2091b.m5171r((String) it4.next(), arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList4.add(obj);
                }
            }
            List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4));
            Iterator it5 = listM8407P1.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
                if (AbstractC0921a.m2262y((String) next2)) {
                    break;
                }
            }
            String str3 = (String) next2;
            if (str3 != null) {
                absolutePath = new File(str3).getAbsolutePath();
                absolutePath.getClass();
            } else {
                C2105p c2105pMedia = WeChatApis.media();
                if (c2105pMedia == null || (c0240b = c2105pMedia.f7037c) == null) {
                    absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    Iterator it6 = listM8407P1.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            absolutePath = null;
                            break;
                        }
                        String strM970o = c0240b.m970o((String) it6.next());
                        strM970o.getClass();
                        if (AbstractC3149m.m6721t0(strM970o)) {
                            strM970o = null;
                        }
                        if (strM970o != null) {
                            absolutePath = strM970o;
                            break;
                        }
                    }
                    if (absolutePath == null) {
                    }
                }
            }
        } else {
            absolutePath = null;
        }
        if (absolutePath != null) {
            str = absolutePath;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                if (!AbstractC0921a.m2262y((String) it7.next())) {
                    return new C0513c0(null, "部分选中图片文件不存在", 1);
                }
            }
        }
        if (c1697t != null && AbstractC3149m.m6721t0(str)) {
            return new C0513c0(null, "选中视频文件不存在", 1);
        }
        if (!AbstractC3149m.m6721t0(str) && !AbstractC0921a.m2262y(str)) {
            return new C0513c0(null, "选中视频文件不存在", 1);
        }
        Intent className = new Intent().setClassName(activity.getPackageName(), "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        className.getClass();
        if (!AbstractC3149m.m6721t0(str)) {
            className.putExtra("Ksnsupload_type", 14);
            className.putExtra("KSightPath", str);
            className.putExtra("KSightThumbPath", str);
            className.putExtra("Kdescription", strM6412V);
        } else if (arrayList2.isEmpty()) {
            className.putExtra("Ksnsupload_type", 9);
            className.putExtra("Kdescription", strM6412V);
        } else {
            if (!m1527l(className, listM6418b0)) {
                if (!listM6418b0.isEmpty()) {
                    Iterator it8 = listM6418b0.iterator();
                    while (it8.hasNext()) {
                        if (((C3350d) it8.next()).m7066a()) {
                            return new C0513c0(null, "实况图片视频未能交给微信朋友圈编辑器", 1);
                        }
                    }
                }
                ArrayList<String> arrayList5 = new ArrayList<>();
                AbstractC4166m.m8405N1(arrayList2, arrayList5);
                className.putStringArrayListExtra("sns_kemdia_path_list", arrayList5);
            }
            className.putExtra("Kdescription", strM6412V);
        }
        return new C0513c0(className, null, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1526k(Activity activity, C3370v c3370v, String str, InterfaceC1231l interfaceC1231l) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        C0442h c0442h = new C0442h(atomicBoolean2, atomicBoolean, 1);
        int i9 = c3370v.f10881c;
        this.f1592n.execute(new RunnableC0523j(this, c3370v, atomicBoolean, atomicBoolean2, C5491y2.m9813X1(activity, c0442h, str, (i9 == 1 || i9 == 54 || i9 == 5 || i9 == 15) ? "正在准备朋友圈媒体..." : "正在读取朋友圈..."), activity, interfaceC1231l, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m1527l(Intent intent, List list) {
        Object c3959f;
        Class<?> clsLoadClass;
        Constructor<?> constructorFindConstructor;
        Object objNewInstance;
        ClassLoader classLoader = this.f1579a.f12145c;
        classLoader.getClass();
        boolean z9 = false;
        if (!list.isEmpty() && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C3350d) it.next()).m7066a()) {
                    try {
                        Class<?> clsLoadClass2 = KavaReflector.loadClass("com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem", classLoader);
                        if (clsLoadClass2 != null && (clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem", classLoader)) != null) {
                            Class cls = Long.TYPE;
                            cls.getClass();
                            Constructor<?> constructorFindConstructor2 = KavaReflector.findConstructor(clsLoadClass2, cls, String.class, String.class, String.class);
                            if (constructorFindConstructor2 != null && (constructorFindConstructor = KavaReflector.findConstructor(clsLoadClass, cls, String.class, String.class, String.class)) != null) {
                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C3350d c3350d = (C3350d) it2.next();
                                        boolean zM7066a = c3350d.m7066a();
                                        String str = c3350d.f10775a;
                                        if (zM7066a) {
                                            objNewInstance = KavaReflector.newInstance(constructorFindConstructor, 0L, c3350d.f10776b, str, "image/jpeg");
                                            if (objNewInstance == null) {
                                                objNewInstance = null;
                                            } else {
                                                if (!AbstractC0283h.m1168k0(objNewInstance, "videoDuration=", c3350d.f10777c)) {
                                                    throw new IllegalStateException("Check failed.");
                                                }
                                                AbstractC0283h.m1168k0(objNewInstance, "videoWidth=", c3350d.f10778d);
                                                AbstractC0283h.m1168k0(objNewInstance, "videoHeight=", c3350d.f10779e);
                                                long j3 = c3350d.f10780f;
                                                if (j3 > 2147483647L) {
                                                    j3 = 2147483647L;
                                                }
                                                AbstractC0283h.m1168k0(objNewInstance, "videoSize=", (int) j3);
                                                AbstractC0283h.m1170l0(objNewInstance);
                                                if (!AbstractC0283h.m1168k0(objNewInstance, "isParsedVideo=", 1)) {
                                                    throw new IllegalStateException("Check failed.");
                                                }
                                            }
                                        } else {
                                            objNewInstance = KavaReflector.newInstance(constructorFindConstructor2, 0L, str, str, "image/jpeg");
                                        }
                                        Parcelable parcelable = objNewInstance instanceof Parcelable ? (Parcelable) objNewInstance : null;
                                        if (parcelable == null) {
                                            break;
                                        }
                                        arrayList.add(parcelable);
                                    } else {
                                        ArrayList<String> arrayList2 = new ArrayList<>(list.size());
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            arrayList2.add(((C3350d) it3.next()).f10775a);
                                        }
                                        intent.putStringArrayListExtra("sns_kemdia_path_list", arrayList2);
                                        intent.putParcelableArrayListExtra("KMulti_Pic_Item_List", arrayList);
                                        intent.putExtra("KSnsPostManu", true);
                                        intent.putExtra("Ksnsupload_type", 0);
                                        z9 = true;
                                    }
                                }
                            }
                        }
                        c3959f = Boolean.valueOf(z9);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        this.f1581c.invoke("构造朋友圈实况编辑项失败", thM8182b);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (c3959f instanceof C3959f) {
                        c3959f = bool;
                    }
                    return ((Boolean) c3959f).booleanValue();
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m1528n(Activity activity, List list, List list2, int i9, String str) {
        String strM52a1 = AbstractC0000a.m52a1(i9, list);
        if (strM52a1 != null) {
            m1532r(activity, strM52a1);
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (listM8407P1.isEmpty()) {
            m1532r(activity, "请选择转发对象");
            return;
        }
        C1425u c1425u = new C1425u();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        activity.getClass();
        InterfaceC5059kv interfaceC5059kvM9813X1 = AbstractC4302b.m8640c(activity, "Hchat_selected_messages_config").getBoolean("selected_messages_background_silent_send", false) ? null : C5491y2.m9813X1(activity, new C0529p(atomicBoolean, c1425u, 0), str, "正在发送...");
        C1696s c1696sM11G = AbstractC0000a.m11G(i9, list, listM8407P1, 0, 0, new C0530q(this, atomicBoolean, interfaceC5059kvM9813X1, str, activity, 0));
        c1425u.f4738g = c1696sM11G;
        if (c1696sM11G == null) {
            atomicBoolean.set(true);
            if (interfaceC5059kvM9813X1 != null) {
                interfaceC5059kvM9813X1.close();
            }
            m1532r(activity, str.concat(" 启动失败"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m1529o(Activity activity, C1697t c1697t, List list, int i9, String str) {
        String strM4293j;
        List listM99x0 = AbstractC0000a.m99x0(c1697t);
        if (listM99x0.isEmpty()) {
            strM4293j = "请选择发送内容";
        } else {
            C1688k0 c1688k0 = AbstractC0000a.f0g;
            if (c1688k0 == null) {
                strM4293j = "群发助手尚未就绪";
            } else if (i9 != 1) {
                strM4293j = null;
            } else if (c1688k0.f5612c.m4300g()) {
                List listM4305o = c1688k0.f5612c.m4305o(listM99x0);
                if (listM4305o.isEmpty()) {
                    c1688k0.f5612c.getClass();
                    strM4293j = C1687k.m4293j(listM99x0);
                } else {
                    strM4293j = "微信原生群发助手不支持: ".concat(AbstractC4166m.m8392A1(listM4305o, "、", null, null, null, 62));
                }
            } else {
                strM4293j = "微信原生群发助手通道不可用";
            }
        }
        if (strM4293j != null) {
            m1532r(activity, strM4293j);
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (listM8407P1.isEmpty()) {
            m1532r(activity, "请选择转发对象");
            return;
        }
        C1425u c1425u = new C1425u();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC5059kv interfaceC5059kvM9813X1 = AbstractC4302b.m8640c(activity, "Hchat_selected_messages_config").getBoolean("selected_messages_background_silent_send", false) ? null : C5491y2.m9813X1(activity, new C0529p(atomicBoolean, c1425u, 1), str, "正在发送...");
        C1696s c1696sM13H = AbstractC0000a.m13H(i9, listM99x0, listM8407P1, new C0530q(this, atomicBoolean, interfaceC5059kvM9813X1, str, activity, 1));
        c1425u.f4738g = c1696sM13H;
        if (c1696sM13H == null) {
            atomicBoolean.set(true);
            if (interfaceC5059kvM9813X1 != null) {
                interfaceC5059kvM9813X1.close();
            }
            m1532r(activity, str.concat(" 启动失败"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1530p(Activity activity, InterfaceC1231l interfaceC1231l, String str, String str2, boolean z9) {
        m1522e(activity, new C0490u(activity, interfaceC1231l, str, str2, z9), str, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1531q(Activity activity, Intent intent) {
        Object c3959f;
        try {
            activity.startActivity(intent);
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f1581c.invoke("打开朋友圈编辑界面失败", thM8182b);
            m1532r(activity, "朋友圈编辑界面不可用");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1532r(Activity activity, String str) {
        if (activity == null) {
            activity = m1516b();
            if (activity == null) {
                return;
            }
        } else {
            if (activity.isFinishing()) {
                activity = null;
            }
            if (activity == null) {
            }
        }
        this.f1582d.post(new RunnableC0487t(activity, str, 2));
    }
}
