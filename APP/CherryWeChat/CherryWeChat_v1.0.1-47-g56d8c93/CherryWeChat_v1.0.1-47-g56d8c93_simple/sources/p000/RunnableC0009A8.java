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

    public /* synthetic */ RunnableC0009A8(String r2, Lua r3, int r4) {
        this.f9a = 3;
        this.f12d = r2;
        this.f10b = r3;
        this.f11c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f9a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f11c;
        NetworkAPI.m3471b(this.f12d, this.f10b, r0);
        return;
    L6:
        Lua r02 = this.f10b;
        int r1 = this.f11c;
        NetworkAPI.m3474e(this.f12d, r02, r1);
        return;
    L8:
        int r03 = this.f11c;
        NetworkAPI.m3477h(this.f12d, this.f10b, r03);
        return;
    L10:
        int r04 = this.f11c;
        CherryNetworkAPI.m3169w(this.f12d, this.f10b, r04);
        return;
    L12:
        int r05 = this.f11c;
        CherryNetworkAPI.m3163q(this.f12d, this.f10b, r05);
    }

    public /* synthetic */ RunnableC0009A8(Lua r1, int r2, String r3, int r4) {
        this.f9a = r4;
        this.f10b = r1;
        this.f11c = r2;
        this.f12d = r3;
    }
}
