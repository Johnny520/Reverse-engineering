// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing;

import c.ᐧᵎ.CLS266;
import java.util.List;

public enum DecodeHintType {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(CLS266.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);

    public final Class FLD1696;

    public DecodeHintType(Class class0) {
        this.FLD1696 = class0;
    }

    public Class getValueType() {
        return this.FLD1696;
    }
}

