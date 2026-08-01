package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.ArchiveException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class DumpArchiveException extends ArchiveException {
    private static final long serialVersionUID = 1;

    public DumpArchiveException() {
    }

    public DumpArchiveException(String str) {
        super(str);
    }

    public DumpArchiveException(String str, Throwable th) {
        super(str, th);
    }

    public DumpArchiveException(Throwable th) {
        super(th);
    }
}
