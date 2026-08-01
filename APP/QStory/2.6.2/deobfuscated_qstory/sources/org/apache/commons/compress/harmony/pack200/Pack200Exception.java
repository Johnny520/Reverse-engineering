package org.apache.commons.compress.harmony.pack200;

import org.apache.commons.compress.CompressException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class Pack200Exception extends CompressException {
    private static final long serialVersionUID = 5168177401552611803L;

    public Pack200Exception(String str) {
        super(str);
    }

    public Pack200Exception(String str, Throwable th) {
        super(str, th);
    }
}
