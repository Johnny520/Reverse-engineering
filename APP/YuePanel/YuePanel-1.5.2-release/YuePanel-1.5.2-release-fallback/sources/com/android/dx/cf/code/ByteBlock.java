package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBlock implements com.android.dx.util.LabeledItem {
    private final com.android.dx.cf.code.ByteCatchList catches;
    private final int end;
    private final int label;
    private final int start;
    private final com.android.dx.util.IntList successors;

    public ByteBlock(int r4, int r5, int r6, com.android.dx.util.IntList r7, com.android.dx.cf.code.ByteCatchList r8) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto L6b
            if (r5 < 0) goto L63
            if (r6 <= r5) goto L5b
            if (r7 == 0) goto L53
            int r0 = r7.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L3e
            int r2 = r7.get(r1)
            if (r2 < 0) goto L1b
            int r1 = r1 + 1
            goto L10
        L1b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "successors["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = "] == "
            r5.append(r6)
            int r6 = r7.get(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3e:
            if (r8 == 0) goto L4b
            r3.label = r4
            r3.start = r5
            r3.end = r6
            r3.successors = r7
            r3.catches = r8
            return
        L4b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "catches == null"
            r4.<init>(r5)
            throw r4
        L53:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "targets == null"
            r4.<init>(r5)
            throw r4
        L5b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "end <= start"
            r4.<init>(r5)
            throw r4
        L63:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "start < 0"
            r4.<init>(r5)
            throw r4
        L6b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "label < 0"
            r4.<init>(r5)
            throw r4
    }

    public com.android.dx.cf.code.ByteCatchList getCatches() {
            r1 = this;
            com.android.dx.cf.code.ByteCatchList r0 = r1.catches
            return r0
    }

    public int getEnd() {
            r1 = this;
            int r0 = r1.end
            return r0
    }

    @Override // com.android.dx.util.LabeledItem
    public int getLabel() {
            r1 = this;
            int r0 = r1.label
            return r0
    }

    public int getStart() {
            r1 = this;
            int r0 = r1.start
            return r0
    }

    public com.android.dx.util.IntList getSuccessors() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.successors
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r2.label
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            int r1 = r2.start
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.end
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
