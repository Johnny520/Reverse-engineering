package p321;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.InterfaceC2915;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p036.AbstractC6353;
import p331.C8799;
import p336.AbstractC8805;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8720 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f24584 = 0;

    static {
        AbstractC3056.m6668(-3937683097173362087L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m14396(String str) {
        int iIndexOf = str.indexOf(AbstractC3056.m6668(-3937681173028013479L));
        if (iIndexOf == -1) {
            C5919.m11249(AbstractC3056.m6668(-3937680996934354343L));
            return;
        }
        String string = InterfaceC2915.m6316(str.substring(str.indexOf(123, iIndexOf), str.lastIndexOf(125) + 1)).getString(AbstractC3056.m6668(-3937680928214877607L));
        String str2 = AbstractC3056.m6668(-3937680958279648679L) + Hook_cookie.getG_TK(AbstractC3056.m6668(-3937656322347238823L));
        StringBuilder sbM149 = AbstractC0053.m149(AbstractC3056.m6668(-3937656275102598567L) + QQEnvTool.getCurrentUin());
        sbM149.append(AbstractC3056.m6668(-3937656210678089127L));
        sbM149.append(Hook_cookie.getSkey());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append(AbstractC3056.m6668(-3937656245037827495L));
        sbM1492.append(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
        String string2 = sbM1492.toString();
        HashMap map = new HashMap();
        map.put(AbstractC3056.m6668(-3937680576027559335L), string);
        map.put(AbstractC3056.m6668(-3937680558847690151L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937681834452977063L), QQEnvTool.getCurrentUin());
        map.put(AbstractC3056.m6668(-3937681868812715431L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937683921807082919L), AbstractC3056.m6668(-3937681752848598439L));
        map.put(AbstractC3056.m6668(-3937681800093238695L), AbstractC3056.m6668(-3937681709898925479L) + QQEnvTool.getCurrentUin() + AbstractC3056.m6668(-3937681654064350631L));
        AbstractC6353.m11899(str2, string2, map);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937680498718148007L);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
    }
}
