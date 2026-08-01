package org.apache.commons.p014io;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class TaggedIOException extends IOExceptionWithCause {
    private static final long serialVersionUID = -6994123481142850163L;
    private final Serializable tag;

    public TaggedIOException(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.tag = serializable;
    }

    public static boolean isTaggedWith(Throwable th, Object obj) {
        return obj != null && (th instanceof TaggedIOException) && obj.equals(((TaggedIOException) th).tag);
    }

    public static void throwCauseIfTaggedWith(Throwable th, Object obj) throws IOException {
        if (isTaggedWith(th, obj)) {
            throw ((TaggedIOException) th).getCause();
        }
    }

    @Override // java.lang.Throwable
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }

    public Serializable getTag() {
        return this.tag;
    }
}
