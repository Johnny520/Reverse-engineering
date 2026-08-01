package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4688 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f13697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4687 f13698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 f13699;

    public C4688(C4687 c4687, C4687 c46872, boolean z) {
        c4687.getClass();
        c46872.getClass();
        this.f13699 = c4687;
        this.f13698 = c46872;
        this.f13697 = z;
        c46872.f13696.m9314();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m9322(C4687 c4687) {
        String str = c4687.f13696.f13693;
        return AbstractC5144.m10163(str, '/') ? AbstractC6183.m11590('`', "`", str) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4688)) {
            return false;
        }
        C4688 c4688 = (C4688) obj;
        return AbstractC4395.m8907(this.f13699, c4688.f13699) && AbstractC4395.m8907(this.f13698, c4688.f13698) && this.f13697 == c4688.f13697;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13697) + ((this.f13698.hashCode() + (this.f13699.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zM9314 = this.f13699.f13696.m9314();
        String strM9326 = m9326();
        return zM9314 ? "/".concat(strM9326) : strM9326;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4691 m9323() {
        return this.f13698.f13696.m9318();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4688 m9324() {
        C4687 c4687M9320 = this.f13698.m9320();
        if (c4687M9320.f13696.m9314()) {
            return null;
        }
        return new C4688(this.f13699, c4687M9320, this.f13697);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4688 m9325(C4691 c4691) {
        c4691.getClass();
        return new C4688(this.f13699, this.f13698.m9321(c4691), this.f13697);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9326() {
        C4687 c4687 = this.f13699;
        boolean zM9314 = c4687.f13696.m9314();
        C4687 c46872 = this.f13698;
        if (zM9314) {
            return m9322(c46872);
        }
        return AbstractC5139.m10129(c4687.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + m9322(c46872);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4687 m9327() {
        C4687 c4687 = this.f13699;
        boolean zM9314 = c4687.f13696.m9314();
        C4687 c46872 = this.f13698;
        if (zM9314) {
            return c46872;
        }
        return new C4687(c4687.f13696.f13693 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c46872.f13696.f13693);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m9328() {
        return !this.f13698.m9320().f13696.m9314();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4688(C4687 c4687, C4691 c4691) {
        this(c4687, AbstractC4684.m9308(c4691), false);
        c4687.getClass();
        c4691.getClass();
        C4687 c46872 = C4687.f13694;
    }
}
