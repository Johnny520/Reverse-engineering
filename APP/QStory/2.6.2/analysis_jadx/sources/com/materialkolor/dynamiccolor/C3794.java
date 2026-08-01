package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ToneDeltaPair$DeltaConstraint f11951;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f11952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final TonePolarity f11953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f11954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3805 f11955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3805 f11956;

    public C3794(C3805 c3805, C3805 c38052, double d, TonePolarity tonePolarity, boolean z, ToneDeltaPair$DeltaConstraint toneDeltaPair$DeltaConstraint, int i) {
        z = (i & 16) != 0 ? true : z;
        toneDeltaPair$DeltaConstraint = (i & 32) != 0 ? ToneDeltaPair$DeltaConstraint.EXACT : toneDeltaPair$DeltaConstraint;
        c3805.getClass();
        c38052.getClass();
        tonePolarity.getClass();
        toneDeltaPair$DeltaConstraint.getClass();
        this.f11956 = c3805;
        this.f11955 = c38052;
        this.f11954 = d;
        this.f11953 = tonePolarity;
        this.f11952 = z;
        this.f11951 = toneDeltaPair$DeltaConstraint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3794)) {
            return false;
        }
        C3794 c3794 = (C3794) obj;
        return AbstractC4394.m8917(this.f11956, c3794.f11956) && AbstractC4394.m8917(this.f11955, c3794.f11955) && Double.compare(this.f11954, c3794.f11954) == 0 && this.f11953 == c3794.f11953 && this.f11952 == c3794.f11952 && this.f11951 == c3794.f11951;
    }

    public final int hashCode() {
        return this.f11951.hashCode() + AbstractC0053.m140((this.f11953.hashCode() + ((Double.hashCode(this.f11954) + ((this.f11955.hashCode() + (this.f11956.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f11952);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.f11956 + ", roleB=" + this.f11955 + ", delta=" + this.f11954 + ", polarity=" + this.f11953 + ", stayTogether=" + this.f11952 + ", deltaConstraint=" + this.f11951 + ")";
    }
}
