package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecodedInstruction {
    private final com.android.dx.io.instructions.InstructionCodec format;
    private final int index;
    private final com.android.dx.io.IndexType indexType;
    private final long literal;
    private final int opcode;
    private final int target;

    public DecodedInstruction(com.android.dx.io.instructions.InstructionCodec r2, int r3, int r4, com.android.dx.io.IndexType r5, int r6, long r7) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L20
            boolean r0 = com.android.dx.io.Opcodes.isValidShape(r3)
            if (r0 == 0) goto L18
            r1.format = r2
            r1.opcode = r3
            r1.index = r4
            r1.indexType = r5
            r1.target = r6
            r1.literal = r7
            return
        L18:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "invalid opcode"
            r2.<init>(r3)
            throw r2
        L20:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "format == null"
            r2.<init>(r3)
            throw r2
    }

    public static com.android.dx.io.instructions.DecodedInstruction decode(com.android.dx.io.instructions.CodeInput r2) throws java.io.EOFException {
            int r0 = r2.read()
            int r1 = com.android.dx.io.Opcodes.extractOpcodeFromUnit(r0)
            com.android.dx.io.instructions.InstructionCodec r1 = com.android.dx.io.OpcodeInfo.getFormat(r1)
            com.android.dx.io.instructions.DecodedInstruction r2 = r1.decode(r0, r2)
            return r2
    }

    public static com.android.dx.io.instructions.DecodedInstruction[] decodeAll(short[] r3) {
            int r0 = r3.length
            com.android.dx.io.instructions.DecodedInstruction[] r0 = new com.android.dx.io.instructions.DecodedInstruction[r0]
            com.android.dx.io.instructions.ShortArrayCodeInput r1 = new com.android.dx.io.instructions.ShortArrayCodeInput
            r1.<init>(r3)
        L8:
            boolean r3 = r1.hasMore()     // Catch: java.io.EOFException -> L19
            if (r3 == 0) goto L1b
            int r3 = r1.cursor()     // Catch: java.io.EOFException -> L19
            com.android.dx.io.instructions.DecodedInstruction r2 = decode(r1)     // Catch: java.io.EOFException -> L19
            r0[r3] = r2     // Catch: java.io.EOFException -> L19
            goto L8
        L19:
            r3 = move-exception
            goto L1c
        L1b:
            return r0
        L1c:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            r0.<init>(r3)
            throw r0
    }

    public final void encode(com.android.dx.io.instructions.CodeOutput r2) {
            r1 = this;
            com.android.dx.io.instructions.InstructionCodec r0 = r1.format
            r0.encode(r1, r2)
            return
    }

    public int getA() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final short getAByte() {
            r5 = this;
            int r0 = r5.getA()
            r1 = r0 & (-256(0xffffffffffffff00, float:NaN))
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register A out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getANibble() {
            r5 = this;
            int r0 = r5.getA()
            r1 = r0 & (-16)
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register A out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getAUnit() {
            r5 = this;
            int r0 = r5.getA()
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto Lb
            short r0 = (short) r0
            return r0
        Lb:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register A out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public int getB() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final short getBByte() {
            r5 = this;
            int r0 = r5.getB()
            r1 = r0 & (-256(0xffffffffffffff00, float:NaN))
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register B out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getBNibble() {
            r5 = this;
            int r0 = r5.getB()
            r1 = r0 & (-16)
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register B out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getBUnit() {
            r5 = this;
            int r0 = r5.getB()
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto Lb
            short r0 = (short) r0
            return r0
        Lb:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register B out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public int getC() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final short getCByte() {
            r5 = this;
            int r0 = r5.getC()
            r1 = r0 & (-256(0xffffffffffffff00, float:NaN))
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register C out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getCNibble() {
            r5 = this;
            int r0 = r5.getC()
            r1 = r0 & (-16)
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register C out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getCUnit() {
            r5 = this;
            int r0 = r5.getC()
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto Lb
            short r0 = (short) r0
            return r0
        Lb:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register C out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public int getD() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final short getDByte() {
            r5 = this;
            int r0 = r5.getD()
            r1 = r0 & (-256(0xffffffffffffff00, float:NaN))
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register D out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getDNibble() {
            r5 = this;
            int r0 = r5.getD()
            r1 = r0 & (-16)
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register D out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final short getDUnit() {
            r5 = this;
            int r0 = r5.getD()
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto Lb
            short r0 = (short) r0
            return r0
        Lb:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register D out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public int getE() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final short getENibble() {
            r5 = this;
            int r0 = r5.getE()
            r1 = r0 & (-16)
            if (r1 != 0) goto La
            short r0 = (short) r0
            return r0
        La:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register E out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final com.android.dx.io.instructions.InstructionCodec getFormat() {
            r1 = this;
            com.android.dx.io.instructions.InstructionCodec r0 = r1.format
            return r0
    }

    public final int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public final com.android.dx.io.IndexType getIndexType() {
            r1 = this;
            com.android.dx.io.IndexType r0 = r1.indexType
            return r0
    }

    public final short getIndexUnit() {
            r1 = this;
            int r0 = r1.index
            short r0 = (short) r0
            return r0
    }

    public final long getLiteral() {
            r2 = this;
            long r0 = r2.literal
            return r0
    }

    public final int getLiteralByte() {
            r4 = this;
            long r0 = r4.literal
            int r2 = (int) r0
            byte r2 = (byte) r2
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Ld
            int r0 = (int) r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        Ld:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Literal out of range: "
            r1.append(r2)
            long r2 = r4.literal
            java.lang.String r2 = com.android.dx.util.Hex.u8(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final int getLiteralInt() {
            r4 = this;
            long r0 = r4.literal
            int r2 = (int) r0
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto La
            int r0 = (int) r0
            return r0
        La:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Literal out of range: "
            r1.append(r2)
            long r2 = r4.literal
            java.lang.String r2 = com.android.dx.util.Hex.u8(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final int getLiteralNibble() {
            r4 = this;
            long r0 = r4.literal
            r2 = -8
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L12
            r2 = 7
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L12
            int r0 = (int) r0
            r0 = r0 & 15
            return r0
        L12:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Literal out of range: "
            r1.append(r2)
            long r2 = r4.literal
            java.lang.String r2 = com.android.dx.util.Hex.u8(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final short getLiteralUnit() {
            r4 = this;
            long r0 = r4.literal
            int r2 = (int) r0
            short r2 = (short) r2
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc
            int r0 = (int) r0
            short r0 = (short) r0
            return r0
        Lc:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Literal out of range: "
            r1.append(r2)
            long r2 = r4.literal
            java.lang.String r2 = com.android.dx.util.Hex.u8(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final int getOpcode() {
            r1 = this;
            int r0 = r1.opcode
            return r0
    }

    public final short getOpcodeUnit() {
            r1 = this;
            int r0 = r1.opcode
            short r0 = (short) r0
            return r0
    }

    public short getProtoIndex() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public abstract int getRegisterCount();

    public final short getRegisterCountUnit() {
            r5 = this;
            int r0 = r5.getRegisterCount()
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r0
            if (r1 != 0) goto Lb
            short r0 = (short) r0
            return r0
        Lb:
            com.android.dex.DexException r1 = new com.android.dex.DexException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Register count out of range: "
            r2.append(r3)
            long r3 = (long) r0
            java.lang.String r0 = com.android.dx.util.Hex.u8(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public final int getTarget() {
            r1 = this;
            int r0 = r1.target
            return r0
    }

    public final int getTarget(int r2) {
            r1 = this;
            int r0 = r1.target
            int r0 = r0 - r2
            return r0
    }

    public final int getTargetByte(int r4) {
            r3 = this;
            int r4 = r3.getTarget(r4)
            byte r0 = (byte) r4
            if (r4 != r0) goto La
            r4 = r4 & 255(0xff, float:3.57E-43)
            return r4
        La:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Target out of range: "
            r1.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.s4(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final short getTargetUnit(int r4) {
            r3 = this;
            int r4 = r3.getTarget(r4)
            short r0 = (short) r4
            if (r4 != r0) goto L8
            return r0
        L8:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Target out of range: "
            r1.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.s4(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public abstract com.android.dx.io.instructions.DecodedInstruction withIndex(int r1);

    public com.android.dx.io.instructions.DecodedInstruction withProtoIndex(int r1, int r2) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
