package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世兰子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6734 {
    public static final C6738 Companion = new C6738();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5184[] f18160 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(21)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6736 f18161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Role f18162;

    public /* synthetic */ C6734(int i, Role role, InterfaceC6736 interfaceC6736) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6737.f18164.getDescriptor());
            throw null;
        }
        this.f18162 = role;
        this.f18161 = interfaceC6736;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6734)) {
            return false;
        }
        C6734 c6734 = (C6734) obj;
        return this.f18162 == c6734.f18162 && AbstractC4395.m8907(this.f18161, c6734.f18161);
    }

    public final int hashCode() {
        return this.f18161.hashCode() + (this.f18162.hashCode() * 31);
    }

    public final String toString() {
        return "PromptMessage(role=" + this.f18162 + ", content=" + this.f18161 + ')';
    }
}
