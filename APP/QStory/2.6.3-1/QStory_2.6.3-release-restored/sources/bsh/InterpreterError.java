package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class InterpreterError extends RuntimeException {
    public InterpreterError(String str) {
        super(str);
    }

    public InterpreterError(String str, Throwable th) {
        super(str, th);
    }
}
