package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: S8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0782S8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2469b;

    public /* synthetic */ C0782S8(String str, int i) {
        this.f2468a = i;
        this.f2469b = str;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2468a) {
            case 0:
                return CherryViewAPI.register$lambda$108$lambda$107(this.f2469b);
            case 1:
                return CherryViewAPI.register$lambda$92$lambda$91(this.f2469b);
            case 2:
                return CherryViewAPI.register$lambda$103$lambda$102(this.f2469b);
            default:
                return CherryViewAPI.register$lambda$105$lambda$104(this.f2469b);
        }
    }
}
