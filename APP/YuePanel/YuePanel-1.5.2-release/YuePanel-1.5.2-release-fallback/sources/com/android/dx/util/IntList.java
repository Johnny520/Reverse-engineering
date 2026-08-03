package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class IntList extends com.android.dx.util.MutabilityControl {
    public static final com.android.dx.util.IntList EMPTY = null;
    private int size;
    private boolean sorted;
    private int[] values;

    static {
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.util.IntList.EMPTY = r0
            r0.setImmutable()
            return
    }

    public IntList() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    public IntList(int r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            int[] r2 = new int[r2]     // Catch: java.lang.NegativeArraySizeException -> Le
            r1.values = r2     // Catch: java.lang.NegativeArraySizeException -> Le
            r2 = 0
            r1.size = r2
            r1.sorted = r0
            return
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size < 0"
            r2.<init>(r0)
            throw r2
    }

    private void growIfNeeded() {
            r4 = this;
            int r0 = r4.size
            int[] r1 = r4.values
            int r2 = r1.length
            if (r0 != r2) goto L15
            int r2 = r0 * 3
            int r2 = r2 / 2
            int r2 = r2 + 10
            int[] r2 = new int[r2]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            r4.values = r2
        L15:
            return
    }

    public static com.android.dx.util.IntList makeImmutable(int r2) {
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r1 = 1
            r0.<init>(r1)
            r0.add(r2)
            r0.setImmutable()
            return r0
    }

    public static com.android.dx.util.IntList makeImmutable(int r2, int r3) {
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r1 = 2
            r0.<init>(r1)
            r0.add(r2)
            r0.add(r3)
            r0.setImmutable()
            return r0
    }

    public void add(int r5) {
            r4 = this;
            r4.throwIfImmutable()
            r4.growIfNeeded()
            int[] r0 = r4.values
            int r1 = r4.size
            int r2 = r1 + 1
            r4.size = r2
            r0[r1] = r5
            boolean r3 = r4.sorted
            if (r3 == 0) goto L21
            r3 = 1
            if (r2 <= r3) goto L21
            int r1 = r1 + (-1)
            r0 = r0[r1]
            if (r5 < r0) goto L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r4.sorted = r3
        L21:
            return
    }

    public int binarysearch(int r6) {
            r5 = this;
            int r0 = r5.size
            boolean r1 = r5.sorted
            if (r1 != 0) goto L15
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            int[] r2 = r5.values
            r2 = r2[r1]
            if (r2 != r6) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            int r6 = -r0
            return r6
        L15:
            r1 = -1
            r2 = r0
        L17:
            int r3 = r1 + 1
            if (r2 <= r3) goto L2a
            int r3 = r2 - r1
            int r3 = r3 >> 1
            int r3 = r3 + r1
            int[] r4 = r5.values
            r4 = r4[r3]
            if (r6 > r4) goto L28
            r2 = r3
            goto L17
        L28:
            r1 = r3
            goto L17
        L2a:
            if (r2 == r0) goto L37
            int[] r0 = r5.values
            r0 = r0[r2]
            if (r6 != r0) goto L33
            goto L36
        L33:
            int r6 = -r2
            int r2 = r6 + (-1)
        L36:
            return r2
        L37:
            int r6 = -r0
            int r6 = r6 + (-1)
            return r6
    }

    public boolean contains(int r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.android.dx.util.IntList
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.android.dx.util.IntList r6 = (com.android.dx.util.IntList) r6
            boolean r1 = r5.sorted
            boolean r3 = r6.sorted
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r5.size
            int r3 = r6.size
            if (r1 == r3) goto L1a
            return r2
        L1a:
            r1 = r2
        L1b:
            int r3 = r5.size
            if (r1 >= r3) goto L2d
            int[] r3 = r5.values
            r3 = r3[r1]
            int[] r4 = r6.values
            r4 = r4[r1]
            if (r3 == r4) goto L2a
            return r2
        L2a:
            int r1 = r1 + 1
            goto L1b
        L2d:
            return r0
    }

    public int get(int r2) {
            r1 = this;
            int r0 = r1.size
            if (r2 >= r0) goto L11
            int[] r0 = r1.values     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            return r2
        L9:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "n < 0"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "n >= size()"
            r2.<init>(r0)
            throw r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.size
            if (r0 >= r2) goto L10
            int r1 = r1 * 31
            int[] r2 = r3.values
            r2 = r2[r0]
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L10:
            return r1
    }

    public int indexOf(int r1) {
            r0 = this;
            int r1 = r0.binarysearch(r1)
            if (r1 < 0) goto L7
            goto L8
        L7:
            r1 = -1
        L8:
            return r1
    }

    public void insert(int r5, int r6) {
            r4 = this;
            int r0 = r4.size
            if (r5 > r0) goto L33
            r4.growIfNeeded()
            int[] r0 = r4.values
            int r1 = r5 + 1
            int r2 = r4.size
            int r2 = r2 - r5
            java.lang.System.arraycopy(r0, r5, r0, r1, r2)
            int[] r0 = r4.values
            r0[r5] = r6
            int r2 = r4.size
            int r3 = r2 + 1
            r4.size = r3
            boolean r3 = r4.sorted
            if (r3 == 0) goto L2f
            if (r5 == 0) goto L27
            int r3 = r5 + (-1)
            r3 = r0[r3]
            if (r6 <= r3) goto L2f
        L27:
            if (r5 == r2) goto L2d
            r5 = r0[r1]
            if (r6 >= r5) goto L2f
        L2d:
            r5 = 1
            goto L30
        L2f:
            r5 = 0
        L30:
            r4.sorted = r5
            return
        L33:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r6 = "n > size()"
            r5.<init>(r6)
            throw r5
    }

    public com.android.dx.util.IntList mutableCopy() {
            r4 = this;
            int r0 = r4.size
            com.android.dx.util.IntList r1 = new com.android.dx.util.IntList
            r1.<init>(r0)
            r2 = 0
        L8:
            if (r2 >= r0) goto L14
            int[] r3 = r4.values
            r3 = r3[r2]
            r1.add(r3)
            int r2 = r2 + 1
            goto L8
        L14:
            return r1
    }

    public int pop() {
            r2 = this;
            r2.throwIfImmutable()
            int r0 = r2.size
            int r0 = r0 + (-1)
            int r0 = r2.get(r0)
            int r1 = r2.size
            int r1 = r1 + (-1)
            r2.size = r1
            return r0
    }

    public void pop(int r2) {
            r1 = this;
            r1.throwIfImmutable()
            int r0 = r1.size
            int r0 = r0 - r2
            r1.size = r0
            return
    }

    public void removeIndex(int r4) {
            r3 = this;
            int r0 = r3.size
            if (r4 >= r0) goto L15
            int[] r1 = r3.values
            int r2 = r4 + 1
            int r0 = r0 - r4
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r1, r2, r1, r4, r0)
            int r4 = r3.size
            int r4 = r4 + (-1)
            r3.size = r4
            return
        L15:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "n >= size()"
            r4.<init>(r0)
            throw r4
    }

    public void set(int r2, int r3) {
            r1 = this;
            r1.throwIfImmutable()
            int r0 = r1.size
            if (r2 >= r0) goto L1a
            int[] r0 = r1.values     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            r0[r2] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            r3 = 0
            r1.sorted = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lf
            goto L11
        Lf:
            if (r2 < 0) goto L12
        L11:
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "n < 0"
            r2.<init>(r3)
            throw r2
        L1a:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "n >= size()"
            r2.<init>(r3)
            throw r2
    }

    public void shrink(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            int r0 = r1.size
            if (r2 > r0) goto Lc
            r1.throwIfImmutable()
            r1.size = r2
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newSize > size"
            r2.<init>(r0)
            throw r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "newSize < 0"
            r2.<init>(r0)
            throw r2
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public void sort() {
            r3 = this;
            r3.throwIfImmutable()
            boolean r0 = r3.sorted
            if (r0 != 0) goto L12
            int[] r0 = r3.values
            r1 = 0
            int r2 = r3.size
            java.util.Arrays.sort(r0, r1, r2)
            r0 = 1
            r3.sorted = r0
        L12:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.size
            int r1 = r1 * 5
            int r1 = r1 + 10
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
        L11:
            int r2 = r3.size
            if (r1 >= r2) goto L26
            if (r1 == 0) goto L1c
            java.lang.String r2 = ", "
            r0.append(r2)
        L1c:
            int[] r2 = r3.values
            r2 = r2[r1]
            r0.append(r2)
            int r1 = r1 + 1
            goto L11
        L26:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int top() {
            r1 = this;
            int r0 = r1.size
            int r0 = r0 + (-1)
            int r0 = r1.get(r0)
            return r0
    }
}
