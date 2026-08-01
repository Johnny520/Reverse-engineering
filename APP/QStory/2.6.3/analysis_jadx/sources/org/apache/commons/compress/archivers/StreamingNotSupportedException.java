package org.apache.commons.compress.archivers;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class StreamingNotSupportedException extends ArchiveException {
    private static final long serialVersionUID = 1;
    private final String format;

    public StreamingNotSupportedException(String str) {
        super(AbstractC0053.m158("The ", str, " doesn't support streaming."));
        this.format = str;
    }

    public String getFormat() {
        return this.format;
    }
}
