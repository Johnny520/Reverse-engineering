package com.android.dx.io.instructions;

import bsh.C2632;
import com.android.dex.DexException;
import com.android.dx.io.IndexType;
import com.android.dx.io.OpcodeInfo;
import com.android.dx.io.Opcodes;
import com.android.dx.util.Hex;
import java.io.EOFException;
import p144.C7546;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DecodedInstruction {
    private final InstructionCodec format;
    private final int index;
    private final IndexType indexType;
    private final long literal;
    private final int opcode;
    private final int target;

    public DecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j) {
        if (instructionCodec == null) {
            C2632.m5298("format == null");
            throw null;
        }
        if (!Opcodes.isValidShape(i)) {
            C5919.m11249("invalid opcode");
            throw null;
        }
        this.format = instructionCodec;
        this.opcode = i;
        this.index = i2;
        this.indexType = indexType;
        this.target = i3;
        this.literal = j;
    }

    public static DecodedInstruction decode(CodeInput codeInput) {
        int i = codeInput.read();
        return OpcodeInfo.getFormat(Opcodes.extractOpcodeFromUnit(i)).decode(i, codeInput);
    }

    public static DecodedInstruction[] decodeAll(short[] sArr) {
        DecodedInstruction[] decodedInstructionArr = new DecodedInstruction[sArr.length];
        ShortArrayCodeInput shortArrayCodeInput = new ShortArrayCodeInput(sArr);
        while (shortArrayCodeInput.hasMore()) {
            try {
                decodedInstructionArr[shortArrayCodeInput.cursor()] = decode(shortArrayCodeInput);
            } catch (EOFException e) {
                throw new DexException(e);
            }
        }
        return decodedInstructionArr;
    }

    public final void encode(CodeOutput codeOutput) {
        this.format.encode(this, codeOutput);
    }

    public int getA() {
        return 0;
    }

    public final short getAByte() {
        int a = getA();
        if ((a & (-256)) == 0) {
            return (short) a;
        }
        C7546.m12741(Hex.u8(a), "Register A out of range: ");
        return (short) 0;
    }

    public final short getANibble() {
        int a = getA();
        if ((a & (-16)) == 0) {
            return (short) a;
        }
        C7546.m12741(Hex.u8(a), "Register A out of range: ");
        return (short) 0;
    }

    public final short getAUnit() {
        int a = getA();
        if (((-65536) & a) == 0) {
            return (short) a;
        }
        C7546.m12741(Hex.u8(a), "Register A out of range: ");
        return (short) 0;
    }

    public int getB() {
        return 0;
    }

    public final short getBByte() {
        int b = getB();
        if ((b & (-256)) == 0) {
            return (short) b;
        }
        C7546.m12741(Hex.u8(b), "Register B out of range: ");
        return (short) 0;
    }

    public final short getBNibble() {
        int b = getB();
        if ((b & (-16)) == 0) {
            return (short) b;
        }
        C7546.m12741(Hex.u8(b), "Register B out of range: ");
        return (short) 0;
    }

    public final short getBUnit() {
        int b = getB();
        if (((-65536) & b) == 0) {
            return (short) b;
        }
        C7546.m12741(Hex.u8(b), "Register B out of range: ");
        return (short) 0;
    }

    public int getC() {
        return 0;
    }

    public final short getCByte() {
        int c = getC();
        if ((c & (-256)) == 0) {
            return (short) c;
        }
        C7546.m12741(Hex.u8(c), "Register C out of range: ");
        return (short) 0;
    }

    public final short getCNibble() {
        int c = getC();
        if ((c & (-16)) == 0) {
            return (short) c;
        }
        C7546.m12741(Hex.u8(c), "Register C out of range: ");
        return (short) 0;
    }

    public final short getCUnit() {
        int c = getC();
        if (((-65536) & c) == 0) {
            return (short) c;
        }
        C7546.m12741(Hex.u8(c), "Register C out of range: ");
        return (short) 0;
    }

    public int getD() {
        return 0;
    }

    public final short getDByte() {
        int d = getD();
        if ((d & (-256)) == 0) {
            return (short) d;
        }
        C7546.m12741(Hex.u8(d), "Register D out of range: ");
        return (short) 0;
    }

    public final short getDNibble() {
        int d = getD();
        if ((d & (-16)) == 0) {
            return (short) d;
        }
        C7546.m12741(Hex.u8(d), "Register D out of range: ");
        return (short) 0;
    }

    public final short getDUnit() {
        int d = getD();
        if (((-65536) & d) == 0) {
            return (short) d;
        }
        C7546.m12741(Hex.u8(d), "Register D out of range: ");
        return (short) 0;
    }

    public int getE() {
        return 0;
    }

    public final short getENibble() {
        int e = getE();
        if ((e & (-16)) == 0) {
            return (short) e;
        }
        C7546.m12741(Hex.u8(e), "Register E out of range: ");
        return (short) 0;
    }

    public final InstructionCodec getFormat() {
        return this.format;
    }

    public final int getIndex() {
        return this.index;
    }

    public final IndexType getIndexType() {
        return this.indexType;
    }

    public final short getIndexUnit() {
        return (short) this.index;
    }

    public final long getLiteral() {
        return this.literal;
    }

    public final int getLiteralByte() {
        long j = this.literal;
        if (j == ((byte) j)) {
            return ((int) j) & Opcodes.CONST_METHOD_TYPE;
        }
        C7546.m12741(Hex.u8(this.literal), "Literal out of range: ");
        return 0;
    }

    public final int getLiteralInt() {
        long j = this.literal;
        if (j == ((int) j)) {
            return (int) j;
        }
        C7546.m12741(Hex.u8(this.literal), "Literal out of range: ");
        return 0;
    }

    public final int getLiteralNibble() {
        long j = this.literal;
        if (j >= -8 && j <= 7) {
            return ((int) j) & 15;
        }
        C7546.m12741(Hex.u8(this.literal), "Literal out of range: ");
        return 0;
    }

    public final short getLiteralUnit() {
        long j = this.literal;
        if (j == ((short) j)) {
            return (short) j;
        }
        C7546.m12741(Hex.u8(this.literal), "Literal out of range: ");
        return (short) 0;
    }

    public final int getOpcode() {
        return this.opcode;
    }

    public final short getOpcodeUnit() {
        return (short) this.opcode;
    }

    public short getProtoIndex() {
        throw new IllegalStateException(getClass().toString());
    }

    public abstract int getRegisterCount();

    public final short getRegisterCountUnit() {
        int registerCount = getRegisterCount();
        if (((-65536) & registerCount) == 0) {
            return (short) registerCount;
        }
        C7546.m12741(Hex.u8(registerCount), "Register count out of range: ");
        return (short) 0;
    }

    public final int getTarget(int i) {
        return this.target - i;
    }

    public final int getTargetByte(int i) {
        int target = getTarget(i);
        if (target == ((byte) target)) {
            return target & Opcodes.CONST_METHOD_TYPE;
        }
        C7546.m12741(Hex.s4(target), "Target out of range: ");
        return 0;
    }

    public final short getTargetUnit(int i) {
        int target = getTarget(i);
        short s = (short) target;
        if (target == s) {
            return s;
        }
        C7546.m12741(Hex.s4(target), "Target out of range: ");
        return (short) 0;
    }

    public abstract DecodedInstruction withIndex(int i);

    public DecodedInstruction withProtoIndex(int i, int i2) {
        throw new IllegalStateException(getClass().toString());
    }

    public final int getTarget() {
        return this.target;
    }
}
