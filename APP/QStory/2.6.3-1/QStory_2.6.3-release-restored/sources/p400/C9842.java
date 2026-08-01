package p400;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9842 {
    public static final C9851 Companion = new C9851();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f25637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25638;

    public /* synthetic */ C9842(int i, int i2, long j, String str) {
        this.f25638 = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f25637 = 0L;
        } else {
            this.f25637 = j;
        }
        if ((i & 4) == 0) {
            this.f25636 = "";
        } else {
            this.f25636 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9842)) {
            return false;
        }
        C9842 c9842 = (C9842) obj;
        return this.f25638 == c9842.f25638 && this.f25637 == c9842.f25637 && AbstractC5227.m9466(this.f25636, c9842.f25636);
    }

    public final int hashCode() {
        return this.f25636.hashCode() + AbstractC0900.m702(Integer.hashCode(this.f25638) * 31, 31, this.f25637);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MsgInfo(msgSeq=");
        AbstractC7012.m12137(sb, this.f25638, 1425);
        sb.append(this.f25637);
        sb.append(", senderUid=");
        return AbstractC0900.m708(sb, this.f25636, ')');
    }

    public C9842(int i, long j, String str) {
        "senderUid";
        str.getClass();
        this.f25638 = i;
        this.f25637 = j;
        this.f25636 = str;
    }
}
