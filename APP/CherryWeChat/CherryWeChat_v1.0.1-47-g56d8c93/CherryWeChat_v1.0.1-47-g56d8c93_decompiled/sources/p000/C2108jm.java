package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: jm */
/* JADX INFO: loaded from: classes.dex */
public final class C2108jm implements InterfaceC1418fl {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7408b = AtomicIntegerFieldUpdater.newUpdater(C2108jm.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7409c = AtomicReferenceFieldUpdater.newUpdater(C2108jm.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7410d = AtomicReferenceFieldUpdater.newUpdater(C2108jm.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a */
    public final C0851Ts f7411a;

    public C2108jm(C0851Ts c0851Ts, Throwable th) {
        this.f7411a = c0851Ts;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: a */
    public final void m4294a(Throwable th) {
        Throwable thM4295b = m4295b();
        if (thM4295b == null) {
            f7409c.set(this, th);
            return;
        }
        if (th == thM4295b) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7410d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m4295b() {
        return (Throwable) f7409c.get(this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4296c() {
        return m4295b() != null;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: d */
    public final boolean mo564d() {
        return m4295b() == null;
    }

    @Override // p000.InterfaceC1418fl
    /* JADX INFO: renamed from: e */
    public final C0851Ts mo565e() {
        return this.f7411a;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m4297f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7410d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM4295b = m4295b();
        if (thM4295b != null) {
            arrayList.add(0, thM4295b);
        }
        if (th != null && !th.equals(thM4295b)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0295Gu.f1001f);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m4296c());
        sb.append(", completing=");
        sb.append(f7408b.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m4295b());
        sb.append(", exceptions=");
        sb.append(f7410d.get(this));
        sb.append(", list=");
        sb.append(this.f7411a);
        sb.append(']');
        return sb.toString();
    }
}
