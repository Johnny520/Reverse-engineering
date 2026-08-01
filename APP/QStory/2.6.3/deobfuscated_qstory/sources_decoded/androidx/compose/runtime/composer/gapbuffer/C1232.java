package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.InterfaceC1293;
import java.util.Iterator;
import p054.InterfaceC6567;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1232 implements InterfaceC1293, Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3536;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1226 f3537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1233 f3538;

    public C1232(C1233 c1233, int i, AbstractC1229 abstractC1229, C1226 c1226) {
        this.f3538 = c1233;
        this.f3536 = i;
        this.f3537 = c1226;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1232)) {
            return false;
        }
        C1232 c1232 = (C1232) obj;
        return c1232.f3536 == this.f3536 && c1232.f3538 == this.f3538 && c1232.f3537.equals(this.f3537);
    }

    public final int hashCode() {
        return this.f3537.hashCode() + ((this.f3538.hashCode() + (this.f3536 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1236(this.f3538, this.f3536, null, this.f3537);
    }
}
