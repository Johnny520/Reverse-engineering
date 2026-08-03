package p000;

import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: C8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0095C8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f213b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f214c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Exception f215d;

    public /* synthetic */ C0095C8(Lua lua, int i, Exception exc, int i2) {
        this.f212a = i2;
        this.f213b = lua;
        this.f214c = i;
        this.f215d = exc;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f212a) {
            case 0:
                return CherryNetworkAPI.register$lambda$13$lambda$12$lambda$11$lambda$10(this.f213b, this.f214c, this.f215d);
            case 1:
                return CherryNetworkAPI.register$lambda$20$lambda$19$lambda$18$lambda$17(this.f213b, this.f214c, this.f215d);
            case 2:
                return CherryNetworkAPI.register$lambda$6$lambda$5$lambda$4$lambda$3(this.f213b, this.f214c, this.f215d);
            case 3:
                return NetworkAPI.register$lambda$9$lambda$8$lambda$7$lambda$6(this.f213b, this.f214c, this.f215d);
            default:
                return NetworkAPI.register$lambda$15$lambda$14$lambda$13$lambda$12(this.f213b, this.f214c, this.f215d);
        }
    }
}
