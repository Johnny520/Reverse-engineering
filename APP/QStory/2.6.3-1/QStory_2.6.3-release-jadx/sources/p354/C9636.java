package p354;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3887;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7014;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p059.C7282;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6759;

/* JADX INFO: renamed from: 飘花落叶言苏世楪哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f25130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f25131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f25132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f25133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f25134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f25135 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(405)), new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f25136;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f25137;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C6759 f25138;

    static {
        AbstractC9234.m14531(436);
        AbstractC9234.m14531(395);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m15035(C6759 c6759) {
        Class clsM12425;
        int i;
        String string;
        this.f25138 = c6759;
        try {
            clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1115));
        } catch (Exception unused) {
            AbstractC7014.m12151(AbstractC9234.m14531(1116));
            clsM12425 = null;
        }
        String currentUin = QQEnvTool.getCurrentUin();
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC9234.m14531(424), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), this.f25133);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜~喵喵呜喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC9234.m14531(425), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC9234.m14531(426), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), this.f25130);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵呜"), String.valueOf(this.f25134));
        linkedHashMap.put(AbstractC9234.m14531(477), this.f25136);
        linkedHashMap.put(AbstractC9234.m14531(427), this.f25137);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), this.f25132);
        linkedHashMap.put(AbstractC9234.m14531(428), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        linkedHashMap.put(AbstractC9234.m14531(429), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), this.f25131);
        linkedHashMap.put(AbstractC9234.m14531(430), this.f25137);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        linkedHashMap.put(AbstractC9234.m14531(431), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), currentAccountNickName);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), currentUin);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜喵呜喵喵"), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵"), null);
        linkedHashMap.put(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜"));
                }
                sb.append((String) entry.getKey());
                sb.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
                sb.append(str);
            }
        }
        Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(434));
        String str2 = (String) AbstractC7162.m12406(AbstractC7165.m12416(clsM124252, clsM124252, AbstractC9234.m14531(435)), AbstractC9234.m14531(437), String.class, new Class[]{String.class}, AbstractC9234.m14531(395));
        String myuin = Hook_cookie.getMyuin();
        int i2 = 436;
        Object objM6845 = AbstractC3738.m6845(new Object[]{AbstractC9234.m14531(436), str2, myuin}, new Class[]{String.class, String.class, String.class}, AbstractC7166.m12425(AbstractC9234.m14531(407)));
        Class clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(407));
        Class clsM124254 = AbstractC7166.m12425(AbstractC9234.m14531(408));
        Class clsM124255 = AbstractC7166.m12425(AbstractC9234.m14531(432));
        String strM14531 = AbstractC9234.m14531(433);
        Class cls = Boolean.TYPE;
        String strM145312 = AbstractC9234.m14531(395);
        Boolean bool = Boolean.TRUE;
        Object objM12406 = AbstractC7162.m12406(this.f25135, strM14531, clsM124255, new Class[]{String.class, clsM124253, Map.class, cls, cls, clsM124254}, strM145312, objM6845, linkedHashMap, bool, bool, null);
        Map map = (Map) AbstractC7162.m12405(Map.class, AbstractC9234.m14531(414), objM12406);
        Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(415)), new Object[0]);
        Class clsM124256 = AbstractC7166.m12425(AbstractC9234.m14531(416));
        String strM145313 = AbstractC9234.m14531(417);
        Class[] clsArr = {String.class};
        try {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : map.entrySet()) {
                i = i2;
                try {
                    String str3 = (String) entry2.getValue();
                    if (str3 == null) {
                        i2 = i;
                    } else {
                        if (sb2.length() > 0) {
                            sb2.append(AbstractC9234.m14532("喵呜喵呜喵呜喵呜"));
                        }
                        sb2.append((String) entry2.getKey());
                        sb2.append(AbstractC9234.m14532("喵呜喵喵呜呜呜喵"));
                        sb2.append(URLEncoder.encode(str3, AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜")));
                        i2 = i;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    string = "";
                    Object objInvoke = AbstractC7162.m12402(clsM124256, clsM124256, strM145313, clsArr).invoke(null, string);
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC9234.m14531(i)});
                    XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{clsM124256}, new Object[]{objInvoke});
                    byte[] bArrM7214 = AbstractC3887.m7214((byte[]) AbstractC7162.m12405(byte[].class, AbstractC9234.m14531(419), objM6846));
                    Intent intent = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(332)), null, AbstractC9234.m14531(402)), clsM12425}, new Class[]{Context.class, Class.class}, AbstractC7166.m12425(AbstractC9234.m14531(401)));
                    intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(404));
                    intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM7214);
                    intent.putExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
                    XposedHelpers.callMethod(intent, AbstractC9234.m14531(421), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new C7282(this, clsM124256, objM6845, objM12406, 1))});
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(423), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(401))}, new Object[]{intent});
                }
            }
            i = i2;
            string = sb2.toString();
        } catch (UnsupportedEncodingException unused3) {
            i = i2;
        }
        Object objInvoke2 = AbstractC7162.m12402(clsM124256, clsM124256, strM145313, clsArr).invoke(null, string);
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC9234.m14531(i)});
        XposedHelpers.callMethod(AbstractC7165.m12418(null, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM6846), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{clsM124256}, new Object[]{objInvoke2});
        byte[] bArrM72142 = AbstractC3887.m7214((byte[]) AbstractC7162.m12405(byte[].class, AbstractC9234.m14531(419), objM6846));
        Intent intent2 = (Intent) AbstractC3738.m6845(new Object[]{AbstractC7165.m12416(AbstractC7166.m12425(AbstractC9234.m14531(332)), null, AbstractC9234.m14531(402)), clsM12425}, new Class[]{Context.class, Class.class}, AbstractC7166.m12425(AbstractC9234.m14531(401)));
        intent2.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC9234.m14531(404));
        intent2.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM72142);
        intent2.putExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
        XposedHelpers.callMethod(intent2, AbstractC9234.m14531(421), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new Object[]{Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(422))}, new C7282(this, clsM124256, objM6845, objM12406, 1))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC9234.m14531(423), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(401))}, new Object[]{intent2});
    }
}
