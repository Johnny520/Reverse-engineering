package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import p010.AbstractC6185;
import p028.DialogC6319;
import p029.C6321;
import p287.AbstractC8405;
import p326.C8744;
import p391.C9095;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5912 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16089;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ DialogC6319 f16090;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ EditText f16091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f16093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16094;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16095;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f16096;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16097;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f16099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16100 = 1;

    public /* synthetic */ ViewOnClickListenerC5912(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, EditText editText6, DialogC6319 dialogC6319) {
        this.f16098 = editText;
        this.f16099 = editText2;
        this.f16093 = editText3;
        this.f16092 = editText4;
        this.f16096 = editText5;
        this.f16097 = checkBox;
        this.f16094 = checkBox2;
        this.f16095 = checkBox3;
        this.f16089 = checkBox4;
        this.f16091 = editText6;
        this.f16090 = dialogC6319;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16100;
        DialogC6319 dialogC6319 = this.f16090;
        EditText editText = this.f16091;
        Object obj = this.f16089;
        CheckBox checkBox = this.f16095;
        CheckBox checkBox2 = this.f16094;
        CheckBox checkBox3 = this.f16097;
        EditText editText2 = this.f16096;
        EditText editText3 = this.f16092;
        EditText editText4 = this.f16093;
        EditText editText5 = this.f16099;
        EditText editText6 = this.f16098;
        switch (i) {
            case 0:
                C5928 c5928 = (C5928) obj;
                String string = editText6.getText().toString();
                boolean zIsEmpty = TextUtils.isEmpty(string);
                C6321 c6321 = c5928.f16116;
                if (zIsEmpty) {
                    c6321.m11836(0L, AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                } else {
                    c6321.m11836(Long.valueOf(string), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                }
                c5928.f16116.m11836(editText5.getText().toString(), AbstractC8405.m13972(1056));
                c5928.f16116.m11836(editText4.getText().toString(), AbstractC8405.m13972(1057));
                c5928.f16116.m11836(editText3.getText().toString(), AbstractC8405.m13972(1058));
                String string2 = editText2.getText().toString();
                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                C6321 c63212 = c5928.f16116;
                if (zIsEmpty2) {
                    c63212.m11836(0L, AbstractC8405.m13972(1059));
                } else {
                    c63212.m11836(Long.valueOf(string2), AbstractC8405.m13972(1059));
                }
                String string3 = editText.getText().toString();
                boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                C6321 c63213 = c5928.f16116;
                if (zIsEmpty3) {
                    c63213.m11836(0L, AbstractC8405.m13972(1060));
                } else {
                    c63213.m11836(Long.valueOf(string3), AbstractC8405.m13972(1060));
                }
                c5928.f16116.m11836(Boolean.valueOf(checkBox3.isChecked()), AbstractC8405.m13972(1061));
                c5928.f16116.m11836(Boolean.valueOf(checkBox2.isChecked()), AbstractC8405.m13972(1062));
                c5928.f16116.m11836(Boolean.valueOf(checkBox.isChecked()), AbstractC8405.m13972(1063));
                c5928.f16116.mo11835();
                AbstractC6185.m11592(AbstractC8405.m13972(516));
                dialogC6319.dismiss();
                break;
            default:
                CheckBox checkBox4 = (CheckBox) obj;
                C9095 c9095 = C8744.f24644;
                AbstractC8405.m13972(1293);
                view.getClass();
                String string4 = editText6.getText().toString();
                if (TextUtils.isEmpty(string4)) {
                    c9095.m14677(0L, AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                } else {
                    c9095.m14677(Long.valueOf(Long.parseLong(string4)), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                }
                c9095.m14677(editText5.getText().toString(), AbstractC8405.m13972(1056));
                c9095.m14677(editText4.getText().toString(), AbstractC8405.m13972(1057));
                c9095.m14677(editText3.getText().toString(), AbstractC8405.m13972(1058));
                String string5 = editText2.getText().toString();
                if (TextUtils.isEmpty(string5)) {
                    c9095.m14677(0L, AbstractC8405.m13972(1963));
                } else {
                    c9095.m14677(Long.valueOf(Long.parseLong(string5)), AbstractC8405.m13972(1963));
                }
                c9095.m14677(Boolean.valueOf(checkBox3.isChecked()), AbstractC8405.m13972(1061));
                c9095.m14677(Boolean.valueOf(checkBox2.isChecked()), AbstractC8405.m13972(1960));
                c9095.m14677(Boolean.valueOf(checkBox.isChecked()), AbstractC8405.m13972(1062));
                c9095.m14677(Boolean.valueOf(checkBox4.isChecked()), AbstractC8405.m13972(1063));
                String string6 = editText.getText().toString();
                if (TextUtils.isEmpty(string6)) {
                    c9095.m14677(0L, AbstractC8405.m13972(1060));
                } else {
                    c9095.m14677(Long.valueOf(Long.parseLong(string6)), AbstractC8405.m13972(1060));
                }
                AbstractC6185.m11592(AbstractC8405.m13972(516));
                dialogC6319.dismiss();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5912(C5928 c5928, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, DialogC6319 dialogC6319) {
        this.f16089 = c5928;
        this.f16098 = editText;
        this.f16099 = editText2;
        this.f16093 = editText3;
        this.f16092 = editText4;
        this.f16096 = editText5;
        this.f16091 = editText6;
        this.f16097 = checkBox;
        this.f16094 = checkBox2;
        this.f16095 = checkBox3;
        this.f16090 = dialogC6319;
    }
}
