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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6803 implements InterfaceC6840 {
    public static final C6804 Companion = new C6804();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18241 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(16)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6816 f18242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LoggingLevel f18244;

    public C6803(int i, LoggingLevel loggingLevel, C7152 c7152, InterfaceC6816 interfaceC6816) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6805.f18245.getDescriptor());
            throw null;
        }
        this.f18244 = loggingLevel;
        if ((i & 2) == 0) {
            this.f18243 = AbstractC6602.f17976;
        } else {
            this.f18243 = c7152;
        }
        if ((i & 4) == 0) {
            this.f18242 = Method$Defined.LoggingSetLevel;
        } else {
            this.f18242 = interfaceC6816;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6803)) {
            return false;
        }
        C6803 c6803 = (C6803) obj;
        return this.f18244 == c6803.f18244 && AbstractC4395.m8907(this.f18243, c6803.f18243);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f18242;
    }

    public final int hashCode() {
        return this.f18243.f19116.hashCode() + (this.f18244.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetLevelRequest(level=");
        sb.append(this.f18244);
        sb.append(", _meta=");
        return AbstractC6183.m11580(sb, this.f18243, ')');
    }
}
