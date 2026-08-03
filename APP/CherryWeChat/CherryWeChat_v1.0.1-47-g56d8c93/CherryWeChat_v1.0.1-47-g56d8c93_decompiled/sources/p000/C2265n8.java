package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2265n8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f7984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f7985c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7986d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Lua f7987e;

    public /* synthetic */ C2265n8(String str, String str2, int i, Lua lua) {
        this.f7983a = 2;
        this.f7984b = str;
        this.f7985c = str2;
        this.f7987e = lua;
        this.f7986d = i;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f7983a) {
            case 0:
                return CherryAPI.registerUiApi$lambda$20$lambda$19(this.f7984b, this.f7985c, this.f7986d, this.f7987e);
            case 1:
                return CherryAPI.registerUiApi$lambda$12$lambda$11(this.f7984b, this.f7985c, this.f7986d, this.f7987e);
            case 2:
                return CherryViewAPI.register$lambda$11$lambda$10(this.f7984b, this.f7985c, this.f7987e, this.f7986d);
            default:
                return CherryViewAPI.register$lambda$5$lambda$4(this.f7984b, this.f7985c, this.f7986d, this.f7987e);
        }
    }

    public /* synthetic */ C2265n8(String str, String str2, int i, Lua lua, int i2) {
        this.f7983a = i2;
        this.f7984b = str;
        this.f7985c = str2;
        this.f7986d = i;
        this.f7987e = lua;
    }
}
