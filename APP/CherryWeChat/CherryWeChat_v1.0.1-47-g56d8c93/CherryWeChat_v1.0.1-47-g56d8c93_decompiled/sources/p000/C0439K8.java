package p000;

import io.github.cherrywechat.lua.api.CherryUtilAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: K8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0439K8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1439a;

    public /* synthetic */ C0439K8(int i) {
        this.f1439a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f1439a) {
            case 0:
                return CherryUtilAPI.register$lambda$11(lua);
            case 1:
                return CherryUtilAPI.register$lambda$34(lua);
            case 2:
                return CherryUtilAPI.register$lambda$2(lua);
            case 3:
                return CherryUtilAPI.register$lambda$3(lua);
            case 4:
                return CherryUtilAPI.register$lambda$4(lua);
            case 5:
                return CherryUtilAPI.register$lambda$5(lua);
            case 6:
                return CherryUtilAPI.register$lambda$6(lua);
            case 7:
                return CherryUtilAPI.register$lambda$7(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryUtilAPI.register$lambda$9(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryUtilAPI.register$lambda$10(lua);
            case 10:
                return CherryUtilAPI.register$lambda$13(lua);
            case 11:
                return CherryUtilAPI.register$lambda$15(lua);
            case 12:
                return CherryUtilAPI.register$lambda$16(lua);
            case 13:
                return CherryUtilAPI.register$lambda$17(lua);
            case 14:
                return CherryUtilAPI.register$lambda$18(lua);
            case 15:
                return CherryUtilAPI.register$lambda$19(lua);
            case 16:
                return CherryUtilAPI.register$lambda$21(lua);
            case 17:
                return CherryUtilAPI.register$lambda$23(lua);
            case 18:
                return CherryViewAPI.register$lambda$1(lua);
            case 19:
                return CherryViewAPI.register$lambda$33(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryViewAPI.register$lambda$41(lua);
            case 21:
                return CherryViewAPI.register$lambda$49(lua);
            case 22:
                return CherryViewAPI.register$lambda$56(lua);
            case 23:
                return CherryViewAPI.register$lambda$61(lua);
            case 24:
                return CherryViewAPI.register$lambda$65(lua);
            case 25:
                return CherryViewAPI.register$lambda$69(lua);
            case 26:
                return CherryViewAPI.register$lambda$73(lua);
            case 27:
                return CherryViewAPI.register$lambda$77(lua);
            case 28:
                return CherryViewAPI.register$lambda$79(lua);
            default:
                return CherryViewAPI.register$lambda$5(lua);
        }
    }
}
