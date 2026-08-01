package top.suzhelan.qstory.hook.item;

import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import p026.AbstractC7014;
import p044.DialogC7148;
import p045.C7150;
import p303.AbstractC9234;
import p342.C9573;
import p407.C9924;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6742 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16434;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ DialogC7148 f16435;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ EditText f16436;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16437;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f16438;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16439;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16440;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f16441;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f16442;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f16444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16445 = 1;

    public /* synthetic */ ViewOnClickListenerC6742(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, EditText editText6, DialogC7148 dialogC7148) {
        this.f16443 = editText;
        this.f16444 = editText2;
        this.f16438 = editText3;
        this.f16437 = editText4;
        this.f16441 = editText5;
        this.f16442 = checkBox;
        this.f16439 = checkBox2;
        this.f16440 = checkBox3;
        this.f16434 = checkBox4;
        this.f16436 = editText6;
        this.f16435 = dialogC7148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16445;
        DialogC7148 dialogC7148 = this.f16435;
        EditText editText = this.f16436;
        Object obj = this.f16434;
        CheckBox checkBox = this.f16440;
        CheckBox checkBox2 = this.f16439;
        CheckBox checkBox3 = this.f16442;
        EditText editText2 = this.f16441;
        EditText editText3 = this.f16437;
        EditText editText4 = this.f16438;
        EditText editText5 = this.f16444;
        EditText editText6 = this.f16443;
        switch (i) {
            case 0:
                C6758 c6758 = (C6758) obj;
                String string = editText6.getText().toString();
                boolean zIsEmpty = TextUtils.isEmpty(string);
                C7150 c7150 = c6758.f16461;
                if (zIsEmpty) {
                    c7150.m12395(0L, AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                } else {
                    c7150.m12395(Long.valueOf(string), AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                }
                c6758.f16461.m12395(editText5.getText().toString(), AbstractC9234.m14531(1056));
                c6758.f16461.m12395(editText4.getText().toString(), AbstractC9234.m14531(1057));
                c6758.f16461.m12395(editText3.getText().toString(), AbstractC9234.m14531(1058));
                String string2 = editText2.getText().toString();
                boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                C7150 c71502 = c6758.f16461;
                if (zIsEmpty2) {
                    c71502.m12395(0L, AbstractC9234.m14531(1059));
                } else {
                    c71502.m12395(Long.valueOf(string2), AbstractC9234.m14531(1059));
                }
                String string3 = editText.getText().toString();
                boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                C7150 c71503 = c6758.f16461;
                if (zIsEmpty3) {
                    c71503.m12395(0L, AbstractC9234.m14531(1060));
                } else {
                    c71503.m12395(Long.valueOf(string3), AbstractC9234.m14531(1060));
                }
                c6758.f16461.m12395(Boolean.valueOf(checkBox3.isChecked()), AbstractC9234.m14531(1061));
                c6758.f16461.m12395(Boolean.valueOf(checkBox2.isChecked()), AbstractC9234.m14531(1062));
                c6758.f16461.m12395(Boolean.valueOf(checkBox.isChecked()), AbstractC9234.m14531(1063));
                c6758.f16461.mo12394();
                AbstractC7014.m12151(AbstractC9234.m14531(516));
                dialogC7148.dismiss();
                break;
            default:
                CheckBox checkBox4 = (CheckBox) obj;
                C9924 c9924 = C9573.f24989;
                AbstractC9234.m14531(1293);
                view.getClass();
                String string4 = editText6.getText().toString();
                if (TextUtils.isEmpty(string4)) {
                    c9924.m15236(0L, AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                } else {
                    c9924.m15236(Long.valueOf(Long.parseLong(string4)), AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵"));
                }
                c9924.m15236(editText5.getText().toString(), AbstractC9234.m14531(1056));
                c9924.m15236(editText4.getText().toString(), AbstractC9234.m14531(1057));
                c9924.m15236(editText3.getText().toString(), AbstractC9234.m14531(1058));
                String string5 = editText2.getText().toString();
                if (TextUtils.isEmpty(string5)) {
                    c9924.m15236(0L, AbstractC9234.m14531(1963));
                } else {
                    c9924.m15236(Long.valueOf(Long.parseLong(string5)), AbstractC9234.m14531(1963));
                }
                c9924.m15236(Boolean.valueOf(checkBox3.isChecked()), AbstractC9234.m14531(1061));
                c9924.m15236(Boolean.valueOf(checkBox2.isChecked()), AbstractC9234.m14531(1960));
                c9924.m15236(Boolean.valueOf(checkBox.isChecked()), AbstractC9234.m14531(1062));
                c9924.m15236(Boolean.valueOf(checkBox4.isChecked()), AbstractC9234.m14531(1063));
                String string6 = editText.getText().toString();
                if (TextUtils.isEmpty(string6)) {
                    c9924.m15236(0L, AbstractC9234.m14531(1060));
                } else {
                    c9924.m15236(Long.valueOf(Long.parseLong(string6)), AbstractC9234.m14531(1060));
                }
                AbstractC7014.m12151(AbstractC9234.m14531(516));
                dialogC7148.dismiss();
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6742(C6758 c6758, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, DialogC7148 dialogC7148) {
        this.f16434 = c6758;
        this.f16443 = editText;
        this.f16444 = editText2;
        this.f16438 = editText3;
        this.f16437 = editText4;
        this.f16441 = editText5;
        this.f16436 = editText6;
        this.f16442 = checkBox;
        this.f16439 = checkBox2;
        this.f16440 = checkBox3;
        this.f16435 = dialogC7148;
    }
}
