package p000;

import android.view.View;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: L8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0482L8 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f1582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1583c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f1584d;

    public /* synthetic */ ViewOnClickListenerC0482L8(Lua lua, int i, String str, int i2) {
        this.f1581a = i2;
        this.f1582b = lua;
        this.f1583c = i;
        this.f1584d = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1581a) {
            case 0:
                CherryViewAPI.register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(this.f1582b, this.f1583c, this.f1584d, view);
                break;
            case 1:
                CherryViewAPI.register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(this.f1582b, this.f1583c, this.f1584d, view);
                break;
            default:
                CherryViewAPI.register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37(this.f1582b, this.f1583c, this.f1584d, view);
                break;
        }
    }
}
