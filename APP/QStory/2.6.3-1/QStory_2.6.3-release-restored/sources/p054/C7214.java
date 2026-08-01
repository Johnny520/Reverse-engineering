package p054;

import androidx.compose.runtime.internal.C2080;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p035.C7092;
import p042.AbstractC7145;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7214 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String f17893;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String f17894;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12412 = C7164.m12412("mqq.app.msghandle.MsgRespHandler");
        c7164M12412.f17803.f3963 = "dispatchRespMsg";
        Class[] clsArr = {AbstractC7166.m12425("mqq.app.MobileQQ"), AbstractC7166.m12425("com.tencent.mobileqq.msf.sdk.MsfMessagePair"), AbstractC7166.m12425("com.tencent.mobileqq.msf.sdk.MsfRespHandleUtil"), AbstractC7166.m12425("com.tencent.mobileqq.msf.sdk.MsfServiceSdk")};
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        AbstractC5894.m10598(c7164M12412.m12414(), new C7092(4));
    }
}
