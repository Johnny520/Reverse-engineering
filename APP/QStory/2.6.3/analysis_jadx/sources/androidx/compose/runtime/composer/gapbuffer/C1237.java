package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.InterfaceC1293;
import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1237 implements InterfaceC1293, Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3593;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f3594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1233 f3595;

    public C1237(C1233 c1233, int i, int i2) {
        this.f3595 = c1233;
        this.f3593 = i;
        this.f3594 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1237)) {
            return false;
        }
        C1237 c1237 = (C1237) obj;
        return c1237.f3593 == this.f3593 && c1237.f3594 == this.f3594 && c1237.f3595 == this.f3595;
    }

    public final int hashCode() {
        return (this.f3595.hashCode() * 31) + this.f3593;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1233 c1233 = this.f3595;
        if (c1233.f3542 != this.f3594) {
            AbstractC1238.m2136();
        }
        int i = this.f3593;
        c1233.m2066(i);
        return new C1228(c1233, i + 1, c1233.f3545[(i * 5) + 3] + i);
    }
}
