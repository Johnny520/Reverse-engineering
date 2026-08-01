package com.android.dx.util;

import bsh.C2632;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ListIntSet implements IntSet {
    final IntList ints;

    public ListIntSet() {
        IntList intList = new IntList();
        this.ints = intList;
        intList.sort();
    }

    @Override // com.android.dx.util.IntSet
    public void add(int i) {
        int iBinarysearch = this.ints.binarysearch(i);
        if (iBinarysearch < 0) {
            this.ints.insert(-(iBinarysearch + 1), i);
        }
    }

    @Override // com.android.dx.util.IntSet
    public int elements() {
        return this.ints.size();
    }

    @Override // com.android.dx.util.IntSet
    public boolean has(int i) {
        return this.ints.indexOf(i) >= 0;
    }

    @Override // com.android.dx.util.IntSet
    public IntIterator iterator() {
        return new IntIterator() { // from class: com.android.dx.util.ListIntSet.1
            private int idx = 0;

            @Override // com.android.dx.util.IntIterator
            public boolean hasNext() {
                return this.idx < ListIntSet.this.ints.size();
            }

            @Override // com.android.dx.util.IntIterator
            public int next() {
                if (!hasNext()) {
                    C2632.m5291();
                    return 0;
                }
                IntList intList = ListIntSet.this.ints;
                int i = this.idx;
                this.idx = i + 1;
                return intList.get(i);
            }
        };
    }

    @Override // com.android.dx.util.IntSet
    public void merge(IntSet intSet) {
        int iFindFirst = 0;
        if (intSet instanceof ListIntSet) {
            ListIntSet listIntSet = (ListIntSet) intSet;
            int size = this.ints.size();
            int size2 = listIntSet.ints.size();
            int i = 0;
            while (iFindFirst < size2 && i < size) {
                while (iFindFirst < size2 && listIntSet.ints.get(iFindFirst) < this.ints.get(i)) {
                    add(listIntSet.ints.get(iFindFirst));
                    iFindFirst++;
                }
                if (iFindFirst == size2) {
                    break;
                }
                while (i < size && listIntSet.ints.get(iFindFirst) >= this.ints.get(i)) {
                    i++;
                }
            }
            while (iFindFirst < size2) {
                add(listIntSet.ints.get(iFindFirst));
                iFindFirst++;
            }
            this.ints.sort();
            return;
        }
        if (!(intSet instanceof BitIntSet)) {
            IntIterator it = intSet.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        } else {
            BitIntSet bitIntSet = (BitIntSet) intSet;
            while (true) {
                IntList intList = this.ints;
                if (iFindFirst < 0) {
                    intList.sort();
                    return;
                } else {
                    intList.add(iFindFirst);
                    iFindFirst = Bits.findFirst(bitIntSet.bits, iFindFirst + 1);
                }
            }
        }
    }

    @Override // com.android.dx.util.IntSet
    public void remove(int i) {
        int iIndexOf = this.ints.indexOf(i);
        if (iIndexOf >= 0) {
            this.ints.removeIndex(iIndexOf);
        }
    }

    public String toString() {
        return this.ints.toString();
    }
}
