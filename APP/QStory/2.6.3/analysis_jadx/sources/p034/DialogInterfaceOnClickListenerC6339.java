package p034;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.activity.AbstractC0053;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.ArrayList;
import p010.AbstractC6185;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6339 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f17464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17465;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17467;

    public /* synthetic */ DialogInterfaceOnClickListenerC6339(Object obj, Object obj2, Object obj3, int i) {
        this.f17467 = i;
        this.f17466 = obj;
        this.f17464 = obj2;
        this.f17465 = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f17467;
        Object obj = this.f17465;
        Object obj2 = this.f17464;
        Object obj3 = this.f17466;
        switch (i2) {
            case 0:
                AbstractC6347.m11915((Context) obj, (String) ((ArrayList) obj3).get(i), (String) ((ArrayList) obj2).get(i));
                break;
            case 1:
                RadioGroup radioGroup = (RadioGroup) obj2;
                Context context = (Context) obj;
                String string = ((EditText) obj3).getText().toString();
                if (TextUtils.isEmpty(string)) {
                    AbstractC6185.m11592(AbstractC8405.m13972(362));
                } else {
                    String strM151 = AbstractC0053.m151(new StringBuilder(), AbstractC6345.f17478, string);
                    if (new File(strM151).exists()) {
                        AbstractC6185.m11592(AbstractC8405.m13972(363));
                    } else {
                        new File(strM151).mkdirs();
                        ArrayList<String> arrayListM11893 = AbstractC6345.m11893();
                        radioGroup.removeAllViews();
                        for (String str : arrayListM11893) {
                            RadioButton radioButton = new RadioButton(context);
                            radioButton.setText(str);
                            radioButton.setTextSize(16.0f);
                            radioButton.setTextColor(context.getResources().getColor(R.color.font_plugin, null));
                            radioButton.setOnCheckedChangeListener(new C6342(str, 1));
                            radioGroup.addView(radioButton);
                        }
                    }
                }
                break;
            default:
                StringBuilder sb = new StringBuilder();
                String str2 = AbstractC6345.f17478;
                File file = new File(AbstractC0053.m151(sb, str2, (String) obj2));
                StringBuilder sbM140 = AbstractC0053.m140(str2);
                sbM140.append(((EditText) obj).getText().toString());
                file.renameTo(new File(sbM140.toString()));
                ((C6350) obj3).dismiss();
                break;
        }
    }
}
