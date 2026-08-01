package androidx.compose.runtime.composer.gapbuffer;

import kotlin.reflect.jvm.internal.AbstractC5894;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2061 extends AbstractC5894 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5894 f3869;

    public C2061(AbstractC5894 abstractC5894, int i) {
        this.f3869 = abstractC5894;
        this.f3868 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2061)) {
            return false;
        }
        C2061 c2061 = (C2061) obj;
        return c2061.f3869.equals(this.f3869) && c2061.f3868 == this.f3868;
    }

    public final int hashCode() {
        return this.f3869.hashCode() + (this.f3868 * 31);
    }
}
