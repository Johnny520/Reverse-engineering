package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲兰苏子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6790 implements InterfaceC6813 {
    public static final C6786 Companion = new C6786();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18229;

    public C6790(int i, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6785.f18222.getDescriptor());
            throw null;
        }
        this.f18229 = str;
        if ((i & 2) == 0) {
            this.f18228 = AbstractC6602.f17976;
        } else {
            this.f18228 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18227 = Method$Defined.NotificationsResourcesUpdated;
        } else {
            this.f18227 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6790)) {
            return false;
        }
        C6790 c6790 = (C6790) obj;
        return AbstractC4395.m8907(this.f18229, c6790.f18229) && AbstractC4395.m8907(this.f18228, c6790.f18228);
    }

    public final int hashCode() {
        return this.f18228.f19116.hashCode() + (this.f18229.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceUpdatedNotification(uri=");
        sb.append(this.f18229);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18228, ')');
    }
}
