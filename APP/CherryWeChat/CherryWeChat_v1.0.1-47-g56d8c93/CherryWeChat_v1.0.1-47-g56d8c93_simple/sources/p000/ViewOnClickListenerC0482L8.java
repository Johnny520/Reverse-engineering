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

    public /* synthetic */ ViewOnClickListenerC0482L8(Lua r1, int r2, String r3, int r4) {
        this.f1581a = r4;
        this.f1582b = r1;
        this.f1583c = r2;
        this.f1584d = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.f1581a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.f1583c;
        String r1 = this.f1584d;
        CherryViewAPI.m3307k(this.f1582b, r0, r1, r4);
        return;
    L6:
        int r02 = this.f1583c;
        String r12 = this.f1584d;
        CherryViewAPI.m3308k0(this.f1582b, r02, r12, r4);
        return;
    L8:
        int r03 = this.f1583c;
        String r13 = this.f1584d;
        CherryViewAPI.m3291d(this.f1582b, r03, r13, r4);
    }
}
