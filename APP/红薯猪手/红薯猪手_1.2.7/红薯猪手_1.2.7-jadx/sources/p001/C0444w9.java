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
        String strM915 = C0341oa.m915(new byte[]{52}, new byte[]{72, 4, 6, -47, 2, 34});
        alertDialogC0151b2.getClass();
        C0341oa.m915(new byte[]{90, -13, -63, -26}, new byte[]{46, -106, -71, -110, 58, 103});
        EditText editText = alertDialogC0151b2.f1333;
        if (editText == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{26, 60, -59, 104, 30, 120, 18, 1, -43}, new byte[]{119, 121, -95, 1, 106, 44}));
            throw null;
        }
        editText.setText(((Object) editText.getText()) + strM915);
        EditText editText2 = alertDialogC0151b2.f1333;
        if (editText2 != null) {
            editText2.setSelection(editText2.getText().length());
            return Boolean.FALSE;
        }
        C0237h4.m1092(C0341oa.m915(new byte[]{-23, 21, -39, 42, 84, -63, -31, 40, -55}, new byte[]{-124, 80, -67, 67, 32, -107}));
        throw null;
    }
}
