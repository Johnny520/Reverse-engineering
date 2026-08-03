package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: O8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0611O8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f1958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1959c;

    public /* synthetic */ C0611O8(int i, String str, String str2) {
        this.f1957a = i;
        this.f1958b = str;
        this.f1959c = str2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1957a) {
            case 0:
                return CherryViewAPI.setImageSource$lambda$133(this.f1958b, this.f1959c);
            case 1:
                return CherryViewAPI.register$lambda$101$lambda$100(this.f1958b, this.f1959c);
            case 2:
                return CherryViewAPI.register$lambda$86$lambda$85(this.f1958b, this.f1959c);
            case 3:
                return CherryViewAPI.register$lambda$81$lambda$80(this.f1958b, this.f1959c);
            case 4:
                return CherryViewAPI.register$lambda$79$lambda$78(this.f1958b, this.f1959c);
            default:
                return CherryViewAPI.register$lambda$89$lambda$88(this.f1958b, this.f1959c);
        }
    }
}
