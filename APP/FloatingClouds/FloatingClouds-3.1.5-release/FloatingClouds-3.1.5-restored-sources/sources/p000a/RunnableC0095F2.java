package p000a;

import android.graphics.Typeface;
import p000a.C0234Mf;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.F2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0095F2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0234Mf.a f306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Typeface f307b;

    public RunnableC0095F2(C0234Mf.a aVar, Typeface typeface) {
        this.f306a = aVar;
        this.f307b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0787qd.e eVar = this.f306a.f779u;
        if (eVar != null) {
            eVar.mo1037c(this.f307b);
        }
    }
}
