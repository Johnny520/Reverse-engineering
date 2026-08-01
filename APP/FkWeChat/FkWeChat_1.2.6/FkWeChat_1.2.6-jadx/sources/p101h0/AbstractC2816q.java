package p101h0;

import p215oc.C5706c;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: h0.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2816q {

    /* JADX INFO: renamed from: a */
    public C2815p f7356a;

    /* JADX INFO: renamed from: a */
    public final C2815p m10028a() {
        return this.f7356a;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10029b();

    /* JADX INFO: renamed from: c */
    public final C2815p m10030c() {
        C2815p c2815p = this.f7356a;
        if (c2815p != null) {
            return c2815p;
        }
        AbstractC6635e.m26321d("ToolbarRequester is not initialized.");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m10031d(C2815p c2815p) {
        this.f7356a = c2815p;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo10032e();
}
