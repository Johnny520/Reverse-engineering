package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import p054.InterfaceC6562;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0237 extends AbstractC0284 implements InterfaceC6562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0235 f882;

    public C0237(C0235 c0235) {
        super(c0235);
        this.f882 = c0235;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f882.m741(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        C0235 c0235 = this.f882;
        c0235.getClass();
        int i = c0235.f998;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0235.m745(it.next());
        }
        return i != c0235.f998;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f882.m740();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0238(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f882.m746(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        C0235 c0235 = this.f882;
        c0235.getClass();
        int i = c0235.f998;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0235.m747(it.next());
        }
        return i != c0235.f998;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection r17) {
        /*
            r16 = this;
            r17.getClass()
            r0 = r16
            androidx.collection.飘花落叶言子世兰楪哲苏 r0 = r0.f882
            r0.getClass()
            java.lang.Object[] r1 = r0.f1000
            int r2 = r0.f998
            long[] r3 = r0.f1001
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L59
            r6 = r5
        L17:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L54
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L31:
            if (r11 >= r9) goto L52
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L4e
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = kotlin.collections.AbstractC4344.m8806(r13, r14)
            if (r13 != 0) goto L4e
            r0.m742(r12)
        L4e:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L52:
            if (r9 != r10) goto L59
        L54:
            if (r6 == r4) goto L59
            int r6 = r6 + 1
            goto L17
        L59:
            int r0 = r0.f998
            if (r2 == r0) goto L5f
            r0 = 1
            return r0
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0237.retainAll(java.util.Collection):boolean");
    }
}
