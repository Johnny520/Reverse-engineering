package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5351 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f14924;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14925 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5351.class, Object.class, "_next$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f14924 = unsafe.objectFieldOffset(AbstractC5351.class.getDeclaredField("_next$volatile"));
        f14923 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5351.class, Object.class, "_prev$volatile");
        f14922 = unsafe.objectFieldOffset(AbstractC5351.class.getDeclaredField("_prev$volatile"));
    }

    public AbstractC5351(AbstractC5360 abstractC5360) {
        this._prev$volatile = abstractC5360;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5351 m10349() {
        f14923.getClass();
        return (AbstractC5351) AbstractC8501.f23600.getObjectVolatile(this, f14922);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m10350() {
        f14925.getClass();
        return AbstractC8501.f23600.getObjectVolatile(this, f14924);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5351 m10351() {
        Object objM10350 = m10350();
        if (objM10350 == AbstractC5352.f14931) {
            return null;
        }
        return (AbstractC5351) objM10350;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5351 m10352() {
        AbstractC5351 abstractC5351M10349 = m10349();
        while (abstractC5351M10349 != null && abstractC5351M10349.mo10355()) {
            f14923.getClass();
            abstractC5351M10349 = (AbstractC5351) AbstractC8501.f23600.getObjectVolatile(abstractC5351M10349, f14922);
        }
        return abstractC5351M10349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10353() {
        f14923.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f14922, (Object) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m10354() {
        C4484 c4484 = AbstractC5352.f14931;
        while (true) {
            f14925.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14924;
            AbstractC5351 abstractC5351 = this;
            if (unsafe.compareAndSwapObject(abstractC5351, j, (Object) null, c4484)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC5351, j) != null) {
                return false;
            }
            this = abstractC5351;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract boolean mo10355();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10356() {
        AbstractC5351 abstractC5351;
        Unsafe unsafe;
        if (m10351() == null) {
            return;
        }
        while (true) {
            AbstractC5351 abstractC5351M10352 = m10352();
            AbstractC5351 abstractC5351M10351 = m10351();
            abstractC5351M10351.getClass();
            do {
                abstractC5351 = abstractC5351M10351;
                if (!abstractC5351.mo10355()) {
                    break;
                } else {
                    abstractC5351M10351 = abstractC5351.m10351();
                }
            } while (abstractC5351M10351 != null);
            while (true) {
                f14923.getClass();
                Unsafe unsafe2 = AbstractC8501.f23600;
                long j = f14922;
                Object objectVolatile = unsafe2.getObjectVolatile(abstractC5351, j);
                AbstractC5351 abstractC53512 = ((AbstractC5351) objectVolatile) == null ? null : abstractC5351M10352;
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(abstractC5351, f14922, objectVolatile, abstractC53512)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(abstractC5351, j) == objectVolatile);
            }
            if (abstractC5351M10352 != null) {
                f14925.getClass();
                unsafe.putObjectVolatile(abstractC5351M10352, f14924, abstractC5351);
            }
            if (!abstractC5351.mo10355() || abstractC5351.m10351() == null) {
                if (abstractC5351M10352 == null || !abstractC5351M10352.mo10355()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m10357(AbstractC5360 abstractC5360) {
        while (true) {
            f14925.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14924;
            AbstractC5351 abstractC5351 = this;
            AbstractC5360 abstractC53602 = abstractC5360;
            if (unsafe.compareAndSwapObject(abstractC5351, j, (Object) null, abstractC53602)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC5351, j) != null) {
                return false;
            }
            this = abstractC5351;
            abstractC5360 = abstractC53602;
        }
    }
}
