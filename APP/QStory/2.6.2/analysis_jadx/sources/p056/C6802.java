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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6802 implements InterfaceC6839 {
    public static final C6803 Companion = new C6803();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18246 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(16)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6815 f18247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18248;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LoggingLevel f18249;

    public C6802(int i, LoggingLevel loggingLevel, C7151 c7151, InterfaceC6815 interfaceC6815) {
        if (1 != (i & 1)) {
            AbstractC7143.m12393(i, 1, C6804.f18250.getDescriptor());
            throw null;
        }
        this.f18249 = loggingLevel;
        if ((i & 2) == 0) {
            this.f18248 = AbstractC6601.f17981;
        } else {
            this.f18248 = c7151;
        }
        if ((i & 4) == 0) {
            this.f18247 = Method$Defined.LoggingSetLevel;
        } else {
            this.f18247 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6802)) {
            return false;
        }
        C6802 c6802 = (C6802) obj;
        return this.f18249 == c6802.f18249 && AbstractC4394.m8917(this.f18248, c6802.f18248);
    }

    @Override // p056.InterfaceC6839
    public final InterfaceC6815 getMethod() {
        return this.f18247;
    }

    public final int hashCode() {
        return this.f18248.f19121.hashCode() + (this.f18249.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetLevelRequest(level=");
        sb.append(this.f18249);
        sb.append(", _meta=");
        return AbstractC6136.m11552(sb, this.f18248, ')');
    }
}
