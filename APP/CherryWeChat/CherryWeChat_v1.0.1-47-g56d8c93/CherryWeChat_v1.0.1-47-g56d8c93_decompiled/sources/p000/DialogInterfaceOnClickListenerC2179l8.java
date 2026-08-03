package p000;

import android.content.DialogInterface;
import io.github.cherrywechat.lua.api.CherryAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: l8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2179l8 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f7607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lua f7608c;

    public /* synthetic */ DialogInterfaceOnClickListenerC2179l8(int i, Lua lua, int i2) {
        this.f7606a = i2;
        this.f7607b = i;
        this.f7608c = lua;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f7606a) {
            case 0:
                CherryAPI.registerUiApi$lambda$12$lambda$11$lambda$10(this.f7607b, this.f7608c, dialogInterface, i);
                break;
            case 1:
                CherryAPI.registerUiApi$lambda$20$lambda$19$lambda$14(this.f7607b, this.f7608c, dialogInterface, i);
                break;
            case 2:
                CherryAPI.registerUiApi$lambda$20$lambda$19$lambda$16(this.f7607b, this.f7608c, dialogInterface, i);
                break;
            case 3:
                CherryViewAPI.register$lambda$25$lambda$24$lambda$23(this.f7608c, this.f7607b, dialogInterface, i);
                break;
            case 4:
                CherryViewAPI.register$lambda$11$lambda$10$lambda$7(this.f7608c, this.f7607b, dialogInterface, i);
                break;
            case 5:
                CherryViewAPI.register$lambda$11$lambda$10$lambda$9(this.f7608c, this.f7607b, dialogInterface, i);
                break;
            case 6:
                CherryViewAPI.register$lambda$5$lambda$4$lambda$3(this.f7607b, this.f7608c, dialogInterface, i);
                break;
            default:
                CherryViewAPI.register$lambda$18$lambda$17$lambda$16(this.f7608c, this.f7607b, dialogInterface, i);
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC2179l8(Lua lua, int i, int i2) {
        this.f7606a = i2;
        this.f7608c = lua;
        this.f7607b = i;
    }
}
