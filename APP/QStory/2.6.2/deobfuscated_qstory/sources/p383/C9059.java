package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9059 {
    public static final C9000 Companion = new C9000();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8998 f25364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9055 f25365;

    public /* synthetic */ C9059(int i, C9055 c9055, C8998 c8998) {
        if ((i & 1) == 0) {
            this.f25365 = null;
        } else {
            this.f25365 = c9055;
        }
        if ((i & 2) == 0) {
            this.f25364 = null;
        } else {
            this.f25364 = c8998;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9059)) {
            return false;
        }
        C9059 c9059 = (C9059) obj;
        return AbstractC4394.m8917(this.f25365, c9059.f25365) && AbstractC4394.m8917(this.f25364, c9059.f25364);
    }

    public final int hashCode() {
        C9055 c9055 = this.f25365;
        int iHashCode = (c9055 == null ? 0 : c9055.f25360.hashCode()) * 31;
        C8998 c8998 = this.f25364;
        return iHashCode + (c8998 != null ? c8998.f25291.hashCode() : 0);
    }

    public final String toString() {
        return "MsgContent(textMsg=" + this.f25365 + ", msgSender=" + this.f25364 + ')';
    }
}
