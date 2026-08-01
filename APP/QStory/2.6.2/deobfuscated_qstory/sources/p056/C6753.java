package p056;

import androidx.activity.AbstractC0053;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6753 implements InterfaceC6812 {
    public static final C6742 Companion = new C6742();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC5183[] f18187 = {null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(19)), null, null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6815 f18188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6835 f18192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f18193;

    public C6753(int i, int i2, InterfaceC6835 interfaceC6835, C7151 c7151, Double d, String str, InterfaceC6815 interfaceC6815) {
        if (27 != (i & 27)) {
            AbstractC7143.m12393(i, 27, C6743.f18175.getDescriptor());
            throw null;
        }
        this.f18193 = i2;
        this.f18192 = interfaceC6835;
        if ((i & 4) == 0) {
            this.f18191 = AbstractC6601.f17981;
        } else {
            this.f18191 = c7151;
        }
        this.f18190 = d;
        this.f18189 = str;
        if ((i & 32) == 0) {
            this.f18188 = Method$Defined.NotificationsProgress;
        } else {
            this.f18188 = interfaceC6815;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6753)) {
            return false;
        }
        C6753 c6753 = (C6753) obj;
        return this.f18193 == c6753.f18193 && AbstractC4394.m8917(this.f18192, c6753.f18192) && AbstractC4394.m8917(this.f18191, c6753.f18191) && AbstractC4394.m8917(this.f18190, c6753.f18190) && AbstractC4394.m8917(this.f18189, c6753.f18189);
    }

    public final int hashCode() {
        int iM11538 = AbstractC6136.m11538(this.f18191.f19121, (this.f18192.hashCode() + (Integer.hashCode(this.f18193) * 31)) * 31, 31);
        Double d = this.f18190;
        int iHashCode = (iM11538 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f18189;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressNotification(progress=");
        sb.append(this.f18193);
        sb.append(", progressToken=");
        sb.append(this.f18192);
        sb.append(", _meta=");
        sb.append(this.f18191);
        sb.append(", total=");
        sb.append(this.f18190);
        sb.append(", message=");
        return AbstractC0053.m155(sb, this.f18189, ')');
    }
}
