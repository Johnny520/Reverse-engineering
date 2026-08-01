package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class InvalidFormatException extends DumpArchiveException {
    private static final long serialVersionUID = 1;
    protected long offset;

    public InvalidFormatException(long j) {
        super("there was an error decoding a tape segment header at offset " + j + ".");
        this.offset = j;
    }

    public long getOffset() {
        return this.offset;
    }

    public InvalidFormatException() {
        super("there was an error decoding a tape segment");
    }
}
