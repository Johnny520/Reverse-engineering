package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛲᛳᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0314 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1638;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2266 f1639;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1640;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1641;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1642 = 1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f1643;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f1644;

    public /* synthetic */ ViewOnClickListenerC0314(TextView textView, EditText editText, C2770 c2770, Context context, C1223 c1223, AlertDialog alertDialog) {
        this.f1640 = textView;
        this.f1643 = editText;
        this.f1641 = c2770;
        this.f1638 = context;
        this.f1639 = c1223;
        this.f1644 = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        int i = this.f1642;
        AlertDialog alertDialog = this.f1644;
        InterfaceC2266 interfaceC2266 = this.f1639;
        Object obj = this.f1638;
        Object obj2 = this.f1641;
        Object obj3 = this.f1643;
        Object obj4 = this.f1640;
        switch (i) {
            case 0:
                String str = (String) obj3;
                Activity activity = (Activity) obj2;
                C0172 c0172 = (C0172) obj;
                C1524 c1524 = (C1524) interfaceC2266;
                EditText editText = (EditText) ((C0119) obj4).f810;
                Editable text = editText.getText();
                String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0473.m1314(string).toString();
                if (string2 == null) {
                    string2 = AbstractC2328.m4341(-207528097645422L);
                }
                if (string2.equals(str)) {
                    ((InterfaceC2798) c0172.f997).mo2093(null);
                    alertDialog.dismiss();
                    c1524.mo731();
                    throw null;
                }
                editText.setError(AbstractC2328.m4341(-207532392612718L));
                editText.requestFocus();
                C0078 c0078 = C2604.f12804;
                C2604.m4681(activity, AbstractC2328.m4341(-207575342285678L));
                return;
            default:
                C2770 c2770 = (C2770) obj2;
                Context context = (Context) obj;
                String string3 = AbstractC0473.m1314(((TextView) obj4).getText().toString()).toString();
                String strM2001 = AbstractC0897.m2001((EditText) obj3);
                String str2 = c2770.f13510;
                String str3 = c2770.f13518;
                String str4 = c2770.f13509;
                String str5 = c2770.f13517;
                long j = c2770.f13512;
                long j2 = c2770.f13507;
                String str6 = c2770.f13508;
                String str7 = c2770.f13515;
                String str8 = c2770.f13513;
                String str9 = c2770.f13514;
                AbstractC2328.m4341(-321095622886254L);
                AbstractC2328.m4341(-321108507788142L);
                AbstractC2328.m4341(-321147162493806L);
                AbstractC2328.m4341(-321177227264878L);
                AbstractC2328.m4341(-321211587003246L);
                AbstractC2328.m4341(-321228766872430L);
                C2770 c27702 = new C2770(str2, string3, strM2001, str3, str4, str5, j, j2, str6, str7, str8, str9);
                C2133 c2133M3850 = C2133.f10546.m3850(context);
                C2732 c2732 = new C2732(context, (C1223) interfaceC2266, alertDialog, 12);
                AbstractC2328.m4341(-1140579677930350L);
                AbstractC2071.m3959((C2454) c2133M3850.f10553, null, new C1647(c2133M3850, c27702, c2732, (InterfaceC0274) null, 13), 3);
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0314(C0119 c0119, String str, Activity activity, C0172 c0172, AlertDialog alertDialog, C1524 c1524) {
        this.f1640 = c0119;
        this.f1643 = str;
        this.f1641 = activity;
        this.f1638 = c0172;
        this.f1644 = alertDialog;
        this.f1639 = c1524;
    }
}
