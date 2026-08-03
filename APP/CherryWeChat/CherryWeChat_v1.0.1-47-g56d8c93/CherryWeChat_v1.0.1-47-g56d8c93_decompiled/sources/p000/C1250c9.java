package p000;

import io.github.cherrywechat.lua.api.CherryXposedAPI;
import party.iroiro.luajava.JFunction;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1250c9 implements JFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4247a;

    public /* synthetic */ C1250c9(int i) {
        this.f4247a = i;
    }

    @Override // party.iroiro.luajava.JFunction
    public final int __call(Lua lua) {
        switch (this.f4247a) {
            case 0:
                return CherryXposedAPI.registerMethodAPI$lambda$29(lua);
            case 1:
                return CherryXposedAPI.registerClassAPI$lambda$12(lua);
            case 2:
                return CherryXposedAPI.registerClassAPI$lambda$13(lua);
            case 3:
                return CherryXposedAPI.registerClassAPI$lambda$14(lua);
            case 4:
                return CherryXposedAPI.registerConstructorAPI$lambda$45(lua);
            case 5:
                return CherryXposedAPI.registerClassAPI$lambda$15(lua);
            case 6:
                return CherryXposedAPI.registerClassAPI$lambda$16(lua);
            case 7:
                return CherryXposedAPI.registerClassAPI$lambda$18(lua);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryXposedAPI.registerClassAPI$lambda$20(lua);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryXposedAPI.registerClassAPI$lambda$21(lua);
            case 10:
                return CherryXposedAPI.registerHookAPI$lambda$0(lua);
            case 11:
                return CherryXposedAPI.registerHookAPI$lambda$1(lua);
            case 12:
                return CherryXposedAPI.registerHookAPI$lambda$2(lua);
            case 13:
                return CherryXposedAPI.registerHookAPI$lambda$3(lua);
            case 14:
                return CherryXposedAPI.registerHookAPI$lambda$4(lua);
            case 15:
                return CherryXposedAPI.registerConstructorAPI$lambda$47(lua);
            case 16:
                return CherryXposedAPI.registerHookAPI$lambda$8(lua);
            case 17:
                return CherryXposedAPI.registerHookAPI$lambda$11(lua);
            case 18:
                return CherryXposedAPI.registerFieldAPI$lambda$30(lua);
            case 19:
                return CherryXposedAPI.registerFieldAPI$lambda$40(lua);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryXposedAPI.registerFieldAPI$lambda$42(lua);
            case 21:
                return CherryXposedAPI.registerFieldAPI$lambda$31(lua);
            case 22:
                return CherryXposedAPI.registerFieldAPI$lambda$32(lua);
            case 23:
                return CherryXposedAPI.registerFieldAPI$lambda$33(lua);
            case 24:
                return CherryXposedAPI.registerFieldAPI$lambda$34(lua);
            case 25:
                return CherryXposedAPI.registerFieldAPI$lambda$35(lua);
            case 26:
                return CherryXposedAPI.registerConstructorAPI$lambda$48(lua);
            case 27:
                return CherryXposedAPI.registerFieldAPI$lambda$36(lua);
            case 28:
                return CherryXposedAPI.registerFieldAPI$lambda$37(lua);
            default:
                return CherryXposedAPI.registerFieldAPI$lambda$38(lua);
        }
    }
}
