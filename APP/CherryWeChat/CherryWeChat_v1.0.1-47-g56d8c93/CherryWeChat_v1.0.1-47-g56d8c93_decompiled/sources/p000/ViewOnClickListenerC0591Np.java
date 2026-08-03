package p000;

import android.view.View;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;

/* JADX INFO: renamed from: Np */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0591Np implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1917a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoadedScript f1918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0762Rp f1919c;

    public /* synthetic */ ViewOnClickListenerC0591Np(C0762Rp c0762Rp, LoadedScript loadedScript) {
        this.f1919c = c0762Rp;
        this.f1918b = loadedScript;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1917a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0295Gu.m625r(-431197536647221L));
                LoadedScript loadedScript = this.f1918b;
                sb.append(loadedScript.getName());
                sb.append(AbstractC0295Gu.m625r(-431249076254773L));
                String string = sb.toString();
                C0762Rp c0762Rp = this.f1919c;
                c0762Rp.m1559a(string);
                CherryGlobalAPI.INSTANCE.setPrintListener(new C0376Ip(c0762Rp, 0));
                ScriptManager.INSTANCE.executeScript(loadedScript.getId(), new C2240mk(2, c0762Rp, loadedScript));
                break;
            default:
                ScriptManager scriptManager = ScriptManager.INSTANCE;
                LoadedScript loadedScript2 = this.f1918b;
                scriptManager.unloadScript(loadedScript2.getId());
                C0762Rp c0762Rp2 = this.f1919c;
                c0762Rp2.m1560g();
                c0762Rp2.m1559a(AbstractC0295Gu.m625r(-482939007662133L) + loadedScript2.getName() + '\n');
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0591Np(LoadedScript loadedScript, C0762Rp c0762Rp) {
        this.f1918b = loadedScript;
        this.f1919c = c0762Rp;
    }
}
