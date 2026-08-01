package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class i40 implements y00 {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2441e = AtomicIntegerFieldUpdater.newUpdater(i40.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2442f = AtomicReferenceFieldUpdater.newUpdater(i40.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2443g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f2444h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ long f2445i;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: d */
    public final sj0 f2446d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Unsafe unsafe = uw0.f6315a;
        f2445i = unsafe.objectFieldOffset(i40.class.getDeclaredField("_rootCause$volatile"));
        f2443g = AtomicReferenceFieldUpdater.newUpdater(i40.class, Object.class, "_exceptionsHolder$volatile");
        f2444h = unsafe.objectFieldOffset(i40.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i40(sj0 sj0Var, Throwable th) {
        this.f2446d = sj0Var;
        this._rootCause$volatile = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1551a(Throwable th) {
        Throwable thM1553e = m1553e();
        if (thM1553e == null) {
            m1557i(th);
            return;
        }
        if (th == thM1553e) {
            return;
        }
        Object objM1552c = m1552c();
        if (objM1552c == null) {
            m1556h(th);
            return;
        }
        if (!(objM1552c instanceof Throwable)) {
            if (objM1552c instanceof ArrayList) {
                ((ArrayList) objM1552c).add(th);
                return;
            } else {
                C0921xc.m5130k(objM1552c, "State is ");
                return;
            }
        }
        if (th == objM1552c) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objM1552c);
        arrayList.add(th);
        m1556h(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y00
    /* JADX INFO: renamed from: b */
    public final boolean mo599b() {
        return m1553e() == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m1552c() {
        f2443g.getClass();
        return uw0.f6315a.getObjectVolatile(this, f2444h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y00
    /* JADX INFO: renamed from: d */
    public final sj0 mo600d() {
        return this.f2446d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Throwable m1553e() {
        f2442f.getClass();
        return (Throwable) uw0.f6315a.getObjectVolatile(this, f2445i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1554f() {
        return m1553e() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final ArrayList m1555g(Throwable th) {
        ArrayList arrayList;
        Object objM1552c = m1552c();
        if (objM1552c == null) {
            arrayList = new ArrayList(4);
        } else if (objM1552c instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objM1552c);
            arrayList = arrayList2;
        } else {
            if (!(objM1552c instanceof ArrayList)) {
                C0921xc.m5130k(objM1552c, "State is ");
                return null;
            }
            arrayList = (ArrayList) objM1552c;
        }
        Throwable thM1553e = m1553e();
        if (thM1553e != null) {
            arrayList.add(0, thM1553e);
        }
        if (th != null && !th.equals(thM1553e)) {
            arrayList.add(th);
        }
        m1556h(s91.f5714p);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1556h(Object obj) {
        f2443g.getClass();
        uw0.f6315a.putObjectVolatile(this, f2444h, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1557i(Throwable th) {
        f2442f.getClass();
        uw0.f6315a.putObjectVolatile(this, f2445i, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m1554f());
        sb.append(", completing=");
        sb.append(f2441e.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m1553e());
        sb.append(", exceptions=");
        sb.append(m1552c());
        sb.append(", list=");
        sb.append(this.f2446d);
        sb.append(']');
        return sb.toString();
    }
}
