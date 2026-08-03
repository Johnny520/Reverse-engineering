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

    public /* synthetic */ C0396J8(Lua r1, int r2, Object r3, int r4) {
        this.f1336a = r4;
        this.f1337b = r1;
        this.f1338c = r2;
        this.f1339d = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f1336a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        EditText r0 = (EditText) this.f1339d;
        return CherryViewAPI.m3332u(this.f1337b, this.f1338c, r0);
    L6:
        int r02 = this.f1338c;
        Object r1 = this.f1339d;
        return CherryThreadAPI.m3189d(this.f1337b, r02, r1);
    L8:
        int r03 = this.f1338c;
        Object r12 = this.f1339d;
        return CherryThreadAPI.m3173A(this.f1337b, r03, r12);
    }
}
