package org.luckypray.dexkit.util;

import Yue.C3791;
import Yue.C5499;
import Yue.C5689;
import Yue.InterfaceC5578;
import Yue.InterfaceC5684;
import Yue.InterfaceC6399;
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR'\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lorg/luckypray/dexkit/util/OpCodeUtil;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "opcode", "", "getOpFormat", "(I)Ljava/lang/String;", "opFormat", "getOpCode", "(Ljava/lang/String;)I", "", "[Ljava/lang/String;", "", "opFormatMap$delegate", "LYue/ۥ۠ۦۨۨ;", "getOpFormatMap", "()Ljava/util/Map;", "opFormatMap", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class OpCodeUtil {

    @InterfaceC6399
    public static final OpCodeUtil INSTANCE = new OpCodeUtil();

    @InterfaceC6399
    private static final String[] opFormat = {"nop", "move", "move/from16", "move/16", "move-wide", "move-wide/from16", "move-wide/16", "move-object", "move-object/from16", "move-object/16", "move-result", "move-result-wide", "move-result-object", "move-exception", "return-void", "return", "return-wide", "return-object", "const/4", "const/16", "const", "const/high16", "const-wide/16", "const-wide/32", "const-wide", "const-wide/high16", "const-string", "const-string/jumbo", "const-class", "monitor-enter", "monitor-exit", "check-cast", "instance-of", "array-length", "new-instance", "new-array", "filled-new-array", "filled-new-array/range", "fill-array-data", "throw", "goto", "goto/16", "goto/32", "packed-switch", "sparse-switch", "cmpl-float", "cmpg-float", "cmpl-double", "cmpg-double", "cmp-long", "if-eq", "if-ne", "if-lt", "if-ge", "if-gt", "if-le", "if-eqz", "if-nez", "if-ltz", "if-gez", "if-gtz", "if-lez", "unused-3e", "unused-3f", "unused-40", "unused-41", "unused-42", "unused-43", "aget", "aget-wide", "aget-object", "aget-boolean", "aget-byte", "aget-char", "aget-short", "aput", "aput-wide", "aput-object", "aput-boolean", "aput-byte", "aput-char", "aput-short", "iget", "iget-wide", "iget-object", "iget-boolean", "iget-byte", "iget-char", "iget-short", "iput", "iput-wide", "iput-object", "iput-boolean", "iput-byte", "iput-char", "iput-short", "sget", "sget-wide", "sget-object", "sget-boolean", "sget-byte", "sget-char", "sget-short", "sput", "sput-wide", "sput-object", "sput-boolean", "sput-byte", "sput-char", "sput-short", "invoke-virtual", "invoke-super", "invoke-direct", "invoke-static", "invoke-interface", "return-void-no-barrier", "invoke-virtual/range", "invoke-super/range", "invoke-direct/range", "invoke-static/range", "invoke-interface/range", "unused-79", "unused-7a", "neg-int", "not-int", "neg-long", "not-long", "neg-float", "neg-double", "int-to-long", "int-to-float", "int-to-double", "long-to-int", "long-to-float", "long-to-double", "float-to-int", "float-to-long", "float-to-double", "double-to-int", "double-to-long", "double-to-float", "int-to-byte", "int-to-char", "int-to-short", "add-int", "sub-int", "mul-int", "div-int", "rem-int", "and-int", "or-int", "xor-int", "shl-int", "shr-int", "ushr-int", "add-long", "sub-long", "mul-long", "div-long", "rem-long", "and-long", "or-long", "xor-long", "shl-long", "shr-long", "ushr-long", "add-float", "sub-float", "mul-float", "div-float", "rem-float", "add-double", "sub-double", "mul-double", "div-double", "rem-double", "add-int/2addr", "sub-int/2addr", "mul-int/2addr", "div-int/2addr", "rem-int/2addr", "and-int/2addr", "or-int/2addr", "xor-int/2addr", "shl-int/2addr", "shr-int/2addr", "ushr-int/2addr", "add-long/2addr", "sub-long/2addr", "mul-long/2addr", "div-long/2addr", "rem-long/2addr", "and-long/2addr", "or-long/2addr", "xor-long/2addr", "shl-long/2addr", "shr-long/2addr", "ushr-long/2addr", "add-float/2addr", "sub-float/2addr", "mul-float/2addr", "div-float/2addr", "rem-float/2addr", "add-double/2addr", "sub-double/2addr", "mul-double/2addr", "div-double/2addr", "rem-double/2addr", "add-int/lit16", "rsub-int", "mul-int/lit16", "div-int/lit16", "rem-int/lit16", "and-int/lit16", "or-int/lit16", "xor-int/lit16", "add-int/lit8", "rsub-int/lit8", "mul-int/lit8", "div-int/lit8", "rem-int/lit8", "and-int/lit8", "or-int/lit8", "xor-int/lit8", "shl-int/lit8", "shr-int/lit8", "ushr-int/lit8", "iget-quick", "iget-wide-quick", "iget-object-quick", "iput-quick", "iput-wide-quick", "iput-object-quick", "invoke-virtual-quick", "invoke-virtual/range-quick", "iput-boolean-quick", "iput-byte-quick", "iput-char-quick", "iput-short-quick", "iget-boolean-quick", "iget-byte-quick", "iget-char-quick", "iget-short-quick", "unused-f3", "unused-f4", "unused-f5", "unused-f6", "unused-f7", "unused-f8", "unused-f9", "invoke-polymorphic", "invoke-polymorphic/range", "invoke-custom", "invoke-custom/range", "const-method-handle", "const-method-type"};

    /* JADX INFO: renamed from: opFormatMap$delegate, reason: from kotlin metadata */
    @InterfaceC6399
    private static final InterfaceC5684 opFormatMap = C5689.m2370(OpCodeUtil$opFormatMap$2.INSTANCE);

    private OpCodeUtil() {
    }

    @InterfaceC5578
    public static final int getOpCode(@InterfaceC6399 String opFormat2) {
        C5499.m17103(opFormat2, "opFormat");
        Integer num = INSTANCE.getOpFormatMap().get(opFormat2);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("opFormat: " + opFormat2 + " is not found");
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final String getOpFormat(int opcode) {
        if (opcode >= 0) {
            String[] strArr = opFormat;
            if (opcode < strArr.length) {
                return strArr[opcode];
            }
        }
        String string = Integer.toString(opcode, C3791.m836(16));
        C5499.m17102(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        throw new IllegalArgumentException("opcode: " + string + " is out of range");
    }

    private final Map<String, Integer> getOpFormatMap() {
        return (Map) opFormatMap.getValue();
    }
}
