package io.sentry.android.replay.capture;

import io.sentry.android.replay.C1821w;
import io.sentry.protocol.C1970t;
import java.util.Date;
import p000.AbstractC0073Bn;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1768f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6445a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f6446b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Date f6447c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1970t f6448d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1821w f6449e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0073Bn f6450f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC1767e f6451g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1768f(C1770h c1770h, long j, Date date, C1970t c1970t, C1821w c1821w, InterfaceC1416fj interfaceC1416fj) {
        this.f6451g = c1770h;
        this.f6446b = j;
        this.f6447c = date;
        this.f6448d = c1970t;
        this.f6449e = c1821w;
        this.f6450f = (AbstractC0073Bn) interfaceC1416fj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Bn, fj] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Bn, fj] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6445a) {
            case 0:
                C1770h c1770h = (C1770h) this.f6451g;
                int iM3955j = c1770h.m3955j();
                C1821w c1821w = this.f6449e;
                this.f6450f.mo90g(AbstractC1767e.m3951h(c1770h, this.f6446b, this.f6447c, this.f6448d, iM3955j, c1821w.f6590b, c1821w.f6589a, c1821w.f6593e, c1821w.f6594f));
                break;
            default:
                C1779q c1779q = (C1779q) this.f6451g;
                int iM3955j2 = c1779q.m3955j();
                C1821w c1821w2 = this.f6449e;
                this.f6450f.mo90g(AbstractC1767e.m3951h(c1779q, this.f6446b, this.f6447c, this.f6448d, iM3955j2, c1821w2.f6590b, c1821w2.f6589a, c1821w2.f6593e, c1821w2.f6594f));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1768f(C1779q c1779q, long j, Date date, C1970t c1970t, C1821w c1821w, InterfaceC1416fj interfaceC1416fj) {
        this.f6451g = c1779q;
        this.f6446b = j;
        this.f6447c = date;
        this.f6448d = c1970t;
        this.f6449e = c1821w;
        this.f6450f = (AbstractC0073Bn) interfaceC1416fj;
    }
}
