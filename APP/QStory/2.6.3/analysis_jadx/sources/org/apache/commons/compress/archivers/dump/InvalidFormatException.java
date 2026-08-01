package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
