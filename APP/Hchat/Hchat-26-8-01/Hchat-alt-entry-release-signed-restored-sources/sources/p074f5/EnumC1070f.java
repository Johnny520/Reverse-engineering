package p074f5;

import bsh.org.objectweb.asm.Opcodes;
import id.C2041a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p046d6.C0712i;
import p046d6.C0715l;
import p136j8.C2104o;

/* JADX INFO: renamed from: f5.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1070f {
    NOP(0, "nop", 7, 2, 4),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE(1, "move", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_FROM16(2, "move/from16", 7, 18, 20),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_16(3, "move/16", 7, 24, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(4, "move-wide", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_OBJECT_FROM16(5, "move-wide/from16", 7, 18, 52),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_OBJECT_16(6, "move-wide/16", 7, 24, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(7, "move-object", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_OBJECT_FROM16(8, "move-object/from16", 7, 18, 20),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_OBJECT_16(9, "move-object/16", 7, 24, 20),
    /* JADX INFO: Fake field, exist only in values array */
    MOVE_RESULT(10, "move-result", 7, 4, 20),
    /* JADX INFO: Fake field, exist only in values array */
    THROW(11, "move-result-wide", 7, 4, 52),
    /* JADX INFO: Fake field, exist only in values array */
    THROW(12, "move-result-object", 7, 4, 20),
    /* JADX INFO: Fake field, exist only in values array */
    THROW(13, "move-exception", 7, 4, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("RETURN_VOID", "return-void", 2),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("RETURN", "return", 4),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("RETURN_WIDE", "return-wide", 4),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("RETURN_OBJECT", "return-object", 4),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_4(18, "const/4", 7, 3, 20),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_16(19, "const/16", 7, 11, 20),
    /* JADX INFO: Fake field, exist only in values array */
    CONST(20, "const", 7, 22, 20),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_WIDE_32(21, "const/high16", 7, 9, 20),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_WIDE_16(22, "const-wide/16", 7, 11, 52),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_WIDE_32(23, "const-wide/32", 7, 22, 52),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_WIDE(24, "const-wide", 7, 33, 52),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_WIDE_HIGH16(25, "const-wide/high16", 7, 10, 52),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_STRING(26, "const-string", 0, 8, 21),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_STRING_JUMBO(27, "const-string/jumbo", 0, 21, 21),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(28, "const-class", 1, 8, 21),
    /* JADX INFO: Fake field, exist only in values array */
    THROW(29, "monitor-enter", 7, 4, 5),
    /* JADX INFO: Fake field, exist only in values array */
    THROW(30, "monitor-exit", 7, 4, 5),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(31, "check-cast", 1, 8, 21),
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE_OF(32, "instance-of", 1, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(33, "array-length", 7, 5, 21),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(34, "new-instance", 1, 8, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(35, "new-array", 1, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    FILLED_NEW_ARRAY(36, "filled-new-array", 1, 25, 13),
    /* JADX INFO: Fake field, exist only in values array */
    FILLED_NEW_ARRAY_RANGE(37, "filled-new-array/range", 1, 28, 13),
    FILL_ARRAY_DATA(38, "fill-array-data", 7, 23, 4),
    /* JADX INFO: Fake field, exist only in values array */
    THROW(39, "throw", 7, 4, 1),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("GOTO", "goto", 1),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("GOTO_16", "goto/16", 7),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER("GOTO_32", "goto/32", 20),
    PACKED_SWITCH(43, "packed-switch", 7, 23, 4),
    SPARSE_SWITCH(44, "sparse-switch", 7, 23, 4),
    /* JADX INFO: Fake field, exist only in values array */
    CMPL_FLOAT(45, "cmpl-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(46, "cmpg-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(47, "cmpl-double", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(48, "cmpg-double", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(49, "cmp-long", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IF_EQ(50, "if-eq", 7, 17, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LE(51, "if-ne", 7, 17, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LE(52, "if-lt", 7, 17, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LE(53, "if-ge", 7, 17, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LE(54, "if-gt", 7, 17, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LE(55, "if-le", 7, 17, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_EQZ(56, "if-eqz", 7, 12, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LEZ(57, "if-nez", 7, 12, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LEZ(58, "if-ltz", 7, 12, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LEZ(59, "if-gez", 7, 12, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LEZ(60, "if-gtz", 7, 12, 4),
    /* JADX INFO: Fake field, exist only in values array */
    IF_LEZ(61, "if-lez", 7, 12, 4),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(68, "aget", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(69, "aget-wide", 7, 19, 53),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(70, "aget-object", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(71, "aget-boolean", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(72, "aget-byte", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(73, "aget-char", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(74, "aget-short", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(75, "aput", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(76, "aput-wide", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(77, "aput-object", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(78, "aput-boolean", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(79, "aput-byte", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(80, "aput-char", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(81, "aput-short", 7, 19, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(82, "iget", 2, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(83, "iget-wide", 2, 14, 53),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(84, "iget-object", 2, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(85, "iget-boolean", 2, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(86, "iget-byte", 2, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(87, "iget-char", 2, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(88, "iget-short", 2, 14, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(89, "iput", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(90, "iput-wide", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(91, "iput-object", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(92, "iput-boolean", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(93, "iput-byte", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(94, "iput-char", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(95, "iput-short", 2, 14, 5),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(96, "sget", 2, 8, 277),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(97, "sget-wide", 2, 8, 309),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(98, "sget-object", 2, 8, 277),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(99, "sget-boolean", 2, 8, 277),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(100, "sget-byte", 2, 8, 277),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(101, "sget-char", 2, 8, 277),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(102, "sget-short", 2, 8, 277),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(103, "sput", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(104, "sput-wide", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(105, "sput-object", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(106, "sput-boolean", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(107, "sput-byte", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(108, "sput-char", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(109, "sput-short", 2, 8, 261),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_DIRECT_EMPTY(110, "invoke-virtual", 3, 25, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_DIRECT_EMPTY(111, "invoke-super", 3, 25, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_DIRECT_EMPTY(112, "invoke-direct", 3, 25, 1037),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_DIRECT_EMPTY(113, "invoke-static", 3, 25, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_DIRECT_EMPTY(114, "invoke-interface", 3, 25, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_OBJECT_INIT_RANGE(116, "invoke-virtual/range", 3, 28, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_OBJECT_INIT_RANGE(117, "invoke-super/range", 3, 28, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_OBJECT_INIT_RANGE(118, "invoke-direct/range", 3, 28, 1037),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_OBJECT_INIT_RANGE(119, "invoke-static/range", 3, 28, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_OBJECT_INIT_RANGE(120, "invoke-interface/range", 3, 28, 13),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(123, "neg-int", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(124, "not-int", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(125, "neg-long", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(126, "not-long", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(127, "neg-float", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(128, "neg-double", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(129, "int-to-long", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(130, "int-to-float", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(131, "int-to-double", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(132, "long-to-int", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(133, "long-to-float", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(134, "long-to-double", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(135, "float-to-int", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(136, "float-to-long", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(137, "float-to-double", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(138, "double-to-int", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(139, "double-to-long", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(140, "double-to-float", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(141, "int-to-byte", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(142, "int-to-char", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(143, "int-to-short", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(144, "add-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(145, "sub-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(146, "mul-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(147, "div-int", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(148, "rem-int", 7, 19, 21),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(149, "and-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(150, "or-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(151, "xor-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(152, "shl-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IFEQ, "shr-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IFNE, "ushr-int", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IFLT, "add-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IFGE, "sub-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IFGT, "mul-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IFLE, "div-long", 7, 19, 53),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ICMPEQ, "rem-long", 7, 19, 53),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ICMPNE, "and-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ICMPLT, "or-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ICMPGE, "xor-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ICMPGT, "shl-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ICMPLE, "shr-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ACMPEQ, "ushr-long", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IF_ACMPNE, "add-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.GOTO, "sub-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.JSR, "mul-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.RET, "div-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.TABLESWITCH, "rem-float", 7, 19, 20),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.LOOKUPSWITCH, "add-double", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.IRETURN, "sub-double", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.LRETURN, "mul-double", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.FRETURN, "div-double", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    REM_DOUBLE(Opcodes.DRETURN, "rem-double", 7, 19, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.ARETURN, "add-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.RETURN, "sub-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.GETSTATIC, "mul-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.PUTSTATIC, "div-int/2addr", 7, 5, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.GETFIELD, "rem-int/2addr", 7, 5, 21),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.PUTFIELD, "and-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.INVOKEVIRTUAL, "or-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.INVOKESPECIAL, "xor-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.INVOKESTATIC, "shl-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.INVOKEINTERFACE, "shr-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.INVOKEDYNAMIC, "ushr-int/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.NEW, "add-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.NEWARRAY, "sub-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.ANEWARRAY, "mul-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.ARRAYLENGTH, "div-long/2addr", 7, 5, 53),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.ATHROW, "rem-long/2addr", 7, 5, 53),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.CHECKCAST, "and-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.INSTANCEOF, "or-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.MONITORENTER, "xor-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.MONITOREXIT, "shl-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(196, "shr-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.MULTIANEWARRAY, "ushr-long/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.IFNULL, "add-float/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(Opcodes.IFNONNULL, "sub-float/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(200, "mul-float/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(201, "div-float/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(202, "rem-float/2addr", 7, 5, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(203, "add-double/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(204, "sub-double/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(205, "mul-double/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(206, "div-double/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(207, "rem-double/2addr", 7, 5, 52),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_INT_LIT16(208, "add-int/lit16", 7, 16, 20),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(209, "rsub-int", 7, 16, 20),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(210, "mul-int/lit16", 7, 16, 20),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(211, "div-int/lit16", 7, 16, 21),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(212, "rem-int/lit16", 7, 16, 21),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(213, "and-int/lit16", 7, 16, 20),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(214, "or-int/lit16", 7, 16, 20),
    /* JADX INFO: Fake field, exist only in values array */
    XOR_INT_LIT16(215, "xor-int/lit16", 7, 16, 20),
    /* JADX INFO: Fake field, exist only in values array */
    ADD_INT_LIT8(216, "add-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(217, "rsub-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(218, "mul-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(219, "div-int/lit8", 7, 13, 21),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(220, "rem-int/lit8", 7, 13, 21),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(221, "and-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(222, "or-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(223, "xor-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(224, "shl-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(225, "shr-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(226, "ushr-int/lit8", 7, 13, 20),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2694e(227, 9), "iget-volatile", 2, 14, 151),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2694e(228, 9), "iput-volatile", 2, 14, 135),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(m2694e(229, 9), "sget-volatile", 2, 8, 407),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(m2694e(230, 9), "sput-volatile", 2, 8, 391),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2694e(231, 9), "iget-object-volatile", 2, 14, 151),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2694e(232, 9), "iget-wide-volatile", 2, 14, Opcodes.INVOKESPECIAL),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2694e(233, 9), "iput-wide-volatile", 2, 14, 135),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(m2694e(234, 9), "sget-wide-volatile", 2, 8, 439),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(m2694e(235, 9), "sput-wide-volatile", 2, 8, 391),
    THROW_VERIFICATION_ERROR(m2694e(237, 5), "throw-verification-error", 7, 6, 3),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_SHORT_QUICK(m2690a(238), "execute-inline", 7, 26, 15),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_SHORT_QUICK(m2694e(239, 8), "execute-inline/range", 7, 29, 15),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_DIRECT_EMPTY(m2696g(240, 13), "invoke-direct-empty", 3, 25, 1039),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_OBJECT_INIT_RANGE(m2694e(240, 14), "invoke-object-init/range", 3, 28, 1039),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_VOID_BARRIER(m2693d(m2694e(241, 11), m2697i()), "return-void-barrier", 7, 2, 2),
    /* JADX INFO: Fake field, exist only in values array */
    IGET_QUICK(m2695f(115, 60), "return-void-no-barrier", 7, 2, 2),
    /* JADX INFO: Fake field, exist only in values array */
    IGET_QUICK(m2693d(m2690a(242), m2691b(227)), "iget-quick", 7, 15, 87),
    /* JADX INFO: Fake field, exist only in values array */
    IGET_WIDE_QUICK(m2693d(m2690a(243), m2691b(228)), "iget-wide-quick", 7, 15, 119),
    /* JADX INFO: Fake field, exist only in values array */
    IGET_OBJECT_QUICK(m2693d(m2690a(244), m2691b(229)), "iget-object-quick", 7, 15, 87),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_QUICK(m2693d(m2690a(245), m2691b(230)), "iput-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_WIDE_QUICK(m2693d(m2690a(246), m2691b(231)), "iput-wide-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_QUICK(m2693d(m2690a(247), m2691b(232)), "iput-object-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BOOLEAN_QUICK(m2691b(235), "iput-boolean-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_BYTE_QUICK(m2691b(236), "iput-byte-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_CHAR_QUICK(m2691b(237), "iput-char-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_SHORT_QUICK(m2691b(238), "iput-short-quick", 7, 15, 71),
    /* JADX INFO: Fake field, exist only in values array */
    IGET_BOOLEAN_QUICK(m2691b(239), "iget-boolean-quick", 7, 15, 87),
    /* JADX INFO: Fake field, exist only in values array */
    IGET_BYTE_QUICK(m2691b(240), "iget-byte-quick", 7, 15, 87),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2691b(241), "iget-char-quick", 7, 15, 87),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_SUPER_QUICK_RANGE(m2691b(242), "iget-short-quick", 7, 15, 87),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_SUPER_QUICK_RANGE(m2693d(m2690a(248), m2691b(233)), "invoke-virtual-quick", 7, 27, 15),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_SUPER_QUICK_RANGE(m2693d(m2690a(249), m2691b(234)), "invoke-virtual-quick/range", 7, 30, 15),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_SUPER_QUICK_RANGE(m2696g(250, 25), "invoke-super-quick", 7, 27, 15),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_SUPER_QUICK_RANGE(m2696g(251, 25), "invoke-super-quick/range", 7, 30, 15),
    /* JADX INFO: Fake field, exist only in values array */
    IPUT_OBJECT_VOLATILE(m2694e(252, 9), "iput-object-volatile", 2, 14, 135),
    /* JADX INFO: Fake field, exist only in values array */
    SGET_OBJECT_VOLATILE(m2694e(253, 9), "sget-object-volatile", 2, 8, 407),
    /* JADX INFO: Fake field, exist only in values array */
    SPUT_OBJECT_VOLATILE(m2692c(), "sput-object-volatile", 2, 8, 391),
    PACKED_SWITCH_PAYLOAD(Opcodes.ACC_NATIVE, "packed-switch-payload", 7, 35, 0),
    SPARSE_SWITCH_PAYLOAD(Opcodes.ACC_INTERFACE, "sparse-switch-payload", 7, 36, 0),
    ARRAY_PAYLOAD(768, "array-payload", 7, 34, 0),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_POLYMORPHIC(m2695f(250, 87), "invoke-polymorphic", 3, 4, 31, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_POLYMORPHIC_RANGE(m2695f(251, 87), "invoke-polymorphic/range", 3, 4, 32, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_CUSTOM(m2695f(252, 111), "invoke-custom", 5, 25, 13),
    /* JADX INFO: Fake field, exist only in values array */
    INVOKE_CUSTOM_RANGE(m2695f(253, 111), "invoke-custom/range", 5, 28, 13),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_METHOD_HANDLE(m2695f(254, 134), "const-method-handle", 6, 8, 21),
    /* JADX INFO: Fake field, exist only in values array */
    CONST_METHOD_TYPE(m2695f(255, 134), "const-method-type", 4, 8, 21);


    /* JADX INFO: renamed from: g */
    public final C0715l f3442g;

    /* JADX INFO: renamed from: h */
    public final C0715l f3443h;

    /* JADX INFO: renamed from: i */
    public final String f3444i;

    /* JADX INFO: renamed from: j */
    public final int f3445j;

    /* JADX INFO: renamed from: k */
    public final int f3446k;

    /* JADX INFO: renamed from: l */
    public final int f3447l;

    /* JADX INFO: renamed from: m */
    public final int f3448m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC1070f(List list, String str, int i9, int i10, int i11, int i12) {
        int i13 = C0715l.f2150c;
        C2041a c2041a = new C2041a(1);
        C2041a c2041a2 = new C2041a(1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1069e c1069e = (C1069e) it.next();
            C0712i c0712i = c1069e.f3430a;
            C0712i c0712i2 = c1069e.f3431b;
            int i14 = c1069e.f3432c;
            if (!c0712i.m1889f()) {
                c2041a.m4994d(c1069e.f3430a, Short.valueOf((short) i14));
            }
            if (!c0712i2.m1889f()) {
                c2041a2.m4994d(c0712i2, Short.valueOf((short) i14));
            }
        }
        this.f3442g = c2041a.m4991a();
        this.f3443h = c2041a2.m4991a();
        this.f3444i = str;
        this.f3445j = i9;
        this.f3447l = i10;
        this.f3448m = i11;
        this.f3446k = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m2690a(int i9) {
        return Arrays.asList(new C1069e(C0712i.m1883a(), C0712i.m1884g(), i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static List m2691b(int i9) {
        return Arrays.asList(new C1069e(C0712i.m1884g(), C0712i.m1883a(), i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static List m2692c() {
        Integer num = 9;
        if (num.compareTo(19) <= 0) {
            return Arrays.asList(new C1069e(new C0712i(num, 19, false), C0712i.m1884g(), 254));
        }
        C2104o.m5294t("lowerBound must be <= upperBound");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ArrayList m2693d(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static List m2694e(int i9, int i10) {
        return Arrays.asList(new C1069e(new C0712i(Integer.valueOf(i10), null, false), C0712i.m1884g(), i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static List m2695f(int i9, int i10) {
        return Arrays.asList(new C1069e(C0712i.m1884g(), new C0712i(Integer.valueOf(i10), null, false), i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static List m2696g(int i9, int i10) {
        return Arrays.asList(new C1069e(new C0712i(null, Integer.valueOf(i10), false), C0712i.m1884g(), i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m2697i() {
        return Arrays.asList(new C1069e(C0712i.m1884g(), new C0712i(null, 59, false), 115));
    }

    EnumC1070f(List list, String str, int i9, int i10, int i11) {
        this(list, str, i9, -1, i10, i11);
    }

    EnumC1070f(String str, String str2, int i9) {
        this(i, str2, 7, i9, 0);
    }

    EnumC1070f(int i9, String str, int i10, int i11, int i12) {
        this(Arrays.asList(new C1069e(C0712i.m1883a(), C0712i.m1883a(), i9)), str, i10, -1, i11, i12);
    }
}
