package p400;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5227;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C9894 {
    public static final C9845 Companion = new C9845();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f25705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9893 f25706;

    public /* synthetic */ C9894(int i, C9893 c9893, byte[] bArr) {
        this.f25706 = (i & 1) == 0 ? null : c9893;
        if ((i & 2) == 0) {
            this.f25705 = new byte[0];
        } else {
            this.f25705 = bArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9894 m15173(C9894 c9894, byte[] bArr) {
        C9893 c9893 = c9894.f25706;
        c9894.getClass();
        "operationInfo";
        return new C9894(c9893, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9894.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        "null cannot be cast to non-null type top.artmoe.inao.entries.QQMessage.MessageBody";
        obj.getClass();
        C9894 c9894 = (C9894) obj;
        return AbstractC5227.m9466(this.f25706, c9894.f25706) && Arrays.equals(this.f25705, c9894.f25705);
    }

    public final int hashCode() {
        C9893 c9893 = this.f25706;
        return Arrays.hashCode(this.f25705) + ((c9893 != null ? c9893.f25704.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "MessageBody(richMsg=" + this.f25706 + ", operationInfo=" + Arrays.toString(this.f25705) + ')';
    }

    public C9894(C9893 c9893, byte[] bArr) {
        "operationInfo";
        this.f25706 = c9893;
        this.f25705 = bArr;
    }
}
