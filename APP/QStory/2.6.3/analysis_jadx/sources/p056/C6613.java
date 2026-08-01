package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6613 implements InterfaceC6736 {
    public static final C6614 Companion = new C6614();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6783 f17987;

    public /* synthetic */ C6613(int i, InterfaceC6783 interfaceC6783, String str) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6618.f17995.getDescriptor());
            throw null;
        }
        this.f17987 = interfaceC6783;
        if ((i & 2) == 0) {
            this.f17986 = "resource";
        } else {
            this.f17986 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6613) && AbstractC4395.m8907(this.f17987, ((C6613) obj).f17987);
    }

    public final int hashCode() {
        return this.f17987.hashCode();
    }

    public final String toString() {
        return "EmbeddedResource(resource=" + this.f17987 + ')';
    }
}
