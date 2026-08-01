package p024;

import com.bumptech.glide.AbstractC3066;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p026.AbstractC6314;
import p030.AbstractC6322;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲兰楪子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6309 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f17424 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicBoolean f17423 = new AtomicBoolean();

    static {
        try {
            for (AbstractC6314 abstractC6314 : AbstractC3066.m6859()) {
                f17424.put(abstractC6314.getClass(), abstractC6314);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m11829() {
        AtomicBoolean atomicBoolean = f17423;
        if (atomicBoolean.get()) {
            return atomicBoolean.get();
        }
        boolean zEquals = (AbstractC6322.f17434 + AbstractC8405.m13973("喵呜喵喵呜喵喵呜") + AbstractC6358.f17509).equals(AbstractC6308.f17420.m14678(AbstractC8405.m13972(767), ""));
        atomicBoolean.set(zEquals);
        return zEquals;
    }
}
