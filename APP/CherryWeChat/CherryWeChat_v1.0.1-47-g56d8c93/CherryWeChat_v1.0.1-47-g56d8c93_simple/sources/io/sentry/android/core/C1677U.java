package io.sentry.android.core;

import io.sentry.C2054w1;
import io.sentry.transport.C2021p;
import io.sentry.transport.InterfaceC2020o;
import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.android.core.U */
/* JADX INFO: loaded from: classes.dex */
public final class C1677U extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6040b;

    public /* synthetic */ C1677U(int r1, Object r2) {
        this.f6039a = r1;
        this.f6040b = r2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch(this.f6039a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C2021p r0 = (C2021p) this.f6040b;
        Iterator r1 = r0.f7207d.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        ((InterfaceC2020o) r1.next()).mo3877m(r0);
        goto L6
    L8:
        return;
    L9:
        C1678V r02 = (C1678V) this.f6040b;
        C2054w1 r12 = r02.f6051f;
        if (r02.f6052g == false) goto L12;
        r12.mo3715i();
    L12:
        r12.mo3718l().getReplayController().stop();
        r12.mo3718l().getContinuousProfiler().mo3690a(false);
    }
}
