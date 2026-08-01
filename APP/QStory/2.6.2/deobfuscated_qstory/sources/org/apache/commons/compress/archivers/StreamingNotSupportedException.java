package org.apache.commons.compress.archivers;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class StreamingNotSupportedException extends ArchiveException {
    private static final long serialVersionUID = 1;
    private final String format;

    public StreamingNotSupportedException(String str) {
        super(AbstractC0053.m156("The ", str, " doesn't support streaming."));
        this.format = str;
    }

    public String getFormat() {
        return this.format;
    }
}
