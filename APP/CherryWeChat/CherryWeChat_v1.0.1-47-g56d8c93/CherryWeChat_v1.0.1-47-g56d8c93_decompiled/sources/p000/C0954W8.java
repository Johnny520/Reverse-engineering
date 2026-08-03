package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.lua.api.CherryWeChatAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: W8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0954W8 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2986a;

    public /* synthetic */ C0954W8(int i) {
        this.f2986a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f2986a) {
            case 0:
                return CherryViewAPI.register$lambda$81(lua);
            case 1:
                return CherryViewAPI.register$lambda$82(lua);
            case 2:
                return CherryViewAPI.register$lambda$84(lua);
            case 3:
                return CherryViewAPI.register$lambda$86(lua);
            case 4:
                return CherryViewAPI.register$lambda$87(lua);
            case 5:
                return CherryViewAPI.register$lambda$89(lua);
            case 6:
                return CherryViewAPI.register$lambda$92(lua);
            case 7:
                return CherryViewAPI.register$lambda$99(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryViewAPI.register$lambda$101(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryViewAPI.register$lambda$103(lua);
            case 10:
                return CherryViewAPI.register$lambda$11(lua);
            case 11:
                return CherryViewAPI.register$lambda$105(lua);
            case 12:
                return CherryViewAPI.register$lambda$108(lua);
            case 13:
                return CherryViewAPI.register$lambda$110(lua);
            case 14:
                return CherryViewAPI.register$lambda$112(lua);
            case 15:
                return CherryViewAPI.register$lambda$114(lua);
            case 16:
                return CherryViewAPI.register$lambda$117(lua);
            case 17:
                return CherryViewAPI.register$lambda$130(lua);
            case 18:
                return CherryViewAPI.register$lambda$18(lua);
            case 19:
                return CherryViewAPI.register$lambda$25(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryViewAPI.register$lambda$26(lua);
            case 21:
                return CherryViewAPI.register$lambda$27(lua);
            case 22:
                return CherryViewAPI.register$lambda$28(lua);
            case 23:
                return CherryViewAPI.register$lambda$29(lua);
            case 24:
                return CherryViewAPI.register$lambda$32(lua);
            case 25:
                return CherryWeChatAPI.register$lambda$0(lua);
            case 26:
                return CherryWeChatAPI.register$lambda$31(lua);
            case 27:
                return CherryWeChatAPI.register$lambda$1(lua);
            case 28:
                return CherryWeChatAPI.register$lambda$2(lua);
            default:
                return CherryWeChatAPI.register$lambda$6(lua);
        }
    }
}
