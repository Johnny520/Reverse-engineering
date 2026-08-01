package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f14042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5519 f14043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 f14044;

    public C5520(C5519 c5519, C5519 c55192, boolean z) {
        c5519.getClass();
        c55192.getClass();
        this.f14044 = c5519;
        this.f14043 = c55192;
        this.f14042 = z;
        c55192.f14041.m9873();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m9881(C5519 c5519) {
        String str = c5519.f14041.f14038;
        return AbstractC5976.m10722(str, '/') ? AbstractC7012.m12149('`', "`", str) : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5520)) {
            return false;
        }
        C5520 c5520 = (C5520) obj;
        return AbstractC5227.m9466(this.f14044, c5520.f14044) && AbstractC5227.m9466(this.f14043, c5520.f14043) && this.f14042 == c5520.f14042;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14042) + ((this.f14043.hashCode() + (this.f14044.hashCode() * 31)) * 31);
    }

    public final String toString() {
        boolean zM9873 = this.f14044.f14041.m9873();
        String strM9885 = m9885();
        return zM9873 ? "/".concat(strM9885) : strM9885;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5523 m9882() {
        return this.f14043.f14041.m9877();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5520 m9883() {
        C5519 c5519M9879 = this.f14043.m9879();
        if (c5519M9879.f14041.m9873()) {
            return null;
        }
        return new C5520(this.f14044, c5519M9879, this.f14042);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5520 m9884(C5523 c5523) {
        c5523.getClass();
        return new C5520(this.f14044, this.f14043.m9880(c5523), this.f14042);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9885() {
        C5519 c5519 = this.f14044;
        boolean zM9873 = c5519.f14041.m9873();
        C5519 c55192 = this.f14043;
        if (zM9873) {
            return m9881(c55192);
        }
        return AbstractC5971.m10688(c5519.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + m9881(c55192);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5519 m9886() {
        C5519 c5519 = this.f14044;
        boolean zM9873 = c5519.f14041.m9873();
        C5519 c55192 = this.f14043;
        if (zM9873) {
            return c55192;
        }
        return new C5519(c5519.f14041.f14038 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + c55192.f14041.f14038);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m9887() {
        return !this.f14043.m9879().f14041.m9873();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5520(C5519 c5519, C5523 c5523) {
        this(c5519, AbstractC5516.m9867(c5523), false);
        c5519.getClass();
        c5523.getClass();
        C5519 c55192 = C5519.f14039;
    }
}
