package androidx.compose.runtime.composer.gapbuffer;

import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1226 extends AbstractC5061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f3522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5061 f3523;

    public C1226(AbstractC5061 abstractC5061, int i) {
        this.f3523 = abstractC5061;
        this.f3522 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1226)) {
            return false;
        }
        C1226 c1226 = (C1226) obj;
        return c1226.f3523.equals(this.f3523) && c1226.f3522 == this.f3522;
    }

    public final int hashCode() {
        return this.f3523.hashCode() + (this.f3522 * 31);
    }
}
