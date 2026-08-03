package io.github.cherrywechat.lua.api;

import de.robv.android.xposed.XC_MethodHook;
import io.github.cherrywechat.lua.LuaLocks;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.C0829TC;
import p000.C1399f9;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
public final class HookAPI$doHook$callback$1 extends XC_MethodHook {
    final /* synthetic */ int $afterRef;
    final /* synthetic */ int $beforeRef;
    final /* synthetic */ boolean $hasAfterCallback;
    final /* synthetic */ boolean $hasBeforeCallback;
    final /* synthetic */ boolean $hasReplaceCallback;
    final /* synthetic */ boolean $isReplace;
    final /* synthetic */ Lua $lua;
    final /* synthetic */ int $replaceRef;

    public HookAPI$doHook$callback$1(boolean z, boolean z2, Lua lua, boolean z3, int i, int i2, boolean z4, int i3) {
        this.$isReplace = z;
        this.$hasReplaceCallback = z2;
        this.$lua = lua;
        this.$hasBeforeCallback = z3;
        this.$replaceRef = i;
        this.$beforeRef = i2;
        this.$hasAfterCallback = z4;
        this.$afterRef = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC afterHookedMethod$lambda$2(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            lua.refGet(i);
            HookAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
            lua.pCall(1, 0);
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-283480726435893L, -283527971076149L, e);
            lua.setTop(0);
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC beforeHookedMethod$lambda$0(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            lua.refGet(i);
            HookAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
            lua.pCall(1, 1);
            Object object = lua.toObject(-1);
            lua.pop(1);
            methodHookParam.setResult(object);
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-282626027943989L, -282673272584245L, e);
            lua.setTop(0);
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC beforeHookedMethod$lambda$1(Lua lua, int i, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            lua.refGet(i);
            HookAPI.INSTANCE.pushMethodParam(lua, methodHookParam);
            lua.pCall(1, 0);
        } catch (Exception e) {
            AbstractC0213Ey.m411i(-282780646766645L, -282827891406901L, e);
            lua.setTop(0);
        }
        return C0829TC.f2620a;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0295Gu.m625r(-282600258140213L);
        if (!this.$isReplace && this.$hasAfterCallback) {
            LuaLocks luaLocks = LuaLocks.INSTANCE;
            Lua lua = this.$lua;
            luaLocks.withLock(lua, new C1399f9(lua, this.$afterRef, methodHookParam, 6));
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0295Gu.m625r(-283124244150325L);
        if (this.$isReplace && this.$hasReplaceCallback) {
            LuaLocks luaLocks = LuaLocks.INSTANCE;
            Lua lua = this.$lua;
            luaLocks.withLock(lua, new C1399f9(lua, this.$replaceRef, methodHookParam, 4));
        } else if (this.$hasBeforeCallback) {
            LuaLocks luaLocks2 = LuaLocks.INSTANCE;
            Lua lua2 = this.$lua;
            luaLocks2.withLock(lua2, new C1399f9(lua2, this.$beforeRef, methodHookParam, 5));
        }
    }
}
