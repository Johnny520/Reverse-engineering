package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15267;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15270 = AtomicReferenceFieldUpdater.newUpdater(AbstractC6184.class, Object.class, "_next$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15269 = unsafe.objectFieldOffset(AbstractC6184.class.getDeclaredField("_next$volatile"));
        f15268 = AtomicReferenceFieldUpdater.newUpdater(AbstractC6184.class, Object.class, "_prev$volatile");
        f15267 = unsafe.objectFieldOffset(AbstractC6184.class.getDeclaredField("_prev$volatile"));
    }

    public AbstractC6184(AbstractC6193 abstractC6193) {
        this._prev$volatile = abstractC6193;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC6184 m10912() {
        f15268.getClass();
        return (AbstractC6184) AbstractC9322.f23936.getObjectVolatile(this, f15267);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m10913() {
        f15270.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15269);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC6184 m10914() {
        Object objM10913 = m10913();
        if (objM10913 == AbstractC6185.f15276) {
            return null;
        }
        return (AbstractC6184) objM10913;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC6184 m10915() {
        AbstractC6184 abstractC6184M10912 = m10912();
        while (abstractC6184M10912 != null && abstractC6184M10912.mo10918()) {
            f15268.getClass();
            abstractC6184M10912 = (AbstractC6184) AbstractC9322.f23936.getObjectVolatile(abstractC6184M10912, f15267);
        }
        return abstractC6184M10912;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10916() {
        f15268.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15267, (Object) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m10917() {
        C5317 c5317 = AbstractC6185.f15276;
        while (true) {
            f15270.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15269;
            AbstractC6184 abstractC6184 = this;
            if (unsafe.compareAndSwapObject(abstractC6184, j, (Object) null, c5317)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC6184, j) != null) {
                return false;
            }
            this = abstractC6184;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract boolean mo10918();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10919() {
        AbstractC6184 abstractC6184;
        Unsafe unsafe;
        if (m10914() == null) {
            return;
        }
        while (true) {
            AbstractC6184 abstractC6184M10915 = m10915();
            AbstractC6184 abstractC6184M10914 = m10914();
            abstractC6184M10914.getClass();
            do {
                abstractC6184 = abstractC6184M10914;
                if (!abstractC6184.mo10918()) {
                    break;
                } else {
                    abstractC6184M10914 = abstractC6184.m10914();
                }
            } while (abstractC6184M10914 != null);
            while (true) {
                f15268.getClass();
                Unsafe unsafe2 = AbstractC9322.f23936;
                long j = f15267;
                Object objectVolatile = unsafe2.getObjectVolatile(abstractC6184, j);
                AbstractC6184 abstractC61842 = ((AbstractC6184) objectVolatile) == null ? null : abstractC6184M10915;
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(abstractC6184, f15267, objectVolatile, abstractC61842)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(abstractC6184, j) == objectVolatile);
            }
            if (abstractC6184M10915 != null) {
                f15270.getClass();
                unsafe.putObjectVolatile(abstractC6184M10915, f15269, abstractC6184);
            }
            if (!abstractC6184.mo10918() || abstractC6184.m10914() == null) {
                if (abstractC6184M10915 == null || !abstractC6184M10915.mo10918()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m10920(AbstractC6193 abstractC6193) {
        while (true) {
            f15270.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15269;
            AbstractC6184 abstractC6184 = this;
            AbstractC6193 abstractC61932 = abstractC6193;
            if (unsafe.compareAndSwapObject(abstractC6184, j, (Object) null, abstractC61932)) {
                return true;
            }
            if (unsafe.getObjectVolatile(abstractC6184, j) != null) {
                return false;
            }
            this = abstractC6184;
            abstractC6193 = abstractC61932;
        }
    }
}
