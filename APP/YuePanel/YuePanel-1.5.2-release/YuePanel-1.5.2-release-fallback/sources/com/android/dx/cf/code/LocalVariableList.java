package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class LocalVariableList extends com.android.dx.util.FixedSizeList {
    public static final com.android.dx.cf.code.LocalVariableList EMPTY = null;

    public static class Item {
        private final com.android.dx.rop.cst.CstString descriptor;
        private final int index;
        private final int length;
        private final com.android.dx.rop.cst.CstString name;
        private final com.android.dx.rop.cst.CstString signature;
        private final int startPc;

        public Item(int r1, int r2, com.android.dx.rop.cst.CstString r3, com.android.dx.rop.cst.CstString r4, com.android.dx.rop.cst.CstString r5, int r6) {
                r0 = this;
                r0.<init>()
                if (r1 < 0) goto L3d
                if (r2 < 0) goto L35
                if (r3 == 0) goto L2d
                if (r4 != 0) goto L16
                if (r5 == 0) goto Le
                goto L16
            Le:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "(descriptor == null) && (signature == null)"
                r1.<init>(r2)
                throw r1
            L16:
                if (r6 < 0) goto L25
                r0.startPc = r1
                r0.length = r2
                r0.name = r3
                r0.descriptor = r4
                r0.signature = r5
                r0.index = r6
                return
            L25:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "index < 0"
                r1.<init>(r2)
                throw r1
            L2d:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "name == null"
                r1.<init>(r2)
                throw r1
            L35:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "length < 0"
                r1.<init>(r2)
                throw r1
            L3d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "startPc < 0"
                r1.<init>(r2)
                throw r1
        }

        public static /* synthetic */ com.android.dx.rop.cst.CstString access$000(com.android.dx.cf.code.LocalVariableList.Item r0) {
                com.android.dx.rop.cst.CstString r0 = r0.getSignature()
                return r0
        }

        private com.android.dx.rop.cst.CstString getSignature() {
                r1 = this;
                com.android.dx.rop.cst.CstString r0 = r1.signature
                return r0
        }

        public com.android.dx.rop.cst.CstString getDescriptor() {
                r1 = this;
                com.android.dx.rop.cst.CstString r0 = r1.descriptor
                return r0
        }

        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public int getLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }

        public com.android.dx.rop.code.LocalItem getLocalItem() {
                r2 = this;
                com.android.dx.rop.cst.CstString r0 = r2.name
                com.android.dx.rop.cst.CstString r1 = r2.signature
                com.android.dx.rop.code.LocalItem r0 = com.android.dx.rop.code.LocalItem.make(r0, r1)
                return r0
        }

        public int getStartPc() {
                r1 = this;
                int r0 = r1.startPc
                return r0
        }

        public com.android.dx.rop.type.Type getType() {
                r1 = this;
                com.android.dx.rop.cst.CstString r0 = r1.descriptor
                java.lang.String r0 = r0.getString()
                com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
                return r0
        }

        public boolean matchesAllButType(com.android.dx.cf.code.LocalVariableList.Item r3) {
                r2 = this;
                int r0 = r2.startPc
                int r1 = r3.startPc
                if (r0 != r1) goto L1e
                int r0 = r2.length
                int r1 = r3.length
                if (r0 != r1) goto L1e
                int r0 = r2.index
                int r1 = r3.index
                if (r0 != r1) goto L1e
                com.android.dx.rop.cst.CstString r0 = r2.name
                com.android.dx.rop.cst.CstString r3 = r3.name
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L1e
                r3 = 1
                goto L1f
            L1e:
                r3 = 0
            L1f:
                return r3
        }

        public boolean matchesPcAndIndex(int r2, int r3) {
                r1 = this;
                int r0 = r1.index
                if (r3 != r0) goto Lf
                int r3 = r1.startPc
                if (r2 < r3) goto Lf
                int r0 = r1.length
                int r3 = r3 + r0
                if (r2 >= r3) goto Lf
                r2 = 1
                goto L10
            Lf:
                r2 = 0
            L10:
                return r2
        }

        public com.android.dx.cf.code.LocalVariableList.Item withSignature(com.android.dx.rop.cst.CstString r9) {
                r8 = this;
                com.android.dx.cf.code.LocalVariableList$Item r7 = new com.android.dx.cf.code.LocalVariableList$Item
                int r1 = r8.startPc
                int r2 = r8.length
                com.android.dx.rop.cst.CstString r3 = r8.name
                com.android.dx.rop.cst.CstString r4 = r8.descriptor
                int r6 = r8.index
                r0 = r7
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    static {
            com.android.dx.cf.code.LocalVariableList r0 = new com.android.dx.cf.code.LocalVariableList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.cf.code.LocalVariableList.EMPTY = r0
            return
    }

    public LocalVariableList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.cf.code.LocalVariableList concat(com.android.dx.cf.code.LocalVariableList r6, com.android.dx.cf.code.LocalVariableList r7) {
            com.android.dx.cf.code.LocalVariableList r0 = com.android.dx.cf.code.LocalVariableList.EMPTY
            if (r6 != r0) goto L5
            return r7
        L5:
            int r0 = r6.size()
            int r1 = r7.size()
            com.android.dx.cf.code.LocalVariableList r2 = new com.android.dx.cf.code.LocalVariableList
            int r3 = r0 + r1
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L16:
            if (r4 >= r0) goto L22
            com.android.dx.cf.code.LocalVariableList$Item r5 = r6.get(r4)
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L16
        L22:
            if (r3 >= r1) goto L30
            int r6 = r0 + r3
            com.android.dx.cf.code.LocalVariableList$Item r4 = r7.get(r3)
            r2.set(r6, r4)
            int r3 = r3 + 1
            goto L22
        L30:
            r2.setImmutable()
            return r2
    }

    public static com.android.dx.cf.code.LocalVariableList mergeDescriptorsAndSignatures(com.android.dx.cf.code.LocalVariableList r5, com.android.dx.cf.code.LocalVariableList r6) {
            int r0 = r5.size()
            com.android.dx.cf.code.LocalVariableList r1 = new com.android.dx.cf.code.LocalVariableList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L24
            com.android.dx.cf.code.LocalVariableList$Item r3 = r5.get(r2)
            com.android.dx.cf.code.LocalVariableList$Item r4 = r6.itemToLocal(r3)
            if (r4 == 0) goto L1e
            com.android.dx.rop.cst.CstString r4 = com.android.dx.cf.code.LocalVariableList.Item.access$000(r4)
            com.android.dx.cf.code.LocalVariableList$Item r3 = r3.withSignature(r4)
        L1e:
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto La
        L24:
            r1.setImmutable()
            return r1
    }

    public com.android.dx.cf.code.LocalVariableList.Item get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.code.LocalVariableList$Item r1 = (com.android.dx.cf.code.LocalVariableList.Item) r1
            return r1
    }

    public com.android.dx.cf.code.LocalVariableList.Item itemToLocal(com.android.dx.cf.code.LocalVariableList.Item r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r4.get0(r1)
            com.android.dx.cf.code.LocalVariableList$Item r2 = (com.android.dx.cf.code.LocalVariableList.Item) r2
            if (r2 == 0) goto L16
            boolean r3 = r2.matchesAllButType(r5)
            if (r3 == 0) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    public com.android.dx.cf.code.LocalVariableList.Item pcAndIndexToLocal(int r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r4.get0(r1)
            com.android.dx.cf.code.LocalVariableList$Item r2 = (com.android.dx.cf.code.LocalVariableList.Item) r2
            if (r2 == 0) goto L16
            boolean r3 = r2.matchesPcAndIndex(r5, r6)
            if (r3 == 0) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    public void set(int r9, int r10, int r11, com.android.dx.rop.cst.CstString r12, com.android.dx.rop.cst.CstString r13, com.android.dx.rop.cst.CstString r14, int r15) {
            r8 = this;
            com.android.dx.cf.code.LocalVariableList$Item r7 = new com.android.dx.cf.code.LocalVariableList$Item
            r0 = r7
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.set0(r9, r7)
            return
    }

    public void set(int r1, com.android.dx.cf.code.LocalVariableList.Item r2) {
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
