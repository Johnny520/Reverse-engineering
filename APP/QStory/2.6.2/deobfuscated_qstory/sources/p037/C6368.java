package p037;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p022.C6267;
import p026.AbstractC6298;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6368 extends AbstractC6298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String f17502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String f17503;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        C6316 c6316M11825 = C6316.m11825("mqq.app.msghandle.MsgRespHandler");
        c6316M11825.f17409.f3617 = "dispatchRespMsg";
        Class[] clsArr = {AbstractC6318.m11838("mqq.app.MobileQQ"), AbstractC6318.m11838("com.tencent.mobileqq.msf.sdk.MsfMessagePair"), AbstractC6318.m11838("com.tencent.mobileqq.msf.sdk.MsfRespHandleUtil"), AbstractC6318.m11838("com.tencent.mobileqq.msf.sdk.MsfServiceSdk")};
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        AbstractC5061.m10019(c6316M11825.m11827(), new C6267(4));
    }
}
