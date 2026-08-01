package p056;

import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6837 implements InterfaceC6836 {
    public static final C6841 Companion = new C6841();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f18277;

    public /* synthetic */ C6837(int i, long j) {
        if (1 == (i & 1)) {
            this.f18277 = j;
        } else {
            AbstractC7144.m12420(i, 1, C6842.f18280.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6837) && this.f18277 == ((C6837) obj).f18277;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18277);
    }

    public final String toString() {
        return "NumberId(value=" + this.f18277 + ')';
    }

    public C6837(long j) {
        this.f18277 = j;
    }
}
