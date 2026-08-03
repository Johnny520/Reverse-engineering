package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public class LabeledList extends com.android.dx.util.FixedSizeList {
    private final com.android.dx.util.IntList labelToIndex;

    public LabeledList(int r2) {
            r1 = this;
            r1.<init>(r2)
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r0.<init>(r2)
            r1.labelToIndex = r0
            return
    }

    public LabeledList(com.android.dx.util.LabeledList r4) {
            r3 = this;
            int r0 = r4.size()
            r3.<init>(r0)
            com.android.dx.util.IntList r0 = r4.labelToIndex
            com.android.dx.util.IntList r0 = r0.mutableCopy()
            r3.labelToIndex = r0
            int r0 = r4.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L22
            java.lang.Object r2 = r4.get0(r1)
            if (r2 == 0) goto L1f
            r3.set0(r1, r2)
        L1f:
            int r1 = r1 + 1
            goto L14
        L22:
            return
    }

    private void addLabelIndex(int r5, int r6) {
            r4 = this;
            com.android.dx.util.IntList r0 = r4.labelToIndex
            int r0 = r0.size()
            r1 = 0
        L7:
            int r2 = r5 - r0
            if (r1 > r2) goto L14
            com.android.dx.util.IntList r2 = r4.labelToIndex
            r3 = -1
            r2.add(r3)
            int r1 = r1 + 1
            goto L7
        L14:
            com.android.dx.util.IntList r0 = r4.labelToIndex
            r0.set(r5, r6)
            return
    }

    private void rebuildLabelToIndex() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            java.lang.Object r2 = r4.get0(r1)
            com.android.dx.util.LabeledItem r2 = (com.android.dx.util.LabeledItem) r2
            if (r2 == 0) goto L18
            com.android.dx.util.IntList r3 = r4.labelToIndex
            int r2 = r2.getLabel()
            r3.set(r2, r1)
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            return
    }

    private void removeLabel(int r3) {
            r2 = this;
            com.android.dx.util.IntList r0 = r2.labelToIndex
            r1 = -1
            r0.set(r3, r1)
            return
    }

    public final int[] getLabelsInOrder() {
            r4 = this;
            int r0 = r4.size()
            int[] r1 = new int[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L31
            java.lang.Object r3 = r4.get0(r2)
            com.android.dx.util.LabeledItem r3 = (com.android.dx.util.LabeledItem) r3
            if (r3 == 0) goto L1a
            int r3 = r3.getLabel()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L1a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "null at index "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L31:
            java.util.Arrays.sort(r1)
            return r1
    }

    public final int getMaxLabel() {
            r2 = this;
            com.android.dx.util.IntList r0 = r2.labelToIndex
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L15
            com.android.dx.util.IntList r1 = r2.labelToIndex
            int r1 = r1.get(r0)
            if (r1 >= 0) goto L15
            int r0 = r0 + (-1)
            goto L8
        L15:
            int r0 = r0 + 1
            com.android.dx.util.IntList r1 = r2.labelToIndex
            r1.shrink(r0)
            return r0
    }

    public final int indexOfLabel(int r2) {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.labelToIndex
            int r0 = r0.size()
            if (r2 < r0) goto La
            r2 = -1
            return r2
        La:
            com.android.dx.util.IntList r0 = r1.labelToIndex
            int r2 = r0.get(r2)
            return r2
    }

    public void set(int r2, com.android.dx.util.LabeledItem r3) {
            r1 = this;
            java.lang.Object r0 = r1.getOrNull0(r2)
            com.android.dx.util.LabeledItem r0 = (com.android.dx.util.LabeledItem) r0
            r1.set0(r2, r3)
            if (r0 == 0) goto L12
            int r0 = r0.getLabel()
            r1.removeLabel(r0)
        L12:
            if (r3 == 0) goto L1b
            int r3 = r3.getLabel()
            r1.addLabelIndex(r3, r2)
        L1b:
            return
    }

    @Override // com.android.dx.util.FixedSizeList
    public void shrinkToFit() {
            r0 = this;
            super.shrinkToFit()
            r0.rebuildLabelToIndex()
            return
    }
}
