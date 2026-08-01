package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9006 {
    public static final C9007 Companion = new C9007();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f25297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25298;

    public /* synthetic */ C9006(int i, int i2, long j, String str) {
        this.f25298 = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f25297 = 0L;
        } else {
            this.f25297 = j;
        }
        if ((i & 4) == 0) {
            this.f25296 = "";
        } else {
            this.f25296 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9006)) {
            return false;
        }
        C9006 c9006 = (C9006) obj;
        return this.f25298 == c9006.f25298 && this.f25297 == c9006.f25297 && AbstractC4394.m8917(this.f25296, c9006.f25296);
    }

    public final int hashCode() {
        return this.f25296.hashCode() + AbstractC0053.m141(Integer.hashCode(this.f25298) * 31, 31, this.f25297);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MsgInfo(msgSeq=");
        AbstractC6136.m11533(sb, this.f25298, -3937695780211787175L);
        AbstractC6136.m11532(sb, this.f25297, -3937694427297088935L);
        return AbstractC0053.m155(sb, this.f25296, ')');
    }

    public C9006(int i, long j, String str) {
        "senderUid";
        str.getClass();
        this.f25298 = i;
        this.f25297 = j;
        this.f25296 = str;
    }
}
