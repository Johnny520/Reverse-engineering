package p042;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.RunnableC0099;
import java.util.ArrayList;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p033.AbstractC6336;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6446 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ArrayList f17657 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f17656 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11979(String str, String str2, String str3, String str4, String str5) {
        String myuin = Hook_cookie.getMyuin();
        String skey = Hook_cookie.getSkey();
        String strReplace = str4.replace(AbstractC8405.m13972(482), "");
        f17657.add(new C6447(str, str5, str2, str3, skey, strReplace, myuin));
        String str6 = f17656;
        if (str6.isEmpty()) {
            QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str5), strReplace);
        } else {
            QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(2, str5), str6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11980(Object obj) {
        ArrayList<C6447> arrayList = f17657;
        try {
            long jLongValue = ((Long) AbstractC6336.m11859(Long.TYPE, AbstractC8405.m13972(483), obj)).longValue();
            Object obj2 = ((ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj)).get(0);
            if (((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(338), obj2)).intValue() == 1 && String.valueOf(jLongValue).equals(Hook_cookie.getMyuin())) {
                for (C6447 c6447 : arrayList) {
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0099(c6447, 17, obj), 0L);
                    arrayList.remove(c6447);
                }
            }
        } catch (Exception unused) {
        }
    }
}
