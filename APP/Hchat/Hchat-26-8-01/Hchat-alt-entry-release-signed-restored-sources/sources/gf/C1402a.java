package gf;

import ac.C0058k;
import af.C0081d;
import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import java.nio.ByteBuffer;
import p005a5.C0016a;
import p068eh.AbstractC0921a;
import p113hf.C1710a;
import sc.InterfaceC3952a;
import tc.C4144a;

/* JADX INFO: renamed from: gf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1402a {

    /* JADX INFO: renamed from: a */
    public final C0016a f4659a;

    /* JADX INFO: renamed from: b */
    public final C0058k f4660b;

    /* JADX INFO: renamed from: c */
    public final C0058k f4661c;

    /* JADX INFO: renamed from: d */
    public C1404c f4662d;

    /* JADX INFO: renamed from: e */
    public boolean f4663e;

    /* JADX INFO: renamed from: f */
    public int f4664f;

    /* JADX INFO: renamed from: g */
    public int f4665g;

    /* JADX INFO: renamed from: h */
    public int f4666h;

    /* JADX INFO: renamed from: i */
    public int[] f4667i = new int[5];

    /* JADX INFO: renamed from: j */
    public int f4668j;

    /* JADX INFO: renamed from: k */
    public long f4669k;

    /* JADX INFO: renamed from: l */
    public int f4670l;

    /* JADX INFO: renamed from: m */
    public int f4671m;

    /* JADX INFO: renamed from: n */
    public InterfaceC3952a f4672n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1402a(C0016a c0016a, C0058k c0058k) {
        this.f4659a = c0016a;
        this.f4660b = c0058k;
        this.f4661c = c0058k.m356g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x00db */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v19, types: [long[]] */
    /* JADX INFO: renamed from: a */
    public final void m3806a() {
        short[] sArr;
        C1404c c1404c = this.f4662d;
        if (c1404c == null || this.f4663e) {
            return;
        }
        C1403b c1403b = c1404c.f4709c;
        int i9 = this.f4664f;
        C0058k c0058k = (C0058k) this.f4659a.f56i;
        switch (c1403b.f4704c) {
            case 0:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4669k = ((ByteBuffer) c0058k.f177i).getShort();
                break;
            case 1:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4669k = ((long) ((ByteBuffer) c0058k.f177i).getShort()) << ((i9 & 255) == 21 ? (char) 16 : '0');
                break;
            case 2:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4671m = c0058k.m346L();
                break;
            case 3:
                int[] iArr = this.f4667i;
                iArr[0] = C1403b.m3808a(i9);
                int iM346L = c0058k.m346L();
                iArr[1] = iM346L & 255;
                iArr[2] = C1403b.m3808a(iM346L);
                break;
            case 4:
                int[] iArr2 = this.f4667i;
                iArr2[0] = C1403b.m3808a(i9);
                iArr2[1] = c0058k.m346L() & 255;
                this.f4669k = (byte) (r1 >> 8);
                break;
            case 5:
                int[] iArr3 = this.f4667i;
                iArr3[0] = C1403b.m3810c(i9);
                iArr3[1] = C1403b.m3811d(i9);
                this.f4670l = ((ByteBuffer) c0058k.f177i).getShort() + this.f4666h;
                break;
            case 6:
                int[] iArr4 = this.f4667i;
                iArr4[0] = C1403b.m3810c(i9);
                iArr4[1] = C1403b.m3811d(i9);
                this.f4669k = ((ByteBuffer) c0058k.f177i).getShort();
                break;
            case 7:
                int[] iArr5 = this.f4667i;
                iArr5[0] = C1403b.m3810c(i9);
                iArr5[1] = C1403b.m3811d(i9);
                this.f4671m = c0058k.m346L();
                this.f4669k = 0L;
                break;
            case 8:
                this.f4670l = ((ByteBuffer) c0058k.f177i).getInt() + this.f4666h;
                break;
            case 9:
                int[] iArr6 = this.f4667i;
                iArr6[0] = c0058k.m346L();
                iArr6[1] = c0058k.m346L();
                break;
            case 10:
                break;
            case 11:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4669k = ((ByteBuffer) c0058k.f177i).getInt();
                break;
            case 12:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4670l = ((ByteBuffer) c0058k.f177i).getInt() + this.f4666h;
                break;
            case 13:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4671m = ((ByteBuffer) c0058k.f177i).getInt();
                break;
            case 14:
                C1403b.m3812e(this, i9, c0058k);
                break;
            case 15:
                C1403b.m3813f(this, i9, c0058k);
                break;
            case 16:
                C1403b.m3812e(this, i9, c0058k);
                this.f4670l = c0058k.m346L();
                break;
            case 17:
                C1403b.m3813f(this, i9, c0058k);
                this.f4670l = c0058k.m346L();
                break;
            case 18:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4669k = ((ByteBuffer) c0058k.f177i).getLong();
                break;
            case 19:
                int iM346L2 = c0058k.m346L();
                ByteBuffer byteBuffer = (ByteBuffer) c0058k.f177i;
                int i10 = byteBuffer.getInt();
                int[] iArr7 = new int[iM346L2];
                int[] iArr8 = new int[iM346L2];
                for (int i11 = 0; i11 < iM346L2; i11++) {
                    iArr8[i11] = byteBuffer.getInt();
                    iArr7[i11] = i10 + i11;
                }
                this.f4672n = new C4144a(iM346L2, iArr7, iArr8);
                this.f4665g = (iM346L2 * 2) + 4;
                break;
            case 20:
                int iM346L3 = c0058k.m346L();
                ByteBuffer byteBuffer2 = (ByteBuffer) c0058k.f177i;
                int[] iArr9 = new int[iM346L3];
                for (int i12 = 0; i12 < iM346L3; i12++) {
                    iArr9[i12] = byteBuffer2.getInt();
                }
                int[] iArr10 = new int[iM346L3];
                for (int i13 = 0; i13 < iM346L3; i13++) {
                    iArr10[i13] = byteBuffer2.getInt();
                }
                this.f4672n = new C4144a(iM346L3, iArr9, iArr10);
                this.f4665g = (iM346L3 * 4) + 2;
                break;
            case 21:
                int[] iArr11 = this.f4667i;
                iArr11[0] = C1403b.m3810c(i9);
                iArr11[1] = C1403b.m3811d(i9);
                break;
            case 22:
                int iM346L4 = c0058k.m346L();
                ByteBuffer byteBuffer3 = (ByteBuffer) c0058k.f177i;
                int i14 = byteBuffer3.getInt();
                int i15 = 0;
                if (iM346L4 == 0) {
                    sArr = new byte[0];
                } else if (iM346L4 == 1) {
                    byte[] bArr = new byte[i14];
                    byteBuffer3.get(bArr);
                    if (i14 % 2 != 0) {
                        c0058k.m345K();
                    }
                    sArr = bArr;
                } else if (iM346L4 == 2) {
                    sArr = new short[i14];
                    while (i15 < i14) {
                        sArr[i15] = byteBuffer3.getShort();
                        i15++;
                    }
                } else if (iM346L4 == 4) {
                    sArr = new int[i14];
                    while (i15 < i14) {
                        sArr[i15] = byteBuffer3.getInt();
                        i15++;
                    }
                } else {
                    if (iM346L4 != 8) {
                        throw new C0081d(AbstractC0921a.m2249l(iM346L4, "Unexpected element size in FILL_ARRAY_DATA_PAYLOAD: "));
                    }
                    sArr = new long[i14];
                    while (i15 < i14) {
                        sArr[i15] = byteBuffer3.getLong();
                        i15++;
                    }
                }
                this.f4665g = (((i14 * iM346L4) + 1) / 2) + 4;
                this.f4672n = new C1710a(i14, iM346L4, sArr);
                break;
            case 23:
                this.f4667i[0] = C1403b.m3810c(i9);
                this.f4669k = (((i9 >> 12) & 15) << 28) >> 28;
                break;
            case 24:
                this.f4667i[0] = C1403b.m3808a(i9);
                break;
            case 25:
                this.f4670l = this.f4666h + ((byte) (i9 >> 8));
                break;
            case 26:
                this.f4670l = ((ByteBuffer) c0058k.f177i).getShort() + this.f4666h;
                break;
            case 27:
                int[] iArr12 = this.f4667i;
                iArr12[0] = C1403b.m3808a(i9);
                iArr12[1] = c0058k.m346L();
                break;
            default:
                this.f4667i[0] = C1403b.m3808a(i9);
                this.f4670l = ((ByteBuffer) c0058k.f177i).getShort() + this.f4666h;
                break;
        }
        this.f4663e = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m3807b() {
        return this.f4660b.m373y(this.f4671m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("0x%04X", Integer.valueOf(this.f4666h)));
        sb2.append(": ");
        C1404c c1404c = this.f4662d;
        switch (c1404c == null ? 1 : c1404c.f4708b) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "NOP";
                break;
            case 3:
                str = "ADD_DOUBLE";
                break;
            case 4:
                str = "ADD_FLOAT";
                break;
            case 5:
                str = "ADD_INT";
                break;
            case 6:
                str = "ADD_INT_LIT";
                break;
            case 7:
                str = "ADD_LONG";
                break;
            case 8:
                str = "AND_INT";
                break;
            case 9:
                str = "AND_INT_LIT";
                break;
            case 10:
                str = "AND_LONG";
                break;
            case 11:
                str = "AGET";
                break;
            case 12:
                str = "AGET_BOOLEAN";
                break;
            case 13:
                str = "AGET_BYTE";
                break;
            case 14:
                str = "AGET_BYTE_BOOLEAN";
                break;
            case 15:
                str = "AGET_CHAR";
                break;
            case 16:
                str = "AGET_OBJECT";
                break;
            case 17:
                str = "AGET_SHORT";
                break;
            case 18:
                str = "AGET_WIDE";
                break;
            case 19:
                str = "APUT";
                break;
            case 20:
                str = "APUT_BOOLEAN";
                break;
            case 21:
                str = "APUT_BYTE";
                break;
            case 22:
                str = "APUT_BYTE_BOOLEAN";
                break;
            case 23:
                str = "APUT_CHAR";
                break;
            case 24:
                str = "APUT_OBJECT";
                break;
            case 25:
                str = "APUT_SHORT";
                break;
            case 26:
                str = "APUT_WIDE";
                break;
            case 27:
                str = "ARITH";
                break;
            case 28:
                str = "ARRAY_LENGTH";
                break;
            case 29:
                str = "CAST";
                break;
            case 30:
                str = "CHECK_CAST";
                break;
            case 31:
                str = "CMPG_DOUBLE";
                break;
            case 32:
                str = "CMPG_FLOAT";
                break;
            case 33:
                str = "CMPL_DOUBLE";
                break;
            case 34:
                str = "CMPL_FLOAT";
                break;
            case 35:
                str = "CMP_LONG";
                break;
            case 36:
                str = "CONST";
                break;
            case 37:
                str = "CONST_CLASS";
                break;
            case 38:
                str = "CONST_STRING";
                break;
            case 39:
                str = "CONST_WIDE";
                break;
            case 40:
                str = "DIV_DOUBLE";
                break;
            case 41:
                str = "DIV_FLOAT";
                break;
            case 42:
                str = "DIV_INT";
                break;
            case 43:
                str = "DIV_INT_LIT";
                break;
            case 44:
                str = "DIV_LONG";
                break;
            case ParserConstants.PROTECTED /* 45 */:
                str = "DOUBLE_TO_FLOAT";
                break;
            case 46:
                str = "DOUBLE_TO_INT";
                break;
            case 47:
                str = "DOUBLE_TO_LONG";
                break;
            case 48:
                str = "FLOAT_TO_DOUBLE";
                break;
            case 49:
                str = "FLOAT_TO_INT";
                break;
            case 50:
                str = "FLOAT_TO_LONG";
                break;
            case 51:
                str = "GOTO";
                break;
            case 52:
                str = "IF";
                break;
            case 53:
                str = "IF_EQ";
                break;
            case 54:
                str = "IF_EQZ";
                break;
            case 55:
                str = "IF_GE";
                break;
            case 56:
                str = "IF_GEZ";
                break;
            case 57:
                str = "IF_GT";
                break;
            case 58:
                str = "IF_GTZ";
                break;
            case ParserConstants.VOLATILE /* 59 */:
                str = "IF_LE";
                break;
            case ParserConstants.WHEN /* 60 */:
                str = "IF_LEZ";
                break;
            case ParserConstants.WHILE /* 61 */:
                str = "IF_LT";
                break;
            case ParserConstants.INTEGER_LITERAL /* 62 */:
                str = "IF_LTZ";
                break;
            case ParserConstants.DECIMAL_LITERAL /* 63 */:
                str = "IF_NE";
                break;
            case 64:
                str = "IF_NEZ";
                break;
            case 65:
                str = "INSTANCE_OF";
                break;
            case 66:
                str = "INT_TO_BYTE";
                break;
            case 67:
                str = "INT_TO_CHAR";
                break;
            case 68:
                str = "INT_TO_DOUBLE";
                break;
            case 69:
                str = "INT_TO_FLOAT";
                break;
            case 70:
                str = "INT_TO_LONG";
                break;
            case 71:
                str = "INT_TO_SHORT";
                break;
            case 72:
                str = "INVOKE_DIRECT";
                break;
            case 73:
                str = "INVOKE_DIRECT_RANGE";
                break;
            case 74:
                str = "INVOKE_INTERFACE";
                break;
            case 75:
                str = "INVOKE_INTERFACE_RANGE";
                break;
            case ParserConstants.LPAREN /* 76 */:
                str = "INVOKE_STATIC";
                break;
            case ParserConstants.RPAREN /* 77 */:
                str = "INVOKE_STATIC_RANGE";
                break;
            case ParserConstants.LBRACE /* 78 */:
                str = "INVOKE_SUPER";
                break;
            case 79:
                str = "INVOKE_SUPER_RANGE";
                break;
            case 80:
                str = "INVOKE_VIRTUAL";
                break;
            case 81:
                str = "INVOKE_VIRTUAL_RANGE";
                break;
            case 82:
                str = "INVOKE_SPECIAL";
                break;
            case 83:
                str = "IGET";
                break;
            case 84:
                str = "IPUT";
                break;
            case 85:
                str = "SGET";
                break;
            case 86:
                str = "SPUT";
                break;
            case 87:
                str = "LONG_TO_DOUBLE";
                break;
            case 88:
                str = "LONG_TO_FLOAT";
                break;
            case 89:
                str = "LONG_TO_INT";
                break;
            case 90:
                str = "MONITOR_ENTER";
                break;
            case 91:
                str = "MONITOR_EXIT";
                break;
            case 92:
                str = "MOVE";
                break;
            case 93:
                str = "MOVE_MULTI";
                break;
            case 94:
                str = "MOVE_EXCEPTION";
                break;
            case 95:
                str = "MOVE_OBJECT";
                break;
            case 96:
                str = "MOVE_RESULT";
                break;
            case 97:
                str = "MOVE_WIDE";
                break;
            case 98:
                str = "MUL_DOUBLE";
                break;
            case 99:
                str = "MUL_FLOAT";
                break;
            case 100:
                str = "MUL_INT";
                break;
            case 101:
                str = "MUL_INT_LIT";
                break;
            case 102:
                str = "MUL_LONG";
                break;
            case 103:
                str = "NEG";
                break;
            case 104:
                str = "NEG_DOUBLE";
                break;
            case 105:
                str = "NEG_FLOAT";
                break;
            case 106:
                str = "NEG_INT";
                break;
            case 107:
                str = "NEG_LONG";
                break;
            case 108:
                str = "NEW_INSTANCE";
                break;
            case 109:
                str = "NOT_INT";
                break;
            case 110:
                str = "NOT_LONG";
                break;
            case 111:
                str = "OR_INT";
                break;
            case 112:
                str = "OR_INT_LIT";
                break;
            case 113:
                str = "OR_LONG";
                break;
            case 114:
                str = "REM_DOUBLE";
                break;
            case 115:
                str = "REM_FLOAT";
                break;
            case 116:
                str = "REM_INT";
                break;
            case 117:
                str = "REM_INT_LIT";
                break;
            case 118:
                str = "REM_LONG";
                break;
            case 119:
                str = "RETURN";
                break;
            case 120:
                str = "RETURN_VOID";
                break;
            case 121:
                str = "RSUB_INT";
                break;
            case 122:
                str = "SHL_INT";
                break;
            case 123:
                str = "SHL_INT_LIT";
                break;
            case 124:
                str = "SHL_LONG";
                break;
            case 125:
                str = "SHR_INT";
                break;
            case 126:
                str = "SHR_INT_LIT";
                break;
            case 127:
                str = "SHR_LONG";
                break;
            case 128:
                str = "SUB_DOUBLE";
                break;
            case 129:
                str = "SUB_FLOAT";
                break;
            case 130:
                str = "SUB_INT";
                break;
            case 131:
                str = "SUB_LONG";
                break;
            case 132:
                str = "THROW";
                break;
            case 133:
                str = "USHR_INT";
                break;
            case 134:
                str = "USHR_INT_LIT";
                break;
            case 135:
                str = "USHR_LONG";
                break;
            case 136:
                str = "XOR_INT";
                break;
            case 137:
                str = "XOR_INT_LIT";
                break;
            case 138:
                str = "XOR_LONG";
                break;
            case 139:
                str = "NEW_ARRAY";
                break;
            case 140:
                str = "FILLED_NEW_ARRAY";
                break;
            case 141:
                str = "FILLED_NEW_ARRAY_RANGE";
                break;
            case 142:
                str = "FILL_ARRAY_DATA";
                break;
            case 143:
                str = "FILL_ARRAY_DATA_PAYLOAD";
                break;
            case 144:
                str = "PACKED_SWITCH";
                break;
            case 145:
                str = "PACKED_SWITCH_PAYLOAD";
                break;
            case 146:
                str = "SPARSE_SWITCH";
                break;
            case 147:
                str = "SPARSE_SWITCH_PAYLOAD";
                break;
            case 148:
                str = "INVOKE_POLYMORPHIC";
                break;
            case 149:
                str = "INVOKE_POLYMORPHIC_RANGE";
                break;
            case 150:
                str = "INVOKE_CUSTOM";
                break;
            case 151:
                str = "INVOKE_CUSTOM_RANGE";
                break;
            case 152:
                str = "CONST_METHOD_HANDLE";
                break;
            case Opcodes.IFEQ /* 153 */:
                str = "CONST_METHOD_TYPE";
                break;
            case Opcodes.IFNE /* 154 */:
                str = "JAVA_JSR";
                break;
            case Opcodes.IFLT /* 155 */:
                str = "JAVA_RET";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        if (this.f4662d == null) {
            sb2.append(String.format("(0x%04X)", Integer.valueOf(this.f4664f)));
        } else {
            int i9 = this.f4668j;
            if (this.f4663e) {
                sb2.append(' ');
                for (int i10 = 0; i10 < i9; i10++) {
                    if (i10 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append("r");
                    sb2.append(this.f4667i[i10]);
                }
            }
        }
        return sb2.toString();
    }
}
