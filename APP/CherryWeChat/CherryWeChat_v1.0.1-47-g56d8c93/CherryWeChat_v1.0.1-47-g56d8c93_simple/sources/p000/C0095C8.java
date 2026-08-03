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

    public /* synthetic */ C0095C8(Lua r1, int r2, Exception r3, int r4) {
        this.f212a = r4;
        this.f213b = r1;
        this.f214c = r2;
        this.f215d = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f212a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f214c;
        Exception r1 = this.f215d;
        return NetworkAPI.m3485p(this.f213b, r0, r1);
    L6:
        int r02 = this.f214c;
        Exception r12 = this.f215d;
        return NetworkAPI.m3478i(this.f213b, r02, r12);
    L8:
        int r03 = this.f214c;
        Exception r13 = this.f215d;
        return CherryNetworkAPI.m3170x(this.f213b, r03, r13);
    L10:
        int r04 = this.f214c;
        Exception r14 = this.f215d;
        return CherryNetworkAPI.m3146B(this.f213b, r04, r14);
    L12:
        int r05 = this.f214c;
        Exception r15 = this.f215d;
        return CherryNetworkAPI.m3159m(this.f213b, r05, r15);
    }
}
