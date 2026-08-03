package p000;

import io.github.cherrywechat.lua.api.NetworkAPI;
import io.github.cherrywechat.lua.api.WeChatAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Ks */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0465Ks implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1512a;

    public /* synthetic */ C0465Ks(int i) {
        this.f1512a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f1512a) {
            case 0:
                return NetworkAPI.register$lambda$3(lua);
            case 1:
                return NetworkAPI.register$lambda$9(lua);
            case 2:
                return NetworkAPI.register$lambda$15(lua);
            case 3:
                return NetworkAPI.register$lambda$18(lua);
            case 4:
                return NetworkAPI.register$lambda$19(lua);
            case 5:
                return NetworkAPI.register$lambda$24(lua);
            case 6:
                return NetworkAPI.register$lambda$0(lua);
            case 7:
                return WeChatAPI.register$lambda$0(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return WeChatAPI.register$lambda$2(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return WeChatAPI.register$lambda$3(lua);
            case 10:
                return WeChatAPI.register$lambda$4(lua);
            case 11:
                return WeChatAPI.register$lambda$6(lua);
            case 12:
                return WeChatAPI.register$lambda$7(lua);
            case 13:
                return WeChatAPI.register$lambda$8(lua);
            case 14:
                return WeChatAPI.register$lambda$9(lua);
            case 15:
                return WeChatAPI.register$lambda$10(lua);
            case 16:
                return WeChatAPI.register$lambda$11(lua);
            case 17:
                return WeChatAPI.register$lambda$12(lua);
            case 18:
                return WeChatAPI.register$lambda$13(lua);
            case 19:
                return WeChatAPI.register$lambda$14(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return WeChatAPI.register$lambda$15(lua);
            case 21:
                return WeChatAPI.register$lambda$16(lua);
            case 22:
                return WeChatAPI.register$lambda$17(lua);
            case 23:
                return WeChatAPI.register$lambda$18(lua);
            default:
                return WeChatAPI.register$lambda$1(lua);
        }
    }
}
