package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: k8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2131k8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7475a;

    public /* synthetic */ C2131k8(int i) {
        this.f7475a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f7475a) {
            case 0:
                return CherryAPI.registerUtilApi$lambda$29(lua);
            case 1:
                return CherryAPI.registerUtilApi$lambda$30(lua);
            case 2:
                return CherryAPI.registerUtilApi$lambda$31(lua);
            case 3:
                return CherryAPI.registerFileApi$lambda$46(lua);
            case 4:
                return CherryAPI.registerFileApi$lambda$47(lua);
            case 5:
                return CherryAPI.registerFileApi$lambda$48(lua);
            case 6:
                return CherryAPI.registerFileApi$lambda$49(lua);
            case 7:
                return CherryAPI.registerFileApi$lambda$50(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryAPI.registerFileApi$lambda$52(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryAPI.registerFileApi$lambda$53(lua);
            case 10:
                return CherryAPI.registerLogApi$lambda$0(lua);
            case 11:
                return CherryAPI.registerThreadApi$lambda$38(lua);
            case 12:
                return CherryAPI.registerThreadApi$lambda$42(lua);
            case 13:
                return CherryAPI.registerThreadApi$lambda$45(lua);
            case 14:
                return CherryAPI.registerUiApi$lambda$8(lua);
            case 15:
                return CherryAPI.registerUiApi$lambda$12(lua);
            case 16:
                return CherryAPI.registerUiApi$lambda$20(lua);
            case 17:
                return CherryAPI.registerUiApi$lambda$21(lua);
            case 18:
                return CherryAPI.registerUiApi$lambda$22(lua);
            case 19:
                return CherryAPI.registerGlobalFunctions$lambda$55(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryAPI.registerGlobalFunctions$lambda$57(lua);
            case 21:
                return CherryAPI.registerGlobalFunctions$lambda$60(lua);
            case 22:
                return CherryAPI.registerUtilApi$lambda$23(lua);
            case 23:
                return CherryAPI.registerConfigApi$lambda$32(lua);
            case 24:
                return CherryAPI.registerConfigApi$lambda$33(lua);
            case 25:
                return CherryAPI.registerConfigApi$lambda$34(lua);
            case 26:
                return CherryAPI.registerConfigApi$lambda$35(lua);
            case 27:
                return CherryAPI.registerUtilApi$lambda$24(lua);
            case 28:
                return CherryAPI.registerUtilApi$lambda$25(lua);
            default:
                return CherryAPI.registerUtilApi$lambda$26(lua);
        }
    }
}
