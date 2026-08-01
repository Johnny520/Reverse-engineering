package p039;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import java.util.HashMap;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p033.C6335;
import p038.C6373;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6391 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC3056.m6696()) {
            C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(137));
            c6335M11853.f17458.f3618 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
            c6335M11853.f17458.f3619 = new Class[]{Long.TYPE, AbstractC6337.m11866(AbstractC8405.m13972(133)), ArrayList.class, HashMap.class, AbstractC6337.m11866(AbstractC8405.m13972(136))};
            XposedBridge.hookMethod(c6335M11853.m11855(), new C6373(this, 11));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(285);
    }
}
