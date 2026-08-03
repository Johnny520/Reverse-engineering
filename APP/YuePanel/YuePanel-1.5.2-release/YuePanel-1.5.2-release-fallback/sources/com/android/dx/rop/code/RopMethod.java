package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class RopMethod {
    private final com.android.dx.rop.code.BasicBlockList blocks;
    private com.android.dx.util.IntList exitPredecessors;
    private final int firstLabel;
    private com.android.dx.util.IntList[] predecessors;

    public RopMethod(com.android.dx.rop.code.BasicBlockList r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L19
            if (r2 < 0) goto L11
            r0.blocks = r1
            r0.firstLabel = r2
            r1 = 0
            r0.predecessors = r1
            r0.exitPredecessors = r1
            return
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "firstLabel < 0"
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "blocks == null"
            r1.<init>(r2)
            throw r1
    }

    private void calcPredecessors() {
            r13 = this;
            com.android.dx.rop.code.BasicBlockList r0 = r13.blocks
            int r0 = r0.getMaxLabel()
            com.android.dx.util.IntList[] r1 = new com.android.dx.util.IntList[r0]
            com.android.dx.util.IntList r2 = new com.android.dx.util.IntList
            r3 = 10
            r2.<init>(r3)
            com.android.dx.rop.code.BasicBlockList r4 = r13.blocks
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L17:
            if (r6 >= r4) goto L4c
            com.android.dx.rop.code.BasicBlockList r7 = r13.blocks
            com.android.dx.rop.code.BasicBlock r7 = r7.get(r6)
            int r8 = r7.getLabel()
            com.android.dx.util.IntList r7 = r7.getSuccessors()
            int r9 = r7.size()
            if (r9 != 0) goto L31
            r2.add(r8)
            goto L49
        L31:
            r10 = r5
        L32:
            if (r10 >= r9) goto L49
            int r11 = r7.get(r10)
            r12 = r1[r11]
            if (r12 != 0) goto L43
            com.android.dx.util.IntList r12 = new com.android.dx.util.IntList
            r12.<init>(r3)
            r1[r11] = r12
        L43:
            r12.add(r8)
            int r10 = r10 + 1
            goto L32
        L49:
            int r6 = r6 + 1
            goto L17
        L4c:
            if (r5 >= r0) goto L5b
            r3 = r1[r5]
            if (r3 == 0) goto L58
            r3.sort()
            r3.setImmutable()
        L58:
            int r5 = r5 + 1
            goto L4c
        L5b:
            r2.sort()
            r2.setImmutable()
            int r0 = r13.firstLabel
            r3 = r1[r0]
            if (r3 != 0) goto L6b
            com.android.dx.util.IntList r3 = com.android.dx.util.IntList.EMPTY
            r1[r0] = r3
        L6b:
            r13.predecessors = r1
            r13.exitPredecessors = r2
            return
    }

    public com.android.dx.rop.code.BasicBlockList getBlocks() {
            r1 = this;
            com.android.dx.rop.code.BasicBlockList r0 = r1.blocks
            return r0
    }

    public com.android.dx.util.IntList getExitPredecessors() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.exitPredecessors
            if (r0 != 0) goto L7
            r1.calcPredecessors()
        L7:
            com.android.dx.util.IntList r0 = r1.exitPredecessors
            return r0
    }

    public int getFirstLabel() {
            r1 = this;
            int r0 = r1.firstLabel
            return r0
    }

    public com.android.dx.util.IntList labelToPredecessors(int r4) {
            r3 = this;
            com.android.dx.util.IntList r0 = r3.exitPredecessors
            if (r0 != 0) goto L7
            r3.calcPredecessors()
        L7:
            com.android.dx.util.IntList[] r0 = r3.predecessors
            r0 = r0[r4]
            if (r0 == 0) goto Le
            return r0
        Le:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such block: "
            r1.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.android.dx.rop.code.RopMethod withRegisterOffset(int r3) {
            r2 = this;
            com.android.dx.rop.code.RopMethod r0 = new com.android.dx.rop.code.RopMethod
            com.android.dx.rop.code.BasicBlockList r1 = r2.blocks
            com.android.dx.rop.code.BasicBlockList r3 = r1.withRegisterOffset(r3)
            int r1 = r2.firstLabel
            r0.<init>(r3, r1)
            com.android.dx.util.IntList r3 = r2.exitPredecessors
            if (r3 == 0) goto L17
            r0.exitPredecessors = r3
            com.android.dx.util.IntList[] r3 = r2.predecessors
            r0.predecessors = r3
        L17:
            return r0
    }
}
