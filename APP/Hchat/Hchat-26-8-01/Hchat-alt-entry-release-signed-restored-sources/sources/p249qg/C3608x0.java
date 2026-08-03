package p249qg;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okio.C3193a;

/* JADX INFO: renamed from: qg.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3608x0 implements InterfaceC3589o0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11637h = AtomicIntegerFieldUpdater.newUpdater(C3608x0.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11638i = AtomicReferenceFieldUpdater.newUpdater(C3608x0.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11639j = AtomicReferenceFieldUpdater.newUpdater(C3608x0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: g */
    public final C3548a1 f11640g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3608x0(C3548a1 c3548a1, Throwable th2) {
        this.f11640g = c3548a1;
        this._rootCause$volatile = th2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m7573a(Throwable th2) {
        Throwable thM7574c = m7574c();
        if (thM7574c == null) {
            f11638i.set(this, th2);
            return;
        }
        if (th2 == thM7574c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11639j;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                C3193a.m6826p(obj, "State is ");
                return;
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3589o0
    /* JADX INFO: renamed from: b */
    public final boolean mo7476b() {
        return m7574c() == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Throwable m7574c() {
        return (Throwable) f11638i.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3589o0
    /* JADX INFO: renamed from: d */
    public final C3548a1 mo7477d() {
        return this.f11640g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m7575e() {
        return m7574c() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final ArrayList m7576f(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11639j;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                C3193a.m6826p(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM7574c = m7574c();
        if (thM7574c != null) {
            arrayList.add(0, thM7574c);
        }
        if (th2 != null && !th2.equals(thM7574c)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC3603v.f11626h);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(m7575e());
        sb2.append(", completing=");
        sb2.append(f11637h.get(this) != 0);
        sb2.append(", rootCause=");
        sb2.append(m7574c());
        sb2.append(", exceptions=");
        sb2.append(f11639j.get(this));
        sb2.append(", list=");
        sb2.append(this.f11640g);
        sb2.append(']');
        return sb2.toString();
    }
}
