package androidx.constraintlayout.core.state;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class ConstraintReference$IncorrectConstraintException extends Exception {
    private final ArrayList<String> mErrors;

    public ConstraintReference$IncorrectConstraintException(ArrayList<String> arrayList) {
        this.mErrors = arrayList;
    }

    public ArrayList<String> getErrors() {
        return this.mErrors;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "IncorrectConstraintException: " + this.mErrors.toString();
    }
}
