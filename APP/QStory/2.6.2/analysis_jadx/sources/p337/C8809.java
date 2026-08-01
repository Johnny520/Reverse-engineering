package p337;

import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XposedHelpers;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p000.AbstractC6087;
import p010.AbstractC6154;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p042.C6443;
import top.suzhelan.qstory.hook.item.C5923;

/* JADX INFO: renamed from: 飘花落叶言苏世楪哲兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8809 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public String f24787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public String f24788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f24789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f24792 = AbstractC6087.m11392(AbstractC6318.m11838(AbstractC3056.m6668(-3937601153492321703L)), new Object[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public String f24793;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public String f24794;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C5923 f24795;

    static {
        AbstractC3056.m6668(-3937614656869500327L);
        AbstractC3056.m6668(-3937602527881856423L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14453(C5923 c5923) {
        Class clsM11838;
        long j;
        String strM6668;
        long j2;
        this.f24795 = c5923;
        try {
            clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937675112829158823L));
        } catch (Exception unused) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937674945325434279L));
            clsM11838 = null;
        }
        String currentUin = QQEnvTool.getCurrentUin();
        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC3056.m6668(-3937598280159200679L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937598288749135271L), this.f24790);
        linkedHashMap.put(AbstractC3056.m6668(-3937598185669920167L), AbstractC3056.m6668(-3937561652678100391L));
        linkedHashMap.put(AbstractC3056.m6668(-3937598220029658535L), AbstractC3056.m6668(-3937561652678100391L));
        linkedHashMap.put(AbstractC3056.m6668(-3937598125540378023L), AbstractC3056.m6668(-3937561652678100391L));
        linkedHashMap.put(AbstractC3056.m6668(-3937598164195083687L), this.f24787);
        linkedHashMap.put(AbstractC3056.m6668(-3937598061115868583L), String.valueOf(this.f24791));
        linkedHashMap.put(AbstractC3056.m6668(-3937611800716248487L), this.f24793);
        linkedHashMap.put(AbstractC3056.m6668(-3937598095475606951L), this.f24794);
        linkedHashMap.put(AbstractC3056.m6668(-3937598035346064807L), this.f24789);
        linkedHashMap.put(AbstractC3056.m6668(-3937597927971882407L), AbstractC3056.m6668(-3937595638754313639L));
        linkedHashMap.put(AbstractC3056.m6668(-3937597970921555367L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597854957438375L), this.f24788);
        linkedHashMap.put(AbstractC3056.m6668(-3937597885022209447L), this.f24794);
        linkedHashMap.put(AbstractC3056.m6668(-3937597786237961639L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597816302732711L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597717518484903L), currentAccountNickName);
        linkedHashMap.put(AbstractC3056.m6668(-3937586675157566887L), currentUin);
        linkedHashMap.put(AbstractC3056.m6668(-3937597738993321383L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597635914106279L), null);
        linkedHashMap.put(AbstractC3056.m6668(-3937597670273844647L), null);
        StringBuilder sb = new StringBuilder();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            j = -3937589638685001127L;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getValue();
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append(AbstractC3056.m6668(-3937589638685001127L));
                }
                sb.append((String) entry.getKey());
                sb.append(AbstractC3056.m6668(-3937597597259400615L));
                sb.append(str);
            }
        }
        Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937614820078257575L));
        String str2 = (String) AbstractC6314.m11819(AbstractC6317.m11829(clsM118382, clsM118382, AbstractC3056.m6668(-3937614618214794663L)), AbstractC3056.m6668(-3937614588150023591L), String.class, new Class[]{String.class}, AbstractC3056.m6668(-3937602527881856423L));
        String myuin = Hook_cookie.getMyuin();
        Object objM11389 = AbstractC6087.m11389(new Object[]{AbstractC3056.m6668(-3937614656869500327L), str2, myuin}, new Class[]{String.class, String.class, String.class}, AbstractC6318.m11838(AbstractC3056.m6668(-3937600440527750567L)));
        Class clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937600440527750567L));
        Class clsM118384 = AbstractC6318.m11838(AbstractC3056.m6668(-3937600200009581991L));
        Class clsM118385 = AbstractC6318.m11838(AbstractC3056.m6668(-3937597571489596839L));
        String strM66682 = AbstractC3056.m6668(-3937614893092701607L);
        Class cls = Boolean.TYPE;
        String strM66683 = AbstractC3056.m6668(-3937602527881856423L);
        Boolean bool = Boolean.TRUE;
        Object objM11819 = AbstractC6314.m11819(this.f24792, strM66682, clsM118385, new Class[]{String.class, clsM118383, Map.class, cls, cls, clsM118384}, strM66683, objM11389, linkedHashMap, bool, bool, null);
        Map map = (Map) AbstractC6314.m11818(Map.class, AbstractC3056.m6668(-3937599358195991975L), objM11819);
        Object objM11392 = AbstractC6087.m11392(AbstractC6318.m11838(AbstractC3056.m6668(-3937599306656384423L)), new Object[0]);
        Class clsM118386 = AbstractC6318.m11838(AbstractC3056.m6668(-3937599104792921511L));
        String strM66684 = AbstractC3056.m6668(-3937599001713706407L);
        Class[] clsArr = {String.class};
        try {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : map.entrySet()) {
                String str3 = (String) entry2.getValue();
                if (str3 != null) {
                    if (sb2.length() > 0) {
                        j2 = j;
                        sb2.append(AbstractC3056.m6668(j2));
                    } else {
                        j2 = j;
                    }
                    sb2.append((String) entry2.getKey());
                    sb2.append(AbstractC3056.m6668(-3937597597259400615L));
                    sb2.append(URLEncoder.encode(str3, AbstractC3056.m6668(-3937557589639038375L)));
                    j = j2;
                }
            }
            strM6668 = sb2.toString();
        } catch (UnsupportedEncodingException unused2) {
            strM6668 = AbstractC3056.m6668(-3937561979095614887L);
        }
        Object objInvoke = AbstractC6314.m11815(clsM118386, clsM118386, strM66684, clsArr).invoke(null, strM6668);
        XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937598885749589415L), objM11392), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{AbstractC3056.m6668(-3937614656869500327L)});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937598851389851047L), objM11392), AbstractC3056.m6668(-3937598920109327783L), new Class[]{clsM118386}, new Object[]{objInvoke});
        byte[] bArrM6834 = AbstractC3065.m6834((byte[]) AbstractC6314.m11818(byte[].class, AbstractC3056.m6668(-3937598778375407015L), objM11392));
        Intent intent = (Intent) AbstractC6087.m11389(new Object[]{AbstractC6317.m11829(AbstractC6318.m11838(AbstractC3056.m6668(-3937593001644393895L)), null, AbstractC3056.m6668(-3937601501384672679L)), clsM11838}, new Class[]{Context.class, Class.class}, AbstractC6318.m11838(AbstractC3056.m6668(-3937601664593429927L)));
        intent.putExtra(AbstractC3056.m6668(-3937601411190359463L), AbstractC3056.m6668(-3937601394010490279L));
        intent.putExtra(AbstractC3056.m6668(-3937589565670557095L), bArrM6834);
        intent.putExtra(AbstractC3056.m6668(-3937558637611058599L), 30000L);
        XposedHelpers.callMethod(intent, AbstractC3056.m6668(-3937598593691813287L), new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937598473432728999L))}, new Object[]{Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937598473432728999L))}, new C6443(this, clsM118386, objM11389, objM11819, 1))});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC3056.m6668(-3937598327403840935L), new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937601664593429927L))}, new Object[]{intent});
    }
}
