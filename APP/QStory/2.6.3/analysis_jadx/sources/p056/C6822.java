package p056;

import io.modelcontextprotocol.kotlin.sdk.LoggingLevel;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6822 implements InterfaceC6813 {
    public static final C6806 Companion = new C6806();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18259 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(15)), null, null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6816 f18260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7152 f18261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LoggingLevel f18264;

    public C6822(int i, LoggingLevel loggingLevel, String str, C7152 c7152, C7152 c71522, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6807.f18246.getDescriptor());
            throw null;
        }
        this.f18264 = loggingLevel;
        if ((i & 2) == 0) {
            this.f18263 = null;
        } else {
            this.f18263 = str;
        }
        if ((i & 4) == 0) {
            this.f18262 = AbstractC6602.f17976;
        } else {
            this.f18262 = c7152;
        }
        if ((i & 8) == 0) {
            this.f18261 = AbstractC6602.f17976;
        } else {
            this.f18261 = c71522;
        }
        if ((i & 16) == 0) {
            this.f18260 = Method$Defined.NotificationsMessage;
        } else {
            this.f18260 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6822)) {
            return false;
        }
        C6822 c6822 = (C6822) obj;
        return this.f18264 == c6822.f18264 && AbstractC4395.m8907(this.f18263, c6822.f18263) && AbstractC4395.m8907(this.f18262, c6822.f18262) && AbstractC4395.m8907(this.f18261, c6822.f18261);
    }

    public final int hashCode() {
        int iHashCode = this.f18264.hashCode() * 31;
        String str = this.f18263;
        return this.f18261.f19116.hashCode() + AbstractC6183.m11571(this.f18262.f19116, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingMessageNotification(level=");
        sb.append(this.f18264);
        sb.append(", logger=");
        sb.append(this.f18263);
        sb.append(", data=");
        sb.append(this.f18262);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18261, ')');
    }
}
