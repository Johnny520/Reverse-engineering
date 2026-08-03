package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class DomFront {
    private static final boolean DEBUG = false;
    private final com.android.dx.ssa.DomFront.DomInfo[] domInfos;
    private final com.android.dx.ssa.SsaMethod meth;
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> nodes;

    public static class DomInfo {
        public com.android.dx.util.IntSet dominanceFrontiers;
        public int idom;

        public DomInfo() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.idom = r0
                return
        }
    }

    public DomFront(com.android.dx.ssa.SsaMethod r4) {
            r3 = this;
            r3.<init>()
            r3.meth = r4
            java.util.ArrayList r4 = r4.getBlocks()
            r3.nodes = r4
            int r4 = r4.size()
            com.android.dx.ssa.DomFront$DomInfo[] r0 = new com.android.dx.ssa.DomFront.DomInfo[r4]
            r3.domInfos = r0
            r0 = 0
        L14:
            if (r0 >= r4) goto L22
            com.android.dx.ssa.DomFront$DomInfo[] r1 = r3.domInfos
            com.android.dx.ssa.DomFront$DomInfo r2 = new com.android.dx.ssa.DomFront$DomInfo
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L14
        L22:
            return
    }

    private void buildDomTree() {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.nodes
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L29
            com.android.dx.ssa.DomFront$DomInfo[] r2 = r4.domInfos
            r2 = r2[r1]
            int r2 = r2.idom
            r3 = -1
            if (r2 != r3) goto L13
            goto L26
        L13:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r3 = r4.nodes
            java.lang.Object r2 = r3.get(r2)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r3 = r4.nodes
            java.lang.Object r3 = r3.get(r1)
            com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
            r2.addDomChild(r3)
        L26:
            int r1 = r1 + 1
            goto L7
        L29:
            return
    }

    private void calcDomFronts() {
            r8 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r8.nodes
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L4f
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r3 = r8.nodes
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
            com.android.dx.ssa.DomFront$DomInfo[] r4 = r8.domInfos
            r4 = r4[r2]
            java.util.BitSet r3 = r3.getPredecessors()
            int r5 = r3.cardinality()
            r6 = 1
            if (r5 <= r6) goto L4c
            int r5 = r3.nextSetBit(r1)
        L25:
            if (r5 < 0) goto L4c
            r6 = r5
        L28:
            int r7 = r4.idom
            if (r6 == r7) goto L45
            r7 = -1
            if (r6 != r7) goto L30
            goto L45
        L30:
            com.android.dx.ssa.DomFront$DomInfo[] r7 = r8.domInfos
            r6 = r7[r6]
            com.android.dx.util.IntSet r7 = r6.dominanceFrontiers
            boolean r7 = r7.has(r2)
            if (r7 == 0) goto L3d
            goto L45
        L3d:
            com.android.dx.util.IntSet r7 = r6.dominanceFrontiers
            r7.add(r2)
            int r6 = r6.idom
            goto L28
        L45:
            int r5 = r5 + 1
            int r5 = r3.nextSetBit(r5)
            goto L25
        L4c:
            int r2 = r2 + 1
            goto L8
        L4f:
            return
    }

    private void debugPrintDomChildren() {
            r8 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r8.nodes
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L63
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r3 = r8.nodes
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r5 = 123(0x7b, float:1.72E-43)
            r4.append(r5)
            java.util.ArrayList r5 = r3.getDomChildren()
            java.util.Iterator r5 = r5.iterator()
            r6 = r1
        L25:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L3d
            java.lang.Object r7 = r5.next()
            com.android.dx.ssa.SsaBasicBlock r7 = (com.android.dx.ssa.SsaBasicBlock) r7
            if (r6 == 0) goto L38
            r6 = 44
            r4.append(r6)
        L38:
            r4.append(r7)
            r6 = 1
            goto L25
        L3d:
            r5 = 125(0x7d, float:1.75E-43)
            r4.append(r5)
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "domChildren["
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = "]: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            r5.println(r3)
            int r2 = r2 + 1
            goto L8
        L63:
            return
    }

    public com.android.dx.ssa.DomFront.DomInfo[] run() {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.nodes
            int r0 = r0.size()
            com.android.dx.ssa.SsaMethod r1 = r4.meth
            com.android.dx.ssa.DomFront$DomInfo[] r2 = r4.domInfos
            r3 = 0
            com.android.dx.ssa.Dominators.make(r1, r2, r3)
            r4.buildDomTree()
        L11:
            if (r3 >= r0) goto L20
            com.android.dx.ssa.DomFront$DomInfo[] r1 = r4.domInfos
            r1 = r1[r3]
            com.android.dx.util.IntSet r2 = com.android.dx.ssa.SetFactory.makeDomFrontSet(r0)
            r1.dominanceFrontiers = r2
            int r3 = r3 + 1
            goto L11
        L20:
            r4.calcDomFronts()
            com.android.dx.ssa.DomFront$DomInfo[] r0 = r4.domInfos
            return r0
    }
}
