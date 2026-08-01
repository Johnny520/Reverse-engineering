package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.InterfaceC1293;
import java.util.Iterator;
import p054.InterfaceC6566;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1237 implements InterfaceC1293, Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f3593;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1233 f3594;

    public C1237(C1233 c1233, int i, int i2) {
        this.f3594 = c1233;
        this.f3592 = i;
        this.f3593 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1237)) {
            return false;
        }
        C1237 c1237 = (C1237) obj;
        return c1237.f3592 == this.f3592 && c1237.f3593 == this.f3593 && c1237.f3594 == this.f3594;
    }

    public final int hashCode() {
        return (this.f3594.hashCode() * 31) + this.f3592;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1233 c1233 = this.f3594;
        if (c1233.f3541 != this.f3593) {
            AbstractC1238.m2126();
        }
        int i = this.f3592;
        c1233.m2056(i);
        return new C1228(c1233, i + 1, c1233.f3544[(i * 5) + 3] + i);
    }
}
