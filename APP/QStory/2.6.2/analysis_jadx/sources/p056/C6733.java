package p056;

import io.modelcontextprotocol.kotlin.sdk.Role;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世兰子苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6733 {
    public static final C6737 Companion = new C6737();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC5183[] f18165 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(21)), null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6735 f18166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Role f18167;

    public /* synthetic */ C6733(int i, Role role, InterfaceC6735 interfaceC6735) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6736.f18169.getDescriptor());
            throw null;
        }
        this.f18167 = role;
        this.f18166 = interfaceC6735;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6733)) {
            return false;
        }
        C6733 c6733 = (C6733) obj;
        return this.f18167 == c6733.f18167 && AbstractC4394.m8917(this.f18166, c6733.f18166);
    }

    public final int hashCode() {
        return this.f18166.hashCode() + (this.f18167.hashCode() * 31);
    }

    public final String toString() {
        return "PromptMessage(role=" + this.f18167 + ", content=" + this.f18166 + ')';
    }
}
