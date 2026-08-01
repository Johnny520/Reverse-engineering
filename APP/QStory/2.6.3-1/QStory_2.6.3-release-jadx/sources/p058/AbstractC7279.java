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
import p049.AbstractC7165;
import p049.AbstractC7166;
import p051.C7182;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7279 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12541(final String str, final String str2, final String str3, final String str4, final String str5) {
        final String myuin = Hook_cookie.getMyuin();
        final String skey = Hook_cookie.getSkey();
        String strM12498 = C7182.m12498(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜呜呜喵喵") + str3 + AbstractC9234.m14531(475) + str + AbstractC9234.m14531(480) + 1 + AbstractC9234.m14531(476) + C7182.f17846 + AbstractC9234.m14531(468) + str4 + AbstractC9234.m14531(471) + 0 + AbstractC9234.m14531(459) + str4 + AbstractC9234.m14531(462) + str2 + AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵呜喵呜喵喵喵呜") + URLEncoder.encode(Hook_cookie.getName(myuin)) + AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵呜喵呜呜喵喵喵") + myuin + AbstractC9234.m14531(465) + str5, AbstractC9234.m14531(474));
        Intent intentM7313 = AbstractC3889.m7313();
        Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(415)), new Object[0]);
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC9234.m14531(418)});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{strM12498});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{Integer.toString(C7182.f17846)});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{Integer.TYPE}, new Object[]{0});
        intentM7313.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), C7182.m12500((byte[]) objM6846.getClass().getSuperclass().getDeclaredMethod(AbstractC9234.m14531(419), null).invoke(objM6846, null)));
        XposedHelpers.callMethod(intentM7313, AbstractC9234.m14531(421), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new InvocationHandler() { // from class: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世苏哲兰
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
                byte[] byteArray = ((Bundle) objArr[2]).getByteArray(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
                Object objM68462 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(450)), new Object[0]);
                XposedHelpers.callMethod(objM68462, AbstractC9234.m14531(451), new Class[]{byte[].class}, new Object[]{byteArray});
                JSONObject jSONObject = new JSONObject(C7182.m12499((String) XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), objM68462), AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Object[0]), AbstractC9234.m14531(418)));
                if (jSONObject.optString(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵喵")).equals(AbstractC9234.m14532("喵呜喵喵喵喵呜呜")) && jSONObject.has(AbstractC9234.m14531(477))) {
                    String string = jSONObject.getString(AbstractC9234.m14531(477));
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC9234.m14531(453));
                    sb.append(str);
                    sb.append(AbstractC9234.m14531(458));
                    sb.append(0);
                    sb.append(AbstractC9234.m14531(459));
                    sb.append(str4);
                    sb.append(AbstractC9234.m14531(462));
                    sb.append(str2);
                    sb.append(AbstractC9234.m14531(473));
                    sb.append(URLEncoder.encode(string));
                    sb.append(AbstractC9234.m14531(465));
                    String str6 = str5;
                    sb.append(str6);
                    sb.append(AbstractC9234.m14531(466));
                    sb.append(str3);
                    sb.append(AbstractC9234.m14531(394));
                    String str7 = skey;
                    sb.append(AbstractC9234.m14532(str7.length() <= 12 ? "喵呜喵喵喵喵喵呜" : "喵呜喵喵喵喵呜呜"));
                    sb.append(AbstractC9234.m14531(467));
                    sb.append(1);
                    sb.append(AbstractC9234.m14531(468));
                    sb.append(str6);
                    sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵呜喵呜喵喵喵呜"));
                    String str8 = myuin;
                    sb.append(URLEncoder.encode(Hook_cookie.getName(str8)));
                    sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜呜呜喵喵~喵呜喵呜喵喵喵呜"));
                    sb.append(str7);
                    sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵~喵呜喵呜呜喵喵喵"));
                    sb.append(str8);
                    C7182.f17846 = Integer.parseInt(new JSONObject(C7182.m12501(sb.toString(), str7)).getString(AbstractC9234.m14531(479)));
                }
                return null;
            }
        })});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(423), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(401))}, new Object[]{intentM7313});
    }
}
