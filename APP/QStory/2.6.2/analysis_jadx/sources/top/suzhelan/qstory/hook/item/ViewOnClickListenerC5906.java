package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import p010.AbstractC6154;
import p027.DialogC6300;
import p028.C6302;
import p322.C8726;
import p391.C9114;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5906 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16080;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ DialogC6300 f16081;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ EditText f16082;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16083;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f16084;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16085;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16086;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f16087;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16089;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f16090;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16091 = 1;

    public /* synthetic */ ViewOnClickListenerC5906(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, EditText editText6, DialogC6300 dialogC6300) {
        this.f16089 = editText;
        this.f16090 = editText2;
        this.f16084 = editText3;
        this.f16083 = editText4;
        this.f16087 = editText5;
        this.f16088 = checkBox;
        this.f16085 = checkBox2;
        this.f16086 = checkBox3;
        this.f16080 = checkBox4;
        this.f16082 = editText6;
        this.f16081 = dialogC6300;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16091;
        DialogC6300 dialogC6300 = this.f16081;
        EditText editText = this.f16082;
        Object obj = this.f16080;
        CheckBox checkBox = this.f16086;
        CheckBox checkBox2 = this.f16085;
        CheckBox checkBox3 = this.f16088;
        EditText editText2 = this.f16087;
        EditText editText3 = this.f16083;
        EditText editText4 = this.f16084;
        EditText editText5 = this.f16090;
        EditText editText6 = this.f16089;
        switch (i) {
            case 0:
                C5922 c5922 = (C5922) obj;
                String string = editText6.getText().toString();
                boolean zIsEmpty = TextUtils.isEmpty(string);
                C6302 c6302 = c5922.f16107;
                if (zIsEmpty) {
                    c6302.m11808(0L, AbstractC3056.m6668(-3937662610179360167L));
                } else {
                    c6302.m11808(Long.valueOf(string), AbstractC3056.m6668(-3937662610179360167L));
                }
                c5922.f16107.m11808(editText5.getText().toString(), AbstractC3056.m6668(-3937662532869948839L));
                c5922.f16107.m11808(editText4.getText().toString(), AbstractC3056.m6668(-3937662459855504807L));
                c5922.f16107.m11808(editText3.getText().toString(), AbstractC3056.m6668(-3937662485625308583L));
                String string2 = editText2.getText().toString();
                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                C6302 c63022 = c5922.f16107;
                if (zIsEmpty2) {
                    c63022.m11808(0L, AbstractC3056.m6668(-3937662425495766439L));
                } else {
                    c63022.m11808(Long.valueOf(string2), AbstractC3056.m6668(-3937662425495766439L));
                }
                String string3 = editText.getText().toString();
                boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                C6302 c63023 = c5922.f16107;
                if (zIsEmpty3) {
                    c63023.m11808(0L, AbstractC3056.m6668(-3937662300941714855L));
                } else {
                    c63023.m11808(Long.valueOf(string3), AbstractC3056.m6668(-3937662300941714855L));
                }
                c5922.f16107.m11808(Boolean.valueOf(checkBox3.isChecked()), AbstractC3056.m6668(-3937662253697074599L));
                c5922.f16107.m11808(Boolean.valueOf(checkBox2.isChecked()), AbstractC3056.m6668(-3937662296646747559L));
                c5922.f16107.m11808(Boolean.valueOf(checkBox.isChecked()), AbstractC3056.m6668(-3937662163502761383L));
                c5922.f16107.mo11807();
                AbstractC6154.m11561(AbstractC3056.m6668(-3937608798534108583L));
                dialogC6300.dismiss();
                break;
            default:
                CheckBox checkBox4 = (CheckBox) obj;
                C9114 c9114 = C8726.f24598;
                AbstractC3056.m6668(-3937690725035279783L);
                view.getClass();
                String string4 = editText6.getText().toString();
                if (TextUtils.isEmpty(string4)) {
                    c9114.m14640(0L, AbstractC3056.m6668(-3937662610179360167L));
                } else {
                    c9114.m14640(Long.valueOf(Long.parseLong(string4)), AbstractC3056.m6668(-3937662610179360167L));
                }
                c9114.m14640(editText5.getText().toString(), AbstractC3056.m6668(-3937662532869948839L));
                c9114.m14640(editText4.getText().toString(), AbstractC3056.m6668(-3937662459855504807L));
                c9114.m14640(editText3.getText().toString(), AbstractC3056.m6668(-3937662485625308583L));
                String string5 = editText2.getText().toString();
                if (TextUtils.isEmpty(string5)) {
                    c9114.m14640(0L, AbstractC3056.m6668(-3937758409424897447L));
                } else {
                    c9114.m14640(Long.valueOf(Long.parseLong(string5)), AbstractC3056.m6668(-3937758409424897447L));
                }
                c9114.m14640(Boolean.valueOf(checkBox3.isChecked()), AbstractC3056.m6668(-3937662253697074599L));
                c9114.m14640(Boolean.valueOf(checkBox2.isChecked()), AbstractC3056.m6668(-3937758619878294951L));
                c9114.m14640(Boolean.valueOf(checkBox.isChecked()), AbstractC3056.m6668(-3937662296646747559L));
                c9114.m14640(Boolean.valueOf(checkBox4.isChecked()), AbstractC3056.m6668(-3937662163502761383L));
                String string6 = editText.getText().toString();
                if (TextUtils.isEmpty(string6)) {
                    c9114.m14640(0L, AbstractC3056.m6668(-3937662300941714855L));
                } else {
                    c9114.m14640(Long.valueOf(Long.parseLong(string6)), AbstractC3056.m6668(-3937662300941714855L));
                }
                AbstractC6154.m11561(AbstractC3056.m6668(-3937608798534108583L));
                dialogC6300.dismiss();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC5906(C5922 c5922, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, DialogC6300 dialogC6300) {
        this.f16080 = c5922;
        this.f16089 = editText;
        this.f16090 = editText2;
        this.f16084 = editText3;
        this.f16083 = editText4;
        this.f16087 = editText5;
        this.f16082 = editText6;
        this.f16088 = checkBox;
        this.f16085 = checkBox2;
        this.f16086 = checkBox3;
        this.f16081 = dialogC6300;
    }
}
