package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.InterfaceC1293;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1232 implements InterfaceC1293, Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3535;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1226 f3536;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1233 f3537;

    public C1232(C1233 c1233, int i, AbstractC1229 abstractC1229, C1226 c1226) {
        this.f3537 = c1233;
        this.f3535 = i;
        this.f3536 = c1226;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1232)) {
            return false;
        }
        C1232 c1232 = (C1232) obj;
        return c1232.f3535 == this.f3535 && c1232.f3537 == this.f3537 && c1232.f3536.equals(this.f3536);
    }

    public final int hashCode() {
        return this.f3536.hashCode() + ((this.f3537.hashCode() + (this.f3535 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1236(this.f3537, this.f3535, null, this.f3536);
    }
}
