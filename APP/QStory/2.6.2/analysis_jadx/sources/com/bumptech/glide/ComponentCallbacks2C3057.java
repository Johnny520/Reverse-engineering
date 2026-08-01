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
import androidx.collection.C0257;
import androidx.core.view.C2242;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.fragment.app.FragmentActivity;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.load.engine.C3007;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.bumptech.glide.load.engine.bitmap_recycle.C2980;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import com.google.android.material.internal.C3157;
import io.ktor.client.plugins.api.C3885;
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
import p075.C6957;
import p222.AbstractC7988;
import p229.ExecutorServiceC8042;
import p229.ThreadFactoryC8044;
import p229.ThreadFactoryC8045;
import p230.C8046;
import p230.C8047;
import p230.C8048;
import p232.C8064;
import p232.C8071;
import p305.C8631;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3057 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C3057 f9757;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static volatile boolean f9758;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8071 f9759;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2973 f9760;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C6957 f9761;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f9762 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8047 f9763;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3068 f9764;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2978 f9765;

    public ComponentCallbacks2C3057(Context context, C3007 c3007, C8047 c8047, InterfaceC2978 interfaceC2978, C2973 c2973, C8071 c8071, C6957 c6957, C8631 c8631, C0257 c0257, List list, ArrayList arrayList, AbstractC3054 abstractC3054, C2242 c2242) {
        MemoryCategory memoryCategory = MemoryCategory.ZERO;
        this.f9765 = interfaceC2978;
        this.f9760 = c2973;
        this.f9763 = c8047;
        this.f9759 = c8071;
        this.f9761 = c6957;
        if (((Map) c2242.f6536).get(AbstractC3054.class) == null) {
            this.f9764 = new C3068(context, c2973, new C8064(this, arrayList, abstractC3054), new C6957(12), c8631, c0257, list, c3007, c2242);
        } else {
            C2941.m6336();
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ComponentCallbacks2C3063 m6719(View view) {
        View view2;
        Context context = view.getContext();
        AbstractC7988.m13441(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C8071 c8071 = m6722(context).f9759;
        c8071.getClass();
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c8071.m13528(view.getContext().getApplicationContext());
        }
        AbstractC7988.m13441(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM13526 = C8071.m13526(view.getContext());
        if (activityM13526 == null) {
            return c8071.m13528(view.getContext().getApplicationContext());
        }
        if (!(activityM13526 instanceof FragmentActivity)) {
            return c8071.m13528(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM13526;
        C0257 c0257 = c8071.f22259;
        c0257.clear();
        C8071.m13525(fragmentActivity.getSupportFragmentManager().f6783.m963(), c0257);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = null;
        while (!view.equals(viewFindViewById) && (abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) c0257.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        c0257.clear();
        if (abstractComponentCallbacksC2338 == null) {
            return c8071.m13527(fragmentActivity);
        }
        AbstractC7988.m13441(abstractComponentCallbacksC2338.m4431(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c8071.m13528(abstractComponentCallbacksC2338.m4431().getApplicationContext());
        }
        if (abstractComponentCallbacksC2338.m4433() != null) {
            c8071.f22258.mo12251(abstractComponentCallbacksC2338.m4433());
        }
        AbstractC2313 abstractC2313M4432 = abstractComponentCallbacksC2338.m4432();
        Context contextM4431 = abstractComponentCallbacksC2338.m4431();
        return c8071.f22257.m13515(contextM4431, m6722(contextM4431.getApplicationContext()), abstractComponentCallbacksC2338.f6918, abstractC2313M4432, (!abstractComponentCallbacksC2338.m4450() || abstractComponentCallbacksC2338.m4451() || (view2 = abstractComponentCallbacksC2338.f6880) == null || view2.getWindowToken() == null || abstractComponentCallbacksC2338.f6880.getVisibility() != 0) ? false : true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ComponentCallbacks2C3063 m6720(Context context) {
        AbstractC7988.m13441(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m6722(context).f9759.m13528(context);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m6721(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C8631 c8631;
        C0257 c0257 = new C0257(0);
        C3069 c3069 = new C3069(0);
        C8631 c86312 = new C8631(13);
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
                        AbstractC3065.m6844(str);
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
                throw AbstractC2442.m4568(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC2442.m4568(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC2442.m4568(it3);
        }
        ThreadFactoryC8045 threadFactoryC8045 = new ThreadFactoryC8045();
        if (ExecutorServiceC8042.f22208 == 0) {
            ExecutorServiceC8042.f22208 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC8042.f22208;
        if (TextUtils.isEmpty("source")) {
            C5919.m11249("Name must be non-null and non-empty, but given: source");
            return;
        }
        ThreadFactoryC8044 threadFactoryC8044 = new ThreadFactoryC8044(threadFactoryC8045, "source", false);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC8042 executorServiceC8042 = new ExecutorServiceC8042(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, threadFactoryC8044));
        ThreadFactoryC8045 threadFactoryC80452 = new ThreadFactoryC8045();
        if (TextUtils.isEmpty("disk-cache")) {
            C5919.m11249("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        ExecutorServiceC8042 executorServiceC80422 = new ExecutorServiceC8042(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC8044(threadFactoryC80452, "disk-cache", true)));
        if (ExecutorServiceC8042.f22208 == 0) {
            ExecutorServiceC8042.f22208 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC8042.f22208 >= 4 ? 2 : 1;
        ThreadFactoryC8045 threadFactoryC80453 = new ThreadFactoryC8045();
        if (TextUtils.isEmpty("animation")) {
            C5919.m11249("Name must be non-null and non-empty, but given: animation");
            return;
        }
        ExecutorServiceC8042 executorServiceC80423 = new ExecutorServiceC8042(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC8044(threadFactoryC80453, "animation", true)));
        C8046 c8046 = new C8046(applicationContext);
        C3157 c3157 = new C3157();
        Context context2 = c8046.f22219;
        float f = c8046.f22216;
        ActivityManager activityManager = c8046.f22218;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c3157.f10505 = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c8046.f22217.f22221;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i4 = iRound - i3;
        int i5 = iRound3 + iRound2;
        if (i5 <= i4) {
            c3157.f10506 = iRound3;
            c3157.f10507 = iRound2;
        } else {
            float f3 = i4 / (f + 2.0f);
            c3157.f10506 = Math.round(2.0f * f3);
            c3157.f10507 = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            c8631 = c86312;
            sb.append(Formatter.formatFileSize(context2, c3157.f10506));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c3157.f10507));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context2, i3));
            sb.append(", memory class limited? ");
            sb.append(i5 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context2, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        } else {
            c8631 = c86312;
        }
        C6957 c6957 = new C6957(15);
        int i6 = c3157.f10507;
        InterfaceC2978 c2980 = i6 > 0 ? new C2980(i6) : new C3885(16);
        C2973 c2973 = new C2973(c3157.f10505);
        C8047 c8047 = new C8047(c3157.f10506);
        ComponentCallbacks2C3057 componentCallbacks2C3057 = new ComponentCallbacks2C3057(applicationContext, new C3007(c8047, new C8048(applicationContext), executorServiceC80422, executorServiceC8042, new ExecutorServiceC8042(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new ThreadFactoryC8044(new ThreadFactoryC8045(), "source-unlimited", false))), executorServiceC80423), c8047, c2980, c2973, new C8071(), c6957, c8631, c0257, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C2242(c3069));
        applicationContext.registerComponentCallbacks(componentCallbacks2C3057);
        f9757 = componentCallbacks2C3057;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ComponentCallbacks2C3057 m6722(Context context) {
        if (f9757 == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                C8796.m14449("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                C8796.m14449("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                C8796.m14449("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                C8796.m14449("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (ComponentCallbacks2C3057.class) {
                if (f9757 == null) {
                    if (f9758) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f9758 = true;
                    try {
                        m6721(context, generatedAppGlideModule);
                        f9758 = false;
                    } catch (Throwable th) {
                        f9758 = false;
                        throw th;
                    }
                }
            }
        }
        return f9757;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m6723();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC7988.m13445();
        synchronized (this.f9762) {
            try {
                Iterator it = this.f9762.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C3063) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C8047 c8047 = this.f9763;
        c8047.getClass();
        if (i >= 40) {
            c8047.m6322(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c8047) {
                j = c8047.f9276;
            }
            c8047.m6322(j / 2);
        }
        this.f9765.mo6400(i);
        C2973 c2973 = this.f9760;
        synchronized (c2973) {
            if (i >= 40) {
                synchronized (c2973) {
                    c2973.m6389(0);
                }
            } else if (i >= 20 || i == 15) {
                c2973.m6389(c2973.f9401 / 2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6723() {
        AbstractC7988.m13445();
        this.f9763.m6322(0L);
        this.f9765.mo6399();
        C2973 c2973 = this.f9760;
        synchronized (c2973) {
            c2973.m6389(0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
