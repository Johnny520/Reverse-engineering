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

    public /* synthetic */ C1677U(int i, Object obj) {
        this.f6039a = i;
        this.f6040b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f6039a) {
            case 0:
                C1678V c1678v = (C1678V) this.f6040b;
                C2054w1 c2054w1 = c1678v.f6051f;
                if (c1678v.f6052g) {
                    c2054w1.mo3715i();
                }
                c2054w1.mo3718l().getReplayController().stop();
                c2054w1.mo3718l().getContinuousProfiler().mo3690a(false);
                break;
            default:
                C2021p c2021p = (C2021p) this.f6040b;
                Iterator it = c2021p.f7207d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2020o) it.next()).mo3877m(c2021p);
                }
                break;
        }
    }
}
