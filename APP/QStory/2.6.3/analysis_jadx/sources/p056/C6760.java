package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6760 {
    public static final C6757 Companion = new C6757();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5184[] f18192 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(24)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6732 f18193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Role f18194;

    public /* synthetic */ C6760(int i, Role role, InterfaceC6732 interfaceC6732) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6758.f18190.getDescriptor());
            throw null;
        }
        this.f18194 = role;
        this.f18193 = interfaceC6732;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6760)) {
            return false;
        }
        C6760 c6760 = (C6760) obj;
        return this.f18194 == c6760.f18194 && AbstractC4395.m8907(this.f18193, c6760.f18193);
    }

    public final int hashCode() {
        return this.f18193.hashCode() + (this.f18194.hashCode() * 31);
    }

    public final String toString() {
        return "SamplingMessage(role=" + this.f18194 + ", content=" + this.f18193 + ')';
    }
}
