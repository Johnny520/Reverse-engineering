// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing;

public final class NotFoundException extends ReaderException {
    public static final NotFoundException FLD1711;

    static {
        NotFoundException notFoundException0 = new NotFoundException();
        NotFoundException.FLD1711 = notFoundException0;
        notFoundException0.setStackTrace(ReaderException.FLD1713);
    }

    public static NotFoundException getNotFoundInstance() {
        return NotFoundException.FLD1711;
    }
}

