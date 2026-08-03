package org.simpleframework.xml.transform;

import org.simpleframework.xml.core.PersistenceException;

/* JADX INFO: loaded from: classes2.dex */
public class TransformException extends PersistenceException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TransformException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TransformException(Throwable th, String str, Object... objArr) {
        super(String.format(str, objArr), th);
    }
}
