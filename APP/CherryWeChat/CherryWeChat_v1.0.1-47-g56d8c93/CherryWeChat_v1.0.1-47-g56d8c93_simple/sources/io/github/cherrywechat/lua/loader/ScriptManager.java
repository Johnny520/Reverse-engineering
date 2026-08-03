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
    public static final ScriptManager INSTANCE = null;
    private static final String TAG = null;
    private static final ConcurrentHashMap<String, LoadedScript> loadedScripts = null;
    private static final Handler mainHandler = null;
    private static final AtomicLong scriptIdCounter = null;
    private static final List<ScriptStateListener> stateListeners = null;

    static {
        TAG = AbstractC0295Gu.m625r(-382088880584757L);
        INSTANCE = new ScriptManager();
        loadedScripts = new ConcurrentHashMap();
        scriptIdCounter = new AtomicLong(0);
        stateListeners = new ArrayList();
        mainHandler = new Handler(Looper.getMainLooper());
    }

    private ScriptManager() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3532a(LoadedScript r0) {
        notifyStateChanged$lambda$10(r0);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3533b(LoadedScript r0, String r1, InterfaceC1416fj r2) {
        executeScript$lambda$5(r0, r1, r2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3534c(LoadedScript r0, Exception r1, InterfaceC1416fj r2) {
        executeScript$lambda$5$lambda$4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3535d(Object r0, LoadedScript r1, String r2, InterfaceC1416fj r3) {
        executeScript$lambda$5$lambda$3(r0, r1, r2, r3);
    }

    public static /* synthetic */ void executeScript$default(ScriptManager r0, String r1, InterfaceC1416fj r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        r0.executeScript(r1, r2);
    }

    private static final void executeScript$lambda$5(LoadedScript r8, String r9, InterfaceC1416fj r10) {
        String r0 = AbstractC2675wh.m5244g0(new File(r8.getFilePath()));     // Catch: Exception -> L8
        Object r3 = r8.getLuaContext().m5463executeIoAF18A(r0);     // Catch: Exception -> L8
        Handler r02 = mainHandler;     // Catch: Exception -> L8
        LoadedScript r4 = r8;
        InterfaceC1416fj r6 = r10;
        r02.post(new RunnableC0586Nk(r3, r4, r9, r6, 1));     // Catch: Exception -> L6
        return;
    L6:
        e = e;
    L7:
        Exception r82 = e;
        mainHandler.post(new RunnableC2445r8(r4, r82, r6, 4));
        return;
    L8:
        e = e;
        r4 = r8;
        r6 = r10;
        goto L7
    }

    private static final void executeScript$lambda$5$lambda$3(Object r2, LoadedScript r3, String r4, InterfaceC1416fj r5) {
        if ((r2 instanceof C0297Gw) == true) goto L13;
        r3.setState(ScriptState.COMPLETED);
        if (r2 == null) goto L7;
        String r0 = r2.toString();
    L8:
        r3.setLastResult(r0);
        ScriptManager r02 = INSTANCE;
        r02.notifyStateChanged(r3);
        if (r3.getAutoRelease() == false) goto L11;
        r02.unloadScript(r4);
    L11:
        if (r5 == null) goto L13;
        r5.mo90g(new C0340Hw(r2));
        goto L13
    L7:
        r0 = null;
    L13:
        Throwable r22 = C0340Hw.m726a(r2);
        if (r22 == null) goto L19;
        r3.setState(ScriptState.ERROR);
        r3.setLastError(r22.getMessage());
        INSTANCE.notifyStateChanged(r3);
        if (r5 == null) goto L20;
        r5.mo90g(new C0340Hw(new C0297Gw(r22)));
        return;
    L20:
        return;
    }

    private static final void executeScript$lambda$5$lambda$4(LoadedScript r1, Exception r2, InterfaceC1416fj r3) {
        r1.setState(ScriptState.ERROR);
        r1.setLastError(r2.getMessage());
        INSTANCE.notifyStateChanged(r1);
        if (r3 == null) goto L6;
        r3.mo90g(new C0340Hw(new C0297Gw(r2)));
        return;
    }

    public static /* synthetic */ LoadedScript loadAndExecute$default(ScriptManager r0, Context r1, File r2, boolean r3, InterfaceC1416fj r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = true;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = null;
    L9:
        return r0.loadAndExecute(r1, r2, r3, r4);
    }

    public static /* synthetic */ LoadedScript loadScript$default(ScriptManager r0, Context r1, File r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return r0.loadScript(r1, r2, r3);
    }

    private final void notifyStateChanged(LoadedScript r4) {
        mainHandler.post(new RunnableC0562N2(23, r4));
    }

    private static final void notifyStateChanged$lambda$10(LoadedScript r2) {
        Iterator<T> r0 = stateListeners.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((ScriptStateListener) r0.next()).onScriptStateChanged(r2);
        goto L4
    }

    private final Map<String, String> parseScriptMetadata(String r7) {
        LinkedHashMap r0 = new LinkedHashMap();
        String r2 = AbstractC0295Gu.m625r(-381728103331893L);
        switch(2) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            case 4: goto L9;
            case 5: goto L8;
            case 6: goto L7;
            case 7: goto L6;
            default: goto L5;
        };
    L6:
        int r4 = 128;
    L14:
        if ((r4 & 2) == 0) goto L16;
        r4 = r4 | 64;
    L16:
        C0554Mv r1 = new C0554Mv(Pattern.compile(r2, r4));
        if (r7.length() < 0) goto L24;
        C2720xj r72 = new C2720xj(new C2763yj(new C1389f(9, r1, r7), C0511Lv.f1672i));
    L20:
        if (r72.hasNext() == false) goto L22;
        C2813zq r12 = (C2813zq) r72.next();
        String r22 = ((String) ((C2770yq) r12.m5446a()).get(1)).toLowerCase(Locale.ROOT);
        AbstractC0295Gu.m625r(-382368053458997L);
        r0.put(r22, AbstractC2564tz.m5070e0((String) ((C2770yq) r12.m5446a()).get(2)).toString());
        goto L20
    L22:
        return r0;
    L24:
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + r7.length());
    L7:
        r4 = 32;
        goto L14
    L8:
        r4 = 4;
        goto L14
    L9:
        r4 = 1;
        goto L14
    L10:
        r4 = 16;
        goto L14
    L11:
        r4 = 8;
        goto L14
    L12:
        r4 = 2;
        goto L14
    L5:
        throw null;
    }

    private final void registerLocalRequire(LuaContext r4, String r5) {
        Object r42 = r4.m5463executeIoAF18A(AbstractC2607uz.m5118D(AbstractC0295Gu.m625r(-374838975789109L) + r5 + AbstractC0295Gu.m625r(-374589867685941L)));
        if ((r42 instanceof C0297Gw) == false) goto L8;
        AbstractC0295Gu.m625r(-382080290650165L);
        AbstractC0295Gu.m625r(-381590664378421L);
        Throwable r43 = C0340Hw.m726a(r42);
        if (r43 == null) goto L9;
        r43.getMessage();
        return;
    L9:
        return;
    }

    public final void addStateListener(ScriptStateListener r3) {
        AbstractC0295Gu.m625r(-374761666377781L);
        List<ScriptStateListener> r0 = stateListeners;
        if (r0.contains(r3) == true) goto L6;
        r0.add(r3);
        return;
    }

    public final void cleanup() {
        unloadAll();
        stateListeners.clear();
        AbstractC0295Gu.m625r(-382441067903029L);
        AbstractC0295Gu.m625r(-382501197445173L);
    }

    public final void executeScript(String r4, InterfaceC1416fj r5) {
        AbstractC0295Gu.m625r(-375843998136373L);
        LoadedScript r0 = loadedScripts.get(r4);
        if (r0 != null) goto L8;
        if (r5 == null) goto L14;
        r5.mo90g(new C0340Hw(new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-375882652842037L).concat(r4)))));
        return;
    L14:
        return;
    L8:
        if (r0.getState() != ScriptState.UNLOADED) goto L12;
        if (r5 == null) goto L15;
        r5.mo90g(new C0340Hw(new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-375964257220661L)))));
        return;
    L15:
        return;
    L12:
        r0.setState(ScriptState.RUNNING);
        notifyStateChanged(r0);
        new Thread(new RunnableC2445r8(r0, r4, r5)).start();
    }

    public final List<LoadedScript> getLoadedScripts() {
        Collection<LoadedScript> r0 = loadedScripts.values();
        AbstractC0295Gu.m625r(-374095946446901L);
        ArrayList r1 = new ArrayList();
        Iterator<T> r02 = r0.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        Object r2 = r02.next();
        if (((LoadedScript) r2).getState() == ScriptState.UNLOADED) goto L4;
        r1.add(r2);
        goto L4
    L9:
        return AbstractC2453ra.m4908r0(r1);
    }

    public final LoadedScript getScript(String r3) {
        AbstractC0295Gu.m625r(-374723011672117L);
        return loadedScripts.get(r3);
    }

    public final LoadedScript loadAndExecute(Context r3, File r4, boolean r5, InterfaceC1416fj r6) {
        AbstractC0295Gu.m625r(-375517580621877L);
        AbstractC0295Gu.m625r(-375551940360245L);
        LoadedScript r32 = loadScript(r3, r4, r5);
        if (r32 != null) goto L9;
        AbstractC0295Gu.m625r(-375599185000501L);
        AbstractC0295Gu.m625r(-375659314542645L);
        r4.getAbsolutePath();
        if (r6 == null) goto L11;
        r6.mo90g(new C0340Hw(new C0297Gw(new IllegalStateException(AbstractC0295Gu.m625r(-374113126316085L) + r4.getName()))));
        return null;
    L11:
        return null;
    L9:
        executeScript(r32.getId(), r6);
        return r32;
    }

    public final LoadedScript loadScript(Context r23, File r24, boolean r25) {
        AbstractC0295Gu.m625r(-376887675189301L);
        AbstractC0295Gu.m625r(-376922034927669L);
        if (r24.exists() == true) goto L5;
    L35:
        AbstractC0295Gu.m625r(-376969279567925L);
        AbstractC0295Gu.m625r(-377029409110069L);
        r24.getAbsolutePath();
        return null;
    L5:
        if (r24.isFile() == false) goto L35;
        String r1 = r24.getName();
        AbstractC0295Gu.m625r(-377132488325173L);
        if (AbstractC0085Bz.m132J(r1, false, AbstractC0295Gu.m625r(-376638567086133L)) == true) goto L37;
        AbstractC0295Gu.m625r(-376660041922613L);
        AbstractC0295Gu.m625r(-376720171464757L);
        r24.getName();
        return null;
    L37:
        String r6 = AbstractC0295Gu.m625r(-376857610418229L) + scriptIdCounter.incrementAndGet();     // Catch: Exception -> L33
        File r12 = r24.getParentFile();     // Catch: Exception -> L33
        if (r12 == null) goto L17;
        String r13 = r12.getAbsolutePath();     // Catch: Exception -> L33
        if (r13 == null) goto L17;
    L16:
        String r122 = r13;
        String r14 = AbstractC2675wh.m5240c0(r24);     // Catch: Exception -> L33
        Map<String, String> r3 = parseScriptMetadata(AbstractC2675wh.m5244g0(r24));     // Catch: Exception -> L33
        LuaContext r132 = LuaEngine.INSTANCE.createContext(r6, CherryGlobalAPI.INSTANCE.getCurrentActivity());     // Catch: Exception -> L33
        registerLocalRequire(r132, r122);     // Catch: Exception -> L33
        String r4 = r3.get(AbstractC0295Gu.m625r(-375246997682229L));     // Catch: Exception -> L33
        if (r4 != null) goto L21;
        String r7 = r14;
    L22:
        String r15 = r3.get(AbstractC0295Gu.m625r(-375268472518709L));     // Catch: Exception -> L33
        if (r15 != null) goto L25;
        r15 = AbstractC0295Gu.m625r(-375298537289781L);     // Catch: Exception -> L33
    L25:
        String r8 = r15;
        String r16 = r3.get(AbstractC0295Gu.m625r(-375332897028149L));     // Catch: Exception -> L33
        if (r16 != null) goto L28;
        r16 = AbstractC0295Gu.m625r(-375367256766517L);     // Catch: Exception -> L33
    L28:
        String r9 = r16;
        String r17 = r3.get(AbstractC0295Gu.m625r(-375393026570293L));     // Catch: Exception -> L33
        if (r17 != null) goto L31;
        r17 = AbstractC0295Gu.m625r(-375444566177845L);     // Catch: Exception -> L33
    L31:
        String r11 = r24.getAbsolutePath();     // Catch: Exception -> L33
        AbstractC0295Gu.m625r(-375448861145141L);     // Catch: Exception -> L33
        LoadedScript r5 = new LoadedScript(r6, r7, r8, r9, r17, r11, r122, r132, r25, ScriptState.LOADED, null, null, 0, 7168, null);     // Catch: Exception -> L33
        loadedScripts.put(r6, r5);     // Catch: Exception -> L33
        notifyStateChanged(r5);     // Catch: Exception -> L33
        AbstractC0295Gu.m625r(-374989299644469L);     // Catch: Exception -> L33
        AbstractC0295Gu.m625r(-375049429186613L);     // Catch: Exception -> L33
        r5.getName();     // Catch: Exception -> L33
        AbstractC0295Gu.m625r(-375118148663349L);     // Catch: Exception -> L33
        return r5;
    L21:
        r7 = r4;
    L17:
        r13 = AbstractC0295Gu.m625r(-375242702714933L);     // Catch: Exception -> L33
    L33:
        AbstractC0295Gu.m625r(-375131033565237L);
        AbstractC0295Gu.m625r(-375191163107381L);
        r24.getAbsolutePath();
        return null;
    }

    public final void removeStateListener(ScriptStateListener r3) {
        AbstractC0295Gu.m625r(-374800321083445L);
        stateListeners.remove(r3);
    }

    public final void unloadAll() {
        Set<String> r0 = loadedScripts.keySet();
        AbstractC0295Gu.m625r(-374027226970165L);
        Iterator r02 = AbstractC2453ra.m4908r0(r0).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        String r1 = (String) r02.next();
        INSTANCE.unloadScript(r1);
        goto L4
    }

    public final boolean unloadScript(String r5) {
        AbstractC0295Gu.m625r(-374216205531189L);
        LoadedScript r0 = loadedScripts.remove(r5);
        if (r0 != null) goto L10;
        return false;
    L10:
        r0.setState(ScriptState.UNLOADED);     // Catch: Exception -> L8
        LuaEngine.INSTANCE.destroyContext(r5);     // Catch: Exception -> L8
        notifyStateChanged(r0);     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-374254860236853L);     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-374314989778997L);     // Catch: Exception -> L8
        r0.getName();     // Catch: Exception -> L8
        AbstractC0295Gu.m625r(-373842543376437L);     // Catch: Exception -> L8
        return true;
    L8:
        AbstractC0295Gu.m625r(-373855428278325L);
        AbstractC0295Gu.m625r(-373915557820469L);
        return false;
    }
}
