package androidx.compose.runtime.composer.gapbuffer;

import kotlin.reflect.jvm.internal.AbstractC5062;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1226 extends AbstractC5062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5062 f3524;

    public C1226(AbstractC5062 abstractC5062, int i) {
        this.f3524 = abstractC5062;
        this.f3523 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1226)) {
            return false;
        }
        C1226 c1226 = (C1226) obj;
        return c1226.f3524.equals(this.f3524) && c1226.f3523 == this.f3523;
    }

    public final int hashCode() {
        return this.f3524.hashCode() + (this.f3523 * 31);
    }
}
