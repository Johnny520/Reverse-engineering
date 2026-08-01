package org.apache.commons.compress;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MemoryLimitException extends CompressException {
    private static final long serialVersionUID = 1;
    private final int memoryLimitKiB;
    private final long memoryNeededKiB;

    public MemoryLimitException(long j, int i) {
        super(buildMessage(j, i));
        this.memoryNeededKiB = j;
        this.memoryLimitKiB = i;
    }

    private static String buildMessage(long j, int i) {
        return String.format("%,d KiB of memory would be needed; limit was %,d KiB. If the file is not corrupt, consider increasing the memory limit.", Long.valueOf(j), Integer.valueOf(i));
    }

    public int getMemoryLimitInKb() {
        return this.memoryLimitKiB;
    }

    public long getMemoryNeededInKb() {
        return this.memoryNeededKiB;
    }

    @Deprecated
    public MemoryLimitException(long j, int i, Exception exc) {
        super(buildMessage(j, i), exc);
        this.memoryNeededKiB = j;
        this.memoryLimitKiB = i;
    }

    public MemoryLimitException(long j, int i, Throwable th) {
        super(buildMessage(j, i), th);
        this.memoryNeededKiB = j;
        this.memoryLimitKiB = i;
    }
}
