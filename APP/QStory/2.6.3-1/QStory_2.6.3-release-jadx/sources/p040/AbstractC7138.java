package p040;

import com.bumptech.glide.AbstractC3898;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p042.AbstractC7143;
import p046.AbstractC7151;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲兰楪子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f17769 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicBoolean f17768 = new AtomicBoolean();

    static {
        try {
            for (AbstractC7143 abstractC7143 : AbstractC3898.m7419()) {
                f17769.put(abstractC7143.getClass(), abstractC7143);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m12388() {
        AtomicBoolean atomicBoolean = f17768;
        if (atomicBoolean.get()) {
            return atomicBoolean.get();
        }
        boolean zEquals = (AbstractC7151.f17779 + AbstractC9234.m14532("喵呜喵喵呜喵喵呜") + AbstractC7187.f17854).equals(AbstractC7137.f17765.m15237(AbstractC9234.m14531(767), ""));
        atomicBoolean.set(zEquals);
        return zEquals;
    }
}
