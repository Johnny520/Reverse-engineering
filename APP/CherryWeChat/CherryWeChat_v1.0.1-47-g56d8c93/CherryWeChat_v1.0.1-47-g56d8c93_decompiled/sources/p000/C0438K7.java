package p000;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: K7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0438K7 implements InterfaceC0579Nd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1437a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1438b;

    public /* synthetic */ C0438K7(View view, int i) {
        this.f1437a = i;
        this.f1438b = view;
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public final void mo244r(EditText editText) {
        int i = this.f1437a;
        View view = this.f1438b;
        switch (i) {
            case 0:
                String strValueOf = String.valueOf(editText.getText());
                try {
                    new SimpleDateFormat(strValueOf, Locale.getDefault());
                    SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-254055905490997L), strValueOf);
                    if (view instanceof C2748yA) {
                        ((C2748yA) view).setValue(strValueOf);
                    }
                } catch (Throwable unused) {
                    AbstractC0213Ey.m413k(-254025840719925L, view.getContext(), 0);
                    return;
                }
                break;
            case 1:
                String strValueOf2 = String.valueOf(editText.getText());
                if (strValueOf2.length() > 0 && !Pattern.compile(AbstractC0295Gu.m625r(-30580167145525L)).matcher(strValueOf2).matches()) {
                    AbstractC0213Ey.m413k(-30670361458741L, view.getContext(), 0);
                } else {
                    SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-30717606098997L), strValueOf2);
                    if (view instanceof C2748yA) {
                        ((C2748yA) view).setValue(strValueOf2);
                    }
                }
                break;
            case 2:
                String strValueOf3 = String.valueOf(editText.getText());
                if (strValueOf3.length() > 0) {
                    Float fValueOf = AbstractC2822zz.m5460E(strValueOf3) ? Float.valueOf(Float.parseFloat(strValueOf3)) : null;
                    if (fValueOf == null) {
                        AbstractC0213Ey.m413k(-27934467291189L, view.getContext(), 0);
                    }
                }
                SharedPreferences sharedPreferences3 = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-27973121996853L), strValueOf3);
                if (view instanceof C2748yA) {
                    ((C2748yA) view).setValue(strValueOf3);
                }
                break;
            default:
                String strValueOf4 = String.valueOf(editText.getText());
                try {
                    if (Integer.parseInt(strValueOf4) <= 60) {
                        SharedPreferences sharedPreferences4 = AbstractC0599Nx.f1939a;
                        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-14766097561653L), strValueOf4);
                        if (view instanceof C2748yA) {
                            ((C2748yA) view).setValue(strValueOf4);
                        }
                    } else {
                        Toast.makeText(view.getContext(), AbstractC0295Gu.m625r(-14705968019509L), 0).show();
                    }
                } catch (NumberFormatException unused2) {
                    AbstractC0213Ey.m413k(-14740327757877L, view.getContext(), 0);
                }
                break;
        }
    }
}
