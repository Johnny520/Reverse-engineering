package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.util.Map;

/* JADX INFO: renamed from: N8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0568N8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f1851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1852c;

    public /* synthetic */ C0568N8(String str, Map map) {
        this.f1850a = 1;
        this.f1851b = map;
        this.f1852c = str;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1850a) {
            case 0:
                return CherryViewAPI.register$lambda$73$lambda$72(this.f1852c, this.f1851b);
            case 1:
                return CherryViewAPI.register$lambda$99$lambda$98(this.f1851b, this.f1852c);
            case 2:
                return CherryViewAPI.register$lambda$69$lambda$68(this.f1852c, this.f1851b);
            case 3:
                return CherryViewAPI.register$lambda$65$lambda$64(this.f1852c, this.f1851b);
            default:
                return CherryViewAPI.register$lambda$61$lambda$60(this.f1852c, this.f1851b);
        }
    }

    public /* synthetic */ C0568N8(String str, Map map, int i) {
        this.f1850a = i;
        this.f1852c = str;
        this.f1851b = map;
    }
}
