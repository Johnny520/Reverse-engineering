package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidFormatException extends TransformException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InvalidFormatException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public InvalidFormatException(Throwable th, String str, Object... objArr) {
        super(String.format(str, objArr), th);
    }
}
