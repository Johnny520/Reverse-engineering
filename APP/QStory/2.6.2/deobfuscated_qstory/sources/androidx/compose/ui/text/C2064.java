package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p195.AbstractC7833;
import p205.C7898;
import p205.C7900;
import p209.C7917;
import p209.C7918;
import p209.C7925;
import p209.C7927;
import p209.C7931;
import p209.C7932;
import p209.C7933;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2064 implements InterfaceC2053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7932 f6107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2055 f6108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7927 f6109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6112;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f6113;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f6114;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7925 f6115;

    public C2064(int i, int i2, long j, C7927 c7927, C2055 c2055, C7932 c7932, int i3, int i4, C7925 c7925) {
        this.f6112 = i;
        this.f6111 = i2;
        this.f6110 = j;
        this.f6109 = c7927;
        this.f6108 = c2055;
        this.f6107 = c7932;
        this.f6114 = i3;
        this.f6113 = i4;
        this.f6115 = c7925;
        if (C7898.m13317(j, C7898.f21869) || C7898.m13315(j) >= 0.0f) {
            return;
        }
        AbstractC7833.m13169("lineHeight can't be negative (" + C7898.m13315(j) + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2064)) {
            return false;
        }
        C2064 c2064 = (C2064) obj;
        return this.f6112 == c2064.f6112 && this.f6111 == c2064.f6111 && C7898.m13317(this.f6110, c2064.f6110) && AbstractC4394.m8917(this.f6109, c2064.f6109) && AbstractC4394.m8917(this.f6108, c2064.f6108) && AbstractC4394.m8917(this.f6107, c2064.f6107) && this.f6114 == c2064.f6114 && this.f6113 == c2064.f6113 && AbstractC4394.m8917(this.f6115, c2064.f6115);
    }

    public final int hashCode() {
        int iM143 = AbstractC0053.m143(this.f6111, Integer.hashCode(this.f6112) * 31, 31);
        C7900[] c7900Arr = C7898.f21870;
        int iM141 = AbstractC0053.m141(iM143, 31, this.f6110);
        C7927 c7927 = this.f6109;
        int iHashCode = (iM141 + (c7927 != null ? c7927.hashCode() : 0)) * 31;
        C2055 c2055 = this.f6108;
        int iHashCode2 = (iHashCode + (c2055 != null ? c2055.hashCode() : 0)) * 31;
        C7932 c7932 = this.f6107;
        int iM1432 = AbstractC0053.m143(this.f6113, AbstractC0053.m143(this.f6114, (iHashCode2 + (c7932 != null ? c7932.hashCode() : 0)) * 31, 31), 31);
        C7925 c7925 = this.f6115;
        return iM1432 + (c7925 != null ? c7925.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C7933.m13392(this.f6112)) + ", textDirection=" + ((Object) C7931.m13391(this.f6111)) + ", lineHeight=" + ((Object) C7898.m13314(this.f6110)) + ", textIndent=" + this.f6109 + ", platformStyle=" + this.f6108 + ", lineHeightStyle=" + this.f6107 + ", lineBreak=" + ((Object) C7917.m13386(this.f6114)) + ", hyphens=" + ((Object) C7918.m13387(this.f6113)) + ", textMotion=" + this.f6115 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2064 m3787(C2064 c2064) {
        return c2064 == null ? this : AbstractC2056.m3773(this, c2064.f6112, c2064.f6111, c2064.f6110, c2064.f6109, c2064.f6108, c2064.f6107, c2064.f6114, c2064.f6113, c2064.f6115);
    }
}
