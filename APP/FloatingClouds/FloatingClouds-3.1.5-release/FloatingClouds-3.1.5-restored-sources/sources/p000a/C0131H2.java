package p000a;

import android.os.Handler;
import p000a.C0234Mf;
import p000a.C0314R6;

/* JADX INFO: renamed from: a.H2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0131H2 {

    /* JADX INFO: renamed from: a */
    public final C0234Mf.a f439a;

    /* JADX INFO: renamed from: b */
    public final Handler f440b;

    public C0131H2(C0234Mf.a aVar, Handler handler) {
        this.f439a = aVar;
        this.f440b = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m352a(C0314R6.a aVar) {
        int i = aVar.f1128b;
        Handler handler = this.f440b;
        C0234Mf.a aVar2 = this.f439a;
        if (i == 0) {
            handler.post(new RunnableC0095F2(aVar2, aVar.f1127a));
        } else {
            handler.post(new RunnableC0113G2(aVar2, i, 0));
        }
    }
}
