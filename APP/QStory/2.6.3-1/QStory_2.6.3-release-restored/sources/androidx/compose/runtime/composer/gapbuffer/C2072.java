package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.tooling.InterfaceC2128;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2072 implements InterfaceC2128, Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3938;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f3939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2068 f3940;

    public C2072(C2068 c2068, int i, int i2) {
        this.f3940 = c2068;
        this.f3938 = i;
        this.f3939 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2072)) {
            return false;
        }
        C2072 c2072 = (C2072) obj;
        return c2072.f3938 == this.f3938 && c2072.f3939 == this.f3939 && c2072.f3940 == this.f3940;
    }

    public final int hashCode() {
        return (this.f3940.hashCode() * 31) + this.f3938;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2068 c2068 = this.f3940;
        if (c2068.f3887 != this.f3939) {
            AbstractC2073.m2696();
        }
        int i = this.f3938;
        c2068.m2626(i);
        return new C2063(c2068, i + 1, c2068.f3890[(i * 5) + 3] + i);
    }
}
