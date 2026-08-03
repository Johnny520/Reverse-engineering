package p000;

import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
import io.github.cherrywechat.lua.api.CherryUtilAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2789z8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9457a;

    public /* synthetic */ C2789z8(int i) {
        this.f9457a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f9457a) {
            case 0:
                return CherryNetworkAPI.register$lambda$31(lua);
            case 1:
                return CherryNetworkAPI.register$lambda$0(lua);
            case 2:
                return CherryNetworkAPI.register$lambda$32(lua);
            case 3:
                return CherryNetworkAPI.register$lambda$33(lua);
            case 4:
                return CherryNetworkAPI.register$lambda$6(lua);
            case 5:
                return CherryNetworkAPI.register$lambda$7(lua);
            case 6:
                return CherryNetworkAPI.register$lambda$13(lua);
            case 7:
                return CherryThreadAPI.register$lambda$2(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryThreadAPI.register$lambda$33(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryThreadAPI.register$lambda$34(lua);
            case 10:
                return CherryThreadAPI.register$lambda$35(lua);
            case 11:
                return CherryThreadAPI.register$lambda$37(lua);
            case 12:
                return CherryThreadAPI.register$lambda$6(lua);
            case 13:
                return CherryThreadAPI.register$lambda$15(lua);
            case 14:
                return CherryThreadAPI.register$lambda$19(lua);
            case 15:
                return CherryThreadAPI.register$lambda$23(lua);
            case 16:
                return CherryThreadAPI.register$lambda$26(lua);
            case 17:
                return CherryThreadAPI.register$lambda$31(lua);
            case 18:
                return CherryThreadAPI.register$lambda$32(lua);
            case 19:
                return CherryUtilAPI.register$lambda$0(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryUtilAPI.register$lambda$25(lua);
            case 21:
                return CherryUtilAPI.register$lambda$1(lua);
            case 22:
                return CherryUtilAPI.register$lambda$26(lua);
            case 23:
                return CherryUtilAPI.register$lambda$27(lua);
            case 24:
                return CherryUtilAPI.register$lambda$28(lua);
            case 25:
                return CherryUtilAPI.register$lambda$29(lua);
            case 26:
                return CherryUtilAPI.register$lambda$30(lua);
            case 27:
                return CherryUtilAPI.register$lambda$31(lua);
            case 28:
                return CherryUtilAPI.register$lambda$32(lua);
            default:
                return CherryUtilAPI.register$lambda$33(lua);
        }
    }
}
