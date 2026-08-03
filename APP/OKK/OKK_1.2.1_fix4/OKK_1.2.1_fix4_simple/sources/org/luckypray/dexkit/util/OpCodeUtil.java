package org.luckypray.dexkit.util;

import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0142h;
import p007D0.InterfaceC0136b;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;

/* JADX INFO: loaded from: classes.dex */
public final class OpCodeUtil {
    public static final OpCodeUtil INSTANCE = null;
    private static final String[] opFormat = null;
    private static final InterfaceC0136b opFormatMap$delegate = null;

    static {
        INSTANCE = new OpCodeUtil();
        opFormat = new String[]{"nop", "move", "move/from16", "move/16", "move-wide", "move-wide/from16", "move-wide/16", "move-object", "move-object/from16", "move-object/16", "move-result", "move-result-wide", "move-result-object", "move-exception", "return-void", "return", "return-wide", "return-object", "const/4", "const/16", "const", "const/high16", "const-wide/16", "const-wide/32", "const-wide", "const-wide/high16", "const-string", "const-string/jumbo", "const-class", "monitor-enter", "monitor-exit", "check-cast", "instance-of", "array-length", "new-instance", "new-array", "filled-new-array", "filled-new-array/range", "fill-array-data", "throw", "goto", "goto/16", "goto/32", "packed-switch", "sparse-switch", "cmpl-float", "cmpg-float", "cmpl-double", "cmpg-double", "cmp-long", "if-eq", "if-ne", "if-lt", "if-ge", "if-gt", "if-le", "if-eqz", "if-nez", "if-ltz", "if-gez", "if-gtz", "if-lez", "unused-3e", "unused-3f", "unused-40", "unused-41", "unused-42", "unused-43", "aget", "aget-wide", "aget-object", "aget-boolean", "aget-byte", "aget-char", "aget-short", "aput", "aput-wide", "aput-object", "aput-boolean", "aput-byte", "aput-char", "aput-short", "iget", "iget-wide", "iget-object", "iget-boolean", "iget-byte", "iget-char", "iget-short", "iput", "iput-wide", "iput-object", "iput-boolean", "iput-byte", "iput-char", "iput-short", "sget", "sget-wide", "sget-object", "sget-boolean", "sget-byte", "sget-char", "sget-short", "sput", "sput-wide", "sput-object", "sput-boolean", "sput-byte", "sput-char", "sput-short", "invoke-virtual", "invoke-super", "invoke-direct", "invoke-static", "invoke-interface", "return-void-no-barrier", "invoke-virtual/range", "invoke-super/range", "invoke-direct/range", "invoke-static/range", "invoke-interface/range", "unused-79", "unused-7a", "neg-int", "not-int", "neg-long", "not-long", "neg-float", "neg-double", "int-to-long", "int-to-float", "int-to-double", "long-to-int", "long-to-float", "long-to-double", "float-to-int", "float-to-long", "float-to-double", "double-to-int", "double-to-long", "double-to-float", "int-to-byte", "int-to-char", "int-to-short", "add-int", "sub-int", "mul-int", "div-int", "rem-int", "and-int", "or-int", "xor-int", "shl-int", "shr-int", "ushr-int", "add-long", "sub-long", "mul-long", "div-long", "rem-long", "and-long", "or-long", "xor-long", "shl-long", "shr-long", "ushr-long", "add-float", "sub-float", "mul-float", "div-float", "rem-float", "add-double", "sub-double", "mul-double", "div-double", "rem-double", "add-int/2addr", "sub-int/2addr", "mul-int/2addr", "div-int/2addr", "rem-int/2addr", "and-int/2addr", "or-int/2addr", "xor-int/2addr", "shl-int/2addr", "shr-int/2addr", "ushr-int/2addr", "add-long/2addr", "sub-long/2addr", "mul-long/2addr", "div-long/2addr", "rem-long/2addr", "and-long/2addr", "or-long/2addr", "xor-long/2addr", "shl-long/2addr", "shr-long/2addr", "ushr-long/2addr", "add-float/2addr", "sub-float/2addr", "mul-float/2addr", "div-float/2addr", "rem-float/2addr", "add-double/2addr", "sub-double/2addr", "mul-double/2addr", "div-double/2addr", "rem-double/2addr", "add-int/lit16", "rsub-int", "mul-int/lit16", "div-int/lit16", "rem-int/lit16", "and-int/lit16", "or-int/lit16", "xor-int/lit16", "add-int/lit8", "rsub-int/lit8", "mul-int/lit8", "div-int/lit8", "rem-int/lit8", "and-int/lit8", "or-int/lit8", "xor-int/lit8", "shl-int/lit8", "shr-int/lit8", "ushr-int/lit8", "iget-quick", "iget-wide-quick", "iget-object-quick", "iput-quick", "iput-wide-quick", "iput-object-quick", "invoke-virtual-quick", "invoke-virtual/range-quick", "iput-boolean-quick", "iput-byte-quick", "iput-char-quick", "iput-short-quick", "iget-boolean-quick", "iget-byte-quick", "iget-char-quick", "iget-short-quick", "unused-f3", "unused-f4", "unused-f5", "unused-f6", "unused-f7", "unused-f8", "unused-f9", "invoke-polymorphic", "invoke-polymorphic/range", "invoke-custom", "invoke-custom/range", "const-method-handle", "const-method-type"};
        opFormatMap$delegate = AbstractC0040p.m81E(OpCodeUtil$opFormatMap$2.INSTANCE);
    }

    private OpCodeUtil() {
    }

    public static final /* synthetic */ String[] access$getOpFormat$p() {
        return opFormat;
    }

    public static final int getOpCode(String r3) {
        AbstractC0307g.m703e(r3, "opFormat");
        Integer r02 = INSTANCE.getOpFormatMap().get(r3);
        if (r02 == null) goto L7;
        return r02.intValue();
    L7:
        throw new IllegalArgumentException(AbstractC0324d.m723f("opFormat: ", r3, " is not found"));
    }

    public static final String getOpFormat(int r3) {
        if (r3 < 0) goto L7;
        String[] r02 = opFormat;
        if (r3 >= r02.length) goto L7;
        return r02[r3];
    L7:
        AbstractC0358S.m890i(16);
        String r32 = Integer.toString(r3, 16);
        AbstractC0307g.m702d(r32, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        throw new IllegalArgumentException("opcode: " + r32 + " is out of range");
    }

    private final Map<String, Integer> getOpFormatMap() {
        return (Map) ((C0142h) opFormatMap$delegate).m466a();
    }
}
