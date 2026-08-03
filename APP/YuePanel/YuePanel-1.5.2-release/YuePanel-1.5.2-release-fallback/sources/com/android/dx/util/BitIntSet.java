package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public class BitIntSet implements com.android.dx.util.IntSet {
    int[] bits;


    public BitIntSet(int r1) {
            r0 = this;
            r0.<init>()
            int[] r1 = com.android.dx.util.Bits.makeBitSet(r1)
            r0.bits = r1
            return
    }

    private void ensureCapacity(int r4) {
            r3 = this;
            int[] r0 = r3.bits
            int r0 = com.android.dx.util.Bits.getMax(r0)
            if (r4 < r0) goto L23
            int r4 = r4 + 1
            int[] r0 = r3.bits
            int r0 = com.android.dx.util.Bits.getMax(r0)
            int r0 = r0 * 2
            int r4 = java.lang.Math.max(r4, r0)
            int[] r4 = com.android.dx.util.Bits.makeBitSet(r4)
            int[] r0 = r3.bits
            int r1 = r0.length
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r3.bits = r4
        L23:
            return
    }

    @Override // com.android.dx.util.IntSet
    public void add(int r3) {
            r2 = this;
            r2.ensureCapacity(r3)
            int[] r0 = r2.bits
            r1 = 1
            com.android.dx.util.Bits.set(r0, r3, r1)
            return
    }

    @Override // com.android.dx.util.IntSet
    public int elements() {
            r1 = this;
            int[] r0 = r1.bits
            int r0 = com.android.dx.util.Bits.bitCount(r0)
            return r0
    }

    @Override // com.android.dx.util.IntSet
    public boolean has(int r2) {
            r1 = this;
            int[] r0 = r1.bits
            int r0 = com.android.dx.util.Bits.getMax(r0)
            if (r2 >= r0) goto L12
            int[] r0 = r1.bits
            boolean r2 = com.android.dx.util.Bits.get(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // com.android.dx.util.IntSet
    public com.android.dx.util.IntIterator iterator() {
            r1 = this;
            com.android.dx.util.BitIntSet$1 r0 = new com.android.dx.util.BitIntSet$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.util.IntSet
    public void merge(com.android.dx.util.IntSet r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.android.dx.util.BitIntSet
            r1 = 1
            if (r0 == 0) goto L19
            com.android.dx.util.BitIntSet r5 = (com.android.dx.util.BitIntSet) r5
            int[] r0 = r5.bits
            int r0 = com.android.dx.util.Bits.getMax(r0)
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            int[] r0 = r4.bits
            int[] r5 = r5.bits
            com.android.dx.util.Bits.or(r0, r5)
            goto L5a
        L19:
            boolean r0 = r5 instanceof com.android.dx.util.ListIntSet
            if (r0 == 0) goto L48
            com.android.dx.util.ListIntSet r5 = (com.android.dx.util.ListIntSet) r5
            com.android.dx.util.IntList r0 = r5.ints
            int r0 = r0.size()
            if (r0 <= 0) goto L31
            com.android.dx.util.IntList r2 = r5.ints
            int r0 = r0 - r1
            int r0 = r2.get(r0)
            r4.ensureCapacity(r0)
        L31:
            r0 = 0
        L32:
            com.android.dx.util.IntList r2 = r5.ints
            int r2 = r2.size()
            if (r0 >= r2) goto L5a
            int[] r2 = r4.bits
            com.android.dx.util.IntList r3 = r5.ints
            int r3 = r3.get(r0)
            com.android.dx.util.Bits.set(r2, r3, r1)
            int r0 = r0 + 1
            goto L32
        L48:
            com.android.dx.util.IntIterator r5 = r5.iterator()
        L4c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5a
            int r0 = r5.next()
            r4.add(r0)
            goto L4c
        L5a:
            return
    }

    @Override // com.android.dx.util.IntSet
    public void remove(int r3) {
            r2 = this;
            int[] r0 = r2.bits
            int r0 = com.android.dx.util.Bits.getMax(r0)
            if (r3 >= r0) goto Le
            int[] r0 = r2.bits
            r1 = 0
            com.android.dx.util.Bits.set(r0, r3, r1)
        Le:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int[] r1 = r4.bits
            r2 = 0
            int r1 = com.android.dx.util.Bits.findFirst(r1, r2)
            r3 = 1
        L12:
            if (r1 < 0) goto L28
            if (r3 != 0) goto L1b
            java.lang.String r3 = ", "
            r0.append(r3)
        L1b:
            r0.append(r1)
            int[] r3 = r4.bits
            int r1 = r1 + 1
            int r1 = com.android.dx.util.Bits.findFirst(r3, r1)
            r3 = r2
            goto L12
        L28:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
