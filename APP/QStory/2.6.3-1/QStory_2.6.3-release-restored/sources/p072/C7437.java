package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪苏哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7437 implements InterfaceC7642, InterfaceC7669 {
    public static final C7438 Companion = new C7438();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7645 f18327;

    public /* synthetic */ C7437(int i, InterfaceC7645 interfaceC7645) {
        if (1 == (i & 1)) {
            this.f18327 = interfaceC7645;
        } else {
            AbstractC7973.m12979(i, 1, C7439.f18328.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7437) && AbstractC5227.m9466(this.f18327, ((C7437) obj).f18327);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18327;
    }

    public final int hashCode() {
        return this.f18327.hashCode();
    }

    public final String toString() {
        return "UnknownMethodRequestOrNotification(method=" + this.f18327 + ')';
    }
}
