package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class RegisterSpecList extends com.android.dx.util.FixedSizeList implements com.android.dx.rop.type.TypeList {
    public static final com.android.dx.rop.code.RegisterSpecList EMPTY = null;

    /* JADX INFO: renamed from: com.android.dx.rop.code.RegisterSpecList$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Expander {
        private int base;
        private final java.util.BitSet compatRegs;
        private boolean duplicateFirst;
        private final com.android.dx.rop.code.RegisterSpecList regSpecList;
        private final com.android.dx.rop.code.RegisterSpecList result;

        private Expander(com.android.dx.rop.code.RegisterSpecList r1, java.util.BitSet r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.regSpecList = r1
                r0.compatRegs = r2
                r0.base = r3
                com.android.dx.rop.code.RegisterSpecList r2 = new com.android.dx.rop.code.RegisterSpecList
                int r1 = r1.size()
                r2.<init>(r1)
                r0.result = r2
                r0.duplicateFirst = r4
                return
        }

        public /* synthetic */ Expander(com.android.dx.rop.code.RegisterSpecList r1, java.util.BitSet r2, int r3, boolean r4, com.android.dx.rop.code.RegisterSpecList.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static /* synthetic */ void access$100(com.android.dx.rop.code.RegisterSpecList.Expander r0, int r1) {
                r0.expandRegister(r1)
                return
        }

        public static /* synthetic */ com.android.dx.rop.code.RegisterSpecList access$200(com.android.dx.rop.code.RegisterSpecList.Expander r0) {
                com.android.dx.rop.code.RegisterSpecList r0 = r0.getResult()
                return r0
        }

        private void expandRegister(int r2) {
                r1 = this;
                com.android.dx.rop.code.RegisterSpecList r0 = r1.regSpecList
                java.lang.Object r0 = com.android.dx.rop.code.RegisterSpecList.access$300(r0, r2)
                com.android.dx.rop.code.RegisterSpec r0 = (com.android.dx.rop.code.RegisterSpec) r0
                r1.expandRegister(r2, r0)
                return
        }

        private void expandRegister(int r3, com.android.dx.rop.code.RegisterSpec r4) {
                r2 = this;
                java.util.BitSet r0 = r2.compatRegs
                if (r0 != 0) goto L5
                goto Lb
            L5:
                boolean r0 = r0.get(r3)
                if (r0 != 0) goto L1e
            Lb:
                int r0 = r2.base
                com.android.dx.rop.code.RegisterSpec r4 = r4.withReg(r0)
                boolean r0 = r2.duplicateFirst
                if (r0 != 0) goto L1e
                int r0 = r2.base
                int r1 = r4.getCategory()
                int r0 = r0 + r1
                r2.base = r0
            L1e:
                r0 = 0
                r2.duplicateFirst = r0
                com.android.dx.rop.code.RegisterSpecList r0 = r2.result
                com.android.dx.rop.code.RegisterSpecList.access$400(r0, r3, r4)
                return
        }

        private com.android.dx.rop.code.RegisterSpecList getResult() {
                r1 = this;
                com.android.dx.rop.code.RegisterSpecList r0 = r1.regSpecList
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto Ld
                com.android.dx.rop.code.RegisterSpecList r0 = r1.result
                r0.setImmutable()
            Ld:
                com.android.dx.rop.code.RegisterSpecList r0 = r1.result
                return r0
        }
    }

    static {
            com.android.dx.rop.code.RegisterSpecList r0 = new com.android.dx.rop.code.RegisterSpecList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.rop.code.RegisterSpecList.EMPTY = r0
            return
    }

    public RegisterSpecList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ java.lang.Object access$300(com.android.dx.rop.code.RegisterSpecList r0, int r1) {
            java.lang.Object r0 = r0.get0(r1)
            return r0
    }

    public static /* synthetic */ void access$400(com.android.dx.rop.code.RegisterSpecList r0, int r1, java.lang.Object r2) {
            r0.set0(r1, r2)
            return
    }

    public static com.android.dx.rop.code.RegisterSpecList make(com.android.dx.rop.code.RegisterSpec r2) {
            com.android.dx.rop.code.RegisterSpecList r0 = new com.android.dx.rop.code.RegisterSpecList
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            return r0
    }

    public static com.android.dx.rop.code.RegisterSpecList make(com.android.dx.rop.code.RegisterSpec r2, com.android.dx.rop.code.RegisterSpec r3) {
            com.android.dx.rop.code.RegisterSpecList r0 = new com.android.dx.rop.code.RegisterSpecList
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            r2 = 1
            r0.set(r2, r3)
            return r0
    }

    public static com.android.dx.rop.code.RegisterSpecList make(com.android.dx.rop.code.RegisterSpec r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpec r4) {
            com.android.dx.rop.code.RegisterSpecList r0 = new com.android.dx.rop.code.RegisterSpecList
            r1 = 3
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            r2 = 1
            r0.set(r2, r3)
            r2 = 2
            r0.set(r2, r4)
            return r0
    }

    public static com.android.dx.rop.code.RegisterSpecList make(com.android.dx.rop.code.RegisterSpec r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpec r4, com.android.dx.rop.code.RegisterSpec r5) {
            com.android.dx.rop.code.RegisterSpecList r0 = new com.android.dx.rop.code.RegisterSpecList
            r1 = 4
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            r2 = 1
            r0.set(r2, r3)
            r2 = 2
            r0.set(r2, r4)
            r2 = 3
            r0.set(r2, r5)
            return r0
    }

    public com.android.dx.rop.code.RegisterSpec get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.rop.code.RegisterSpec r1 = (com.android.dx.rop.code.RegisterSpec) r1
            return r1
    }

    public int getRegistersSize() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L1a
            java.lang.Object r3 = r4.get0(r1)
            com.android.dx.rop.code.RegisterSpec r3 = (com.android.dx.rop.code.RegisterSpec) r3
            if (r3 == 0) goto L17
            int r3 = r3.getNextReg()
            if (r3 <= r2) goto L17
            r2 = r3
        L17:
            int r1 = r1 + 1
            goto L6
        L1a:
            return r2
    }

    @Override // com.android.dx.rop.type.TypeList
    public com.android.dx.rop.type.Type getType(int r1) {
            r0 = this;
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r1)
            com.android.dx.rop.type.Type r1 = r1.getType()
            com.android.dx.rop.type.Type r1 = r1.getType()
            return r1
    }

    @Override // com.android.dx.rop.type.TypeList
    public int getWordCount() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L14
            com.android.dx.rop.type.Type r3 = r4.getType(r1)
            int r3 = r3.getCategory()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    public int indexOfRegister(int r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            com.android.dx.rop.code.RegisterSpec r2 = r3.get(r1)
            int r2 = r2.getReg()
            if (r2 != r4) goto L12
            return r1
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r4 = -1
            return r4
    }

    public void set(int r1, com.android.dx.rop.code.RegisterSpec r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }

    public com.android.dx.rop.code.RegisterSpec specForRegister(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
            int r3 = r2.getReg()
            if (r3 != r5) goto L12
            return r2
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r5 = 0
            return r5
    }

    public com.android.dx.rop.code.RegisterSpecList subset(java.util.BitSet r5) {
            r4 = this;
            int r0 = r4.size()
            int r1 = r5.cardinality()
            int r0 = r0 - r1
            if (r0 != 0) goto Le
            com.android.dx.rop.code.RegisterSpecList r5 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            return r5
        Le:
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r0 = 0
            r2 = r0
        L15:
            int r3 = r4.size()
            if (r0 >= r3) goto L2d
            boolean r3 = r5.get(r0)
            if (r3 != 0) goto L2a
            java.lang.Object r3 = r4.get0(r0)
            r1.set0(r2, r3)
            int r2 = r2 + 1
        L2a:
            int r0 = r0 + 1
            goto L15
        L2d:
            boolean r5 = r4.isImmutable()
            if (r5 == 0) goto L36
            r1.setImmutable()
        L36:
            return r1
    }

    @Override // com.android.dx.rop.type.TypeList
    public com.android.dx.rop.type.TypeList withAddedType(com.android.dx.rop.type.Type r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    public com.android.dx.rop.code.RegisterSpecList withExpandedRegisters(int r9, boolean r10, java.util.BitSet r11) {
            r8 = this;
            int r0 = r8.size()
            if (r0 != 0) goto L7
            return r8
        L7:
            com.android.dx.rop.code.RegisterSpecList$Expander r7 = new com.android.dx.rop.code.RegisterSpecList$Expander
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r11
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = 0
        L13:
            if (r9 >= r0) goto L1b
            com.android.dx.rop.code.RegisterSpecList.Expander.access$100(r7, r9)
            int r9 = r9 + 1
            goto L13
        L1b:
            com.android.dx.rop.code.RegisterSpecList r9 = com.android.dx.rop.code.RegisterSpecList.Expander.access$200(r7)
            return r9
    }

    public com.android.dx.rop.code.RegisterSpecList withFirst(com.android.dx.rop.code.RegisterSpec r6) {
            r5 = this;
            int r0 = r5.size()
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            int r2 = r0 + 1
            r1.<init>(r2)
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r0) goto L1a
            int r4 = r3 + 1
            java.lang.Object r3 = r5.get0(r3)
            r1.set0(r4, r3)
            r3 = r4
            goto Ld
        L1a:
            r1.set0(r2, r6)
            boolean r6 = r5.isImmutable()
            if (r6 == 0) goto L26
            r1.setImmutable()
        L26:
            return r1
    }

    public com.android.dx.rop.code.RegisterSpecList withOffset(int r5) {
            r4 = this;
            int r0 = r4.size()
            if (r0 != 0) goto L7
            return r4
        L7:
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r2 = 0
        Ld:
            if (r2 >= r0) goto L21
            java.lang.Object r3 = r4.get0(r2)
            com.android.dx.rop.code.RegisterSpec r3 = (com.android.dx.rop.code.RegisterSpec) r3
            if (r3 == 0) goto L1e
            com.android.dx.rop.code.RegisterSpec r3 = r3.withOffset(r5)
            r1.set0(r2, r3)
        L1e:
            int r2 = r2 + 1
            goto Ld
        L21:
            boolean r5 = r4.isImmutable()
            if (r5 == 0) goto L2a
            r1.setImmutable()
        L2a:
            return r1
    }

    public com.android.dx.rop.code.RegisterSpecList withoutFirst() {
            r5 = this;
            int r0 = r5.size()
            int r0 = r0 + (-1)
            if (r0 != 0) goto Lb
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            return r0
        Lb:
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r2 = 0
        L11:
            if (r2 >= r0) goto L1e
            int r3 = r2 + 1
            java.lang.Object r4 = r5.get0(r3)
            r1.set0(r2, r4)
            r2 = r3
            goto L11
        L1e:
            boolean r0 = r5.isImmutable()
            if (r0 == 0) goto L27
            r1.setImmutable()
        L27:
            return r1
    }

    public com.android.dx.rop.code.RegisterSpecList withoutLast() {
            r4 = this;
            int r0 = r4.size()
            int r0 = r0 + (-1)
            if (r0 != 0) goto Lb
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            return r0
        Lb:
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r2 = 0
        L11:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r4.get0(r2)
            r1.set0(r2, r3)
            int r2 = r2 + 1
            goto L11
        L1d:
            boolean r0 = r4.isImmutable()
            if (r0 == 0) goto L26
            r1.setImmutable()
        L26:
            return r1
    }
}
