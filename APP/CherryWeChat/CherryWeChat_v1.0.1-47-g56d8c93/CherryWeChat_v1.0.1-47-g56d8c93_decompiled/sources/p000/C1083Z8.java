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

    public /* synthetic */ C1083Z8(Lua lua, int i, int i2) {
        this.f3452a = i2;
        this.f3453b = lua;
        this.f3454c = i;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f3452a) {
            case 0:
                return CherryViewAPI.m3323x7dea6f2b(this.f3453b, this.f3454c);
            case 1:
                return CherryViewAPI.register$lambda$25$lambda$24$lambda$23$lambda$22(this.f3453b, this.f3454c);
            case 2:
                return CherryViewAPI.register$lambda$11$lambda$10$lambda$7$lambda$6(this.f3453b, this.f3454c);
            default:
                return CherryViewAPI.register$lambda$18$lambda$17$lambda$16$lambda$15(this.f3453b, this.f3454c);
        }
    }
}
