package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryConfigAPI;
import io.github.cherrywechat.lua.api.CherryDevAPI;
import io.github.cherrywechat.lua.api.CherryFileAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2402q8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8420a;

    public /* synthetic */ C2402q8(int i) {
        this.f8420a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f8420a) {
            case 0:
                return CherryAPI.registerUtilApi$lambda$27(lua);
            case 1:
                return CherryAPI.registerUtilApi$lambda$28(lua);
            case 2:
                return CherryConfigAPI.register$lambda$1(lua);
            case 3:
                return CherryConfigAPI.register$lambda$8(lua);
            case 4:
                return CherryConfigAPI.register$lambda$10(lua);
            case 5:
                return CherryConfigAPI.register$lambda$12(lua);
            case 6:
                return CherryConfigAPI.register$lambda$14(lua);
            case 7:
                return CherryConfigAPI.register$lambda$16(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryConfigAPI.register$lambda$18(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryConfigAPI.register$lambda$20(lua);
            case 10:
                return CherryConfigAPI.register$lambda$22(lua);
            case 11:
                return CherryConfigAPI.register$lambda$2(lua);
            case 12:
                return CherryConfigAPI.register$lambda$3(lua);
            case 13:
                return CherryConfigAPI.register$lambda$4(lua);
            case 14:
                return CherryConfigAPI.register$lambda$5(lua);
            case 15:
                return CherryConfigAPI.register$lambda$6(lua);
            case 16:
                return CherryDevAPI.register$lambda$0(lua);
            case 17:
                return CherryDevAPI.register$lambda$1(lua);
            case 18:
                return CherryDevAPI.register$lambda$2(lua);
            case 19:
                return CherryDevAPI.register$lambda$3(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryDevAPI.register$lambda$4(lua);
            case 21:
                return CherryDevAPI.register$lambda$5(lua);
            case 22:
                return CherryFileAPI.register$lambda$0(lua);
            case 23:
                return CherryFileAPI.register$lambda$20(lua);
            case 24:
                return CherryFileAPI.register$lambda$1(lua);
            case 25:
                return CherryFileAPI.register$lambda$21(lua);
            case 26:
                return CherryFileAPI.register$lambda$23(lua);
            case 27:
                return CherryFileAPI.register$lambda$25(lua);
            case 28:
                return CherryFileAPI.register$lambda$29(lua);
            default:
                return CherryFileAPI.register$lambda$33(lua);
        }
    }
}
