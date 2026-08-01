package p058;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0946;
import java.util.ArrayList;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p049.AbstractC7165;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ArrayList f18002 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f18001 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12538(String str, String str2, String str3, String str4, String str5) {
        String myuin = Hook_cookie.getMyuin();
        String skey = Hook_cookie.getSkey();
        String strReplace = str4.replace("[QQ红包]", "");
        f18002.add(new C7276(str, str5, str2, str3, skey, strReplace, myuin));
        String str6 = f18001;
        if (str6.isEmpty()) {
            QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str5), strReplace);
        } else {
            QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str5), str6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12539(Object obj) {
        ArrayList<C7276> arrayList = f18002;
        try {
            long jLongValue = ((Long) AbstractC7165.m12418(Long.TYPE, "senderUin", obj)).longValue();
            Object obj2 = ((ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj)).get(0);
            if (((Integer) AbstractC7165.m12418(Integer.TYPE, "elementType", obj2)).intValue() == 1 && String.valueOf(jLongValue).equals(Hook_cookie.getMyuin())) {
                for (C7276 c7276 : arrayList) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0946(c7276, 17, obj), 0L);
                    arrayList.remove(c7276);
                }
            }
        } catch (Exception unused) {
        }
    }
}
