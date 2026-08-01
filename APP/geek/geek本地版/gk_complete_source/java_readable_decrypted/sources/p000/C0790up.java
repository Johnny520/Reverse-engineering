package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: up */
/* JADX INFO: loaded from: classes.dex */
public final class C0790up implements InterfaceC0826vo {

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f4746b = AtomicIntegerFieldUpdater.newUpdater(C0790up.class, "_isCompleting");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f4747c = AtomicReferenceFieldUpdater.newUpdater(C0790up.class, Object.class, "_rootCause");

    /* JADX INFO: renamed from: d */
    public static final AtomicReferenceFieldUpdater f4748d = AtomicReferenceFieldUpdater.newUpdater(C0790up.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* JADX INFO: renamed from: a */
    public final C0500mw f4749a;

    public C0790up(C0500mw c0500mw, Throwable th) {
        this.f4749a = c0500mw;
        this._rootCause = th;
    }

    @Override // p000.InterfaceC0826vo
    /* JADX INFO: renamed from: a */
    public final boolean mo1875a() {
        return m2460c() == null;
    }

    /* JADX INFO: renamed from: b */
    public final void m2459b(Throwable th) {
        Throwable thM2460c = m2460c();
        if (thM2460c == null) {
            f4747c.set(this, th);
            return;
        }
        if (th == thM2460c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4748d;
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
    public final Throwable m2460c() {
        return (Throwable) f4747c.get(this);
    }

    @Override // p000.InterfaceC0826vo
    /* JADX INFO: renamed from: d */
    public final C0500mw mo1876d() {
        return this.f4749a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2461e() {
        return m2460c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2462f() {
        return f4746b.get(this) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m2463g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4748d;
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
        Throwable thM2460c = m2460c();
        if (thM2460c != null) {
            arrayList.add(0, thM2460c);
        }
        if (th != null && !th.equals(thM2460c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0346ip.f2481j);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + m2461e() + ", completing=" + m2462f() + ", rootCause=" + m2460c() + ", exceptions=" + f4748d.get(this) + ", list=" + this.f4749a + ']';
    }
}
