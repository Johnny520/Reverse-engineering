package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    public CircularArray() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public CircularArray(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 < r0) goto L2d
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 > r1) goto L25
            int r1 = java.lang.Integer.bitCount(r3)
            if (r1 == r0) goto L19
            int r1 = r3 + (-1)
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r0 = r1 << 1
            goto L1a
        L19:
            r0 = r3
        L1a:
            int r1 = r0 + (-1)
            r2.mCapacityBitmask = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2.mElements = r1
            return
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capacity must be <= 2^30"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capacity must be >= 1"
            r0.<init>(r1)
            throw r0
    }

    private void doubleCapacity() {
            r7 = this;
            E[] r0 = r7.mElements
            int r0 = r0.length
            int r1 = r7.mHead
            int r1 = r0 - r1
            int r2 = r0 << 1
            if (r2 < 0) goto L2a
            java.lang.Object[] r3 = new java.lang.Object[r2]
            E[] r4 = r7.mElements
            int r5 = r7.mHead
            r6 = 0
            java.lang.System.arraycopy(r4, r5, r3, r6, r1)
            E[] r4 = r7.mElements
            int r5 = r7.mHead
            java.lang.System.arraycopy(r4, r6, r3, r1, r5)
            r4 = r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r7.mElements = r4
            r7.mHead = r6
            r7.mTail = r0
            int r4 = r2 + (-1)
            r7.mCapacityBitmask = r4
            return
        L2a:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Max array capacity exceeded"
            r3.<init>(r4)
            throw r3
    }

    public void addFirst(E r3) {
            r2 = this;
            int r0 = r2.mHead
            int r0 = r0 + (-1)
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            r2.mHead = r0
            E[] r0 = r2.mElements
            int r1 = r2.mHead
            r0[r1] = r3
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 != r1) goto L18
            r2.doubleCapacity()
        L18:
            return
    }

    public void addLast(E r3) {
            r2 = this;
            E[] r0 = r2.mElements
            int r1 = r2.mTail
            r0[r1] = r3
            int r0 = r2.mTail
            int r0 = r0 + 1
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            r2.mTail = r0
            int r0 = r2.mTail
            int r1 = r2.mHead
            if (r0 != r1) goto L18
            r2.doubleCapacity()
        L18:
            return
    }

    public void clear() {
            r1 = this;
            int r0 = r1.size()
            r1.removeFromStart(r0)
            return
    }

    public E get(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            int r0 = r3.size()
            if (r4 >= r0) goto L13
            E[] r0 = r3.mElements
            int r1 = r3.mHead
            int r1 = r1 + r4
            int r2 = r3.mCapacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public E getFirst() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 == r1) goto Ld
            E[] r0 = r2.mElements
            int r1 = r2.mHead
            r0 = r0[r1]
            return r0
        Ld:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public E getLast() {
            r3 = this;
            int r0 = r3.mHead
            int r1 = r3.mTail
            if (r0 == r1) goto L12
            E[] r0 = r3.mElements
            int r1 = r3.mTail
            int r1 = r1 + (-1)
            int r2 = r3.mCapacityBitmask
            r1 = r1 & r2
            r0 = r0[r1]
            return r0
        L12:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public boolean isEmpty() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public E popFirst() {
            r4 = this;
            int r0 = r4.mHead
            int r1 = r4.mTail
            if (r0 == r1) goto L1d
            E[] r0 = r4.mElements
            int r1 = r4.mHead
            r0 = r0[r1]
            E[] r1 = r4.mElements
            int r2 = r4.mHead
            r3 = 0
            r1[r2] = r3
            int r1 = r4.mHead
            int r1 = r1 + 1
            int r2 = r4.mCapacityBitmask
            r1 = r1 & r2
            r4.mHead = r1
            return r0
        L1d:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public E popLast() {
            r4 = this;
            int r0 = r4.mHead
            int r1 = r4.mTail
            if (r0 == r1) goto L19
            int r0 = r4.mTail
            int r0 = r0 + (-1)
            int r1 = r4.mCapacityBitmask
            r0 = r0 & r1
            E[] r1 = r4.mElements
            r1 = r1[r0]
            E[] r2 = r4.mElements
            r3 = 0
            r2[r0] = r3
            r4.mTail = r0
            return r1
        L19:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public void removeFromEnd(int r7) {
            r6 = this;
            if (r7 > 0) goto L3
            return
        L3:
            int r0 = r6.size()
            if (r7 > r0) goto L41
            r0 = 0
            int r1 = r6.mTail
            if (r7 >= r1) goto L12
            int r1 = r6.mTail
            int r0 = r1 - r7
        L12:
            r1 = r0
        L13:
            int r2 = r6.mTail
            r3 = 0
            if (r1 >= r2) goto L1f
            E[] r2 = r6.mElements
            r2[r1] = r3
            int r1 = r1 + 1
            goto L13
        L1f:
            int r1 = r6.mTail
            int r1 = r1 - r0
            int r7 = r7 - r1
            int r2 = r6.mTail
            int r2 = r2 - r1
            r6.mTail = r2
            if (r7 <= 0) goto L40
            E[] r2 = r6.mElements
            int r2 = r2.length
            r6.mTail = r2
            int r2 = r6.mTail
            int r2 = r2 - r7
            r4 = r2
        L33:
            int r5 = r6.mTail
            if (r4 >= r5) goto L3e
            E[] r5 = r6.mElements
            r5[r4] = r3
            int r4 = r4 + 1
            goto L33
        L3e:
            r6.mTail = r2
        L40:
            return
        L41:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public void removeFromStart(int r6) {
            r5 = this;
            if (r6 > 0) goto L3
            return
        L3:
            int r0 = r5.size()
            if (r6 > r0) goto L3e
            E[] r0 = r5.mElements
            int r0 = r0.length
            int r1 = r5.mHead
            int r1 = r0 - r1
            if (r6 >= r1) goto L16
            int r1 = r5.mHead
            int r0 = r1 + r6
        L16:
            int r1 = r5.mHead
        L18:
            r2 = 0
            if (r1 >= r0) goto L22
            E[] r3 = r5.mElements
            r3[r1] = r2
            int r1 = r1 + 1
            goto L18
        L22:
            int r1 = r5.mHead
            int r1 = r0 - r1
            int r6 = r6 - r1
            int r3 = r5.mHead
            int r3 = r3 + r1
            int r4 = r5.mCapacityBitmask
            r3 = r3 & r4
            r5.mHead = r3
            if (r6 <= 0) goto L3d
            r3 = 0
        L32:
            if (r3 >= r6) goto L3b
            E[] r4 = r5.mElements
            r4[r3] = r2
            int r3 = r3 + 1
            goto L32
        L3b:
            r5.mHead = r6
        L3d:
            return
        L3e:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public int size() {
            r2 = this;
            int r0 = r2.mTail
            int r1 = r2.mHead
            int r0 = r0 - r1
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            return r0
    }
}
