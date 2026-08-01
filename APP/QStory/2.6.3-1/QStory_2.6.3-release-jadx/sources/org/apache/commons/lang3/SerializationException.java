package org.apache.commons.lang3;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class SerializationException extends RuntimeException {
    private static final long serialVersionUID = 4029025366392702726L;

    public SerializationException() {
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    public SerializationException(Throwable th) {
        super(th);
    }
}
