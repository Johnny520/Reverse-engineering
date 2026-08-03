package p000;

import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2308o8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8087a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f8089c;

    public /* synthetic */ C2308o8(String str, int i, int i2) {
        this.f8087a = i2;
        this.f8088b = str;
        this.f8089c = i;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f8087a) {
            case 0:
                return CherryAPI.registerUiApi$lambda$8$lambda$7(this.f8088b, this.f8089c);
            case 1:
                return CherryGlobalAPI.register$lambda$10$lambda$9(this.f8088b, this.f8089c);
            case 2:
                return CherryGlobalAPI.register$lambda$17$lambda$16(this.f8088b, this.f8089c);
            default:
                return CherryViewAPI.register$lambda$1$lambda$0(this.f8088b, this.f8089c);
        }
    }
}
