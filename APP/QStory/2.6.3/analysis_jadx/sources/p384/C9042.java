package p384;

import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9042 {
    public static final C9045 Companion = new C9045();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25326;

    public /* synthetic */ C9042(int i, long j) {
        if ((i & 1) == 0) {
            this.f25326 = 0L;
        } else {
            this.f25326 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9042) && this.f25326 == ((C9042) obj).f25326;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25326);
    }

    public final String toString() {
        return AbstractC8405.m13972(1391) + this.f25326 + ')';
    }
}
