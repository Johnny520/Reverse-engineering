package p057;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6852 implements InterfaceC6851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f18288 = AtomicLongFieldUpdater.newUpdater(AbstractC6852.class, "top");

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private volatile /* synthetic */ long f25549top;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int[] f18289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f18290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AtomicReferenceArray f18291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f18292;

    public AbstractC6852(int i) {
        if (i <= 0) {
            C5925.m11314(AbstractC6183.m11588(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            C5925.m11314(AbstractC6183.m11588(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.f25549top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f18292 = iHighestOneBit;
        this.f18290 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f18291 = new AtomicReferenceArray(i2);
        this.f18289 = new int[i2];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (m12075() != null) {
        }
    }

    @Override // p057.InterfaceC6851
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo8334(Object obj) {
        obj.getClass();
        mo12076(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.f18290) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.f18291;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                AbstractC6852 abstractC6852 = this;
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = abstractC6852.f18292;
                    }
                    i++;
                    this = abstractC6852;
                } else {
                    this = abstractC6852;
                }
            }
            if (iIdentityHashCode <= 0) {
                C5925.m11310("index should be positive");
                return;
            }
            while (true) {
                long j = this.f25549top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.f18289[iIdentityHashCode] = (int) (4294967295L & j);
                AbstractC6852 abstractC68522 = this;
                if (f18288.compareAndSet(abstractC68522, j, j2)) {
                    return;
                } else {
                    this = abstractC68522;
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
    public final java.lang.Object m12075() {
        /*
            r10 = this;
        L0:
            long r2 = r10.f25549top
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
            int[] r1 = r10.f18289
            r1 = r1[r6]
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p057.AbstractC6852.f18288
            r1 = r10
            boolean r10 = r0.compareAndSet(r1, r2, r4)
            if (r10 == 0) goto L39
        L2e:
            r10 = 0
            if (r6 != 0) goto L32
            return r10
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f18291
            java.lang.Object r10 = r0.getAndSet(r6, r10)
            return r10
        L39:
            r10 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p057.AbstractC6852.m12075():java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Object mo8346();

    @Override // p057.InterfaceC6851
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final Object mo8335() {
        Object objM12075 = m12075();
        return objM12075 != null ? mo8347(objM12075) : mo8346();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo12076(Object obj) {
        obj.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo8347(Object obj) {
        return obj;
    }
}
