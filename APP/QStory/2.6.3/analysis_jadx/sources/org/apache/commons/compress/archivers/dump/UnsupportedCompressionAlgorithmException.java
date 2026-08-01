package org.apache.commons.compress.archivers.dump;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedCompressionAlgorithmException extends DumpArchiveException {
    private static final long serialVersionUID = 1;

    public UnsupportedCompressionAlgorithmException(String str) {
        super(AbstractC0053.m158("this file uses an unsupported compression algorithm: ", str, "."));
    }

    public UnsupportedCompressionAlgorithmException() {
        super("this file uses an unsupported compression algorithm.");
    }
}
