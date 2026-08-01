package p135j2;

import java.util.List;
import p117i.AbstractC3071m;
import p135j2.AbstractC3580w1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p299ub.AbstractC8638t;

/* JADX INFO: renamed from: j2.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3502a2 extends IllegalStateException {

    /* JADX INFO: renamed from: q */
    public final AbstractC3071m f9717q;

    /* JADX INFO: renamed from: r */
    public final Object f9718r;

    public C3502a2(AbstractC3071m abstractC3071m, Object obj, Throwable th) {
        super(th);
        this.f9717q = abstractC3071m;
        this.f9718r = obj;
    }

    /* JADX INFO: renamed from: a */
    public final List m13040a() {
        String str;
        List listM20787c = AbstractC5112w.m20787c();
        for (int i10 = this.f9717q.f8151b - 1; i10 >= 0; i10 += -1) {
            int iM11417e = this.f9717q.m11417e(i10);
            int iM13390s = AbstractC3580w1.m13390s(iM11417e);
            AbstractC3580w1.a aVar = AbstractC3580w1.f9943a;
            if (AbstractC3580w1.m13391t(iM13390s, aVar.m13393b())) {
                str = "CancelPausedPrecomposition";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13399h())) {
                str = "ReuseForceSyncDeactivation";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13400i())) {
                str = "ReuseScheduleOutOfFrameDeactivation";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13401j())) {
                str = "ReuseSyncDeactivation";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13398g())) {
                str = "ReuseDeactivationViaHost";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13409r())) {
                str = "TookFromPrecomposeMap";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13405n())) {
                str = "Subcompose";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13407p())) {
                str = "SubcomposeNew";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13408q())) {
                str = "SubcomposePausable";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13406o())) {
                str = "SubcomposeForceReuse";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13394c())) {
                str = "DeactivateOutOfFrame";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13395d())) {
                str = "DeactivateOutOfFrameCancelled";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13403l())) {
                str = "SlotToReusedFromOnDeactivate";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13404m())) {
                str = "SlotToReusedFromOnReuse";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13402k())) {
                str = "Reused";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13397f())) {
                str = "ResumePaused";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13396e())) {
                str = "PausePaused";
            } else if (AbstractC3580w1.m13391t(iM13390s, aVar.m13392a())) {
                str = "ApplyPaused";
            } else {
                str = "Unexpected " + iM11417e;
            }
            listM20787c.add(i10 + ": " + str);
        }
        return AbstractC5112w.m20785a(listM20787c);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC8638t.m33246m("\n            |slotid=" + this.f9718r + ". Last operations:\n            |" + AbstractC5081g0.m20585s0(m13040a(), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
