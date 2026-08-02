package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import defpackage.aq0;
import defpackage.b93;
import defpackage.bf0;
import defpackage.c80;
import defpackage.ds0;
import defpackage.eb;
import defpackage.er2;
import defpackage.fg1;
import defpackage.hg;
import defpackage.jg1;
import defpackage.kg1;
import defpackage.l40;
import defpackage.n4;
import defpackage.p7;
import defpackage.rp0;
import defpackage.s;
import defpackage.td1;
import defpackage.ud1;
import defpackage.vp0;
import defpackage.x82;
import defpackage.y82;
import defpackage.yd1;
import defpackage.z4;
import defpackage.z8;
import defpackage.zk;
import defpackage.zp0;
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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a o;
    public static volatile boolean p;
    public final zk h;
    public final yd1 i;
    public final vp0 j;
    public final td1 k;
    public final y82 l;
    public final eb m;
    public final ArrayList n = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(Context context, bf0 bf0Var, yd1 yd1Var, zk zkVar, td1 td1Var, y82 y82Var, eb ebVar, eb ebVar2, hg hgVar, List list, ArrayList arrayList, p7 p7Var, n4 n4Var) {
        this.h = zkVar;
        this.k = td1Var;
        this.i = yd1Var;
        this.l = y82Var;
        this.m = ebVar;
        if (((Map) n4Var.i).get(rp0.class) == null) {
            this.j = new vp0(context, td1Var, new er2(this, arrayList, p7Var), new z8(29), ebVar2, hgVar, list, bf0Var, n4Var);
        } else {
            c80.g();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (o == null) {
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
            synchronized (a.class) {
                if (o == null) {
                    if (p) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    p = true;
                    try {
                        b(context, generatedAppGlideModule);
                        p = false;
                    } catch (Throwable th) {
                        p = false;
                        throw th;
                    }
                }
            }
        }
        return o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        hg hgVar = new hg(0);
        l40 l40Var = new l40(1);
        eb ebVar = new eb(26);
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
                        fg1.H(str);
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
                c80.g();
                return;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                c80.g();
                return;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            c80.g();
            return;
        }
        z4 z4Var = new z4(1);
        int i = 4;
        if (aq0.i == 0) {
            aq0.i = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i2 = aq0.i;
        if (TextUtils.isEmpty("source")) {
            s.j("Name must be non-null and non-empty, but given: source");
            return;
        }
        zp0 zp0Var = new zp0(z4Var, "source", false);
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aq0 aq0Var = new aq0(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, priorityBlockingQueue, zp0Var));
        z4 z4Var2 = new z4(1);
        if (TextUtils.isEmpty("disk-cache")) {
            s.j("Name must be non-null and non-empty, but given: disk-cache");
            return;
        }
        aq0 aq0Var2 = new aq0(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new zp0(z4Var2, "disk-cache", true)));
        if (aq0.i == 0) {
            aq0.i = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = aq0.i >= 4 ? 2 : 1;
        z4 z4Var3 = new z4(1);
        if (TextUtils.isEmpty("animation")) {
            s.j("Name must be non-null and non-empty, but given: animation");
            return;
        }
        aq0 aq0Var3 = new aq0(new ThreadPoolExecutor(i3, i3, 0L, timeUnit, new PriorityBlockingQueue(), new zp0(z4Var3, "animation", true)));
        kg1 kg1Var = new kg1(new jg1(applicationContext));
        eb ebVar2 = new eb(14);
        int i4 = kg1Var.a;
        zk ud1Var = i4 > 0 ? new ud1(i4) : new eb(i);
        td1 td1Var = new td1(kg1Var.c);
        yd1 yd1Var = new yd1(kg1Var.b);
        bf0 bf0Var = new bf0(yd1Var, new n4(applicationContext), aq0Var2, aq0Var, new aq0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10000L, timeUnit, new SynchronousQueue(), new zp0(new z4(1), "source-unlimited", false))), aq0Var3);
        List list2 = Collections.EMPTY_LIST;
        n4 n4Var = new n4(l40Var);
        zk zkVar = ud1Var;
        y82 y82Var = new y82();
        new HashMap();
        if (ds0.f && ds0.e) {
            Collections.newSetFromMap(new WeakHashMap());
        }
        a aVar = new a(applicationContext, bf0Var, yd1Var, zkVar, td1Var, y82Var, ebVar2, ebVar, hgVar, list2, arrayList, generatedAppGlideModule, n4Var);
        applicationContext.registerComponentCallbacks(aVar);
        o = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x82 c(Context context) {
        fg1.q("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", context);
        return a(context).l.a(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        b93.a();
        this.i.i(0L);
        this.h.n();
        td1 td1Var = this.k;
        synchronized (td1Var) {
            td1Var.b(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        b93.a();
        synchronized (this.n) {
            try {
                Iterator it = this.n.iterator();
                while (it.hasNext()) {
                    ((x82) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yd1 yd1Var = this.i;
        yd1Var.getClass();
        if (i >= 40) {
            yd1Var.i(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (yd1Var) {
                j = yd1Var.h;
            }
            yd1Var.i(j / 2);
        }
        this.h.k(i);
        td1 td1Var = this.k;
        synchronized (td1Var) {
            if (i >= 40) {
                synchronized (td1Var) {
                    td1Var.b(0);
                }
            } else if (i >= 20 || i == 15) {
                td1Var.b(td1Var.e / 2);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
