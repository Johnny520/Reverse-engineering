package yyds;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: yyds.ᛸᛵᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1775 implements Handler.Callback {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2445 f8916;

    public C1775(C2445 c2445) {
        this.f8916 = c2445;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        C2445 c2445 = this.f8916;
        if (i == 1) {
            c2445.m4482((C1751) message.obj);
            return true;
        }
        if (i != 2) {
            return false;
        }
        c2445.f12041.m4281((C1751) message.obj);
        return false;
    }
}
