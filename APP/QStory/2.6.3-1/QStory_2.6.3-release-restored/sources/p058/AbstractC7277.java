package p058;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import org.json.JSONException;
import org.json.JSONObject;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p051.C7182;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7277 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12540(final String str, String str2, final String str3, final String str4, final String str5) {
        final String myuin = Hook_cookie.getMyuin();
        final String skey = Hook_cookie.getSkey();
        String strM12498 = C7182.m12498("listid=" + str3 + "&authkey=" + str + "&hb_from=0&grouptype=" + 1 + "&trans_seq=" + C7182.f17846 + "&groupuin=" + str4 + "&pay_flag=" + 0 + "&groupid=" + str4 + "&channel=" + str2 + "&name=" + URLEncoder.encode(Hook_cookie.getName(myuin)) + "&uin=" + myuin + "&senderuin=" + str5, "hb_pre_grapver=2.0&chv=3");
        Intent intentM7313 = AbstractC3889.m7313();
        Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBRequest"), new Object[0]);
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "cgiName", objM6846), "set", new Class[]{String.class}, new Object[]{"hb_pre_grap"});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "reqText", objM6846), "set", new Class[]{String.class}, new Object[]{strM12498});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "random", objM6846), "set", new Class[]{String.class}, new Object[]{Integer.toString(C7182.f17846)});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, "enType", objM6846), "set", new Class[]{Integer.TYPE}, new Object[]{0});
        intentM7313.putExtra("data", C7182.m12500((byte[]) objM6846.getClass().getSuperclass().getDeclaredMethod("toByteArray", null).invoke(objM6846, null)));
        XposedHelpers.callMethod(intentM7313, "setObserver", new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("mqq.observer.BusinessObserver")}, new InvocationHandler() { // from class: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世哲苏兰
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
                byte[] byteArray = ((Bundle) objArr[2]).getByteArray("data");
                Object objM68462 = AbstractC3738.m6846(AbstractC7166.m12425("tencent.im.qqwallet.QWalletHbPreGrab$QQHBReply"), new Object[0]);
                AbstractC7162.m12404(objM68462, "mergeFrom", new Class[]{byte[].class}, byteArray);
                JSONObject jSONObject = new JSONObject(C7182.m12499((String) XposedHelpers.callMethod(AbstractC7165.m12418(null, "rspText", objM68462), "get", new Object[0]), "hb_pre_grap"));
                if (jSONObject.optString("retcode").equals("0") && jSONObject.has("pre_grap_token")) {
                    String string = jSONObject.getString("pre_grap_token");
                    StringBuilder sb = new StringBuilder();
                    sb.append("authkey=");
                    sb.append(str);
                    sb.append("&hb_from=0&groupid=");
                    String str6 = str4;
                    sb.append(str6);
                    sb.append("&agreement=");
                    sb.append(0);
                    sb.append("&pay_flag=");
                    sb.append(0);
                    sb.append("&channel=");
                    sb.append(1);
                    sb.append("&pre_grap_token=");
                    sb.append(URLEncoder.encode(string));
                    sb.append("&senderuin=");
                    sb.append(str5);
                    sb.append("&listid=");
                    sb.append(str3);
                    sb.append("&skey_type=");
                    String str7 = skey;
                    sb.append((str7.length() <= 12 ? "2" : "0"));
                    sb.append("&grouptype=");
                    sb.append(1);
                    sb.append("&groupuin=");
                    sb.append(str6);
                    sb.append("&name=");
                    String str8 = myuin;
                    sb.append(URLEncoder.encode(Hook_cookie.getName(str8)));
                    sb.append("&uin=");
                    sb.append(str8);
                    sb.append("&skey=");
                    sb.append(str7);
                    C7182.f17846 = Integer.parseInt(new JSONObject(C7182.m12501(sb.toString(), str7)).getString("trans_seq"));
                }
                return null;
            }
        })});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), "startServlet", new Class[]{AbstractC7166.m12425("mqq.app.NewIntent")}, new Object[]{intentM7313});
    }
}
