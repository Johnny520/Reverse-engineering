package p072;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰世苏子哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7589 {
    public static final C7586 Companion = new C7586();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC6016[] f18537 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(24)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7561 f18538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Role f18539;

    public /* synthetic */ C7589(int i, Role role, InterfaceC7561 interfaceC7561) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7587.f18535.getDescriptor());
            throw null;
        }
        this.f18539 = role;
        this.f18538 = interfaceC7561;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7589)) {
            return false;
        }
        C7589 c7589 = (C7589) obj;
        return this.f18539 == c7589.f18539 && AbstractC5227.m9466(this.f18538, c7589.f18538);
    }

    public final int hashCode() {
        return this.f18538.hashCode() + (this.f18539.hashCode() * 31);
    }

    public final String toString() {
        return "SamplingMessage(role=" + this.f18539 + ", content=" + this.f18538 + ')';
    }
}
