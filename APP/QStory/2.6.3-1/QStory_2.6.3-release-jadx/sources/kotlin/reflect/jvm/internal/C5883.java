package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.types.C5769;
import p095.C7835;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5883 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5883 f14920 = new C5883(null, C5769.f14634, null, false, false, false, false, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f14921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f14922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f14923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Modality f14924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5769 f14925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7835 f14926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f14928;

    public C5883(C7835 c7835, C5769 c5769, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c5769.getClass();
        this.f14926 = c7835;
        this.f14925 = c5769;
        this.f14924 = modality;
        this.f14923 = z;
        this.f14922 = z2;
        this.f14921 = z3;
        this.f14928 = z4;
        this.f14927 = z5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5883 m10561(C5883 c5883, C7835 c7835, C5769 c5769, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            c7835 = c5883.f14926;
        }
        C7835 c78352 = c7835;
        if ((i & 2) != 0) {
            c5769 = c5883.f14925;
        }
        C5769 c57692 = c5769;
        if ((i & 4) != 0) {
            modality = c5883.f14924;
        }
        Modality modality2 = modality;
        boolean z5 = (i & 8) != 0 ? c5883.f14923 : true;
        if ((i & 16) != 0) {
            z = c5883.f14922;
        }
        boolean z6 = z;
        if ((i & 32) != 0) {
            z2 = c5883.f14921;
        }
        boolean z7 = z2;
        if ((i & 64) != 0) {
            z3 = c5883.f14928;
        }
        boolean z8 = z3;
        boolean z9 = (i & 128) != 0 ? c5883.f14927 : z4;
        c5883.getClass();
        c57692.getClass();
        return new C5883(c78352, c57692, modality2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5883)) {
            return false;
        }
        C5883 c5883 = (C5883) obj;
        return AbstractC5227.m9466(this.f14926, c5883.f14926) && AbstractC5227.m9466(this.f14925, c5883.f14925) && this.f14924 == c5883.f14924 && this.f14923 == c5883.f14923 && this.f14922 == c5883.f14922 && this.f14921 == c5883.f14921 && this.f14928 == c5883.f14928 && this.f14927 == c5883.f14927;
    }

    public final int hashCode() {
        C7835 c7835 = this.f14926;
        int iHashCode = (this.f14925.hashCode() + ((c7835 == null ? 0 : c7835.hashCode()) * 31)) * 31;
        Modality modality = this.f14924;
        return Boolean.hashCode(this.f14927) + AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701((iHashCode + (modality != null ? modality.hashCode() : 0)) * 31, 31, this.f14923), 31, this.f14922), 31, this.f14921), 31, this.f14928);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.f14926);
        sb.append(", typeSubstitutor=");
        sb.append(this.f14925);
        sb.append(", modality=");
        sb.append(this.f14924);
        sb.append(", isFakeOverride=");
        sb.append(this.f14923);
        sb.append(", forceIsExternal=");
        sb.append(this.f14922);
        sb.append(", forceIsOperator=");
        sb.append(this.f14921);
        sb.append(", forceIsInfix=");
        sb.append(this.f14928);
        sb.append(", forceIsInline=");
        return AbstractC0900.m712(sb, this.f14927, ')');
    }
}
