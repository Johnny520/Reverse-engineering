package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchData extends com.android.dx.dex.code.VariableSizeInsn {
    private final com.android.dx.util.IntList cases;
    private final boolean packed;
    private final com.android.dx.dex.code.CodeAddress[] targets;
    private final com.android.dx.dex.code.CodeAddress user;

    public SwitchData(com.android.dx.rop.code.SourcePosition r2, com.android.dx.dex.code.CodeAddress r3, com.android.dx.util.IntList r4, com.android.dx.dex.code.CodeAddress[] r5) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r1.<init>(r2, r0)
            if (r3 == 0) goto L44
            if (r4 == 0) goto L3c
            if (r5 == 0) goto L34
            int r2 = r4.size()
            int r0 = r5.length
            if (r2 != r0) goto L2c
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r0) goto L24
            r1.user = r3
            r1.cases = r4
            r1.targets = r5
            boolean r2 = shouldPack(r4)
            r1.packed = r2
            return
        L24:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "too many cases"
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "cases / targets mismatch"
            r2.<init>(r3)
            throw r2
        L34:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "targets == null"
            r2.<init>(r3)
            throw r2
        L3c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "cases == null"
            r2.<init>(r3)
            throw r2
        L44:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "user == null"
            r2.<init>(r3)
            throw r2
    }

    private static long packedCodeSize(com.android.dx.util.IntList r5) {
            int r0 = r5.size()
            r1 = 0
            int r1 = r5.get(r1)
            long r1 = (long) r1
            int r0 = r0 + (-1)
            int r5 = r5.get(r0)
            long r3 = (long) r5
            long r3 = r3 - r1
            r0 = 1
            long r3 = r3 + r0
            r0 = 2
            long r3 = r3 * r0
            r0 = 4
            long r3 = r3 + r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L23
            goto L25
        L23:
            r3 = -1
        L25:
            return r3
    }

    private static boolean shouldPack(com.android.dx.util.IntList r7) {
            int r0 = r7.size()
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            long r0 = packedCodeSize(r7)
            long r3 = sparseCodeSize(r7)
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L22
            r5 = 5
            long r3 = r3 * r5
            r5 = 4
            long r3 = r3 / r5
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 > 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            return r2
    }

    private static long sparseCodeSize(com.android.dx.util.IntList r4) {
            int r4 = r4.size()
            long r0 = (long) r4
            r2 = 4
            long r0 = r0 * r2
            r2 = 2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            com.android.dx.dex.code.CodeAddress[] r1 = r4.targets
            int r1 = r1.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L2a
            java.lang.String r3 = "\n    "
            r0.append(r3)
            com.android.dx.util.IntList r3 = r4.cases
            int r3 = r3.get(r2)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            com.android.dx.dex.code.CodeAddress[] r3 = r4.targets
            r3 = r3[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto Lb
        L2a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
            r2 = this;
            boolean r0 = r2.packed
            if (r0 == 0) goto Lc
            com.android.dx.util.IntList r0 = r2.cases
            long r0 = packedCodeSize(r0)
        La:
            int r0 = (int) r0
            goto L13
        Lc:
            com.android.dx.util.IntList r0 = r2.cases
            long r0 = sparseCodeSize(r0)
            goto La
        L13:
            return r0
    }

    public boolean isPacked() {
            r1 = this;
            boolean r0 = r1.packed
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r7) {
            r6 = this;
            com.android.dx.dex.code.CodeAddress r7 = r6.user
            int r7 = r7.getAddress()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            com.android.dx.dex.code.CodeAddress[] r1 = r6.targets
            int r1 = r1.length
            boolean r2 = r6.packed
            if (r2 == 0) goto L17
            java.lang.String r2 = "packed"
            goto L19
        L17:
            java.lang.String r2 = "sparse"
        L19:
            r0.append(r2)
            java.lang.String r2 = "-switch-payload // for switch @ "
            r0.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r7)
            r0.append(r2)
            r2 = 0
        L29:
            if (r2 >= r1) goto L5e
            com.android.dx.dex.code.CodeAddress[] r3 = r6.targets
            r3 = r3[r2]
            int r3 = r3.getAddress()
            int r4 = r3 - r7
            java.lang.String r5 = "\n  "
            r0.append(r5)
            com.android.dx.util.IntList r5 = r6.cases
            int r5 = r5.get(r2)
            r0.append(r5)
            java.lang.String r5 = ": "
            r0.append(r5)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r3)
            r0.append(r3)
            java.lang.String r3 = " // "
            r0.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.s4(r4)
            r0.append(r3)
            int r2 = r2 + 1
            goto L29
        L5e:
            java.lang.String r7 = r0.toString()
            return r7
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r5) {
            r4 = this;
            com.android.dx.dex.code.SwitchData r5 = new com.android.dx.dex.code.SwitchData
            com.android.dx.rop.code.SourcePosition r0 = r4.getPosition()
            com.android.dx.dex.code.CodeAddress r1 = r4.user
            com.android.dx.util.IntList r2 = r4.cases
            com.android.dx.dex.code.CodeAddress[] r3 = r4.targets
            r5.<init>(r0, r1, r2, r3)
            return r5
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(com.android.dx.util.AnnotatedOutput r9) {
            r8 = this;
            com.android.dx.dex.code.CodeAddress r0 = r8.user
            int r0 = r0.getAddress()
            com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.Dops.PACKED_SWITCH
            com.android.dx.dex.code.InsnFormat r1 = r1.getFormat()
            int r1 = r1.codeSize()
            com.android.dx.dex.code.CodeAddress[] r2 = r8.targets
            int r2 = r2.length
            boolean r3 = r8.packed
            r4 = 0
            if (r3 == 0) goto L5c
            if (r2 != 0) goto L1c
            r3 = r4
            goto L22
        L1c:
            com.android.dx.util.IntList r3 = r8.cases
            int r3 = r3.get(r4)
        L22:
            if (r2 != 0) goto L26
            r2 = r4
            goto L2e
        L26:
            com.android.dx.util.IntList r5 = r8.cases
            int r2 = r2 + (-1)
            int r2 = r5.get(r2)
        L2e:
            int r2 = r2 - r3
            int r2 = r2 + 1
            r5 = 256(0x100, float:3.59E-43)
            r9.writeShort(r5)
            r9.writeShort(r2)
            r9.writeInt(r3)
            r5 = r4
        L3d:
            if (r4 >= r2) goto L84
            int r6 = r3 + r4
            com.android.dx.util.IntList r7 = r8.cases
            int r7 = r7.get(r5)
            if (r7 <= r6) goto L4b
            r6 = r1
            goto L56
        L4b:
            com.android.dx.dex.code.CodeAddress[] r6 = r8.targets
            r6 = r6[r5]
            int r6 = r6.getAddress()
            int r6 = r6 - r0
            int r5 = r5 + 1
        L56:
            r9.writeInt(r6)
            int r4 = r4 + 1
            goto L3d
        L5c:
            r1 = 512(0x200, float:7.17E-43)
            r9.writeShort(r1)
            r9.writeShort(r2)
            r1 = r4
        L65:
            if (r1 >= r2) goto L73
            com.android.dx.util.IntList r3 = r8.cases
            int r3 = r3.get(r1)
            r9.writeInt(r3)
            int r1 = r1 + 1
            goto L65
        L73:
            if (r4 >= r2) goto L84
            com.android.dx.dex.code.CodeAddress[] r1 = r8.targets
            r1 = r1[r4]
            int r1 = r1.getAddress()
            int r1 = r1 - r0
            r9.writeInt(r1)
            int r4 = r4 + 1
            goto L73
        L84:
            return
    }
}
