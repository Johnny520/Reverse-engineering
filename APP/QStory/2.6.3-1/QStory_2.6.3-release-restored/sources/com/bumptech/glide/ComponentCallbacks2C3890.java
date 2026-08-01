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
import androidx.collection.C1104;
import androidx.core.view.C3075;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.FragmentActivity;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.load.engine.C3840;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.C3813;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.google.android.material.internal.C3990;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.client.plugins.api.C4718;
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
import p091.C7787;
import p238.AbstractC8818;
import p245.ExecutorServiceC8872;
import p245.ThreadFactoryC8874;
import p245.ThreadFactoryC8875;
import p246.C8876;
import p246.C8877;
import p246.C8878;
import p248.C8894;
import p248.C8901;
import p321.C9452;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3890 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C3890 f10111;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static volatile boolean f10112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8901 f10113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3806 f10114;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7787 f10115;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f10116 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8877 f10117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3901 f10118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC3811 f10119;

    public ComponentCallbacks2C3890(Context context, C3840 c3840, C8877 c8877, InterfaceC3811 interfaceC3811, C3806 c3806, C8901 c8901, C7787 c7787, C9452 c9452, C1104 c1104, List list, ArrayList arrayList, AbstractC3897 abstractC3897, C3075 c3075) {
        MemoryCategory memoryCategory = MemoryCategory.ZERO;
        this.f10119 = interfaceC3811;
        this.f10114 = c3806;
        this.f10117 = c8877;
        this.f10113 = c8901;
        this.f10115 = c7787;
        if (((Map) c3075.f6882).get(AbstractC3887.class) == null) {
            this.f10118 = new C3901(context, c3806, new C8894(this, arrayList, abstractC3897), new C7787(12), c9452, c1104, list, c3840, c3075);
        } else {
            C3775.m6954();
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ComponentCallbacks2C3896 m7324(View view) {
        View view2;
        Context context = view.getContext();
        AbstractC8818.m14028(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C8901 c8901 = m7327(context).f10113;
        c8901.getClass();
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c8901.m14116(view.getContext().getApplicationContext());
        }
        AbstractC8818.m14028(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM14114 = C8901.m14114(view.getContext());
        if (activityM14114 == null) {
            return c8901.m14116(view.getContext().getApplicationContext());
        }
        if (!(activityM14114 instanceof FragmentActivity)) {
            return c8901.m14116(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM14114;
        C1104 c1104 = c8901.f22602;
        c1104.clear();
        C8901.m14113(fragmentActivity.getSupportFragmentManager().f7129.m1524(), c1104);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = null;
        while (!view.equals(viewFindViewById) && (abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) c1104.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        c1104.clear();
        if (abstractComponentCallbacksC3171 == null) {
            return c8901.m14115(fragmentActivity);
        }
        AbstractC8818.m14028(abstractComponentCallbacksC3171.m5001(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c8901.m14116(abstractComponentCallbacksC3171.m5001().getApplicationContext());
        }
        if (abstractComponentCallbacksC3171.m5003() != null) {
            c8901.f22601.mo12837(abstractComponentCallbacksC3171.m5003());
        }
        AbstractC3146 abstractC3146M5002 = abstractComponentCallbacksC3171.m5002();
        Context contextM5001 = abstractComponentCallbacksC3171.m5001();
        return c8901.f22600.m14103(contextM5001, m7327(contextM5001.getApplicationContext()), abstractComponentCallbacksC3171.f7264, abstractC3146M5002, (!abstractComponentCallbacksC3171.m5020() || abstractComponentCallbacksC3171.m5021() || (view2 = abstractComponentCallbacksC3171.f7226) == null || view2.getWindowToken() == null || abstractComponentCallbacksC3171.f7226.getVisibility() != 0) ? false : true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ComponentCallbacks2C3896 m7325(Context context) {
        AbstractC8818.m14028(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m7327(context).f10113.m14116(context);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m7326(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C9452 c9452;
        C1104 c1104 = new C1104(0);
        C3902 c3902 = new C3902(0);
        C9452 c94522 = new C9452(13);
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
                        AbstractC4765.m8853(str);
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
                throw AbstractC3275.m5138(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC3275.m5138(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC3275.m5138(it3);
        }
        ThreadFactoryC8875 threadFactoryC8875 = new ThreadFactoryC8875();
        if (ExecutorServiceC8872.f22550 == 0) {
            ExecutorServiceC8872.f22550 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC8872.f22550;
        if (TextUtils.isEmpty("source")) {
            C6755.m11869("Name must be non-null and non-empty, but given: source");
            return;
        }
        ThreadFactoryC8874 threadFactoryC8874 = new ThreadFactoryC8874(threadFactoryC8875, "source", false);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC8872 executorServiceC8872 = new ExecutorServiceC8872(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, threadFactoryC8874));
        ThreadFactoryC8875 threadFactoryC88752 = new ThreadFactoryC8875();
        if (TextUtils.isEmpty("disk-cache")) {
            C6755.m11869("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        ExecutorServiceC8872 executorServiceC88722 = new ExecutorServiceC8872(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC8874(threadFactoryC88752, "disk-cache", true)));
        if (ExecutorServiceC8872.f22550 == 0) {
            ExecutorServiceC8872.f22550 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC8872.f22550 >= 4 ? 2 : 1;
        ThreadFactoryC8875 threadFactoryC88753 = new ThreadFactoryC8875();
        if (TextUtils.isEmpty("animation")) {
            C6755.m11869("Name must be non-null and non-empty, but given: animation");
            return;
        }
        ExecutorServiceC8872 executorServiceC88723 = new ExecutorServiceC8872(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC8874(threadFactoryC88753, "animation", true)));
        C8876 c8876 = new C8876(applicationContext);
        C3990 c3990 = new C3990();
        Context context2 = c8876.f22561;
        float f = c8876.f22558;
        ActivityManager activityManager = c8876.f22560;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c3990.f10855 = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c8876.f22559.f22564;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i4 = iRound - i3;
        int i5 = iRound3 + iRound2;
        if (i5 <= i4) {
            c3990.f10856 = iRound3;
            c3990.f10857 = iRound2;
        } else {
            float f3 = i4 / (f + 2.0f);
            c3990.f10856 = Math.round(2.0f * f3);
            c3990.f10857 = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            c9452 = c94522;
            sb.append(Formatter.formatFileSize(context2, c3990.f10856));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c3990.f10857));
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
            c9452 = c94522;
        }
        C7787 c7787 = new C7787(15);
        int i6 = c3990.f10857;
        InterfaceC3811 c3813 = i6 > 0 ? new C3813(i6) : new C4718(16);
        C3806 c3806 = new C3806(c3990.f10855);
        C8877 c8877 = new C8877(c3990.f10856);
        ComponentCallbacks2C3890 componentCallbacks2C3890 = new ComponentCallbacks2C3890(applicationContext, new C3840(c8877, new C8878(applicationContext), executorServiceC88722, executorServiceC8872, new ExecutorServiceC8872(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new ThreadFactoryC8874(new ThreadFactoryC8875(), "source-unlimited", false))), executorServiceC88723), c8877, c3813, c3806, new C8901(), c7787, c9452, c1104, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C3075(c3902));
        applicationContext.registerComponentCallbacks(componentCallbacks2C3890);
        f10111 = componentCallbacks2C3890;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ComponentCallbacks2C3890 m7327(Context context) {
        if (f10111 == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                C9620.m15032("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                C9620.m15032("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                C9620.m15032("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                C9620.m15032("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (ComponentCallbacks2C3890.class) {
                if (f10111 == null) {
                    if (f10112) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f10112 = true;
                    try {
                        m7326(context, generatedAppGlideModule);
                        f10112 = false;
                    } catch (Throwable th) {
                        f10112 = false;
                        throw th;
                    }
                }
            }
        }
        return f10111;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m7328();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC8818.m14032();
        synchronized (this.f10116) {
            try {
                Iterator it = this.f10116.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C3896) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C8877 c8877 = this.f10117;
        c8877.getClass();
        if (i >= 40) {
            c8877.m6940(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c8877) {
                j = c8877.f9623;
            }
            c8877.m6940(j / 2);
        }
        this.f10119.mo7017(i);
        C3806 c3806 = this.f10114;
        synchronized (c3806) {
            if (i >= 40) {
                synchronized (c3806) {
                    c3806.m7007(0);
                }
            } else if (i >= 20 || i == 15) {
                c3806.m7007(c3806.f9748 / 2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7328() {
        AbstractC8818.m14032();
        this.f10117.m6940(0L);
        this.f10119.mo7018();
        C3806 c3806 = this.f10114;
        synchronized (c3806) {
            c3806.m7007(0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
