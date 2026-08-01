package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9050 {
    public static final C9051 Companion = new C9051();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f25344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25348;

    public /* synthetic */ C9050(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i & 1) == 0) {
            this.f25348 = 0;
        } else {
            this.f25348 = i2;
        }
        if ((i & 2) == 0) {
            this.f25347 = 0;
        } else {
            this.f25347 = i3;
        }
        if ((i & 4) == 0) {
            this.f25346 = 0;
        } else {
            this.f25346 = i4;
        }
        if ((i & 8) == 0) {
            this.f25345 = 0;
        } else {
            this.f25345 = i5;
        }
        if ((i & 16) == 0) {
            this.f25344 = 0L;
        } else {
            this.f25344 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9050)) {
            return false;
        }
        C9050 c9050 = (C9050) obj;
        return this.f25348 == c9050.f25348 && this.f25347 == c9050.f25347 && this.f25346 == c9050.f25346 && this.f25345 == c9050.f25345 && this.f25344 == c9050.f25344;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25344) + AbstractC0053.m143(this.f25345, AbstractC0053.m143(this.f25346, AbstractC0053.m143(this.f25347, Integer.hashCode(this.f25348) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessageContentInfo(msgType=");
        AbstractC6136.m11533(sb, this.f25348, -3937709086020470183L);
        AbstractC6136.m11533(sb, this.f25347, -3937708974351320487L);
        AbstractC6136.m11533(sb, this.f25346, -3937685549599688103L);
        AbstractC6136.m11533(sb, this.f25345, -3937695780211787175L);
        sb.append(this.f25344);
        sb.append(')');
        return sb.toString();
    }
}
