package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q21 implements cy0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8707i = AtomicIntegerFieldUpdater.newUpdater(q21.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8708j = AtomicReferenceFieldUpdater.newUpdater(q21.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8709k = AtomicReferenceFieldUpdater.newUpdater(q21.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: h */
    public final bo1 f8710h;

    public q21(bo1 bo1Var, Throwable th) {
        this.f8710h = bo1Var;
        this._rootCause$volatile = th;
    }

    /* JADX INFO: renamed from: a */
    public final void m4042a(Throwable th) {
        Throwable thM4043c = m4043c();
        if (thM4043c == null) {
            f8708j.set(this, th);
            return;
        }
        if (th == thM4043c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8709k;
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
                c80.m677u("State is ", obj);
                return;
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

    @Override // p000.cy0
    /* JADX INFO: renamed from: b */
    public final boolean mo302b() {
        return m4043c() == null;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m4043c() {
        return (Throwable) f8708j.get(this);
    }

    @Override // p000.cy0
    /* JADX INFO: renamed from: d */
    public final bo1 mo303d() {
        return this.f8710h;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4044e() {
        return m4043c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m4045f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8709k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                c80.m677u("State is ", obj);
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM4043c = m4043c();
        if (thM4043c != null) {
            arrayList.add(0, thM4043c);
        }
        if (th != null && !th.equals(thM4043c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0179eu.f2635i);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m4044e());
        sb.append(", completing=");
        sb.append(f8707i.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m4043c());
        sb.append(", exceptions=");
        sb.append(f8709k.get(this));
        sb.append(", list=");
        sb.append(this.f8710h);
        sb.append(']');
        return sb.toString();
    }
}
