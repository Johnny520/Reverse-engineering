package p033;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.ArrayList;
import p010.AbstractC6154;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6320 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17415;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17418;

    public /* synthetic */ DialogInterfaceOnClickListenerC6320(Object obj, Object obj2, Object obj3, int i) {
        this.f17418 = i;
        this.f17417 = obj;
        this.f17415 = obj2;
        this.f17416 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f17418;
        Object obj = this.f17416;
        Object obj2 = this.f17415;
        Object obj3 = this.f17417;
        switch (i2) {
            case 0:
                AbstractC6333.m11888((Context) obj, (String) ((ArrayList) obj3).get(i), (String) ((ArrayList) obj2).get(i));
                break;
            case 1:
                RadioGroup radioGroup = (RadioGroup) obj2;
                Context context = (Context) obj;
                String string = ((EditText) obj3).getText().toString();
                if (TextUtils.isEmpty(string)) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937590003757221287L));
                } else {
                    String strM146 = AbstractC0053.m146(new StringBuilder(), AbstractC6328.f17440, string);
                    if (new File(strM146).exists()) {
                        AbstractC6154.m11561(AbstractC3056.m6668(-3937589896383038887L));
                    } else {
                        new File(strM146).mkdirs();
                        ArrayList<String> arrayListM11884 = AbstractC6328.m11884();
                        radioGroup.removeAllViews();
                        for (String str : arrayListM11884) {
                            RadioButton radioButton = new RadioButton(context);
                            radioButton.setText(str);
                            radioButton.setTextSize(16.0f);
                            radioButton.setTextColor(context.getResources().getColor(R.color.font_plugin, null));
                            radioButton.setOnCheckedChangeListener(new C6323(str, 1));
                            radioGroup.addView(radioButton);
                        }
                    }
                }
                break;
            default:
                StringBuilder sb = new StringBuilder();
                String str2 = AbstractC6328.f17440;
                File file = new File(AbstractC0053.m146(sb, str2, (String) obj2));
                StringBuilder sbM149 = AbstractC0053.m149(str2);
                sbM149.append(((EditText) obj).getText().toString());
                file.renameTo(new File(sbM149.toString()));
                ((C6327) obj3).dismiss();
                break;
        }
    }
}
