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

    public /* synthetic */ DialogInterfaceOnClickListenerC2179l8(int r1, Lua r2, int r3) {
        this.f7606a = r3;
        this.f7607b = r1;
        this.f7608c = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r3, int r4) {
        switch(this.f7606a) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        Lua r0 = this.f7608c;
        CherryViewAPI.m3274Q0(this.f7607b, r0, r3, r4);
        return;
    L6:
        CherryViewAPI.m3343z0(this.f7607b, this.f7608c, r3, r4);
        return;
    L8:
        Lua r02 = this.f7608c;
        CherryViewAPI.m3335v0(this.f7607b, r02, r3, r4);
        return;
    L10:
        Lua r03 = this.f7608c;
        CherryViewAPI.m3253G(this.f7607b, r03, r3, r4);
        return;
    L12:
        Lua r04 = this.f7608c;
        CherryViewAPI.m3263L(this.f7607b, r04, r3, r4);
        return;
    L14:
        CherryAPI.m3029n(this.f7607b, this.f7608c, r3, r4);
        return;
    L16:
        CherryAPI.m2990D(this.f7607b, this.f7608c, r3, r4);
        return;
    L18:
        CherryAPI.m3014a0(this.f7607b, this.f7608c, r3, r4);
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC2179l8(Lua r1, int r2, int r3) {
        this.f7606a = r3;
        this.f7608c = r1;
        this.f7607b = r2;
    }
}
