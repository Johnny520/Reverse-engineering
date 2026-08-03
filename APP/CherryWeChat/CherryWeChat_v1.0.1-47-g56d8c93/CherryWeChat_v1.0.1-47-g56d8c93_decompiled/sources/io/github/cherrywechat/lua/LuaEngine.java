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
    private static boolean hookApiEnabled;
    private static volatile boolean initialized;
    private static Lua mainLua;
    private static volatile String moduleApkPath;
    private static final String TAG = AbstractC0295Gu.m625r(-363294103697461L);
    public static final LuaEngine INSTANCE = new LuaEngine();
    private static final ConcurrentHashMap<String, LuaContext> contexts = new ConcurrentHashMap<>();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final List<ClassLoader> classLoaders = new ArrayList();

    private LuaEngine() {
    }

    private final void checkInitialized() {
        if (!initialized) {
            throw new IllegalStateException(AbstractC0295Gu.m625r(-364548234147893L));
        }
    }

    public static /* synthetic */ LuaContext createContext$default(LuaEngine luaEngine, String str, Activity activity, int i, Object obj) {
        if ((i & 2) != 0) {
            activity = null;
        }
        return luaEngine.createContext(str, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0340Hw executeInternal_gIAlu_s$lambda$7(Lua lua, String str) {
        Object c0297Gw;
        String message = null;
        try {
            lua.run(str);
            c0297Gw = lua.getTop() > 0 ? lua.toObject(-1) : null;
            lua.setTop(0);
        } catch (Exception e) {
            try {
                message = lua.toString(-1);
            } catch (Exception unused) {
            }
            lua.setTop(0);
            AbstractC0295Gu.m625r(-364745802643509L);
            AbstractC0295Gu.m625r(-363139484874805L);
            if (message == null) {
                e.getMessage();
            }
            if (message == null && (message = e.getMessage()) == null) {
                message = AbstractC0295Gu.m625r(-363233974155317L);
            }
            c0297Gw = new C0297Gw(new LuaException(message));
        }
        return new C0340Hw(c0297Gw);
    }

    public static /* synthetic */ void executeOnUiThread$default(LuaEngine luaEngine, String str, InterfaceC1416fj interfaceC1416fj, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC1416fj = null;
        }
        luaEngine.executeOnUiThread(str, interfaceC1416fj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOnUiThread$lambda$6(String str, InterfaceC1416fj interfaceC1416fj) {
        Object objM5465executeIoAF18A = INSTANCE.m5465executeIoAF18A(str);
        if (interfaceC1416fj != null) {
            interfaceC1416fj.mo90g(new C0340Hw(objM5465executeIoAF18A));
        }
    }

    private final File extractNativeLibFromApk(Context context, String str, String str2) {
        try {
            String[] strArr = Build.SUPPORTED_ABIS;
            AbstractC0295Gu.m625r(-366953415833653L);
            String strM625r = strArr.length == 0 ? null : strArr[0];
            if (strM625r == null) {
                strM625r = AbstractC0295Gu.m625r(-365368572901429L);
            }
            String str3 = AbstractC0295Gu.m625r(-365411522574389L) + strM625r + '/' + str2;
            ZipFile zipFile = new ZipFile(str);
            ZipEntry entry = zipFile.getEntry(str3);
            if (entry == null) {
                AbstractC0295Gu.m625r(-365295558457397L);
                AbstractC0295Gu.m625r(-365888263944245L);
                zipFile.close();
                return null;
            }
            File file = new File(context.getCacheDir(), AbstractC0295Gu.m625r(-365432997410869L));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (file2.exists() && file2.length() == entry.getSize()) {
                AbstractC0295Gu.m625r(-365501716887605L);
                AbstractC0295Gu.m625r(-365544666560565L);
                file2.getAbsolutePath();
                zipFile.close();
                return file2;
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    AbstractC1293cr.m2555p(inputStream, fileOutputStream);
                    fileOutputStream.close();
                    inputStream.close();
                    file2.setExecutable(true, false);
                    file2.setReadable(true, false);
                    zipFile.close();
                    AbstractC0295Gu.m625r(-365123759765557L);
                    AbstractC0295Gu.m625r(-365166709438517L);
                    file2.getAbsolutePath();
                    return file2;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-365995638126645L, -366038587799605L, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getGlobal$lambda$11$lambda$10(Lua lua, String str) {
        lua.getGlobal(str);
        Object object = lua.toObject(-1);
        lua.pop(1);
        return object;
    }

    public static /* synthetic */ void init$default(LuaEngine luaEngine, Context context, ClassLoader classLoader, int i, Object obj) {
        if ((i & 2) != 0) {
            classLoader = null;
        }
        luaEngine.init(context, classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC setGlobal$lambda$9$lambda$8(Object obj, Lua lua, String str) {
        if (obj != null) {
            lua.push(obj, Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
        lua.setGlobal(str);
        return C0829TC.f2620a;
    }

    private final void tryLoadNativeLibrary(Context context) {
        CodeSource codeSource;
        URL location;
        String str;
        try {
            System.loadLibrary(AbstractC0295Gu.m625r(-369070834710581L));
            AbstractC0295Gu.m625r(-369100899481653L);
            AbstractC0295Gu.m625r(-369143849154613L);
        } catch (UnsatisfiedLinkError e) {
            AbstractC0295Gu.m625r(-367687855241269L);
            AbstractC0295Gu.m625r(-367730804914229L);
            e.getMessage();
            try {
                str = context.getApplicationInfo().nativeLibraryDir + AbstractC0295Gu.m625r(-367301308184629L);
            } catch (Exception e2) {
                AbstractC0213Ey.m411i(-368297740597301L, -367790934456373L, e2);
            }
            if (new File(str).exists()) {
                System.load(str);
                AbstractC0295Gu.m625r(-367361437726773L);
                AbstractC0295Gu.m625r(-367404387399733L);
                return;
            }
            AbstractC0295Gu.m625r(-368125941905461L);
            AbstractC0295Gu.m625r(-368168891578421L);
            try {
                String path = moduleApkPath;
                if (path == null) {
                    ProtectionDomain protectionDomain = LuaEngine.class.getProtectionDomain();
                    path = (protectionDomain == null || (codeSource = protectionDomain.getCodeSource()) == null || (location = codeSource.getLocation()) == null) ? null : location.getPath();
                }
                if (path != null && new File(path).exists()) {
                    AbstractC0295Gu.m625r(-367881128769589L);
                    AbstractC0295Gu.m625r(-367924078442549L);
                    File fileExtractNativeLibFromApk = extractNativeLibFromApk(context, path, AbstractC0295Gu.m625r(-368048632494133L));
                    if (fileExtractNativeLibFromApk != null && fileExtractNativeLibFromApk.exists()) {
                        System.load(fileExtractNativeLibFromApk.getAbsolutePath());
                        AbstractC0295Gu.m625r(-366455199627317L);
                        AbstractC0295Gu.m625r(-366498149300277L);
                        fileExtractNativeLibFromApk.getAbsolutePath();
                        return;
                    }
                }
            } catch (Exception e3) {
                AbstractC0213Ey.m411i(-366665653024821L, -366158846883893L, e3);
            }
            try {
                File fileExtractNativeLibFromApk2 = extractNativeLibFromApk(context, context.getApplicationInfo().sourceDir, AbstractC0295Gu.m625r(-366300580804661L));
                if (fileExtractNativeLibFromApk2 != null && fileExtractNativeLibFromApk2.exists()) {
                    System.load(fileExtractNativeLibFromApk2.getAbsolutePath());
                    AbstractC0295Gu.m625r(-366356415379509L);
                    AbstractC0295Gu.m625r(-366399365052469L);
                    fileExtractNativeLibFromApk2.getAbsolutePath();
                    return;
                }
            } catch (Exception e4) {
                AbstractC0213Ey.m411i(-367116624590901L, -367159574263861L, e4);
            }
            AbstractC0295Gu.m625r(-366747257403445L);
            AbstractC0295Gu.m625r(-366790207076405L);
        }
    }

    public final void addClassLoader(ClassLoader classLoader) {
        AbstractC0295Gu.m625r(-365639155841077L);
        List<ClassLoader> list = classLoaders;
        if (list.contains(classLoader)) {
            return;
        }
        list.add(classLoader);
        if (hookApiEnabled) {
            HookAPI.INSTANCE.addClassLoader(classLoader);
        }
        AbstractC0295Gu.m625r(-365690695448629L);
        AbstractC0295Gu.m625r(-365733645121589L);
        classLoader.toString();
    }

    public final LuaContext createContext(String str, Activity activity) {
        AbstractC0295Gu.m625r(-364427975063605L);
        checkInitialized();
        try {
            System.loadLibrary(AbstractC0295Gu.m625r(-364440859965493L));
        } catch (UnsatisfiedLinkError unused) {
        }
        LuaContext luaContext = new LuaContext(str, new LuaJit(), classLoaders, activity);
        contexts.put(str, luaContext);
        AbstractC0295Gu.m625r(-364470924736565L);
        AbstractC0295Gu.m625r(-363964118595637L);
        return luaContext;
    }

    public final void destroyContext(String str) {
        AbstractC0295Gu.m625r(-364067197810741L);
        LuaContext luaContextRemove = contexts.remove(str);
        if (luaContextRemove != null) {
            luaContextRemove.close();
        }
        AbstractC0295Gu.m625r(-364080082712629L);
        AbstractC0295Gu.m625r(-364123032385589L);
    }

    public final void enableHookAPI() {
        checkInitialized();
        if (hookApiEnabled) {
            AbstractC0295Gu.m625r(-365819544467509L);
            AbstractC0295Gu.m625r(-365862494140469L);
            return;
        }
        Lua lua = mainLua;
        if (lua != null) {
            HookAPI hookAPI = HookAPI.INSTANCE;
            hookAPI.setClassLoaders(classLoaders);
            hookAPI.register(lua);
            hookApiEnabled = true;
            AbstractC0295Gu.m625r(-364316305913909L);
            AbstractC0295Gu.m625r(-364359255586869L);
        }
    }

    /* JADX INFO: renamed from: execute-IoAF18A, reason: not valid java name */
    public final Object m5465executeIoAF18A(String str) {
        AbstractC0295Gu.m625r(-364771572447285L);
        checkInitialized();
        return m5466executeInternalgIAlus$app_release(mainLua, str);
    }

    /* JADX INFO: renamed from: executeInternal-gIAlu-s$app_release, reason: not valid java name */
    public final Object m5466executeInternalgIAlus$app_release(Lua lua, String str) {
        AbstractC0295Gu.m625r(-364814522120245L);
        AbstractC0295Gu.m625r(-364831701989429L);
        return ((C0340Hw) LuaLocks.INSTANCE.withLock(lua, new C0290Gp(lua, str, 1))).f1148a;
    }

    public final void executeOnUiThread(String str, InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-364793047283765L);
        if (!AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper())) {
            mainHandler.post(new RunnableC2260n3(10, str, interfaceC1416fj));
            return;
        }
        Object objM5465executeIoAF18A = m5465executeIoAF18A(str);
        if (interfaceC1416fj != null) {
            interfaceC1416fj.mo90g(new C0340Hw(objM5465executeIoAF18A));
        }
    }

    public final List<ClassLoader> getClassLoaders() {
        return AbstractC2453ra.m4908r0(classLoaders);
    }

    public final LuaContext getContext(String str) {
        AbstractC0295Gu.m625r(-364054312908853L);
        return contexts.get(str);
    }

    public final Object getGlobal(String str) {
        AbstractC0295Gu.m625r(-364874651662389L);
        checkInitialized();
        Lua lua = mainLua;
        if (lua != null) {
            return LuaLocks.INSTANCE.withLock(lua, new C0290Gp(lua, str, 0));
        }
        return null;
    }

    public final synchronized void init(Context context, ClassLoader classLoader) {
        AbstractC0295Gu.m625r(-368748712163381L);
        if (initialized) {
            AbstractC0295Gu.m625r(-368783071901749L);
            AbstractC0295Gu.m625r(-368826021574709L);
            return;
        }
        try {
            tryLoadNativeLibrary(context);
            LuaJit luaJit = new LuaJit();
            luaJit.openLibraries();
            List<ClassLoader> list = classLoaders;
            ClassLoader classLoader2 = context.getClassLoader();
            AbstractC0295Gu.m625r(-368405114779701L);
            list.add(classLoader2);
            if (classLoader != null) {
                list.add(classLoader);
            }
            list.add(LuaEngine.class.getClassLoader());
            JavaImporter.INSTANCE.register(luaJit, list);
            CherryGlobalAPI.INSTANCE.setCurrentContext(context);
            CherryAPIRegistry.INSTANCE.registerAll(luaJit, list);
            luaJit.push(context, Lua.Conversion.SEMI);
            luaJit.setGlobal(AbstractC0295Gu.m625r(-368491014125621L));
            mainLua = luaJit;
            initialized = true;
            AbstractC0295Gu.m625r(-368568323536949L);
            AbstractC0295Gu.m625r(-368611273209909L);
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-369311352879157L);
            AbstractC0295Gu.m625r(-369354302552117L);
            throw new RuntimeException(AbstractC0295Gu.m625r(-368937690724405L), e);
        }
    }

    public final boolean isInitialized() {
        return initialized;
    }

    public final void setGlobal(String str, Object obj) {
        AbstractC0295Gu.m625r(-364853176825909L);
        checkInitialized();
        Lua lua = mainLua;
        if (lua != null) {
            LuaLocks.INSTANCE.withLock(lua, new C0525M8(obj, (AutoCloseable) lua, str, 3));
        }
    }

    public final void setModuleApkPath(String str) {
        AbstractC0295Gu.m625r(-352646879770677L);
        moduleApkPath = str;
        AbstractC0295Gu.m625r(-352668354607157L);
        AbstractC0295Gu.m625r(-368654222882869L);
    }

    public final synchronized void shutdown() {
        try {
            if (initialized) {
                if (hookApiEnabled) {
                    HookAPI.INSTANCE.cleanup();
                    hookApiEnabled = false;
                }
                CherryAPIRegistry.INSTANCE.cleanup();
                Collection<LuaContext> collectionValues = contexts.values();
                AbstractC0295Gu.m625r(-364896126498869L);
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    ((LuaContext) it.next()).close();
                }
                contexts.clear();
                Lua lua = mainLua;
                if (lua != null) {
                    lua.close();
                }
                mainLua = null;
                classLoaders.clear();
                initialized = false;
                AbstractC0295Gu.m625r(-364973435910197L);
                AbstractC0295Gu.m625r(-365016385583157L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
