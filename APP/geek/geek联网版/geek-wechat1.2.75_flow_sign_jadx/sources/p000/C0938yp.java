package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: yp */
/* JADX INFO: loaded from: classes.dex */
public final class C0938yp implements InterfaceC0974zo {

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f5477b = AtomicIntegerFieldUpdater.newUpdater(C0938yp.class, "_isCompleting");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f5478c = AtomicReferenceFieldUpdater.newUpdater(C0938yp.class, Object.class, "_rootCause");

    /* JADX INFO: renamed from: d */
    public static final AtomicReferenceFieldUpdater f5479d = AtomicReferenceFieldUpdater.newUpdater(C0938yp.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* JADX INFO: renamed from: a */
    public final C0796uw f5480a;

    public C0938yp(C0796uw c0796uw, Throwable th) {
        this.f5480a = c0796uw;
        this._rootCause = th;
    }

    @Override // p000.InterfaceC0974zo
    /* JADX INFO: renamed from: a */
    public final boolean mo2497a() {
        return m2771c() == null;
    }

    /* JADX INFO: renamed from: b */
    public final void m2770b(Throwable th) {
        Throwable thM2771c = m2771c();
        if (thM2771c == null) {
            f5478c.set(this, th);
            return;
        }
        if (th == thM2771c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5479d;
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

    /* JADX INFO: renamed from: c */
    public final Throwable m2771c() {
        return (Throwable) f5478c.get(this);
    }

    @Override // p000.InterfaceC0974zo
    /* JADX INFO: renamed from: d */
    public final C0796uw mo2498d() {
        return this.f5480a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2772e() {
        return m2771c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2773f() {
        return f5477b.get(this) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m2774g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5479d;
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
        Throwable thM2771c = m2771c();
        if (thM2771c != null) {
            arrayList.add(0, thM2771c);
        }
        if (th != null && !th.equals(thM2771c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0493mp.f3172j);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + m2772e() + ", completing=" + m2773f() + ", rootCause=" + m2771c() + ", exceptions=" + f5479d.get(this) + ", list=" + this.f5480a + ']';
    }
}
