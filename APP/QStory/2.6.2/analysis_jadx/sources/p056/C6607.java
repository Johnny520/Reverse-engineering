package p056;

import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪苏哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6607 implements InterfaceC6812, InterfaceC6839 {
    public static final C6608 Companion = new C6608();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6815 f17987;

    public /* synthetic */ C6607(int i, InterfaceC6815 interfaceC6815) {
        if (1 == (i & 1)) {
            this.f17987 = interfaceC6815;
        } else {
            AbstractC7143.m12393(i, 1, C6609.f17988.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6607) && AbstractC4394.m8917(this.f17987, ((C6607) obj).f17987);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f17987;
    }

    public final int hashCode() {
        return this.f17987.hashCode();
    }

    public final String toString() {
        return "UnknownMethodRequestOrNotification(method=" + this.f17987 + ')';
    }
}
