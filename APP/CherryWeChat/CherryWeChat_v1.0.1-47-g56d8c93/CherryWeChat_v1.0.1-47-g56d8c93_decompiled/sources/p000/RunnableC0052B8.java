package p000;

import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: B8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0052B8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f113b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f114c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Exception f115d;

    public /* synthetic */ RunnableC0052B8(Lua lua, int i, Exception exc, int i2) {
        this.f112a = i2;
        this.f113b = lua;
        this.f114c = i;
        this.f115d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f112a) {
            case 0:
                CherryNetworkAPI.register$lambda$6$lambda$5$lambda$4(this.f113b, this.f114c, this.f115d);
                break;
            case 1:
                CherryNetworkAPI.register$lambda$20$lambda$19$lambda$18(this.f113b, this.f114c, this.f115d);
                break;
            case 2:
                CherryNetworkAPI.register$lambda$13$lambda$12$lambda$11(this.f113b, this.f114c, this.f115d);
                break;
            case 3:
                NetworkAPI.register$lambda$9$lambda$8$lambda$7(this.f113b, this.f114c, this.f115d);
                break;
            default:
                NetworkAPI.register$lambda$15$lambda$14$lambda$13(this.f113b, this.f114c, this.f115d);
                break;
        }
    }
}
