package org.simpleframework.xml.strategy;

import org.simpleframework.xml.core.PersistenceException;

/* JADX INFO: loaded from: classes2.dex */
public class CycleException extends PersistenceException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CycleException(String str, Object... objArr) {
        super(str, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CycleException(Throwable th, String str, Object... objArr) {
        super(th, str, objArr);
    }
}
