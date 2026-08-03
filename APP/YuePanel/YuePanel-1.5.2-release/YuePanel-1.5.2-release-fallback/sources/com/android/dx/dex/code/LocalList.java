package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class LocalList extends com.android.dx.util.FixedSizeList {
    private static final boolean DEBUG = false;
    public static final com.android.dx.dex.code.LocalList EMPTY = null;

    public enum Disposition extends java.lang.Enum<com.android.dx.dex.code.LocalList.Disposition> {
        private static final /* synthetic */ com.android.dx.dex.code.LocalList.Disposition[] $VALUES = null;
        public static final com.android.dx.dex.code.LocalList.Disposition END_CLOBBERED_BY_NEXT = null;
        public static final com.android.dx.dex.code.LocalList.Disposition END_CLOBBERED_BY_PREV = null;
        public static final com.android.dx.dex.code.LocalList.Disposition END_MOVED = null;
        public static final com.android.dx.dex.code.LocalList.Disposition END_REPLACED = null;
        public static final com.android.dx.dex.code.LocalList.Disposition END_SIMPLY = null;
        public static final com.android.dx.dex.code.LocalList.Disposition START = null;

        static {
                com.android.dx.dex.code.LocalList$Disposition r0 = new com.android.dx.dex.code.LocalList$Disposition
                java.lang.String r1 = "START"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.dex.code.LocalList.Disposition.START = r0
                com.android.dx.dex.code.LocalList$Disposition r1 = new com.android.dx.dex.code.LocalList$Disposition
                java.lang.String r2 = "END_SIMPLY"
                r3 = 1
                r1.<init>(r2, r3)
                com.android.dx.dex.code.LocalList.Disposition.END_SIMPLY = r1
                com.android.dx.dex.code.LocalList$Disposition r2 = new com.android.dx.dex.code.LocalList$Disposition
                java.lang.String r3 = "END_REPLACED"
                r4 = 2
                r2.<init>(r3, r4)
                com.android.dx.dex.code.LocalList.Disposition.END_REPLACED = r2
                com.android.dx.dex.code.LocalList$Disposition r3 = new com.android.dx.dex.code.LocalList$Disposition
                java.lang.String r4 = "END_MOVED"
                r5 = 3
                r3.<init>(r4, r5)
                com.android.dx.dex.code.LocalList.Disposition.END_MOVED = r3
                com.android.dx.dex.code.LocalList$Disposition r4 = new com.android.dx.dex.code.LocalList$Disposition
                java.lang.String r5 = "END_CLOBBERED_BY_PREV"
                r6 = 4
                r4.<init>(r5, r6)
                com.android.dx.dex.code.LocalList.Disposition.END_CLOBBERED_BY_PREV = r4
                com.android.dx.dex.code.LocalList$Disposition r5 = new com.android.dx.dex.code.LocalList$Disposition
                java.lang.String r6 = "END_CLOBBERED_BY_NEXT"
                r7 = 5
                r5.<init>(r6, r7)
                com.android.dx.dex.code.LocalList.Disposition.END_CLOBBERED_BY_NEXT = r5
                com.android.dx.dex.code.LocalList$Disposition[] r0 = new com.android.dx.dex.code.LocalList.Disposition[]{r0, r1, r2, r3, r4, r5}
                com.android.dx.dex.code.LocalList.Disposition.$VALUES = r0
                return
        }

        Disposition(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.dex.code.LocalList.Disposition valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.dex.code.LocalList$Disposition> r0 = com.android.dx.dex.code.LocalList.Disposition.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.dex.code.LocalList$Disposition r1 = (com.android.dx.dex.code.LocalList.Disposition) r1
                return r1
        }

        public static com.android.dx.dex.code.LocalList.Disposition[] values() {
                com.android.dx.dex.code.LocalList$Disposition[] r0 = com.android.dx.dex.code.LocalList.Disposition.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.dex.code.LocalList$Disposition[] r0 = (com.android.dx.dex.code.LocalList.Disposition[]) r0
                return r0
        }
    }

    public static class Entry implements java.lang.Comparable<com.android.dx.dex.code.LocalList.Entry> {
        private final int address;
        private final com.android.dx.dex.code.LocalList.Disposition disposition;
        private final com.android.dx.rop.code.RegisterSpec spec;
        private final com.android.dx.rop.cst.CstType type;

        public Entry(int r2, com.android.dx.dex.code.LocalList.Disposition r3, com.android.dx.rop.code.RegisterSpec r4) {
                r1 = this;
                r1.<init>()
                if (r2 < 0) goto L36
                if (r3 == 0) goto L2e
                com.android.dx.rop.code.LocalItem r0 = r4.getLocalItem()     // Catch: java.lang.NullPointerException -> L26
                if (r0 == 0) goto L1e
                r1.address = r2
                r1.disposition = r3
                r1.spec = r4
                com.android.dx.rop.type.Type r2 = r4.getType()
                com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.intern(r2)
                r1.type = r2
                return
            L1e:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.NullPointerException -> L26
                java.lang.String r3 = "spec.getLocalItem() == null"
                r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L26
                throw r2     // Catch: java.lang.NullPointerException -> L26
            L26:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "spec == null"
                r2.<init>(r3)
                throw r2
            L2e:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r3 = "disposition == null"
                r2.<init>(r3)
                throw r2
            L36:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "address < 0"
                r2.<init>(r3)
                throw r2
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.android.dx.dex.code.LocalList.Entry r5) {
                r4 = this;
                int r0 = r4.address
                int r1 = r5.address
                r2 = -1
                if (r0 >= r1) goto L8
                return r2
            L8:
                r3 = 1
                if (r0 <= r1) goto Lc
                return r3
            Lc:
                boolean r0 = r4.isStart()
                boolean r1 = r5.isStart()
                if (r0 == r1) goto L1a
                if (r0 == 0) goto L19
                r2 = r3
            L19:
                return r2
            L1a:
                com.android.dx.rop.code.RegisterSpec r0 = r4.spec
                com.android.dx.rop.code.RegisterSpec r5 = r5.spec
                int r5 = r0.compareTo2(r5)
                return r5
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.code.LocalList.Entry r1) {
                r0 = this;
                com.android.dx.dex.code.LocalList$Entry r1 = (com.android.dx.dex.code.LocalList.Entry) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof com.android.dx.dex.code.LocalList.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.android.dx.dex.code.LocalList$Entry r3 = (com.android.dx.dex.code.LocalList.Entry) r3
                int r3 = r2.compareTo2(r3)
                if (r3 != 0) goto Lf
                r1 = 1
            Lf:
                return r1
        }

        public int getAddress() {
                r1 = this;
                int r0 = r1.address
                return r0
        }

        public com.android.dx.dex.code.LocalList.Disposition getDisposition() {
                r1 = this;
                com.android.dx.dex.code.LocalList$Disposition r0 = r1.disposition
                return r0
        }

        public com.android.dx.rop.cst.CstString getName() {
                r1 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r1.spec
                com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
                com.android.dx.rop.cst.CstString r0 = r0.getName()
                return r0
        }

        public int getRegister() {
                r1 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r1.spec
                int r0 = r0.getReg()
                return r0
        }

        public com.android.dx.rop.code.RegisterSpec getRegisterSpec() {
                r1 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r1.spec
                return r0
        }

        public com.android.dx.rop.cst.CstString getSignature() {
                r1 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r1.spec
                com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
                com.android.dx.rop.cst.CstString r0 = r0.getSignature()
                return r0
        }

        public com.android.dx.rop.cst.CstType getType() {
                r1 = this;
                com.android.dx.rop.cst.CstType r0 = r1.type
                return r0
        }

        public boolean isStart() {
                r2 = this;
                com.android.dx.dex.code.LocalList$Disposition r0 = r2.disposition
                com.android.dx.dex.code.LocalList$Disposition r1 = com.android.dx.dex.code.LocalList.Disposition.START
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean matches(com.android.dx.dex.code.LocalList.Entry r1) {
                r0 = this;
                com.android.dx.rop.code.RegisterSpec r1 = r1.spec
                boolean r1 = r0.matches(r1)
                return r1
        }

        public boolean matches(com.android.dx.rop.code.RegisterSpec r2) {
                r1 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r1.spec
                boolean r2 = r0.equalsUsingSimpleType(r2)
                return r2
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.address
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                com.android.dx.dex.code.LocalList$Disposition r2 = r3.disposition
                r0.append(r2)
                r0.append(r1)
                com.android.dx.rop.code.RegisterSpec r1 = r3.spec
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public com.android.dx.dex.code.LocalList.Entry withDisposition(com.android.dx.dex.code.LocalList.Disposition r4) {
                r3 = this;
                com.android.dx.dex.code.LocalList$Disposition r0 = r3.disposition
                if (r4 != r0) goto L5
                return r3
            L5:
                com.android.dx.dex.code.LocalList$Entry r0 = new com.android.dx.dex.code.LocalList$Entry
                int r1 = r3.address
                com.android.dx.rop.code.RegisterSpec r2 = r3.spec
                r0.<init>(r1, r4, r2)
                return r0
        }
    }

    public static class MakeState {
        private int[] endIndices;
        private final int lastAddress;
        private int nullResultCount;
        private com.android.dx.rop.code.RegisterSpecSet regs;
        private final java.util.ArrayList<com.android.dx.dex.code.LocalList.Entry> result;

        public MakeState(int r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                r1.result = r0
                r2 = 0
                r1.nullResultCount = r2
                r0 = 0
                r1.regs = r0
                r1.endIndices = r0
                r1.lastAddress = r2
                return
        }

        private void aboutToProcess(int r6, int r7) {
                r5 = this;
                int[] r0 = r5.endIndices
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L8
                r3 = r1
                goto L9
            L8:
                r3 = r2
            L9:
                int r4 = r5.lastAddress
                if (r6 != r4) goto L10
                if (r3 != 0) goto L10
                return
            L10:
                if (r6 < r4) goto L35
                if (r3 != 0) goto L17
                int r6 = r0.length
                if (r7 < r6) goto L34
            L17:
                int r7 = r7 + r1
                com.android.dx.rop.code.RegisterSpecSet r6 = new com.android.dx.rop.code.RegisterSpecSet
                r6.<init>(r7)
                int[] r7 = new int[r7]
                r0 = -1
                java.util.Arrays.fill(r7, r0)
                if (r3 != 0) goto L30
                com.android.dx.rop.code.RegisterSpecSet r0 = r5.regs
                r6.putAll(r0)
                int[] r0 = r5.endIndices
                int r1 = r0.length
                java.lang.System.arraycopy(r0, r2, r7, r2, r1)
            L30:
                r5.regs = r6
                r5.endIndices = r7
            L34:
                return
            L35:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "shouldn't happen"
                r6.<init>(r7)
                throw r6
        }

        private void add(int r4, com.android.dx.dex.code.LocalList.Disposition r5, com.android.dx.rop.code.RegisterSpec r6) {
                r3 = this;
                int r0 = r6.getReg()
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r1 = r3.result
                com.android.dx.dex.code.LocalList$Entry r2 = new com.android.dx.dex.code.LocalList$Entry
                r2.<init>(r4, r5, r6)
                r1.add(r2)
                com.android.dx.dex.code.LocalList$Disposition r4 = com.android.dx.dex.code.LocalList.Disposition.START
                if (r5 != r4) goto L1d
                com.android.dx.rop.code.RegisterSpecSet r4 = r3.regs
                r4.put(r6)
                int[] r4 = r3.endIndices
                r5 = -1
                r4[r0] = r5
                goto L2e
            L1d:
                com.android.dx.rop.code.RegisterSpecSet r4 = r3.regs
                r4.remove(r6)
                int[] r4 = r3.endIndices
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r5 = r3.result
                int r5 = r5.size()
                int r5 = r5 + (-1)
                r4[r0] = r5
            L2e:
                return
        }

        private void addOrUpdateEnd(int r4, com.android.dx.dex.code.LocalList.Disposition r5, com.android.dx.rop.code.RegisterSpec r6) {
                r3 = this;
                com.android.dx.dex.code.LocalList$Disposition r0 = com.android.dx.dex.code.LocalList.Disposition.START
                if (r5 == r0) goto L39
                int r0 = r6.getReg()
                int[] r1 = r3.endIndices
                r0 = r1[r0]
                if (r0 < 0) goto L35
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r1 = r3.result
                java.lang.Object r1 = r1.get(r0)
                com.android.dx.dex.code.LocalList$Entry r1 = (com.android.dx.dex.code.LocalList.Entry) r1
                int r2 = r1.getAddress()
                if (r2 != r4) goto L35
                com.android.dx.rop.code.RegisterSpec r2 = r1.getRegisterSpec()
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L35
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r4 = r3.result
                com.android.dx.dex.code.LocalList$Entry r5 = r1.withDisposition(r5)
                r4.set(r0, r5)
                com.android.dx.rop.code.RegisterSpecSet r4 = r3.regs
                r4.remove(r6)
                return
            L35:
                r3.endLocal(r4, r6, r5)
                return
            L39:
                java.lang.RuntimeException r4 = new java.lang.RuntimeException
                java.lang.String r5 = "shouldn't happen"
                r4.<init>(r5)
                throw r4
        }

        private boolean checkForEmptyRange(int r6, com.android.dx.rop.code.RegisterSpec r7) {
                r5 = this;
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r0 = r5.result
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                r2 = 0
                if (r0 < 0) goto L27
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r3 = r5.result
                java.lang.Object r3 = r3.get(r0)
                com.android.dx.dex.code.LocalList$Entry r3 = (com.android.dx.dex.code.LocalList.Entry) r3
                if (r3 != 0) goto L16
                goto L24
            L16:
                int r4 = r3.getAddress()
                if (r4 == r6) goto L1d
                return r2
            L1d:
                boolean r3 = r3.matches(r7)
                if (r3 == 0) goto L24
                goto L27
            L24:
                int r0 = r0 + (-1)
                goto L8
            L27:
                com.android.dx.rop.code.RegisterSpecSet r3 = r5.regs
                r3.remove(r7)
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r3 = r5.result
                r4 = 0
                r3.set(r0, r4)
                int r3 = r5.nullResultCount
                int r3 = r3 + r1
                r5.nullResultCount = r3
                int r7 = r7.getReg()
            L3b:
                int r0 = r0 + (-1)
                if (r0 < 0) goto L56
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r3 = r5.result
                java.lang.Object r3 = r3.get(r0)
                r4 = r3
                com.android.dx.dex.code.LocalList$Entry r4 = (com.android.dx.dex.code.LocalList.Entry) r4
                if (r4 != 0) goto L4b
                goto L3b
            L4b:
                com.android.dx.rop.code.RegisterSpec r3 = r4.getRegisterSpec()
                int r3 = r3.getReg()
                if (r3 != r7) goto L3b
                r2 = r1
            L56:
                if (r2 == 0) goto L6d
                int[] r2 = r5.endIndices
                r2[r7] = r0
                int r7 = r4.getAddress()
                if (r7 != r6) goto L6d
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r6 = r5.result
                com.android.dx.dex.code.LocalList$Disposition r7 = com.android.dx.dex.code.LocalList.Disposition.END_SIMPLY
                com.android.dx.dex.code.LocalList$Entry r7 = r4.withDisposition(r7)
                r6.set(r0, r7)
            L6d:
                return r1
        }

        private static com.android.dx.rop.code.RegisterSpec filterSpec(com.android.dx.rop.code.RegisterSpec r2) {
                if (r2 == 0) goto L10
                com.android.dx.rop.type.Type r0 = r2.getType()
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.KNOWN_NULL
                if (r0 != r1) goto L10
                com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.OBJECT
                com.android.dx.rop.code.RegisterSpec r2 = r2.withType(r0)
            L10:
                return r2
        }

        public void endLocal(int r2, com.android.dx.rop.code.RegisterSpec r3) {
                r1 = this;
                com.android.dx.dex.code.LocalList$Disposition r0 = com.android.dx.dex.code.LocalList.Disposition.END_SIMPLY
                r1.endLocal(r2, r3, r0)
                return
        }

        public void endLocal(int r3, com.android.dx.rop.code.RegisterSpec r4, com.android.dx.dex.code.LocalList.Disposition r5) {
                r2 = this;
                int r0 = r4.getReg()
                com.android.dx.rop.code.RegisterSpec r4 = filterSpec(r4)
                r2.aboutToProcess(r3, r0)
                int[] r1 = r2.endIndices
                r0 = r1[r0]
                if (r0 < 0) goto L12
                return
            L12:
                boolean r0 = r2.checkForEmptyRange(r3, r4)
                if (r0 == 0) goto L19
                return
            L19:
                r2.add(r3, r5, r4)
                return
        }

        public com.android.dx.dex.code.LocalList finish() {
                r7 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
                r7.aboutToProcess(r0, r1)
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r0 = r7.result
                int r0 = r0.size()
                int r2 = r7.nullResultCount
                int r2 = r0 - r2
                if (r2 != 0) goto L16
                com.android.dx.dex.code.LocalList r0 = com.android.dx.dex.code.LocalList.EMPTY
                return r0
            L16:
                com.android.dx.dex.code.LocalList$Entry[] r3 = new com.android.dx.dex.code.LocalList.Entry[r2]
                if (r0 != r2) goto L20
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r0 = r7.result
                r0.toArray(r3)
                goto L3b
            L20:
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r0 = r7.result
                java.util.Iterator r0 = r0.iterator()
                r4 = r1
            L27:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L3b
                java.lang.Object r5 = r0.next()
                com.android.dx.dex.code.LocalList$Entry r5 = (com.android.dx.dex.code.LocalList.Entry) r5
                if (r5 == 0) goto L27
                int r6 = r4 + 1
                r3[r4] = r5
                r4 = r6
                goto L27
            L3b:
                java.util.Arrays.sort(r3)
                com.android.dx.dex.code.LocalList r0 = new com.android.dx.dex.code.LocalList
                r0.<init>(r2)
            L43:
                if (r1 >= r2) goto L4d
                r4 = r3[r1]
                r0.set(r1, r4)
                int r1 = r1 + 1
                goto L43
            L4d:
                r0.setImmutable()
                return r0
        }

        public void snapshot(int r6, com.android.dx.rop.code.RegisterSpecSet r7) {
                r5 = this;
                int r0 = r7.getMaxSize()
                int r1 = r0 + (-1)
                r5.aboutToProcess(r6, r1)
                r1 = 0
            La:
                if (r1 >= r0) goto L37
                com.android.dx.rop.code.RegisterSpecSet r2 = r5.regs
                com.android.dx.rop.code.RegisterSpec r2 = r2.get(r1)
                com.android.dx.rop.code.RegisterSpec r3 = r7.get(r1)
                com.android.dx.rop.code.RegisterSpec r3 = filterSpec(r3)
                if (r2 != 0) goto L22
                if (r3 == 0) goto L34
                r5.startLocal(r6, r3)
                goto L34
            L22:
                if (r3 != 0) goto L28
                r5.endLocal(r6, r2)
                goto L34
            L28:
                boolean r4 = r3.equalsUsingSimpleType(r2)
                if (r4 != 0) goto L34
                r5.endLocal(r6, r2)
                r5.startLocal(r6, r3)
            L34:
                int r1 = r1 + 1
                goto La
            L37:
                return
        }

        public void startLocal(int r5, com.android.dx.rop.code.RegisterSpec r6) {
                r4 = this;
                int r0 = r6.getReg()
                com.android.dx.rop.code.RegisterSpec r6 = filterSpec(r6)
                r4.aboutToProcess(r5, r0)
                com.android.dx.rop.code.RegisterSpecSet r1 = r4.regs
                com.android.dx.rop.code.RegisterSpec r1 = r1.get(r0)
                boolean r2 = r6.equalsUsingSimpleType(r1)
                if (r2 == 0) goto L18
                return
            L18:
                com.android.dx.rop.code.RegisterSpecSet r2 = r4.regs
                com.android.dx.rop.code.RegisterSpec r2 = r2.findMatchingLocal(r6)
                if (r2 == 0) goto L25
                com.android.dx.dex.code.LocalList$Disposition r3 = com.android.dx.dex.code.LocalList.Disposition.END_MOVED
                r4.addOrUpdateEnd(r5, r3, r2)
            L25:
                int[] r2 = r4.endIndices
                r2 = r2[r0]
                if (r1 == 0) goto L31
                com.android.dx.dex.code.LocalList$Disposition r2 = com.android.dx.dex.code.LocalList.Disposition.END_REPLACED
                r4.add(r5, r2, r1)
                goto L69
            L31:
                if (r2 < 0) goto L69
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r1 = r4.result
                java.lang.Object r1 = r1.get(r2)
                com.android.dx.dex.code.LocalList$Entry r1 = (com.android.dx.dex.code.LocalList.Entry) r1
                int r3 = r1.getAddress()
                if (r3 != r5) goto L69
                boolean r3 = r1.matches(r6)
                if (r3 == 0) goto L5e
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r5 = r4.result
                r1 = 0
                r5.set(r2, r1)
                int r5 = r4.nullResultCount
                int r5 = r5 + 1
                r4.nullResultCount = r5
                com.android.dx.rop.code.RegisterSpecSet r5 = r4.regs
                r5.put(r6)
                int[] r5 = r4.endIndices
                r6 = -1
                r5[r0] = r6
                return
            L5e:
                com.android.dx.dex.code.LocalList$Disposition r3 = com.android.dx.dex.code.LocalList.Disposition.END_REPLACED
                com.android.dx.dex.code.LocalList$Entry r1 = r1.withDisposition(r3)
                java.util.ArrayList<com.android.dx.dex.code.LocalList$Entry> r3 = r4.result
                r3.set(r2, r1)
            L69:
                if (r0 <= 0) goto L80
                com.android.dx.rop.code.RegisterSpecSet r1 = r4.regs
                int r2 = r0 + (-1)
                com.android.dx.rop.code.RegisterSpec r1 = r1.get(r2)
                if (r1 == 0) goto L80
                boolean r2 = r1.isCategory2()
                if (r2 == 0) goto L80
                com.android.dx.dex.code.LocalList$Disposition r2 = com.android.dx.dex.code.LocalList.Disposition.END_CLOBBERED_BY_NEXT
                r4.addOrUpdateEnd(r5, r2, r1)
            L80:
                boolean r1 = r6.isCategory2()
                if (r1 == 0) goto L95
                com.android.dx.rop.code.RegisterSpecSet r1 = r4.regs
                int r0 = r0 + 1
                com.android.dx.rop.code.RegisterSpec r0 = r1.get(r0)
                if (r0 == 0) goto L95
                com.android.dx.dex.code.LocalList$Disposition r1 = com.android.dx.dex.code.LocalList.Disposition.END_CLOBBERED_BY_PREV
                r4.addOrUpdateEnd(r5, r1, r0)
            L95:
                com.android.dx.dex.code.LocalList$Disposition r0 = com.android.dx.dex.code.LocalList.Disposition.START
                r4.add(r5, r0, r6)
                return
        }
    }

    static {
            com.android.dx.dex.code.LocalList r0 = new com.android.dx.dex.code.LocalList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.dex.code.LocalList.EMPTY = r0
            return
    }

    public LocalList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static void debugVerify(com.android.dx.dex.code.LocalList r5) {
            debugVerify0(r5)     // Catch: java.lang.RuntimeException -> L4
            return
        L4:
            r0 = move-exception
            int r1 = r5.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            java.io.PrintStream r3 = java.lang.System.err
            com.android.dx.dex.code.LocalList$Entry r4 = r5.get(r2)
            r3.println(r4)
            int r2 = r2 + 1
            goto La
        L18:
            throw r0
    }

    private static void debugVerify0(com.android.dx.dex.code.LocalList r12) {
            int r0 = r12.size()
            r1 = 65536(0x10000, float:9.1835E-41)
            com.android.dx.dex.code.LocalList$Entry[] r1 = new com.android.dx.dex.code.LocalList.Entry[r1]
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r0) goto L10d
            com.android.dx.dex.code.LocalList$Entry r4 = r12.get(r3)
            int r5 = r4.getRegister()
            boolean r6 = r4.isStart()
            if (r6 == 0) goto L58
            r6 = r1[r5]
            if (r6 == 0) goto L54
            boolean r7 = r4.matches(r6)
            if (r7 != 0) goto L25
            goto L54
        L25:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "redundant start at "
            r0.append(r1)
            int r1 = r4.getAddress()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ": got "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "; had "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L54:
            r1[r5] = r4
            goto Lec
        L58:
            r6 = r1[r5]
            java.lang.String r7 = "redundant end at "
            if (r6 == 0) goto Lf0
            int r6 = r4.getAddress()
            int r8 = r3 + 1
            r9 = r2
        L65:
            if (r8 >= r0) goto Lc3
            com.android.dx.dex.code.LocalList$Entry r10 = r12.get(r8)
            int r11 = r10.getAddress()
            if (r11 == r6) goto L72
            goto Lc3
        L72:
            com.android.dx.rop.code.RegisterSpec r11 = r10.getRegisterSpec()
            int r11 = r11.getReg()
            if (r11 != r5) goto Lc0
            boolean r9 = r10.isStart()
            if (r9 == 0) goto La7
            com.android.dx.dex.code.LocalList$Disposition r9 = r4.getDisposition()
            com.android.dx.dex.code.LocalList$Disposition r10 = com.android.dx.dex.code.LocalList.Disposition.END_REPLACED
            if (r9 != r10) goto L8c
            r9 = 1
            goto Lc0
        L8c:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "improperly marked end at "
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        La7:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        Lc0:
            int r8 = r8 + 1
            goto L65
        Lc3:
            if (r9 != 0) goto Le9
            com.android.dx.dex.code.LocalList$Disposition r4 = r4.getDisposition()
            com.android.dx.dex.code.LocalList$Disposition r7 = com.android.dx.dex.code.LocalList.Disposition.END_REPLACED
            if (r4 == r7) goto Lce
            goto Le9
        Lce:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "improper end replacement claim at "
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        Le9:
            r4 = 0
            r1[r5] = r4
        Lec:
            int r3 = r3 + 1
            goto La
        Lf0:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            int r1 = r4.getAddress()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L10d:
            return
    }

    public static com.android.dx.dex.code.LocalList make(com.android.dx.dex.code.DalvInsnList r5) {
            int r0 = r5.size()
            com.android.dx.dex.code.LocalList$MakeState r1 = new com.android.dx.dex.code.LocalList$MakeState
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L38
            com.android.dx.dex.code.DalvInsn r3 = r5.get(r2)
            boolean r4 = r3 instanceof com.android.dx.dex.code.LocalSnapshot
            if (r4 == 0) goto L23
            r4 = r3
            com.android.dx.dex.code.LocalSnapshot r4 = (com.android.dx.dex.code.LocalSnapshot) r4
            com.android.dx.rop.code.RegisterSpecSet r4 = r4.getLocals()
            int r3 = r3.getAddress()
            r1.snapshot(r3, r4)
            goto L35
        L23:
            boolean r4 = r3 instanceof com.android.dx.dex.code.LocalStart
            if (r4 == 0) goto L35
            r4 = r3
            com.android.dx.dex.code.LocalStart r4 = (com.android.dx.dex.code.LocalStart) r4
            com.android.dx.rop.code.RegisterSpec r4 = r4.getLocal()
            int r3 = r3.getAddress()
            r1.startLocal(r3, r4)
        L35:
            int r2 = r2 + 1
            goto La
        L38:
            com.android.dx.dex.code.LocalList r5 = r1.finish()
            return r5
    }

    public void debugPrint(java.io.PrintStream r4, java.lang.String r5) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L14
            r4.print(r5)
            com.android.dx.dex.code.LocalList$Entry r2 = r3.get(r1)
            r4.println(r2)
            int r1 = r1 + 1
            goto L5
        L14:
            return
    }

    public com.android.dx.dex.code.LocalList.Entry get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.dex.code.LocalList$Entry r1 = (com.android.dx.dex.code.LocalList.Entry) r1
            return r1
    }

    public void set(int r1, com.android.dx.dex.code.LocalList.Entry r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }
}
