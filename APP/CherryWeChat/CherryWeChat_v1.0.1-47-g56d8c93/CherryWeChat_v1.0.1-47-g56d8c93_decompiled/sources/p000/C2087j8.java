package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: j8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2087j8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7352a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f7353b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7354c;

    public /* synthetic */ C2087j8(Lua lua, int i, int i2) {
        this.f7352a = i2;
        this.f7353b = lua;
        this.f7354c = i;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f7352a) {
            case 0:
                return CherryAPI.registerThreadApi$lambda$38$lambda$37(this.f7353b, this.f7354c);
            case 1:
                return CherryAPI.registerThreadApi$lambda$45$lambda$44$lambda$43(this.f7353b, this.f7354c);
            case 2:
                return CherryAPI.registerThreadApi$lambda$42$lambda$41$lambda$40(this.f7353b, this.f7354c);
            case 3:
                return CherryAPI.registerUiApi$lambda$20$lambda$19$lambda$18$lambda$17(this.f7353b, this.f7354c);
            case 4:
                return CherryAPI.registerUiApi$lambda$12$lambda$11$lambda$10$lambda$9(this.f7353b, this.f7354c);
            case 5:
                return CherryAPI.registerUiApi$lambda$20$lambda$19$lambda$14$lambda$13(this.f7353b, this.f7354c);
            case 6:
                return CherryAPI.registerThreadApi$lambda$42$lambda$41$lambda$40$lambda$39(this.f7353b, this.f7354c);
            case 7:
                return CherryAPI.registerUiApi$lambda$20$lambda$19$lambda$16$lambda$15(this.f7353b, this.f7354c);
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return CherryAPI.registerThreadApi$lambda$38$lambda$37$lambda$36(this.f7353b, this.f7354c);
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                return CherryGlobalAPI.register$lambda$27$lambda$26$lambda$25$lambda$24(this.f7353b, this.f7354c);
            case 10:
                return CherryGlobalAPI.register$lambda$27$lambda$26$lambda$25(this.f7353b, this.f7354c);
            case 11:
                return CherryGlobalAPI.register$lambda$23$lambda$22(this.f7353b, this.f7354c);
            case 12:
                return CherryGlobalAPI.register$lambda$23$lambda$22$lambda$21(this.f7353b, this.f7354c);
            case 13:
                return CherryNetworkAPI.register$lambda$20$lambda$19$lambda$16$lambda$15(this.f7353b, this.f7354c);
            case 14:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$12$lambda$11(this.f7353b, this.f7354c);
            case 15:
                return CherryThreadAPI.register$lambda$2$lambda$1$lambda$0(this.f7353b, this.f7354c);
            case 16:
                return CherryThreadAPI.register$lambda$6$lambda$5$lambda$4$lambda$3(this.f7353b, this.f7354c);
            case 17:
                return CherryThreadAPI.register$lambda$2$lambda$1(this.f7353b, this.f7354c);
            case 18:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$7(this.f7353b, this.f7354c);
            case 19:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$8(this.f7353b, this.f7354c);
            case LuaJitConsts.LUA_MINSTACK /* 20 */:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$13(this.f7353b, this.f7354c);
            case 21:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$12(this.f7353b, this.f7354c);
            case 22:
                return CherryThreadAPI.register$lambda$19$lambda$18$lambda$17$lambda$16(this.f7353b, this.f7354c);
            case 23:
                return CherryThreadAPI.register$lambda$6$lambda$5$lambda$4(this.f7353b, this.f7354c);
            case 24:
                return CherryThreadAPI.register$lambda$19$lambda$18$lambda$17(this.f7353b, this.f7354c);
            case 25:
                return CherryViewAPI.m3324xb9f67a2b(this.f7353b, this.f7354c);
            case 26:
                return CherryViewAPI.register$lambda$32$lambda$31(this.f7353b, this.f7354c);
            case 27:
                return CherryViewAPI.register$lambda$32$lambda$31$lambda$30(this.f7353b, this.f7354c);
            case 28:
                return CherryViewAPI.register$lambda$5$lambda$4$lambda$3$lambda$2(this.f7353b, this.f7354c);
            default:
                return CherryViewAPI.register$lambda$11$lambda$10$lambda$9$lambda$8(this.f7353b, this.f7354c);
        }
    }
}
