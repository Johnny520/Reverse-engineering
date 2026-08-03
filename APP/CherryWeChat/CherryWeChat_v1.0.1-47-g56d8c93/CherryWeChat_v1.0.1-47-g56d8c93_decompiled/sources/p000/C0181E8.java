package p000;

import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: E8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0181E8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f534c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f535d;

    public /* synthetic */ C0181E8(Lua lua, int i, String str, int i2) {
        this.f532a = i2;
        this.f533b = lua;
        this.f534c = i;
        this.f535d = str;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f532a) {
            case 0:
                return CherryNetworkAPI.register$lambda$13$lambda$12$lambda$9$lambda$8(this.f533b, this.f534c, this.f535d);
            case 1:
                return CherryNetworkAPI.register$lambda$6$lambda$5$lambda$2$lambda$1(this.f533b, this.f534c, this.f535d);
            case 2:
                return CherryViewAPI.m3325xed14eec4(this.f533b, this.f534c, this.f535d);
            case 3:
                return CherryViewAPI.m3326x1809f3c8(this.f533b, this.f534c, this.f535d);
            case 4:
                return CherryViewAPI.m3327xcffa3770(this.f533b, this.f534c, this.f535d);
            case 5:
                return NetworkAPI.register$lambda$15$lambda$14$lambda$11$lambda$10(this.f533b, this.f534c, this.f535d);
            default:
                return NetworkAPI.register$lambda$9$lambda$8$lambda$5$lambda$4(this.f533b, this.f534c, this.f535d);
        }
    }
}
