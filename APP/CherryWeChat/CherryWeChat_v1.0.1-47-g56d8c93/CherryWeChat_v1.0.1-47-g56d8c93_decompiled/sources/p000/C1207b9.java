package p000;

import io.github.cherrywechat.lua.api.CherryWeChatAPI;
import io.github.cherrywechat.lua.api.CherryXposedAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1207b9 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4137a;

    public /* synthetic */ C1207b9(int i) {
        this.f4137a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f4137a) {
            case 0:
                return CherryWeChatAPI.register$lambda$7(lua);
            case 1:
                return CherryWeChatAPI.register$lambda$8(lua);
            case 2:
                return CherryWeChatAPI.register$lambda$9(lua);
            case 3:
                return CherryWeChatAPI.register$lambda$10(lua);
            case 4:
                return CherryWeChatAPI.register$lambda$11(lua);
            case 5:
                return CherryWeChatAPI.register$lambda$12(lua);
            case 6:
                return CherryWeChatAPI.register$lambda$16(lua);
            case 7:
                return CherryWeChatAPI.register$lambda$20(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryWeChatAPI.register$lambda$23(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryWeChatAPI.register$lambda$24(lua);
            case 10:
                return CherryWeChatAPI.register$lambda$25(lua);
            case 11:
                return CherryWeChatAPI.register$lambda$26(lua);
            case 12:
                return CherryWeChatAPI.register$lambda$28(lua);
            case 13:
                return CherryWeChatAPI.register$lambda$29(lua);
            case 14:
                return CherryWeChatAPI.register$lambda$30(lua);
            case 15:
                return CherryXposedAPI.registerConstructorAPI$lambda$43(lua);
            case 16:
                return CherryXposedAPI.registerReflectionAPI$lambda$55(lua);
            case 17:
                return CherryXposedAPI.registerReflectionAPI$lambda$56(lua);
            case 18:
                return CherryXposedAPI.registerReflectionAPI$lambda$57(lua);
            case 19:
                return CherryXposedAPI.registerReflectionAPI$lambda$58(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryXposedAPI.registerHookManagementAPI$lambda$59(lua);
            case 21:
                return CherryXposedAPI.registerHookManagementAPI$lambda$61(lua);
            case 22:
                return CherryXposedAPI.registerHookManagementAPI$lambda$63(lua);
            case 23:
                return CherryXposedAPI.registerHookManagementAPI$lambda$64(lua);
            case 24:
                return CherryXposedAPI.registerMethodAPI$lambda$22(lua);
            case 25:
                return CherryXposedAPI.registerMethodAPI$lambda$23(lua);
            case 26:
                return CherryXposedAPI.registerConstructorAPI$lambda$44(lua);
            case 27:
                return CherryXposedAPI.registerMethodAPI$lambda$24(lua);
            case 28:
                return CherryXposedAPI.registerMethodAPI$lambda$26(lua);
            default:
                return CherryXposedAPI.registerMethodAPI$lambda$27(lua);
        }
    }
}
