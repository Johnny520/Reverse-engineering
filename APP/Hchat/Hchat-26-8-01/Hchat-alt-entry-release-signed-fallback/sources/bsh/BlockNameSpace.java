package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BlockNameSpace extends bsh.NameSpace {
    public static final java.util.concurrent.atomic.AtomicInteger blockCount = null;
    private static bsh.util.ValueReferenceMap<bsh.BlockNameSpace.UniqueBlock, bsh.BlockNameSpace> blockspaces;
    public final java.util.concurrent.atomic.AtomicInteger used;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class UniqueBlock {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        int f922id;
        bsh.NameSpace ns;

        public UniqueBlock(bsh.NameSpace r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.ns = r1
                r0.f922id = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof bsh.BlockNameSpace.UniqueBlock
                r2 = 0
                if (r1 == 0) goto L18
                bsh.BlockNameSpace$UniqueBlock r5 = (bsh.BlockNameSpace.UniqueBlock) r5
                bsh.NameSpace r1 = r4.ns
                bsh.NameSpace r3 = r5.ns
                if (r1 != r3) goto L18
                int r1 = r4.f922id
                int r5 = r5.f922id
                if (r1 != r5) goto L18
                return r0
            L18:
                return r2
        }

        public int hashCode() {
                r2 = this;
                bsh.NameSpace r0 = r2.ns
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.f922id
                int r1 = java.lang.Integer.hashCode(r1)
                int r1 = r1 + r0
                return r1
        }
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            bsh.BlockNameSpace.blockCount = r0
            bsh.util.ValueReferenceMap r0 = new bsh.util.ValueReferenceMap
            bsh.b r1 = new bsh.b
            r2 = 0
            r1.<init>(r2)
            bsh.util.ValueReferenceMap$Type r2 = bsh.util.ValueReferenceMap.Type.Weak
            r0.<init>(r1, r2)
            bsh.BlockNameSpace.blockspaces = r0
            return
    }

    public BlockNameSpace(bsh.NameSpace r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = "/BlockNameSpace"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r3, r4)
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 1
            r4.<init>(r0)
            r2.used = r4
            boolean r3 = r3.isMethod
            r2.isMethod = r3
            return
    }

    public static bsh.NameSpace getInstance(bsh.NameSpace r2, int r3) {
            bsh.util.ValueReferenceMap<bsh.BlockNameSpace$UniqueBlock, bsh.BlockNameSpace> r0 = bsh.BlockNameSpace.blockspaces
            bsh.BlockNameSpace$UniqueBlock r1 = new bsh.BlockNameSpace$UniqueBlock
            r1.<init>(r2, r3)
            java.lang.Object r2 = r0.get(r1)
            bsh.BlockNameSpace r2 = (bsh.BlockNameSpace) r2
            r2.clear()
            return r2
    }

    private bsh.NameSpace getNonBlockParent() {
            r2 = this;
            bsh.NameSpace r0 = super.getParent()
            boolean r1 = r0 instanceof bsh.BlockNameSpace
            if (r1 == 0) goto Le
            bsh.BlockNameSpace r0 = (bsh.BlockNameSpace) r0
            bsh.NameSpace r0 = r0.getNonBlockParent()
        Le:
            return r0
    }

    public static /* synthetic */ bsh.BlockNameSpace h(bsh.BlockNameSpace.UniqueBlock r0) {
            bsh.BlockNameSpace r0 = lambda$static$0(r0)
            return r0
    }

    private static /* synthetic */ bsh.BlockNameSpace lambda$static$0(bsh.BlockNameSpace.UniqueBlock r2) {
            bsh.BlockNameSpace r0 = new bsh.BlockNameSpace
            bsh.NameSpace r1 = r2.ns
            int r2 = r2.f922id
            r0.<init>(r1, r2)
            return r0
    }

    private boolean weHaveVar(java.lang.String r2) {
            r1 = this;
            r0 = 0
            bsh.Variable r2 = super.getVariableImpl(r2, r0)     // Catch: bsh.UtilEvalError -> L9
            if (r2 == 0) goto L9
            r2 = 1
            return r2
        L9:
            return r0
    }

    @Override // bsh.NameSpace
    public bsh.This getSuper(bsh.Interpreter r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.getNonBlockParent()
            bsh.This r2 = r0.getSuper(r2)
            return r2
    }

    @Override // bsh.NameSpace
    public bsh.This getThis(bsh.Interpreter r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.getNonBlockParent()
            bsh.This r2 = r0.getThis(r2)
            return r2
    }

    @Override // bsh.NameSpace
    public void importClass(java.lang.String r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.getParent()
            r0.importClass(r2)
            return
    }

    @Override // bsh.NameSpace
    public void importPackage(java.lang.String r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.getParent()
            r0.importPackage(r2)
            return
    }

    public void setBlockVariable(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            super.setVariable(r2, r3, r0, r0)
            return
    }

    @Override // bsh.NameSpace
    public void setMethod(bsh.BshMethod r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.getParent()
            r0.setMethod(r2)
            return
    }

    @Override // bsh.NameSpace
    public bsh.Variable setVariable(java.lang.String r2, java.lang.Object r3, boolean r4, boolean r5) {
            r1 = this;
            boolean r0 = r1.weHaveVar(r2)
            if (r0 == 0) goto Lc
            r5 = 0
            bsh.Variable r2 = super.setVariable(r2, r3, r4, r5)
            return r2
        Lc:
            bsh.NameSpace r0 = r1.getParent()
            bsh.Variable r2 = r0.setVariable(r2, r3, r4, r5)
            return r2
    }
}
