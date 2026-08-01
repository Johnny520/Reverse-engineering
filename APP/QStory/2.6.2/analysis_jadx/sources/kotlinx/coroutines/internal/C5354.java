package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.AbstractRunnableC5391;
import kotlinx.coroutines.C5390;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14937 = AtomicIntegerFieldUpdater.newUpdater(C5354.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractRunnableC5391[] f14938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10372(int i, int i2) {
        AbstractRunnableC5391[] abstractRunnableC5391Arr = this.f14938;
        abstractRunnableC5391Arr.getClass();
        AbstractRunnableC5391 abstractRunnableC5391 = abstractRunnableC5391Arr[i2];
        abstractRunnableC5391.getClass();
        AbstractRunnableC5391 abstractRunnableC53912 = abstractRunnableC5391Arr[i];
        abstractRunnableC53912.getClass();
        abstractRunnableC5391Arr[i] = abstractRunnableC5391;
        abstractRunnableC5391Arr[i2] = abstractRunnableC53912;
        abstractRunnableC5391.f15022 = i;
        abstractRunnableC53912.f15022 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m10373(int i) {
        while (i > 0) {
            AbstractRunnableC5391[] abstractRunnableC5391Arr = this.f14938;
            abstractRunnableC5391Arr.getClass();
            int i2 = (i - 1) / 2;
            AbstractRunnableC5391 abstractRunnableC5391 = abstractRunnableC5391Arr[i2];
            abstractRunnableC5391.getClass();
            AbstractRunnableC5391 abstractRunnableC53912 = abstractRunnableC5391Arr[i];
            abstractRunnableC53912.getClass();
            if (abstractRunnableC5391.compareTo(abstractRunnableC53912) <= 0) {
                return;
            }
            m10372(i, i2);
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
    public final kotlinx.coroutines.AbstractRunnableC5391 m10374(int r9) {
        /*
            r8 = this;
            kotlinx.coroutines.飘花落叶言子世兰苏楪哲[] r0 = r8.f14938
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.C5354.f14937
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.m10372(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.m10372(r9, r2)
            r8.m10373(r2)
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
            r8.m10372(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.m10452(r2)
            r9.f15022 = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5354.m10374(int):kotlinx.coroutines.飘花落叶言子世兰苏楪哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10375(AbstractRunnableC5391 abstractRunnableC5391) {
        abstractRunnableC5391.m10452((C5390) this);
        AbstractRunnableC5391[] abstractRunnableC5391Arr = this.f14938;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14937;
        if (abstractRunnableC5391Arr == null) {
            abstractRunnableC5391Arr = new AbstractRunnableC5391[4];
            this.f14938 = abstractRunnableC5391Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC5391Arr.length) {
            abstractRunnableC5391Arr = (AbstractRunnableC5391[]) Arrays.copyOf(abstractRunnableC5391Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.f14938 = abstractRunnableC5391Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC5391Arr[i] = abstractRunnableC5391;
        abstractRunnableC5391.f15022 = i;
        m10373(i);
    }
}
