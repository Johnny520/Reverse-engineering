package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yyds.AbstractC0024;
import yyds.AbstractC0181;
import yyds.AbstractC0319;
import yyds.AbstractC0578;
import yyds.AbstractC1960;
import yyds.C0052;
import yyds.C0135;
import yyds.C0188;
import yyds.C0469;
import yyds.C0596;
import yyds.C0747;
import yyds.C0805;
import yyds.C1227;
import yyds.C1282;
import yyds.C1424;
import yyds.C1436;
import yyds.C1505;
import yyds.C2014;
import yyds.C2267;
import yyds.C2572;
import yyds.C2620;
import yyds.C2794;
import yyds.ComponentCallbacks2C2272;
import yyds.ExecutorServiceC1555;
import yyds.InterfaceC2587;
import yyds.ThreadFactoryC0710;
import yyds.ThreadFactoryC2122;

/* JADX INFO: renamed from: com.bumptech.glide.ᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0040 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static volatile boolean f377;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C0040 f378;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0469 f379;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ArrayList f380 = new ArrayList();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2572 f381;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1227 f382;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC2587 f383;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2267 f384;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0596 f385;

    public ComponentCallbacks2C0040(Context context, C2620 c2620, C0596 c0596, InterfaceC2587 interfaceC2587, C2267 c2267, C1227 c1227, C0469 c0469, C0805 c0805, C1505 c1505, List list, ArrayList arrayList, AbstractC0024 abstractC0024, C0052 c0052) {
        this.f383 = interfaceC2587;
        this.f384 = c2267;
        this.f385 = c0596;
        this.f382 = c1227;
        this.f379 = c0469;
        if (((Map) c0052.f551).get(AbstractC0578.class) == null) {
            this.f381 = new C2572(context, c2267, new C1424(this, arrayList, abstractC0024), new C0135(18), c0805, c1505, list, c2620, c0052);
        } else {
            C0188.m794();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static ComponentCallbacks2C2272 m248(View view) {
        C1227 c1227M250 = m250(view.getContext());
        c1227M250.getClass();
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c1227M250.m2500(view.getContext().getApplicationContext());
        }
        AbstractC0319.m992(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM2499 = C1227.m2499(view.getContext());
        if (activityM2499 == null) {
            return c1227M250.m2500(view.getContext().getApplicationContext());
        }
        if (!(activityM2499 instanceof FragmentActivity)) {
            return c1227M250.m2500(view.getContext().getApplicationContext());
        }
        c1227M250.f5641.clear();
        throw null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static ComponentCallbacks2C0040 m249(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f378 == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
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
            synchronized (ComponentCallbacks2C0040.class) {
                if (f378 == null) {
                    if (f377) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f377 = true;
                    try {
                        m251(context, generatedAppGlideModule);
                        f377 = false;
                    } catch (Throwable th) {
                        f377 = false;
                        throw th;
                    }
                }
            }
        }
        return f378;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1227 m250(Context context) {
        AbstractC0319.m992(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m249(context).f382;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m251(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C1505 c1505 = new C1505(0);
        int i = 1;
        C2794 c2794 = new C2794(1);
        C0805 c0805 = new C0805(17);
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
                        AbstractC1960.m3787(str);
                        throw null;
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                C0188.m794();
                return;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                C0188.m794();
                return;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            C0188.m794();
            return;
        }
        ThreadFactoryC0710 threadFactoryC0710 = new ThreadFactoryC0710(i);
        if (ExecutorServiceC1555.f7922 == 0) {
            ExecutorServiceC1555.f7922 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC1555.f7922;
        if (TextUtils.isEmpty("source")) {
            C0188.m798("Name must be non-null and non-empty, but given: source");
            return;
        }
        ThreadFactoryC2122 threadFactoryC2122 = new ThreadFactoryC2122(threadFactoryC0710, "source", false);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC1555 executorServiceC1555 = new ExecutorServiceC1555(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, priorityBlockingQueue, threadFactoryC2122));
        ThreadFactoryC0710 threadFactoryC07102 = new ThreadFactoryC0710(i);
        if (TextUtils.isEmpty("disk-cache")) {
            C0188.m798("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        ExecutorServiceC1555 executorServiceC15552 = new ExecutorServiceC1555(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC2122(threadFactoryC07102, "disk-cache", true)));
        if (ExecutorServiceC1555.f7922 == 0) {
            ExecutorServiceC1555.f7922 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = ExecutorServiceC1555.f7922 >= 4 ? 2 : 1;
        ThreadFactoryC0710 threadFactoryC07103 = new ThreadFactoryC0710(i);
        if (TextUtils.isEmpty("animation")) {
            C0188.m798("Name must be non-null and non-empty, but given: animation");
            return;
        }
        ExecutorServiceC1555 executorServiceC15553 = new ExecutorServiceC1555(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC2122(threadFactoryC07103, "animation", true)));
        C1282 c1282 = new C1282(new C0747(applicationContext));
        C0469 c0469 = new C0469(11);
        int i4 = c1282.f5890;
        InterfaceC2587 c1436 = i4 > 0 ? new C1436(i4) : new C0805(8);
        C2267 c2267 = new C2267(c1282.f5892);
        C0596 c0596 = new C0596(c1282.f5891);
        ComponentCallbacks2C0040 componentCallbacks2C0040 = new ComponentCallbacks2C0040(applicationContext, new C2620(c0596, new C2014(applicationContext), executorServiceC15552, executorServiceC1555, new ExecutorServiceC1555(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new ThreadFactoryC2122(new ThreadFactoryC0710(i), "source-unlimited", false))), executorServiceC15553), c0596, c1436, c2267, new C1227(), c0469, c0805, c1505, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C0052(c2794));
        applicationContext.registerComponentCallbacks(componentCallbacks2C0040);
        f378 = componentCallbacks2C0040;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static ComponentCallbacks2C2272 m252(Context context) {
        return m250(context).m2500(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC0181.m744();
        this.f385.m4133(0L);
        this.f383.mo1862();
        C2267 c2267 = this.f384;
        synchronized (c2267) {
            c2267.m4270(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC0181.m744();
        synchronized (this.f380) {
            try {
                Iterator it = this.f380.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C2272) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0596 c0596 = this.f385;
        c0596.getClass();
        if (i >= 40) {
            c0596.m4133(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c0596) {
                j = c0596.f10640;
            }
            c0596.m4133(j / 2);
        }
        this.f383.mo1857(i);
        C2267 c2267 = this.f384;
        synchronized (c2267) {
            if (i >= 40) {
                synchronized (c2267) {
                    c2267.m4270(0);
                }
            } else if (i >= 20 || i == 15) {
                c2267.m4270(c2267.f11178 / 2);
            }
        }
    }
}
