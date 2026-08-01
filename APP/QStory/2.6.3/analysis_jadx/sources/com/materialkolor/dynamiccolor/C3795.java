package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ToneDeltaPair$DeltaConstraint f11956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f11957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TonePolarity f11958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f11959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3806 f11960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3806 f11961;

    public C3795(C3806 c3806, C3806 c38062, double d, TonePolarity tonePolarity, boolean z, ToneDeltaPair$DeltaConstraint toneDeltaPair$DeltaConstraint, int i) {
        z = (i & 16) != 0 ? true : z;
        toneDeltaPair$DeltaConstraint = (i & 32) != 0 ? ToneDeltaPair$DeltaConstraint.EXACT : toneDeltaPair$DeltaConstraint;
        c3806.getClass();
        c38062.getClass();
        tonePolarity.getClass();
        toneDeltaPair$DeltaConstraint.getClass();
        this.f11961 = c3806;
        this.f11960 = c38062;
        this.f11959 = d;
        this.f11958 = tonePolarity;
        this.f11957 = z;
        this.f11956 = toneDeltaPair$DeltaConstraint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3795)) {
            return false;
        }
        C3795 c3795 = (C3795) obj;
        return AbstractC4395.m8907(this.f11961, c3795.f11961) && AbstractC4395.m8907(this.f11960, c3795.f11960) && Double.compare(this.f11959, c3795.f11959) == 0 && this.f11958 == c3795.f11958 && this.f11957 == c3795.f11957 && this.f11956 == c3795.f11956;
    }

    public final int hashCode() {
        return this.f11956.hashCode() + AbstractC0053.m141((this.f11958.hashCode() + ((Double.hashCode(this.f11959) + ((this.f11960.hashCode() + (this.f11961.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f11957);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.f11961 + ", roleB=" + this.f11960 + ", delta=" + this.f11959 + ", polarity=" + this.f11958 + ", stayTogether=" + this.f11957 + ", deltaConstraint=" + this.f11956 + ")";
    }
}
