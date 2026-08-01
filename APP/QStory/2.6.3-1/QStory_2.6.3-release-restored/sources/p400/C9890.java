package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9890 {
    public static final C9834 Companion = new C9834();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25701;

    public /* synthetic */ C9890(int i, String str) {
        if ((i & 1) == 0) {
            this.f25701 = "";
        } else {
            this.f25701 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9890) && AbstractC5227.m9466(this.f25701, ((C9890) obj).f25701);
    }

    public final int hashCode() {
        return this.f25701.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextMsg(text=");
        return AbstractC0900.m708(sb, this.f25701, ')');
    }
}
