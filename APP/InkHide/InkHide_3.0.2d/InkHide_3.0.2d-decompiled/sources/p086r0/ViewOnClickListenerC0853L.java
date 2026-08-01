package p086r0;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import p027N0.C0228l;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p088s0.C0976J;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0853L implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2919c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2920d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2921e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2922f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0853L(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f2918b = i2;
        this.f2919c = obj;
        this.f2920d = obj2;
        this.f2921e = obj3;
        this.f2922f = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f2921e;
        Object obj2 = this.f2920d;
        Object obj3 = this.f2922f;
        Object obj4 = this.f2919c;
        switch (this.f2918b) {
            case 0:
                ((C0894d0) obj4).m1900k((String) obj2, (String) obj);
                ((PopupWindow) obj3).dismiss();
                break;
            case 1:
                Editable text = ((EditText) obj4).getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                Activity activity = (Activity) obj2;
                if (!AbstractC0307q.m534d0(string)) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (!string.equals(C1124g.m2435k().getTripleTapPassword())) {
                        AbstractC0503h.m977O(activity, "密码错误");
                    } else {
                        ((C0858M1) obj).getClass();
                        C0858M1.m1761j(activity);
                        ((AlertDialog) obj3).dismiss();
                    }
                } else {
                    AbstractC0503h.m977O(activity, "请输入密码");
                }
                break;
            default:
                C0976J.m2164m((String) obj2, (String) obj, (C0976J) obj4, (C0228l) obj3);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ ViewOnClickListenerC0853L(String str, String str2, C0976J c0976j, C0228l c0228l) {
        this.f2918b = 2;
        this.f2920d = str;
        this.f2921e = str2;
        this.f2919c = c0976j;
        this.f2922f = c0228l;
    }
}
