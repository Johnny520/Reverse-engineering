package androidx.collection;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    public CircularIntArray() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public CircularIntArray(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            if (r3 < r0) goto L2b
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 > r1) goto L23
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
            int[] r1 = new int[r0]
            r2.mElements = r1
            return
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capacity must be <= 2^30"
            r0.<init>(r1)
            throw r0
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "capacity must be >= 1"
            r0.<init>(r1)
            throw r0
    }

    private void doubleCapacity() {
            r7 = this;
            int[] r0 = r7.mElements
            int r0 = r0.length
            int r1 = r7.mHead
            int r1 = r0 - r1
            int r2 = r0 << 1
            if (r2 < 0) goto L27
            int[] r3 = new int[r2]
            int[] r4 = r7.mElements
            int r5 = r7.mHead
            r6 = 0
            java.lang.System.arraycopy(r4, r5, r3, r6, r1)
            int[] r4 = r7.mElements
            int r5 = r7.mHead
            java.lang.System.arraycopy(r4, r6, r3, r1, r5)
            r7.mElements = r3
            r7.mHead = r6
            r7.mTail = r0
            int r4 = r2 + (-1)
            r7.mCapacityBitmask = r4
            return
        L27:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Max array capacity exceeded"
            r3.<init>(r4)
            throw r3
    }

    public void addFirst(int r3) {
            r2 = this;
            int r0 = r2.mHead
            int r0 = r0 + (-1)
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            r2.mHead = r0
            int[] r0 = r2.mElements
            int r1 = r2.mHead
            r0[r1] = r3
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 != r1) goto L18
            r2.doubleCapacity()
        L18:
            return
    }

    public void addLast(int r3) {
            r2 = this;
            int[] r0 = r2.mElements
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
            int r0 = r1.mHead
            r1.mTail = r0
            return
    }

    public int get(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            int r0 = r3.size()
            if (r4 >= r0) goto L13
            int[] r0 = r3.mElements
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

    public int getFirst() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 == r1) goto Ld
            int[] r0 = r2.mElements
            int r1 = r2.mHead
            r0 = r0[r1]
            return r0
        Ld:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public int getLast() {
            r3 = this;
            int r0 = r3.mHead
            int r1 = r3.mTail
            if (r0 == r1) goto L12
            int[] r0 = r3.mElements
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

    public int popFirst() {
            r3 = this;
            int r0 = r3.mHead
            int r1 = r3.mTail
            if (r0 == r1) goto L16
            int[] r0 = r3.mElements
            int r1 = r3.mHead
            r0 = r0[r1]
            int r1 = r3.mHead
            int r1 = r1 + 1
            int r2 = r3.mCapacityBitmask
            r1 = r1 & r2
            r3.mHead = r1
            return r0
        L16:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public int popLast() {
            r2 = this;
            int r0 = r2.mHead
            int r1 = r2.mTail
            if (r0 == r1) goto L14
            int r0 = r2.mTail
            int r0 = r0 + (-1)
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            int[] r1 = r2.mElements
            r1 = r1[r0]
            r2.mTail = r0
            return r1
        L14:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public void removeFromEnd(int r3) {
            r2 = this;
            if (r3 > 0) goto L3
            return
        L3:
            int r0 = r2.size()
            if (r3 > r0) goto L12
            int r0 = r2.mTail
            int r0 = r0 - r3
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            r2.mTail = r0
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>()
            throw r0
    }

    public void removeFromStart(int r3) {
            r2 = this;
            if (r3 > 0) goto L3
            return
        L3:
            int r0 = r2.size()
            if (r3 > r0) goto L12
            int r0 = r2.mHead
            int r0 = r0 + r3
            int r1 = r2.mCapacityBitmask
            r0 = r0 & r1
            r2.mHead = r0
            return
        L12:
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
