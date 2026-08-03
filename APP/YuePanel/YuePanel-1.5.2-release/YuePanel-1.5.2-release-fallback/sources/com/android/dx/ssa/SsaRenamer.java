package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class SsaRenamer implements java.lang.Runnable {
    private static final boolean DEBUG = false;
    private int nextSsaReg;
    private final int ropRegCount;
    private final com.android.dx.ssa.SsaMethod ssaMeth;
    private final java.util.ArrayList<com.android.dx.rop.code.LocalItem> ssaRegToLocalItems;
    private com.android.dx.util.IntList ssaRegToRopReg;
    private final com.android.dx.rop.code.RegisterSpec[][] startsForBlocks;
    private int threshold;


    public class BlockRenamer implements com.android.dx.ssa.SsaInsn.Visitor {
        private final com.android.dx.ssa.SsaBasicBlock block;
        private final com.android.dx.rop.code.RegisterSpec[] currentMapping;
        private final java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.ssa.SsaInsn> insnsToReplace;
        private final com.android.dx.ssa.SsaRenamer.BlockRenamer.RenamingMapper mapper;
        private final java.util.HashSet<com.android.dx.ssa.SsaInsn> movesToKeep;
        final /* synthetic */ com.android.dx.ssa.SsaRenamer this$0;


        public class RenamingMapper extends com.android.dx.ssa.RegisterMapper {
            final /* synthetic */ com.android.dx.ssa.SsaRenamer.BlockRenamer this$1;

            public RenamingMapper(com.android.dx.ssa.SsaRenamer.BlockRenamer r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // com.android.dx.ssa.RegisterMapper
            public int getNewRegisterCount() {
                    r1 = this;
                    com.android.dx.ssa.SsaRenamer$BlockRenamer r0 = r1.this$1
                    com.android.dx.ssa.SsaRenamer r0 = r0.this$0
                    int r0 = com.android.dx.ssa.SsaRenamer.access$100(r0)
                    return r0
            }

            @Override // com.android.dx.ssa.RegisterMapper
            public com.android.dx.rop.code.RegisterSpec map(com.android.dx.rop.code.RegisterSpec r3) {
                    r2 = this;
                    if (r3 != 0) goto L4
                    r3 = 0
                    return r3
                L4:
                    int r0 = r3.getReg()
                    com.android.dx.ssa.SsaRenamer$BlockRenamer r1 = r2.this$1
                    com.android.dx.rop.code.RegisterSpec[] r1 = com.android.dx.ssa.SsaRenamer.BlockRenamer.access$200(r1)
                    r0 = r1[r0]
                    int r0 = r0.getReg()
                    com.android.dx.rop.code.RegisterSpec r3 = r3.withReg(r0)
                    return r3
            }
        }

        public BlockRenamer(com.android.dx.ssa.SsaRenamer r3, com.android.dx.ssa.SsaBasicBlock r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r2.block = r4
                com.android.dx.rop.code.RegisterSpec[][] r0 = com.android.dx.ssa.SsaRenamer.access$000(r3)
                int r1 = r4.getIndex()
                r0 = r0[r1]
                r2.currentMapping = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.movesToKeep = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.insnsToReplace = r0
                com.android.dx.ssa.SsaRenamer$BlockRenamer$RenamingMapper r0 = new com.android.dx.ssa.SsaRenamer$BlockRenamer$RenamingMapper
                r0.<init>(r2)
                r2.mapper = r0
                com.android.dx.rop.code.RegisterSpec[][] r3 = com.android.dx.ssa.SsaRenamer.access$000(r3)
                int r4 = r4.getIndex()
                r0 = 0
                r3[r4] = r0
                return
        }

        public static /* synthetic */ com.android.dx.ssa.SsaBasicBlock access$1000(com.android.dx.ssa.SsaRenamer.BlockRenamer r0) {
                com.android.dx.ssa.SsaBasicBlock r0 = r0.block
                return r0
        }

        public static /* synthetic */ com.android.dx.rop.code.RegisterSpec[] access$200(com.android.dx.ssa.SsaRenamer.BlockRenamer r0) {
                com.android.dx.rop.code.RegisterSpec[] r0 = r0.currentMapping
                return r0
        }

        private void addMapping(int r5, com.android.dx.rop.code.RegisterSpec r6) {
                r4 = this;
                int r0 = r6.getReg()
                com.android.dx.rop.code.LocalItem r1 = r6.getLocalItem()
                com.android.dx.rop.code.RegisterSpec[] r2 = r4.currentMapping
                r2[r5] = r6
                int r5 = r2.length
                int r5 = r5 + (-1)
            Lf:
                if (r5 < 0) goto L22
                com.android.dx.rop.code.RegisterSpec[] r2 = r4.currentMapping
                r2 = r2[r5]
                int r2 = r2.getReg()
                if (r0 != r2) goto L1f
                com.android.dx.rop.code.RegisterSpec[] r2 = r4.currentMapping
                r2[r5] = r6
            L1f:
                int r5 = r5 + (-1)
                goto Lf
            L22:
                if (r1 != 0) goto L25
                return
            L25:
                com.android.dx.ssa.SsaRenamer r5 = r4.this$0
                com.android.dx.ssa.SsaRenamer.access$400(r5, r6)
                com.android.dx.rop.code.RegisterSpec[] r5 = r4.currentMapping
                int r5 = r5.length
                int r5 = r5 + (-1)
            L2f:
                if (r5 < 0) goto L51
                com.android.dx.rop.code.RegisterSpec[] r6 = r4.currentMapping
                r6 = r6[r5]
                int r2 = r6.getReg()
                if (r0 == r2) goto L4e
                com.android.dx.rop.code.LocalItem r2 = r6.getLocalItem()
                boolean r2 = r1.equals(r2)
                if (r2 == 0) goto L4e
                com.android.dx.rop.code.RegisterSpec[] r2 = r4.currentMapping
                r3 = 0
                com.android.dx.rop.code.RegisterSpec r6 = r6.withLocalItem(r3)
                r2[r5] = r6
            L4e:
                int r5 = r5 + (-1)
                goto L2f
            L51:
                return
        }

        private void updateSuccessorPhis() {
                r4 = this;
                com.android.dx.ssa.SsaRenamer$BlockRenamer$1 r0 = new com.android.dx.ssa.SsaRenamer$BlockRenamer$1
                r0.<init>(r4)
                com.android.dx.ssa.SsaBasicBlock r1 = r4.block
                java.util.BitSet r1 = r1.getSuccessors()
                r2 = 0
                int r2 = r1.nextSetBit(r2)
            L10:
                if (r2 < 0) goto L2c
                com.android.dx.ssa.SsaRenamer r3 = r4.this$0
                com.android.dx.ssa.SsaMethod r3 = com.android.dx.ssa.SsaRenamer.access$1100(r3)
                java.util.ArrayList r3 = r3.getBlocks()
                java.lang.Object r3 = r3.get(r2)
                com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
                r3.forEachPhiInsn(r0)
                int r2 = r2 + 1
                int r2 = r1.nextSetBit(r2)
                goto L10
            L2c:
                return
        }

        public void process() {
                r5 = this;
                com.android.dx.ssa.SsaBasicBlock r0 = r5.block
                r0.forEachInsn(r5)
                r5.updateSuccessorPhis()
                com.android.dx.ssa.SsaBasicBlock r0 = r5.block
                java.util.ArrayList r0 = r0.getInsns()
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L14:
                if (r1 < 0) goto L3e
                java.lang.Object r3 = r0.get(r1)
                com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
                java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.ssa.SsaInsn> r4 = r5.insnsToReplace
                java.lang.Object r4 = r4.get(r3)
                com.android.dx.ssa.SsaInsn r4 = (com.android.dx.ssa.SsaInsn) r4
                if (r4 == 0) goto L2a
                r0.set(r1, r4)
                goto L3b
            L2a:
                boolean r4 = r3.isNormalMoveInsn()
                if (r4 == 0) goto L3b
                java.util.HashSet<com.android.dx.ssa.SsaInsn> r4 = r5.movesToKeep
                boolean r3 = r4.contains(r3)
                if (r3 != 0) goto L3b
                r0.remove(r1)
            L3b:
                int r1 = r1 + (-1)
                goto L14
            L3e:
                com.android.dx.ssa.SsaBasicBlock r0 = r5.block
                java.util.ArrayList r0 = r0.getDomChildren()
                java.util.Iterator r0 = r0.iterator()
            L48:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L72
                java.lang.Object r1 = r0.next()
                com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
                com.android.dx.ssa.SsaBasicBlock r3 = r5.block
                if (r1 == r3) goto L48
                if (r2 == 0) goto L5d
                com.android.dx.rop.code.RegisterSpec[] r2 = r5.currentMapping
                goto L63
            L5d:
                com.android.dx.rop.code.RegisterSpec[] r2 = r5.currentMapping
                com.android.dx.rop.code.RegisterSpec[] r2 = com.android.dx.ssa.SsaRenamer.access$300(r2)
            L63:
                com.android.dx.ssa.SsaRenamer r3 = r5.this$0
                com.android.dx.rop.code.RegisterSpec[][] r3 = com.android.dx.ssa.SsaRenamer.access$000(r3)
                int r1 = r1.getIndex()
                r3[r1] = r2
                r1 = 0
                r2 = r1
                goto L48
            L72:
                return
        }

        public void processResultReg(com.android.dx.ssa.SsaInsn r3) {
                r2 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r3.getResult()
                if (r0 != 0) goto L7
                return
            L7:
                int r0 = r0.getReg()
                com.android.dx.ssa.SsaRenamer r1 = r2.this$0
                boolean r1 = com.android.dx.ssa.SsaRenamer.access$800(r1, r0)
                if (r1 == 0) goto L14
                return
            L14:
                com.android.dx.ssa.SsaRenamer r1 = r2.this$0
                int r1 = com.android.dx.ssa.SsaRenamer.access$100(r1)
                r3.changeResultReg(r1)
                com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
                r2.addMapping(r0, r3)
                com.android.dx.ssa.SsaRenamer r3 = r2.this$0
                com.android.dx.ssa.SsaRenamer.access$108(r3)
                return
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitMoveInsn(com.android.dx.ssa.NormalSsaInsn r8) {
                r7 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r8.getResult()
                int r1 = r0.getReg()
                com.android.dx.rop.code.RegisterSpecList r2 = r8.getSources()
                r3 = 0
                com.android.dx.rop.code.RegisterSpec r2 = r2.get(r3)
                int r2 = r2.getReg()
                com.android.dx.ssa.SsaRenamer$BlockRenamer$RenamingMapper r4 = r7.mapper
                r8.mapSourceRegisters(r4)
                com.android.dx.rop.code.RegisterSpecList r4 = r8.getSources()
                com.android.dx.rop.code.RegisterSpec r4 = r4.get(r3)
                int r4 = r4.getReg()
                com.android.dx.rop.code.RegisterSpec[] r5 = r7.currentMapping
                r2 = r5[r2]
                com.android.dx.rop.code.LocalItem r2 = r2.getLocalItem()
                com.android.dx.rop.code.LocalItem r5 = r0.getLocalItem()
                if (r5 != 0) goto L35
                r5 = r2
            L35:
                com.android.dx.ssa.SsaRenamer r6 = r7.this$0
                com.android.dx.rop.code.LocalItem r6 = com.android.dx.ssa.SsaRenamer.access$500(r6, r4)
                if (r6 == 0) goto L45
                if (r5 == 0) goto L45
                boolean r6 = r5.equals(r6)
                if (r6 == 0) goto L46
            L45:
                r3 = 1
            L46:
                com.android.dx.rop.type.Type r0 = r0.getType()
                com.android.dx.rop.code.RegisterSpec r0 = com.android.dx.rop.code.RegisterSpec.makeLocalOptional(r4, r0, r5)
                boolean r4 = com.android.dx.ssa.Optimizer.getPreserveLocals()
                if (r4 == 0) goto La5
                if (r3 == 0) goto L65
                boolean r4 = com.android.dx.ssa.SsaRenamer.access$600(r5, r2)
                if (r4 == 0) goto L65
                com.android.dx.ssa.SsaRenamer r4 = r7.this$0
                int r4 = com.android.dx.ssa.SsaRenamer.access$700(r4)
                if (r4 != 0) goto L65
                goto La5
            L65:
                if (r3 == 0) goto L9c
                if (r2 != 0) goto L9c
                com.android.dx.ssa.SsaRenamer r2 = r7.this$0
                int r2 = com.android.dx.ssa.SsaRenamer.access$700(r2)
                if (r2 != 0) goto L9c
                int r2 = r0.getReg()
                com.android.dx.rop.type.Type r3 = r0.getType()
                com.android.dx.rop.code.RegisterSpec r2 = com.android.dx.rop.code.RegisterSpec.make(r2, r3, r5)
                com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.make(r2)
                com.android.dx.rop.code.PlainInsn r3 = new com.android.dx.rop.code.PlainInsn
                com.android.dx.rop.code.Rop r4 = com.android.dx.rop.code.Rops.opMarkLocal(r0)
                com.android.dx.rop.code.SourcePosition r5 = com.android.dx.rop.code.SourcePosition.NO_INFO
                r6 = 0
                r3.<init>(r4, r5, r6, r2)
                com.android.dx.ssa.SsaBasicBlock r2 = r7.block
                com.android.dx.ssa.SsaInsn r2 = com.android.dx.ssa.SsaInsn.makeFromRop(r3, r2)
                java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.ssa.SsaInsn> r3 = r7.insnsToReplace
                r3.put(r8, r2)
                r7.addMapping(r1, r0)
                goto La8
            L9c:
                r7.processResultReg(r8)
                java.util.HashSet<com.android.dx.ssa.SsaInsn> r0 = r7.movesToKeep
                r0.add(r8)
                goto La8
            La5:
                r7.addMapping(r1, r0)
            La8:
                return
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitNonMoveInsn(com.android.dx.ssa.NormalSsaInsn r2) {
                r1 = this;
                com.android.dx.ssa.SsaRenamer$BlockRenamer$RenamingMapper r0 = r1.mapper
                r2.mapSourceRegisters(r0)
                r1.processResultReg(r2)
                return
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitPhiInsn(com.android.dx.ssa.PhiInsn r1) {
                r0 = this;
                r0.processResultReg(r1)
                return
        }
    }

    public SsaRenamer(com.android.dx.ssa.SsaMethod r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.getRegCount()
            r3.ropRegCount = r0
            r3.ssaMeth = r4
            r3.nextSsaReg = r0
            r1 = 0
            r3.threshold = r1
            java.util.ArrayList r2 = r4.getBlocks()
            int r2 = r2.size()
            com.android.dx.rop.code.RegisterSpec[][] r2 = new com.android.dx.rop.code.RegisterSpec[r2][]
            r3.startsForBlocks = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.ssaRegToLocalItems = r2
            com.android.dx.rop.code.RegisterSpec[] r0 = new com.android.dx.rop.code.RegisterSpec[r0]
        L25:
            int r2 = r3.ropRegCount
            if (r1 >= r2) goto L34
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.VOID
            com.android.dx.rop.code.RegisterSpec r2 = com.android.dx.rop.code.RegisterSpec.make(r1, r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L25
        L34:
            com.android.dx.rop.code.RegisterSpec[][] r1 = r3.startsForBlocks
            int r4 = r4.getEntryBlockIndex()
            r1[r4] = r0
            return
    }

    public SsaRenamer(com.android.dx.ssa.SsaMethod r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.threshold = r2
            return
    }

    public static /* synthetic */ com.android.dx.rop.code.RegisterSpec[][] access$000(com.android.dx.ssa.SsaRenamer r0) {
            com.android.dx.rop.code.RegisterSpec[][] r0 = r0.startsForBlocks
            return r0
    }

    public static /* synthetic */ int access$100(com.android.dx.ssa.SsaRenamer r0) {
            int r0 = r0.nextSsaReg
            return r0
    }

    public static /* synthetic */ int access$108(com.android.dx.ssa.SsaRenamer r2) {
            int r0 = r2.nextSsaReg
            int r1 = r0 + 1
            r2.nextSsaReg = r1
            return r0
    }

    public static /* synthetic */ com.android.dx.ssa.SsaMethod access$1100(com.android.dx.ssa.SsaRenamer r0) {
            com.android.dx.ssa.SsaMethod r0 = r0.ssaMeth
            return r0
    }

    public static /* synthetic */ com.android.dx.rop.code.RegisterSpec[] access$300(com.android.dx.rop.code.RegisterSpec[] r0) {
            com.android.dx.rop.code.RegisterSpec[] r0 = dupArray(r0)
            return r0
    }

    public static /* synthetic */ void access$400(com.android.dx.ssa.SsaRenamer r0, com.android.dx.rop.code.RegisterSpec r1) {
            r0.setNameForSsaReg(r1)
            return
    }

    public static /* synthetic */ com.android.dx.rop.code.LocalItem access$500(com.android.dx.ssa.SsaRenamer r0, int r1) {
            com.android.dx.rop.code.LocalItem r0 = r0.getLocalForNewReg(r1)
            return r0
    }

    public static /* synthetic */ boolean access$600(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = equalsHandlesNulls(r0, r1)
            return r0
    }

    public static /* synthetic */ int access$700(com.android.dx.ssa.SsaRenamer r0) {
            int r0 = r0.threshold
            return r0
    }

    public static /* synthetic */ boolean access$800(com.android.dx.ssa.SsaRenamer r0, int r1) {
            boolean r0 = r0.isBelowThresholdRegister(r1)
            return r0
    }

    public static /* synthetic */ boolean access$900(com.android.dx.ssa.SsaRenamer r0, int r1) {
            boolean r0 = r0.isVersionZeroRegister(r1)
            return r0
    }

    private static com.android.dx.rop.code.RegisterSpec[] dupArray(com.android.dx.rop.code.RegisterSpec[] r3) {
            int r0 = r3.length
            com.android.dx.rop.code.RegisterSpec[] r0 = new com.android.dx.rop.code.RegisterSpec[r0]
            r1 = 0
            int r2 = r3.length
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
            return r0
    }

    private static boolean equalsHandlesNulls(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    private com.android.dx.rop.code.LocalItem getLocalForNewReg(int r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.rop.code.LocalItem> r0 = r1.ssaRegToLocalItems
            int r0 = r0.size()
            if (r2 >= r0) goto L11
            java.util.ArrayList<com.android.dx.rop.code.LocalItem> r0 = r1.ssaRegToLocalItems
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.rop.code.LocalItem r2 = (com.android.dx.rop.code.LocalItem) r2
            return r2
        L11:
            r2 = 0
            return r2
    }

    private boolean isBelowThresholdRegister(int r2) {
            r1 = this;
            int r0 = r1.threshold
            if (r2 >= r0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    private boolean isVersionZeroRegister(int r2) {
            r1 = this;
            int r0 = r1.ropRegCount
            if (r2 >= r0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    private void setNameForSsaReg(com.android.dx.rop.code.RegisterSpec r4) {
            r3 = this;
            int r0 = r4.getReg()
            com.android.dx.rop.code.LocalItem r4 = r4.getLocalItem()
            java.util.ArrayList<com.android.dx.rop.code.LocalItem> r1 = r3.ssaRegToLocalItems
            int r2 = r0 + 1
            r1.ensureCapacity(r2)
        Lf:
            java.util.ArrayList<com.android.dx.rop.code.LocalItem> r1 = r3.ssaRegToLocalItems
            int r1 = r1.size()
            if (r1 > r0) goto L1e
            java.util.ArrayList<com.android.dx.rop.code.LocalItem> r1 = r3.ssaRegToLocalItems
            r2 = 0
            r1.add(r2)
            goto Lf
        L1e:
            java.util.ArrayList<com.android.dx.rop.code.LocalItem> r1 = r3.ssaRegToLocalItems
            r1.set(r0, r4)
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            com.android.dx.ssa.SsaMethod r0 = r2.ssaMeth
            com.android.dx.ssa.SsaRenamer$1 r1 = new com.android.dx.ssa.SsaRenamer$1
            r1.<init>(r2)
            r0.forEachBlockDepthFirstDom(r1)
            com.android.dx.ssa.SsaMethod r0 = r2.ssaMeth
            int r1 = r2.nextSsaReg
            r0.setNewRegCount(r1)
            com.android.dx.ssa.SsaMethod r0 = r2.ssaMeth
            r0.onInsnsChanged()
            return
    }
}
