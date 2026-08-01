package p239q5;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: q5.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6266q {
    /* JADX INFO: renamed from: a */
    public static int m24730a(int i10) {
        switch (i10) {
            case 7:
            case 8:
                return i10;
            case 9:
                return 12;
            case 10:
                return 11;
            case Opcodes.FCONST_0 /* 11 */:
                return 10;
            case Opcodes.FCONST_1 /* 12 */:
                return 9;
            default:
                throw new RuntimeException("Unrecognized IF regop: " + i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m24731b(int i10) {
        switch (i10) {
            case 1:
                return "nop";
            case 2:
                return "move";
            case 3:
                return "move-param";
            case 4:
                return "move-exception";
            case 5:
                return "const";
            case 6:
                return "goto";
            case 7:
                return "if-eq";
            case 8:
                return "if-ne";
            case 9:
                return "if-lt";
            case 10:
                return "if-ge";
            case Opcodes.FCONST_0 /* 11 */:
                return "if-le";
            case Opcodes.FCONST_1 /* 12 */:
                return "if-gt";
            case Opcodes.FCONST_2 /* 13 */:
                return "switch";
            case Opcodes.DCONST_0 /* 14 */:
                return "add";
            case 15:
                return "sub";
            case 16:
                return "mul";
            case Opcodes.SIPUSH /* 17 */:
                return "div";
            case Opcodes.LDC /* 18 */:
                return "rem";
            case 19:
                return "neg";
            case 20:
                return "and";
            case Opcodes.ILOAD /* 21 */:
                return "or";
            case Opcodes.LLOAD /* 22 */:
                return "xor";
            case Opcodes.FLOAD /* 23 */:
                return "shl";
            case Opcodes.DLOAD /* 24 */:
                return "shr";
            case Opcodes.ALOAD /* 25 */:
                return "ushr";
            case 26:
                return "not";
            case 27:
                return "cmpl";
            case 28:
                return "cmpg";
            case 29:
                return "conv";
            case 30:
                return "to-byte";
            case 31:
                return "to-char";
            case 32:
                return "to-short";
            case 33:
                return "return";
            case 34:
                return "array-length";
            case 35:
                return "throw";
            case 36:
                return "monitor-enter";
            case 37:
                return "monitor-exit";
            case 38:
                return "aget";
            case 39:
                return "aput";
            case 40:
                return "new-instance";
            case 41:
                return "new-array";
            case 42:
                return "filled-new-array";
            case 43:
                return "check-cast";
            case 44:
                return "instance-of";
            case 45:
                return "get-field";
            case Opcodes.IALOAD /* 46 */:
                return "get-static";
            case 47:
                return "put-field";
            case 48:
                return "put-static";
            case 49:
                return "invoke-static";
            case Opcodes.AALOAD /* 50 */:
                return "invoke-virtual";
            case Opcodes.BALOAD /* 51 */:
                return "invoke-super";
            case 52:
                return "invoke-direct";
            case Opcodes.SALOAD /* 53 */:
                return "invoke-interface";
            case Opcodes.ISTORE /* 54 */:
            default:
                return "unknown-" + AbstractC8826h.m33897f(i10);
            case Opcodes.LSTORE /* 55 */:
                return "move-result";
            case Opcodes.FSTORE /* 56 */:
                return "move-result-pseudo";
            case Opcodes.DSTORE /* 57 */:
                return "fill-array-data";
            case Opcodes.ASTORE /* 58 */:
                return "invoke-polymorphic";
            case 59:
                return "invoke-custom";
        }
    }
}
