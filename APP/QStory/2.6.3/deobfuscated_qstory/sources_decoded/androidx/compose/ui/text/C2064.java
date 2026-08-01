package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p195.AbstractC7834;
import p205.C7899;
import p205.C7901;
import p209.C7918;
import p209.C7919;
import p209.C7926;
import p209.C7928;
import p209.C7932;
import p209.C7933;
import p209.C7934;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2064 implements InterfaceC2053 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7933 f6108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2055 f6109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7928 f6110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f6111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6113;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f6114;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f6115;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7926 f6116;

    public C2064(int i, int i2, long j, C7928 c7928, C2055 c2055, C7933 c7933, int i3, int i4, C7926 c7926) {
        this.f6113 = i;
        this.f6112 = i2;
        this.f6111 = j;
        this.f6110 = c7928;
        this.f6109 = c2055;
        this.f6108 = c7933;
        this.f6115 = i3;
        this.f6114 = i4;
        this.f6116 = c7926;
        if (C7899.m13345(j, C7899.f21866) || C7899.m13343(j) >= 0.0f) {
            return;
        }
        AbstractC7834.m13197("lineHeight can't be negative (" + C7899.m13343(j) + ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2064)) {
            return false;
        }
        C2064 c2064 = (C2064) obj;
        return this.f6113 == c2064.f6113 && this.f6112 == c2064.f6112 && C7899.m13345(this.f6111, c2064.f6111) && AbstractC4395.m8907(this.f6110, c2064.f6110) && AbstractC4395.m8907(this.f6109, c2064.f6109) && AbstractC4395.m8907(this.f6108, c2064.f6108) && this.f6115 == c2064.f6115 && this.f6114 == c2064.f6114 && AbstractC4395.m8907(this.f6116, c2064.f6116);
    }

    public final int hashCode() {
        int iM144 = AbstractC0053.m144(this.f6112, Integer.hashCode(this.f6113) * 31, 31);
        C7901[] c7901Arr = C7899.f21867;
        int iM142 = AbstractC0053.m142(iM144, 31, this.f6111);
        C7928 c7928 = this.f6110;
        int iHashCode = (iM142 + (c7928 != null ? c7928.hashCode() : 0)) * 31;
        C2055 c2055 = this.f6109;
        int iHashCode2 = (iHashCode + (c2055 != null ? c2055.hashCode() : 0)) * 31;
        C7933 c7933 = this.f6108;
        int iM1442 = AbstractC0053.m144(this.f6114, AbstractC0053.m144(this.f6115, (iHashCode2 + (c7933 != null ? c7933.hashCode() : 0)) * 31, 31), 31);
        C7926 c7926 = this.f6116;
        return iM1442 + (c7926 != null ? c7926.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C7934.m13420(this.f6113)) + ", textDirection=" + ((Object) C7932.m13419(this.f6112)) + ", lineHeight=" + ((Object) C7899.m13342(this.f6111)) + ", textIndent=" + this.f6110 + ", platformStyle=" + this.f6109 + ", lineHeightStyle=" + this.f6108 + ", lineBreak=" + ((Object) C7918.m13414(this.f6115)) + ", hyphens=" + ((Object) C7919.m13415(this.f6114)) + ", textMotion=" + this.f6116 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2064 m3797(C2064 c2064) {
        return c2064 == null ? this : AbstractC2056.m3783(this, c2064.f6113, c2064.f6112, c2064.f6111, c2064.f6110, c2064.f6109, c2064.f6108, c2064.f6115, c2064.f6114, c2064.f6116);
    }
}
