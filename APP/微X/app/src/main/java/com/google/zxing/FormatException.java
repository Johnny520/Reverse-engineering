// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing;

public final class FormatException extends ReaderException {
    public static final FormatException FLD1710;

    static {
        FormatException formatException0 = new FormatException();
        FormatException.FLD1710 = formatException0;
        formatException0.setStackTrace(ReaderException.FLD1713);
    }

    public FormatException() {
    }

    public FormatException(Throwable throwable0) {
        super(throwable0);
    }

    // 去混淆评级： 低(20)
    public static FormatException getFormatInstance() {
        return ReaderException.FLD1712 ? new FormatException() : FormatException.FLD1710;
    }

    // 去混淆评级： 低(20)
    public static FormatException getFormatInstance(Throwable throwable0) {
        return ReaderException.FLD1712 ? new FormatException(throwable0) : FormatException.FLD1710;
    }
}

