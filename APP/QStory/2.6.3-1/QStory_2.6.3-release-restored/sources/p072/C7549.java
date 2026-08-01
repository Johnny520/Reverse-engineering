package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7549 implements InterfaceC7561 {
    public static final C7553 Companion = new C7553();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18495;

    public /* synthetic */ C7549(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C7552.f18498.getDescriptor());
            throw null;
        }
        this.f18495 = str;
        this.f18494 = str2;
        if ((i & 4) == 0) {
            this.f18493 = "image";
        } else {
            this.f18493 = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7549)) {
            return false;
        }
        C7549 c7549 = (C7549) obj;
        return AbstractC5227.m9466(this.f18495, c7549.f18495) && AbstractC5227.m9466(this.f18494, c7549.f18494);
    }

    public final int hashCode() {
        return this.f18494.hashCode() + (this.f18495.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageContent(data=");
        sb.append(this.f18495);
        sb.append(", mimeType=");
        return AbstractC0900.m708(sb, this.f18494, ')');
    }
}
