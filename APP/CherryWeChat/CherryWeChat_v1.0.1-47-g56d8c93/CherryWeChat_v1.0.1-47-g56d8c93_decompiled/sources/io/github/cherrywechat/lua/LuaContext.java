package io.github.cherrywechat.lua;

import android.app.Activity;
import io.github.cherrywechat.lua.api.CherryAPIRegistry;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.bridge.JavaImporter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0621Oc;
import p000.C0247Fp;
import p000.C0297Gw;
import p000.C0340Hw;
import p000.C0525M8;
import p000.C0829TC;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class LuaContext implements Closeable {
    private Activity activity;
    private boolean closed;

    /* JADX INFO: renamed from: id */
    private final String f5550id;
    private final Lua lua;
    private final List<Object> refs;

    public LuaContext(String str, Lua lua, List<? extends ClassLoader> list, Activity activity) {
        AbstractC0295Gu.m625r(-352354821994549L);
        AbstractC0295Gu.m625r(-352367706896437L);
        AbstractC0295Gu.m625r(-352384886765621L);
        this.f5550id = str;
        this.lua = lua;
        this.activity = activity;
        this.refs = new ArrayList();
        lua.openLibraries();
        JavaImporter.INSTANCE.register(lua, list);
        Activity activity2 = this.activity;
        if (activity2 != null) {
            CherryGlobalAPI.INSTANCE.setCurrentActivity(activity2);
        }
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Activity activity3 = this.activity;
        cherryGlobalAPI.setCurrentContext(activity3 != null ? activity3.getApplicationContext() : null);
        CherryAPIRegistry.INSTANCE.registerAll(lua, list);
        Activity activity4 = this.activity;
        if (activity4 != null) {
            lua.push(activity4, Lua.Conversion.SEMI);
            lua.setGlobal(AbstractC0295Gu.m625r(-351890965526581L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0340Hw callFunction_gIAlu_s$lambda$6(LuaContext luaContext, String str, Object[] objArr) {
        String message;
        Object c0297Gw;
        try {
            luaContext.lua.getGlobal(str);
        } catch (Exception e) {
            try {
                message = luaContext.lua.toString(-1);
            } catch (Exception unused) {
                message = null;
            }
            luaContext.lua.setTop(0);
            if (message == null && (message = e.getMessage()) == null) {
                message = AbstractC0295Gu.m625r(-352556685457461L);
            }
            c0297Gw = new C0297Gw(new LuaException(message));
        }
        if (!luaContext.lua.isFunction(-1)) {
            luaContext.lua.pop(1);
            return new C0340Hw(new C0297Gw(new LuaException("'" + str + AbstractC0295Gu.m625r(-352470786111541L))));
        }
        for (Object obj : objArr) {
            if (obj != null) {
                luaContext.lua.push(obj, Lua.Conversion.SEMI);
            } else {
                luaContext.lua.pushNil();
            }
        }
        luaContext.lua.pCall(objArr.length, 1);
        c0297Gw = luaContext.lua.toObject(-1);
        luaContext.lua.pop(1);
        return new C0340Hw(c0297Gw);
    }

    private final void checkClosed() {
        if (this.closed) {
            throw new IllegalStateException(AbstractC0295Gu.m625r(-352814383495221L) + this.f5550id + AbstractC0295Gu.m625r(-352870218070069L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0340Hw executeFile_IoAF18A$lambda$2(LuaContext luaContext, String str) {
        Object c0297Gw;
        String message = null;
        try {
            luaContext.lua.load(str);
            luaContext.lua.pCall(0, -1);
            c0297Gw = luaContext.lua.getTop() > 0 ? luaContext.lua.toObject(-1) : null;
            luaContext.lua.setTop(0);
        } catch (Exception e) {
            try {
                message = luaContext.lua.toString(-1);
            } catch (Exception unused) {
            }
            luaContext.lua.setTop(0);
            if (message == null && (message = e.getMessage()) == null) {
                message = AbstractC0295Gu.m625r(-352921757677621L);
            }
            c0297Gw = new C0297Gw(new LuaException(message));
        }
        return new C0340Hw(c0297Gw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getGlobal$lambda$4(LuaContext luaContext, String str) {
        luaContext.lua.getGlobal(str);
        Object object = luaContext.lua.toObject(-1);
        luaContext.lua.pop(1);
        return object;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC setGlobal$lambda$3(Object obj, LuaContext luaContext, String str) {
        if (obj != null) {
            luaContext.lua.push(obj, Lua.Conversion.SEMI);
        } else {
            luaContext.lua.pushNil();
        }
        luaContext.lua.setGlobal(str);
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: callFunction-gIAlu-s, reason: not valid java name */
    public final Object m5462callFunctiongIAlus(String str, Object... objArr) {
        AbstractC0295Gu.m625r(-352015519578165L);
        AbstractC0295Gu.m625r(-352036994414645L);
        checkClosed();
        return ((C0340Hw) LuaLocks.INSTANCE.withLock(this.lua, new C0525M8(this, str, objArr))).f1148a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        try {
            CherryAPIRegistry.INSTANCE.cleanupFor(this.lua);
        } catch (Exception e) {
            AbstractC0295Gu.m625r(-352075649120309L);
            AbstractC0213Ey.m411i(-352672649574453L, -352797203626037L, e);
        }
        this.refs.clear();
        this.activity = null;
        this.lua.close();
    }

    /* JADX INFO: renamed from: execute-IoAF18A, reason: not valid java name */
    public final Object m5463executeIoAF18A(String str) {
        AbstractC0295Gu.m625r(-351929620232245L);
        checkClosed();
        return LuaEngine.INSTANCE.m5466executeInternalgIAlus$app_release(this.lua, str);
    }

    /* JADX INFO: renamed from: executeFile-IoAF18A, reason: not valid java name */
    public final Object m5464executeFileIoAF18A(String str) {
        AbstractC0295Gu.m625r(-351951095068725L);
        checkClosed();
        return ((C0340Hw) LuaLocks.INSTANCE.withLock(this.lua, new C0247Fp(this, str, 0))).f1148a;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Object getGlobal(String str) {
        AbstractC0295Gu.m625r(-351994044741685L);
        checkClosed();
        return LuaLocks.INSTANCE.withLock(this.lua, new C0247Fp(this, str, 1));
    }

    public final String getId() {
        return this.f5550id;
    }

    public final void hold(Object obj) {
        AbstractC0295Gu.m625r(-352058469251125L);
        this.refs.add(obj);
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
    }

    public final void setGlobal(String str, Object obj) {
        AbstractC0295Gu.m625r(-351972569905205L);
        checkClosed();
        LuaLocks.INSTANCE.withLock(this.lua, new C0525M8(obj, (AutoCloseable) this, str, 1));
    }

    public /* synthetic */ LuaContext(String str, Lua lua, List list, Activity activity, int i, AbstractC0621Oc abstractC0621Oc) {
        this(str, lua, list, (i & 8) != 0 ? null : activity);
    }
}
