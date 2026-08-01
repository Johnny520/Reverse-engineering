package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractRunnableC6224;
import kotlinx.coroutines.C6223;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15282 = AtomicIntegerFieldUpdater.newUpdater(C6187.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractRunnableC6224[] f15283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10935(int i, int i2) {
        AbstractRunnableC6224[] abstractRunnableC6224Arr = this.f15283;
        abstractRunnableC6224Arr.getClass();
        AbstractRunnableC6224 abstractRunnableC6224 = abstractRunnableC6224Arr[i2];
        abstractRunnableC6224.getClass();
        AbstractRunnableC6224 abstractRunnableC62242 = abstractRunnableC6224Arr[i];
        abstractRunnableC62242.getClass();
        abstractRunnableC6224Arr[i] = abstractRunnableC6224;
        abstractRunnableC6224Arr[i2] = abstractRunnableC62242;
        abstractRunnableC6224.f15367 = i;
        abstractRunnableC62242.f15367 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m10936(int i) {
        while (i > 0) {
            AbstractRunnableC6224[] abstractRunnableC6224Arr = this.f15283;
            abstractRunnableC6224Arr.getClass();
            int i2 = (i - 1) / 2;
            AbstractRunnableC6224 abstractRunnableC6224 = abstractRunnableC6224Arr[i2];
            abstractRunnableC6224.getClass();
            AbstractRunnableC6224 abstractRunnableC62242 = abstractRunnableC6224Arr[i];
            abstractRunnableC62242.getClass();
            if (abstractRunnableC6224.compareTo(abstractRunnableC62242) <= 0) {
                return;
            }
            m10935(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC6224 m10937(int i) {
        Object[] objArr = this.f15283;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15282;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m10935(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC6224 abstractRunnableC6224 = objArr[i];
                abstractRunnableC6224.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (abstractRunnableC6224.compareTo(obj) < 0) {
                    m10935(i, i2);
                    m10936(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.f15283;
                        objArr2.getClass();
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i5];
                            comparable.getClass();
                            Object obj2 = objArr2[i4];
                            obj2.getClass();
                            if (comparable.compareTo(obj2) >= 0) {
                                i5 = i4;
                            }
                            Comparable comparable2 = objArr2[i];
                            comparable2.getClass();
                            Comparable comparable3 = objArr2[i5];
                            comparable3.getClass();
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            m10935(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        AbstractRunnableC6224 abstractRunnableC62242 = objArr[atomicIntegerFieldUpdater.get(this)];
        abstractRunnableC62242.getClass();
        abstractRunnableC62242.m11015(null);
        abstractRunnableC62242.f15367 = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC62242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10938(AbstractRunnableC6224 abstractRunnableC6224) {
        abstractRunnableC6224.m11015((C6223) this);
        AbstractRunnableC6224[] abstractRunnableC6224Arr = this.f15283;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15282;
        if (abstractRunnableC6224Arr == null) {
            abstractRunnableC6224Arr = new AbstractRunnableC6224[4];
            this.f15283 = abstractRunnableC6224Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC6224Arr.length) {
            abstractRunnableC6224Arr = (AbstractRunnableC6224[]) Arrays.copyOf(abstractRunnableC6224Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f15283 = abstractRunnableC6224Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC6224Arr[i] = abstractRunnableC6224;
        abstractRunnableC6224.f15367 = i;
        m10936(i);
    }
}
