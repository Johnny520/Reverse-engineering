package p038;

import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;
import lin.xposed.hook.util.qq.CommonQQMethodTools;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p033.AbstractC6336;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6374 extends XC_MethodHook {
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (TextUtils.isEmpty(QQSessionUtils.AIOContactToQSContact(AbstractC6336.m11858(CommonQQMethodTools.getAIOContactClass(), methodHookParam.thisObject)).peerUid)) {
            return;
        }
        Iterator it = C6381.f17542.iterator();
        while (it.hasNext()) {
            ((InterfaceC6372) it.next()).show();
        }
    }
}
