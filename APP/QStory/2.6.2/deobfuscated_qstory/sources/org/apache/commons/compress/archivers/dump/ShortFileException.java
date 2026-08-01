package org.apache.commons.compress.archivers.dump;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ShortFileException extends DumpArchiveException {
    private static final long serialVersionUID = 1;

    public ShortFileException() {
        super("unexpected EOF");
    }
}
