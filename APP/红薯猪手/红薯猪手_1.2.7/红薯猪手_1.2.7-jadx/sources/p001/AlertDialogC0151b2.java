package p001;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.List;

/* JADX INFO: renamed from: ۟.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0151b2 extends AbstractAlertDialogC0230gb {

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final String f1330;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public final String f1331;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public final InterfaceC0222g3<String, Boolean> f1332;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public EditText f1333;

    /* JADX INFO: renamed from: ۟.b2$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Boolean mo7() {
            AlertDialogC0151b2 alertDialogC0151b2 = AlertDialogC0151b2.this;
            InterfaceC0222g3<String, Boolean> interfaceC0222g3 = alertDialogC0151b2.f1332;
            EditText editText = alertDialogC0151b2.f1333;
            if (editText == null) {
                C0237h4.m1092(C0341oa.m915(new byte[]{-2, 99, -5, -19, -50, 49, -10, 94, -21}, new byte[]{-109, 38, -97, -124, -70, 101}));
                throw null;
            }
            Editable text = editText.getText();
            C0237h4.m1089(C0341oa.m915(new byte[]{-116, 43, 59, -101, 15, 101, -97, 102, 97, -31, 68, 52}, new byte[]{-21, 78, 79, -49, 106, 29}), text);
            return interfaceC0222g3.mo984(C0432va.m1260(text).toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: ۟.g3<? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogC0151b2(Context context, String str, String str2, String str3, InterfaceC0222g3<? super String, Boolean> interfaceC0222g3) {
        super(context, str);
        C0237h4.m1090(C0341oa.m915(new byte[]{88, -16, 4}, new byte[]{59, -120, 112, -21, -103, 24}), context);
        C0237h4.m1090(C0341oa.m915(new byte[]{-81, -68, 80, -35, -26}, new byte[]{-37, -43, 36, -79, -125, 127}), str);
        C0237h4.m1090(C0341oa.m915(new byte[]{-14, 33, 17, -125, -82, 110, -22, 49, 12}, new byte[]{-122, 68, 105, -9, -8, 15}), str2);
        C0341oa.m915(new byte[]{45, 34, 46, 39}, new byte[]{69, 75, 64, 83, 76, 53});
        C0341oa.m915(new byte[]{-42, 121, 64, 6, -111, -37, -47, 101, 93, 13}, new byte[]{-91, 12, 50, 99, -48, -72});
        this.f1330 = str2;
        this.f1331 = str3;
        this.f1332 = interfaceC0222g3;
    }

    @Override // p001.AbstractAlertDialogC0230gb, p001.AbstractAlertDialogC0471ya, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131080);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(5);
        }
        m1083(new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0230gb
    /* JADX INFO: renamed from: ۥ۟ۦ */
    public final List<View> mo1003() {
        EditText editText = new EditText(this.f1217);
        editText.setTextSize(14.0f);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setBackgroundColor(0);
        editText.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        editText.setLayoutParams(layoutParams);
        editText.setSelected(true);
        if (!TextUtils.isEmpty(this.f1330)) {
            editText.setText(this.f1330);
        }
        this.f1333 = editText;
        editText.setHint(this.f1331);
        EditText editText2 = this.f1333;
        if (editText2 != null) {
            return C0272jb.m1105(editText2);
        }
        C0237h4.m1092(C0341oa.m915(new byte[]{-6, -120, -33, 96, 10, 1, -14, -75, -49}, new byte[]{-105, -51, -69, 9, 126, 85}));
        throw null;
    }
}
