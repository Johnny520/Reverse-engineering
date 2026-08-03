package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class Dominators {
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> blocks;
    private final com.android.dx.ssa.DomFront.DomInfo[] domInfos;
    private final com.android.dx.ssa.Dominators.DFSInfo[] info;
    private final com.android.dx.ssa.SsaMethod meth;
    private final boolean postdom;
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> vertex;

    /* JADX INFO: renamed from: com.android.dx.ssa.Dominators$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class DFSInfo {
        public com.android.dx.ssa.SsaBasicBlock ancestor;
        public java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> bucket;
        public com.android.dx.ssa.SsaBasicBlock parent;
        public com.android.dx.ssa.SsaBasicBlock rep;
        public int semidom;

        public DFSInfo() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.bucket = r0
                return
        }
    }

    public class DfsWalker implements com.android.dx.ssa.SsaBasicBlock.Visitor {
        private int dfsNum;
        final /* synthetic */ com.android.dx.ssa.Dominators this$0;

        private DfsWalker(com.android.dx.ssa.Dominators r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.dfsNum = r1
                return
        }

        public /* synthetic */ DfsWalker(com.android.dx.ssa.Dominators r1, com.android.dx.ssa.Dominators.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.android.dx.ssa.SsaBasicBlock.Visitor
        public void visitBlock(com.android.dx.ssa.SsaBasicBlock r3, com.android.dx.ssa.SsaBasicBlock r4) {
                r2 = this;
                com.android.dx.ssa.Dominators$DFSInfo r0 = new com.android.dx.ssa.Dominators$DFSInfo
                r0.<init>()
                int r1 = r2.dfsNum
                int r1 = r1 + 1
                r2.dfsNum = r1
                r0.semidom = r1
                r0.rep = r3
                r0.parent = r4
                com.android.dx.ssa.Dominators r4 = r2.this$0
                java.util.ArrayList r4 = com.android.dx.ssa.Dominators.access$100(r4)
                r4.add(r3)
                com.android.dx.ssa.Dominators r4 = r2.this$0
                com.android.dx.ssa.Dominators$DFSInfo[] r4 = com.android.dx.ssa.Dominators.access$200(r4)
                int r3 = r3.getIndex()
                r4[r3] = r0
                return
        }
    }

    private Dominators(com.android.dx.ssa.SsaMethod r1, com.android.dx.ssa.DomFront.DomInfo[] r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.meth = r1
            r0.domInfos = r2
            r0.postdom = r3
            java.util.ArrayList r1 = r1.getBlocks()
            r0.blocks = r1
            int r1 = r1.size()
            int r1 = r1 + 2
            com.android.dx.ssa.Dominators$DFSInfo[] r1 = new com.android.dx.ssa.Dominators.DFSInfo[r1]
            r0.info = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.vertex = r1
            return
    }

    public static /* synthetic */ java.util.ArrayList access$100(com.android.dx.ssa.Dominators r0) {
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r0.vertex
            return r0
    }

    public static /* synthetic */ com.android.dx.ssa.Dominators.DFSInfo[] access$200(com.android.dx.ssa.Dominators r0) {
            com.android.dx.ssa.Dominators$DFSInfo[] r0 = r0.info
            return r0
    }

    private void compress(com.android.dx.ssa.SsaBasicBlock r8) {
            r7 = this;
            com.android.dx.ssa.Dominators$DFSInfo[] r0 = r7.info
            int r1 = r8.getIndex()
            r0 = r0[r1]
            com.android.dx.ssa.Dominators$DFSInfo[] r1 = r7.info
            com.android.dx.ssa.SsaBasicBlock r0 = r0.ancestor
            int r0 = r0.getIndex()
            r0 = r1[r0]
            com.android.dx.ssa.SsaBasicBlock r0 = r0.ancestor
            if (r0 == 0) goto L7e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.add(r8)
        L23:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L7e
            int r8 = r0.size()
            int r8 = r8 + (-1)
            java.lang.Object r2 = r0.get(r8)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            com.android.dx.ssa.Dominators$DFSInfo[] r3 = r7.info
            int r2 = r2.getIndex()
            r2 = r3[r2]
            com.android.dx.ssa.SsaBasicBlock r3 = r2.ancestor
            com.android.dx.ssa.Dominators$DFSInfo[] r4 = r7.info
            int r5 = r3.getIndex()
            r4 = r4[r5]
            boolean r5 = r1.add(r3)
            if (r5 == 0) goto L55
            com.android.dx.ssa.SsaBasicBlock r5 = r4.ancestor
            if (r5 == 0) goto L55
            r0.add(r3)
            goto L23
        L55:
            r0.remove(r8)
            com.android.dx.ssa.SsaBasicBlock r8 = r4.ancestor
            if (r8 != 0) goto L5d
            goto L23
        L5d:
            com.android.dx.ssa.SsaBasicBlock r8 = r4.rep
            com.android.dx.ssa.SsaBasicBlock r3 = r2.rep
            com.android.dx.ssa.Dominators$DFSInfo[] r5 = r7.info
            int r6 = r8.getIndex()
            r5 = r5[r6]
            int r5 = r5.semidom
            com.android.dx.ssa.Dominators$DFSInfo[] r6 = r7.info
            int r3 = r3.getIndex()
            r3 = r6[r3]
            int r3 = r3.semidom
            if (r5 >= r3) goto L79
            r2.rep = r8
        L79:
            com.android.dx.ssa.SsaBasicBlock r8 = r4.ancestor
            r2.ancestor = r8
            goto L23
        L7e:
            return
    }

    private com.android.dx.ssa.SsaBasicBlock eval(com.android.dx.ssa.SsaBasicBlock r3) {
            r2 = this;
            com.android.dx.ssa.Dominators$DFSInfo[] r0 = r2.info
            int r1 = r3.getIndex()
            r0 = r0[r1]
            com.android.dx.ssa.SsaBasicBlock r1 = r0.ancestor
            if (r1 != 0) goto Ld
            return r3
        Ld:
            r2.compress(r3)
            com.android.dx.ssa.SsaBasicBlock r3 = r0.rep
            return r3
    }

    private java.util.BitSet getPreds(com.android.dx.ssa.SsaBasicBlock r2) {
            r1 = this;
            boolean r0 = r1.postdom
            if (r0 == 0) goto L9
            java.util.BitSet r2 = r2.getSuccessors()
            return r2
        L9:
            java.util.BitSet r2 = r2.getPredecessors()
            return r2
    }

    private java.util.BitSet getSuccs(com.android.dx.ssa.SsaBasicBlock r2) {
            r1 = this;
            boolean r0 = r1.postdom
            if (r0 == 0) goto L9
            java.util.BitSet r2 = r2.getPredecessors()
            return r2
        L9:
            java.util.BitSet r2 = r2.getSuccessors()
            return r2
    }

    public static com.android.dx.ssa.Dominators make(com.android.dx.ssa.SsaMethod r1, com.android.dx.ssa.DomFront.DomInfo[] r2, boolean r3) {
            com.android.dx.ssa.Dominators r0 = new com.android.dx.ssa.Dominators
            r0.<init>(r1, r2, r3)
            r0.run()
            return r0
    }

    private void run() {
            r9 = this;
            boolean r0 = r9.postdom
            if (r0 == 0) goto Lb
            com.android.dx.ssa.SsaMethod r0 = r9.meth
            com.android.dx.ssa.SsaBasicBlock r0 = r0.getExitBlock()
            goto L11
        Lb:
            com.android.dx.ssa.SsaMethod r0 = r9.meth
            com.android.dx.ssa.SsaBasicBlock r0 = r0.getEntryBlock()
        L11:
            if (r0 == 0) goto L26
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r9.vertex
            r1.add(r0)
            com.android.dx.ssa.DomFront$DomInfo[] r1 = r9.domInfos
            int r2 = r0.getIndex()
            r1 = r1[r2]
            int r0 = r0.getIndex()
            r1.idom = r0
        L26:
            com.android.dx.ssa.Dominators$DfsWalker r0 = new com.android.dx.ssa.Dominators$DfsWalker
            r1 = 0
            r0.<init>(r9, r1)
            com.android.dx.ssa.SsaMethod r1 = r9.meth
            boolean r2 = r9.postdom
            r1.forEachBlockDepthFirst(r2, r0)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r9.vertex
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = r0
        L3c:
            r2 = 2
            if (r1 < r2) goto Lfc
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r2 = r9.vertex
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            com.android.dx.ssa.Dominators$DFSInfo[] r3 = r9.info
            int r4 = r2.getIndex()
            r3 = r3[r4]
            java.util.BitSet r4 = r9.getPreds(r2)
            r5 = 0
            int r5 = r4.nextSetBit(r5)
        L58:
            if (r5 < 0) goto L87
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r6 = r9.blocks
            java.lang.Object r6 = r6.get(r5)
            com.android.dx.ssa.SsaBasicBlock r6 = (com.android.dx.ssa.SsaBasicBlock) r6
            com.android.dx.ssa.Dominators$DFSInfo[] r7 = r9.info
            int r8 = r6.getIndex()
            r7 = r7[r8]
            if (r7 == 0) goto L80
            com.android.dx.ssa.Dominators$DFSInfo[] r7 = r9.info
            com.android.dx.ssa.SsaBasicBlock r6 = r9.eval(r6)
            int r6 = r6.getIndex()
            r6 = r7[r6]
            int r6 = r6.semidom
            int r7 = r3.semidom
            if (r6 >= r7) goto L80
            r3.semidom = r6
        L80:
            int r5 = r5 + 1
            int r5 = r4.nextSetBit(r5)
            goto L58
        L87:
            com.android.dx.ssa.Dominators$DFSInfo[] r4 = r9.info
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r5 = r9.vertex
            int r6 = r3.semidom
            java.lang.Object r5 = r5.get(r6)
            com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
            int r5 = r5.getIndex()
            r4 = r4[r5]
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r4 = r4.bucket
            r4.add(r2)
            com.android.dx.ssa.SsaBasicBlock r2 = r3.parent
            r3.ancestor = r2
            com.android.dx.ssa.Dominators$DFSInfo[] r4 = r9.info
            int r2 = r2.getIndex()
            r2 = r4[r2]
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r2 = r2.bucket
        Lac:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Lf8
            int r4 = r2.size()
            int r4 = r4 + (-1)
            java.lang.Object r4 = r2.remove(r4)
            com.android.dx.ssa.SsaBasicBlock r4 = (com.android.dx.ssa.SsaBasicBlock) r4
            com.android.dx.ssa.SsaBasicBlock r5 = r9.eval(r4)
            com.android.dx.ssa.Dominators$DFSInfo[] r6 = r9.info
            int r7 = r5.getIndex()
            r6 = r6[r7]
            int r6 = r6.semidom
            com.android.dx.ssa.Dominators$DFSInfo[] r7 = r9.info
            int r8 = r4.getIndex()
            r7 = r7[r8]
            int r7 = r7.semidom
            if (r6 >= r7) goto Le7
            com.android.dx.ssa.DomFront$DomInfo[] r6 = r9.domInfos
            int r4 = r4.getIndex()
            r4 = r6[r4]
            int r5 = r5.getIndex()
            r4.idom = r5
            goto Lac
        Le7:
            com.android.dx.ssa.DomFront$DomInfo[] r5 = r9.domInfos
            int r4 = r4.getIndex()
            r4 = r5[r4]
            com.android.dx.ssa.SsaBasicBlock r5 = r3.parent
            int r5 = r5.getIndex()
            r4.idom = r5
            goto Lac
        Lf8:
            int r1 = r1 + (-1)
            goto L3c
        Lfc:
            if (r2 > r0) goto L143
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r9.vertex
            java.lang.Object r1 = r1.get(r2)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            com.android.dx.ssa.DomFront$DomInfo[] r3 = r9.domInfos
            int r4 = r1.getIndex()
            r3 = r3[r4]
            int r3 = r3.idom
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r4 = r9.vertex
            com.android.dx.ssa.Dominators$DFSInfo[] r5 = r9.info
            int r6 = r1.getIndex()
            r5 = r5[r6]
            int r5 = r5.semidom
            java.lang.Object r4 = r4.get(r5)
            com.android.dx.ssa.SsaBasicBlock r4 = (com.android.dx.ssa.SsaBasicBlock) r4
            int r4 = r4.getIndex()
            if (r3 == r4) goto L140
            com.android.dx.ssa.DomFront$DomInfo[] r3 = r9.domInfos
            int r4 = r1.getIndex()
            r3 = r3[r4]
            com.android.dx.ssa.DomFront$DomInfo[] r4 = r9.domInfos
            int r1 = r1.getIndex()
            r1 = r4[r1]
            int r1 = r1.idom
            r1 = r4[r1]
            int r1 = r1.idom
            r3.idom = r1
        L140:
            int r2 = r2 + 1
            goto Lfc
        L143:
            return
    }
}
