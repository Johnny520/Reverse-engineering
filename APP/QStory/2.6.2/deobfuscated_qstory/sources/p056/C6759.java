package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6759 {
    public static final C6756 Companion = new C6756();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5183[] f18197 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(24)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6731 f18198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Role f18199;

    public /* synthetic */ C6759(int i, Role role, InterfaceC6731 interfaceC6731) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6757.f18195.getDescriptor());
            throw null;
        }
        this.f18199 = role;
        this.f18198 = interfaceC6731;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6759)) {
            return false;
        }
        C6759 c6759 = (C6759) obj;
        return this.f18199 == c6759.f18199 && AbstractC4394.m8917(this.f18198, c6759.f18198);
    }

    public final int hashCode() {
        return this.f18198.hashCode() + (this.f18199.hashCode() * 31);
    }

    public final String toString() {
        return "SamplingMessage(role=" + this.f18199 + ", content=" + this.f18198 + ')';
    }
}
