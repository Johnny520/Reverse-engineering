package p042;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import lin.xposed.hook.util.qq.Hook_cookie;
import org.json.JSONException;
import org.json.JSONObject;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p035.C6353;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6450 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11982(final String str, final String str2, final String str3, final String str4, final String str5) {
        final String myuin = Hook_cookie.getMyuin();
        final String skey = Hook_cookie.getSkey();
        String strM11939 = C6353.m11939(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜呜呜喵喵") + str3 + AbstractC8405.m13972(475) + str + AbstractC8405.m13972(480) + 1 + AbstractC8405.m13972(476) + C6353.f17501 + AbstractC8405.m13972(468) + str4 + AbstractC8405.m13972(471) + 0 + AbstractC8405.m13972(459) + str4 + AbstractC8405.m13972(462) + str2 + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵呜喵呜喵喵喵呜") + URLEncoder.encode(Hook_cookie.getName(myuin)) + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵呜喵呜呜喵喵喵") + myuin + AbstractC8405.m13972(465) + str5, AbstractC8405.m13972(474));
        Intent intentM6753 = AbstractC3057.m6753();
        Object objM6286 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(415)), new Object[0]);
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC8405.m13972(418)});
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{strM11939});
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{Integer.toString(C6353.f17501)});
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{Integer.TYPE}, new Object[]{0});
        intentM6753.putExtra(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), C6353.m11941((byte[]) objM6286.getClass().getSuperclass().getDeclaredMethod(AbstractC8405.m13972(419), null).invoke(objM6286, null)));
        XposedHelpers.callMethod(intentM6753, AbstractC8405.m13972(421), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new Object[]{Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new InvocationHandler() { // from class: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世苏哲兰
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
                byte[] byteArray = ((Bundle) objArr[2]).getByteArray(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
                Object objM62862 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(450)), new Object[0]);
                XposedHelpers.callMethod(objM62862, AbstractC8405.m13972(451), new Class[]{byte[].class}, new Object[]{byteArray});
                JSONObject jSONObject = new JSONObject(C6353.m11940((String) XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM62862), AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Object[0]), AbstractC8405.m13972(418)));
                if (jSONObject.optString(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵喵")).equals(AbstractC8405.m13973("喵呜喵喵喵喵呜呜")) && jSONObject.has(AbstractC8405.m13972(477))) {
                    String string = jSONObject.getString(AbstractC8405.m13972(477));
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC8405.m13972(453));
                    sb.append(str);
                    sb.append(AbstractC8405.m13972(458));
                    sb.append(0);
                    sb.append(AbstractC8405.m13972(459));
                    sb.append(str4);
                    sb.append(AbstractC8405.m13972(462));
                    sb.append(str2);
                    sb.append(AbstractC8405.m13972(473));
                    sb.append(URLEncoder.encode(string));
                    sb.append(AbstractC8405.m13972(465));
                    String str6 = str5;
                    sb.append(str6);
                    sb.append(AbstractC8405.m13972(466));
                    sb.append(str3);
                    sb.append(AbstractC8405.m13972(394));
                    String str7 = skey;
                    sb.append(AbstractC8405.m13973(str7.length() <= 12 ? "喵呜喵喵喵喵喵呜" : "喵呜喵喵喵喵呜呜"));
                    sb.append(AbstractC8405.m13972(467));
                    sb.append(1);
                    sb.append(AbstractC8405.m13972(468));
                    sb.append(str6);
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵呜喵呜喵喵喵呜"));
                    String str8 = myuin;
                    sb.append(URLEncoder.encode(Hook_cookie.getName(str8)));
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜呜呜喵喵~喵呜喵呜喵喵喵呜"));
                    sb.append(str7);
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵呜喵呜呜喵喵喵"));
                    sb.append(str8);
                    C6353.f17501 = Integer.parseInt(new JSONObject(C6353.m11942(sb.toString(), str7)).getString(AbstractC8405.m13972(479)));
                }
                return null;
            }
        })});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(423), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(401))}, new Object[]{intentM6753});
    }
}
