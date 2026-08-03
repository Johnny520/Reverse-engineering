package p000;

import io.github.cherrywechat.lua.api.CherryXposedAPI;
import io.github.cherrywechat.lua.api.HookAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import io.github.cherrywechat.lua.bridge.JavaImporter;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1355e9 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4857a;

    public /* synthetic */ C1355e9(int i) {
        this.f4857a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f4857a) {
            case 0:
                return CherryXposedAPI.registerFieldAPI$lambda$39(lua);
            case 1:
                return CherryXposedAPI.registerReflectionAPI$lambda$49(lua);
            case 2:
                return CherryXposedAPI.registerReflectionAPI$lambda$50(lua);
            case 3:
                return CherryXposedAPI.registerReflectionAPI$lambda$52(lua);
            case 4:
                return CherryXposedAPI.registerReflectionAPI$lambda$53(lua);
            case 5:
                return CherryXposedAPI.registerReflectionAPI$lambda$54(lua);
            case 6:
                return HookAPI.register$lambda$0(lua);
            case 7:
                return HookAPI.register$lambda$1(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return HookAPI.register$lambda$2(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return HookAPI.register$lambda$4(lua);
            case 10:
                return HookAPI.register$lambda$5(lua);
            case 11:
                return HookAPI.register$lambda$6(lua);
            case 12:
                return HookAPI.register$lambda$7(lua);
            case 13:
                return HookAPI.register$lambda$8(lua);
            case 14:
                return JavaImporter.registerNewFunction$lambda$14(lua);
            case 15:
                return MessageAPI.register$lambda$0(lua);
            case 16:
                return MessageAPI.register$lambda$10(lua);
            case 17:
                return MessageAPI.register$lambda$11(lua);
            case 18:
                return MessageAPI.register$lambda$14(lua);
            case 19:
                return MessageAPI.register$lambda$16(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return MessageAPI.register$lambda$1(lua);
            case 21:
                return MessageAPI.register$lambda$2(lua);
            case 22:
                return MessageAPI.register$lambda$3(lua);
            case 23:
                return MessageAPI.register$lambda$4(lua);
            case 24:
                return MessageAPI.register$lambda$5(lua);
            case 25:
                return MessageAPI.register$lambda$6(lua);
            case 26:
                return MessageAPI.register$lambda$7(lua);
            case 27:
                return MessageAPI.register$lambda$8(lua);
            case 28:
                return MessageAPI.register$lambda$9(lua);
            default:
                return NetworkAPI.register$lambda$2(lua);
        }
    }
}
