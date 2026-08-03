package p000;

import android.view.View;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;

/* JADX INFO: renamed from: Np */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0591Np implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoadedScript f1918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0762Rp f1919c;

    public /* synthetic */ ViewOnClickListenerC0591Np(C0762Rp r2, LoadedScript r3) {
        this.f1917a = 0;
        this.f1919c = r2;
        this.f1918b = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r6) {
        switch(this.f1917a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ScriptManager r62 = ScriptManager.INSTANCE;
        LoadedScript r0 = this.f1918b;
        r62.unloadScript(r0.getId());
        C0762Rp r63 = this.f1919c;
        r63.m1560g();
        r63.m1559a(AbstractC0295Gu.m625r(-482939007662133L) + r0.getName() + '\n');
        return;
    L6:
        StringBuilder r64 = new StringBuilder();
        r64.append(AbstractC0295Gu.m625r(-431197536647221L));
        LoadedScript r02 = this.f1918b;
        r64.append(r02.getName());
        r64.append(AbstractC0295Gu.m625r(-431249076254773L));
        String r65 = r64.toString();
        C0762Rp r1 = this.f1919c;
        r1.m1559a(r65);
        CherryGlobalAPI.INSTANCE.setPrintListener(new C0376Ip(r1, 0));
        ScriptManager.INSTANCE.executeScript(r02.getId(), new C2240mk(2, r1, r02));
    }

    public /* synthetic */ ViewOnClickListenerC0591Np(LoadedScript r2, C0762Rp r3) {
        this.f1917a = 1;
        this.f1918b = r2;
        this.f1919c = r3;
    }
}
