package p055;

import android.view.View;
import android.widget.EditText;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p026.AbstractC7014;
import p303.AbstractC9234;
import p337.C9527;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC7235 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17921;

    public /* synthetic */ ViewOnLongClickListenerC7235(C9527 c9527) {
        this.f17921 = 3;
        this.f17920 = c9527;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f17921;
        Object obj = this.f17920;
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
                        AbstractC7014.m12151(AbstractC9234.m14531(242));
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
                        AbstractC7014.m12151(AbstractC9234.m14531(242));
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
                ((C9527) obj).f24866.m14993();
                break;
        }
        return true;
    }

    public /* synthetic */ ViewOnLongClickListenerC7235(Object obj, EditText editText, int i) {
        this.f17921 = i;
        this.f17920 = editText;
    }
}
