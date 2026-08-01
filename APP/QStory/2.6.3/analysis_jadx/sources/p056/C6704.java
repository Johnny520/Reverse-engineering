package p056;

import androidx.window.area.C2558;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6704 implements InterfaceC6813 {
    public static final C6703 Companion = new C6703();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f18115 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C2558(26)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6816 f18116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6836 f18119;

    public C6704(int i, InterfaceC6836 interfaceC6836, String str, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6706.f18124.getDescriptor());
            throw null;
        }
        this.f18119 = interfaceC6836;
        this.f18118 = str;
        if ((i & 4) == 0) {
            this.f18117 = AbstractC6602.f17976;
        } else {
            this.f18117 = c7152;
        }
        if ((i & 8) == 0) {
            this.f18116 = Method$Defined.NotificationsCancelled;
        } else {
            this.f18116 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6704)) {
            return false;
        }
        C6704 c6704 = (C6704) obj;
        return AbstractC4395.m8907(this.f18119, c6704.f18119) && AbstractC4395.m8907(this.f18118, c6704.f18118) && AbstractC4395.m8907(this.f18117, c6704.f18117);
    }

    public final int hashCode() {
        int iHashCode = this.f18119.hashCode() * 31;
        String str = this.f18118;
        return this.f18117.f19116.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelledNotification(requestId=");
        sb.append(this.f18119);
        sb.append(", reason=");
        sb.append(this.f18118);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18117, ')');
    }

    public C6704(InterfaceC6836 interfaceC6836, String str) {
        C7152 c7152 = AbstractC6602.f17976;
        interfaceC6836.getClass();
        c7152.getClass();
        this.f18119 = interfaceC6836;
        this.f18118 = str;
        this.f18117 = c7152;
        this.f18116 = Method$Defined.NotificationsCancelled;
    }
}
