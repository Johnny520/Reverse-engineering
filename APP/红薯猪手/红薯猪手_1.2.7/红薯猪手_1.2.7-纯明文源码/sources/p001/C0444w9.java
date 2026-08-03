package p001;

import android.widget.EditText;

/* JADX INFO: renamed from: ۟.w9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0444w9 extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0151b2 f1177;

    public C0444w9(AlertDialogC0151b2 alertDialogC0151b2) {
        this.f1177 = alertDialogC0151b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final Boolean mo7() {
        AlertDialogC0151b2 alertDialogC0151b2 = this.f1177;
        String strM915 = "|";
        alertDialogC0151b2.getClass();
        "text";
        EditText editText = alertDialogC0151b2.f1333;
        if (editText == null) {
            C0237h4.m1092("mEditText");
            throw null;
        }
        editText.setText(((Object) editText.getText()) + strM915);
        EditText editText2 = alertDialogC0151b2.f1333;
        if (editText2 != null) {
            editText2.setSelection(editText2.getText().length());
            return Boolean.FALSE;
        }
        C0237h4.m1092("mEditText");
        throw null;
    }
}
