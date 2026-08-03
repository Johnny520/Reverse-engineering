package p000;

import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.util.Map;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: P8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0654P8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f2094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lua f2095d;

    public /* synthetic */ C0654P8(String str, Map map, Lua lua, int i) {
        this.f2092a = i;
        this.f2093b = str;
        this.f2094c = map;
        this.f2095d = lua;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f2092a) {
            case 0:
                return CherryViewAPI.register$lambda$49$lambda$48(this.f2093b, this.f2094c, this.f2095d);
            case 1:
                return CherryViewAPI.register$lambda$41$lambda$40(this.f2093b, this.f2094c, this.f2095d);
            default:
                return CherryViewAPI.register$lambda$56$lambda$55(this.f2093b, this.f2094c, this.f2095d);
        }
    }
}
