package io.github.cherrywechat.lua;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.api.CherryAPIRegistry;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.HookAPI;
import io.github.cherrywechat.lua.bridge.JavaImporter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC1293cr;
import p000.AbstractC2453ra;
import p000.C0290Gp;
import p000.C0297Gw;
import p000.C0340Hw;
import p000.C0525M8;
import p000.C0829TC;
import p000.InterfaceC1416fj;
import p000.RunnableC2260n3;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJit;

/* JADX INFO: loaded from: classes.dex */
public final class LuaEngine {
    public static final LuaEngine INSTANCE = null;
    private static final String TAG = null;
    private static final List<ClassLoader> classLoaders = null;
    private static final ConcurrentHashMap<String, LuaContext> contexts = null;
    private static boolean hookApiEnabled;
    private static volatile boolean initialized;
    private static final Handler mainHandler = null;
    private static Lua mainLua;
    private static volatile String moduleApkPath;

    static {
        TAG = AbstractC0295Gu.m625r(-363294103697461L);
        INSTANCE = new LuaEngine();
        contexts = new ConcurrentHashMap();
        mainHandler = new Handler(Looper.getMainLooper());
        classLoaders = new ArrayList();
    }

    private LuaEngine() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C0340Hw m2980a(Lua r0, String r1) {
        return executeInternal_gIAlu_s$lambda$7(r0, r1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0829TC m2981b(Object r0, Lua r1, String r2) {
        return setGlobal$lambda$9$lambda$8(r0, r1, r2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m2982c(Lua r0, String r1) {
        return getGlobal$lambda$11$lambda$10(r0, r1);
    }

    private final void checkInitialized() {
        if (initialized == false) goto L6;
        return;
    L6:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-364548234147893L));
    }

    public static /* synthetic */ LuaContext createContext$default(LuaEngine r0, String r1, Activity r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        return r0.createContext(r1, r2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m2983d(String r0, InterfaceC1416fj r1) {
        executeOnUiThread$lambda$6(r0, r1);
    }

    private static final C0340Hw executeInternal_gIAlu_s$lambda$7(Lua r4, String r5) {
        String r1 = null;
        r4.run(r5);     // Catch: Exception -> L6
        if (r4.getTop() <= 0) goto L8;
        Object r52 = r4.toObject(-1);     // Catch: Exception -> L6
    L9:
        r4.setTop(0);     // Catch: Exception -> L6
    L22:
        return new C0340Hw(r52);
    L8:
        r52 = null;
    L6:
        e = move-exception;
        r1 = r4.toString(-1);     // Catch: Exception -> L23
    L12:
        r4.setTop(0);
        AbstractC0295Gu.m625r(-364745802643509L);
        AbstractC0295Gu.m625r(-363139484874805L);
        if (r1 != null) goto L16;
        e.getMessage();
    L16:
        if (r1 != null) goto L20;
        r1 = e.getMessage();
        if (r1 != null) goto L20;
        r1 = AbstractC0295Gu.m625r(-363233974155317L);
    L20:
        r52 = new C0297Gw(new LuaException(r1));
        goto L22
    }

    public static /* synthetic */ void executeOnUiThread$default(LuaEngine r0, String r1, InterfaceC1416fj r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.executeOnUiThread(r1, r2);
    }

    private static final void executeOnUiThread$lambda$6(String r1, InterfaceC1416fj r2) {
        Object r12 = INSTANCE.m5465executeIoAF18A(r1);
        if (r2 == null) goto L6;
        r2.mo90g(new C0340Hw(r12));
        return;
    }

    private final File extractNativeLibFromApk(Context r9, String r10, String r11) {
        String[] r1 = Build.SUPPORTED_ABIS;     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-366953415833653L);     // Catch: Exception -> L9
        if (r1.length != 0) goto L6;
        String r12 = null;
    L7:
        if (r12 != null) goto L11;
        r12 = AbstractC0295Gu.m625r(-365368572901429L);     // Catch: Exception -> L9
    L11:
        String r13 = AbstractC0295Gu.m625r(-365411522574389L) + r12 + '/' + r11;     // Catch: Exception -> L9
        ZipFile r2 = new ZipFile(r10);     // Catch: Exception -> L9
        ZipEntry r102 = r2.getEntry(r13);     // Catch: Exception -> L9
        if (r102 == null) goto L39;
        File r14 = new File(r9.getCacheDir(), AbstractC0295Gu.m625r(-365432997410869L));     // Catch: Exception -> L9
        if (r14.exists() == true) goto L16;
        r14.mkdirs();     // Catch: Exception -> L9
    L16:
        File r92 = new File(r14, r11);     // Catch: Exception -> L9
        if (r92.exists() == true) goto L19;
    L22:
        InputStream r103 = r2.getInputStream(r102);     // Catch: Exception -> L9
        FileOutputStream r112 = new FileOutputStream(r92);     // Catch: Throwable -> L28
        AbstractC1293cr.m2555p(r103, r112);     // Catch: Throwable -> L30
        r112.close();     // Catch: Throwable -> L28
        r103.close();     // Catch: Exception -> L9
        r92.setExecutable(true, false);     // Catch: Exception -> L9
        r92.setReadable(true, false);     // Catch: Exception -> L9
        r2.close();     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-365123759765557L);     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-365166709438517L);     // Catch: Exception -> L9
        r92.getAbsolutePath();     // Catch: Exception -> L9
        return r92;
    L30:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        AbstractC0585Nj.m1138f(r112, th);     // Catch: Throwable -> L28
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        AbstractC0585Nj.m1138f(r103, th);     // Catch: Exception -> L9
        throw th;     // Catch: Exception -> L9
    L19:
        if (r92.length() != r102.getSize()) goto L22;
        AbstractC0295Gu.m625r(-365501716887605L);     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-365544666560565L);     // Catch: Exception -> L9
        r92.getAbsolutePath();     // Catch: Exception -> L9
        r2.close();     // Catch: Exception -> L9
        return r92;
    L39:
        AbstractC0295Gu.m625r(-365295558457397L);     // Catch: Exception -> L9
        AbstractC0295Gu.m625r(-365888263944245L);     // Catch: Exception -> L9
        r2.close();     // Catch: Exception -> L9
        return null;
    L6:
        r12 = r1[0];     // Catch: Exception -> L9
    L9:
        e = move-exception;
        AbstractC0213Ey.m411i(-365995638126645L, -366038587799605L, e);
        return null;
    }

