package a;

/* JADX INFO: renamed from: a.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0451x<E> extends java.util.AbstractList<E> implements java.util.List<E>, a.InterfaceC0353r9 {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int r10) {
            r9 = this;
            r0 = r9
            a.F1 r0 = (a.F1) r0
            int r1 = r0.c
            if (r10 < 0) goto L92
            if (r10 >= r1) goto L92
            int r1 = a.C0294o3.c0(r0)
            if (r10 != r1) goto L14
            java.lang.Object r10 = r0.removeLast()
            return r10
        L14:
            if (r10 != 0) goto L1b
            java.lang.Object r10 = r0.removeFirst()
            return r10
        L1b:
            r0.g()
            int r1 = r0.f79a
            int r1 = r1 + r10
            int r1 = r0.f(r1)
            java.lang.Object[] r2 = r0.b
            r3 = r2[r1]
            int r4 = r0.c
            r5 = 1
            int r4 = r4 >> r5
            r6 = 0
            r7 = 0
            if (r10 >= r4) goto L5c
            int r10 = r0.f79a
            if (r1 < r10) goto L3b
            int r4 = r10 + 1
            a.C0435w1.h(r2, r2, r4, r10, r1)
            goto L4f
        L3b:
            a.C0435w1.h(r2, r2, r5, r7, r1)
            java.lang.Object[] r10 = r0.b
            int r1 = r10.length
            int r1 = r1 - r5
            r1 = r10[r1]
            r10[r7] = r1
            int r1 = r0.f79a
            int r2 = r1 + 1
            int r4 = r10.length
            int r4 = r4 - r5
            a.C0435w1.h(r10, r10, r2, r1, r4)
        L4f:
            java.lang.Object[] r10 = r0.b
            int r1 = r0.f79a
            r10[r1] = r6
            int r10 = r0.c(r1)
            r0.f79a = r10
            goto L8c
        L5c:
            int r10 = r0.f79a
            int r2 = a.C0294o3.c0(r0)
            int r2 = r2 + r10
            int r10 = r0.f(r2)
            if (r1 > r10) goto L73
            java.lang.Object[] r2 = r0.b
            int r4 = r1 + 1
            int r7 = r10 + 1
            a.C0435w1.h(r2, r2, r1, r4, r7)
            goto L88
        L73:
            java.lang.Object[] r2 = r0.b
            int r4 = r1 + 1
            int r8 = r2.length
            a.C0435w1.h(r2, r2, r1, r4, r8)
            java.lang.Object[] r1 = r0.b
            int r2 = r1.length
            int r2 = r2 - r5
            r4 = r1[r7]
            r1[r2] = r4
            int r2 = r10 + 1
            a.C0435w1.h(r1, r1, r7, r5, r2)
        L88:
            java.lang.Object[] r1 = r0.b
            r1[r10] = r6
        L8c:
            int r10 = r0.c
            int r10 = r10 - r5
            r0.c = r10
            return r3
        L92:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "index: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = ", size: "
            r2.append(r10)
            r2.append(r1)
            java.lang.String r10 = r2.toString()
            r0.<init>(r10)
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            r0 = r1
            a.F1 r0 = (a.F1) r0
            int r0 = r0.c
            return r0
    }
}
