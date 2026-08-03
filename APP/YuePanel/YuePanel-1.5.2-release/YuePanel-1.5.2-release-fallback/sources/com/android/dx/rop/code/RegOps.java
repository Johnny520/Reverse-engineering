package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class RegOps {
    public static final int ADD = 14;
    public static final int AGET = 38;
    public static final int AND = 20;
    public static final int APUT = 39;
    public static final int ARRAY_LENGTH = 34;
    public static final int CHECK_CAST = 43;
    public static final int CMPG = 28;
    public static final int CMPL = 27;
    public static final int CONST = 5;
    public static final int CONV = 29;
    public static final int DIV = 17;
    public static final int FILLED_NEW_ARRAY = 42;
    public static final int FILL_ARRAY_DATA = 57;
    public static final int GET_FIELD = 45;
    public static final int GET_STATIC = 46;
    public static final int GOTO = 6;
    public static final int IF_EQ = 7;
    public static final int IF_GE = 10;
    public static final int IF_GT = 12;
    public static final int IF_LE = 11;
    public static final int IF_LT = 9;
    public static final int IF_NE = 8;
    public static final int INSTANCE_OF = 44;
    public static final int INVOKE_CUSTOM = 59;
    public static final int INVOKE_DIRECT = 52;
    public static final int INVOKE_INTERFACE = 53;
    public static final int INVOKE_POLYMORPHIC = 58;
    public static final int INVOKE_STATIC = 49;
    public static final int INVOKE_SUPER = 51;
    public static final int INVOKE_VIRTUAL = 50;
    public static final int MARK_LOCAL = 54;
    public static final int MONITOR_ENTER = 36;
    public static final int MONITOR_EXIT = 37;
    public static final int MOVE = 2;
    public static final int MOVE_EXCEPTION = 4;
    public static final int MOVE_PARAM = 3;
    public static final int MOVE_RESULT = 55;
    public static final int MOVE_RESULT_PSEUDO = 56;
    public static final int MUL = 16;
    public static final int NEG = 19;
    public static final int NEW_ARRAY = 41;
    public static final int NEW_INSTANCE = 40;
    public static final int NOP = 1;
    public static final int NOT = 26;
    public static final int OR = 21;
    public static final int PUT_FIELD = 47;
    public static final int PUT_STATIC = 48;
    public static final int REM = 18;
    public static final int RETURN = 33;
    public static final int SHL = 23;
    public static final int SHR = 24;
    public static final int SUB = 15;
    public static final int SWITCH = 13;
    public static final int THROW = 35;
    public static final int TO_BYTE = 30;
    public static final int TO_CHAR = 31;
    public static final int TO_SHORT = 32;
    public static final int USHR = 25;
    public static final int XOR = 22;

    private RegOps() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int flippedIfOpcode(int r3) {
            switch(r3) {
                case 7: goto L25;
                case 8: goto L25;
                case 9: goto L23;
                case 10: goto L20;
                case 11: goto L1d;
                case 12: goto L1a;
                default: goto L3;
            }
        L3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized IF regop: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L1a:
            r3 = 9
            return r3
        L1d:
            r3 = 10
            return r3
        L20:
            r3 = 11
            return r3
        L23:
            r3 = 12
        L25:
            return r3
    }

    public static java.lang.String opName(int r2) {
            switch(r2) {
                case 1: goto Lc4;
                case 2: goto Lc1;
                case 3: goto Lbe;
                case 4: goto Lbb;
                case 5: goto Lb8;
                case 6: goto Lb5;
                case 7: goto Lb2;
                case 8: goto Laf;
                case 9: goto Lac;
                case 10: goto La9;
                case 11: goto La6;
                case 12: goto La3;
                case 13: goto La0;
                case 14: goto L9d;
                case 15: goto L9a;
                case 16: goto L97;
                case 17: goto L94;
                case 18: goto L91;
                case 19: goto L8e;
                case 20: goto L8b;
                case 21: goto L88;
                case 22: goto L85;
                case 23: goto L82;
                case 24: goto L7f;
                case 25: goto L7c;
                case 26: goto L79;
                case 27: goto L76;
                case 28: goto L73;
                case 29: goto L70;
                case 30: goto L6d;
                case 31: goto L6a;
                case 32: goto L67;
                case 33: goto L64;
                case 34: goto L61;
                case 35: goto L5e;
                case 36: goto L5b;
                case 37: goto L58;
                case 38: goto L55;
                case 39: goto L52;
                case 40: goto L4f;
                case 41: goto L4c;
                case 42: goto L49;
                case 43: goto L46;
                case 44: goto L43;
                case 45: goto L40;
                case 46: goto L3d;
                case 47: goto L3a;
                case 48: goto L37;
                case 49: goto L34;
                case 50: goto L31;
                case 51: goto L2e;
                case 52: goto L2b;
                case 53: goto L28;
                case 54: goto L3;
                case 55: goto L25;
                case 56: goto L22;
                case 57: goto L1f;
                case 58: goto L1c;
                case 59: goto L19;
                default: goto L3;
            }
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown-"
            r0.append(r1)
            java.lang.String r2 = com.android.dx.util.Hex.u1(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L19:
            java.lang.String r2 = "invoke-custom"
            return r2
        L1c:
            java.lang.String r2 = "invoke-polymorphic"
            return r2
        L1f:
            java.lang.String r2 = "fill-array-data"
            return r2
        L22:
            java.lang.String r2 = "move-result-pseudo"
            return r2
        L25:
            java.lang.String r2 = "move-result"
            return r2
        L28:
            java.lang.String r2 = "invoke-interface"
            return r2
        L2b:
            java.lang.String r2 = "invoke-direct"
            return r2
        L2e:
            java.lang.String r2 = "invoke-super"
            return r2
        L31:
            java.lang.String r2 = "invoke-virtual"
            return r2
        L34:
            java.lang.String r2 = "invoke-static"
            return r2
        L37:
            java.lang.String r2 = "put-static"
            return r2
        L3a:
            java.lang.String r2 = "put-field"
            return r2
        L3d:
            java.lang.String r2 = "get-static"
            return r2
        L40:
            java.lang.String r2 = "get-field"
            return r2
        L43:
            java.lang.String r2 = "instance-of"
            return r2
        L46:
            java.lang.String r2 = "check-cast"
            return r2
        L49:
            java.lang.String r2 = "filled-new-array"
            return r2
        L4c:
            java.lang.String r2 = "new-array"
            return r2
        L4f:
            java.lang.String r2 = "new-instance"
            return r2
        L52:
            java.lang.String r2 = "aput"
            return r2
        L55:
            java.lang.String r2 = "aget"
            return r2
        L58:
            java.lang.String r2 = "monitor-exit"
            return r2
        L5b:
            java.lang.String r2 = "monitor-enter"
            return r2
        L5e:
            java.lang.String r2 = "throw"
            return r2
        L61:
            java.lang.String r2 = "array-length"
            return r2
        L64:
            java.lang.String r2 = "return"
            return r2
        L67:
            java.lang.String r2 = "to-short"
            return r2
        L6a:
            java.lang.String r2 = "to-char"
            return r2
        L6d:
            java.lang.String r2 = "to-byte"
            return r2
        L70:
            java.lang.String r2 = "conv"
            return r2
        L73:
            java.lang.String r2 = "cmpg"
            return r2
        L76:
            java.lang.String r2 = "cmpl"
            return r2
        L79:
            java.lang.String r2 = "not"
            return r2
        L7c:
            java.lang.String r2 = "ushr"
            return r2
        L7f:
            java.lang.String r2 = "shr"
            return r2
        L82:
            java.lang.String r2 = "shl"
            return r2
        L85:
            java.lang.String r2 = "xor"
            return r2
        L88:
            java.lang.String r2 = "or"
            return r2
        L8b:
            java.lang.String r2 = "and"
            return r2
        L8e:
            java.lang.String r2 = "neg"
            return r2
        L91:
            java.lang.String r2 = "rem"
            return r2
        L94:
            java.lang.String r2 = "div"
            return r2
        L97:
            java.lang.String r2 = "mul"
            return r2
        L9a:
            java.lang.String r2 = "sub"
            return r2
        L9d:
            java.lang.String r2 = "add"
            return r2
        La0:
            java.lang.String r2 = "switch"
            return r2
        La3:
            java.lang.String r2 = "if-gt"
            return r2
        La6:
            java.lang.String r2 = "if-le"
            return r2
        La9:
            java.lang.String r2 = "if-ge"
            return r2
        Lac:
            java.lang.String r2 = "if-lt"
            return r2
        Laf:
            java.lang.String r2 = "if-ne"
            return r2
        Lb2:
            java.lang.String r2 = "if-eq"
            return r2
        Lb5:
            java.lang.String r2 = "goto"
            return r2
        Lb8:
            java.lang.String r2 = "const"
            return r2
        Lbb:
            java.lang.String r2 = "move-exception"
            return r2
        Lbe:
            java.lang.String r2 = "move-param"
            return r2
        Lc1:
            java.lang.String r2 = "move"
            return r2
        Lc4:
            java.lang.String r2 = "nop"
            return r2
    }
}
