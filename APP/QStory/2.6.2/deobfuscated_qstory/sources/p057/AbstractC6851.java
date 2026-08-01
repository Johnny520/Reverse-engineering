package p057;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6851 implements InterfaceC6850 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18293 = AtomicLongFieldUpdater.newUpdater(AbstractC6851.class, "top");

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private volatile /* synthetic */ long f25563top;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int[] f18294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f18295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AtomicReferenceArray f18296;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18297;

    public AbstractC6851(int i) {
        if (i <= 0) {
            C5919.m11253(AbstractC6136.m11556(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            C5919.m11253(AbstractC6136.m11556(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.f25563top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f18297 = iHighestOneBit;
        this.f18295 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f18296 = new AtomicReferenceArray(i2);
        this.f18294 = new int[i2];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (m12047() != null) {
        }
    }

    @Override // p057.InterfaceC6850
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final void mo8344(Object obj) {
        obj.getClass();
        mo12048(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f18295) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.f18296;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                AbstractC6851 abstractC6851 = this;
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = abstractC6851.f18297;
                    }
                    i++;
                    this = abstractC6851;
                } else {
                    this = abstractC6851;
                }
            }
            if (iIdentityHashCode <= 0) {
                C5919.m11249("index should be positive");
                return;
            }
            while (true) {
                long j = this.f25563top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.f18294[iIdentityHashCode] = (int) (4294967295L & j);
                AbstractC6851 abstractC68512 = this;
                if (f18293.compareAndSet(abstractC68512, j, j2)) {
                    return;
                } else {
                    this = abstractC68512;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12047() {
        /*
            r10 = this;
        L0:
            long r2 = r10.f25563top
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lc
        L9:
            r6 = r1
            r1 = r10
            goto L2e
        Lc:
            r0 = 32
            long r4 = r2 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r8 = 1
            long r4 = r4 + r8
            long r6 = r6 & r2
            int r6 = (int) r6
            if (r6 != 0) goto L1e
            goto L9
        L1e:
            int[] r1 = r10.f18294
            r1 = r1[r6]
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p057.AbstractC6851.f18293
            r1 = r10
            boolean r10 = r0.compareAndSet(r1, r2, r4)
            if (r10 == 0) goto L39
        L2e:
            r10 = 0
            if (r6 != 0) goto L32
            return r10
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f18296
            java.lang.Object r10 = r0.getAndSet(r6, r10)
            return r10
        L39:
            r10 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p057.AbstractC6851.m12047():java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Object mo8356();

    @Override // p057.InterfaceC6850
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo8345() {
        Object objM12047 = m12047();
        return objM12047 != null ? mo8357(objM12047) : mo8356();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo12048(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo8357(Object obj) {
        return obj;
    }
}
