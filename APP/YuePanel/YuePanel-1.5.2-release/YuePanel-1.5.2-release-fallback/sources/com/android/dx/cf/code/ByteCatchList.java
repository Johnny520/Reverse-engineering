package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class ByteCatchList extends com.android.dx.util.FixedSizeList {
    public static final com.android.dx.cf.code.ByteCatchList EMPTY = null;

    public static class Item {
        private final int endPc;
        private final com.android.dx.rop.cst.CstType exceptionClass;
        private final int handlerPc;
        private final int startPc;

        public Item(int r1, int r2, int r3, com.android.dx.rop.cst.CstType r4) {
                r0 = this;
                r0.<init>()
                if (r1 < 0) goto L22
                if (r2 < r1) goto L1a
                if (r3 < 0) goto L12
                r0.startPc = r1
                r0.endPc = r2
                r0.handlerPc = r3
                r0.exceptionClass = r4
                return
            L12:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "handlerPc < 0"
                r1.<init>(r2)
                throw r1
            L1a:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "endPc < startPc"
                r1.<init>(r2)
                throw r1
            L22:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "startPc < 0"
                r1.<init>(r2)
                throw r1
        }

        public boolean covers(int r2) {
                r1 = this;
                int r0 = r1.startPc
                if (r2 < r0) goto La
                int r0 = r1.endPc
                if (r2 >= r0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        public int getEndPc() {
                r1 = this;
                int r0 = r1.endPc
                return r0
        }

        public com.android.dx.rop.cst.CstType getExceptionClass() {
                r1 = this;
                com.android.dx.rop.cst.CstType r0 = r1.exceptionClass
                if (r0 == 0) goto L5
                goto L7
            L5:
                com.android.dx.rop.cst.CstType r0 = com.android.dx.rop.cst.CstType.OBJECT
            L7:
                return r0
        }

        public int getHandlerPc() {
                r1 = this;
                int r0 = r1.handlerPc
                return r0
        }

        public int getStartPc() {
                r1 = this;
                int r0 = r1.startPc
                return r0
        }
    }

    static {
            com.android.dx.cf.code.ByteCatchList r0 = new com.android.dx.cf.code.ByteCatchList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.cf.code.ByteCatchList.EMPTY = r0
            return
    }

    public ByteCatchList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static boolean typeNotFound(com.android.dx.cf.code.ByteCatchList.Item r4, com.android.dx.cf.code.ByteCatchList.Item[] r5, int r6) {
            com.android.dx.rop.cst.CstType r4 = r4.getExceptionClass()
            r0 = 0
            r1 = r0
        L6:
            if (r1 >= r6) goto L19
            r2 = r5[r1]
            com.android.dx.rop.cst.CstType r2 = r2.getExceptionClass()
            if (r2 == r4) goto L18
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.OBJECT
            if (r2 != r3) goto L15
            goto L18
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            return r0
        L19:
            r4 = 1
            return r4
    }

    public int byteLength() {
            r1 = this;
            int r0 = r1.size()
            int r0 = r0 * 8
            int r0 = r0 + 2
            return r0
    }

    public com.android.dx.cf.code.ByteCatchList.Item get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.code.ByteCatchList$Item r1 = (com.android.dx.cf.code.ByteCatchList.Item) r1
            return r1
    }

    public com.android.dx.cf.code.ByteCatchList listFor(int r8) {
            r7 = this;
            int r0 = r7.size()
            com.android.dx.cf.code.ByteCatchList$Item[] r1 = new com.android.dx.cf.code.ByteCatchList.Item[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            if (r3 >= r0) goto L22
            com.android.dx.cf.code.ByteCatchList$Item r5 = r7.get(r3)
            boolean r6 = r5.covers(r8)
            if (r6 == 0) goto L1f
            boolean r6 = typeNotFound(r5, r1, r4)
            if (r6 == 0) goto L1f
            r1[r4] = r5
            int r4 = r4 + 1
        L1f:
            int r3 = r3 + 1
            goto L9
        L22:
            if (r4 != 0) goto L27
            com.android.dx.cf.code.ByteCatchList r8 = com.android.dx.cf.code.ByteCatchList.EMPTY
            return r8
        L27:
            com.android.dx.cf.code.ByteCatchList r8 = new com.android.dx.cf.code.ByteCatchList
            r8.<init>(r4)
        L2c:
            if (r2 >= r4) goto L36
            r0 = r1[r2]
            r8.set(r2, r0)
            int r2 = r2 + 1
            goto L2c
        L36:
            r8.setImmutable()
            return r8
    }

    public void set(int r2, int r3, int r4, int r5, com.android.dx.rop.cst.CstType r6) {
            r1 = this;
            com.android.dx.cf.code.ByteCatchList$Item r0 = new com.android.dx.cf.code.ByteCatchList$Item
            r0.<init>(r3, r4, r5, r6)
            r1.set0(r2, r0)
            return
    }

    public void set(int r1, com.android.dx.cf.code.ByteCatchList.Item r2) {
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

    public com.android.dx.rop.type.TypeList toRopCatchList() {
            r4 = this;
            int r0 = r4.size()
            if (r0 != 0) goto L9
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.EMPTY
            return r0
        L9:
            com.android.dx.rop.type.StdTypeList r1 = new com.android.dx.rop.type.StdTypeList
            r1.<init>(r0)
            r2 = 0
        Lf:
            if (r2 >= r0) goto L23
            com.android.dx.cf.code.ByteCatchList$Item r3 = r4.get(r2)
            com.android.dx.rop.cst.CstType r3 = r3.getExceptionClass()
            com.android.dx.rop.type.Type r3 = r3.getClassType()
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto Lf
        L23:
            r1.setImmutable()
            return r1
    }

    public com.android.dx.util.IntList toTargetList(int r6) {
            r5 = this;
            r0 = -1
            if (r6 < r0) goto L39
            r0 = 0
            if (r6 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = r0
        L9:
            int r2 = r5.size()
            if (r2 != 0) goto L19
            if (r1 == 0) goto L16
            com.android.dx.util.IntList r6 = com.android.dx.util.IntList.makeImmutable(r6)
            return r6
        L16:
            com.android.dx.util.IntList r6 = com.android.dx.util.IntList.EMPTY
            return r6
        L19:
            com.android.dx.util.IntList r3 = new com.android.dx.util.IntList
            int r4 = r2 + r1
            r3.<init>(r4)
        L20:
            if (r0 >= r2) goto L30
            com.android.dx.cf.code.ByteCatchList$Item r4 = r5.get(r0)
            int r4 = r4.getHandlerPc()
            r3.add(r4)
            int r0 = r0 + 1
            goto L20
        L30:
            if (r1 == 0) goto L35
            r3.add(r6)
        L35:
            r3.setImmutable()
            return r3
        L39:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "noException < -1"
            r6.<init>(r0)
            throw r6
    }
}
