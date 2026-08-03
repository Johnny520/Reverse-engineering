package p000;

import io.github.cherrywechat.lua.api.CherryThreadAPI;
import java.util.List;

/* JADX INFO: renamed from: I8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0353I8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f1187b;

    public /* synthetic */ C0353I8(int i, List list) {
        this.f1186a = i;
        this.f1187b = list;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1186a) {
            case 0:
                return CherryThreadAPI.register$lambda$31$lambda$30(this.f1187b);
            default:
                return CherryThreadAPI.cleanup$lambda$47(this.f1187b);
        }
    }
}
