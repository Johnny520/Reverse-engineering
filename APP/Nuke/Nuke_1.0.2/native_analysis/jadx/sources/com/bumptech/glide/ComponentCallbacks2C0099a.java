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
import p000.AbstractC0570p7;
import p000.C0160eb;
import p000.C0276hg;
import p000.C0485n4;
import p000.C0676s;
import p000.C0953z8;
import p000.InterfaceC0965zk;
import p000.ThreadFactoryC0949z4;
import p000.aq0;
import p000.b93;
import p000.bf0;
import p000.c80;
import p000.ds0;
import p000.er2;
import p000.fg1;
import p000.jg1;
import p000.kg1;
import p000.l40;
import p000.rp0;
import p000.td1;
import p000.ud1;
import p000.vp0;
import p000.x82;
import p000.y82;
import p000.yd1;
import p000.zp0;

/* JADX INFO: renamed from: com.bumptech.glide.a */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0099a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o */
    public static volatile ComponentCallbacks2C0099a f1641o;

    /* JADX INFO: renamed from: p */
    public static volatile boolean f1642p;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0965zk f1643h;

    /* JADX INFO: renamed from: i */
    public final yd1 f1644i;

    /* JADX INFO: renamed from: j */
    public final vp0 f1645j;

    /* JADX INFO: renamed from: k */
    public final td1 f1646k;

    /* JADX INFO: renamed from: l */
    public final y82 f1647l;

    /* JADX INFO: renamed from: m */
    public final C0160eb f1648m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1649n = new ArrayList();

    public ComponentCallbacks2C0099a(Context context, bf0 bf0Var, yd1 yd1Var, InterfaceC0965zk interfaceC0965zk, td1 td1Var, y82 y82Var, C0160eb c0160eb, C0160eb c0160eb2, C0276hg c0276hg, List list, ArrayList arrayList, AbstractC0570p7 abstractC0570p7, C0485n4 c0485n4) {
        this.f1643h = interfaceC0965zk;
        this.f1646k = td1Var;
        this.f1644i = yd1Var;
        this.f1647l = y82Var;
        this.f1648m = c0160eb;
        if (((Map) c0485n4.f6983i).get(rp0.class) == null) {
            this.f1645j = new vp0(context, td1Var, new er2(this, arrayList, abstractC0570p7), new C0953z8(29), c0160eb2, c0276hg, list, bf0Var, c0485n4);
        } else {
            c80.m664g();
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C0099a m868a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f1641o == null) {
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
            synchronized (ComponentCallbacks2C0099a.class) {
                if (f1641o == null) {
                    if (f1642p) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f1642p = true;
                    try {
                        m869b(context, generatedAppGlideModule);
                        f1642p = false;
                    } catch (Throwable th) {
                        f1642p = false;
                        throw th;
                    }
                }
            }
        }
        return f1641o;
    }

    /* JADX INFO: renamed from: b */
    public static void m869b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C0276hg c0276hg = new C0276hg(0);
        l40 l40Var = new l40(1);
        C0160eb c0160eb = new C0160eb(26);
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
                        fg1.m1616H(str);
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
                c80.m664g();
                return;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                c80.m664g();
                return;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            c80.m664g();
            return;
        }
        ThreadFactoryC0949z4 threadFactoryC0949z4 = new ThreadFactoryC0949z4(1);
        int i = 4;
        if (aq0.f333i == 0) {
            aq0.f333i = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = aq0.f333i;
        if (TextUtils.isEmpty("source")) {
            C0676s.m4651j("Name must be non-null and non-empty, but given: source");
            return;
        }
        zp0 zp0Var = new zp0(threadFactoryC0949z4, "source", false);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aq0 aq0Var = new aq0(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, priorityBlockingQueue, zp0Var));
        ThreadFactoryC0949z4 threadFactoryC0949z42 = new ThreadFactoryC0949z4(1);
        if (TextUtils.isEmpty("disk-cache")) {
            C0676s.m4651j("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        aq0 aq0Var2 = new aq0(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new zp0(threadFactoryC0949z42, "disk-cache", true)));
        if (aq0.f333i == 0) {
            aq0.f333i = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = aq0.f333i >= 4 ? 2 : 1;
        ThreadFactoryC0949z4 threadFactoryC0949z43 = new ThreadFactoryC0949z4(1);
        if (TextUtils.isEmpty("animation")) {
            C0676s.m4651j("Name must be non-null and non-empty, but given: animation");
            return;
        }
        aq0 aq0Var3 = new aq0(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new zp0(threadFactoryC0949z43, "animation", true)));
        kg1 kg1Var = new kg1(new jg1(applicationContext));
        C0160eb c0160eb2 = new C0160eb(14);
        int i4 = kg1Var.f5519a;
        InterfaceC0965zk ud1Var = i4 > 0 ? new ud1(i4) : new C0160eb(i);
        td1 td1Var = new td1(kg1Var.f5521c);
        yd1 yd1Var = new yd1(kg1Var.f5520b);
        bf0 bf0Var = new bf0(yd1Var, new C0485n4(applicationContext), aq0Var2, aq0Var, new aq0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new zp0(new ThreadFactoryC0949z4(1), "source-unlimited", false))), aq0Var3);
        List list2 = Collections.EMPTY_LIST;
        C0485n4 c0485n4 = new C0485n4(l40Var);
        InterfaceC0965zk interfaceC0965zk = ud1Var;
        y82 y82Var = new y82();
        new HashMap();
        if (ds0.f2172f && ds0.f2171e) {
            Collections.newSetFromMap(new WeakHashMap());
        }
        ComponentCallbacks2C0099a componentCallbacks2C0099a = new ComponentCallbacks2C0099a(applicationContext, bf0Var, yd1Var, interfaceC0965zk, td1Var, y82Var, c0160eb2, c0160eb, c0276hg, list2, arrayList, generatedAppGlideModule, c0485n4);
        applicationContext.registerComponentCallbacks(componentCallbacks2C0099a);
        f1641o = componentCallbacks2C0099a;
    }

    /* JADX INFO: renamed from: c */
    public static x82 m870c(Context context) {
        fg1.m1642q("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", context);
        return m868a(context).f1647l.m6228a(context);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        b93.m494a();
        this.f1644i.m5874i(0L);
        this.f1643h.mo1328n();
        td1 td1Var = this.f1646k;
        synchronized (td1Var) {
            td1Var.m5166b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        b93.m494a();
        synchronized (this.f1649n) {
            try {
                Iterator it = this.f1649n.iterator();
                while (it.hasNext()) {
                    ((x82) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yd1 yd1Var = this.f1644i;
        yd1Var.getClass();
        if (i >= 40) {
            yd1Var.m5874i(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (yd1Var) {
                j = yd1Var.f12466h;
            }
            yd1Var.m5874i(j / 2);
        }
        this.f1643h.mo1326k(i);
        td1 td1Var = this.f1646k;
        synchronized (td1Var) {
            if (i >= 40) {
                synchronized (td1Var) {
                    td1Var.m5166b(0);
                }
            } else if (i >= 20 || i == 15) {
                td1Var.m5166b(td1Var.f10685e / 2);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
