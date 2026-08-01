package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5523 f14045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 f14046;

    static {
        C5523 c5523 = AbstractC5524.f14051;
        C5519 c5519 = C5519.f14039;
        AbstractC5516.m9867(c5523);
    }

    public C5521(C5519 c5519, C5523 c5523) {
        c5519.getClass();
        this.f14046 = c5519;
        this.f14045 = c5523;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5521)) {
            return false;
        }
        C5521 c5521 = (C5521) obj;
        return AbstractC5227.m9466(this.f14046, c5521.f14046) && this.f14045.equals(c5521.f14045);
    }

    public final int hashCode() {
        return this.f14045.hashCode() + ((this.f14046.hashCode() + 527) * 961);
    }

    public final String toString() {
        return AbstractC5971.m10688(this.f14046.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + this.f14045;
    }
}
