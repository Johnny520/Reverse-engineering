package p059;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.alibaba.fastjson2.AbstractC3738;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p051.C7182;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7281 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final String f18023 = AbstractC9234.m14531(395);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f18024;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f18025;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f18026;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f18027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f18028;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f18029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f18030 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(405)), new Object[0]);

    public RunnableC7281() {
        AbstractC9234.m14531(406);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            m12542();
        } catch (Exception e) {
            String strM14532 = AbstractC9234.m14532("喵喵呜呜呜喵呜呜~喵喵喵呜喵呜呜呜");
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC9234.m14531(438));
        sb.append(this.f18030);
        sb.append(AbstractC9234.m14531(439));
        AbstractC7012.m12137(sb, this.f18028, 440);
        sb.append(this.f18029);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(441));
        sb.append(this.f18025);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(442));
        sb.append(this.f18024);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(443));
        sb.append(this.f18026);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(444));
        sb.append(this.f18027);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(445));
        sb.append("null'");
        sb.append(AbstractC9234.m14531(446));
        sb.append("null'");
        sb.append(AbstractC9234.m14531(447));
        sb.append("null'}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12542() throws Throwable {
        String strEncode;
        String myuin = Hook_cookie.getMyuin();
        String name = Hook_cookie.getName(myuin);
        HashMap map = new HashMap();
        map.put(AbstractC9234.m14531(424), null);
        map.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), this.f18029);
        map.put(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜~喵喵呜喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC9234.m14531(425), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC9234.m14531(426), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), this.f18026);
        map.put(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵呜"), String.valueOf(this.f18028));
        map.put(AbstractC9234.m14531(427), this.f18027);
        map.put(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), this.f18025);
        map.put(AbstractC9234.m14531(428), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14531(429), null);
        map.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), this.f18024);
        map.put(AbstractC9234.m14531(430), this.f18027);
        map.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        map.put(AbstractC9234.m14531(431), null);
        map.put(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), name);
        map.put(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), myuin);
        map.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜喵呜喵喵"), null);
        map.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵"), null);
        map.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜"));
                }
                sb.append((String) entry.getKey());
                sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
                sb.append(URLEncoder.encode(str, AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜")));
            }
        }
        String strM14531 = AbstractC9234.m14531(395);
        Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(434));
        Object objM12416 = AbstractC7165.m12416(clsM12425, clsM12425, AbstractC9234.m14531(435));
        Object[] objArr = {AbstractC9234.m14531(436), (String) AbstractC7162.m12406(objM12416, AbstractC9234.m14531(437), String.class, new Class[]{String.class}, strM14531), Hook_cookie.getMyuin()};
        Object objM6845 = AbstractC3738.m6845(objArr, new Class[]{String.class, String.class, String.class}, AbstractC7166.m12425(AbstractC9234.m14531(407)));
        Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(407));
        Class clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(408));
        Class clsM124254 = AbstractC7166.m12425(AbstractC9234.m14531(432));
        String strM145312 = AbstractC9234.m14531(433);
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.TRUE;
        Object[] objArr2 = {f18023, objM6845, map, bool, bool, null};
        Object objM12406 = AbstractC7162.m12406(this.f18030, strM145312, clsM124254, new Class[]{String.class, clsM124252, Map.class, cls, cls, clsM124253}, objArr2);
        Map map2 = (Map) AbstractC7162.m12405(Map.class, AbstractC9234.m14531(414), objM12406);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : map2.entrySet()) {
            String str2 = (String) entry2.getValue();
            if (str2 != null) {
                if (sb2.length() > 0) {
                    sb2.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜"));
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    Charset charset = StandardCharsets.UTF_8;
                    strEncode = URLEncoder.encode(str2, StandardCharsets.UTF_8);
                } else {
                    strEncode = URLEncoder.encode(str2, AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜"));
                }
                sb2.append((String) entry2.getKey());
                sb2.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
                sb2.append(strEncode);
            }
        }
        String string = sb2.toString();
        Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(415)), new Object[0]);
        Class clsM124255 = AbstractC7166.m12425(AbstractC9234.m14531(416));
        Object objInvoke = AbstractC7162.m12402(clsM124255, clsM124255, AbstractC9234.m14531(417), new Class[]{String.class}).invoke(null, string);
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC9234.m14531(418)});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{clsM124255}, new Object[]{objInvoke});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{Integer.TYPE}, new Object[]{1});
        byte[] bArrM12500 = C7182.m12500((byte[]) AbstractC7162.m12405(byte[].class, AbstractC9234.m14531(419), objM6846));
        Class clsM124256 = AbstractC7166.m12425(AbstractC9234.m14531(401));
        Intent intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(332)), null, AbstractC9234.m14531(402)), AbstractC7166.m12425(AbstractC9234.m14531(420))}, new Class[]{Context.class, Class.class}, clsM124256);
        intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(404));
        intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM12500);
        XposedHelpers.callMethod(intent, AbstractC9234.m14531(421), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new C7282(this, clsM124255, objM6845, objM12406, 0))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(423), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(401))}, new Object[]{intent});
    }
}
