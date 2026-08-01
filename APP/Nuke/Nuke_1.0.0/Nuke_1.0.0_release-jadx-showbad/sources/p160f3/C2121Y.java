package p160f3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: f3.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C2121Y implements InterfaceC2112O {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7058e = AtomicIntegerFieldUpdater.newUpdater(C2121Y.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7059f = AtomicReferenceFieldUpdater.newUpdater(C2121Y.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7060g = AtomicReferenceFieldUpdater.newUpdater(C2121Y.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: d */
    public final C2126b0 f7061d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2121Y(C2126b0 c2126b0, Throwable th) {
        this.f7061d = c2126b0;
        this._rootCause$volatile = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3916a(Throwable th) {
        Throwable thM3917c = m3917c();
        if (thM3917c == null) {
            f7059f.set(this, th);
            return;
        }
        if (th == thM3917c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060g;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2112O
    /* JADX INFO: renamed from: b */
    public final boolean mo3886b() {
        return m3917c() == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Throwable m3917c() {
        return (Throwable) f7059f.get(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2112O
    /* JADX INFO: renamed from: d */
    public final C2126b0 mo3887d() {
        return this.f7061d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m3918e() {
        return m3917c() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final ArrayList m3919f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060g;
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
        Throwable thM3917c = m3917c();
        if (thM3917c != null) {
            arrayList.add(0, thM3917c);
        }
        if (th != null && !th.equals(thM3917c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC2162v.f7117h);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m3918e());
        sb.append(", completing=");
        sb.append(f7058e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m3917c());
        sb.append(", exceptions=");
        sb.append(f7060g.get(this));
        sb.append(", list=");
        sb.append(this.f7061d);
        sb.append(']');
        return sb.toString();
    }
}
