package p056;

import kotlin.jvm.internal.AbstractC4394;
import p088.C7151;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰哲世子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6760 {
    public static final C6754 Companion = new C6754();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6763 f18200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6775 f18201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6777 f18202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7151 f18203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7151 f18204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7151 f18205;

    public C6760(int i, C7151 c7151, C7151 c71512, C7151 c71513, C6777 c6777, C6775 c6775, C6763 c6763) {
        this.f18205 = (i & 1) == 0 ? AbstractC6601.f17981 : c7151;
        if ((i & 2) == 0) {
            this.f18204 = AbstractC6601.f17981;
        } else {
            this.f18204 = c71512;
        }
        if ((i & 4) == 0) {
            this.f18203 = AbstractC6601.f17981;
        } else {
            this.f18203 = c71513;
        }
        if ((i & 8) == 0) {
            this.f18202 = null;
        } else {
            this.f18202 = c6777;
        }
        if ((i & 16) == 0) {
            this.f18201 = null;
        } else {
            this.f18201 = c6775;
        }
        if ((i & 32) == 0) {
            this.f18200 = null;
        } else {
            this.f18200 = c6763;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6760)) {
            return false;
        }
        C6760 c6760 = (C6760) obj;
        return AbstractC4394.m8917(this.f18205, c6760.f18205) && AbstractC4394.m8917(this.f18204, c6760.f18204) && AbstractC4394.m8917(this.f18203, c6760.f18203) && AbstractC4394.m8917(this.f18202, c6760.f18202) && AbstractC4394.m8917(this.f18201, c6760.f18201) && AbstractC4394.m8917(this.f18200, c6760.f18200);
    }

    public final int hashCode() {
        C7151 c7151 = this.f18205;
        int iHashCode = (c7151 == null ? 0 : c7151.f19121.hashCode()) * 31;
        C7151 c71512 = this.f18204;
        int iHashCode2 = (iHashCode + (c71512 == null ? 0 : c71512.f19121.hashCode())) * 31;
        C7151 c71513 = this.f18203;
        int iHashCode3 = (iHashCode2 + (c71513 == null ? 0 : c71513.f19121.hashCode())) * 31;
        C6777 c6777 = this.f18202;
        int iHashCode4 = (iHashCode3 + (c6777 == null ? 0 : c6777.hashCode())) * 31;
        C6775 c6775 = this.f18201;
        int iHashCode5 = (iHashCode4 + (c6775 == null ? 0 : c6775.hashCode())) * 31;
        C6763 c6763 = this.f18200;
        return iHashCode5 + (c6763 != null ? c6763.hashCode() : 0);
    }

    public final String toString() {
        return "ServerCapabilities(experimental=" + this.f18205 + ", sampling=" + this.f18204 + ", logging=" + this.f18203 + ", prompts=" + this.f18202 + ", resources=" + this.f18201 + ", tools=" + this.f18200 + ')';
    }

    public C6760(C6777 c6777, C6775 c6775, C6763 c6763, int i) {
        C7151 c7151 = AbstractC6601.f17981;
        c6777 = (i & 8) != 0 ? null : c6777;
        c6775 = (i & 16) != 0 ? null : c6775;
        c6763 = (i & 32) != 0 ? null : c6763;
        this.f18205 = c7151;
        this.f18204 = c7151;
        this.f18203 = c7151;
        this.f18202 = c6777;
        this.f18201 = c6775;
        this.f18200 = c6763;
    }
}
