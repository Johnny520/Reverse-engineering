package org.apache.commons.compress.archivers;

import java.util.function.Supplier;
import org.apache.commons.compress.CompressException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ArchiveException extends CompressException {
    private static final long serialVersionUID = 2772690708123267100L;

    public ArchiveException() {
    }

    public static <T> T requireNonNull(T t, Supplier<String> supplier) {
        return (T) CompressException.requireNonNull(ArchiveException.class, t, supplier);
    }

    public ArchiveException(String str) {
        super(str);
    }

    @Deprecated
    public ArchiveException(String str, Exception exc) {
        super(str, exc);
    }

    public ArchiveException(String str, Throwable th) {
        super(str, th);
    }

    public ArchiveException(Throwable th) {
        super(th);
    }
}
