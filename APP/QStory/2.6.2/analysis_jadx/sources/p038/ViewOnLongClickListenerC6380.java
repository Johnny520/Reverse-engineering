package p038;

import android.view.View;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p010.AbstractC6154;
import p324.C8748;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC6380 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f17519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17520;

    public /* synthetic */ ViewOnLongClickListenerC6380(C8748 c8748) {
        this.f17520 = 3;
        this.f17519 = c8748;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f17520;
        Object obj = this.f17519;
        switch (i) {
            case 0:
                EditText editText = (EditText) obj;
                String string = editText.getText().toString();
                if (!string.isEmpty()) {
                    try {
                        new JSONObject(string);
                        QQNTSendMsgUtils.sendCard(QQSessionUtils.getCurrentContact(), string);
                        editText.setText(AbstractC3056.m6668(-3937561979095614887L));
                    } catch (JSONException unused) {
                        AbstractC6154.m11561(AbstractC3056.m6668(-3937585403847247271L));
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
                        editText2.setText(AbstractC3056.m6668(-3937561979095614887L));
                    } catch (JSONException unused2) {
                        AbstractC6154.m11561(AbstractC3056.m6668(-3937585403847247271L));
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
                        editText3.setText(AbstractC3056.m6668(-3937561979095614887L));
                    } catch (JSONException unused3) {
                        return false;
                    }
                }
                break;
            default:
                ((C8748) obj).f24654.m14386();
                break;
        }
        return true;
    }

    public /* synthetic */ ViewOnLongClickListenerC6380(Object obj, EditText editText, int i) {
        this.f17520 = i;
        this.f17519 = editText;
    }
}
