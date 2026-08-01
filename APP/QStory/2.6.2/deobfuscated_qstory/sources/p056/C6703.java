package p056;

import androidx.window.area.C2558;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6703 implements InterfaceC6812 {
    public static final C6702 Companion = new C6702();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18120 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C2558(26)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6815 f18121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6835 f18124;

    public C6703(int i, InterfaceC6835 interfaceC6835, String str, C7151 c7151, InterfaceC6815 interfaceC6815) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C6705.f18129.getDescriptor());
            throw null;
        }
        this.f18124 = interfaceC6835;
        this.f18123 = str;
        if ((i & 4) == 0) {
            this.f18122 = AbstractC6601.f17981;
        } else {
            this.f18122 = c7151;
        }
        if ((i & 8) == 0) {
            this.f18121 = Method$Defined.NotificationsCancelled;
        } else {
            this.f18121 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6703)) {
            return false;
        }
        C6703 c6703 = (C6703) obj;
        return AbstractC4394.m8917(this.f18124, c6703.f18124) && AbstractC4394.m8917(this.f18123, c6703.f18123) && AbstractC4394.m8917(this.f18122, c6703.f18122);
    }

    public final int hashCode() {
        int iHashCode = this.f18124.hashCode() * 31;
        String str = this.f18123;
        return this.f18122.f19121.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancelledNotification(requestId=");
        sb.append(this.f18124);
        sb.append(", reason=");
        sb.append(this.f18123);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18122, ')');
    }

    public C6703(InterfaceC6835 interfaceC6835, String str) {
        C7151 c7151 = AbstractC6601.f17981;
        interfaceC6835.getClass();
        c7151.getClass();
        this.f18124 = interfaceC6835;
        this.f18123 = str;
        this.f18122 = c7151;
        this.f18121 = Method$Defined.NotificationsCancelled;
    }
}
