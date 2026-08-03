package io.sentry;

import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565B2 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1573D2 f5603b;

    public /* synthetic */ C1565B2(C1573D2 r1, int r2) {
        this.f5602a = r2;
        this.f5603b = r1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch(this.f5602a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        C1573D2 r0 = this.f5603b;
        EnumC1605L2 r1 = r0.mo3629o();
        if (r1 != null) goto L9;
        r1 = EnumC1605L2.DEADLINE_EXCEEDED;
    L9:
        if (r0.f5645r.f5841g == null) goto L11;
        boolean r2 = true;
    L12:
        r0.mo3622h(r1, r2, null);
        r0.f5640m.set(false);
        return;
    L11:
        r2 = false;
        goto L12
    L14:
        C1573D2 r02 = this.f5603b;
        EnumC1605L2 r12 = r02.mo3629o();
        if (r12 != null) goto L18;
        r12 = EnumC1605L2.f5786OK;
    L18:
        r02.mo3631q(r12, null);
        r02.f5639l.set(false);
    }
}
