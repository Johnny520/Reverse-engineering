package p056;

import kotlin.jvm.internal.AbstractC4395;
import p088.C7152;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰哲世子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6761 {
    public static final C6755 Companion = new C6755();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6764 f18195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6776 f18196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6778 f18197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7152 f18198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7152 f18199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7152 f18200;

    public C6761(int i, C7152 c7152, C7152 c71522, C7152 c71523, C6778 c6778, C6776 c6776, C6764 c6764) {
        this.f18200 = (i & 1) == 0 ? AbstractC6602.f17976 : c7152;
        if ((i & 2) == 0) {
            this.f18199 = AbstractC6602.f17976;
        } else {
            this.f18199 = c71522;
        }
        if ((i & 4) == 0) {
            this.f18198 = AbstractC6602.f17976;
        } else {
            this.f18198 = c71523;
        }
        if ((i & 8) == 0) {
            this.f18197 = null;
        } else {
            this.f18197 = c6778;
        }
        if ((i & 16) == 0) {
            this.f18196 = null;
        } else {
            this.f18196 = c6776;
        }
        if ((i & 32) == 0) {
            this.f18195 = null;
        } else {
            this.f18195 = c6764;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6761)) {
            return false;
        }
        C6761 c6761 = (C6761) obj;
        return AbstractC4395.m8907(this.f18200, c6761.f18200) && AbstractC4395.m8907(this.f18199, c6761.f18199) && AbstractC4395.m8907(this.f18198, c6761.f18198) && AbstractC4395.m8907(this.f18197, c6761.f18197) && AbstractC4395.m8907(this.f18196, c6761.f18196) && AbstractC4395.m8907(this.f18195, c6761.f18195);
    }

    public final int hashCode() {
        C7152 c7152 = this.f18200;
        int iHashCode = (c7152 == null ? 0 : c7152.f19116.hashCode()) * 31;
        C7152 c71522 = this.f18199;
        int iHashCode2 = (iHashCode + (c71522 == null ? 0 : c71522.f19116.hashCode())) * 31;
        C7152 c71523 = this.f18198;
        int iHashCode3 = (iHashCode2 + (c71523 == null ? 0 : c71523.f19116.hashCode())) * 31;
        C6778 c6778 = this.f18197;
        int iHashCode4 = (iHashCode3 + (c6778 == null ? 0 : c6778.hashCode())) * 31;
        C6776 c6776 = this.f18196;
        int iHashCode5 = (iHashCode4 + (c6776 == null ? 0 : c6776.hashCode())) * 31;
        C6764 c6764 = this.f18195;
        return iHashCode5 + (c6764 != null ? c6764.hashCode() : 0);
    }

    public final String toString() {
        return "ServerCapabilities(experimental=" + this.f18200 + ", sampling=" + this.f18199 + ", logging=" + this.f18198 + ", prompts=" + this.f18197 + ", resources=" + this.f18196 + ", tools=" + this.f18195 + ')';
    }

    public C6761(C6778 c6778, C6776 c6776, C6764 c6764, int i) {
        C7152 c7152 = AbstractC6602.f17976;
        c6778 = (i & 8) != 0 ? null : c6778;
        c6776 = (i & 16) != 0 ? null : c6776;
        c6764 = (i & 32) != 0 ? null : c6764;
        this.f18200 = c7152;
        this.f18199 = c7152;
        this.f18198 = c7152;
        this.f18197 = c6778;
        this.f18196 = c6776;
        this.f18195 = c6764;
    }
}
