package p145jc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: jc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3796b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10970a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3796b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10971b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3796b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC3796b(AbstractC3796b abstractC3796b) {
        this._prev$volatile = abstractC3796b;
    }

    /* JADX INFO: renamed from: c */
    public final void m15134c() {
        f10971b.set(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC3796b m15135d() {
        AbstractC3796b abstractC3796bM15139h = m15139h();
        while (abstractC3796bM15139h != null && abstractC3796bM15139h.mo15127k()) {
            abstractC3796bM15139h = (AbstractC3796b) f10971b.get(abstractC3796bM15139h);
        }
        return abstractC3796bM15139h;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC3796b m15136e() {
        AbstractC3796b abstractC3796bM15137f;
        AbstractC3796b abstractC3796bM15137f2 = m15137f();
        abstractC3796bM15137f2.getClass();
        while (abstractC3796bM15137f2.mo15127k() && (abstractC3796bM15137f = abstractC3796bM15137f2.m15137f()) != null) {
            abstractC3796bM15137f2 = abstractC3796bM15137f;
        }
        return abstractC3796bM15137f2;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC3796b m15137f() {
        Object objM15138g = m15138g();
        if (objM15138g == AbstractC3794a.f10967a) {
            return null;
        }
        return (AbstractC3796b) objM15138g;
    }

    /* JADX INFO: renamed from: g */
    public final Object m15138g() {
        return f10970a.get(this);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC3796b m15139h() {
        return (AbstractC3796b) f10971b.get(this);
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo15127k();

    /* JADX INFO: renamed from: l */
    public final boolean m15140l() {
        return m15137f() == null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m15141m() {
        return AbstractC5489b.m22334a(f10970a, this, null, AbstractC3794a.f10967a);
    }

    /* JADX INFO: renamed from: n */
    public final void m15142n() {
        Object obj;
        if (m15140l()) {
            return;
        }
        while (true) {
            AbstractC3796b abstractC3796bM15135d = m15135d();
            AbstractC3796b abstractC3796bM15136e = m15136e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10971b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC3796bM15136e);
            } while (!AbstractC5489b.m22334a(atomicReferenceFieldUpdater, abstractC3796bM15136e, obj, ((AbstractC3796b) obj) == null ? null : abstractC3796bM15135d));
            if (abstractC3796bM15135d != null) {
                f10970a.set(abstractC3796bM15135d, abstractC3796bM15136e);
            }
            if (!abstractC3796bM15136e.mo15127k() || abstractC3796bM15136e.m15140l()) {
                if (abstractC3796bM15135d == null || !abstractC3796bM15135d.mo15127k()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m15143o(AbstractC3796b abstractC3796b) {
        return AbstractC5489b.m22334a(f10970a, this, null, abstractC3796b);
    }
}
