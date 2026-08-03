package p000;

import io.github.cherrywechat.lua.api.CherryNetworkAPI;
import io.github.cherrywechat.lua.api.NetworkAPI;
import java.util.Map;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: G8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0267G8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lua f856c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f857d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f858e;

    public /* synthetic */ RunnableC0267G8(String str, Object obj, Lua lua, int i, int i2) {
        this.f854a = i2;
        this.f855b = str;
        this.f858e = obj;
        this.f856c = lua;
        this.f857d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f854a) {
            case 0:
                CherryNetworkAPI.register$lambda$6$lambda$5(this.f855b, (Map) this.f858e, this.f856c, this.f857d);
                break;
            default:
                NetworkAPI.register$lambda$15$lambda$14(this.f855b, (String) this.f858e, this.f856c, this.f857d);
                break;
        }
    }
}
