package defpackage;

import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p90 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void C() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.CharSequence), (r2v0 int), (r3v0 int) A[MD:(java.lang.CharSequence, int, int):void (c)] (LINE:3) call: android.view.textclassifier.TextClassification.Request.Builder.<init>(java.lang.CharSequence, int, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ TextClassification.Request.Builder f(CharSequence charSequence, int i, int i2) {
        return new TextClassification.Request.Builder(charSequence, i, i2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (c)] (LINE:3) call: android.view.textclassifier.TextClassificationContext.Builder.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ TextClassificationContext.Builder i(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.CharSequence), (r2v0 int), (r3v0 int) A[MD:(java.lang.CharSequence, int, int):void (c)] (LINE:3) call: android.view.textclassifier.TextSelection.Request.Builder.<init>(java.lang.CharSequence, int, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ TextSelection.Request.Builder m(CharSequence charSequence, int i, int i2) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void q() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void x() {
    }
}
