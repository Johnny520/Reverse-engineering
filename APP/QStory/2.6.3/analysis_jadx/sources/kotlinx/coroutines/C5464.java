package kotlinx.coroutines;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5464 implements InterfaceC5470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f15117;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15118;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15119;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15120 = AtomicIntegerFieldUpdater.newUpdater(C5464.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15121 = AtomicReferenceFieldUpdater.newUpdater(C5464.class, Object.class, "_rootCause$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5458 f15122;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f15119 = unsafe.objectFieldOffset(C5464.class.getDeclaredField("_rootCause$volatile"));
        f15118 = AtomicReferenceFieldUpdater.newUpdater(C5464.class, Object.class, "_exceptionsHolder$volatile");
        f15117 = unsafe.objectFieldOffset(C5464.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public C5464(C5458 c5458, Throwable th) {
        this.f15122 = c5458;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m10594());
        sb.append(", completing=");
        sb.append(f15120.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m10595());
        sb.append(", exceptions=");
        sb.append(m10596());
        sb.append(", list=");
        sb.append(this.f15122);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC5470
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10458() {
        return m10595() == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m10593(Throwable th) {
        ArrayList arrayList;
        Object objM10596 = m10596();
        if (objM10596 == null) {
            arrayList = new ArrayList(4);
        } else if (objM10596 instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objM10596);
            arrayList = arrayList2;
        } else {
            if (!(objM10596 instanceof ArrayList)) {
                C4211.m8592(objM10596, "State is ");
                return null;
            }
            arrayList = (ArrayList) objM10596;
        }
        Throwable thM10595 = m10595();
        if (thM10595 != null) {
            arrayList.add(0, thM10595);
        }
        if (th != null && !th.equals(thM10595)) {
            arrayList.add(th);
        }
        m10598(AbstractC5399.f15039);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m10594() {
        return m10595() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable m10595() {
        f15121.getClass();
        return (Throwable) AbstractC8493.f23591.getObjectVolatile(this, f15119);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m10596() {
        f15118.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f15117);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10597(Throwable th) {
        Throwable thM10595 = m10595();
        if (thM10595 == null) {
            m10599(th);
            return;
        }
        if (th == thM10595) {
            return;
        }
        Object objM10596 = m10596();
        if (objM10596 == null) {
            m10598(th);
            return;
        }
        if (!(objM10596 instanceof Throwable)) {
            if (objM10596 instanceof ArrayList) {
                ((ArrayList) objM10596).add(th);
                return;
            } else {
                C4211.m8592(objM10596, "State is ");
                return;
            }
        }
        if (th == objM10596) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objM10596);
        arrayList.add(th);
        m10598(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10598(Object obj) {
        f15118.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f15117, obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5470
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C5458 mo10459() {
        return this.f15122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10599(Throwable th) {
        f15121.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f15119, th);
    }
}
