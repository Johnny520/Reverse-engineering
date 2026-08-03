package p015b0;

import android.view.DisplayCutout;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* JADX INFO: renamed from: b0.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0132b0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m684B() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.DisplayCutout) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ DisplayCutout m690d(Object obj) {
        return (DisplayCutout) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.CharSequence), (r2v0 int), (r3v0 int) A[MD:(java.lang.CharSequence, int, int):void (c)] (LINE:3) call: android.view.textclassifier.TextClassification.Request.Builder.<init>(java.lang.CharSequence, int, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ TextClassification.Request.Builder m693g(CharSequence charSequence, int i9, int i10) {
        return new TextClassification.Request.Builder(charSequence, i9, i10);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String) A[MD:(java.lang.String, java.lang.String):void (c)] (LINE:3) call: android.view.textclassifier.TextClassificationContext.Builder.<init>(java.lang.String, java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ TextClassificationContext.Builder m696j(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.CharSequence), (r2v0 int), (r3v0 int) A[MD:(java.lang.CharSequence, int, int):void (c)] (LINE:3) call: android.view.textclassifier.TextSelection.Request.Builder.<init>(java.lang.CharSequence, int, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ TextSelection.Request.Builder m700n(CharSequence charSequence, int i9, int i10) {
        return new TextSelection.Request.Builder(charSequence, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m705s() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.view.DisplayCutout */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m710x(Object obj) {
        return obj instanceof DisplayCutout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m712z() {
    }
}
