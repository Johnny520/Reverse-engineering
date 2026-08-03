package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: Z8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1083Z8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3452a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f3453b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3454c;

    public /* synthetic */ C1083Z8(Lua r1, int r2, int r3) {
        this.f3452a = r3;
        this.f3453b = r1;
        this.f3454c = r2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f3452a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return CherryViewAPI.m3280V(this.f3453b, this.f3454c);
    L7:
        return CherryViewAPI.m3246C0(this.f3453b, this.f3454c);
    L9:
        return CherryViewAPI.m3251F(this.f3453b, this.f3454c);
    L11:
        return CherryViewAPI.m3275R(this.f3453b, this.f3454c);
    }
}
