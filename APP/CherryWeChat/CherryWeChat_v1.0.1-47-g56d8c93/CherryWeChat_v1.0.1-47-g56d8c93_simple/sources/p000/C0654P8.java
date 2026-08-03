package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.util.Map;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: P8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0654P8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f2094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lua f2095d;

    public /* synthetic */ C0654P8(String r1, Map r2, Lua r3, int r4) {
        this.f2092a = r4;
        this.f2093b = r1;
        this.f2094c = r2;
        this.f2095d = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f2092a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Map r0 = this.f2094c;
        Lua r1 = this.f2095d;
        return CherryViewAPI.m3241A(this.f2093b, r0, r1);
    L6:
        Map r02 = this.f2094c;
        Lua r12 = this.f2095d;
        return CherryViewAPI.m3310l0(this.f2093b, r02, r12);
    L8:
        Map r03 = this.f2094c;
        Lua r13 = this.f2095d;
        return CherryViewAPI.m3284Z(this.f2093b, r03, r13);
    }
}
