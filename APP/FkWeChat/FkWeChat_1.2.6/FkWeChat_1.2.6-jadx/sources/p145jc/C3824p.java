package p145jc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: jc.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3824p {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11009a = AtomicReferenceFieldUpdater.newUpdater(C3824p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C3824p(boolean z10) {
        this._cur$volatile = new C3826q(8, z10);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15235a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11009a;
        while (true) {
            C3826q c3826q = (C3826q) atomicReferenceFieldUpdater.get(this);
            int iM15241a = c3826q.m15241a(obj);
            if (iM15241a == 0) {
                return true;
            }
            if (iM15241a == 1) {
                AbstractC5489b.m22334a(f11009a, this, c3826q, c3826q.m15250l());
            } else if (iM15241a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15236b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11009a;
        while (true) {
            C3826q c3826q = (C3826q) atomicReferenceFieldUpdater.get(this);
            if (c3826q.m15244d()) {
                return;
            } else {
                AbstractC5489b.m22334a(f11009a, this, c3826q, c3826q.m15250l());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m15237c() {
        return ((C3826q) f11009a.get(this)).m15247g();
    }

    /* JADX INFO: renamed from: e */
    public final Object m15238e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11009a;
        while (true) {
            C3826q c3826q = (C3826q) atomicReferenceFieldUpdater.get(this);
            Object objM15251m = c3826q.m15251m();
            if (objM15251m != C3826q.f11013h) {
                return objM15251m;
            }
            AbstractC5489b.m22334a(f11009a, this, c3826q, c3826q.m15250l());
        }
    }
}
