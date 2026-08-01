package p043;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.alibaba.fastjson2.AbstractC2905;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import lin.xposed.hook.util.qq.Hook_cookie;
import p009.AbstractC6183;
import p010.AbstractC6188;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p035.C6353;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6452 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final String f17678 = AbstractC8405.m13972(395);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f17679;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f17680;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f17681;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String f17682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f17684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f17685 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(405)), new Object[0]);

    public RunnableC6452() {
        AbstractC8405.m13972(406);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            m11983();
        } catch (Exception e) {
            String strM13973 = AbstractC8405.m13973("喵喵呜呜呜喵呜呜~喵喵喵呜喵呜呜呜");
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(438));
        sb.append(this.f17685);
        sb.append(AbstractC8405.m13972(439));
        AbstractC6183.m11578(sb, this.f17683, 440);
        sb.append(this.f17684);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(441));
        sb.append(this.f17680);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(442));
        sb.append(this.f17679);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(443));
        sb.append(this.f17681);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(444));
        sb.append(this.f17682);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(445));
        sb.append("null'");
        sb.append(AbstractC8405.m13972(446));
        sb.append("null'");
        sb.append(AbstractC8405.m13972(447));
        sb.append("null'}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11983() throws Throwable {
        String strEncode;
        String myuin = Hook_cookie.getMyuin();
        String name = Hook_cookie.getName(myuin);
        HashMap map = new HashMap();
        map.put(AbstractC8405.m13972(424), null);
        map.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵喵喵"), this.f17684);
        map.put(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜~喵喵呜喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵"), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC8405.m13972(425), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC8405.m13972(426), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), this.f17681);
        map.put(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜喵呜"), String.valueOf(this.f17683));
        map.put(AbstractC8405.m13972(427), this.f17682);
        map.put(AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), this.f17680);
        map.put(AbstractC8405.m13972(428), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13972(429), null);
        map.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"), this.f17679);
        map.put(AbstractC8405.m13972(430), this.f17682);
        map.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        map.put(AbstractC8405.m13972(431), null);
        map.put(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), name);
        map.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), myuin);
        map.put(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵喵~喵呜喵呜喵呜喵喵"), null);
        map.put(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵"), null);
        map.put(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵喵"), null);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜"));
                }
                sb.append((String) entry.getKey());
                sb.append(AbstractC8405.m13973("喵呜喵喵呜呜呜喵"));
                sb.append(URLEncoder.encode(str, AbstractC8405.m13973("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜")));
            }
        }
        String strM13972 = AbstractC8405.m13972(395);
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(434));
        Object objM11857 = AbstractC6336.m11857(clsM11866, clsM11866, AbstractC8405.m13972(435));
        Object[] objArr = {AbstractC8405.m13972(436), (String) AbstractC6333.m11847(objM11857, AbstractC8405.m13972(437), String.class, new Class[]{String.class}, strM13972), Hook_cookie.getMyuin()};
        Object objM6285 = AbstractC2905.m6285(objArr, new Class[]{String.class, String.class, String.class}, AbstractC6337.m11866(AbstractC8405.m13972(407)));
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(407));
        Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(408));
        Class clsM118664 = AbstractC6337.m11866(AbstractC8405.m13972(432));
        String strM139722 = AbstractC8405.m13972(433);
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.TRUE;
        Object[] objArr2 = {f17678, objM6285, map, bool, bool, null};
        Object objM11847 = AbstractC6333.m11847(this.f17685, strM139722, clsM118664, new Class[]{String.class, clsM118662, Map.class, cls, cls, clsM118663}, objArr2);
        Map map2 = (Map) AbstractC6333.m11846(Map.class, AbstractC8405.m13972(414), objM11847);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : map2.entrySet()) {
            String str2 = (String) entry2.getValue();
            if (str2 != null) {
                if (sb2.length() > 0) {
                    sb2.append(AbstractC8405.m13973("喵呜喵呜喵呜喵呜"));
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    Charset charset = StandardCharsets.UTF_8;
                    strEncode = URLEncoder.encode(str2, StandardCharsets.UTF_8);
                } else {
                    strEncode = URLEncoder.encode(str2, AbstractC8405.m13973("喵喵呜喵喵呜呜喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜呜喵喵~喵呜喵喵喵呜喵呜~喵呜喵呜呜呜喵呜"));
                }
                sb2.append((String) entry2.getKey());
                sb2.append(AbstractC8405.m13973("喵呜喵喵呜呜呜喵"));
                sb2.append(strEncode);
            }
        }
        String string = sb2.toString();
        Object objM6286 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(415)), new Object[0]);
        Class clsM118665 = AbstractC6337.m11866(AbstractC8405.m13972(416));
        Object objInvoke = AbstractC6333.m11843(clsM118665, clsM118665, AbstractC8405.m13972(417), new Class[]{String.class}).invoke(null, string);
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{String.class}, new Object[]{AbstractC8405.m13972(418)});
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜呜~喵喵呜喵呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵呜呜喵喵喵"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{clsM118665}, new Object[]{objInvoke});
        XposedHelpers.callMethod(AbstractC6336.m11859(null, AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵喵呜"), objM6286), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), new Class[]{Integer.TYPE}, new Object[]{1});
        byte[] bArrM11941 = C6353.m11941((byte[]) AbstractC6333.m11846(byte[].class, AbstractC8405.m13972(419), objM6286));
        Class clsM118666 = AbstractC6337.m11866(AbstractC8405.m13972(401));
        Intent intent = (Intent) AbstractC2905.m6285(new Object[]{AbstractC6336.m11857(AbstractC6337.m11866(AbstractC8405.m13972(332)), null, AbstractC8405.m13972(402)), AbstractC6337.m11866(AbstractC8405.m13972(420))}, new Class[]{Context.class, Class.class}, clsM118666);
        intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), AbstractC8405.m13972(404));
        intent.putExtra(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArrM11941);
        XposedHelpers.callMethod(intent, AbstractC8405.m13972(421), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new Object[]{Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(422))}, new C6453(this, clsM118665, objM6285, objM11847, 0))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC8405.m13972(423), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(401))}, new Object[]{intent});
    }
}
