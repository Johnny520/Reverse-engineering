package p056;

import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰子世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6836 implements InterfaceC6835 {
    public static final C6840 Companion = new C6840();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f18282;

    public /* synthetic */ C6836(int i, long j) {
        if (1 == (i & 1)) {
            this.f18282 = j;
        } else {
            AbstractC7143.m12393(i, 1, C6841.f18285.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6836) && this.f18282 == ((C6836) obj).f18282;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18282);
    }

    public final String toString() {
        return "NumberId(value=" + this.f18282 + ')';
    }

    public C6836(long j) {
        this.f18282 = j;
    }
}
