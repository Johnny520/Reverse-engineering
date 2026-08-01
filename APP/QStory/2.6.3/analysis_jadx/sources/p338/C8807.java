package p338;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3055;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6185;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p043.C6453;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5929;

/* JADX INFO: renamed from: 飘花落叶言苏世楪哲子兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8807 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f24785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f24786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f24787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f24790 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(405)), new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f24791;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f24792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C5929 f24793;

    static {
        AbstractC8405.m13972(436);
        AbstractC8405.m13972(395);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14476(C5929 c5929) {
        Class clsM11866;
        int i;
        String string;
        this.f24793 = c5929;
        try {
            clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1115));
        } catch (Exception unused) {
            AbstractC6185.m11592(AbstractC8405.m13972(1116));
            clsM11866 = null;
        }
        String currentUin = QQEnvTool.getCurrentUin();
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC8405.m13972(424), null);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), this.f24788);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜~喵喵呜喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC8405.m13972(425), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC8405.m13972(426), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), this.f24785);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵呜"), String.valueOf(this.f24789));
        linkedHashMap.put(AbstractC8405.m13972(477), this.f24791);
        linkedHashMap.put(AbstractC8405.m13972(427), this.f24792);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), this.f24787);
        linkedHashMap.put(AbstractC8405.m13972(428), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        linkedHashMap.put(AbstractC8405.m13972(429), null);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), this.f24786);
        linkedHashMap.put(AbstractC8405.m13972(430), this.f24792);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        linkedHashMap.put(AbstractC8405.m13972(431), null);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), currentAccountNickName);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), currentUin);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜喵呜喵喵"), null);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵"), null);
        linkedHashMap.put(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜"));
                }
                sb.append((String) entry.getKey());
                sb.append(AbstractC8405.m13973("喵呜喵喵呜呜呜喵"));
                sb.append(str);
            }
        }
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(434));
        String str2 = (String) AbstractC6333.m11847(AbstractC6336.m11857(clsM118662, clsM118662, AbstractC8405.m13972(435)), AbstractC8405.m13972(437), String.class, new Class[]{String.class}, AbstractC8405.m13972(395));
        String myuin = Hook_cookie.getMyuin();
        int i2 = 436;
        Object objM6285 = AbstractC2905.m6285(new Object[]{AbstractC8405.m13972(436), str2, myuin}, new Class[]{String.class, String.class, String.class}, AbstractC6337.m11866(AbstractC8405.m13972(407)));
        Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(407));
        Class clsM118664 = AbstractC6337.m11866(AbstractC8405.m13972(408));
        Class clsM118665 = AbstractC6337.m11866(AbstractC8405.m13972(432));
        String strM13972 = AbstractC8405.m13972(433);
        Class cls = Boolean.TYPE;
        String strM139722 = AbstractC8405.m13972(395);
        Boolean bool = Boolean.TRUE;
        Object objM11847 = AbstractC6333.m11847(this.f24790, strM13972, clsM118665, new Class[]{String.class, clsM118663, Map.class, cls, cls, clsM118664}, strM139722, objM6285, linkedHashMap, bool, bool, null);
        Map map = (Map) AbstractC6333.m11846(Map.class, AbstractC8405.m13972(414), objM11847);
        Object objM6286 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(415)), new Object[0]);
        Class clsM118666 = AbstractC6337.m11866(AbstractC8405.m13972(416));
        String strM139723 = AbstractC8405.m13972(417);
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
                            sb2.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜"));
                        }
                        sb2.append((String) entry2.getKey());
                        sb2.append(AbstractC8405.m13973("喵呜喵喵呜呜呜喵"));
                        sb2.append(URLEncoder.encode(str3, AbstractC8405.m13973("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜")));
                        i2 = i;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    string = "";
                    Object objInvoke = AbstractC6333.m11843(clsM118666, clsM118666, strM139723, clsArr).invoke(null, string);
                    XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC8405.m13972(i)});
                    XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{clsM118666}, new Object[]{objInvoke});
                    byte[] bArrM6654 = AbstractC3055.m6654((byte[]) AbstractC6333.m11846(byte[].class, AbstractC8405.m13972(419), objM6286));
                    Intent intent = (Intent) AbstractC2905.m6285(new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(332)), null, AbstractC8405.m13972(402)), clsM11866}, new Class[]{Context.class, Class.class}, AbstractC6337.m11866(AbstractC8405.m13972(401)));
                    intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC8405.m13972(404));
                    intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM6654);
                    intent.putExtra(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
                    XposedHelpers.callMethod(intent, AbstractC8405.m13972(421), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new Object[]{Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new C6453(this, clsM118666, objM6285, objM11847, 1))});
                    XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(423), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(401))}, new Object[]{intent});
                }
            }
            i = i2;
            string = sb2.toString();
        } catch (UnsupportedEncodingException unused3) {
            i = i2;
        }
        Object objInvoke2 = AbstractC6333.m11843(clsM118666, clsM118666, strM139723, clsArr).invoke(null, string);
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC8405.m13972(i)});
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{clsM118666}, new Object[]{objInvoke2});
        byte[] bArrM66542 = AbstractC3055.m6654((byte[]) AbstractC6333.m11846(byte[].class, AbstractC8405.m13972(419), objM6286));
        Intent intent2 = (Intent) AbstractC2905.m6285(new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(332)), null, AbstractC8405.m13972(402)), clsM11866}, new Class[]{Context.class, Class.class}, AbstractC6337.m11866(AbstractC8405.m13972(401)));
        intent2.putExtra(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC8405.m13972(404));
        intent2.putExtra(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM66542);
        intent2.putExtra(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜"), 30000L);
        XposedHelpers.callMethod(intent2, AbstractC8405.m13972(421), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new Object[]{Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new C6453(this, clsM118666, objM6285, objM11847, 1))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(423), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(401))}, new Object[]{intent2});
    }
}
