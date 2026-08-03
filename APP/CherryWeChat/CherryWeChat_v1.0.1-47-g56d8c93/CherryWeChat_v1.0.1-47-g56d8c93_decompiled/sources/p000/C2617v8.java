package p000;

import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2617v8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9073a;

    public /* synthetic */ C2617v8(int i) {
        this.f9073a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f9073a) {
            case 0:
                return CherryGlobalAPI.register$lambda$10(lua);
            case 1:
                return CherryGlobalAPI.register$lambda$15(lua);
            case 2:
                return CherryGlobalAPI.register$lambda$17(lua);
            case 3:
                return CherryGlobalAPI.register$lambda$1(lua);
            case 4:
                return CherryGlobalAPI.register$lambda$18(lua);
            case 5:
                return CherryGlobalAPI.register$lambda$19(lua);
            case 6:
                return CherryGlobalAPI.register$lambda$20(lua);
            case 7:
                return CherryMessageAPI.register$lambda$0(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryMessageAPI.register$lambda$10(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryMessageAPI.register$lambda$11(lua);
            case 10:
                return CherryMessageAPI.register$lambda$12(lua);
            case 11:
                return CherryMessageAPI.register$lambda$13(lua);
            case 12:
                return CherryMessageAPI.register$lambda$16(lua);
            case 13:
                return CherryMessageAPI.register$lambda$18(lua);
            case 14:
                return CherryMessageAPI.register$lambda$22(lua);
            case 15:
                return CherryMessageAPI.register$lambda$23(lua);
            case 16:
                return CherryMessageAPI.register$lambda$1(lua);
            case 17:
                return CherryMessageAPI.register$lambda$2(lua);
            case 18:
                return CherryMessageAPI.register$lambda$3(lua);
            case 19:
                return CherryMessageAPI.register$lambda$4(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryMessageAPI.register$lambda$5(lua);
            case 21:
                return CherryMessageAPI.register$lambda$6(lua);
            case 22:
                return CherryMessageAPI.register$lambda$7(lua);
            case 23:
                return CherryMessageAPI.register$lambda$8(lua);
            case 24:
                return CherryMessageAPI.register$lambda$9(lua);
            case 25:
                return CherryNetworkAPI.register$lambda$14(lua);
            case 26:
                return CherryNetworkAPI.register$lambda$20(lua);
            case 27:
                return CherryNetworkAPI.register$lambda$23(lua);
            case 28:
                return CherryNetworkAPI.register$lambda$25(lua);
            default:
                return CherryNetworkAPI.register$lambda$30(lua);
        }
    }
}
