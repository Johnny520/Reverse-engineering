package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class RegisterSpec implements com.android.dx.rop.type.TypeBearer, com.android.dx.util.ToHuman, java.lang.Comparable<com.android.dx.rop.code.RegisterSpec> {
    public static final java.lang.String PREFIX = "v";
    private static final java.lang.ThreadLocal<com.android.dx.rop.code.RegisterSpec.ForComparison> theInterningItem = null;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.Object, com.android.dx.rop.code.RegisterSpec> theInterns = null;
    private final com.android.dx.rop.code.LocalItem local;
    private final int reg;
    private final com.android.dx.rop.type.TypeBearer type;


    public static class ForComparison {
        private com.android.dx.rop.code.LocalItem local;
        private int reg;
        private com.android.dx.rop.type.TypeBearer type;

        private ForComparison() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ ForComparison(com.android.dx.rop.code.RegisterSpec.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ int access$100(com.android.dx.rop.code.RegisterSpec.ForComparison r0) {
                int r0 = r0.reg
                return r0
        }

        public static /* synthetic */ com.android.dx.rop.type.TypeBearer access$200(com.android.dx.rop.code.RegisterSpec.ForComparison r0) {
                com.android.dx.rop.type.TypeBearer r0 = r0.type
                return r0
        }

        public static /* synthetic */ com.android.dx.rop.code.LocalItem access$300(com.android.dx.rop.code.RegisterSpec.ForComparison r0) {
                com.android.dx.rop.code.LocalItem r0 = r0.local
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.android.dx.rop.code.RegisterSpec
                if (r0 != 0) goto L6
                r4 = 0
                return r4
            L6:
                com.android.dx.rop.code.RegisterSpec r4 = (com.android.dx.rop.code.RegisterSpec) r4
                int r0 = r3.reg
                com.android.dx.rop.type.TypeBearer r1 = r3.type
                com.android.dx.rop.code.LocalItem r2 = r3.local
                boolean r4 = com.android.dx.rop.code.RegisterSpec.access$500(r4, r0, r1, r2)
                return r4
        }

        public int hashCode() {
                r3 = this;
                int r0 = r3.reg
                com.android.dx.rop.type.TypeBearer r1 = r3.type
                com.android.dx.rop.code.LocalItem r2 = r3.local
                int r0 = com.android.dx.rop.code.RegisterSpec.access$600(r0, r1, r2)
                return r0
        }

        public void set(int r1, com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.code.LocalItem r3) {
                r0 = this;
                r0.reg = r1
                r0.type = r2
                r0.local = r3
                return
        }

        public com.android.dx.rop.code.RegisterSpec toRegisterSpec() {
                r5 = this;
                com.android.dx.rop.code.RegisterSpec r0 = new com.android.dx.rop.code.RegisterSpec
                int r1 = r5.reg
                com.android.dx.rop.type.TypeBearer r2 = r5.type
                com.android.dx.rop.code.LocalItem r3 = r5.local
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            com.android.dx.rop.code.RegisterSpec.theInterns = r0
            com.android.dx.rop.code.RegisterSpec$1 r0 = new com.android.dx.rop.code.RegisterSpec$1
            r0.<init>()
            com.android.dx.rop.code.RegisterSpec.theInterningItem = r0
            return
    }

    private RegisterSpec(int r1, com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.code.LocalItem r3) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L16
            if (r2 == 0) goto Le
            r0.reg = r1
            r0.type = r2
            r0.local = r3
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "type == null"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "reg < 0"
            r1.<init>(r2)
            throw r1
    }

    public /* synthetic */ RegisterSpec(int r1, com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.code.LocalItem r3, com.android.dx.rop.code.RegisterSpec.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static /* synthetic */ boolean access$500(com.android.dx.rop.code.RegisterSpec r0, int r1, com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.code.LocalItem r3) {
            boolean r0 = r0.equals(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int access$600(int r0, com.android.dx.rop.type.TypeBearer r1, com.android.dx.rop.code.LocalItem r2) {
            int r0 = hashCodeOf(r0, r1, r2)
            return r0
    }

    public static void clearInternTable() {
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, com.android.dx.rop.code.RegisterSpec> r0 = com.android.dx.rop.code.RegisterSpec.theInterns
            r0.clear()
            return
    }

    private boolean equals(int r2, com.android.dx.rop.type.TypeBearer r3, com.android.dx.rop.code.LocalItem r4) {
            r1 = this;
            int r0 = r1.reg
            if (r0 != r2) goto L1a
            com.android.dx.rop.type.TypeBearer r2 = r1.type
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1a
            com.android.dx.rop.code.LocalItem r2 = r1.local
            if (r2 == r4) goto L18
            if (r2 == 0) goto L1a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1a
        L18:
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    private static int hashCodeOf(int r0, com.android.dx.rop.type.TypeBearer r1, com.android.dx.rop.code.LocalItem r2) {
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            int r2 = r2 * 31
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            int r2 = r2 + r0
            return r2
    }

    private static com.android.dx.rop.code.RegisterSpec intern(int r1, com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.code.LocalItem r3) {
            java.lang.ThreadLocal<com.android.dx.rop.code.RegisterSpec$ForComparison> r0 = com.android.dx.rop.code.RegisterSpec.theInterningItem
            java.lang.Object r0 = r0.get()
            com.android.dx.rop.code.RegisterSpec$ForComparison r0 = (com.android.dx.rop.code.RegisterSpec.ForComparison) r0
            r0.set(r1, r2, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, com.android.dx.rop.code.RegisterSpec> r1 = com.android.dx.rop.code.RegisterSpec.theInterns
            java.lang.Object r2 = r1.get(r0)
            com.android.dx.rop.code.RegisterSpec r2 = (com.android.dx.rop.code.RegisterSpec) r2
            if (r2 != 0) goto L22
            com.android.dx.rop.code.RegisterSpec r2 = r0.toRegisterSpec()
            java.lang.Object r1 = r1.putIfAbsent(r2, r2)
            com.android.dx.rop.code.RegisterSpec r1 = (com.android.dx.rop.code.RegisterSpec) r1
            if (r1 == 0) goto L22
            return r1
        L22:
            return r2
    }

    public static com.android.dx.rop.code.RegisterSpec make(int r1, com.android.dx.rop.type.TypeBearer r2) {
            r0 = 0
            com.android.dx.rop.code.RegisterSpec r1 = intern(r1, r2, r0)
            return r1
    }

    public static com.android.dx.rop.code.RegisterSpec make(int r0, com.android.dx.rop.type.TypeBearer r1, com.android.dx.rop.code.LocalItem r2) {
            if (r2 == 0) goto L7
            com.android.dx.rop.code.RegisterSpec r0 = intern(r0, r1, r2)
            return r0
        L7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "local  == null"
            r0.<init>(r1)
            throw r0
    }

    public static com.android.dx.rop.code.RegisterSpec makeLocalOptional(int r0, com.android.dx.rop.type.TypeBearer r1, com.android.dx.rop.code.LocalItem r2) {
            com.android.dx.rop.code.RegisterSpec r0 = intern(r0, r1, r2)
            return r0
    }

    public static java.lang.String regString(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "v"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private java.lang.String toString0(boolean r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = r3.regString()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            com.android.dx.rop.code.LocalItem r1 = r3.local
            if (r1 == 0) goto L1e
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L1e:
            com.android.dx.rop.type.TypeBearer r1 = r3.type
            com.android.dx.rop.type.Type r1 = r1.getType()
            r0.append(r1)
            com.android.dx.rop.type.TypeBearer r2 = r3.type
            if (r1 == r2) goto L57
            java.lang.String r1 = "="
            r0.append(r1)
            if (r4 == 0) goto L42
            com.android.dx.rop.type.TypeBearer r1 = r3.type
            boolean r2 = r1 instanceof com.android.dx.rop.cst.CstString
            if (r2 == 0) goto L42
            com.android.dx.rop.cst.CstString r1 = (com.android.dx.rop.cst.CstString) r1
            java.lang.String r4 = r1.toQuoted()
            r0.append(r4)
            goto L57
        L42:
            if (r4 == 0) goto L52
            com.android.dx.rop.type.TypeBearer r4 = r3.type
            boolean r1 = r4 instanceof com.android.dx.rop.cst.Constant
            if (r1 == 0) goto L52
            java.lang.String r4 = r4.toHuman()
            r0.append(r4)
            goto L57
        L52:
            com.android.dx.rop.type.TypeBearer r4 = r3.type
            r0.append(r4)
        L57:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.rop.code.RegisterSpec r6) {
            r5 = this;
            int r0 = r5.reg
            int r1 = r6.reg
            r2 = -1
            if (r0 >= r1) goto L8
            return r2
        L8:
            r3 = 1
            if (r0 <= r1) goto Lc
            return r3
        Lc:
            r0 = 0
            if (r5 != r6) goto L10
            return r0
        L10:
            com.android.dx.rop.type.TypeBearer r1 = r5.type
            com.android.dx.rop.type.Type r1 = r1.getType()
            com.android.dx.rop.type.TypeBearer r4 = r6.type
            com.android.dx.rop.type.Type r4 = r4.getType()
            int r1 = r1.compareTo2(r4)
            if (r1 == 0) goto L23
            return r1
        L23:
            com.android.dx.rop.code.LocalItem r1 = r5.local
            if (r1 != 0) goto L2d
            com.android.dx.rop.code.LocalItem r6 = r6.local
            if (r6 != 0) goto L2c
            r2 = r0
        L2c:
            return r2
        L2d:
            com.android.dx.rop.code.LocalItem r6 = r6.local
            if (r6 != 0) goto L32
            return r3
        L32:
            int r6 = r1.compareTo2(r6)
            return r6
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.code.RegisterSpec r1) {
            r0 = this;
            com.android.dx.rop.code.RegisterSpec r1 = (com.android.dx.rop.code.RegisterSpec) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r3 instanceof com.android.dx.rop.code.RegisterSpec
            if (r0 != 0) goto L21
            boolean r0 = r3 instanceof com.android.dx.rop.code.RegisterSpec.ForComparison
            if (r0 == 0) goto L1f
            com.android.dx.rop.code.RegisterSpec$ForComparison r3 = (com.android.dx.rop.code.RegisterSpec.ForComparison) r3
            int r0 = com.android.dx.rop.code.RegisterSpec.ForComparison.access$100(r3)
            com.android.dx.rop.type.TypeBearer r1 = com.android.dx.rop.code.RegisterSpec.ForComparison.access$200(r3)
            com.android.dx.rop.code.LocalItem r3 = com.android.dx.rop.code.RegisterSpec.ForComparison.access$300(r3)
            boolean r3 = r2.equals(r0, r1, r3)
            return r3
        L1f:
            r3 = 0
            return r3
        L21:
            com.android.dx.rop.code.RegisterSpec r3 = (com.android.dx.rop.code.RegisterSpec) r3
            int r0 = r3.reg
            com.android.dx.rop.type.TypeBearer r1 = r3.type
            com.android.dx.rop.code.LocalItem r3 = r3.local
            boolean r3 = r2.equals(r0, r1, r3)
            return r3
    }

    public boolean equalsUsingSimpleType(com.android.dx.rop.code.RegisterSpec r3) {
            r2 = this;
            boolean r0 = r2.matchesVariable(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r2.reg
            int r3 = r3.reg
            if (r0 != r3) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicFrameType() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            int r0 = r0.getBasicFrameType()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final int getBasicType() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            int r0 = r0.getBasicType()
            return r0
    }

    public int getCategory() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            com.android.dx.rop.type.Type r0 = r0.getType()
            int r0 = r0.getCategory()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.TypeBearer getFrameType() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            com.android.dx.rop.type.TypeBearer r0 = r0.getFrameType()
            return r0
    }

    public com.android.dx.rop.code.LocalItem getLocalItem() {
            r1 = this;
            com.android.dx.rop.code.LocalItem r0 = r1.local
            return r0
    }

    public int getNextReg() {
            r2 = this;
            int r0 = r2.reg
            int r1 = r2.getCategory()
            int r0 = r0 + r1
            return r0
    }

    public int getReg() {
            r1 = this;
            int r0 = r1.reg
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            com.android.dx.rop.type.Type r0 = r0.getType()
            return r0
    }

    public com.android.dx.rop.type.TypeBearer getTypeBearer() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.reg
            com.android.dx.rop.type.TypeBearer r1 = r3.type
            com.android.dx.rop.code.LocalItem r2 = r3.local
            int r0 = hashCodeOf(r0, r1, r2)
            return r0
    }

    public com.android.dx.rop.code.RegisterSpec intersect(com.android.dx.rop.code.RegisterSpec r5, boolean r6) {
            r4 = this;
            if (r4 != r5) goto L3
            return r4
        L3:
            r0 = 0
            if (r5 == 0) goto L5c
            int r1 = r4.reg
            int r2 = r5.getReg()
            if (r1 == r2) goto Lf
            goto L5c
        Lf:
            com.android.dx.rop.code.LocalItem r1 = r4.local
            if (r1 == 0) goto L21
            com.android.dx.rop.code.LocalItem r2 = r5.getLocalItem()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1e
            goto L21
        L1e:
            com.android.dx.rop.code.LocalItem r1 = r4.local
            goto L22
        L21:
            r1 = r0
        L22:
            com.android.dx.rop.code.LocalItem r2 = r4.local
            if (r1 != r2) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            if (r6 == 0) goto L2e
            if (r2 != 0) goto L2e
            return r0
        L2e:
            com.android.dx.rop.type.Type r6 = r4.getType()
            com.android.dx.rop.type.Type r3 = r5.getType()
            if (r6 == r3) goto L39
            return r0
        L39:
            com.android.dx.rop.type.TypeBearer r0 = r4.type
            com.android.dx.rop.type.TypeBearer r5 = r5.getTypeBearer()
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L47
            com.android.dx.rop.type.TypeBearer r6 = r4.type
        L47:
            com.android.dx.rop.type.TypeBearer r5 = r4.type
            if (r6 != r5) goto L4e
            if (r2 == 0) goto L4e
            return r4
        L4e:
            int r5 = r4.reg
            if (r1 != 0) goto L57
            com.android.dx.rop.code.RegisterSpec r5 = make(r5, r6)
            goto L5b
        L57:
            com.android.dx.rop.code.RegisterSpec r5 = make(r5, r6, r1)
        L5b:
            return r5
        L5c:
            return r0
    }

    public boolean isCategory1() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            com.android.dx.rop.type.Type r0 = r0.getType()
            boolean r0 = r0.isCategory1()
            return r0
    }

    public boolean isCategory2() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer r0 = r1.type
            com.android.dx.rop.type.Type r0 = r0.getType()
            boolean r0 = r0.isCategory2()
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public final boolean isConstant() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isEvenRegister() {
            r2 = this;
            int r0 = r2.getReg()
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public boolean matchesVariable(com.android.dx.rop.code.RegisterSpec r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.android.dx.rop.type.TypeBearer r1 = r3.type
            com.android.dx.rop.type.Type r1 = r1.getType()
            com.android.dx.rop.type.TypeBearer r2 = r4.type
            com.android.dx.rop.type.Type r2 = r2.getType()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L25
            com.android.dx.rop.code.LocalItem r1 = r3.local
            com.android.dx.rop.code.LocalItem r4 = r4.local
            if (r1 == r4) goto L24
            if (r1 == 0) goto L25
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L25
        L24:
            r0 = 1
        L25:
            return r0
    }

    public java.lang.String regString() {
            r1 = this;
            int r0 = r1.reg
            java.lang.String r0 = regString(r0)
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.toString0(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toString0(r0)
            return r0
    }

    public com.android.dx.rop.code.RegisterSpec withLocalItem(com.android.dx.rop.code.LocalItem r3) {
            r2 = this;
            com.android.dx.rop.code.LocalItem r0 = r2.local
            if (r0 == r3) goto L16
            if (r0 == 0) goto Ld
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            int r0 = r2.reg
            com.android.dx.rop.type.TypeBearer r1 = r2.type
            com.android.dx.rop.code.RegisterSpec r3 = makeLocalOptional(r0, r1, r3)
            return r3
        L16:
            return r2
    }

    public com.android.dx.rop.code.RegisterSpec withOffset(int r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            int r0 = r1.reg
            int r0 = r0 + r2
            com.android.dx.rop.code.RegisterSpec r2 = r1.withReg(r0)
            return r2
    }

    public com.android.dx.rop.code.RegisterSpec withReg(int r3) {
            r2 = this;
            int r0 = r2.reg
            if (r0 != r3) goto L5
            return r2
        L5:
            com.android.dx.rop.type.TypeBearer r0 = r2.type
            com.android.dx.rop.code.LocalItem r1 = r2.local
            com.android.dx.rop.code.RegisterSpec r3 = makeLocalOptional(r3, r0, r1)
            return r3
    }

    public com.android.dx.rop.code.RegisterSpec withSimpleType() {
            r3 = this;
            com.android.dx.rop.type.TypeBearer r0 = r3.type
            boolean r1 = r0 instanceof com.android.dx.rop.type.Type
            if (r1 == 0) goto La
            r1 = r0
            com.android.dx.rop.type.Type r1 = (com.android.dx.rop.type.Type) r1
            goto Le
        La:
            com.android.dx.rop.type.Type r1 = r0.getType()
        Le:
            boolean r2 = r1.isUninitialized()
            if (r2 == 0) goto L18
            com.android.dx.rop.type.Type r1 = r1.getInitializedType()
        L18:
            if (r1 != r0) goto L1b
            return r3
        L1b:
            int r0 = r3.reg
            com.android.dx.rop.code.LocalItem r2 = r3.local
            com.android.dx.rop.code.RegisterSpec r0 = makeLocalOptional(r0, r1, r2)
            return r0
    }

    public com.android.dx.rop.code.RegisterSpec withType(com.android.dx.rop.type.TypeBearer r3) {
            r2 = this;
            int r0 = r2.reg
            com.android.dx.rop.code.LocalItem r1 = r2.local
            com.android.dx.rop.code.RegisterSpec r3 = makeLocalOptional(r0, r3, r1)
            return r3
    }
}
