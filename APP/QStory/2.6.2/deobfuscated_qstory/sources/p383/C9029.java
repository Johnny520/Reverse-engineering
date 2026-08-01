package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9029 {
    public static final C9043 Companion = new C9043();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final byte[] f25324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9037 f25325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final byte[] f25326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25328;

    public /* synthetic */ C9029(int i, int i2, int i3, byte[] bArr, C9037 c9037, byte[] bArr2) {
        if ((i & 1) == 0) {
            this.f25328 = 0;
        } else {
            this.f25328 = i2;
        }
        if ((i & 2) == 0) {
            this.f25327 = 0;
        } else {
            this.f25327 = i3;
        }
        if ((i & 4) == 0) {
            this.f25326 = null;
        } else {
            this.f25326 = bArr;
        }
        if ((i & 8) == 0) {
            this.f25325 = null;
        } else {
            this.f25325 = c9037;
        }
        if ((i & 16) == 0) {
            this.f25324 = null;
        } else {
            this.f25324 = bArr2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9029)) {
            return false;
        }
        C9029 c9029 = (C9029) obj;
        return this.f25328 == c9029.f25328 && this.f25327 == c9029.f25327 && AbstractC4394.m8917(this.f25326, c9029.f25326) && AbstractC4394.m8917(this.f25325, c9029.f25325) && AbstractC4394.m8917(this.f25324, c9029.f25324);
    }

    public final int hashCode() {
        int iM143 = AbstractC0053.m143(this.f25327, Integer.hashCode(this.f25328) * 31, 31);
        byte[] bArr = this.f25326;
        int iHashCode = (iM143 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        C9037 c9037 = this.f25325;
        int iHashCode2 = (iHashCode + (c9037 == null ? 0 : c9037.hashCode())) * 31;
        byte[] bArr2 = this.f25324;
        return iHashCode2 + (bArr2 != null ? Arrays.hashCode(bArr2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NewSyncPush(type=");
        AbstractC6136.m11533(sb, this.f25328, -3937699108811441575L);
        AbstractC6136.m11533(sb, this.f25327, -3937699048681899431L);
        sb.append(Arrays.toString(this.f25326));
        sb.append(", syncRecallContent=");
        sb.append(this.f25325);
        sb.append(", syncPushExtra=");
        sb.append(Arrays.toString(this.f25324));
        sb.append(')');
        return sb.toString();
    }

    public C9029(int i, int i2, byte[] bArr, C9037 c9037, byte[] bArr2) {
        this.f25328 = i;
        this.f25327 = i2;
        this.f25326 = bArr;
        this.f25325 = c9037;
        this.f25324 = bArr2;
    }
}
