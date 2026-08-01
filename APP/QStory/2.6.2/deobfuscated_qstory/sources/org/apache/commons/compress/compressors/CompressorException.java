package org.apache.commons.compress.compressors;

import org.apache.commons.compress.CompressException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CompressorException extends CompressException {
    private static final long serialVersionUID = -2932901310255908814L;

    public CompressorException(String str) {
        super(str);
    }

    public CompressorException(String str, Throwable th) {
        super(str, th);
    }
}
