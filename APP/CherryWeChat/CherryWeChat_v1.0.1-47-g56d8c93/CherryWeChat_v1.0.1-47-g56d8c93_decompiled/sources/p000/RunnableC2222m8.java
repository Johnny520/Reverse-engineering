package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: m8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2222m8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f7720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f7721c;

    public /* synthetic */ RunnableC2222m8(Lua lua, int i, int i2) {
        this.f7719a = i2;
        this.f7720b = lua;
        this.f7721c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7719a) {
            case 0:
                CherryAPI.registerThreadApi$lambda$42$lambda$41(this.f7720b, this.f7721c);
                break;
            case 1:
                CherryAPI.registerThreadApi$lambda$45$lambda$44(this.f7720b, this.f7721c);
                break;
            case 2:
                CherryGlobalAPI.register$lambda$27$lambda$26(this.f7720b, this.f7721c);
                break;
            case 3:
                CherryNetworkAPI.register$lambda$20$lambda$19$lambda$16(this.f7720b, this.f7721c);
                break;
            case 4:
                CherryThreadAPI.register$lambda$6$lambda$5(this.f7720b, this.f7721c);
                break;
            default:
                CherryThreadAPI.register$lambda$19$lambda$18(this.f7720b, this.f7721c);
                break;
        }
    }
}
