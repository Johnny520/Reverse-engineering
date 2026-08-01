// Decompiled by JEB v5.42.0.202606242140

package androidx.core.os;

public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String s) {
        if(s == null) {
            s = "The operation has been canceled.";
        }
        super(s);
    }
}

