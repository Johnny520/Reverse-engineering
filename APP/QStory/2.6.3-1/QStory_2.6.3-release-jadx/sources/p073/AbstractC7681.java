package p073;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7681 implements InterfaceC7680 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18633 = AtomicLongFieldUpdater.newUpdater(AbstractC7681.class, "top");

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private volatile /* synthetic */ long f25894top;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int[] f18634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f18635;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AtomicReferenceArray f18636;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18637;

    public AbstractC7681(int i) {
        if (i <= 0) {
            C6755.m11873(AbstractC7012.m12147(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            C6755.m11873(AbstractC7012.m12147(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.f25894top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f18637 = iHighestOneBit;
        this.f18635 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f18636 = new AtomicReferenceArray(i2);
        this.f18634 = new int[i2];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (m12634() != null) {
        }
    }

    @Override // p073.InterfaceC7680
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo8893(Object obj) {
        obj.getClass();
        mo12635(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f18635) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.f18636;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                AbstractC7681 abstractC7681 = this;
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = abstractC7681.f18637;
                    }
                    i++;
                    this = abstractC7681;
                } else {
                    this = abstractC7681;
                }
            }
            if (iIdentityHashCode <= 0) {
                C6755.m11869("index should be positive");
                return;
            }
            while (true) {
                long j = this.f25894top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.f18634[iIdentityHashCode] = (int) (4294967295L & j);
                AbstractC7681 abstractC76812 = this;
                if (f18633.compareAndSet(abstractC76812, j, j2)) {
                    return;
                } else {
                    this = abstractC76812;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r6 = 0;
        r1 = r10;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m12634() {
        int i;
        AbstractC7681 abstractC7681;
        while (true) {
            long j = this.f25894top;
            if (j == 0) {
                break;
            }
            long j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                break;
            }
            abstractC7681 = this;
            if (f18633.compareAndSet(abstractC7681, j, (j2 << 32) | ((long) this.f18634[i]))) {
                break;
            }
            this = abstractC7681;
        }
        if (i == 0) {
            return null;
        }
        return abstractC7681.f18636.getAndSet(i, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Object mo8905();

    @Override // p073.InterfaceC7680
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Object mo8894() {
        Object objM12634 = m12634();
        return objM12634 != null ? mo8906(objM12634) : mo8905();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo12635(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo8906(Object obj) {
        return obj;
    }
}
