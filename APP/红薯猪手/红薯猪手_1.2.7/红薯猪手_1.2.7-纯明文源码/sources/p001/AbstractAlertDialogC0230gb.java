package p001;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۟.gb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAlertDialogC0230gb extends AbstractAlertDialogC0471ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final CharSequence f1484;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final Button f1485;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public final Button f1486;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public final Button f1487;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public InterfaceC0208f3<Boolean> f1488;

    /* JADX INFO: renamed from: ۥۡ */
    public InterfaceC0208f3<Boolean> f817;

    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public InterfaceC0208f3<C0433vb> f1489;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAlertDialogC0230gb(Context context, CharSequence charSequence) {
        super(context, 0);
        C0237h4.m1090("cxt", context);
        C0237h4.m1090("title", charSequence);
        final int i = 0;
        this.f1484 = charSequence;
        Button button = new Button(context);
        button.setText("取消");
        float f = AbstractAlertDialogC0471ya.f1880;
        button.setTextSize(f);
        int i2 = AbstractAlertDialogC0471ya.f1884;
        button.setTextColor(i2);
        button.setBackgroundColor(0);
        button.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.fb

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ AbstractAlertDialogC0230gb f800;

            {
                this.f800 = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb);
                        InterfaceC0208f3<C0433vb> interfaceC0208f3 = abstractAlertDialogC0230gb.f1489;
                        if (interfaceC0208f3 != null) {
                            interfaceC0208f3.mo7();
                        }
                        abstractAlertDialogC0230gb.dismiss();
                        break;
                    case 1:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb2 = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb2);
                        InterfaceC0208f3<Boolean> interfaceC0208f32 = abstractAlertDialogC0230gb2.f817;
                        if (interfaceC0208f32 != null) {
                            if (!(interfaceC0208f32.mo7().booleanValue())) {
                            }
                        }
                        abstractAlertDialogC0230gb2.dismiss();
                        break;
                    default:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb3 = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb3);
                        InterfaceC0208f3<Boolean> interfaceC0208f33 = abstractAlertDialogC0230gb3.f1488;
                        if (interfaceC0208f33 != null) {
                            if (!(interfaceC0208f33.mo7().booleanValue())) {
                            }
                        }
                        abstractAlertDialogC0230gb3.dismiss();
                        break;
                }
            }
        });
        final int i3 = 1;
        button.setLayoutParams(new LinearLayout.LayoutParams((int) C0167c4.m1038(1, 60.0f), -2));
        button.setGravity(17);
        int i4 = AbstractAlertDialogC0471ya.f1885;
        int i5 = AbstractAlertDialogC0471ya.f1878;
        button.setPadding(i4, i5, i4, i5);
        this.f1485 = button;
        Button button2 = new Button(context);
        button2.setText("确定");
        button2.setTextSize(f);
        button2.setTextColor(i2);
        button2.setBackgroundColor(0);
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.fb

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ AbstractAlertDialogC0230gb f800;

            {
                this.f800 = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb);
                        InterfaceC0208f3<C0433vb> interfaceC0208f3 = abstractAlertDialogC0230gb.f1489;
                        if (interfaceC0208f3 != null) {
                            interfaceC0208f3.mo7();
                        }
                        abstractAlertDialogC0230gb.dismiss();
                        break;
                    case 1:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb2 = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb2);
                        InterfaceC0208f3<Boolean> interfaceC0208f32 = abstractAlertDialogC0230gb2.f817;
                        if (interfaceC0208f32 != null) {
                            if (!(interfaceC0208f32.mo7().booleanValue())) {
                            }
                        }
                        abstractAlertDialogC0230gb2.dismiss();
                        break;
                    default:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb3 = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb3);
                        InterfaceC0208f3<Boolean> interfaceC0208f33 = abstractAlertDialogC0230gb3.f1488;
                        if (interfaceC0208f33 != null) {
                            if (!(interfaceC0208f33.mo7().booleanValue())) {
                            }
                        }
                        abstractAlertDialogC0230gb3.dismiss();
                        break;
                }
            }
        });
        button2.setLayoutParams(new LinearLayout.LayoutParams((int) C0167c4.m1038(1, 80.0f), -2));
        button2.setGravity(17);
        button2.setPadding(i4, i5, 0, i5);
        this.f1486 = button2;
        Button button3 = new Button(context);
        button3.setText("？？？");
        button3.setTextSize(f);
        button3.setTextColor(AbstractAlertDialogC0471ya.f1882);
        button3.setBackgroundColor(0);
        final int i6 = 2;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.fb

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ AbstractAlertDialogC0230gb f800;

            {
                this.f800 = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb);
                        InterfaceC0208f3<C0433vb> interfaceC0208f3 = abstractAlertDialogC0230gb.f1489;
                        if (interfaceC0208f3 != null) {
                            interfaceC0208f3.mo7();
                        }
                        abstractAlertDialogC0230gb.dismiss();
                        break;
                    case 1:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb2 = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb2);
                        InterfaceC0208f3<Boolean> interfaceC0208f32 = abstractAlertDialogC0230gb2.f817;
                        if (interfaceC0208f32 != null) {
                            if (!(interfaceC0208f32.mo7().booleanValue())) {
                            }
                        }
                        abstractAlertDialogC0230gb2.dismiss();
                        break;
                    default:
                        AbstractAlertDialogC0230gb abstractAlertDialogC0230gb3 = this.f800;
                        C0237h4.m1090("this$0", abstractAlertDialogC0230gb3);
                        InterfaceC0208f3<Boolean> interfaceC0208f33 = abstractAlertDialogC0230gb3.f1488;
                        if (interfaceC0208f33 != null) {
                            if (!(interfaceC0208f33.mo7().booleanValue())) {
                            }
                        }
                        abstractAlertDialogC0230gb3.dismiss();
                        break;
                }
            }
        });
        button3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        button3.setGravity(0);
        button3.setVisibility(8);
        button3.setPadding(i5, i5, 0, i5);
        this.f1487 = button3;
    }

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public static void m1077(AbstractAlertDialogC0230gb abstractAlertDialogC0230gb) {
        abstractAlertDialogC0230gb.getClass();
        "text";
        abstractAlertDialogC0230gb.f1487.setVisibility(0);
        if ("".length() > 0) {
            abstractAlertDialogC0230gb.f1487.setText("");
        }
    }

    @Override // p001.AbstractAlertDialogC0471ya, android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // p001.AbstractAlertDialogC0471ya
    /* JADX INFO: renamed from: ۥۣ۟ */
    public final View mo1046() {
        try {
            LinearLayout linearLayoutM1277 = m1277();
            View viewM1080 = m1080();
            if (viewM1080 != null) {
                linearLayoutM1277.addView(viewM1080);
            }
            Iterator<T> it = mo1003().iterator();
            while (it.hasNext()) {
                linearLayoutM1277.addView((View) it.next());
            }
            List<View> listMo1078 = mo1078();
            if (listMo1078 != null) {
                Iterator<T> it2 = listMo1078.iterator();
                while (it2.hasNext()) {
                    linearLayoutM1277.addView((View) it2.next());
                }
            }
            return linearLayoutM1277;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public List<View> mo1078() {
        LinearLayout linearLayout = new LinearLayout(this.f1217);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        linearLayout.addView(this.f1487);
        View view = new View(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        view.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        linearLayout.addView(this.f1485);
        linearLayout.addView(this.f1486);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(0, 0, AbstractAlertDialogC0471ya.f1885, 0);
        return C0272jb.m1105(linearLayout);
    }

    /* JADX INFO: renamed from: ۥ۟ۦ */
    public abstract List<View> mo1003();

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final Button m1079() {
        return this.f1487;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final View m1080() {
        if (TextUtils.isEmpty(this.f1484)) {
            return null;
        }
        String string = this.f1484.toString();
        C0237h4.m1090("title", string);
        RelativeLayout relativeLayout = new RelativeLayout(this.f1217);
        relativeLayout.setBackground(C0407tb.m944(C0407tb.m1249(10.0f), AbstractAlertDialogC0471ya.f1882));
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, C0407tb.m1249(55.0f)));
        TextView textViewM1279 = m1279(-1);
        textViewM1279.setId(291);
        textViewM1279.setText(string);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C0407tb.m1249(55.0f));
        layoutParams.addRule(9);
        relativeLayout.addView(textViewM1279, layoutParams);
        return relativeLayout;
    }

    /* JADX INFO: renamed from: ۥ۠ */
    public final void m858() {
        this.f1485.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public final void m1081(InterfaceC0208f3 interfaceC0208f3) {
        "action";
        this.f1489 = interfaceC0208f3;
    }

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public final void m1082(InterfaceC0208f3 interfaceC0208f3) {
        "action";
        this.f1488 = interfaceC0208f3;
    }

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public final void m1083(InterfaceC0208f3 interfaceC0208f3) {
        "action";
        this.f817 = interfaceC0208f3;
    }
}
