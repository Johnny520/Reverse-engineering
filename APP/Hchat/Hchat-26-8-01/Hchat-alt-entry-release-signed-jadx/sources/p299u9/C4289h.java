package p299u9;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ch.C0570e;
import gg.AbstractC1416l;
import gg.C1414j;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p036c9.C0434f;
import p062e8.C0828b;
import p071f1.ViewOnAttachStateChangeListenerC0999e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p258r8.C3744i;
import p259r9.C3766p;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: u9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4289h {

    /* JADX INFO: renamed from: a */
    public final Context f14217a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f14218b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1220a f14219c;

    /* JADX INFO: renamed from: d */
    public final C1414j f14220d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f14221e;

    /* JADX INFO: renamed from: f */
    public final SharedPreferences f14222f;

    /* JADX INFO: renamed from: g */
    public final Map f14223g;

    /* JADX INFO: renamed from: h */
    public final Map f14224h;

    /* JADX INFO: renamed from: i */
    public final Map f14225i;

    /* JADX INFO: renamed from: j */
    public final Map f14226j;

    /* JADX INFO: renamed from: k */
    public final C3962i f14227k;

    /* JADX INFO: renamed from: l */
    public final C3962i f14228l;

    /* JADX INFO: renamed from: m */
    public final C3962i f14229m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f14230n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f14231o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: fg.p */
    /* JADX WARN: Multi-variable type inference failed */
    public C4289h(Context context, ClassLoader classLoader, C0434f c0434f, InterfaceC1235p interfaceC1235p) {
        classLoader.getClass();
        this.f14217a = context;
        this.f14218b = classLoader;
        this.f14219c = c0434f;
        this.f14220d = (C1414j) interfaceC1235p;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_hide_wechat_bottom_bar_config");
        this.f14221e = sharedPreferencesM8640c;
        this.f14222f = AbstractC4302b.m8640c(context, "Hchat_hide_wechat_bottom_bar_method_cache");
        this.f14223g = AbstractC3199a.m6843p();
        this.f14224h = AbstractC3199a.m6843p();
        this.f14225i = AbstractC3199a.m6843p();
        this.f14226j = AbstractC3199a.m6843p();
        final int i9 = 0;
        this.f14227k = new C3962i(new InterfaceC1220a(this) { // from class: u9.d

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C4289h f14208h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f14208h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return KavaReflector.loadClass("com.tencent.mm.ui.FrostedContentView", this.f14208h.f14218b);
                    case 1:
                        return KavaReflector.findMethod((Class) this.f14208h.f14227k.getValue(), "getBottomBlurAreaHeight", new Class[0]);
                    default:
                        Class cls = (Class) this.f14208h.f14227k.getValue();
                        Class cls2 = Integer.TYPE;
                        cls2.getClass();
                        return KavaReflector.findMethod(cls, "setBottomBlurAreaHeight", cls2);
                }
            }
        });
        final int i10 = 1;
        this.f14228l = new C3962i(new InterfaceC1220a(this) { // from class: u9.d

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C4289h f14208h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f14208h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return KavaReflector.loadClass("com.tencent.mm.ui.FrostedContentView", this.f14208h.f14218b);
                    case 1:
                        return KavaReflector.findMethod((Class) this.f14208h.f14227k.getValue(), "getBottomBlurAreaHeight", new Class[0]);
                    default:
                        Class cls = (Class) this.f14208h.f14227k.getValue();
                        Class cls2 = Integer.TYPE;
                        cls2.getClass();
                        return KavaReflector.findMethod(cls, "setBottomBlurAreaHeight", cls2);
                }
            }
        });
        final int i11 = 2;
        this.f14229m = new C3962i(new InterfaceC1220a(this) { // from class: u9.d

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C4289h f14208h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f14208h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return KavaReflector.loadClass("com.tencent.mm.ui.FrostedContentView", this.f14208h.f14218b);
                    case 1:
                        return KavaReflector.findMethod((Class) this.f14208h.f14227k.getValue(), "getBottomBlurAreaHeight", new Class[0]);
                    default:
                        Class cls = (Class) this.f14208h.f14227k.getValue();
                        Class cls2 = Integer.TYPE;
                        cls2.getClass();
                        return KavaReflector.findMethod(cls, "setBottomBlurAreaHeight", cls2);
                }
            }
        });
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static View m8606d(View view) {
        if (view.getClass().getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView")) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.getClass();
            View viewM8606d = m8606d(childAt);
            if (viewM8606d != null) {
                return viewM8606d;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m8607i(Method method) {
        if (!method.getDeclaringClass().getName().equals("com.tencent.mm.ui.MainTabUI") || !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return (parameterTypes.length != 0 || Modifier.isStatic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: android.view.ViewTreeObserver */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewTreeObserver$OnPreDrawListener, u9.e] */
    /* JADX INFO: renamed from: a */
    public final void m8608a(final View view, boolean z9) {
        Integer num;
        int iIntValue;
        Map map = this.f14223g;
        map.getClass();
        synchronized (map) {
            Map map2 = this.f14223g;
            map2.getClass();
            map2.put(view, C3967n.f12976a);
        }
        if (!z9) {
            Map map3 = this.f14224h;
            map3.getClass();
            synchronized (map3) {
                num = (Integer) this.f14224h.remove(view);
            }
            if (num != null && view.getVisibility() != (iIntValue = num.intValue())) {
                view.setVisibility(iIntValue);
            }
            View rootView = view.getRootView();
            rootView.getClass();
            m8616k(rootView);
            m8615j(view);
            return;
        }
        Map map4 = this.f14225i;
        map4.getClass();
        synchronized (map4) {
            if (!this.f14225i.containsKey(view)) {
                View rootView2 = view.getRootView();
                ViewTreeObserver viewTreeObserver = rootView2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    ?? r12 = new ViewTreeObserver.OnPreDrawListener() { // from class: u9.e
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            C4289h c4289h = this.f14209g;
                            if (!c4289h.f14221e.getBoolean("hide_wechat_bottom_bar_enable", false)) {
                                return true;
                            }
                            View view2 = view;
                            c4289h.m8611e(view2);
                            View rootView3 = view2.getRootView();
                            rootView3.getClass();
                            c4289h.m8609b(rootView3);
                            return true;
                        }
                    };
                    ViewOnAttachStateChangeListenerC0999e viewOnAttachStateChangeListenerC0999e = new ViewOnAttachStateChangeListenerC0999e(this, 1);
                    C4282a c4282a = new C4282a(rootView2, r12, viewOnAttachStateChangeListenerC0999e);
                    Map map5 = this.f14225i;
                    map5.getClass();
                    synchronized (map5) {
                        if (!this.f14225i.containsKey(view)) {
                            Map map6 = this.f14225i;
                            map6.getClass();
                            map6.put(view, c4282a);
                            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0999e);
                            viewTreeObserver.addOnPreDrawListener(r12);
                        }
                    }
                }
            }
        }
        m8611e(view);
        View rootView3 = view.getRootView();
        rootView3.getClass();
        m8609b(rootView3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8609b(View view) {
        ArrayList<View> arrayList = new ArrayList();
        m8610c(view, arrayList);
        for (View view2 : arrayList) {
            Object objInvoke = KavaReflector.invoke((Method) this.f14228l.getValue(), view2, new Object[0]);
            Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
            if (num != null) {
                int iIntValue = num.intValue();
                Map map = this.f14226j;
                map.getClass();
                synchronized (map) {
                    if (!this.f14226j.containsKey(view2)) {
                        Map map2 = this.f14226j;
                        map2.getClass();
                        map2.put(view2, num);
                    }
                }
                if (iIntValue != 0 && KavaReflector.invokeSuccessfully((Method) this.f14229m.getValue(), view2, 0)) {
                    view2.invalidate();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m8610c(View view, ArrayList arrayList) {
        Class cls = (Class) this.f14227k.getValue();
        if (cls != null) {
            if (cls.isInstance(view)) {
                arrayList.add(view);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = viewGroup.getChildAt(i9);
                    childAt.getClass();
                    m8610c(childAt, arrayList);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8611e(View view) {
        Map map = this.f14224h;
        map.getClass();
        synchronized (map) {
            if (!this.f14224h.containsKey(view)) {
                Map map2 = this.f14224h;
                map2.getClass();
                map2.put(view, Integer.valueOf(view.getVisibility()));
            }
        }
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized boolean m8612f(boolean z9) {
        return m8613g() && m8614h(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x001c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [fg.p, gg.j] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8613g() {
        Object c3959f;
        boolean z9;
        if (this.f14231o) {
            return true;
        }
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.LauncherUI", this.f14218b);
        if (clsLoadClass != null) {
            Iterator<T> it = KavaReflector.declaredMethods(clsLoadClass).iterator();
            Object obj = null;
            boolean z10 = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    Method method = (Method) next;
                    if (AbstractC1416l.m3825a(method.getName(), "onResume") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            z9 = true;
                        }
                        if (z9) {
                        }
                    } else {
                        z9 = false;
                        if (z9) {
                            if (z10) {
                                break;
                            }
                            z10 = true;
                            obj2 = next;
                        }
                    }
                } else if (z10) {
                    obj = obj2;
                }
            }
            Method method2 = (Method) obj;
            if (method2 != null) {
                try {
                    C3744i.f12154b.m7763b(method2, new C4288g(this, 0));
                    this.f14231o = true;
                    c3959f = Boolean.TRUE;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    this.f14220d.invoke("微信底栏恢复入口 Hook 安装失败", thM8182b);
                    c3959f = Boolean.FALSE;
                }
                return ((Boolean) c3959f).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:132:0x0147 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Type inference failed for: r0v39, types: [fg.p, gg.j] */
    /* JADX WARN: Type inference failed for: r10v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [fg.p, gg.j] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8614h(boolean z9) {
        Class<?> clsLoadClass;
        boolean z10;
        Method method;
        InterfaceC1220a interfaceC1220a;
        DexKitBridge dexKitBridge;
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        if (this.f14230n) {
            return true;
        }
        ?? r32 = this.f14220d;
        SharedPreferences sharedPreferences = this.f14222f;
        Context context = this.f14217a;
        ClassLoader classLoader = this.f14218b;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Method method2 = null;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|hide_wechat_bottom_bar_v1_main_tab") : null;
        String str2 = strConcat == null ? HttpUrl.FRAGMENT_ENCODE_SET : strConcat;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, str2, classLoader, "main_tab_create_method");
        if (methodM2087c == null) {
            clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.MainTabUI", classLoader);
            if (clsLoadClass == null) {
                Iterator<T> it = KavaReflector.declaredMethods(clsLoadClass).iterator();
                Object obj = null;
                boolean z11 = false;
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        if (!z11) {
                            break;
                        }
                    } else {
                        Object next = it.next();
                        Method method3 = (Method) next;
                        z10 = false;
                        if (AbstractC1416l.m3825a(method3.getName(), "d") && m8607i(method3)) {
                            if (z11) {
                                break;
                            }
                            z11 = true;
                            obj = next;
                        }
                    }
                }
                obj = null;
                method = (Method) obj;
            } else {
                z10 = false;
                method = null;
            }
            if (method == null) {
                C0828b.m2092h(sharedPreferences, str2, "main_tab_create_method", method);
                method2 = method;
            } else if (z9 && (interfaceC1220a = this.f14219c) != null && (dexKitBridge = (DexKitBridge) interfaceC1220a.invoke()) != null) {
                try {
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    c1253k.m3374r0("MicroMsg.LauncherUI.MainTabUI", "doOnCreate");
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
                        Method method4 = (Method) c3959f2;
                        if (method4 != null) {
                            arrayList.add(method4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (m8607i((Method) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    c3959f = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (hashSet.add(((Method) obj3).toGenericString())) {
                            c3959f.add(obj3);
                        }
                    }
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                Object obj4 = c3959f;
                if (thM8182b != null) {
                    r32.invoke("定位微信底栏创建入口失败", thM8182b);
                    obj4 = C4173t.f13710g;
                }
                List list = (List) obj4;
                Method method5 = (Method) AbstractC4166m.m8400I1(list);
                if (method5 != null) {
                    C0828b.m2092h(sharedPreferences, str2, "main_tab_create_method", method5);
                } else {
                    try {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str2)) {
                            editorEdit.clear().putString("cache.key", str2);
                        }
                        editorEdit.remove("main_tab_create_method").apply();
                    } catch (Throwable unused) {
                    }
                    if (list.size() > 1) {
                        r32.invoke("微信底栏创建入口定位结果不唯一: ".concat(AbstractC4166m.m8392A1(list, null, null, null, new C3766p(9), 31)), null);
                    }
                }
                method2 = method5;
            }
        } else if (m8607i(methodM2087c)) {
            method2 = methodM2087c;
            z10 = false;
        } else {
            C0828b.m2085a(sharedPreferences, str2, "main_tab_create_method");
            clsLoadClass = KavaReflector.loadClass("com.tencent.mm.ui.MainTabUI", classLoader);
            if (clsLoadClass == null) {
            }
            if (method == null) {
            }
        }
        if (method2 == null) {
            return z10;
        }
        try {
            C3744i.f12154b.m7763b(method2, new C4288g(this, 1));
            this.f14230n = true;
            c3959f3 = Boolean.TRUE;
        } catch (Throwable th4) {
            c3959f3 = new C3959f(th4);
        }
        Throwable thM8182b2 = C3960g.m8182b(c3959f3);
        if (thM8182b2 != null) {
            this.f14220d.invoke("微信底栏创建入口 Hook 安装失败: " + method2.toGenericString(), thM8182b2);
            c3959f3 = Boolean.FALSE;
        }
        return ((Boolean) c3959f3).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m8615j(View view) {
        C4282a c4282a;
        Map map = this.f14225i;
        map.getClass();
        synchronized (map) {
            c4282a = (C4282a) this.f14225i.remove(view);
        }
        if (c4282a != null) {
            view.removeOnAttachStateChangeListener(c4282a.f14203c);
            ViewTreeObserver viewTreeObserver = c4282a.f14201a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(c4282a.f14202b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m8616k(View view) {
        ArrayList<C3958e> arrayList;
        Map map = this.f14226j;
        map.getClass();
        synchronized (map) {
            try {
                Set setEntrySet = this.f14226j.entrySet();
                ArrayList<Map.Entry> arrayList2 = new ArrayList();
                for (Object obj : setEntrySet) {
                    if (((View) ((Map.Entry) obj).getKey()).getRootView() == view) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
                for (Map.Entry entry : arrayList2) {
                    arrayList.add(new C3958e(entry.getKey(), entry.getValue()));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f14226j.remove(((C3958e) it.next()).f12961g);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (C3958e c3958e : arrayList) {
            View view2 = (View) c3958e.f12961g;
            Integer num = (Integer) c3958e.f12962h;
            view2.getClass();
            num.getClass();
            if (KavaReflector.invokeSuccessfully((Method) this.f14229m.getValue(), view2, num)) {
                view2.invalidate();
            }
        }
    }
}
