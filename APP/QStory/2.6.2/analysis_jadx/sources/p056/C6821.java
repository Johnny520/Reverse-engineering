package p056;

import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6821 implements InterfaceC6812 {
    public static final C6805 Companion = new C6805();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18264 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(15)), null, null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6815 f18265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7151 f18266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LoggingLevel f18269;

    public C6821(int i, LoggingLevel loggingLevel, String str, C7151 c7151, C7151 c71512, InterfaceC6815 interfaceC6815) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6806.f18251.getDescriptor());
            throw null;
        }
        this.f18269 = loggingLevel;
        if ((i & 2) == 0) {
            this.f18268 = null;
        } else {
            this.f18268 = str;
        }
        if ((i & 4) == 0) {
            this.f18267 = AbstractC6601.f17981;
        } else {
            this.f18267 = c7151;
        }
        if ((i & 8) == 0) {
            this.f18266 = AbstractC6601.f17981;
        } else {
            this.f18266 = c71512;
        }
        if ((i & 16) == 0) {
            this.f18265 = Method$Defined.NotificationsMessage;
        } else {
            this.f18265 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6821)) {
            return false;
        }
        C6821 c6821 = (C6821) obj;
        return this.f18269 == c6821.f18269 && AbstractC4394.m8917(this.f18268, c6821.f18268) && AbstractC4394.m8917(this.f18267, c6821.f18267) && AbstractC4394.m8917(this.f18266, c6821.f18266);
    }

    public final int hashCode() {
        int iHashCode = this.f18269.hashCode() * 31;
        String str = this.f18268;
        return this.f18266.f19121.hashCode() + AbstractC6136.m11538(this.f18267.f19121, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingMessageNotification(level=");
        sb.append(this.f18269);
        sb.append(", logger=");
        sb.append(this.f18268);
        sb.append(", data=");
        sb.append(this.f18267);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18266, ')');
    }
}
