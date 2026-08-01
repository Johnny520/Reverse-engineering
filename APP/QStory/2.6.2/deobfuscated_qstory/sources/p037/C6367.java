package p037;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.util.HashMap;
import java.util.List;
import p026.AbstractC6298;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C6367 extends AbstractC6298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final HashMap f17501 = new HashMap();

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        C6316 c6316M11826 = C6316.m11826(AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        XposedBridge.hookMethod(c6316M11826.m11827(), new C6363(this));
    }
}
