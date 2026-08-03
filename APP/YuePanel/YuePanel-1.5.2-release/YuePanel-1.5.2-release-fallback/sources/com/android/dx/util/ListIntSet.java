package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public class ListIntSet implements com.android.dx.util.IntSet {
    final com.android.dx.util.IntList ints;


    public ListIntSet() {
            r1 = this;
            r1.<init>()
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r0.<init>()
            r1.ints = r0
            r0.sort()
            return
    }

    @Override // com.android.dx.util.IntSet
    public void add(int r3) {
            r2 = this;
            com.android.dx.util.IntList r0 = r2.ints
            int r0 = r0.binarysearch(r3)
            if (r0 >= 0) goto L10
            com.android.dx.util.IntList r1 = r2.ints
            int r0 = r0 + 1
            int r0 = -r0
            r1.insert(r0, r3)
        L10:
            return
    }

    @Override // com.android.dx.util.IntSet
    public int elements() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.ints
            int r0 = r0.size()
            return r0
    }

    @Override // com.android.dx.util.IntSet
    public boolean has(int r2) {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.ints
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // com.android.dx.util.IntSet
    public com.android.dx.util.IntIterator iterator() {
            r1 = this;
            com.android.dx.util.ListIntSet$1 r0 = new com.android.dx.util.ListIntSet$1
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.util.IntSet
    public void merge(com.android.dx.util.IntSet r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.android.dx.util.ListIntSet
            r1 = 0
            if (r0 == 0) goto L60
            com.android.dx.util.ListIntSet r7 = (com.android.dx.util.ListIntSet) r7
            com.android.dx.util.IntList r0 = r6.ints
            int r0 = r0.size()
            com.android.dx.util.IntList r2 = r7.ints
            int r2 = r2.size()
            r3 = r1
        L14:
            if (r1 >= r2) goto L4b
            if (r3 >= r0) goto L4b
        L18:
            if (r1 >= r2) goto L35
            com.android.dx.util.IntList r4 = r7.ints
            int r4 = r4.get(r1)
            com.android.dx.util.IntList r5 = r6.ints
            int r5 = r5.get(r3)
            if (r4 >= r5) goto L35
            com.android.dx.util.IntList r4 = r7.ints
            int r5 = r1 + 1
            int r1 = r4.get(r1)
            r6.add(r1)
            r1 = r5
            goto L18
        L35:
            if (r1 != r2) goto L38
            goto L4b
        L38:
            if (r3 >= r0) goto L14
            com.android.dx.util.IntList r4 = r7.ints
            int r4 = r4.get(r1)
            com.android.dx.util.IntList r5 = r6.ints
            int r5 = r5.get(r3)
            if (r4 < r5) goto L14
            int r3 = r3 + 1
            goto L38
        L4b:
            if (r1 >= r2) goto L5a
            com.android.dx.util.IntList r0 = r7.ints
            int r3 = r1 + 1
            int r0 = r0.get(r1)
            r6.add(r0)
            r1 = r3
            goto L4b
        L5a:
            com.android.dx.util.IntList r7 = r6.ints
            r7.sort()
            goto L8e
        L60:
            boolean r0 = r7 instanceof com.android.dx.util.BitIntSet
            if (r0 == 0) goto L7c
            com.android.dx.util.BitIntSet r7 = (com.android.dx.util.BitIntSet) r7
        L66:
            if (r1 < 0) goto L76
            com.android.dx.util.IntList r0 = r6.ints
            r0.add(r1)
            int[] r0 = r7.bits
            int r1 = r1 + 1
            int r1 = com.android.dx.util.Bits.findFirst(r0, r1)
            goto L66
        L76:
            com.android.dx.util.IntList r7 = r6.ints
            r7.sort()
            goto L8e
        L7c:
            com.android.dx.util.IntIterator r7 = r7.iterator()
        L80:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8e
            int r0 = r7.next()
            r6.add(r0)
            goto L80
        L8e:
            return
    }

    @Override // com.android.dx.util.IntSet
    public void remove(int r2) {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.ints
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto Ld
            com.android.dx.util.IntList r0 = r1.ints
            r0.removeIndex(r2)
        Ld:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.ints
            java.lang.String r0 = r0.toString()
            return r0
    }
}
