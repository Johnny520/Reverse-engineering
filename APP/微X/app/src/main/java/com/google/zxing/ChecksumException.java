// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing;

public final class ChecksumException extends ReaderException {
    public static final ChecksumException FLD1684;

    static {
        ChecksumException checksumException0 = new ChecksumException();
        ChecksumException.FLD1684 = checksumException0;
        checksumException0.setStackTrace(ReaderException.FLD1713);
    }

    public ChecksumException() {
    }

    public ChecksumException(Throwable throwable0) {
        super(throwable0);
    }

    // 去混淆评级： 低(20)
    public static ChecksumException getChecksumInstance() {
        return ReaderException.FLD1712 ? new ChecksumException() : ChecksumException.FLD1684;
    }

    // 去混淆评级： 低(20)
    public static ChecksumException getChecksumInstance(Throwable throwable0) {
        return ReaderException.FLD1712 ? new ChecksumException(throwable0) : ChecksumException.FLD1684;
    }
}

