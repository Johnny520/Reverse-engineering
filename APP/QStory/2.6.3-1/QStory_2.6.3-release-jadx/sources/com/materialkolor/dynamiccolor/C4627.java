package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4627 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ToneDeltaPair$DeltaConstraint f12301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f12302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TonePolarity f12303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f12304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4638 f12305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4638 f12306;

    public C4627(C4638 c4638, C4638 c46382, double d, TonePolarity tonePolarity, boolean z, ToneDeltaPair$DeltaConstraint toneDeltaPair$DeltaConstraint, int i) {
        z = (i & 16) != 0 ? true : z;
        toneDeltaPair$DeltaConstraint = (i & 32) != 0 ? ToneDeltaPair$DeltaConstraint.EXACT : toneDeltaPair$DeltaConstraint;
        c4638.getClass();
        c46382.getClass();
        tonePolarity.getClass();
        toneDeltaPair$DeltaConstraint.getClass();
        this.f12306 = c4638;
        this.f12305 = c46382;
        this.f12304 = d;
        this.f12303 = tonePolarity;
        this.f12302 = z;
        this.f12301 = toneDeltaPair$DeltaConstraint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4627)) {
            return false;
        }
        C4627 c4627 = (C4627) obj;
        return AbstractC5227.m9466(this.f12306, c4627.f12306) && AbstractC5227.m9466(this.f12305, c4627.f12305) && Double.compare(this.f12304, c4627.f12304) == 0 && this.f12303 == c4627.f12303 && this.f12302 == c4627.f12302 && this.f12301 == c4627.f12301;
    }

    public final int hashCode() {
        return this.f12301.hashCode() + AbstractC0900.m701((this.f12303.hashCode() + ((Double.hashCode(this.f12304) + ((this.f12305.hashCode() + (this.f12306.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f12302);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.f12306 + ", roleB=" + this.f12305 + ", delta=" + this.f12304 + ", polarity=" + this.f12303 + ", stayTogether=" + this.f12302 + ", deltaConstraint=" + this.f12301 + ")";
    }
}
