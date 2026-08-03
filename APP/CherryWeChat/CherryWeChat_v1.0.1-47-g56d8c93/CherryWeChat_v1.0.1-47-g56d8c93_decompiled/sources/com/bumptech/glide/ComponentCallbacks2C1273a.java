package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractActivityC2148ki;
import p000.AbstractC0148Dc;
import p000.AbstractC0671Pj;
import p000.AbstractC0714Qj;
import p000.AbstractC2622vD;
import p000.AbstractC2805zi;
import p000.AbstractComponentCallbacksC1503hi;
import p000.C0032Ap;
import p000.C0132D2;
import p000.C0204Ep;
import p000.C0521M4;
import p000.C0668Pg;
import p000.C0756Rj;
import p000.C1264cg;
import p000.C1456gf;
import p000.C1468gr;
import p000.C1512hr;
import p000.C2104ji;
import p000.C2166kw;
import p000.C2220m6;
import p000.C2692wy;
import p000.C2756yc;
import p000.C2812zp;
import p000.ComponentCallbacks2C1473gw;
import p000.ExecutorServiceC0971Wj;
import p000.InterfaceC0565N5;
import p000.ThreadFactoryC0474L0;
import p000.ThreadFactoryC0928Vj;

/* JADX INFO: renamed from: com.bumptech.glide.a */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1273a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: h */
    public static volatile ComponentCallbacks2C1273a f4335h;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f4336i;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0565N5 f4337a;

    /* JADX INFO: renamed from: b */
    public final C0204Ep f4338b;

    /* JADX INFO: renamed from: c */
    public final C0756Rj f4339c;

    /* JADX INFO: renamed from: d */
    public final C2812zp f4340d;

    /* JADX INFO: renamed from: e */
    public final C2166kw f4341e;

    /* JADX INFO: renamed from: f */
    public final C2220m6 f4342f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4343g = new ArrayList();

    public ComponentCallbacks2C1273a(Context context, C1264cg c1264cg, C0204Ep c0204Ep, InterfaceC0565N5 interfaceC0565N5, C2812zp c2812zp, C2166kw c2166kw, C2220m6 c2220m6, C0668Pg c0668Pg, C0521M4 c0521m4, List list, ArrayList arrayList, AbstractC0148Dc abstractC0148Dc, C0132D2 c0132d2) {
        this.f4337a = interfaceC0565N5;
        this.f4340d = c2812zp;
        this.f4338b = c0204Ep;
        this.f4341e = c2166kw;
        this.f4342f = c2220m6;
        this.f4339c = new C0756Rj(context, c2812zp, new C2692wy(this, arrayList, abstractC0148Dc), new C0668Pg(14), c0668Pg, c0521m4, list, c1264cg, c0132d2);
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C1273a m2412a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f4335h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (ComponentCallbacks2C1273a.class) {
                if (f4335h == null) {
                    if (f4336i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f4336i = true;
                    try {
                        m2413b(context, generatedAppGlideModule);
                        f4336i = false;
                    } catch (Throwable th) {
                        f4336i = false;
                        throw th;
                    }
                }
            }
        }
        return f4335h;
    }

    /* JADX INFO: renamed from: b */
    public static void m2413b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C0521M4 c0521m4 = new C0521M4(0);
        C2756yc c2756yc = new C2756yc(1);
        C0668Pg c0668Pg = new C0668Pg(12);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC0671Pj.m1356u(str);
                        throw null;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        ThreadFactoryC0474L0 threadFactoryC0474L0 = new ThreadFactoryC0474L0(1);
        if (ExecutorServiceC0971Wj.f3026c == 0) {
            ExecutorServiceC0971Wj.f3026c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC0971Wj.f3026c;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC0971Wj executorServiceC0971Wj = new ExecutorServiceC0971Wj(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0928Vj(threadFactoryC0474L0, "source", false)));
        ThreadFactoryC0474L0 threadFactoryC0474L02 = new ThreadFactoryC0474L0(1);
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC0971Wj executorServiceC0971Wj2 = new ExecutorServiceC0971Wj(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0928Vj(threadFactoryC0474L02, "disk-cache", true)));
        if (ExecutorServiceC0971Wj.f3026c == 0) {
            ExecutorServiceC0971Wj.f3026c = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC0971Wj.f3026c >= 4 ? 2 : 1;
        ThreadFactoryC0474L0 threadFactoryC0474L03 = new ThreadFactoryC0474L0(1);
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC0971Wj executorServiceC0971Wj3 = new ExecutorServiceC0971Wj(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC0928Vj(threadFactoryC0474L03, "animation", true)));
        C1468gr c1468gr = new C1468gr(applicationContext);
        C1512hr c1512hr = new C1512hr();
        Context context2 = c1468gr.f5203a;
        float f = c1468gr.f5206d;
        ActivityManager activityManager = c1468gr.f5204b;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c1512hr.f5356c = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c1468gr.f5205c.f3226b;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i4 = iRound - i3;
        if (iRound3 + iRound2 <= i4) {
            c1512hr.f5355b = iRound3;
            c1512hr.f5354a = iRound2;
        } else {
            float f3 = i4 / (f + 2.0f);
            c1512hr.f5355b = Math.round(2.0f * f3);
            c1512hr.f5354a = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context2, c1512hr.f5355b);
            Formatter.formatFileSize(context2, c1512hr.f5354a);
            Formatter.formatFileSize(context2, i3);
            Formatter.formatFileSize(context2, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
        C2220m6 c2220m6 = new C2220m6(10);
        int i5 = c1512hr.f5354a;
        InterfaceC0565N5 c0032Ap = i5 > 0 ? new C0032Ap(i5) : new C1456gf(24);
        C2812zp c2812zp = new C2812zp(c1512hr.f5356c);
        C0204Ep c0204Ep = new C0204Ep(c1512hr.f5355b);
        ComponentCallbacks2C1273a componentCallbacks2C1273a = new ComponentCallbacks2C1273a(applicationContext, new C1264cg(c0204Ep, new C0132D2(applicationContext), executorServiceC0971Wj2, executorServiceC0971Wj, new ExecutorServiceC0971Wj(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC0971Wj.f3025b, timeUnit, new SynchronousQueue(), new ThreadFactoryC0928Vj(new ThreadFactoryC0474L0(1), "source-unlimited", false))), executorServiceC0971Wj3), c0204Ep, c0032Ap, c2812zp, new C2166kw(), c2220m6, c0668Pg, c0521m4, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C0132D2(c2756yc));
        applicationContext.registerComponentCallbacks(componentCallbacks2C1273a);
        f4335h = componentCallbacks2C1273a;
    }

    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C1473gw m2414c(Context context) {
        AbstractC0714Qj.m1488j("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", context);
        return m2412a(context).f4341e.m4367d(context);
    }

    /* JADX INFO: renamed from: d */
    public static ComponentCallbacks2C1473gw m2415d(View view) {
        View view2;
        Context context = view.getContext();
        AbstractC0714Qj.m1488j("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", context);
        C2166kw c2166kw = m2412a(context).f4341e;
        c2166kw.getClass();
        char[] cArr = AbstractC2622vD.f9104a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c2166kw.m4367d(view.getContext().getApplicationContext());
        }
        AbstractC0714Qj.m1488j("Unable to obtain a request manager for a view without a Context", view.getContext());
        Activity activityM4364a = C2166kw.m4364a(view.getContext());
        if (activityM4364a != null && (activityM4364a instanceof AbstractActivityC2148ki)) {
            AbstractActivityC2148ki abstractActivityC2148ki = (AbstractActivityC2148ki) activityM4364a;
            C0521M4 c0521m4 = c2166kw.f7548b;
            c0521m4.clear();
            C2166kw.m4365b(abstractActivityC2148ki.getSupportFragmentManager().f9494c.m4882t(), c0521m4);
            View viewFindViewById = abstractActivityC2148ki.findViewById(R.id.content);
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = null;
            while (!view.equals(viewFindViewById) && (abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) c0521m4.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c0521m4.clear();
            if (abstractComponentCallbacksC1503hi == null) {
                return c2166kw.m4366c(abstractActivityC2148ki);
            }
            AbstractC0714Qj.m1488j("You cannot start a load on a fragment before it is attached or after it is destroyed", abstractComponentCallbacksC1503hi.m2870d());
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                return c2166kw.m4367d(abstractComponentCallbacksC1503hi.m2870d().getApplicationContext());
            }
            C2104ji c2104ji = abstractComponentCallbacksC1503hi.f5328s;
            if ((c2104ji == null ? null : c2104ji.f7400l) != null) {
                c2166kw.f7549c.mo1221a(c2104ji != null ? c2104ji.f7400l : null);
            }
            AbstractC2805zi abstractC2805ziM2869c = abstractComponentCallbacksC1503hi.m2869c();
            Context contextM2870d = abstractComponentCallbacksC1503hi.m2870d();
            return c2166kw.f7550d.m1275E(contextM2870d, m2412a(contextM2870d.getApplicationContext()), abstractComponentCallbacksC1503hi.f5304M, abstractC2805ziM2869c, (!abstractComponentCallbacksC1503hi.m2875i() || abstractComponentCallbacksC1503hi.m2876j() || (view2 = abstractComponentCallbacksC1503hi.f5296E) == null || view2.getWindowToken() == null || abstractComponentCallbacksC1503hi.f5296E.getVisibility() != 0) ? false : true);
        }
        return c2166kw.m4367d(view.getContext().getApplicationContext());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC2622vD.m5130a();
        this.f4338b.m190e(0L);
        this.f4337a.mo55m();
        C2812zp c2812zp = this.f4340d;
        synchronized (c2812zp) {
            c2812zp.m5440b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC2622vD.m5130a();
        synchronized (this.f4343g) {
            try {
                Iterator it = this.f4343g.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C1473gw) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0204Ep c0204Ep = this.f4338b;
        c0204Ep.getClass();
        if (i >= 40) {
            c0204Ep.m190e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c0204Ep) {
                j = c0204Ep.f287a;
            }
            c0204Ep.m190e(j / 2);
        }
        this.f4337a.mo54k(i);
        C2812zp c2812zp = this.f4340d;
        synchronized (c2812zp) {
            if (i >= 40) {
                synchronized (c2812zp) {
                    c2812zp.m5440b(0);
                }
            } else if (i >= 20 || i == 15) {
                c2812zp.m5440b(c2812zp.f9530e / 2);
            }
        }
    }
}
