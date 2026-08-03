package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class BasicRegisterMapper extends com.android.dx.ssa.RegisterMapper {
    private final com.android.dx.util.IntList oldToNew;
    private int runningCountNewRegisters;

    public BasicRegisterMapper(int r2) {
            r1 = this;
            r1.<init>()
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r0.<init>(r2)
            r1.oldToNew = r0
            return
    }

    public void addMapping(int r4, int r5, int r6) {
            r3 = this;
            com.android.dx.util.IntList r0 = r3.oldToNew
            int r0 = r0.size()
            if (r4 < r0) goto L1b
            com.android.dx.util.IntList r0 = r3.oldToNew
            int r0 = r0.size()
            int r0 = r4 - r0
        L10:
            if (r0 < 0) goto L1b
            com.android.dx.util.IntList r1 = r3.oldToNew
            r2 = -1
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L10
        L1b:
            com.android.dx.util.IntList r0 = r3.oldToNew
            r0.set(r4, r5)
            int r4 = r3.runningCountNewRegisters
            int r5 = r5 + r6
            if (r4 >= r5) goto L27
            r3.runningCountNewRegisters = r5
        L27:
            return
    }

    @Override // com.android.dx.ssa.RegisterMapper
    public int getNewRegisterCount() {
            r1 = this;
            int r0 = r1.runningCountNewRegisters
            return r0
    }

    @Override // com.android.dx.ssa.RegisterMapper
    public com.android.dx.rop.code.RegisterSpec map(com.android.dx.rop.code.RegisterSpec r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.android.dx.util.IntList r0 = r2.oldToNew     // Catch: java.lang.IndexOutOfBoundsException -> Lf
            int r1 = r3.getReg()     // Catch: java.lang.IndexOutOfBoundsException -> Lf
            int r0 = r0.get(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lf
            goto L10
        Lf:
            r0 = -1
        L10:
            if (r0 < 0) goto L17
            com.android.dx.rop.code.RegisterSpec r3 = r3.withReg(r0)
            return r3
        L17:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "no mapping specified for register"
            r3.<init>(r0)
            throw r3
    }

    public int oldToNew(int r2) {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.oldToNew
            int r0 = r0.size()
            if (r2 < r0) goto La
            r2 = -1
            return r2
        La:
            com.android.dx.util.IntList r0 = r1.oldToNew
            int r2 = r0.get(r2)
            return r2
    }

    public java.lang.String toHuman() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Old\tNew\n"
            r0.append(r1)
            com.android.dx.util.IntList r1 = r5.oldToNew
            int r1 = r1.size()
            r2 = 0
        L11:
            r3 = 10
            if (r2 >= r1) goto L2c
            r0.append(r2)
            r4 = 9
            r0.append(r4)
            com.android.dx.util.IntList r4 = r5.oldToNew
            int r4 = r4.get(r2)
            r0.append(r4)
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L2c:
            java.lang.String r1 = "new reg count:"
            r0.append(r1)
            int r1 = r5.runningCountNewRegisters
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
