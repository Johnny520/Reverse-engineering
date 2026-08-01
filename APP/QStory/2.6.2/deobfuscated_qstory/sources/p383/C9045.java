package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9045 {
    public static final C9044 Companion = new C9044();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9052 f25341;

    public /* synthetic */ C9045(int i, C9052 c9052) {
        if (1 == (i & 1)) {
            this.f25341 = c9052;
        } else {
            AbstractC7143.m12393(i, 1, C9040.f25339.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9045) && AbstractC4394.m8917(this.f25341, ((C9045) obj).f25341);
    }

    public final int hashCode() {
        return this.f25341.hashCode();
    }

    public final String toString() {
        return "MsgPush(qqMessage=" + this.f25341 + ')';
    }

    public C9045(C9052 c9052) {
        "qqMessage";
        this.f25341 = c9052;
    }
}
