package androidx.constraintlayout.core.state;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
