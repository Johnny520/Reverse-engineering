package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: U8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0868U8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2743a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2744b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2745c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2746d;

    public /* synthetic */ C0868U8(String str, int i, int i2, int i3) {
        this.f2743a = i3;
        this.f2744b = str;
        this.f2745c = i;
        this.f2746d = i2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2743a) {
            case 0:
                return CherryViewAPI.register$lambda$112$lambda$111(this.f2744b, this.f2745c, this.f2746d);
            default:
                return CherryViewAPI.register$lambda$110$lambda$109(this.f2744b, this.f2745c, this.f2746d);
        }
    }
}
