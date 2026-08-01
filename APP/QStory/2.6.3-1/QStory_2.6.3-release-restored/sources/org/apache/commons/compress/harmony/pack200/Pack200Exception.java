package org.apache.commons.compress.harmony.pack200;

import org.apache.commons.compress.CompressException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
