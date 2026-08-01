package kotlinx.coroutines;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6296 implements InterfaceC6302 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f15462;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15463;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15465 = AtomicIntegerFieldUpdater.newUpdater(C6296.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15466 = AtomicReferenceFieldUpdater.newUpdater(C6296.class, Object.class, "_rootCause$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6290 f15467;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15464 = unsafe.objectFieldOffset(C6296.class.getDeclaredField("_rootCause$volatile"));
        f15463 = AtomicReferenceFieldUpdater.newUpdater(C6296.class, Object.class, "_exceptionsHolder$volatile");
        f15462 = unsafe.objectFieldOffset(C6296.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public C6296(C6290 c6290, Throwable th) {
        this.f15467 = c6290;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m11153());
        sb.append(", completing=");
        sb.append(f15465.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m11154());
        sb.append(", exceptions=");
        sb.append(m11155());
        sb.append(", list=");
        sb.append(this.f15467);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC6302
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo11017() {
        return m11154() == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m11152(Throwable th) {
        ArrayList arrayList;
        Object objM11155 = m11155();
        if (objM11155 == null) {
            arrayList = new ArrayList(4);
        } else if (objM11155 instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objM11155);
            arrayList = arrayList2;
        } else {
            if (!(objM11155 instanceof ArrayList)) {
                C5043.m9151(objM11155, "State is ");
                return null;
            }
            arrayList = (ArrayList) objM11155;
        }
        Throwable thM11154 = m11154();
        if (thM11154 != null) {
            arrayList.add(0, thM11154);
        }
        if (th != null && !th.equals(thM11154)) {
            arrayList.add(th);
        }
        m11157(AbstractC6231.f15384);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m11153() {
        return m11154() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable m11154() {
        f15466.getClass();
        return (Throwable) AbstractC9322.f23936.getObjectVolatile(this, f15464);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m11155() {
        f15463.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15462);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11156(Throwable th) {
        Throwable thM11154 = m11154();
        if (thM11154 == null) {
            m11158(th);
            return;
        }
        if (th == thM11154) {
            return;
        }
        Object objM11155 = m11155();
        if (objM11155 == null) {
            m11157(th);
            return;
        }
        if (!(objM11155 instanceof Throwable)) {
            if (objM11155 instanceof ArrayList) {
                ((ArrayList) objM11155).add(th);
                return;
            } else {
                C5043.m9151(objM11155, "State is ");
                return;
            }
        }
        if (th == objM11155) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objM11155);
        arrayList.add(th);
        m11157(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m11157(Object obj) {
        f15463.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15462, obj);
    }

    @Override // kotlinx.coroutines.InterfaceC6302
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C6290 mo11018() {
        return this.f15467;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m11158(Throwable th) {
        f15466.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15464, th);
    }
}
