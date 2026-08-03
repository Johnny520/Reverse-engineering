package p000;

import io.github.cherrywechat.lua.api.CherryFileAPI;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: u8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2574u8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8923a;

    public /* synthetic */ C2574u8(int i) {
        this.f8923a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f8923a) {
            case 0:
                return CherryFileAPI.register$lambda$34(lua);
            case 1:
                return CherryFileAPI.register$lambda$35(lua);
            case 2:
                return CherryFileAPI.register$lambda$36(lua);
            case 3:
                return CherryFileAPI.register$lambda$11(lua);
            case 4:
                return CherryFileAPI.register$lambda$3(lua);
            case 5:
                return CherryFileAPI.register$lambda$4(lua);
            case 6:
                return CherryFileAPI.register$lambda$5(lua);
            case 7:
                return CherryFileAPI.register$lambda$6(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryFileAPI.register$lambda$7(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryFileAPI.register$lambda$8(lua);
            case 10:
                return CherryFileAPI.register$lambda$9(lua);
            case 11:
                return CherryFileAPI.register$lambda$10(lua);
            case 12:
                return CherryFileAPI.register$lambda$12(lua);
            case 13:
                return CherryFileAPI.register$lambda$13(lua);
            case 14:
                return CherryFileAPI.register$lambda$14(lua);
            case 15:
                return CherryFileAPI.register$lambda$15(lua);
            case 16:
                return CherryFileAPI.register$lambda$16(lua);
            case 17:
                return CherryFileAPI.register$lambda$17(lua);
            case 18:
                return CherryFileAPI.register$lambda$18(lua);
            case 19:
                return CherryFileAPI.register$lambda$19(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryGlobalAPI.register$lambda$23(lua);
            case 21:
                return CherryGlobalAPI.register$lambda$27(lua);
            case 22:
                return CherryGlobalAPI.register$lambda$28(lua);
            case 23:
                return CherryGlobalAPI.register$lambda$29(lua);
            case 24:
                return CherryGlobalAPI.register$lambda$3(lua);
            case 25:
                return CherryGlobalAPI.register$lambda$4(lua);
            case 26:
                return CherryGlobalAPI.register$lambda$5(lua);
            case 27:
                return CherryGlobalAPI.register$lambda$6(lua);
            case 28:
                return CherryGlobalAPI.register$lambda$7(lua);
            default:
                return CherryGlobalAPI.register$lambda$8(lua);
        }
    }
}
