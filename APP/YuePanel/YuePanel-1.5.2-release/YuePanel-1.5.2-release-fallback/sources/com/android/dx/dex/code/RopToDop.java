package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class RopToDop {
    private static final java.util.HashMap<com.android.dx.rop.code.Rop, com.android.dx.dex.code.Dop> MAP = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 400(0x190, float:5.6E-43)
            r0.<init>(r1)
            com.android.dx.dex.code.RopToDop.MAP = r0
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NOP
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NOP
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MOVE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_LONG
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.MOVE_WIDE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_DOUBLE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_OBJECT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.MOVE_OBJECT
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_PARAM_INT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_PARAM_LONG
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_PARAM_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_PARAM_DOUBLE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MOVE_PARAM_OBJECT
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CONST_4
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONST_LONG
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.CONST_WIDE_16
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONST_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONST_DOUBLE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONST_OBJECT_NOTHROW
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.GOTO
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_EQZ_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.IF_EQZ
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_NEZ_INT
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.IF_NEZ
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_LTZ_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_LTZ
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_GEZ_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_GEZ
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_LEZ_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_LEZ
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_GTZ_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_GTZ
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_EQZ_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_NEZ_OBJECT
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_EQ_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.IF_EQ
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_NE_INT
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.IF_NE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_LT_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_LT
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_GE_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_GE
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_LE_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_LE
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_GT_INT
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.IF_GT
            r0.put(r1, r4)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_EQ_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.IF_NE_OBJECT
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SWITCH
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SPARSE_SWITCH
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ADD_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.ADD_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ADD_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.ADD_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ADD_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.ADD_FLOAT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ADD_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.ADD_DOUBLE_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SUB_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SUB_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SUB_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SUB_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SUB_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SUB_FLOAT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SUB_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SUB_DOUBLE_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MUL_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MUL_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MUL_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MUL_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MUL_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MUL_FLOAT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MUL_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MUL_DOUBLE_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.DIV_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DIV_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.DIV_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DIV_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.DIV_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DIV_FLOAT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.DIV_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DIV_DOUBLE_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.REM_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.REM_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.REM_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.REM_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.REM_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.REM_FLOAT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.REM_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.REM_DOUBLE_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NEG_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NEG_INT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NEG_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NEG_LONG
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NEG_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NEG_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NEG_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NEG_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AND_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AND_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AND_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AND_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.OR_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.OR_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.OR_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.OR_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.XOR_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.XOR_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.XOR_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.XOR_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SHL_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SHL_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SHL_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SHL_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SHR_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SHR_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SHR_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SHR_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.USHR_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.USHR_INT_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.USHR_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.USHR_LONG_2ADDR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NOT_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NOT_INT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NOT_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NOT_LONG
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ADD_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.ADD_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SUB_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.RSUB_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MUL_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MUL_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.DIV_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DIV_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.REM_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.REM_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AND_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AND_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.OR_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.OR_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.XOR_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.XOR_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SHL_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SHL_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.SHR_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SHR_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.USHR_CONST_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.USHR_INT_LIT8
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CMPL_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CMP_LONG
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CMPL_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CMPL_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CMPL_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CMPL_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CMPG_FLOAT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CMPG_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CMPG_DOUBLE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CMPG_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_L2I
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.LONG_TO_INT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_F2I
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.FLOAT_TO_INT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_D2I
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DOUBLE_TO_INT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_I2L
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INT_TO_LONG
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_F2L
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.FLOAT_TO_LONG
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_D2L
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DOUBLE_TO_LONG
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_I2F
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INT_TO_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_L2F
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.LONG_TO_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_D2F
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.DOUBLE_TO_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_I2D
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INT_TO_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_L2D
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.LONG_TO_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CONV_F2D
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.FLOAT_TO_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.TO_BYTE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INT_TO_BYTE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.TO_CHAR
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INT_TO_CHAR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.TO_SHORT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INT_TO_SHORT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.RETURN_VOID
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.RETURN_VOID
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.RETURN_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.RETURN
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.RETURN_LONG
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.RETURN_WIDE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.RETURN_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.RETURN_DOUBLE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.RETURN_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.RETURN_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ARRAY_LENGTH
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.ARRAY_LENGTH
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.THROW
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.THROW
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MONITOR_ENTER
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MONITOR_ENTER
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.MONITOR_EXIT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.MONITOR_EXIT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AGET
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_LONG
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.AGET_WIDE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_DOUBLE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AGET_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_BOOLEAN
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AGET_BOOLEAN
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_BYTE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AGET_BYTE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_CHAR
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AGET_CHAR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.AGET_SHORT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.AGET_SHORT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_INT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.APUT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_LONG
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.APUT_WIDE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_FLOAT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_DOUBLE
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.APUT_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_BOOLEAN
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.APUT_BOOLEAN
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_BYTE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.APUT_BYTE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_CHAR
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.APUT_CHAR
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.APUT_SHORT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.APUT_SHORT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.NEW_INSTANCE
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NEW_INSTANCE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.CHECK_CAST
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.CHECK_CAST
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.INSTANCE_OF
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.INSTANCE_OF
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_FIELD_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.IGET_WIDE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_FIELD_FLOAT
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.IGET
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_FIELD_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_FIELD_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.IGET_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_STATIC_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SGET_WIDE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_STATIC_FLOAT
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.SGET
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_STATIC_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GET_STATIC_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SGET_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_FIELD_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.IPUT_WIDE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_FIELD_FLOAT
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.IPUT
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_FIELD_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_FIELD_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.IPUT_OBJECT
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_STATIC_LONG
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SPUT_WIDE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_STATIC_FLOAT
            com.android.dx.dex.code.Dop r3 = com.android.dx.dex.code.Dops.SPUT
            r0.put(r1, r3)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_STATIC_DOUBLE
            r0.put(r1, r2)
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.PUT_STATIC_OBJECT
            com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.SPUT_OBJECT
            r0.put(r1, r2)
            return
    }

    private RopToDop() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.dex.code.Dop dopFor(com.android.dx.rop.code.Insn r7) {
            com.android.dx.rop.code.Rop r0 = r7.getOpcode()
            java.util.HashMap<com.android.dx.rop.code.Rop, com.android.dx.dex.code.Dop> r1 = com.android.dx.dex.code.RopToDop.MAP
            java.lang.Object r1 = r1.get(r0)
            com.android.dx.dex.code.Dop r1 = (com.android.dx.dex.code.Dop) r1
            if (r1 == 0) goto Lf
            return r1
        Lf:
            int r1 = r0.getOpcode()
            r2 = 4
            if (r1 == r2) goto L147
            r2 = 5
            if (r1 == r2) goto L11d
            r2 = 41
            if (r1 == r2) goto L11a
            r2 = 42
            if (r1 == r2) goto L117
            r2 = 55
            if (r1 == r2) goto Lf6
            r2 = 8
            r3 = 6
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case 45: goto Lba;
                case 46: goto L95;
                case 47: goto L70;
                case 48: goto L4b;
                case 49: goto L48;
                case 50: goto L45;
                case 51: goto L42;
                case 52: goto L3f;
                case 53: goto L3c;
                default: goto L2e;
            }
        L2e:
            switch(r1) {
                case 57: goto L39;
                case 58: goto L36;
                case 59: goto L33;
                default: goto L31;
            }
        L31:
            goto Ld3
        L33:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_CUSTOM
            return r7
        L36:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_POLYMORPHIC
            return r7
        L39:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.FILL_ARRAY_DATA
            return r7
        L3c:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_INTERFACE
            return r7
        L3f:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_DIRECT
            return r7
        L42:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_SUPER
            return r7
        L45:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_VIRTUAL
            return r7
        L48:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.INVOKE_STATIC
            return r7
        L4b:
            com.android.dx.rop.code.ThrowingCstInsn r7 = (com.android.dx.rop.code.ThrowingCstInsn) r7
            com.android.dx.rop.cst.Constant r7 = r7.getConstant()
            com.android.dx.rop.cst.CstFieldRef r7 = (com.android.dx.rop.cst.CstFieldRef) r7
            int r7 = r7.getBasicType()
            if (r7 == r6) goto L6d
            if (r7 == r5) goto L6a
            if (r7 == r4) goto L67
            if (r7 == r3) goto L64
            if (r7 != r2) goto Ld3
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SPUT_SHORT
            return r7
        L64:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SPUT
            return r7
        L67:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SPUT_CHAR
            return r7
        L6a:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SPUT_BYTE
            return r7
        L6d:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SPUT_BOOLEAN
            return r7
        L70:
            com.android.dx.rop.code.ThrowingCstInsn r7 = (com.android.dx.rop.code.ThrowingCstInsn) r7
            com.android.dx.rop.cst.Constant r7 = r7.getConstant()
            com.android.dx.rop.cst.CstFieldRef r7 = (com.android.dx.rop.cst.CstFieldRef) r7
            int r7 = r7.getBasicType()
            if (r7 == r6) goto L92
            if (r7 == r5) goto L8f
            if (r7 == r4) goto L8c
            if (r7 == r3) goto L89
            if (r7 != r2) goto Ld3
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IPUT_SHORT
            return r7
        L89:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IPUT
            return r7
        L8c:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IPUT_CHAR
            return r7
        L8f:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IPUT_BYTE
            return r7
        L92:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IPUT_BOOLEAN
            return r7
        L95:
            com.android.dx.rop.code.ThrowingCstInsn r7 = (com.android.dx.rop.code.ThrowingCstInsn) r7
            com.android.dx.rop.cst.Constant r7 = r7.getConstant()
            com.android.dx.rop.cst.CstFieldRef r7 = (com.android.dx.rop.cst.CstFieldRef) r7
            int r7 = r7.getBasicType()
            if (r7 == r6) goto Lb7
            if (r7 == r5) goto Lb4
            if (r7 == r4) goto Lb1
            if (r7 == r3) goto Lae
            if (r7 != r2) goto Ld3
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SGET_SHORT
            return r7
        Lae:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SGET
            return r7
        Lb1:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SGET_CHAR
            return r7
        Lb4:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SGET_BYTE
            return r7
        Lb7:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.SGET_BOOLEAN
            return r7
        Lba:
            com.android.dx.rop.code.ThrowingCstInsn r7 = (com.android.dx.rop.code.ThrowingCstInsn) r7
            com.android.dx.rop.cst.Constant r7 = r7.getConstant()
            com.android.dx.rop.cst.CstFieldRef r7 = (com.android.dx.rop.cst.CstFieldRef) r7
            int r7 = r7.getBasicType()
            if (r7 == r6) goto Lf3
            if (r7 == r5) goto Lf0
            if (r7 == r4) goto Led
            if (r7 == r3) goto Lea
            if (r7 != r2) goto Ld3
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IGET_SHORT
            return r7
        Ld3:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown rop: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        Lea:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IGET
            return r7
        Led:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IGET_CHAR
            return r7
        Lf0:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IGET_BYTE
            return r7
        Lf3:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.IGET_BOOLEAN
            return r7
        Lf6:
            com.android.dx.rop.code.RegisterSpec r7 = r7.getResult()
            if (r7 != 0) goto Lff
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.NOP
            return r7
        Lff:
            int r7 = r7.getBasicType()
            switch(r7) {
                case 1: goto L114;
                case 2: goto L114;
                case 3: goto L114;
                case 4: goto L111;
                case 5: goto L114;
                case 6: goto L114;
                case 7: goto L111;
                case 8: goto L114;
                case 9: goto L10e;
                default: goto L106;
            }
        L106:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected basic type"
            r7.<init>(r0)
            throw r7
        L10e:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.MOVE_RESULT_OBJECT
            return r7
        L111:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.MOVE_RESULT_WIDE
            return r7
        L114:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.MOVE_RESULT
            return r7
        L117:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.FILLED_NEW_ARRAY
            return r7
        L11a:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.NEW_ARRAY
            return r7
        L11d:
            com.android.dx.rop.code.ThrowingCstInsn r7 = (com.android.dx.rop.code.ThrowingCstInsn) r7
            com.android.dx.rop.cst.Constant r7 = r7.getConstant()
            boolean r0 = r7 instanceof com.android.dx.rop.cst.CstType
            if (r0 == 0) goto L12a
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.CONST_CLASS
            return r7
        L12a:
            boolean r0 = r7 instanceof com.android.dx.rop.cst.CstString
            if (r0 == 0) goto L131
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.CONST_STRING
            return r7
        L131:
            boolean r0 = r7 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r0 == 0) goto L138
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.CONST_METHOD_HANDLE
            return r7
        L138:
            boolean r7 = r7 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r7 == 0) goto L13f
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.CONST_METHOD_TYPE
            return r7
        L13f:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected constant type"
            r7.<init>(r0)
            throw r7
        L147:
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.MOVE_EXCEPTION
            return r7
    }
}