    private static final Object getGlobal$lambda$11$lambda$10(Lua r1, String r2) {
        r1.getGlobal(r2);
        Object r22 = r1.toObject(-1);
        r1.pop(1);
        return r22;
    }

    public static /* synthetic */ void init$default(LuaEngine r0, Context r1, ClassLoader r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.init(r1, r2);
    }

    private static final C0829TC setGlobal$lambda$9$lambda$8(Object r1, Lua r2, String r3) {
        if (r1 == null) goto L4;
        r2.push(r1, Lua.Conversion.SEMI);
    L5:
        r2.setGlobal(r3);
        return C0829TC.f2620a;
    L4:
        r2.pushNil();
        goto L5
    }

    private final void tryLoadNativeLibrary(Context r6) {
        System.loadLibrary(AbstractC0295Gu.m625r(-369070834710581L));     // Catch: UnsatisfiedLinkError -> L5
        AbstractC0295Gu.m625r(-369100899481653L);     // Catch: UnsatisfiedLinkError -> L5
        AbstractC0295Gu.m625r(-369143849154613L);     // Catch: UnsatisfiedLinkError -> L5
        return;
    L5:
        e = move-exception;
        AbstractC0295Gu.m625r(-367687855241269L);
        AbstractC0295Gu.m625r(-367730804914229L);
        e.getMessage();
        String r0 = r6.getApplicationInfo().nativeLibraryDir + AbstractC0295Gu.m625r(-367301308184629L);     // Catch: Exception -> L10
        if (new File(r0).exists() == false) goto L12;
        System.load(r0);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-367361437726773L);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-367404387399733L);     // Catch: Exception -> L10
        return;
    L12:
        AbstractC0295Gu.m625r(-368125941905461L);     // Catch: Exception -> L10
        AbstractC0295Gu.m625r(-368168891578421L);     // Catch: Exception -> L10
    L50:
        String r02 = moduleApkPath;     // Catch: Exception -> L24
        if (r02 != null) goto L27;
        ProtectionDomain r03 = LuaEngine.class.getProtectionDomain();     // Catch: Exception -> L24
        if (r03 == null) goto L26;
        CodeSource r04 = r03.getCodeSource();     // Catch: Exception -> L24
        if (r04 == null) goto L26;
        URL r05 = r04.getLocation();     // Catch: Exception -> L24
        if (r05 == null) goto L26;
        r02 = r05.getPath();     // Catch: Exception -> L24
    L26:
        r02 = null;
    L27:
        if (r02 != null) goto L29;
    L47:
        File r62 = extractNativeLibFromApk(r6, r6.getApplicationInfo().sourceDir, AbstractC0295Gu.m625r(-366300580804661L));     // Catch: Exception -> L43
        if (r62 != null) goto L40;
    L45:
        AbstractC0295Gu.m625r(-366747257403445L);
        AbstractC0295Gu.m625r(-366790207076405L);
        return;
    L40:
        if (r62.exists() == false) goto L45;
        System.load(r62.getAbsolutePath());     // Catch: Exception -> L43
        AbstractC0295Gu.m625r(-366356415379509L);     // Catch: Exception -> L43
        AbstractC0295Gu.m625r(-366399365052469L);     // Catch: Exception -> L43
        r62.getAbsolutePath();     // Catch: Exception -> L43
        return;
    L43:
        e = move-exception;
        AbstractC0213Ey.m411i(-367116624590901L, -367159574263861L, e);
        goto L45
    L29:
        if (new File(r02).exists() == false) goto L47;
        AbstractC0295Gu.m625r(-367881128769589L);     // Catch: Exception -> L24
        AbstractC0295Gu.m625r(-367924078442549L);     // Catch: Exception -> L24
        File r06 = extractNativeLibFromApk(r6, r02, AbstractC0295Gu.m625r(-368048632494133L));     // Catch: Exception -> L24
        if (r06 == null) goto L47;
        if (r06.exists() == false) goto L47;
        System.load(r06.getAbsolutePath());     // Catch: Exception -> L24
        AbstractC0295Gu.m625r(-366455199627317L);     // Catch: Exception -> L24
        AbstractC0295Gu.m625r(-366498149300277L);     // Catch: Exception -> L24
        r06.getAbsolutePath();     // Catch: Exception -> L24
        return;
    L24:
        e = move-exception;
        AbstractC0213Ey.m411i(-366665653024821L, -366158846883893L, e);
    L10:
        e = move-exception;
        AbstractC0213Ey.m411i(-368297740597301L, -367790934456373L, e);
        goto L50
    }

    public final void addClassLoader(ClassLoader r3) {
        AbstractC0295Gu.m625r(-365639155841077L);
        List<ClassLoader> r0 = classLoaders;
        if (r0.contains(r3) == true) goto L9;
        r0.add(r3);
        if (hookApiEnabled == false) goto L7;
        HookAPI.INSTANCE.addClassLoader(r3);
    L7:
        AbstractC0295Gu.m625r(-365690695448629L);
        AbstractC0295Gu.m625r(-365733645121589L);
        r3.toString();
        return;
    }

    public final LuaContext createContext(String r4, Activity r5) {
        AbstractC0295Gu.m625r(-364427975063605L);
        checkInitialized();
        System.loadLibrary(AbstractC0295Gu.m625r(-364440859965493L));     // Catch: UnsatisfiedLinkError -> L6
    L4:
        LuaContext r0 = new LuaContext(r4, new LuaJit(), classLoaders, r5);
        contexts.put(r4, r0);
        AbstractC0295Gu.m625r(-364470924736565L);
        AbstractC0295Gu.m625r(-363964118595637L);
        return r0;
    }

    public final void destroyContext(String r3) {
        AbstractC0295Gu.m625r(-364067197810741L);
        LuaContext r32 = contexts.remove(r3);
        if (r32 == null) goto L5;
        r32.close();
    L5:
        AbstractC0295Gu.m625r(-364080082712629L);
        AbstractC0295Gu.m625r(-364123032385589L);
    }

    public final void enableHookAPI() {
        checkInitialized();
        if (hookApiEnabled == false) goto L6;
        AbstractC0295Gu.m625r(-365819544467509L);
        AbstractC0295Gu.m625r(-365862494140469L);
        return;
    L6:
        Lua r0 = mainLua;
        if (r0 == null) goto L10;
        HookAPI r1 = HookAPI.INSTANCE;
        r1.setClassLoaders(classLoaders);
        r1.register(r0);
        hookApiEnabled = true;
        AbstractC0295Gu.m625r(-364316305913909L);
        AbstractC0295Gu.m625r(-364359255586869L);
        return;
    }

    /* JADX INFO: renamed from: execute-IoAF18A, reason: not valid java name */
    public final Object m5465executeIoAF18A(String r3) {
        AbstractC0295Gu.m625r(-364771572447285L);
        checkInitialized();
        return m5466executeInternalgIAlus$app_release(mainLua, r3);
    }

    /* JADX INFO: renamed from: executeInternal-gIAlu-s$app_release, reason: not valid java name */
    public final Object m5466executeInternalgIAlus$app_release(Lua r4, String r5) {
        AbstractC0295Gu.m625r(-364814522120245L);
        AbstractC0295Gu.m625r(-364831701989429L);
        return ((C0340Hw) LuaLocks.INSTANCE.withLock(r4, new C0290Gp(r4, r5, 1))).f1148a;
    }

    public final void executeOnUiThread(String r4, InterfaceC1416fj r5) {
        AbstractC0295Gu.m625r(-364793047283765L);
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()) == false) goto L8;
        Object r42 = m5465executeIoAF18A(r4);
        if (r5 == null) goto L10;
        r5.mo90g(new C0340Hw(r42));
        return;
    L10:
        return;
    L8:
        mainHandler.post(new RunnableC2260n3(10, r4, r5));
    }

    public final List<ClassLoader> getClassLoaders() {
        return AbstractC2453ra.m4908r0(classLoaders);
    }

    public final LuaContext getContext(String r3) {
        AbstractC0295Gu.m625r(-364054312908853L);
        return contexts.get(r3);
    }

    public final Object getGlobal(String r5) {
        AbstractC0295Gu.m625r(-364874651662389L);
        checkInitialized();
        Lua r0 = mainLua;
        if (r0 != null) goto L5;
        return null;
    L5:
        return LuaLocks.INSTANCE.withLock(r0, new C0290Gp(r0, r5, 0));
    }

    public final synchronized void init(Context r6, ClassLoader r7) {
        monitor-enter(this);
        AbstractC0295Gu.m625r(-368748712163381L);     // Catch: Throwable -> L9
        if (initialized == false) goto L24;
        AbstractC0295Gu.m625r(-368783071901749L);     // Catch: Throwable -> L9
        AbstractC0295Gu.m625r(-368826021574709L);     // Catch: Throwable -> L9
        monitor-exit(this);
        return;
    L24:
        tryLoadNativeLibrary(r6);     // Catch: Throwable -> L9 Exception -> L14
        LuaJit r0 = new LuaJit();     // Catch: Throwable -> L9 Exception -> L14
        r0.openLibraries();     // Catch: Throwable -> L9 Exception -> L14
        List<ClassLoader> r1 = classLoaders;     // Catch: Throwable -> L9 Exception -> L14
        ClassLoader r2 = r6.getClassLoader();     // Catch: Throwable -> L9 Exception -> L14
        AbstractC0295Gu.m625r(-368405114779701L);     // Catch: Throwable -> L9 Exception -> L14
        r1.add(r2);     // Catch: Throwable -> L9 Exception -> L14
        if (r7 == null) goto L16;
        r1.add(r7);     // Catch: Throwable -> L9 Exception -> L14
    L16:
        r1.add(LuaEngine.class.getClassLoader());     // Catch: Throwable -> L9 Exception -> L14
        JavaImporter.INSTANCE.register(r0, r1);     // Catch: Throwable -> L9 Exception -> L14
        CherryGlobalAPI.INSTANCE.setCurrentContext(r6);     // Catch: Throwable -> L9 Exception -> L14
        CherryAPIRegistry.INSTANCE.registerAll(r0, r1);     // Catch: Throwable -> L9 Exception -> L14
        r0.push(r6, Lua.Conversion.SEMI);     // Catch: Throwable -> L9 Exception -> L14
        r0.setGlobal(AbstractC0295Gu.m625r(-368491014125621L));     // Catch: Throwable -> L9 Exception -> L14
        mainLua = r0;     // Catch: Throwable -> L9 Exception -> L14
        initialized = true;     // Catch: Throwable -> L9 Exception -> L14
        AbstractC0295Gu.m625r(-368568323536949L);     // Catch: Throwable -> L9 Exception -> L14
        AbstractC0295Gu.m625r(-368611273209909L);     // Catch: Throwable -> L9 Exception -> L14
        monitor-exit(this);
        return;
    L14:
        e = move-exception;
        AbstractC0295Gu.m625r(-369311352879157L);     // Catch: Throwable -> L9
        AbstractC0295Gu.m625r(-369354302552117L);     // Catch: Throwable -> L9
        throw new RuntimeException(AbstractC0295Gu.m625r(-368937690724405L), e);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final boolean isInitialized() {
        return initialized;
    }

    public final void setGlobal(String r5, Object r6) {
        AbstractC0295Gu.m625r(-364853176825909L);
        checkInitialized();
        Lua r0 = mainLua;
        if (r0 == null) goto L6;
        LuaLocks.INSTANCE.withLock(r0, new C0525M8(r6, r0, r5, 3));
        return;
    }

    public final void setModuleApkPath(String r3) {
        AbstractC0295Gu.m625r(-352646879770677L);
        moduleApkPath = r3;
        AbstractC0295Gu.m625r(-352668354607157L);
        AbstractC0295Gu.m625r(-368654222882869L);
    }

    public final synchronized void shutdown() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (initialized == true) goto L8;
        monitor-exit(this);
        return;
    L8:
        if (hookApiEnabled == false) goto L12;
        HookAPI.INSTANCE.cleanup();     // Catch: Throwable -> L10
        hookApiEnabled = false;     // Catch: Throwable -> L10
    L12:
        CherryAPIRegistry.INSTANCE.cleanup();     // Catch: Throwable -> L10
        Collection<LuaContext> r0 = contexts.values();     // Catch: Throwable -> L10
        AbstractC0295Gu.m625r(-364896126498869L);     // Catch: Throwable -> L10
        Iterator<T> r02 = r0.iterator();     // Catch: Throwable -> L10
    L14:
        if (r02.hasNext() == false) goto L16;
        ((LuaContext) r02.next()).close();     // Catch: Throwable -> L10
        goto L14
    L16:
        contexts.clear();     // Catch: Throwable -> L10
        Lua r03 = mainLua;     // Catch: Throwable -> L10
        if (r03 == null) goto L19;
        r03.close();     // Catch: Throwable -> L10
    L19:
        mainLua = null;     // Catch: Throwable -> L10
        classLoaders.clear();     // Catch: Throwable -> L10
        initialized = false;     // Catch: Throwable -> L10
        AbstractC0295Gu.m625r(-364973435910197L);     // Catch: Throwable -> L10
        AbstractC0295Gu.m625r(-365016385583157L);     // Catch: Throwable -> L10
        monitor-exit(this);
    }
}
