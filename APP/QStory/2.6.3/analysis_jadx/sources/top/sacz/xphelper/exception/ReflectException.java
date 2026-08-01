package top.sacz.xphelper.exception;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ReflectException extends RuntimeException {
    private Exception otherExceptions;

    public ReflectException(String str, Exception exc) {
        super(str);
        this.otherExceptions = exc;
    }

    public Exception getOtherExceptions() {
        return this.otherExceptions;
    }

    public boolean hasOtherExceptions() {
        return this.otherExceptions != null;
    }

    public ReflectException(String str) {
        super(str);
    }

    public ReflectException() {
    }
}
