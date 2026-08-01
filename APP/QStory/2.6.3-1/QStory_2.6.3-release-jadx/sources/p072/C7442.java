package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7442 implements InterfaceC7565 {
    public static final C7443 Companion = new C7443();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7612 f18332;

    public /* synthetic */ C7442(int i, InterfaceC7612 interfaceC7612, String str) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7447.f18340.getDescriptor());
            throw null;
        }
        this.f18332 = interfaceC7612;
        if ((i & 2) == 0) {
            this.f18331 = "resource";
        } else {
            this.f18331 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7442) && AbstractC5227.m9466(this.f18332, ((C7442) obj).f18332);
    }

    public final int hashCode() {
        return this.f18332.hashCode();
    }

    public final String toString() {
        return "EmbeddedResource(resource=" + this.f18332 + ')';
    }
}
