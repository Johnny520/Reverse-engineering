package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractRunnableC5392;
import kotlinx.coroutines.C5391;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5355 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14937 = AtomicIntegerFieldUpdater.newUpdater(C5355.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractRunnableC5392[] f14938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10376(int i, int i2) {
        AbstractRunnableC5392[] abstractRunnableC5392Arr = this.f14938;
        abstractRunnableC5392Arr.getClass();
        AbstractRunnableC5392 abstractRunnableC5392 = abstractRunnableC5392Arr[i2];
        abstractRunnableC5392.getClass();
        AbstractRunnableC5392 abstractRunnableC53922 = abstractRunnableC5392Arr[i];
        abstractRunnableC53922.getClass();
        abstractRunnableC5392Arr[i] = abstractRunnableC5392;
        abstractRunnableC5392Arr[i2] = abstractRunnableC53922;
        abstractRunnableC5392.f15022 = i;
        abstractRunnableC53922.f15022 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m10377(int i) {
        while (i > 0) {
            AbstractRunnableC5392[] abstractRunnableC5392Arr = this.f14938;
            abstractRunnableC5392Arr.getClass();
            int i2 = (i - 1) / 2;
            AbstractRunnableC5392 abstractRunnableC5392 = abstractRunnableC5392Arr[i2];
            abstractRunnableC5392.getClass();
            AbstractRunnableC5392 abstractRunnableC53922 = abstractRunnableC5392Arr[i];
            abstractRunnableC53922.getClass();
            if (abstractRunnableC5392.compareTo(abstractRunnableC53922) <= 0) {
                return;
            }
            m10376(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.AbstractRunnableC5392 m10378(int r9) {
        /*
            r8 = this;
            kotlinx.coroutines.飘花落叶言子世兰苏楪哲[] r0 = r8.f14938
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.C5355.f14937
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m10376(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m10376(r9, r2)
            r8.m10377(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            kotlinx.coroutines.飘花落叶言子世兰苏楪哲[] r5 = r8.f14938
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.m10376(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.m10456(r2)
            r9.f15022 = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5355.m10378(int):kotlinx.coroutines.飘花落叶言子世兰苏楪哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10379(AbstractRunnableC5392 abstractRunnableC5392) {
        abstractRunnableC5392.m10456((C5391) this);
        AbstractRunnableC5392[] abstractRunnableC5392Arr = this.f14938;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14937;
        if (abstractRunnableC5392Arr == null) {
            abstractRunnableC5392Arr = new AbstractRunnableC5392[4];
            this.f14938 = abstractRunnableC5392Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC5392Arr.length) {
            abstractRunnableC5392Arr = (AbstractRunnableC5392[]) Arrays.copyOf(abstractRunnableC5392Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f14938 = abstractRunnableC5392Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC5392Arr[i] = abstractRunnableC5392;
        abstractRunnableC5392.f15022 = i;
        m10377(i);
    }
}
