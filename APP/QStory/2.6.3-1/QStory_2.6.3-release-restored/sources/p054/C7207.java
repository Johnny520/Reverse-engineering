package p054;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedBridge;
import p042.AbstractC7145;
import p049.C7164;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7207 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String f17877 = "null";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String f17878 = "null";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Long f17879;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12412 = C7164.m12412("com.tencent.mobileqq.troop.api.impl.TroopCreateInfoServiceImpl");
        String strM14531 = "deleteInInviteList";
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3963 = strM14531;
        c2080.f3964 = new Class[]{String.class, String.class};
        XposedBridge.hookMethod(c7164M12412.m12414(), new C7202(7));
    }
}
