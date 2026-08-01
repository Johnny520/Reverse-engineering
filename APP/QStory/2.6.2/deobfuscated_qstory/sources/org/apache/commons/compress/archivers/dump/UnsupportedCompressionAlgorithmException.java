package org.apache.commons.compress.archivers.dump;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class UnsupportedCompressionAlgorithmException extends DumpArchiveException {
    private static final long serialVersionUID = 1;

    public UnsupportedCompressionAlgorithmException(String str) {
        super(AbstractC0053.m156("this file uses an unsupported compression algorithm: ", str, "."));
    }

    public UnsupportedCompressionAlgorithmException() {
        super("this file uses an unsupported compression algorithm.");
    }
}
