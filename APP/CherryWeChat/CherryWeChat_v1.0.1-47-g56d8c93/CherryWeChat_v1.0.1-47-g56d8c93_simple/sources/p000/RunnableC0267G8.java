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

    public /* synthetic */ RunnableC0267G8(String r1, Object r2, Lua r3, int r4, int r5) {
        this.f854a = r5;
        this.f855b = r1;
        this.f858e = r2;
        this.f856c = r3;
        this.f857d = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f854a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        String r0 = (String) this.f858e;
        Lua r1 = this.f856c;
        int r2 = this.f857d;
        NetworkAPI.m3486q(this.f855b, r0, r2, r1);
        return;
    L6:
        Map r02 = (Map) this.f858e;
        Lua r12 = this.f856c;
        int r22 = this.f857d;
        CherryNetworkAPI.m3145A(this.f855b, r02, r12, r22);
    }
}
