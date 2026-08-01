package kotlinx.coroutines;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5463 implements InterfaceC5469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ long f15117;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15118;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15119;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15120 = AtomicIntegerFieldUpdater.newUpdater(C5463.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15121 = AtomicReferenceFieldUpdater.newUpdater(C5463.class, Object.class, "_rootCause$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5457 f15122;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f15119 = unsafe.objectFieldOffset(C5463.class.getDeclaredField("_rootCause$volatile"));
        f15118 = AtomicReferenceFieldUpdater.newUpdater(C5463.class, Object.class, "_exceptionsHolder$volatile");
        f15117 = unsafe.objectFieldOffset(C5463.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public C5463(C5457 c5457, Throwable th) {
        this.f15122 = c5457;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m10590());
        sb.append(", completing=");
        sb.append(f15120.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m10591());
        sb.append(", exceptions=");
        sb.append(m10592());
        sb.append(", list=");
        sb.append(this.f15122);
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC5469
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo10454() {
        return m10591() == null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m10589(Throwable th) {
        ArrayList arrayList;
        Object objM10592 = m10592();
        if (objM10592 == null) {
            arrayList = new ArrayList(4);
        } else if (objM10592 instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objM10592);
            arrayList = arrayList2;
        } else {
            if (!(objM10592 instanceof ArrayList)) {
                C4210.m8602(objM10592, "State is ");
                return null;
            }
            arrayList = (ArrayList) objM10592;
        }
        Throwable thM10591 = m10591();
        if (thM10591 != null) {
            arrayList.add(0, thM10591);
        }
        if (th != null && !th.equals(thM10591)) {
            arrayList.add(th);
        }
        m10594(AbstractC5398.f15039);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m10590() {
        return m10591() != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Throwable m10591() {
        f15121.getClass();
        return (Throwable) AbstractC8501.f23600.getObjectVolatile(this, f15119);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m10592() {
        f15118.getClass();
        return AbstractC8501.f23600.getObjectVolatile(this, f15117);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10593(Throwable th) {
        Throwable thM10591 = m10591();
        if (thM10591 == null) {
            m10595(th);
            return;
        }
        if (th == thM10591) {
            return;
        }
        Object objM10592 = m10592();
        if (objM10592 == null) {
            m10594(th);
            return;
        }
        if (!(objM10592 instanceof Throwable)) {
            if (objM10592 instanceof ArrayList) {
                ((ArrayList) objM10592).add(th);
                return;
            } else {
                C4210.m8602(objM10592, "State is ");
                return;
            }
        }
        if (th == objM10592) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objM10592);
        arrayList.add(th);
        m10594(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m10594(Object obj) {
        f15118.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f15117, obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5469
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final C5457 mo10455() {
        return this.f15122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10595(Throwable th) {
        f15121.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f15119, th);
    }
}
