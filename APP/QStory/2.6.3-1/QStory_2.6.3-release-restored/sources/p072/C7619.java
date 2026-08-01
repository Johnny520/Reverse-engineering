package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲兰苏子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7619 implements InterfaceC7642 {
    public static final C7615 Companion = new C7615();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18574;

    public C7619(int i, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7614.f18567.getDescriptor());
            throw null;
        }
        this.f18574 = str;
        if ((i & 2) == 0) {
            this.f18573 = AbstractC7431.f18321;
        } else {
            this.f18573 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18572 = Method$Defined.NotificationsResourcesUpdated;
        } else {
            this.f18572 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7619)) {
            return false;
        }
        C7619 c7619 = (C7619) obj;
        return AbstractC5227.m9466(this.f18574, c7619.f18574) && AbstractC5227.m9466(this.f18573, c7619.f18573);
    }

    public final int hashCode() {
        return this.f18573.f19461.hashCode() + (this.f18574.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceUpdatedNotification(uri=");
        sb.append(this.f18574);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18573, ')');
    }
}
