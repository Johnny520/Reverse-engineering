package p041;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0099;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p032.AbstractC6317;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6436 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ArrayList f17637 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f17636 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11935(String str, String str2, String str3, String str4, String str5) {
        String myuin = Hook_cookie.getMyuin();
        String skey = Hook_cookie.getSkey();
        String strReplace = str4.replace("[QQ\u7ea2\u5305]", "");
        f17637.add(new C6437(str, str5, str2, str3, skey, strReplace, myuin));
        String str6 = f17636;
        if (str6.isEmpty()) {
            QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str5), strReplace);
        } else {
            QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str5), str6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11936(Object obj) {
        ArrayList<C6437> arrayList = f17637;
        try {
            long jLongValue = ((Long) AbstractC6317.m11831(Long.TYPE, "senderUin", obj)).longValue();
            Object obj2 = ((ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj)).get(0);
            if (((Integer) AbstractC6317.m11831(Integer.TYPE, "elementType", obj2)).intValue() == 1 && String.valueOf(jLongValue).equals(Hook_cookie.getMyuin())) {
                for (C6437 c6437 : arrayList) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c6437, 17, obj), 0L);
                    arrayList.remove(c6437);
                }
            }
        } catch (Exception unused) {
        }
    }
}
