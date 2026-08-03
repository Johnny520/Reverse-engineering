package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class CatchHandlerList extends com.android.dx.util.FixedSizeList implements java.lang.Comparable<com.android.dx.dex.code.CatchHandlerList> {
    public static final com.android.dx.dex.code.CatchHandlerList EMPTY = null;

    public static class Entry implements java.lang.Comparable<com.android.dx.dex.code.CatchHandlerList.Entry> {
        private final com.android.dx.rop.cst.CstType exceptionType;
        private final int handler;

        public Entry(com.android.dx.rop.cst.CstType r1, int r2) {
                r0 = this;
                r0.<init>()
                if (r2 < 0) goto L14
                if (r1 == 0) goto Lc
                r0.handler = r2
                r0.exceptionType = r1
                return
            Lc:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "exceptionType == null"
                r1.<init>(r2)
                throw r1
            L14:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "handler < 0"
                r1.<init>(r2)
                throw r1
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.android.dx.dex.code.CatchHandlerList.Entry r3) {
                r2 = this;
                int r0 = r2.handler
                int r1 = r3.handler
                if (r0 >= r1) goto L8
                r3 = -1
                return r3
            L8:
                if (r0 <= r1) goto Lc
                r3 = 1
                return r3
            Lc:
                com.android.dx.rop.cst.CstType r0 = r2.exceptionType
                com.android.dx.rop.cst.CstType r3 = r3.exceptionType
                int r3 = r0.compareTo2(r3)
                return r3
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.code.CatchHandlerList.Entry r1) {
                r0 = this;
                com.android.dx.dex.code.CatchHandlerList$Entry r1 = (com.android.dx.dex.code.CatchHandlerList.Entry) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.android.dx.dex.code.CatchHandlerList.Entry
                r1 = 0
                if (r0 == 0) goto Le
                com.android.dx.dex.code.CatchHandlerList$Entry r3 = (com.android.dx.dex.code.CatchHandlerList.Entry) r3
                int r3 = r2.compareTo2(r3)
                if (r3 != 0) goto Le
                r1 = 1
            Le:
                return r1
        }

        public com.android.dx.rop.cst.CstType getExceptionType() {
                r1 = this;
                com.android.dx.rop.cst.CstType r0 = r1.exceptionType
                return r0
        }

        public int getHandler() {
                r1 = this;
                int r0 = r1.handler
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.handler
                int r0 = r0 * 31
                com.android.dx.rop.cst.CstType r1 = r2.exceptionType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            com.android.dx.dex.code.CatchHandlerList r0 = new com.android.dx.dex.code.CatchHandlerList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.dex.code.CatchHandlerList.EMPTY = r0
            return
    }

    public CatchHandlerList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public boolean catchesAll() {
            r2 = this;
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 + (-1)
            com.android.dx.dex.code.CatchHandlerList$Entry r0 = r2.get(r0)
            com.android.dx.rop.cst.CstType r0 = r0.getExceptionType()
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.OBJECT
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.dex.code.CatchHandlerList r8) {
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
            com.android.dx.dex.code.CatchHandlerList$Entry r5 = r7.get(r4)
            com.android.dx.dex.code.CatchHandlerList$Entry r6 = r8.get(r4)
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
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.code.CatchHandlerList r1) {
            r0 = this;
            com.android.dx.dex.code.CatchHandlerList r1 = (com.android.dx.dex.code.CatchHandlerList) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public com.android.dx.dex.code.CatchHandlerList.Entry get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.dex.code.CatchHandlerList$Entry r1 = (com.android.dx.dex.code.CatchHandlerList.Entry) r1
            return r1
    }

    public void set(int r1, com.android.dx.dex.code.CatchHandlerList.Entry r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }

    public void set(int r2, com.android.dx.rop.cst.CstType r3, int r4) {
            r1 = this;
            com.android.dx.dex.code.CatchHandlerList$Entry r0 = new com.android.dx.dex.code.CatchHandlerList$Entry
            r0.<init>(r3, r4)
            r1.set0(r2, r0)
            return
    }

    @Override // com.android.dx.util.FixedSizeList, com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.toHuman(r0, r0)
            return r0
    }

    public java.lang.String toHuman(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            int r1 = r4.size()
            r0.append(r5)
            r0.append(r6)
            java.lang.String r6 = "catch "
            r0.append(r6)
            r6 = 0
        L17:
            if (r6 >= r1) goto L5a
            com.android.dx.dex.code.CatchHandlerList$Entry r2 = r4.get(r6)
            if (r6 == 0) goto L2c
            java.lang.String r3 = ",\n"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "  "
            r0.append(r3)
        L2c:
            int r3 = r1 + (-1)
            if (r6 != r3) goto L3c
            boolean r3 = r4.catchesAll()
            if (r3 == 0) goto L3c
            java.lang.String r3 = "<any>"
            r0.append(r3)
            goto L47
        L3c:
            com.android.dx.rop.cst.CstType r3 = r2.getExceptionType()
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
        L47:
            java.lang.String r3 = " -> "
            r0.append(r3)
            int r2 = r2.getHandler()
            java.lang.String r2 = com.android.dx.util.Hex.u2or4(r2)
            r0.append(r2)
            int r6 = r6 + 1
            goto L17
        L5a:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
