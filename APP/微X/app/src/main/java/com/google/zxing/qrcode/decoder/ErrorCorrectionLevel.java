// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);

    public final int FLD1785;
    public static final ErrorCorrectionLevel[] FLD1786;

    static {
        ErrorCorrectionLevel.FLD1786 = new ErrorCorrectionLevel[]{ErrorCorrectionLevel.M, ErrorCorrectionLevel.L, ErrorCorrectionLevel.H, ErrorCorrectionLevel.Q};
    }

    public ErrorCorrectionLevel(int v1) {
        this.FLD1785 = v1;
    }

    public static ErrorCorrectionLevel forBits(int v) {
        if(v >= 0) {
            ErrorCorrectionLevel[] arr_errorCorrectionLevel = ErrorCorrectionLevel.FLD1786;
            if(v < arr_errorCorrectionLevel.length) {
                return arr_errorCorrectionLevel[v];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.FLD1785;
    }
}

