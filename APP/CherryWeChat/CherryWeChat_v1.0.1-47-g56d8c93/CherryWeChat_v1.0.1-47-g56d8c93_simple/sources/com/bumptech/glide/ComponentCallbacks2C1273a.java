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
import p000.AbstractActivityC1244c3;
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
import p000.C0649P3;
import p000.C0668Pg;
import p000.C0756Rj;
import p000.C1185ao;
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
import p000.InterfaceC0627Oi;
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
    public final ArrayList f4343g;

    public ComponentCallbacks2C1273a(Context r2, C1264cg r3, C0204Ep r4, InterfaceC0565N5 r5, C2812zp r6, C2166kw r7, C2220m6 r8, C0668Pg r9, C0521M4 r10, List r11, ArrayList r12, AbstractC0148Dc r13, C0132D2 r14) {
        this.f4343g = new ArrayList();
        this.f4337a = r5;
        this.f4340d = r6;
        this.f4338b = r4;
        this.f4341e = r7;
        this.f4342f = r8;
        this.f4339c = new C0756Rj(r2, r6, new C2692wy(this, r12, r13), new C0668Pg(14), r9, r10, r11, r3, r14);
    }

    /* JADX INFO: renamed from: a */
    public static ComponentCallbacks2C1273a m2412a(Context r3) {
        if (f4335h != null) goto L41;
        Context r0 = r3.getApplicationContext();
        GeneratedAppGlideModule r02 = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{r0.getApplicationContext()});     // Catch: InvocationTargetException -> L7 NoSuchMethodException -> L10 IllegalAccessException -> L13 InstantiationException -> L16 ClassNotFoundException -> L19
    L21:
        monitor-enter(ComponentCallbacks2C1273a.class);
    L37:
        th = move-exception;
        throw th;
    L23:
        if (f4335h == null) goto L25;
    L35:
        monitor-exit(ComponentCallbacks2C1273a.class);     // Catch: Throwable -> L37
        goto L41
    L25:
        if (f4336i == true) goto L34;
        f4336i = true;     // Catch: Throwable -> L37
        m2413b(r3, r02);     // Catch: Throwable -> L30
        f4336i = false;     // Catch: Throwable -> L37
        goto L35
    L30:
        th = move-exception;
        f4336i = false;     // Catch: Throwable -> L37
        throw th;     // Catch: Throwable -> L37
    L34:
        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");     // Catch: Throwable -> L37
    L19:
        r02 = null;
    L13:
        e = move-exception;
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
    L16:
        e = move-exception;
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
    L10:
        e = move-exception;
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
    L7:
        e = move-exception;
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
    L41:
        return f4335h;
    }

    /* JADX INFO: renamed from: b */
    public static void m2413b(Context r27, GeneratedAppGlideModule r28) {
        C0521M4 r9 = new C0521M4(0);
        C2756yc r1 = new C2756yc(1);
        C0668Pg r8 = new C0668Pg(12);
        Context r2 = r27.getApplicationContext();
        List r3 = Collections.EMPTY_LIST;
        ArrayList r11 = new ArrayList();
        ApplicationInfo r4 = r2.getPackageManager().getApplicationInfo(r2.getPackageName(), 128);     // Catch: PackageManager.NameNotFoundException -> L82
        if (r4 == null) goto L19;
        if (r4.metaData == null) goto L19;
        if (Log.isLoggable("ManifestParser", 2) == false) goto L11;
        Objects.toString(r4.metaData);     // Catch: PackageManager.NameNotFoundException -> L82
    L11:
        Iterator<String> r5 = r4.metaData.keySet().iterator();     // Catch: PackageManager.NameNotFoundException -> L82
    L13:
        if (r5.hasNext() == false) goto L19;
        String r6 = r5.next();     // Catch: PackageManager.NameNotFoundException -> L82
        if ("GlideModule".equals(r4.metaData.get(r6)) == false) goto L13;
        AbstractC0671Pj.m1356u(r6);     // Catch: PackageManager.NameNotFoundException -> L82
        throw null;     // Catch: PackageManager.NameNotFoundException -> L82
    L19:
        if (r28 == null) goto L28;
        if (new HashSet().isEmpty() == true) goto L28;
        new HashSet();
        Iterator r42 = r11.iterator();
        if (r42.hasNext() == false) goto L28;
        r42.next().getClass();
        throw new ClassCastException();
    L28:
        if (Log.isLoggable("Glide", 3) == false) goto L34;
        Iterator r43 = r11.iterator();
        if (r43.hasNext() == false) goto L34;
        r43.next().getClass();
        throw new ClassCastException();
    L34:
        Iterator r44 = r11.iterator();
        if (r44.hasNext() == true) goto L80;
        ThreadFactoryC0474L0 r45 = new ThreadFactoryC0474L0(1);
        if (ExecutorServiceC0971Wj.f3026c != 0) goto L39;
        ExecutorServiceC0971Wj.f3026c = Math.min(4, Runtime.getRuntime().availableProcessors());
    L39:
        int r13 = ExecutorServiceC0971Wj.f3026c;
        if (TextUtils.isEmpty("source") == true) goto L79;
        TimeUnit r19 = TimeUnit.MILLISECONDS;
        ExecutorServiceC0971Wj r46 = new ExecutorServiceC0971Wj(new ThreadPoolExecutor(r13, r13, 0, r19, new PriorityBlockingQueue(), new ThreadFactoryC0928Vj(r45, "source", false)));
        ThreadFactoryC0474L0 r52 = new ThreadFactoryC0474L0(1);
        if (TextUtils.isEmpty("disk-cache") == true) goto L77;
        ExecutorServiceC0971Wj r53 = new ExecutorServiceC0971Wj(new ThreadPoolExecutor(1, 1, 0, r19, new PriorityBlockingQueue(), new ThreadFactoryC0928Vj(r52, "disk-cache", true)));
        if (ExecutorServiceC0971Wj.f3026c != 0) goto L47;
        ExecutorServiceC0971Wj.f3026c = Math.min(4, Runtime.getRuntime().availableProcessors());
    L47:
        if (ExecutorServiceC0971Wj.f3026c < 4) goto L49;
        int r15 = 2;
    L50:
        ThreadFactoryC0474L0 r32 = new ThreadFactoryC0474L0(1);
        if (TextUtils.isEmpty("animation") == true) goto L75;
        ExecutorServiceC0971Wj r33 = new ExecutorServiceC0971Wj(new ThreadPoolExecutor(r15, r15, 0, r19, new PriorityBlockingQueue(), new ThreadFactoryC0928Vj(r32, "animation", true)));
        C1468gr r62 = new C1468gr(r2);
        C1512hr r7 = new C1512hr();
        Context r10 = r62.f5203a;
        float r12 = r62.f5206d;
        ActivityManager r132 = r62.f5204b;
        if (r132.isLowRamDevice() == false) goto L55;
        int r14 = 2097152;
    L56:
        r7.f5356c = r14;
        float r152 = r132.getMemoryClass() * 1048576;
        if (r132.isLowRamDevice() == false) goto L59;
        float r16 = 0.33f;
    L60:
        int r153 = Math.round(r152 * r16);
        DisplayMetrics r63 = (DisplayMetrics) r62.f5205c.f3226b;
        float r0 = (r63.widthPixels * r63.heightPixels) * 4;
        int r64 = Math.round(r0 * r12);
        int r02 = Math.round(r0 * 2.0f);
        int r34 = r153 - r14;
        if ((r02 + r64) > r34) goto L63;
        r7.f5355b = r02;
        r7.f5354a = r64;
    L65:
        if (Log.isLoggable("MemorySizeCalculator", 3) == false) goto L67;
        Formatter.formatFileSize(r10, r7.f5355b);
        Formatter.formatFileSize(r10, r7.f5354a);
        Formatter.formatFileSize(r10, r14);
        Formatter.formatFileSize(r10, r153);
        r132.getMemoryClass();
        r132.isLowRamDevice();
    L67:
        C2220m6 r03 = new C2220m6(10);
        int r35 = r7.f5354a;
        if (r35 <= 0) goto L71;
        InterfaceC0565N5 r47 = new C0032Ap(r35);
    L72:
        C2812zp r54 = new C2812zp(r7.f5356c);
        C0204Ep r36 = new C0204Ep(r7.f5355b);
        ComponentCallbacks2C1273a r04 = new ComponentCallbacks2C1273a(r2, new C1264cg(r36, new C0132D2(r2), r53, r46, new ExecutorServiceC0971Wj(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC0971Wj.f3025b, r19, new SynchronousQueue(), new ThreadFactoryC0928Vj(new ThreadFactoryC0474L0(1), "source-unlimited", false))), r33), r36, r47, r54, new C2166kw(), r03, r8, r9, Collections.EMPTY_LIST, r11, r28, new C0132D2(r1));
        r2.registerComponentCallbacks(r04);
        f4335h = r04;
        return;
    L71:
        r47 = new C1456gf(24);
        goto L72
    L63:
        float r05 = r34 / (r12 + 2.0f);
        r7.f5355b = Math.round(2.0f * r05);
        r7.f5354a = Math.round(r05 * r12);
        goto L65
    L59:
        r16 = 0.4f;
        goto L60
    L55:
        r14 = 4194304;
        goto L56
    L75:
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
    L49:
        r15 = 1;
        goto L50
    L77:
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
    L79:
        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
    L80:
        r44.next().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C1473gw m2414c(Context r1) {
        AbstractC0714Qj.m1488j("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", r1);
        return m2412a(r1).f4341e.m4367d(r1);
    }

    /* JADX INFO: renamed from: d */
    public static ComponentCallbacks2C1473gw m2415d(View r14) {
        Context r0 = r14.getContext();
        AbstractC0714Qj.m1488j("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).", r0);
        C2166kw r02 = m2412a(r0).f4341e;
        r02.getClass();
        char[] r1 = AbstractC2622vD.f9104a;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L5;
        boolean r12 = true;
    L6:
        if (r12 == false) goto L8;
        AbstractC0714Qj.m1488j("Unable to obtain a request manager for a view without a Context", r14.getContext());
        Activity r13 = C2166kw.m4364a(r14.getContext());
        if (r13 != null) goto L14;
        return r02.m4367d(r14.getContext().getApplicationContext());
    L14:
        if ((r13 instanceof AbstractActivityC2148ki) == false) goto L60;
        AbstractActivityC2148ki r15 = (AbstractActivityC2148ki) r13;
        C0521M4 r2 = r02.f7548b;
        r2.clear();
        C2166kw.m4365b(r15.getSupportFragmentManager().f9494c.m4882t(), r2);
        View r5 = r15.findViewById(R.id.content);
        AbstractActivityC1244c3 r6 = null;
        AbstractComponentCallbacksC1503hi r7 = null;
    L17:
        if (r14.equals(r5) == true) goto L24;
        r7 = (AbstractComponentCallbacksC1503hi) r2.get(r14);
        if (r7 != null) goto L24;
        if ((r14.getParent() instanceof View) == false) goto L24;
        r14 = (View) r14.getParent();
    L24:
        r2.clear();
        if (r7 == null) goto L58;
        AbstractC0714Qj.m1488j("You cannot start a load on a fragment before it is attached or after it is destroyed", r7.m2870d());
        if (Looper.myLooper() != Looper.getMainLooper()) goto L29;
        boolean r142 = true;
    L30:
        if (r142 == false) goto L32;
        C2104ji r143 = r7.f5328s;
        if (r143 != null) goto L36;
        AbstractActivityC1244c3 r16 = null;
    L37:
        if (r16 == null) goto L43;
        InterfaceC0627Oi r17 = r02.f7549c;
        if (r143 == null) goto L42;
        r6 = r143.f7400l;
    L42:
        r17.mo1221a(r6);
    L43:
        AbstractC2805zi r122 = r7.m2869c();
        Context r9 = r7.m2870d();
        ComponentCallbacks2C1273a r10 = m2412a(r9.getApplicationContext());
        C0649P3 r8 = r02.f7550d;
        C1185ao r11 = r7.f5304M;
        if (r7.m2875i() == true) goto L46;
    L54:
        boolean r132 = false;
    L56:
        return r8.m1275E(r9, r10, r11, r122, r132);
    L46:
        if (r7.m2876j() == true) goto L54;
        View r144 = r7.f5296E;
        if (r144 == null) goto L54;
        if (r144.getWindowToken() == null) goto L54;
        if (r7.f5296E.getVisibility() != 0) goto L54;
        r132 = true;
        goto L56
    L36:
        r16 = r143.f7400l;
        goto L37
    L32:
        return r02.m4367d(r7.m2870d().getApplicationContext());
    L29:
        r142 = false;
        goto L30
    L58:
        return r02.m4366c(r15);
    L60:
        return r02.m4367d(r14.getContext().getApplicationContext());
    L8:
        return r02.m4367d(r14.getContext().getApplicationContext());
    L5:
        r12 = false;
        goto L6
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC2622vD.m5130a();
        this.f4338b.m190e(0);
        this.f4337a.mo55m();
        C2812zp r0 = this.f4340d;
        monitor-enter(r0);
        r0.m5440b(0);     // Catch: Throwable -> L8
        monitor-exit(r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r9) {
        AbstractC2622vD.m5130a();
        ArrayList r0 = this.f4343g;
        monitor-enter(r0);
        Iterator r1 = this.f4343g.iterator();     // Catch: Throwable -> L8
    L6:
        if (r1.hasNext() == false) goto L10;
        ((ComponentCallbacks2C1473gw) r1.next()).getClass();     // Catch: Throwable -> L8
        goto L6
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L8
        C0204Ep r12 = this.f4338b;
        r12.getClass();
        if (r9 < 40) goto L14;
        r12.m190e(0);
    L20:
        this.f4337a.mo54k(r9);
        C2812zp r4 = this.f4340d;
        monitor-enter(r4);
        if (r9 < 40) goto L31;
        monitor-enter(r4);     // Catch: Throwable -> L36
        r4.m5440b(0);     // Catch: Throwable -> L28
        monitor-exit(r4);     // Catch: Throwable -> L36
    L34:
        monitor-exit(r4);
        return;
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L36
    L31:
        if (r9 >= 20) goto L33;
        if (r9 != 15) goto L34;
    L33:
        r4.m5440b(r4.f9530e / 2);     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        throw th;
    L14:
        if (r9 >= 20) goto L16;
        if (r9 != 15) goto L20;
    L16:
        monitor-enter(r12);
        long r42 = r12.f287a;     // Catch: Throwable -> L39
        monitor-exit(r12);
        r12.m190e(r42 / 2);
    L39:
        th = move-exception;
        throw th;
    L8:
        th = move-exception;
        throw th;
    }
}
