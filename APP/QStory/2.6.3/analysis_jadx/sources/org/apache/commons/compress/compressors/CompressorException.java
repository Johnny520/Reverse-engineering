package org.apache.commons.compress.compressors;

import org.apache.commons.compress.CompressException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
