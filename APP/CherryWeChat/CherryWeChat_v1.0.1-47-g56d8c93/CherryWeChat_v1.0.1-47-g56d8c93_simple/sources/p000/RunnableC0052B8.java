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

    public /* synthetic */ RunnableC0052B8(Lua r1, int r2, Exception r3, int r4) {
        this.f112a = r4;
        this.f113b = r1;
        this.f114c = r2;
        this.f115d = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f112a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f114c;
        Exception r1 = this.f115d;
        NetworkAPI.m3473d(this.f113b, r0, r1);
        return;
    L6:
        int r02 = this.f114c;
        Exception r12 = this.f115d;
        NetworkAPI.m3487r(this.f113b, r02, r12);
        return;
    L8:
        int r03 = this.f114c;
        Exception r13 = this.f115d;
        CherryNetworkAPI.m3164r(this.f113b, r03, r13);
        return;
    L10:
        int r04 = this.f114c;
        Exception r14 = this.f115d;
        CherryNetworkAPI.m3167u(this.f113b, r04, r14);
        return;
    L12:
        int r05 = this.f114c;
        Exception r15 = this.f115d;
        CherryNetworkAPI.m3157k(this.f113b, r05, r15);
    }
}
