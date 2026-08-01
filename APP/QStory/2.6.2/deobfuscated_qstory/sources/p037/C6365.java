package p037;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import java.util.HashMap;
import p026.AbstractC6298;
import p032.AbstractC6318;
import p032.C6316;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6365 extends AbstractC6298 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6560.m12011()) {
            C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
            c6316M11825.f17409.f3617 = "sendMsg";
            c6316M11825.f17409.f3618 = new Class[]{Long.TYPE, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.Contact"), ArrayList.class, HashMap.class, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")};
            XposedBridge.hookMethod(c6316M11825.m11827(), new C6356(3));
        }
    }
}
