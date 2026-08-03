package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class InsnFormat {
    public static final boolean ALLOW_EXTENDED_OPCODES = true;

    public InsnFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int argIndex(com.android.dx.dex.code.DalvInsn r1) {
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstInteger r1 = (com.android.dx.rop.cst.CstInteger) r1
            int r1 = r1.getValue()
            if (r1 < 0) goto Lf
            return r1
        Lf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bogus insn"
            r1.<init>(r0)
            throw r1
    }

    public static java.lang.String branchComment(com.android.dx.dex.code.DalvInsn r1) {
            com.android.dx.dex.code.TargetInsn r1 = (com.android.dx.dex.code.TargetInsn) r1
            int r1 = r1.getTargetOffset()
            short r0 = (short) r1
            if (r1 != r0) goto Le
            java.lang.String r1 = com.android.dx.util.Hex.s2(r1)
            goto L12
        Le:
            java.lang.String r1 = com.android.dx.util.Hex.s4(r1)
        L12:
            return r1
    }

    public static java.lang.String branchString(com.android.dx.dex.code.DalvInsn r1) {
            com.android.dx.dex.code.TargetInsn r1 = (com.android.dx.dex.code.TargetInsn) r1
            int r1 = r1.getTargetAddress()
            char r0 = (char) r1
            if (r1 != r0) goto Le
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            goto L12
        Le:
            java.lang.String r1 = com.android.dx.util.Hex.u4(r1)
        L12:
            return r1
    }

    public static short codeUnit(int r1, int r2) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L15
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto Ld
            int r2 = r2 << 8
            r1 = r1 | r2
            short r1 = (short) r1
            return r1
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "high out of range 0..255"
            r1.<init>(r2)
            throw r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "low out of range 0..255"
            r1.<init>(r2)
            throw r1
    }

    public static short codeUnit(int r1, int r2, int r3, int r4) {
            r0 = r1 & 15
            if (r0 != r1) goto L33
            r0 = r2 & 15
            if (r0 != r2) goto L2b
            r0 = r3 & 15
            if (r0 != r3) goto L23
            r0 = r4 & 15
            if (r0 != r4) goto L1b
            int r2 = r2 << 4
            r1 = r1 | r2
            int r2 = r3 << 8
            r1 = r1 | r2
            int r2 = r4 << 12
            r1 = r1 | r2
            short r1 = (short) r1
            return r1
        L1b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "n3 out of range 0..15"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "n2 out of range 0..15"
            r1.<init>(r2)
            throw r1
        L2b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "n1 out of range 0..15"
            r1.<init>(r2)
            throw r1
        L33:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "n0 out of range 0..15"
            r1.<init>(r2)
            throw r1
    }

    public static boolean isRegListSequential(com.android.dx.rop.code.RegisterSpecList r7) {
            int r0 = r7.size()
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r7.get(r1)
            int r3 = r3.getReg()
            r4 = r1
        L13:
            if (r4 >= r0) goto L28
            com.android.dx.rop.code.RegisterSpec r5 = r7.get(r4)
            int r6 = r5.getReg()
            if (r6 == r3) goto L20
            return r1
        L20:
            int r5 = r5.getCategory()
            int r3 = r3 + r5
            int r4 = r4 + 1
            goto L13
        L28:
            return r2
    }

    public static java.lang.String literalBitsComment(com.android.dx.rop.cst.CstLiteralBits r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            boolean r1 = r3 instanceof com.android.dx.rop.cst.CstLiteral64
            if (r1 == 0) goto L17
            com.android.dx.rop.cst.CstLiteral64 r3 = (com.android.dx.rop.cst.CstLiteral64) r3
            long r1 = r3.getLongBits()
            goto L1c
        L17:
            int r3 = r3.getIntBits()
            long r1 = (long) r3
        L1c:
            r3 = 4
            if (r4 == r3) goto L5a
            r3 = 8
            if (r4 == r3) goto L51
            r3 = 16
            if (r4 == r3) goto L48
            r3 = 32
            if (r4 == r3) goto L3f
            r3 = 64
            if (r4 != r3) goto L37
            java.lang.String r3 = com.android.dx.util.Hex.u8(r1)
            r0.append(r3)
            goto L62
        L37:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "shouldn't happen"
            r3.<init>(r4)
            throw r3
        L3f:
            int r3 = (int) r1
            java.lang.String r3 = com.android.dx.util.Hex.u4(r3)
            r0.append(r3)
            goto L62
        L48:
            int r3 = (int) r1
            java.lang.String r3 = com.android.dx.util.Hex.u2(r3)
            r0.append(r3)
            goto L62
        L51:
            int r3 = (int) r1
            java.lang.String r3 = com.android.dx.util.Hex.u1(r3)
            r0.append(r3)
            goto L62
        L5a:
            int r3 = (int) r1
            java.lang.String r3 = com.android.dx.util.Hex.uNibble(r3)
            r0.append(r3)
        L62:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String literalBitsString(com.android.dx.rop.cst.CstLiteralBits r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            r1 = 35
            r0.append(r1)
            boolean r1 = r2 instanceof com.android.dx.rop.cst.CstKnownNull
            if (r1 == 0) goto L16
            java.lang.String r2 = "null"
            r0.append(r2)
            goto L29
        L16:
            java.lang.String r1 = r2.typeName()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
        L29:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static int makeByte(int r1, int r2) {
            r0 = r1 & 15
            if (r0 != r1) goto L14
            r0 = r2 & 15
            if (r0 != r2) goto Lc
            int r2 = r2 << 4
            r1 = r1 | r2
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "high out of range 0..15"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "low out of range 0..15"
            r1.<init>(r2)
            throw r1
    }

    public static short opcodeUnit(com.android.dx.dex.code.DalvInsn r1) {
            com.android.dx.dex.code.Dop r1 = r1.getOpcode()
            int r1 = r1.getOpcode()
            r0 = 256(0x100, float:3.59E-43)
            if (r1 < r0) goto L13
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L13
            short r1 = (short) r1
            return r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "opcode out of range 0..65535"
            r1.<init>(r0)
            throw r1
    }

    public static short opcodeUnit(com.android.dx.dex.code.DalvInsn r1, int r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L1d
            com.android.dx.dex.code.Dop r1 = r1.getOpcode()
            int r1 = r1.getOpcode()
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L15
            int r2 = r2 << 8
            r1 = r1 | r2
            short r1 = (short) r1
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "opcode out of range 0..255"
            r1.<init>(r2)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "arg out of range 0..255"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String regListString(com.android.dx.rop.code.RegisterSpecList r4) {
            int r0 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 5
            int r2 = r2 + 2
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            r2 = 0
        L13:
            if (r2 >= r0) goto L2a
            if (r2 == 0) goto L1c
            java.lang.String r3 = ", "
            r1.append(r3)
        L1c:
            com.android.dx.rop.code.RegisterSpec r3 = r4.get(r2)
            java.lang.String r3 = r3.regString()
            r1.append(r3)
            int r2 = r2 + 1
            goto L13
        L2a:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static java.lang.String regRangeString(com.android.dx.rop.code.RegisterSpecList r6) {
            int r0 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 30
            r1.<init>(r2)
            java.lang.String r2 = "{"
            r1.append(r2)
            if (r0 == 0) goto L49
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3e
            int r0 = r0 - r3
            com.android.dx.rop.code.RegisterSpec r0 = r6.get(r0)
            int r4 = r0.getCategory()
            r5 = 2
            if (r4 != r5) goto L26
            com.android.dx.rop.code.RegisterSpec r0 = r0.withOffset(r3)
        L26:
            com.android.dx.rop.code.RegisterSpec r6 = r6.get(r2)
            java.lang.String r6 = r6.regString()
            r1.append(r6)
            java.lang.String r6 = ".."
            r1.append(r6)
            java.lang.String r6 = r0.regString()
            r1.append(r6)
            goto L49
        L3e:
            com.android.dx.rop.code.RegisterSpec r6 = r6.get(r2)
            java.lang.String r6 = r6.regString()
            r1.append(r6)
        L49:
            java.lang.String r6 = "}"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
    }

    public static boolean signedFitsInByte(int r1) {
            byte r0 = (byte) r1
            if (r0 != r1) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    public static boolean signedFitsInNibble(int r1) {
            r0 = -8
            if (r1 < r0) goto L8
            r0 = 7
            if (r1 > r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static boolean signedFitsInShort(int r1) {
            short r0 = (short) r1
            if (r0 != r1) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    public static boolean unsignedFitsInByte(int r1) {
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean unsignedFitsInNibble(int r1) {
            r0 = r1 & 15
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static boolean unsignedFitsInShort(int r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static void write(com.android.dx.util.AnnotatedOutput r0, short r1) {
            r0.writeShort(r1)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r1, short r2, int r3) {
            short r0 = (short) r3
            int r3 = r3 >> 16
            short r3 = (short) r3
            write(r1, r2, r0, r3)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r1, short r2, int r3, short r4) {
            short r0 = (short) r3
            int r3 = r3 >> 16
            short r3 = (short) r3
            write(r1, r2, r0, r3, r4)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r6, short r7, int r8, short r9, short r10) {
            short r2 = (short) r8
            int r8 = r8 >> 16
            short r3 = (short) r8
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            write(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r7, short r8, long r9) {
            int r0 = (int) r9
            short r3 = (short) r0
            r0 = 16
            long r0 = r9 >> r0
            int r0 = (int) r0
            short r4 = (short) r0
            r0 = 32
            long r0 = r9 >> r0
            int r0 = (int) r0
            short r5 = (short) r0
            r0 = 48
            long r9 = r9 >> r0
            int r9 = (int) r9
            short r6 = (short) r9
            r1 = r7
            r2 = r8
            write(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r0, short r1, short r2) {
            r0.writeShort(r1)
            r0.writeShort(r2)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r0, short r1, short r2, short r3) {
            r0.writeShort(r1)
            r0.writeShort(r2)
            r0.writeShort(r3)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r0, short r1, short r2, short r3, short r4) {
            r0.writeShort(r1)
            r0.writeShort(r2)
            r0.writeShort(r3)
            r0.writeShort(r4)
            return
    }

    public static void write(com.android.dx.util.AnnotatedOutput r0, short r1, short r2, short r3, short r4, short r5) {
            r0.writeShort(r1)
            r0.writeShort(r2)
            r0.writeShort(r3)
            r0.writeShort(r4)
            r0.writeShort(r5)
            return
    }

    public boolean branchFits(com.android.dx.dex.code.TargetInsn r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract int codeSize();

    public java.util.BitSet compatibleRegs(com.android.dx.dex.code.DalvInsn r1) {
            r0 = this;
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            return r1
    }

    public abstract java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r1);

    public abstract java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2);

    public abstract boolean isCompatible(com.android.dx.dex.code.DalvInsn r1);

    public final java.lang.String listingString(com.android.dx.dex.code.DalvInsn r4, boolean r5) {
            r3 = this;
            com.android.dx.dex.code.Dop r0 = r4.getOpcode()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r3.insnArgString(r4)
            java.lang.String r4 = r3.insnCommentString(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r2 = 100
            r5.<init>(r2)
            r5.append(r0)
            int r0 = r1.length()
            if (r0 == 0) goto L28
            r0 = 32
            r5.append(r0)
            r5.append(r1)
        L28:
            int r0 = r4.length()
            if (r0 == 0) goto L36
            java.lang.String r0 = " // "
            r5.append(r0)
            r5.append(r4)
        L36:
            java.lang.String r4 = r5.toString()
            return r4
    }

    public abstract void writeTo(com.android.dx.util.AnnotatedOutput r1, com.android.dx.dex.code.DalvInsn r2);
}
