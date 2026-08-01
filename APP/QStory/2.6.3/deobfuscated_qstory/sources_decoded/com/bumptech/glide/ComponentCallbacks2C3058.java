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
import com.alibaba.fastjson2.C2942;
import com.bumptech.glide.load.engine.C3008;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.bumptech.glide.load.engine.bitmap_recycle.C2981;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import com.google.android.material.internal.C3158;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.client.plugins.api.C3886;
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
import p075.C6958;
import p222.AbstractC7989;
import p229.ExecutorServiceC8043;
import p229.ThreadFactoryC8045;
import p229.ThreadFactoryC8046;
import p230.C8047;
import p230.C8048;
import p230.C8049;
import p232.C8065;
import p232.C8072;
import p305.C8623;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3058 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static volatile ComponentCallbacks2C3058 f9766;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static volatile boolean f9767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8072 f9768;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2974 f9769;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C6958 f9770;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f9771 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8048 f9772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C3069 f9773;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2979 f9774;

    public ComponentCallbacks2C3058(Context context, C3008 c3008, C8048 c8048, InterfaceC2979 interfaceC2979, C2974 c2974, C8072 c8072, C6958 c6958, C8623 c8623, C0257 c0257, List list, ArrayList arrayList, AbstractC3065 abstractC3065, C2242 c2242) {
        MemoryCategory memoryCategory = MemoryCategory.ZERO;
        this.f9774 = interfaceC2979;
        this.f9769 = c2974;
        this.f9772 = c8048;
        this.f9768 = c8072;
        this.f9770 = c6958;
        if (((Map) c2242.f6537).get(AbstractC3055.class) == null) {
            this.f9773 = new C3069(context, c2974, new C8065(this, arrayList, abstractC3065), new C6958(12), c8623, c0257, list, c3008, c2242);
        } else {
            C2942.m6394();
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ComponentCallbacks2C3064 m6764(View view) {
        View view2;
        Context context = view.getContext();
        AbstractC7989.m13469(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C8072 c8072 = m6767(context).f9768;
        c8072.getClass();
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c8072.m13557(view.getContext().getApplicationContext());
        }
        AbstractC7989.m13469(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM13555 = C8072.m13555(view.getContext());
        if (activityM13555 == null) {
            return c8072.m13557(view.getContext().getApplicationContext());
        }
        if (!(activityM13555 instanceof FragmentActivity)) {
            return c8072.m13557(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityM13555;
        C0257 c0257 = c8072.f22257;
        c0257.clear();
        C8072.m13554(fragmentActivity.getSupportFragmentManager().f6784.m964(), c0257);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = null;
        while (!view.equals(viewFindViewById) && (abstractComponentCallbacksC2338 = (AbstractComponentCallbacksC2338) c0257.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        c0257.clear();
        if (abstractComponentCallbacksC2338 == null) {
            return c8072.m13556(fragmentActivity);
        }
        AbstractC7989.m13469(abstractComponentCallbacksC2338.m4441(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c8072.m13557(abstractComponentCallbacksC2338.m4441().getApplicationContext());
        }
        if (abstractComponentCallbacksC2338.m4443() != null) {
            c8072.f22256.mo12278(abstractComponentCallbacksC2338.m4443());
        }
        AbstractC2313 abstractC2313M4442 = abstractComponentCallbacksC2338.m4442();
        Context contextM4441 = abstractComponentCallbacksC2338.m4441();
        return c8072.f22255.m13544(contextM4441, m6767(contextM4441.getApplicationContext()), abstractComponentCallbacksC2338.f6919, abstractC2313M4442, (!abstractComponentCallbacksC2338.m4460() || abstractComponentCallbacksC2338.m4461() || (view2 = abstractComponentCallbacksC2338.f6881) == null || view2.getWindowToken() == null || abstractComponentCallbacksC2338.f6881.getVisibility() != 0) ? false : true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ComponentCallbacks2C3064 m6765(Context context) {
        AbstractC7989.m13469(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m6767(context).f9768.m13557(context);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m6766(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C8623 c8623;
        C0257 c0257 = new C0257(0);
        C3070 c3070 = new C3070(0);
        C8623 c86232 = new C8623(13);
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
                        AbstractC3933.m8294(str);
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
                throw AbstractC2442.m4578(it);
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw AbstractC2442.m4578(it2);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            throw AbstractC2442.m4578(it3);
        }
        ThreadFactoryC8046 threadFactoryC8046 = new ThreadFactoryC8046();
        if (ExecutorServiceC8043.f22205 == 0) {
            ExecutorServiceC8043.f22205 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC8043.f22205;
        if (TextUtils.isEmpty("source")) {
            C5925.m11310("Name must be non-null and non-empty, but given: source");
            return;
        }
        ThreadFactoryC8045 threadFactoryC8045 = new ThreadFactoryC8045(threadFactoryC8046, "source", false);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExecutorServiceC8043 executorServiceC8043 = new ExecutorServiceC8043(new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, threadFactoryC8045));
        ThreadFactoryC8046 threadFactoryC80462 = new ThreadFactoryC8046();
        if (TextUtils.isEmpty("disk-cache")) {
            C5925.m11310("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        ExecutorServiceC8043 executorServiceC80432 = new ExecutorServiceC8043(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC8045(threadFactoryC80462, "disk-cache", true)));
        if (ExecutorServiceC8043.f22205 == 0) {
            ExecutorServiceC8043.f22205 = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = ExecutorServiceC8043.f22205 >= 4 ? 2 : 1;
        ThreadFactoryC8046 threadFactoryC80463 = new ThreadFactoryC8046();
        if (TextUtils.isEmpty("animation")) {
            C5925.m11310("Name must be non-null and non-empty, but given: animation");
            return;
        }
        ExecutorServiceC8043 executorServiceC80433 = new ExecutorServiceC8043(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC8045(threadFactoryC80463, "animation", true)));
        C8047 c8047 = new C8047(applicationContext);
        C3158 c3158 = new C3158();
        Context context2 = c8047.f22216;
        float f = c8047.f22213;
        ActivityManager activityManager = c8047.f22215;
        int i3 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        c3158.f10510 = i3;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c8047.f22214.f22219;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i4 = iRound - i3;
        int i5 = iRound3 + iRound2;
        if (i5 <= i4) {
            c3158.f10511 = iRound3;
            c3158.f10512 = iRound2;
        } else {
            float f3 = i4 / (f + 2.0f);
            c3158.f10511 = Math.round(2.0f * f3);
            c3158.f10512 = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            c8623 = c86232;
            sb.append(Formatter.formatFileSize(context2, c3158.f10511));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context2, c3158.f10512));
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
            c8623 = c86232;
        }
        C6958 c6958 = new C6958(15);
        int i6 = c3158.f10512;
        InterfaceC2979 c2981 = i6 > 0 ? new C2981(i6) : new C3886(16);
        C2974 c2974 = new C2974(c3158.f10510);
        C8048 c8048 = new C8048(c3158.f10511);
        ComponentCallbacks2C3058 componentCallbacks2C3058 = new ComponentCallbacks2C3058(applicationContext, new C3008(c8048, new C8049(applicationContext), executorServiceC80432, executorServiceC8043, new ExecutorServiceC8043(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new ThreadFactoryC8045(new ThreadFactoryC8046(), "source-unlimited", false))), executorServiceC80433), c8048, c2981, c2974, new C8072(), c6958, c8623, c0257, Collections.EMPTY_LIST, arrayList, generatedAppGlideModule, new C2242(c3070));
        applicationContext.registerComponentCallbacks(componentCallbacks2C3058);
        f9766 = componentCallbacks2C3058;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ComponentCallbacks2C3058 m6767(Context context) {
        if (f9766 == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e) {
                C8791.m14473("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
                return null;
            } catch (InstantiationException e2) {
                C8791.m14473("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                C8791.m14473("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
                return null;
            } catch (InvocationTargetException e4) {
                C8791.m14473("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
                return null;
            }
            synchronized (ComponentCallbacks2C3058.class) {
                if (f9766 == null) {
                    if (f9767) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f9767 = true;
                    try {
                        m6766(context, generatedAppGlideModule);
                        f9767 = false;
                    } catch (Throwable th) {
                        f9767 = false;
                        throw th;
                    }
                }
            }
        }
        return f9766;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m6768();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        AbstractC7989.m13473();
        synchronized (this.f9771) {
            try {
                Iterator it = this.f9771.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C3064) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C8048 c8048 = this.f9772;
        c8048.getClass();
        if (i >= 40) {
            c8048.m6380(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (c8048) {
                j = c8048.f9278;
            }
            c8048.m6380(j / 2);
        }
        this.f9774.mo6457(i);
        C2974 c2974 = this.f9769;
        synchronized (c2974) {
            if (i >= 40) {
                synchronized (c2974) {
                    c2974.m6447(0);
                }
            } else if (i >= 20 || i == 15) {
                c2974.m6447(c2974.f9403 / 2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6768() {
        AbstractC7989.m13473();
        this.f9772.m6380(0L);
        this.f9774.mo6458();
        C2974 c2974 = this.f9769;
        synchronized (c2974) {
            c2974.m6447(0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
