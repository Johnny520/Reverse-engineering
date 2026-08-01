package p072;

import androidx.window.area.C3391;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7533 implements InterfaceC7642 {
    public static final C7532 Companion = new C7532();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f18460 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C3391(26)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7645 f18461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18462;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18463;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7665 f18464;

    public C7533(int i, InterfaceC7665 interfaceC7665, String str, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7535.f18469.getDescriptor());
            throw null;
        }
        this.f18464 = interfaceC7665;
        this.f18463 = str;
        if ((i & 4) == 0) {
            this.f18462 = AbstractC7431.f18321;
        } else {
            this.f18462 = c7981;
        }
        if ((i & 8) == 0) {
            this.f18461 = Method$Defined.NotificationsCancelled;
        } else {
            this.f18461 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7533)) {
            return false;
        }
        C7533 c7533 = (C7533) obj;
        return AbstractC5227.m9466(this.f18464, c7533.f18464) && AbstractC5227.m9466(this.f18463, c7533.f18463) && AbstractC5227.m9466(this.f18462, c7533.f18462);
    }

    public final int hashCode() {
        int iHashCode = this.f18464.hashCode() * 31;
        String str = this.f18463;
        return this.f18462.f19461.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelledNotification(requestId=");
        sb.append(this.f18464);
        sb.append(", reason=");
        sb.append(this.f18463);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18462, ')');
    }

    public C7533(InterfaceC7665 interfaceC7665, String str) {
        C7981 c7981 = AbstractC7431.f18321;
        interfaceC7665.getClass();
        c7981.getClass();
        this.f18464 = interfaceC7665;
        this.f18463 = str;
        this.f18462 = c7981;
        this.f18461 = Method$Defined.NotificationsCancelled;
    }
}
