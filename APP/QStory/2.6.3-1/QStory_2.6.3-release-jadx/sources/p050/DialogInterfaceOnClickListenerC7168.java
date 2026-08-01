package p050;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.AbstractC0900;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.File;
import java.util.ArrayList;
import p026.AbstractC7014;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7168 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17812;

    public /* synthetic */ DialogInterfaceOnClickListenerC7168(Object obj, Object obj2, Object obj3, int i) {
        this.f17812 = i;
        this.f17811 = obj;
        this.f17809 = obj2;
        this.f17810 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f17812;
        Object obj = this.f17810;
        Object obj2 = this.f17809;
        Object obj3 = this.f17811;
        switch (i2) {
            case 0:
                AbstractC7176.m12474((Context) obj, (String) ((ArrayList) obj3).get(i), (String) ((ArrayList) obj2).get(i));
                break;
            case 1:
                RadioGroup radioGroup = (RadioGroup) obj2;
                Context context = (Context) obj;
                String string = ((EditText) obj3).getText().toString();
                if (TextUtils.isEmpty(string)) {
                    AbstractC7014.m12151(AbstractC9234.m14531(362));
                } else {
                    String strM711 = AbstractC0900.m711(new StringBuilder(), AbstractC7174.f17823, string);
                    if (new File(strM711).exists()) {
                        AbstractC7014.m12151(AbstractC9234.m14531(363));
                    } else {
                        new File(strM711).mkdirs();
                        ArrayList<String> arrayListM12452 = AbstractC7174.m12452();
                        radioGroup.removeAllViews();
                        for (String str : arrayListM12452) {
                            RadioButton radioButton = new RadioButton(context);
                            radioButton.setText(str);
                            radioButton.setTextSize(16.0f);
                            radioButton.setTextColor(context.getResources().getColor(C0328R.color.font_plugin, null));
                            radioButton.setOnCheckedChangeListener(new C7171(str, 1));
                            radioGroup.addView(radioButton);
                        }
                    }
                }
                break;
            default:
                StringBuilder sb = new StringBuilder();
                String str2 = AbstractC7174.f17823;
                File file = new File(AbstractC0900.m711(sb, str2, (String) obj2));
                StringBuilder sbM700 = AbstractC0900.m700(str2);
                sbM700.append(((EditText) obj).getText().toString());
                file.renameTo(new File(sbM700.toString()));
                ((C7179) obj3).dismiss();
                break;
        }
    }
}
