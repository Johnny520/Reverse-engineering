package p154e2;

import p068N1.C1013c;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: e2.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2027f implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f6757d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2028g f6758e;

    public RunnableC2027f(C2028g c2028g, boolean z5) {
        this.f6758e = c2028g;
        this.f6757d = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2511o.m4452a();
        C1013c c1013c = this.f6758e.f6759a;
        boolean z5 = c1013c.f3128a;
        boolean z6 = this.f6757d;
        c1013c.f3128a = z6;
        if (z5 != z6) {
            ((C2026e) c1013c.f3129b).mo3612a(z6);
        }
    }
}
