package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class PhiTypeResolver {
    com.android.dx.ssa.SsaMethod ssaMeth;
    private final java.util.BitSet worklist;

    private PhiTypeResolver(com.android.dx.ssa.SsaMethod r2) {
            r1 = this;
            r1.<init>()
            r1.ssaMeth = r2
            java.util.BitSet r0 = new java.util.BitSet
            int r2 = r2.getRegCount()
            r0.<init>(r2)
            r1.worklist = r0
            return
    }

    private static boolean equalsHandlesNulls(com.android.dx.rop.code.LocalItem r0, com.android.dx.rop.code.LocalItem r1) {
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

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.PhiTypeResolver r0 = new com.android.dx.ssa.PhiTypeResolver
            r0.<init>(r1)
            r0.run()
            return
    }

    private void run() {
            r6 = this;
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            int r0 = r0.getRegCount()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L24
            com.android.dx.ssa.SsaMethod r3 = r6.ssaMeth
            com.android.dx.ssa.SsaInsn r3 = r3.getDefinitionForRegister(r2)
            if (r3 == 0) goto L21
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
            int r3 = r3.getBasicType()
            if (r3 != 0) goto L21
            java.util.BitSet r3 = r6.worklist
            r3.set(r2)
        L21:
            int r2 = r2 + 1
            goto L8
        L24:
            java.util.BitSet r0 = r6.worklist
            int r0 = r0.nextSetBit(r1)
            if (r0 < 0) goto L68
            java.util.BitSet r2 = r6.worklist
            r2.clear(r0)
            com.android.dx.ssa.SsaMethod r2 = r6.ssaMeth
            com.android.dx.ssa.SsaInsn r2 = r2.getDefinitionForRegister(r0)
            com.android.dx.ssa.PhiInsn r2 = (com.android.dx.ssa.PhiInsn) r2
            boolean r2 = r6.resolveResultType(r2)
            if (r2 == 0) goto L24
            com.android.dx.ssa.SsaMethod r2 = r6.ssaMeth
            java.util.List r0 = r2.getUseListForRegister(r0)
            int r2 = r0.size()
            r3 = r1
        L4a:
            if (r3 >= r2) goto L24
            java.lang.Object r4 = r0.get(r3)
            com.android.dx.ssa.SsaInsn r4 = (com.android.dx.ssa.SsaInsn) r4
            com.android.dx.rop.code.RegisterSpec r5 = r4.getResult()
            if (r5 == 0) goto L65
            boolean r4 = r4 instanceof com.android.dx.ssa.PhiInsn
            if (r4 == 0) goto L65
            java.util.BitSet r4 = r6.worklist
            int r5 = r5.getReg()
            r4.set(r5)
        L65:
            int r3 = r3 + 1
            goto L4a
        L68:
            return
    }

    public boolean resolveResultType(com.android.dx.ssa.PhiInsn r13) {
            r12 = this;
            com.android.dx.ssa.SsaMethod r0 = r12.ssaMeth
            r13.updateSourcesToDefinitions(r0)
            com.android.dx.rop.code.RegisterSpecList r0 = r13.getSources()
            int r1 = r0.size()
            r2 = 0
            r3 = -1
            r4 = 0
            r6 = r2
            r5 = r4
        L12:
            if (r5 >= r1) goto L23
            com.android.dx.rop.code.RegisterSpec r7 = r0.get(r5)
            int r8 = r7.getBasicType()
            if (r8 == 0) goto L20
            r3 = r5
            r6 = r7
        L20:
            int r5 = r5 + 1
            goto L12
        L23:
            if (r6 != 0) goto L26
            return r4
        L26:
            com.android.dx.rop.code.LocalItem r5 = r6.getLocalItem()
            com.android.dx.rop.type.Type r6 = r6.getType()
            r7 = 1
            r8 = r4
            r9 = r7
        L31:
            if (r8 >= r1) goto L5b
            if (r8 != r3) goto L36
            goto L58
        L36:
            com.android.dx.rop.code.RegisterSpec r10 = r0.get(r8)
            int r11 = r10.getBasicType()
            if (r11 != 0) goto L41
            goto L58
        L41:
            if (r9 == 0) goto L4f
            com.android.dx.rop.code.LocalItem r9 = r10.getLocalItem()
            boolean r9 = equalsHandlesNulls(r5, r9)
            if (r9 == 0) goto L4f
            r9 = r7
            goto L50
        L4f:
            r9 = r4
        L50:
            com.android.dx.rop.type.Type r10 = r10.getType()
            com.android.dx.rop.type.TypeBearer r6 = com.android.dx.cf.code.Merger.mergeType(r6, r10)
        L58:
            int r8 = r8 + 1
            goto L31
        L5b:
            if (r6 == 0) goto L79
            if (r9 == 0) goto L60
            r2 = r5
        L60:
            com.android.dx.rop.code.RegisterSpec r0 = r13.getResult()
            com.android.dx.rop.type.TypeBearer r1 = r0.getTypeBearer()
            if (r1 != r6) goto L75
            com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
            boolean r0 = equalsHandlesNulls(r2, r0)
            if (r0 == 0) goto L75
            return r4
        L75:
            r13.changeResultType(r6, r2)
            return r7
        L79:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
        L7e:
            if (r4 >= r1) goto L93
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r4)
            java.lang.String r2 = r2.toString()
            r13.append(r2)
            r2 = 32
            r13.append(r2)
            int r4 = r4 + 1
            goto L7e
        L93:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Couldn't map types in phi insn:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
    }
}
