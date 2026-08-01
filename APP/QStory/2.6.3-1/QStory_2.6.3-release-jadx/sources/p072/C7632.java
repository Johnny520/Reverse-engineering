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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7632 implements InterfaceC7669 {
    public static final C7633 Companion = new C7633();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18586 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(16)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7645 f18587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7981 f18588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LoggingLevel f18589;

    public C7632(int i, LoggingLevel loggingLevel, C7981 c7981, InterfaceC7645 interfaceC7645) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7634.f18590.getDescriptor());
            throw null;
        }
        this.f18589 = loggingLevel;
        if ((i & 2) == 0) {
            this.f18588 = AbstractC7431.f18321;
        } else {
            this.f18588 = c7981;
        }
        if ((i & 4) == 0) {
            this.f18587 = Method$Defined.LoggingSetLevel;
        } else {
            this.f18587 = interfaceC7645;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7632)) {
            return false;
        }
        C7632 c7632 = (C7632) obj;
        return this.f18589 == c7632.f18589 && AbstractC5227.m9466(this.f18588, c7632.f18588);
    }

    @Override // p072.InterfaceC7669
    public final InterfaceC7645 getMethod() {
        return this.f18587;
    }

    public final int hashCode() {
        return this.f18588.f19461.hashCode() + (this.f18589.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetLevelRequest(level=");
        sb.append(this.f18589);
        sb.append(", _meta=");
        return AbstractC7012.m12139(sb, this.f18588, ')');
    }
}
