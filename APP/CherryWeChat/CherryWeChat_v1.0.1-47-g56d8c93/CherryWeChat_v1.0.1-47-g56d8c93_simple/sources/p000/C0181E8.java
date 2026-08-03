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

    public /* synthetic */ C0181E8(Lua r1, int r2, String r3, int r4) {
        this.f532a = r4;
        this.f533b = r1;
        this.f534c = r2;
        this.f535d = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f532a) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f534c;
        return NetworkAPI.m3488s(this.f535d, this.f533b, r0);
    L6:
        int r02 = this.f534c;
        return NetworkAPI.m3480k(this.f535d, this.f533b, r02);
    L8:
        int r03 = this.f534c;
        return CherryViewAPI.m3338x(this.f535d, this.f533b, r03);
    L10:
        int r04 = this.f534c;
        return CherryViewAPI.m3255H(this.f535d, this.f533b, r04);
    L12:
        int r05 = this.f534c;
        return CherryViewAPI.m3296e0(this.f535d, this.f533b, r05);
    L14:
        int r06 = this.f534c;
        return CherryNetworkAPI.m3150d(this.f535d, this.f533b, r06);
    L16:
        int r07 = this.f534c;
        return CherryNetworkAPI.m3154h(this.f535d, this.f533b, r07);
    }
}
