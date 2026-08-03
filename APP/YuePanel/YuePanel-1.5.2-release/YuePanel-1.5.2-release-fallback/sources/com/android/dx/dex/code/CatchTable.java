package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class CatchTable extends com.android.dx.util.FixedSizeList implements java.lang.Comparable<com.android.dx.dex.code.CatchTable> {
    public static final com.android.dx.dex.code.CatchTable EMPTY = null;

    public static class Entry implements java.lang.Comparable<com.android.dx.dex.code.CatchTable.Entry> {
        private final int end;
        private final com.android.dx.dex.code.CatchHandlerList handlers;
        private final int start;

        public Entry(int r2, int r3, com.android.dx.dex.code.CatchHandlerList r4) {
                r1 = this;
                r1.<init>()
                if (r2 < 0) goto L24
                if (r3 <= r2) goto L1c
                boolean r0 = r4.isMutable()
                if (r0 != 0) goto L14
                r1.start = r2
                r1.end = r3
                r1.handlers = r4
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "handlers.isMutable()"
                r2.<init>(r3)
                throw r2
            L1c:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "end <= start"
                r2.<init>(r3)
                throw r2
            L24:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "start < 0"
                r2.<init>(r3)
                throw r2
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.android.dx.dex.code.CatchTable.Entry r5) {
                r4 = this;
                int r0 = r4.start
                int r1 = r5.start
                r2 = -1
                if (r0 >= r1) goto L8
                return r2
            L8:
                r3 = 1
                if (r0 <= r1) goto Lc
                return r3
            Lc:
                int r0 = r4.end
                int r1 = r5.end
                if (r0 >= r1) goto L13
                return r2
            L13:
                if (r0 <= r1) goto L16
                return r3
            L16:
                com.android.dx.dex.code.CatchHandlerList r0 = r4.handlers
                com.android.dx.dex.code.CatchHandlerList r5 = r5.handlers
                int r5 = r0.compareTo2(r5)
                return r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.code.CatchTable.Entry r1) {
                r0 = this;
                com.android.dx.dex.code.CatchTable$Entry r1 = (com.android.dx.dex.code.CatchTable.Entry) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.android.dx.dex.code.CatchTable.Entry
                r1 = 0
                if (r0 == 0) goto Le
                com.android.dx.dex.code.CatchTable$Entry r3 = (com.android.dx.dex.code.CatchTable.Entry) r3
                int r3 = r2.compareTo2(r3)
                if (r3 != 0) goto Le
                r1 = 1
            Le:
                return r1
        }

        public int getEnd() {
                r1 = this;
                int r0 = r1.end
                return r0
        }

        public com.android.dx.dex.code.CatchHandlerList getHandlers() {
                r1 = this;
                com.android.dx.dex.code.CatchHandlerList r0 = r1.handlers
                return r0
        }

        public int getStart() {
                r1 = this;
                int r0 = r1.start
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.start
                int r0 = r0 * 31
                int r1 = r2.end
                int r0 = r0 + r1
                int r0 = r0 * 31
                com.android.dx.dex.code.CatchHandlerList r1 = r2.handlers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            com.android.dx.dex.code.CatchTable r0 = new com.android.dx.dex.code.CatchTable
            r1 = 0
            r0.<init>(r1)
            com.android.dx.dex.code.CatchTable.EMPTY = r0
            return
    }

    public CatchTable(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.dex.code.CatchTable r8) {
            r7 = this;
            r0 = 0
            if (r7 != r8) goto L4
            return r0
        L4:
            int r1 = r7.size()
            int r2 = r8.size()
            int r3 = java.lang.Math.min(r1, r2)
            r4 = r0
        L11:
            if (r4 >= r3) goto L25
            com.android.dx.dex.code.CatchTable$Entry r5 = r7.get(r4)
            com.android.dx.dex.code.CatchTable$Entry r6 = r8.get(r4)
            int r5 = r5.compareTo2(r6)
            if (r5 == 0) goto L22
            return r5
        L22:
            int r4 = r4 + 1
            goto L11
        L25:
            if (r1 >= r2) goto L29
            r8 = -1
            return r8
        L29:
            if (r1 <= r2) goto L2d
            r8 = 1
            return r8
        L2d:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.code.CatchTable r1) {
            r0 = this;
            com.android.dx.dex.code.CatchTable r1 = (com.android.dx.dex.code.CatchTable) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public com.android.dx.dex.code.CatchTable.Entry get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.dex.code.CatchTable$Entry r1 = (com.android.dx.dex.code.CatchTable.Entry) r1
            return r1
    }

    public void set(int r1, com.android.dx.dex.code.CatchTable.Entry r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }
}
