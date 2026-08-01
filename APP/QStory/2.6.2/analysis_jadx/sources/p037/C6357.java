package p037;

import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;
import lin.xposed.hook.util.qq.CommonQQMethodTools;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p032.AbstractC6317;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6357 extends XC_MethodHook {
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (TextUtils.isEmpty(QQSessionUtils.AIOContactToQSContact(AbstractC6317.m11830(CommonQQMethodTools.getAIOContactClass(), methodHookParam.thisObject)).peerUid)) {
            return;
        }
        Iterator it = C6364.f17496.iterator();
        while (it.hasNext()) {
            ((InterfaceC6355) it.next()).show();
        }
    }
}
