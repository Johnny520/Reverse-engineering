package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9844 {
    public static final C9855 Companion = new C9855();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9841 f25641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25642;

    public /* synthetic */ C9844(int i, long j, C9841 c9841, int i2) {
        if (2 != (i & 2)) {
            AbstractC7973.m12979(i, 2, C9856.f25652.getDescriptor());
            throw null;
        }
        this.f25642 = (i & 1) == 0 ? 0L : j;
        this.f25641 = c9841;
        if ((i & 4) == 0) {
            this.f25640 = 0;
        } else {
            this.f25640 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9844)) {
            return false;
        }
        C9844 c9844 = (C9844) obj;
        return this.f25642 == c9844.f25642 && AbstractC5227.m9466(this.f25641, c9844.f25641) && this.f25640 == c9844.f25640;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25640) + ((this.f25641.hashCode() + (Long.hashCode(this.f25642) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupRecallOperationInfo(peerId=");
        sb.append(this.f25642);
        sb.append(", info=");
        sb.append(this.f25641);
        sb.append(", msgSeq=");
        return AbstractC0900.m716(sb, this.f25640, ')');
    }

    public C9844(long j, C9841 c9841, int i) {
        "info";
        this.f25642 = j;
        this.f25641 = c9841;
        this.f25640 = i;
    }
}
