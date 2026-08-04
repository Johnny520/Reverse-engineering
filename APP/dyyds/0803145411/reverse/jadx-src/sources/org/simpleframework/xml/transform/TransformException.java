package org.simpleframework.xml.transform;

import org.simpleframework.xml.core.PersistenceException;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class TransformException extends PersistenceException {
    public TransformException(Throwable th, String str, Object... objArr) {
        super(String.format(str, objArr), th);
    }

    public TransformException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }
}
