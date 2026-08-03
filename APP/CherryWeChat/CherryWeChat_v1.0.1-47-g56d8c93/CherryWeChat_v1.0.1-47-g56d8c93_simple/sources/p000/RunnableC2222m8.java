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

    public /* synthetic */ RunnableC2222m8(Lua r1, int r2, int r3) {
        this.f7719a = r3;
        this.f7720b = r1;
        this.f7721c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f7719a) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        CherryThreadAPI.m3174B(this.f7720b, this.f7721c);
        return;
    L6:
        CherryThreadAPI.m3204s(this.f7720b, this.f7721c);
        return;
    L8:
        CherryNetworkAPI.m3171y(this.f7720b, this.f7721c);
        return;
    L10:
        CherryGlobalAPI.m3090a(this.f7720b, this.f7721c);
        return;
    L12:
        CherryAPI.m3000N(this.f7720b, this.f7721c);
        return;
    L14:
        CherryAPI.m3005S(this.f7720b, this.f7721c);
    }
}
