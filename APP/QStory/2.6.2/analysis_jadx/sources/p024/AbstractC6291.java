package p024;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3064;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p007.AbstractC6136;
import p026.AbstractC6296;
import p029.AbstractC6303;
import p035.AbstractC6340;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言世哲兰楪苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6291 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f17375 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicBoolean f17374 = new AtomicBoolean();

    static {
        try {
            for (AbstractC6296 abstractC6296 : AbstractC3064.m6762()) {
                f17375.put(abstractC6296.getClass(), abstractC6296);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m11801() {
        AtomicBoolean atomicBoolean = f17374;
        if (atomicBoolean.get()) {
            return atomicBoolean.get();
        }
        C9114 c9114 = AbstractC6290.f17371;
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11531(sb, AbstractC6303.f17385, -3937609910930638247L);
        sb.append(AbstractC6340.f17462);
        boolean zEquals = sb.toString().equals(c9114.m14641(AbstractC3056.m6668(-3937638442398385575L), AbstractC3056.m6668(-3937561979095614887L)));
        atomicBoolean.set(zEquals);
        return zEquals;
    }
}
