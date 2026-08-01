package p072;

import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7666 implements InterfaceC7665 {
    public static final C7670 Companion = new C7670();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f18622;

    public /* synthetic */ C7666(int i, long j) {
        if (1 == (i & 1)) {
            this.f18622 = j;
        } else {
            AbstractC7973.m12979(i, 1, C7671.f18625.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7666) && this.f18622 == ((C7666) obj).f18622;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18622);
    }

    public final String toString() {
        return "NumberId(value=" + this.f18622 + ')';
    }

    public C7666(long j) {
        this.f18622 = j;
    }
}
