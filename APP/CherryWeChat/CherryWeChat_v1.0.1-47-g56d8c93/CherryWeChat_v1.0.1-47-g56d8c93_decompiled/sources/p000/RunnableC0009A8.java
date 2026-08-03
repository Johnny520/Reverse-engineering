package p000;

import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: A8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0009A8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f10b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f11c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f12d;

    public /* synthetic */ RunnableC0009A8(String str, Lua lua, int i) {
        this.f9a = 3;
        this.f12d = str;
        this.f10b = lua;
        this.f11c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9a) {
            case 0:
                CherryNetworkAPI.register$lambda$6$lambda$5$lambda$2(this.f10b, this.f11c, this.f12d);
                break;
            case 1:
                CherryNetworkAPI.register$lambda$13$lambda$12$lambda$9(this.f10b, this.f11c, this.f12d);
                break;
            case 2:
                NetworkAPI.register$lambda$9$lambda$8$lambda$5(this.f10b, this.f11c, this.f12d);
                break;
            case 3:
                NetworkAPI.register$lambda$9$lambda$8(this.f12d, this.f10b, this.f11c);
                break;
            default:
                NetworkAPI.register$lambda$15$lambda$14$lambda$11(this.f10b, this.f11c, this.f12d);
                break;
        }
    }

    public /* synthetic */ RunnableC0009A8(Lua lua, int i, String str, int i2) {
        this.f9a = i2;
        this.f10b = lua;
        this.f11c = i;
        this.f12d = str;
    }
}
