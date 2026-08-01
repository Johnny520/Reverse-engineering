package p038;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import java.util.HashMap;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p032.C6316;
import p037.C6356;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6417 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6560.m12011()) {
            C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937562558916199847L));
            c6316M11825.f17409.f3617 = AbstractC3056.m6668(-3937579786030024103L);
            c6316M11825.f17409.f3618 = new Class[]{Long.TYPE, AbstractC6318.m11838(AbstractC3056.m6668(-3937563181686457767L)), ArrayList.class, HashMap.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937562726419924391L))};
            XposedBridge.hookMethod(c6316M11825.m11827(), new C6356(this, 11));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937581035865507239L);
    }
}
