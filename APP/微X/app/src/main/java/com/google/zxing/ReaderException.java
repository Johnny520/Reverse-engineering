// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing;

public abstract class ReaderException extends Exception {
    public static final boolean FLD1712;
    public static final StackTraceElement[] FLD1713;

    static {
        ReaderException.FLD1712 = System.getProperty("surefire.test.class.path") != null;
        ReaderException.FLD1713 = new StackTraceElement[0];
    }

    public ReaderException() {
    }

    public ReaderException(Throwable throwable0) {
        super(throwable0);
    }

    @Override
    public final Throwable fillInStackTrace() {
        synchronized(this) {
        }
        return null;
    }
}

