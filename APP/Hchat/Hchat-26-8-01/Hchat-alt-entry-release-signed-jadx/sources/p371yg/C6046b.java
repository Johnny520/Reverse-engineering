package p371yg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import p162l3.C2463q;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: yg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6046b extends C6050f {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24500g = AtomicReferenceFieldUpdater.newUpdater(C6046b.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = AbstractC6047c.f24501a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m10805c() {
        return Math.max(C6050f.f24508f.get(this), 0) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m10806d(AbstractC6038c abstractC6038c) {
        boolean zM10807e = m10807e();
        C3967n c3967n = C3967n.f12976a;
        if (!zM10807e) {
            C3564g c3564gM7558l = AbstractC3603v.m7558l(AbstractC1184v0.m3214x(abstractC6038c));
            try {
                m10809a(new C6045a(this, c3564gM7558l));
                Object objM7512o = c3564gM7558l.m7512o();
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM7512o != enumC5799a) {
                    objM7512o = c3967n;
                }
                if (objM7512o == enumC5799a) {
                    return objM7512o;
                }
            } catch (Throwable th2) {
                c3564gM7558l.m7519x();
                throw th2;
            }
        }
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m10807e() {
        int i9;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6050f.f24508f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > 1) {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f24500g.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10808f(Object obj) {
        while (m10805c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24500g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2463q c2463q = AbstractC6047c.f24501a;
            if (obj2 != c2463q) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2463q)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m10810b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        C2104o.m5276A("This mutex is not locked");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Mutex@" + AbstractC3603v.m7556j(this) + "[isLocked=" + m10805c() + ",owner=" + f24500g.get(this) + ']';
    }
}
