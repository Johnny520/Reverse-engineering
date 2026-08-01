package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import p054.InterfaceC6562;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0240 extends AbstractC0289 implements InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0243 f889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240(C0243 c0243) {
        super(c0243);
        c0243.getClass();
        this.f889 = c0243;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f889.m766(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        C0243 c0243 = this.f889;
        c0243.getClass();
        int i = c0243.f1014;
        for (Object obj : collection) {
            int iM764 = c0243.m764(obj);
            c0243.f1012[iM764] = obj;
            long[] jArr = c0243.f1011;
            int i2 = c0243.f1010;
            jArr[iM764] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iM764) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            c0243.f1010 = iM764;
            if (c0243.f1009 == Integer.MAX_VALUE) {
                c0243.f1009 = iM764;
            }
        }
        return i != c0243.f1014;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f889.m765();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0239(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f889.m768(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r19) {
        /*
            r18 = this;
            r19.getClass()
            r0 = r19
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r18
            androidx.collection.飘花落叶言子世哲苏兰楪 r1 = r1.f889
            r1.getClass()
            int r2 = r1.f1014
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L27
            int r6 = r3.hashCode()
            goto L28
        L27:
            r6 = r5
        L28:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r6 = r6 ^ r7
            r7 = r6 & 127(0x7f, float:1.78E-43)
            int r8 = r1.f1008
            int r6 = r6 >>> 7
            r6 = r6 & r8
        L36:
            long[] r9 = r1.f1013
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            int r10 = r10 + r4
            r14 = r9[r10]
            int r9 = 64 - r11
            long r9 = r14 << r9
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r7
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r9
            long r13 = r11 - r13
            long r11 = ~r11
            long r11 = r11 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
        L61:
            r15 = 0
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 == 0) goto L84
            int r15 = java.lang.Long.numberOfTrailingZeros(r11)
            int r15 = r15 >> 3
            int r15 = r15 + r6
            r15 = r15 & r8
            r18 = r4
            java.lang.Object[] r4 = r1.f1012
            r4 = r4[r15]
            boolean r4 = kotlin.jvm.internal.AbstractC4395.m8907(r4, r3)
            if (r4 == 0) goto L7c
            goto L90
        L7c:
            r15 = 1
            long r15 = r11 - r15
            long r11 = r11 & r15
            r4 = r18
            goto L61
        L84:
            r18 = r4
            long r11 = ~r9
            r4 = 6
            long r11 = r11 << r4
            long r9 = r9 & r11
            long r9 = r9 & r13
            int r4 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r4 == 0) goto L97
            r15 = -1
        L90:
            if (r15 < 0) goto L14
            r1.m767(r15)
            goto L14
        L97:
            int r5 = r5 + 8
            int r6 = r6 + r5
            r6 = r6 & r8
            r4 = r18
            goto L36
        L9e:
            r18 = r4
            int r0 = r1.f1014
            if (r2 == r0) goto La5
            return r18
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0240.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f889.m769(collection);
    }
}
