package io.github.cherrywechat.lua.loader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.github.cherrywechat.lua.LuaContext;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import p000.AbstractC0085Bz;
import p000.AbstractC0295Gu;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.AbstractC2607uz;
import p000.AbstractC2675wh;
import p000.C0297Gw;
import p000.C0340Hw;
import p000.C0511Lv;
import p000.C0554Mv;
import p000.C1389f;
import p000.C2720xj;
import p000.C2763yj;
import p000.C2770yq;
import p000.C2813zq;
import p000.InterfaceC1416fj;
import p000.RunnableC0562N2;
import p000.RunnableC0586Nk;
import p000.RunnableC2445r8;

/* JADX INFO: loaded from: classes.dex */
public final class ScriptManager {
    private static final String TAG = AbstractC0295Gu.m625r(-382088880584757L);
    public static final ScriptManager INSTANCE = new ScriptManager();
    private static final ConcurrentHashMap<String, LoadedScript> loadedScripts = new ConcurrentHashMap<>();
    private static final AtomicLong scriptIdCounter = new AtomicLong(0);
    private static final List<ScriptStateListener> stateListeners = new ArrayList();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private ScriptManager() {
    }

    public static /* synthetic */ void executeScript$default(ScriptManager scriptManager, String str, InterfaceC1416fj interfaceC1416fj, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC1416fj = null;
        }
        scriptManager.executeScript(str, interfaceC1416fj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeScript$lambda$5(LoadedScript loadedScript, String str, InterfaceC1416fj interfaceC1416fj) {
        LoadedScript loadedScript2;
        InterfaceC1416fj interfaceC1416fj2;
        Object objM5463executeIoAF18A;
        try {
            objM5463executeIoAF18A = loadedScript.getLuaContext().m5463executeIoAF18A(AbstractC2675wh.m5244g0(new File(loadedScript.getFilePath())));
            loadedScript2 = loadedScript;
            interfaceC1416fj2 = interfaceC1416fj;
        } catch (Exception e) {
            e = e;
            loadedScript2 = loadedScript;
            interfaceC1416fj2 = interfaceC1416fj;
        }
        try {
            mainHandler.post(new RunnableC0586Nk(objM5463executeIoAF18A, loadedScript2, str, interfaceC1416fj2, 1));
        } catch (Exception e2) {
            e = e2;
            mainHandler.post(new RunnableC2445r8(loadedScript2, e, interfaceC1416fj2, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeScript$lambda$5$lambda$3(Object obj, LoadedScript loadedScript, String str, InterfaceC1416fj interfaceC1416fj) {
        if (!(obj instanceof C0297Gw)) {
            loadedScript.setState(ScriptState.COMPLETED);
            loadedScript.setLastResult(obj != null ? obj.toString() : null);
            ScriptManager scriptManager = INSTANCE;
            scriptManager.notifyStateChanged(loadedScript);
            if (loadedScript.getAutoRelease()) {
                scriptManager.unloadScript(str);
            }
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(new C0340Hw(obj));
            }
        }
        Throwable thM726a = C0340Hw.m726a(obj);
        if (thM726a != null) {
            loadedScript.setState(ScriptState.ERROR);
            loadedScript.setLastError(thM726a.getMessage());
            INSTANCE.notifyStateChanged(loadedScript);
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(new C0340Hw(new C0297Gw(thM726a)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeScript$lambda$5$lambda$4(LoadedScript loadedScript, Exception exc, InterfaceC1416fj interfaceC1416fj) {
        loadedScript.setState(ScriptState.ERROR);
        loadedScript.setLastError(exc.getMessage());
        INSTANCE.notifyStateChanged(loadedScript);
        if (interfaceC1416fj != null) {
            interfaceC1416fj.mo90g(new C0340Hw(new C0297Gw(exc)));
        }
    }

    public static /* synthetic */ LoadedScript loadAndExecute$default(ScriptManager scriptManager, Context context, File file, boolean z, InterfaceC1416fj interfaceC1416fj, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            interfaceC1416fj = null;
        }
        return scriptManager.loadAndExecute(context, file, z, interfaceC1416fj);
    }

    public static /* synthetic */ LoadedScript loadScript$default(ScriptManager scriptManager, Context context, File file, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return scriptManager.loadScript(context, file, z);
    }

    private final void notifyStateChanged(LoadedScript loadedScript) {
        mainHandler.post(new RunnableC0562N2(23, loadedScript));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyStateChanged$lambda$10(LoadedScript loadedScript) {
        Iterator<T> it = stateListeners.iterator();
        while (it.hasNext()) {
            ((ScriptStateListener) it.next()).onScriptStateChanged(loadedScript);
        }
    }

    private final Map<String, String> parseScriptMetadata(String str) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM625r = AbstractC0295Gu.m625r(-381728103331893L);
        switch (2) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 8;
                break;
            case 3:
                i = 16;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 32;
                break;
            case 7:
                i = 128;
                break;
            default:
                throw null;
        }
        if ((i & 2) != 0) {
            i |= 64;
        }
        C0554Mv c0554Mv = new C0554Mv(Pattern.compile(strM625r, i));
        if (str.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + str.length());
        }
        C2720xj c2720xj = new C2720xj(new C2763yj(new C1389f(9, c0554Mv, str), C0511Lv.f1672i));
        while (c2720xj.hasNext()) {
            C2813zq c2813zq = (C2813zq) c2720xj.next();
            String lowerCase = ((String) ((C2770yq) c2813zq.m5446a()).get(1)).toLowerCase(Locale.ROOT);
            AbstractC0295Gu.m625r(-382368053458997L);
            linkedHashMap.put(lowerCase, AbstractC2564tz.m5070e0((String) ((C2770yq) c2813zq.m5446a()).get(2)).toString());
        }
        return linkedHashMap;
    }

    private final void registerLocalRequire(LuaContext luaContext, String str) {
        Object objM5463executeIoAF18A = luaContext.m5463executeIoAF18A(AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-374838975789109L) + str + AbstractC0295Gu.m625r(-374589867685941L)));
        if (objM5463executeIoAF18A instanceof C0297Gw) {
            AbstractC0295Gu.m625r(-382080290650165L);
            AbstractC0295Gu.m625r(-381590664378421L);
            Throwable thM726a = C0340Hw.m726a(objM5463executeIoAF18A);
            if (thM726a != null) {
                thM726a.getMessage();
            }
        }
    }

    public final void addStateListener(ScriptStateListener scriptStateListener) {
        AbstractC0295Gu.m625r(-374761666377781L);
        List<ScriptStateListener> list = stateListeners;
        if (list.contains(scriptStateListener)) {
            return;
        }
        list.add(scriptStateListener);
    }

    public final void cleanup() {
        unloadAll();
        stateListeners.clear();
        AbstractC0295Gu.m625r(-382441067903029L);
        AbstractC0295Gu.m625r(-382501197445173L);
    }

    public final void executeScript(String str, InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-375843998136373L);
        LoadedScript loadedScript = loadedScripts.get(str);
        if (loadedScript == null) {
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(new C0340Hw(new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-375882652842037L).concat(str)))));
            }
        } else if (loadedScript.getState() == ScriptState.UNLOADED) {
            if (interfaceC1416fj != null) {
                interfaceC1416fj.mo90g(new C0340Hw(new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-375964257220661L)))));
            }
        } else {
            loadedScript.setState(ScriptState.RUNNING);
            notifyStateChanged(loadedScript);
            new Thread(new RunnableC2445r8(loadedScript, str, interfaceC1416fj)).start();
        }
    }

    public final List<LoadedScript> getLoadedScripts() {
        Collection<LoadedScript> collectionValues = loadedScripts.values();
        AbstractC0295Gu.m625r(-374095946446901L);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((LoadedScript) obj).getState() != ScriptState.UNLOADED) {
                arrayList.add(obj);
            }
        }
        return AbstractC2453ra.m4908r0(arrayList);
    }

    public final LoadedScript getScript(String str) {
        AbstractC0295Gu.m625r(-374723011672117L);
        return loadedScripts.get(str);
    }

    public final LoadedScript loadAndExecute(Context context, File file, boolean z, InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-375517580621877L);
        AbstractC0295Gu.m625r(-375551940360245L);
        LoadedScript loadedScriptLoadScript = loadScript(context, file, z);
        if (loadedScriptLoadScript != null) {
            executeScript(loadedScriptLoadScript.getId(), interfaceC1416fj);
            return loadedScriptLoadScript;
        }
        AbstractC0295Gu.m625r(-375599185000501L);
        AbstractC0295Gu.m625r(-375659314542645L);
        file.getAbsolutePath();
        if (interfaceC1416fj == null) {
            return null;
        }
        interfaceC1416fj.mo90g(new C0340Hw(new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-374113126316085L) + file.getName()))));
        return null;
    }

    public final LoadedScript loadScript(Context context, File file, boolean z) {
        String strM625r;
        AbstractC0295Gu.m625r(-376887675189301L);
        AbstractC0295Gu.m625r(-376922034927669L);
        if (!file.exists() || !file.isFile()) {
            AbstractC0295Gu.m625r(-376969279567925L);
            AbstractC0295Gu.m625r(-377029409110069L);
            file.getAbsolutePath();
            return null;
        }
        String name = file.getName();
        AbstractC0295Gu.m625r(-377132488325173L);
        if (!AbstractC0085Bz.m132J(name, false, AbstractC0295Gu.m625r(-376638567086133L))) {
            AbstractC0295Gu.m625r(-376660041922613L);
            AbstractC0295Gu.m625r(-376720171464757L);
            file.getName();
            return null;
        }
        try {
            String str = AbstractC0295Gu.m625r(-376857610418229L) + scriptIdCounter.incrementAndGet();
            File parentFile = file.getParentFile();
            if (parentFile == null || (strM625r = parentFile.getAbsolutePath()) == null) {
                strM625r = AbstractC0295Gu.m625r(-375242702714933L);
            }
            String str2 = strM625r;
            String strM5240c0 = AbstractC2675wh.m5240c0(file);
            Map<String, String> scriptMetadata = parseScriptMetadata(AbstractC2675wh.m5244g0(file));
            LuaContext luaContextCreateContext = LuaEngine.INSTANCE.createContext(str, CherryGlobalAPI.INSTANCE.getCurrentActivity());
            registerLocalRequire(luaContextCreateContext, str2);
            String str3 = scriptMetadata.get(AbstractC0295Gu.m625r(-375246997682229L));
            String str4 = str3 == null ? strM5240c0 : str3;
            String strM625r2 = scriptMetadata.get(AbstractC0295Gu.m625r(-375268472518709L));
            if (strM625r2 == null) {
                strM625r2 = AbstractC0295Gu.m625r(-375298537289781L);
            }
            String str5 = strM625r2;
            String strM625r3 = scriptMetadata.get(AbstractC0295Gu.m625r(-375332897028149L));
            if (strM625r3 == null) {
                strM625r3 = AbstractC0295Gu.m625r(-375367256766517L);
            }
            String str6 = strM625r3;
            String strM625r4 = scriptMetadata.get(AbstractC0295Gu.m625r(-375393026570293L));
            if (strM625r4 == null) {
                strM625r4 = AbstractC0295Gu.m625r(-375444566177845L);
            }
            String absolutePath = file.getAbsolutePath();
            AbstractC0295Gu.m625r(-375448861145141L);
            LoadedScript loadedScript = new LoadedScript(str, str4, str5, str6, strM625r4, absolutePath, str2, luaContextCreateContext, z, ScriptState.LOADED, null, null, 0L, 7168, null);
            loadedScripts.put(str, loadedScript);
            notifyStateChanged(loadedScript);
            AbstractC0295Gu.m625r(-374989299644469L);
            AbstractC0295Gu.m625r(-375049429186613L);
            loadedScript.getName();
            AbstractC0295Gu.m625r(-375118148663349L);
            return loadedScript;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-375131033565237L);
            AbstractC0295Gu.m625r(-375191163107381L);
            file.getAbsolutePath();
            return null;
        }
    }

    public final void removeStateListener(ScriptStateListener scriptStateListener) {
        AbstractC0295Gu.m625r(-374800321083445L);
        stateListeners.remove(scriptStateListener);
    }

    public final void unloadAll() {
        Set<String> setKeySet = loadedScripts.keySet();
        AbstractC0295Gu.m625r(-374027226970165L);
        Iterator it = AbstractC2453ra.m4908r0(setKeySet).iterator();
        while (it.hasNext()) {
            INSTANCE.unloadScript((String) it.next());
        }
    }

    public final boolean unloadScript(String str) {
        AbstractC0295Gu.m625r(-374216205531189L);
        LoadedScript loadedScriptRemove = loadedScripts.remove(str);
        if (loadedScriptRemove == null) {
            return false;
        }
        try {
            loadedScriptRemove.setState(ScriptState.UNLOADED);
            LuaEngine.INSTANCE.destroyContext(str);
            notifyStateChanged(loadedScriptRemove);
            AbstractC0295Gu.m625r(-374254860236853L);
            AbstractC0295Gu.m625r(-374314989778997L);
            loadedScriptRemove.getName();
            AbstractC0295Gu.m625r(-373842543376437L);
            return true;
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-373855428278325L);
            AbstractC0295Gu.m625r(-373915557820469L);
            return false;
        }
    }
}
