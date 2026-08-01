package kotlinx.coroutines;

import com.bumptech.glide.AbstractC3054;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.C5359;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5404 extends C5359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15047 = AtomicIntegerFieldUpdater.newUpdater(C5404.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.C5359, kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo10379(Object obj) throws DispatchException {
        mo10380(obj);
    }

    @Override // kotlinx.coroutines.internal.C5359, kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo10380(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15047;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    C5919.m11250("Already resumed");
                    return;
                } else {
                    AbstractC5352.m10366(AbstractC5398.m10471(obj), AbstractC3054.m6602(this.f14942));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
