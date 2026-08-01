package p054;

import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import java.util.Iterator;
import lin.xposed.hook.util.p011qq.CommonQQMethodTools;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p049.AbstractC7165;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7203 extends XC_MethodHook {
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (TextUtils.isEmpty(QQSessionUtils.AIOContactToQSContact(AbstractC7165.m12417(CommonQQMethodTools.getAIOContactClass(), methodHookParam.thisObject)).peerUid)) {
            return;
        }
        Iterator it = C7210.f17887.iterator();
        while (it.hasNext()) {
            ((InterfaceC7201) it.next()).show();
        }
    }
}
