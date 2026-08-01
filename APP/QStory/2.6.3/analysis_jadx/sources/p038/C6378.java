package p038;

import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XposedBridge;
import p026.AbstractC6316;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6378 extends AbstractC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String f17532 = AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String f17533 = AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Long f17534;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(352));
        String strM13972 = AbstractC8405.m13972(353);
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3618 = strM13972;
        c1245.f3619 = new Class[]{String.class, String.class};
        XposedBridge.hookMethod(c6335M11853.m11855(), new C6373(7));
    }
}
