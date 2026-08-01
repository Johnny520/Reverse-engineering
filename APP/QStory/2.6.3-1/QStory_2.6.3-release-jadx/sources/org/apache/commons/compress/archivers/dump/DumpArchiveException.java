package org.apache.commons.compress.archivers.dump;

import org.apache.commons.compress.archivers.ArchiveException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
