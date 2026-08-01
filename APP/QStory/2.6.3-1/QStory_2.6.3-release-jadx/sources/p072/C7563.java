package p072;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世兰子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7563 {
    public static final C7567 Companion = new C7567();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC6016[] f18505 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(21)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7565 f18506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Role f18507;

    public /* synthetic */ C7563(int i, Role role, InterfaceC7565 interfaceC7565) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7566.f18509.getDescriptor());
            throw null;
        }
        this.f18507 = role;
        this.f18506 = interfaceC7565;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7563)) {
            return false;
        }
        C7563 c7563 = (C7563) obj;
        return this.f18507 == c7563.f18507 && AbstractC5227.m9466(this.f18506, c7563.f18506);
    }

    public final int hashCode() {
        return this.f18506.hashCode() + (this.f18507.hashCode() * 31);
    }

    public final String toString() {
        return "PromptMessage(role=" + this.f18507 + ", content=" + this.f18506 + ')';
    }
}
