package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class BlockAddresses {
    private final com.android.dx.dex.code.CodeAddress[] ends;
    private final com.android.dx.dex.code.CodeAddress[] lasts;
    private final com.android.dx.dex.code.CodeAddress[] starts;

    public BlockAddresses(com.android.dx.rop.code.RopMethod r3) {
            r2 = this;
            r2.<init>()
            com.android.dx.rop.code.BasicBlockList r0 = r3.getBlocks()
            int r0 = r0.getMaxLabel()
            com.android.dx.dex.code.CodeAddress[] r1 = new com.android.dx.dex.code.CodeAddress[r0]
            r2.starts = r1
            com.android.dx.dex.code.CodeAddress[] r1 = new com.android.dx.dex.code.CodeAddress[r0]
            r2.lasts = r1
            com.android.dx.dex.code.CodeAddress[] r0 = new com.android.dx.dex.code.CodeAddress[r0]
            r2.ends = r0
            r2.setupArrays(r3)
            return
    }

    private void setupArrays(com.android.dx.rop.code.RopMethod r9) {
            r8 = this;
            com.android.dx.rop.code.BasicBlockList r9 = r9.getBlocks()
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L46
            com.android.dx.rop.code.BasicBlock r3 = r9.get(r2)
            int r4 = r3.getLabel()
            com.android.dx.rop.code.InsnList r5 = r3.getInsns()
            com.android.dx.rop.code.Insn r5 = r5.get(r1)
            com.android.dx.dex.code.CodeAddress[] r6 = r8.starts
            com.android.dx.dex.code.CodeAddress r7 = new com.android.dx.dex.code.CodeAddress
            com.android.dx.rop.code.SourcePosition r5 = r5.getPosition()
            r7.<init>(r5)
            r6[r4] = r7
            com.android.dx.rop.code.Insn r3 = r3.getLastInsn()
            com.android.dx.rop.code.SourcePosition r3 = r3.getPosition()
            com.android.dx.dex.code.CodeAddress[] r5 = r8.lasts
            com.android.dx.dex.code.CodeAddress r6 = new com.android.dx.dex.code.CodeAddress
            r6.<init>(r3)
            r5[r4] = r6
            com.android.dx.dex.code.CodeAddress[] r5 = r8.ends
            com.android.dx.dex.code.CodeAddress r6 = new com.android.dx.dex.code.CodeAddress
            r6.<init>(r3)
            r5[r4] = r6
            int r2 = r2 + 1
            goto La
        L46:
            return
    }

    public com.android.dx.dex.code.CodeAddress getEnd(int r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress[] r0 = r1.ends
            r2 = r0[r2]
            return r2
    }

    public com.android.dx.dex.code.CodeAddress getEnd(com.android.dx.rop.code.BasicBlock r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress[] r0 = r1.ends
            int r2 = r2.getLabel()
            r2 = r0[r2]
            return r2
    }

    public com.android.dx.dex.code.CodeAddress getLast(int r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress[] r0 = r1.lasts
            r2 = r0[r2]
            return r2
    }

    public com.android.dx.dex.code.CodeAddress getLast(com.android.dx.rop.code.BasicBlock r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress[] r0 = r1.lasts
            int r2 = r2.getLabel()
            r2 = r0[r2]
            return r2
    }

    public com.android.dx.dex.code.CodeAddress getStart(int r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress[] r0 = r1.starts
            r2 = r0[r2]
            return r2
    }

    public com.android.dx.dex.code.CodeAddress getStart(com.android.dx.rop.code.BasicBlock r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress[] r0 = r1.starts
            int r2 = r2.getLabel()
            r2 = r0[r2]
            return r2
    }
}
