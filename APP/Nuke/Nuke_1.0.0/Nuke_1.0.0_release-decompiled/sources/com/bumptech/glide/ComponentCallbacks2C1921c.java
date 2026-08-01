package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.C0066i0;
import p002A1.C0115D;
import p088R1.C1191A;
import p088R1.C1213n;
import p088R1.C1214o;
import p093S1.C1294f;
import p093S1.C1295g;
import p093S1.InterfaceC1289a;
import p097T1.C1417f;
import p097T1.C1418g;
import p097T1.C1419h;
import p102U1.ExecutorServiceC1475e;
import p102U1.ThreadFactoryC1472b;
import p102U1.ThreadFactoryC1473c;
import p110W0.C1577b;
import p121Y1.C1753n;
import p121Y1.C1765z;
import p128a.AbstractC1785a;
import p135b.C1836x;
import p154e2.C2025d;
import p154e2.C2029h;
import p186k.C2423e;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: com.bumptech.glide.c */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1921c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: k */
    public static volatile ComponentCallbacks2C1921c f6512k;

    /* JADX INFO: renamed from: l */
    public static volatile boolean f6513l;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1289a f6514d;

    /* JADX INFO: renamed from: e */
    public final C1417f f6515e;

    /* JADX INFO: renamed from: f */
    public final C1927i f6516f;

    /* JADX INFO: renamed from: g */
    public final C1294f f6517g;

    /* JADX INFO: renamed from: h */
    public final C2025d f6518h;

    /* JADX INFO: renamed from: i */
    public final C1577b f6519i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f6520j = new ArrayList();

    public ComponentCallbacks2C1921c(Context context, C1214o c1214o, C1417f c1417f, InterfaceC1289a interfaceC1289a, C1294f c1294f, C2025d c2025d, C1577b c1577b, C1577b c1577b2, C2423e c2423e, List list, ArrayList arrayList, AbstractC1785a abstractC1785a, C1753n c1753n) {
        new C1213n(new C1836x(1, this));
        this.f6514d = interfaceC1289a;
        this.f6517g = c1294f;
        this.f6515e = c1417f;
        this.f6518h = c2025d;
        this.f6519i = c1577b;
        if (((Map) c1753n.f6028e).get(AbstractC1924f.class) != null) {
            throw new ClassCastException();
        }
        this.f6516f = new C1927i(context, c1294f, new C2029h(this, arrayList, abstractC1785a), new C1577b(28), c1577b2, c2423e, list, c1214o, c1753n);
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C1921c m3413a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f6512k == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            }
            synchronized (ComponentCallbacks2C1921c.class) {
                if (f6512k == null) {
                    if (f6513l) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f6513l = true;
                    try {
                        m3414b(context, generatedAppGlideModule);
                        f6513l = false;
                    } catch (Throwable th) {
                        f6513l = false;
                        throw th;
                    }
                }
            }
        }
        return f6512k;
    }

    /* JADX INFO: renamed from: b */
    public static void m3414b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C2423e c2423e = new C2423e(0);
        C1191A c1191a = new C1191A(2);
        C1577b c1577b = new C1577b(15);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC1922d.m3441y(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e5) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e5);
            }
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
        ThreadFactoryC1472b threadFactoryC1472b = new ThreadFactoryC1472b();
        if (ExecutorServiceC1475e.f5161f == 0) {
            ExecutorServiceC1475e.f5161f = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i5 = ExecutorServiceC1475e.f5161f;
        if (TextUtils.isEmpty("source")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        ThreadFactoryC1473c threadFactoryC1473c = new ThreadFactoryC1473c(threadFactoryC1472b, "source", false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC1475e executorServiceC1475e = new ExecutorServiceC1475e(new ThreadPoolExecutor(i5, i5, 0L, timeUnit, new PriorityBlockingQueue(), threadFactoryC1473c));
        ThreadFactoryC1472b threadFactoryC1472b2 = new ThreadFactoryC1472b();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC1475e executorServiceC1475e2 = new ExecutorServiceC1475e(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1473c(threadFactoryC1472b2, "disk-cache", true)));
        if (ExecutorServiceC1475e.f5161f == 0) {
            ExecutorServiceC1475e.f5161f = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i6 = ExecutorServiceC1475e.f5161f >= 4 ? 2 : 1;
        ThreadFactoryC1472b threadFactoryC1472b3 = new ThreadFactoryC1472b();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC1475e executorServiceC1475e3 = new ExecutorServiceC1475e(new ThreadPoolExecutor(i6, i6, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1473c(threadFactoryC1472b3, "animation", true)));
        C1419h c1419h = new C1419h(new C1418g(applicationContext));
        C1577b c1577b2 = new C1577b(18);
        int i7 = c1419h.f5073a;
        InterfaceC1289a c1295g = i7 > 0 ? new C1295g(i7) : new C0115D(22);
        C1294f c1294f = new C1294f(c1419h.f5075c);
        C1417f c1417f = new C1417f(c1419h.f5074b);
        C1214o c1214o = new C1214o(c1417f, new C0066i0(applicationContext), executorServiceC1475e2, executorServiceC1475e, new ExecutorServiceC1475e(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC1475e.f5160e, timeUnit, new SynchronousQueue(), new ThreadFactoryC1473c(new ThreadFactoryC1472b(), "source-unlimited", false))), executorServiceC1475e3);
        List list2 = Collections.EMPTY_LIST;
        C1753n c1753n = new C1753n(c1191a);
        C2025d c2025d = new C2025d();
        new HashMap();
        if (C1765z.f6058f && C1765z.f6057e) {
            Collections.newSetFromMap(new WeakHashMap());
        }
        ComponentCallbacks2C1921c componentCallbacks2C1921c = new ComponentCallbacks2C1921c(applicationContext, c1214o, c1417f, c1295g, c1294f, c2025d, c1577b2, c1577b, c2423e, list2, arrayList, generatedAppGlideModule, c1753n);
        applicationContext.registerComponentCallbacks(componentCallbacks2C1921c);
        f6512k = componentCallbacks2C1921c;
    }

    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C1947p m3415c(Context context) {
        AbstractC2503g.m4445c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m3413a(context).f6518h.m3722a(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC2511o.m4452a();
        this.f6515e.m4449e(0L);
        this.f6514d.mo158j();
        C1294f c1294f = this.f6517g;
        synchronized (c1294f) {
            c1294f.m2383b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        long j5;
        AbstractC2511o.m4452a();
        synchronized (this.f6520j) {
            try {
                Iterator it = this.f6520j.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C1947p) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1417f c1417f = this.f6515e;
        c1417f.getClass();
        if (i5 >= 40) {
            c1417f.m4449e(0L);
        } else if (i5 >= 20 || i5 == 15) {
            synchronized (c1417f) {
                j5 = c1417f.f8022b;
            }
            c1417f.m4449e(j5 / 2);
        }
        this.f6514d.mo157i(i5);
        C1294f c1294f = this.f6517g;
        synchronized (c1294f) {
            if (i5 >= 40) {
                synchronized (c1294f) {
                    c1294f.m2383b(0);
                }
            } else if (i5 >= 20 || i5 == 15) {
                c1294f.m2383b(c1294f.f4635e / 2);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
