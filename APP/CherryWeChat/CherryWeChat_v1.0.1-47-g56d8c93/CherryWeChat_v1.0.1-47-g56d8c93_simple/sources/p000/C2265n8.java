package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2265n8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f7984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f7985c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7986d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Lua f7987e;

    public /* synthetic */ C2265n8(String r2, String r3, int r4, Lua r5) {
        this.f7983a = 2;
        this.f7984b = r2;
        this.f7985c = r3;
        this.f7987e = r5;
        this.f7986d = r4;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f7983a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f7986d;
        Lua r1 = this.f7987e;
        return CherryViewAPI.m3267N(this.f7984b, this.f7985c, r0, r1);
    L6:
        Lua r02 = this.f7987e;
        int r12 = this.f7986d;
        return CherryViewAPI.m3283Y(this.f7984b, this.f7985c, r12, r02);
    L8:
        int r03 = this.f7986d;
        Lua r13 = this.f7987e;
        return CherryAPI.m2991E(this.f7984b, this.f7985c, r03, r13);
    L10:
        int r04 = this.f7986d;
        Lua r14 = this.f7987e;
        return CherryAPI.m3009W(this.f7984b, this.f7985c, r04, r14);
    }

    public /* synthetic */ C2265n8(String r1, String r2, int r3, Lua r4, int r5) {
        this.f7983a = r5;
        this.f7984b = r1;
        this.f7985c = r2;
        this.f7986d = r3;
        this.f7987e = r4;
    }
}
