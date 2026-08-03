package p000;

import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.MessageAPI;

/* JADX INFO: renamed from: x8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2703x8 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f9278b;

    public /* synthetic */ C2703x8(int i, int i2) {
        this.f9277a = i2;
        this.f9278b = i;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        boolean zRegister$lambda$16$lambda$14;
        switch (this.f9277a) {
            case 0:
                zRegister$lambda$16$lambda$14 = CherryMessageAPI.register$lambda$16$lambda$14(this.f9278b, (CherryMessageAPI.MessageCallback) obj);
                break;
            case 1:
                zRegister$lambda$16$lambda$14 = MessageAPI.register$lambda$14$lambda$12(this.f9278b, (MessageAPI.MessageCallback) obj);
                break;
            default:
                return Boolean.valueOf((((Integer) obj).intValue() & this.f9278b) != 0);
        }
        return Boolean.valueOf(zRegister$lambda$16$lambda$14);
    }
}
