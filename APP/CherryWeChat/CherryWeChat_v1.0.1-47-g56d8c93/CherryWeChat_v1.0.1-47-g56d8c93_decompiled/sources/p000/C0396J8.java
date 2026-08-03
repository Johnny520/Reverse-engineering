package p000;

import android.widget.EditText;
import io.github.cherrywechat.lua.api.CherryThreadAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: J8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0396J8 implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f1337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1338c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1339d;

    public /* synthetic */ C0396J8(Lua lua, int i, Object obj, int i2) {
        this.f1336a = i2;
        this.f1337b = lua;
        this.f1338c = i;
        this.f1339d = obj;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1336a) {
            case 0:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$10$lambda$9(this.f1337b, this.f1338c, this.f1339d);
            case 1:
                return CherryThreadAPI.register$lambda$15$lambda$14$lambda$10(this.f1337b, this.f1338c, this.f1339d);
            default:
                return CherryViewAPI.register$lambda$18$lambda$17$lambda$14$lambda$13(this.f1337b, this.f1338c, (EditText) this.f1339d);
        }
    }
}
