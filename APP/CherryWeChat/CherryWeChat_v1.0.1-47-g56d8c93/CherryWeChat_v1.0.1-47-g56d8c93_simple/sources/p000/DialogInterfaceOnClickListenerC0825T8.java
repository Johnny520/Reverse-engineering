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

    public /* synthetic */ DialogInterfaceOnClickListenerC0825T8(Lua r1, int r2, Object r3, int r4) {
        this.f2598a = r4;
        this.f2599b = r1;
        this.f2600c = r2;
        this.f2601d = r3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r4, int r5) {
        switch(this.f2598a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        EditText r0 = (EditText) this.f2601d;
        CherryViewAPI.m3258I0(this.f2599b, this.f2600c, r0, r4, r5);
        return;
    L6:
        List r02 = (List) this.f2601d;
        CherryViewAPI.m3272P0(this.f2599b, this.f2600c, r02, r4, r5);
    }
}
