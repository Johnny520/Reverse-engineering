package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f14922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f14924;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14925 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5352.class, Object.class, "_next$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f14924 = unsafe.objectFieldOffset(AbstractC5352.class.getDeclaredField("_next$volatile"));
        f14923 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5352.class, Object.class, "_prev$volatile");
        f14922 = unsafe.objectFieldOffset(AbstractC5352.class.getDeclaredField("_prev$volatile"));
    }

    public AbstractC5352(AbstractC5361 abstractC5361) {
        this._prev$volatile = abstractC5361;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5352 m10353() {
        f14923.getClass();
        return (AbstractC5352) AbstractC8493.f23591.getObjectVolatile(this, f14922);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m10354() {
        f14925.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f14924);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5352 m10355() {
        Object objM10354 = m10354();
        if (objM10354 == AbstractC5353.f14931) {
            return null;
        }
        return (AbstractC5352) objM10354;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC5352 m10356() {
        AbstractC5352 abstractC5352M10353 = m10353();
        while (abstractC5352M10353 != null && abstractC5352M10353.mo10359()) {
            f14923.getClass();
            abstractC5352M10353 = (AbstractC5352) AbstractC8493.f23591.getObjectVolatile(abstractC5352M10353, f14922);
        }
        return abstractC5352M10353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10357() {
        f14923.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f14922, (Object) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m10358() {
        C4485 c4485 = AbstractC5353.f14931;
        while (true) {
            f14925.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14924;
            AbstractC5352 abstractC5352 = this;
            if (unsafe.compareAndSwapObject(abstractC5352, j, (Object) null, c4485)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC5352, j) != null) {
                return false;
            }
            this = abstractC5352;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract boolean mo10359();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10360() {
        AbstractC5352 abstractC5352;
        Unsafe unsafe;
        if (m10355() == null) {
            return;
        }
        while (true) {
            AbstractC5352 abstractC5352M10356 = m10356();
            AbstractC5352 abstractC5352M10355 = m10355();
            abstractC5352M10355.getClass();
            do {
                abstractC5352 = abstractC5352M10355;
                if (!abstractC5352.mo10359()) {
                    break;
                } else {
                    abstractC5352M10355 = abstractC5352.m10355();
                }
            } while (abstractC5352M10355 != null);
            while (true) {
                f14923.getClass();
                Unsafe unsafe2 = AbstractC8493.f23591;
                long j = f14922;
                Object objectVolatile = unsafe2.getObjectVolatile(abstractC5352, j);
                AbstractC5352 abstractC53522 = ((AbstractC5352) objectVolatile) == null ? null : abstractC5352M10356;
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(abstractC5352, f14922, objectVolatile, abstractC53522)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(abstractC5352, j) == objectVolatile);
            }
            if (abstractC5352M10356 != null) {
                f14925.getClass();
                unsafe.putObjectVolatile(abstractC5352M10356, f14924, abstractC5352);
            }
            if (!abstractC5352.mo10359() || abstractC5352.m10355() == null) {
                if (abstractC5352M10356 == null || !abstractC5352M10356.mo10359()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m10361(AbstractC5361 abstractC5361) {
        while (true) {
            f14925.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14924;
            AbstractC5352 abstractC5352 = this;
            AbstractC5361 abstractC53612 = abstractC5361;
            if (unsafe.compareAndSwapObject(abstractC5352, j, (Object) null, abstractC53612)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC5352, j) != null) {
                return false;
            }
            this = abstractC5352;
            abstractC5361 = abstractC53612;
        }
    }
}
