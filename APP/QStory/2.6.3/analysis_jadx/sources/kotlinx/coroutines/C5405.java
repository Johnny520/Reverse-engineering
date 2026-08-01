package kotlinx.coroutines;

import androidx.window.area.AbstractC2567;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.C5360;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5405 extends C5360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15047 = AtomicIntegerFieldUpdater.newUpdater(C5405.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.C5360, kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo10383(Object obj) throws DispatchException {
        mo10384(obj);
    }

    @Override // kotlinx.coroutines.internal.C5360, kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo10384(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15047;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    C5925.m11311("Already resumed");
                    return;
                } else {
                    AbstractC5353.m10370(AbstractC5399.m10475(obj), AbstractC2567.m5064(this.f14942));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
