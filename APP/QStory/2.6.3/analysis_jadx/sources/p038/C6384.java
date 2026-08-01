package p038;

import android.os.Bundle;
import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XposedBridge;
import java.util.HashMap;
import java.util.List;
import p026.AbstractC6316;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C6384 extends AbstractC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final HashMap f17547 = new HashMap();

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C6335 c6335M11854 = C6335.m11854(AbstractC6337.m11866(AbstractC8405.m13972(326)));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        XposedBridge.hookMethod(c6335M11854.m11855(), new C6380(this));
    }
}
