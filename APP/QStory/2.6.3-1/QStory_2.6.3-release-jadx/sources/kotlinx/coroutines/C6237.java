package kotlinx.coroutines;

import androidx.window.area.AbstractC3400;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.C6192;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6237 extends C6192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15392 = AtomicIntegerFieldUpdater.newUpdater(C6237.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlinx.coroutines.internal.C6192, kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo10942(Object obj) throws DispatchException {
        mo10943(obj);
    }

    @Override // kotlinx.coroutines.internal.C6192, kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final void mo10943(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f15392;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    C6755.m11870("Already resumed");
                    return;
                } else {
                    AbstractC6185.m10929(AbstractC6231.m11034(obj), AbstractC3400.m5624(this.f15287));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
