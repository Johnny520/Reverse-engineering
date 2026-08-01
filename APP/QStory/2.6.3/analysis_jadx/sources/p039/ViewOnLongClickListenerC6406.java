package p039;

import android.view.View;
import android.widget.EditText;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p010.AbstractC6185;
import p287.AbstractC8405;
import p321.C8698;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC6406 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17576;

    public /* synthetic */ ViewOnLongClickListenerC6406(C8698 c8698) {
        this.f17576 = 3;
        this.f17575 = c8698;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f17576;
        Object obj = this.f17575;
        switch (i) {
            case 0:
                EditText editText = (EditText) obj;
                String string = editText.getText().toString();
                if (!string.isEmpty()) {
                    try {
                        new JSONObject(string);
                        QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), string);
                        editText.setText("");
                    } catch (JSONException unused) {
                        AbstractC6185.m11592(AbstractC8405.m13972(242));
                        return false;
                    }
                }
                break;
            case 1:
                EditText editText2 = (EditText) obj;
                String string2 = editText2.getText().toString();
                if (!string2.isEmpty()) {
                    try {
                        new JSONObject(string2);
                        QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), string2);
                        editText2.setText("");
                    } catch (JSONException unused2) {
                        AbstractC6185.m11592(AbstractC8405.m13972(242));
                        return false;
                    }
                }
                break;
            case 2:
                EditText editText3 = (EditText) obj;
                String string3 = editText3.getText().toString();
                if (!string3.isEmpty()) {
                    try {
                        new JSONObject(string3);
                        QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), string3);
                        editText3.setText("");
                    } catch (JSONException unused3) {
                        return false;
                    }
                }
                break;
            default:
                ((C8698) obj).f24521.m14434();
                break;
        }
        return true;
    }

    public /* synthetic */ ViewOnLongClickListenerC6406(Object obj, EditText editText, int i) {
        this.f17576 = i;
        this.f17575 = editText;
    }
}
