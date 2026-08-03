package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class InterferenceRegisterMapper extends com.android.dx.ssa.BasicRegisterMapper {
    private final java.util.ArrayList<com.android.dx.util.BitIntSet> newRegInterference;
    private final com.android.dx.ssa.back.InterferenceGraph oldRegInterference;

    public InterferenceRegisterMapper(com.android.dx.ssa.back.InterferenceGraph r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.newRegInterference = r2
            r0.oldRegInterference = r1
            return
    }

    private void addInterfence(int r4, int r5) {
            r3 = this;
            java.util.ArrayList<com.android.dx.util.BitIntSet> r0 = r3.newRegInterference
            int r1 = r4 + 1
            r0.ensureCapacity(r1)
        L7:
            java.util.ArrayList<com.android.dx.util.BitIntSet> r0 = r3.newRegInterference
            int r0 = r0.size()
            if (r4 < r0) goto L1a
            java.util.ArrayList<com.android.dx.util.BitIntSet> r0 = r3.newRegInterference
            com.android.dx.util.BitIntSet r2 = new com.android.dx.util.BitIntSet
            r2.<init>(r1)
            r0.add(r2)
            goto L7
        L1a:
            com.android.dx.ssa.back.InterferenceGraph r0 = r3.oldRegInterference
            java.util.ArrayList<com.android.dx.util.BitIntSet> r1 = r3.newRegInterference
            java.lang.Object r4 = r1.get(r4)
            com.android.dx.util.IntSet r4 = (com.android.dx.util.IntSet) r4
            r0.mergeInterferenceSet(r5, r4)
            return
    }

    @Override // com.android.dx.ssa.BasicRegisterMapper
    public void addMapping(int r2, int r3, int r4) {
            r1 = this;
            super.addMapping(r2, r3, r4)
            r1.addInterfence(r3, r2)
            r0 = 2
            if (r4 != r0) goto Le
            int r3 = r3 + 1
            r1.addInterfence(r3, r2)
        Le:
            return
    }

    public boolean areAnyPinned(com.android.dx.rop.code.RegisterSpecList r7, int r8, int r9) {
            r6 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L2d
            com.android.dx.rop.code.RegisterSpec r3 = r7.get(r2)
            int r4 = r3.getReg()
            int r4 = r6.oldToNew(r4)
            if (r4 == r8) goto L2b
            int r3 = r3.getCategory()
            r5 = 2
            if (r3 != r5) goto L21
            int r3 = r4 + 1
            if (r3 == r8) goto L2b
        L21:
            if (r9 != r5) goto L28
            int r3 = r8 + 1
            if (r4 != r3) goto L28
            goto L2b
        L28:
            int r2 = r2 + 1
            goto L6
        L2b:
            r7 = 1
            return r7
        L2d:
            return r1
    }

    public boolean interferes(int r4, int r5, int r6) {
            r3 = this;
            java.util.ArrayList<com.android.dx.util.BitIntSet> r0 = r3.newRegInterference
            int r0 = r0.size()
            r1 = 0
            if (r5 < r0) goto La
            return r1
        La:
            java.util.ArrayList<com.android.dx.util.BitIntSet> r0 = r3.newRegInterference
            java.lang.Object r0 = r0.get(r5)
            com.android.dx.util.IntSet r0 = (com.android.dx.util.IntSet) r0
            if (r0 != 0) goto L15
            return r1
        L15:
            r2 = 1
            if (r6 != r2) goto L1d
            boolean r4 = r0.has(r4)
            return r4
        L1d:
            boolean r0 = r0.has(r4)
            if (r0 != 0) goto L2b
            int r5 = r5 + r2
            int r6 = r6 - r2
            boolean r4 = r3.interferes(r4, r5, r6)
            if (r4 == 0) goto L2c
        L2b:
            r1 = r2
        L2c:
            return r1
    }

    public boolean interferes(com.android.dx.rop.code.RegisterSpec r2, int r3) {
            r1 = this;
            int r0 = r2.getReg()
            int r2 = r2.getCategory()
            boolean r2 = r1.interferes(r0, r3, r2)
            return r2
    }
}
