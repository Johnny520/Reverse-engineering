package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.InterfaceC2128;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2067 implements InterfaceC2128, Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3881;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2061 f3882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2068 f3883;

    public C2067(C2068 c2068, int i, AbstractC2064 abstractC2064, C2061 c2061) {
        this.f3883 = c2068;
        this.f3881 = i;
        this.f3882 = c2061;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2067)) {
            return false;
        }
        C2067 c2067 = (C2067) obj;
        return c2067.f3881 == this.f3881 && c2067.f3883 == this.f3883 && c2067.f3882.equals(this.f3882);
    }

    public final int hashCode() {
        return this.f3882.hashCode() + ((this.f3883.hashCode() + (this.f3881 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2071(this.f3883, this.f3881, null, this.f3882);
    }
}
