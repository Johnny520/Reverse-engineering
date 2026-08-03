package p000;

import android.content.DialogInterface;
import android.widget.EditText;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.util.List;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: T8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0825T8 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lua f2599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2600c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2601d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0825T8(Lua lua, int i, Object obj, int i2) {
        this.f2598a = i2;
        this.f2599b = lua;
        this.f2600c = i;
        this.f2601d = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f2598a) {
            case 0:
                CherryViewAPI.register$lambda$25$lambda$24$lambda$21(this.f2599b, this.f2600c, (List) this.f2601d, dialogInterface, i);
                break;
            default:
                CherryViewAPI.register$lambda$18$lambda$17$lambda$14(this.f2599b, this.f2600c, (EditText) this.f2601d, dialogInterface, i);
                break;
        }
    }
}
