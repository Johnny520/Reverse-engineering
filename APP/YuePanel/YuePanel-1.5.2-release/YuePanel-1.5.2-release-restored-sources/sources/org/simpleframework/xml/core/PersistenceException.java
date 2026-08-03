package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
public class PersistenceException extends Exception {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PersistenceException(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PersistenceException(Throwable th, String str, Object... objArr) {
        super(String.format(str, objArr), th);
    }
}
