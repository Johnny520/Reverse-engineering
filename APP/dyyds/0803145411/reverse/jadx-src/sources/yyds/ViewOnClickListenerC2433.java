package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲇᛴᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2433 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11992;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0184 f11993;

    public /* synthetic */ ViewOnClickListenerC2433(C0184 c0184, int i) {
        this.f11992 = i;
        this.f11993 = c0184;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strM4341;
        Editable text;
        String string;
        int i = this.f11992;
        int i2 = 2;
        InterfaceC0274 interfaceC0274 = null;
        final int i3 = 1;
        C0184 c0184 = this.f11993;
        switch (i) {
            case 0:
                c0184.m769(EnumC2639.f13016);
                break;
            case 1:
                c0184.m769(EnumC2639.f13017);
                break;
            case 2:
                String str = c0184.f1071;
                if (str != null) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-129505721746286L).concat(str));
                    c0184.m768(str);
                }
                break;
            case 3:
                c0184.f1073 = !c0184.f1073;
                C2336.f11496.m4354(AbstractC2328.m4341(-129535786517358L).concat(AbstractC2328.m4341(c0184.f1073 ? -129565851288430L : -129578736190318L)));
                ImageView imageView = c0184.f1074;
                if (imageView != null) {
                    imageView.setImageResource(c0184.f1073 ? R.drawable.ic_sort_descending : R.drawable.ic_sort_ascending);
                }
                if (!c0184.f1080.isEmpty()) {
                    List list = c0184.f1080;
                    final C1300 c1300 = new C1300(7);
                    final C1300 c13002 = c0184.f1073 ? new C1300(9) : new C1300(8);
                    c0184.f1080 = AbstractC1595.m3272(list, new Comparator() { // from class: yyds.ᛱᲇᛱᛵ
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int iCompare = c1300.compare(obj, obj2);
                            return iCompare != 0 ? iCompare : c13002.compare(obj, obj2);
                        }
                    });
                    EditText editText = c0184.f1050;
                    if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null || (strM4341 = AbstractC0473.m1314(string).toString()) == null) {
                        strM4341 = AbstractC2328.m4341(-127688950580078L);
                    }
                    c0184.m770(strM4341);
                    break;
                }
                break;
            case 4:
                C2701 c2701 = C2701.f13261;
                C0184 c01842 = this.f11993;
                Context context = c01842.f1057;
                c2701.getClass();
                C2701.m4807(context);
                View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.dialog_api_key_input, (ViewGroup) null);
                EditText editText2 = (EditText) viewInflate.findViewById(R.id.et_api_key);
                TextView textView = (TextView) viewInflate.findViewById(R.id.btn_cancel);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.btn_save);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.btn_get_key);
                RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_api_type);
                RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_api_normal);
                RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_api_pro);
                C1509.f7142.getClass();
                editText2.setText((String) C1509.f7258.m1579(C1509.f7179[198]));
                int iM3131 = C1509.m3131();
                if (iM3131 == 1) {
                    radioButton.setChecked(true);
                } else if (iM3131 == 2) {
                    radioButton2.setChecked(true);
                }
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DouyinDialogStyle).setView(viewInflate).setCancelable(true).create();
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(android.R.color.transparent);
                }
                textView.setOnClickListener(new ViewOnClickListenerC0852(alertDialogCreate, 1));
                textView2.setOnClickListener(new ViewOnClickListenerC0257(editText2, radioGroup, alertDialogCreate, c01842, 1));
                textView3.setOnClickListener(new ViewOnClickListenerC2433(c01842, 10));
                alertDialogCreate.show();
                Window window2 = alertDialogCreate.getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawableResource(android.R.color.transparent);
                    WindowManager.LayoutParams attributes = window2.getAttributes();
                    attributes.width = AbstractC1426.m2904(300);
                    attributes.height = -2;
                    attributes.gravity = 17;
                    window2.setAttributes(attributes);
                }
                break;
            case 5:
                Context context2 = c0184.f1057;
                C1790 c1790 = new C1790(c0184, 0);
                AbstractC2328.m4341(-151453004628846L);
                AbstractC2328.m4341(-151487364367214L);
                C2701.f13261.getClass();
                C2701.m4807(context2);
                View viewInflate2 = AbstractC1115.m2309(context2).inflate(R.layout.dialog_tts_history, (ViewGroup) null);
                C1213 c1213 = (C1213) viewInflate2.findViewById(R.id.rv_history_list);
                LinearLayout linearLayout = (LinearLayout) viewInflate2.findViewById(R.id.layout_empty);
                ImageView imageView2 = (ImageView) viewInflate2.findViewById(R.id.iv_close);
                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.tv_clear_all);
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(context2, R.style.DouyinDialogStyle).setView(viewInflate2).setCancelable(true).create();
                Window window3 = alertDialogCreate2.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawableResource(android.R.color.transparent);
                }
                final C0074 c0074 = new C0074(context2, alertDialogCreate2, c1213, linearLayout, imageView2, textView4);
                AbstractC2328.m4341(-194763454841710L);
                c0074.f639 = c1790;
                alertDialogCreate2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yyds.ᛵᲁᛳᛸ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        int i4 = i3;
                        Object obj = c0074;
                        switch (i4) {
                            case 0:
                                C0184 c01843 = (C0184) obj;
                                c01843.m763();
                                C0289 c0289 = c01843.f1077;
                                if (c0289 != null) {
                                    c0289.mo2093(null);
                                }
                                break;
                            case 1:
                                ((C0074) obj).m461();
                                break;
                            default:
                                AbstractC1426.m2898((Activity) obj, false);
                                break;
                        }
                    }
                });
                alertDialogCreate2.show();
                Window window4 = alertDialogCreate2.getWindow();
                if (window4 != null) {
                    window4.setBackgroundDrawableResource(android.R.color.transparent);
                    WindowManager.LayoutParams attributes2 = window4.getAttributes();
                    attributes2.width = AbstractC1426.m2904(340);
                    attributes2.height = -2;
                    attributes2.gravity = 17;
                    window4.setAttributes(attributes2);
                }
                break;
            case 6:
                C0184 c01843 = this.f11993;
                if (!c01843.f1075) {
                    C1509.f7142.getClass();
                    C0668 c0668 = C1509.f7258;
                    InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                    String string2 = AbstractC0473.m1314((String) c0668.m1579(interfaceC1989Arr[198])).toString();
                    String strM2001 = AbstractC0897.m2001(c01843.f1082);
                    if (string2.length() == 0) {
                        AbstractC1960.m3789(AbstractC2328.m4341(-126353215751022L));
                    } else if (strM2001.length() != 0) {
                        Object selectedItem = c01843.f1059.getSelectedItem();
                        C2302 c2302 = selectedItem instanceof C2302 ? (C2302) selectedItem : null;
                        if (c2302 != null) {
                            String str2 = c2302.f11306;
                            AbstractC2328.m4341(-28814508458862L);
                            C1509.f7217.m1581(interfaceC1989Arr[199], str2);
                            AbstractC2071.m3959(c01843.f1076, null, new C1639(c01843, strM2001, c2302, string2, (InterfaceC0274) null), 3);
                        } else {
                            AbstractC1960.m3789(AbstractC2328.m4341(-126439115096942L));
                        }
                    } else {
                        AbstractC1960.m3789(AbstractC2328.m4341(-126396165423982L));
                    }
                    break;
                }
                break;
            case 7:
                ImageView imageView3 = c0184.f1068;
                MediaPlayer mediaPlayer = c0184.f1062;
                if (mediaPlayer != null) {
                    try {
                        if (c0184.f1067) {
                            mediaPlayer.pause();
                            imageView3.setImageResource(R.drawable.play);
                            c0184.f1067 = false;
                            c0184.m764();
                        } else {
                            C2615.f12860.getClass();
                            C2615.m4695();
                            mediaPlayer.start();
                            imageView3.setImageResource(R.drawable.pause);
                            c0184.f1067 = true;
                            c0184.m764();
                            c0184.f1081 = AbstractC2071.m3959(c0184.f1076, null, new C2318(c0184, interfaceC0274, i3), 3);
                        }
                    } catch (Exception e) {
                        C2336.f11496.m4358(AbstractC2328.m4341(-127542921692014L), e);
                        AbstractC1960.m3789(AbstractC2328.m4341(-127564396528494L) + e.getMessage());
                        return;
                    }
                    break;
                }
                break;
            case 8:
                c0184.m763();
                c0184.m764();
                c0184.f1058.setVisibility(8);
                c0184.f1060.setVisibility(0);
                c0184.f1049 = null;
                break;
            case 9:
                EditText editText3 = c0184.f1050;
                if (editText3 != null) {
                    editText3.setText(AbstractC2328.m4341(-129501426778990L));
                }
                if (editText3 != null) {
                    editText3.clearFocus();
                }
                break;
            case 10:
                try {
                    Intent intent = new Intent(AbstractC2328.m4341(-128646728287086L));
                    Uri uri = Uri.parse(AbstractC2328.m4341(-128762692404078L));
                    AbstractC2328.m4341(-128835706848110L);
                    intent.setData(uri);
                    intent.addFlags(268435456);
                    c0184.f1057.startActivity(intent);
                } catch (Exception e2) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-128882951488366L), e2);
                    AbstractC1960.m3789(AbstractC2328.m4341(-128917311226734L) + e2.getMessage());
                    return;
                }
                break;
            case 11:
                C2701 c27012 = C2701.f13261;
                Context context3 = c0184.f1057;
                c27012.getClass();
                C2701.m4807(context3);
                View viewInflate3 = AbstractC1115.m2309(context3).inflate(R.layout.dialog_directory_edit, (ViewGroup) null);
                EditText editText4 = (EditText) viewInflate3.findViewById(R.id.et_directory_path);
                TextView textView5 = (TextView) viewInflate3.findViewById(R.id.btn_cancel);
                TextView textView6 = (TextView) viewInflate3.findViewById(R.id.btn_save);
                String strM43412 = c0184.f1071;
                if (strM43412 == null) {
                    strM43412 = AbstractC2328.m4341(-125515697128302L);
                }
                editText4.setText(strM43412);
                AlertDialog alertDialogCreate3 = new AlertDialog.Builder(context3, R.style.DouyinDialogStyle).setView(viewInflate3).setCancelable(true).create();
                Window window5 = alertDialogCreate3.getWindow();
                if (window5 != null) {
                    window5.setBackgroundDrawableResource(android.R.color.transparent);
                }
                textView5.setOnClickListener(new ViewOnClickListenerC0852(alertDialogCreate3, 2));
                textView6.setOnClickListener(new ViewOnClickListenerC1192(editText4, c0184, alertDialogCreate3, i2));
                alertDialogCreate3.show();
                Window window6 = alertDialogCreate3.getWindow();
                if (window6 != null) {
                    window6.setBackgroundDrawableResource(android.R.color.transparent);
                    WindowManager.LayoutParams attributes3 = window6.getAttributes();
                    attributes3.width = AbstractC1426.m2904(300);
                    attributes3.height = -2;
                    attributes3.gravity = 17;
                    window6.setAttributes(attributes3);
                }
                break;
            case 12:
                c0184.m767();
                break;
            default:
                c0184.m767();
                break;
        }
    }
}
