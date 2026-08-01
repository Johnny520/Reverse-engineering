package p072;

import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.C7981;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7651 implements InterfaceC7642 {
    public static final C7635 Companion = new C7635();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18604 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(15)), null, null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7645 f18605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7981 f18606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7981 f18607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LoggingLevel f18609;

    public C7651(int i, LoggingLevel loggingLevel, String str, C7981 c7981, C7981 c79812, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7636.f18591.getDescriptor());
            throw null;
        }
        this.f18609 = loggingLevel;
        if ((i & 2) == 0) {
            this.f18608 = null;
        } else {
            this.f18608 = str;
        }
        if ((i & 4) == 0) {
            this.f18607 = AbstractC7431.f18321;
        } else {
            this.f18607 = c7981;
        }
        if ((i & 8) == 0) {
            this.f18606 = AbstractC7431.f18321;
        } else {
            this.f18606 = c79812;
        }
        if ((i & 16) == 0) {
            this.f18605 = Method$Defined.NotificationsMessage;
        } else {
            this.f18605 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7651)) {
            return false;
        }
        C7651 c7651 = (C7651) obj;
        return this.f18609 == c7651.f18609 && AbstractC5227.m9466(this.f18608, c7651.f18608) && AbstractC5227.m9466(this.f18607, c7651.f18607) && AbstractC5227.m9466(this.f18606, c7651.f18606);
    }

    public final int hashCode() {
        int iHashCode = this.f18609.hashCode() * 31;
        String str = this.f18608;
        return this.f18606.f19461.hashCode() + AbstractC7012.m12130(this.f18607.f19461, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingMessageNotification(level=");
        sb.append(this.f18609);
        sb.append(", logger=");
        sb.append(this.f18608);
        sb.append(", data=");
        sb.append(this.f18607);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18606, ')');
    }
}
