package lin.util.ReflectUtils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
