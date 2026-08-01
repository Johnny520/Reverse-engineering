package p037;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import p026.AbstractC6298;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6361 extends AbstractC6298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String f17486 = "null";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String f17487 = "null";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Long f17488;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        C6316 c6316M11825 = C6316.m11825("com.tencent.mobileqq.troop.api.impl.TroopCreateInfoServiceImpl");
        String strM6668 = "deleteInInviteList";
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3617 = strM6668;
        c1245.f3618 = new Class[]{String.class, String.class};
        XposedBridge.hookMethod(c6316M11825.m11827(), new C6356(7));
    }
}
