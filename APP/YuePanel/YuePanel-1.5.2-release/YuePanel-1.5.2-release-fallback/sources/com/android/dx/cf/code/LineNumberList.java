package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class LineNumberList extends com.android.dx.util.FixedSizeList {
    public static final com.android.dx.cf.code.LineNumberList EMPTY = null;

    public static class Item {
        private final int lineNumber;
        private final int startPc;

        public Item(int r1, int r2) {
                r0 = this;
                r0.<init>()
                if (r1 < 0) goto L14
                if (r2 < 0) goto Lc
                r0.startPc = r1
                r0.lineNumber = r2
                return
            Lc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "lineNumber < 0"
                r1.<init>(r2)
                throw r1
            L14:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "startPc < 0"
                r1.<init>(r2)
                throw r1
        }

        public int getLineNumber() {
                r1 = this;
                int r0 = r1.lineNumber
                return r0
        }

        public int getStartPc() {
                r1 = this;
                int r0 = r1.startPc
                return r0
        }
    }

    static {
            com.android.dx.cf.code.LineNumberList r0 = new com.android.dx.cf.code.LineNumberList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.cf.code.LineNumberList.EMPTY = r0
            return
    }

    public LineNumberList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.cf.code.LineNumberList concat(com.android.dx.cf.code.LineNumberList r6, com.android.dx.cf.code.LineNumberList r7) {
            com.android.dx.cf.code.LineNumberList r0 = com.android.dx.cf.code.LineNumberList.EMPTY
            if (r6 != r0) goto L5
            return r7
        L5:
            int r0 = r6.size()
            int r1 = r7.size()
            com.android.dx.cf.code.LineNumberList r2 = new com.android.dx.cf.code.LineNumberList
            int r3 = r0 + r1
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r0) goto L22
            com.android.dx.cf.code.LineNumberList$Item r5 = r6.get(r4)
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L16
        L22:
            if (r3 >= r1) goto L30
            int r6 = r0 + r3
            com.android.dx.cf.code.LineNumberList$Item r4 = r7.get(r3)
            r2.set(r6, r4)
            int r3 = r3 + 1
            goto L22
        L30:
            return r2
    }

    public com.android.dx.cf.code.LineNumberList.Item get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.code.LineNumberList$Item r1 = (com.android.dx.cf.code.LineNumberList.Item) r1
            return r1
    }

    public int pcToLine(int r7) {
            r6 = this;
            int r0 = r6.size()
            r1 = -1
            r2 = 0
            r3 = r2
            r2 = r1
        L8:
            if (r3 >= r0) goto L21
            com.android.dx.cf.code.LineNumberList$Item r4 = r6.get(r3)
            int r5 = r4.getStartPc()
            if (r5 > r7) goto L1e
            if (r5 <= r1) goto L1e
            int r2 = r4.getLineNumber()
            if (r5 != r7) goto L1d
            goto L21
        L1d:
            r1 = r5
        L1e:
            int r3 = r3 + 1
            goto L8
        L21:
            return r2
    }

    public void set(int r2, int r3, int r4) {
            r1 = this;
            com.android.dx.cf.code.LineNumberList$Item r0 = new com.android.dx.cf.code.LineNumberList$Item
            r0.<init>(r3, r4)
            r1.set0(r2, r0)
            return
    }

    public void set(int r1, com.android.dx.cf.code.LineNumberList.Item r2) {
            r0 = this;
            if (r2 == 0) goto L6
            r0.set0(r1, r2)
            return
        L6:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "item == null"
            r1.<init>(r2)
            throw r1
    }
}
