package io.sentry;

import java.util.TimerTask;

/* JADX INFO: renamed from: io.sentry.B2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565B2 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1573D2 f5603b;

    public /* synthetic */ C1565B2(C1573D2 c1573d2, int i) {
        this.f5602a = i;
        this.f5603b = c1573d2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f5602a) {
            case 0:
                C1573D2 c1573d2 = this.f5603b;
                EnumC1605L2 enumC1605L2Mo3629o = c1573d2.mo3629o();
                if (enumC1605L2Mo3629o == null) {
                    enumC1605L2Mo3629o = EnumC1605L2.OK;
                }
                c1573d2.mo3631q(enumC1605L2Mo3629o, null);
                c1573d2.f5639l.set(false);
                break;
            default:
                C1573D2 c1573d22 = this.f5603b;
                EnumC1605L2 enumC1605L2Mo3629o2 = c1573d22.mo3629o();
                if (enumC1605L2Mo3629o2 == null) {
                    enumC1605L2Mo3629o2 = EnumC1605L2.DEADLINE_EXCEEDED;
                }
                c1573d22.mo3622h(enumC1605L2Mo3629o2, c1573d22.f5645r.f5841g != null, null);
                c1573d22.f5640m.set(false);
                break;
        }
    }
}
