package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.types.C4936;
import p079.C7005;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5050 f14573 = new C5050(null, C4936.f14287, null, false, false, false, false, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f14574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f14575;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f14576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Modality f14577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4936 f14578;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7005 f14579;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14580;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f14581;

    public C5050(C7005 c7005, C4936 c4936, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c4936.getClass();
        this.f14579 = c7005;
        this.f14578 = c4936;
        this.f14577 = modality;
        this.f14576 = z;
        this.f14575 = z2;
        this.f14574 = z3;
        this.f14581 = z4;
        this.f14580 = z5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5050 m10005(C5050 c5050, C7005 c7005, C4936 c4936, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            c7005 = c5050.f14579;
        }
        C7005 c70052 = c7005;
        if ((i & 2) != 0) {
            c4936 = c5050.f14578;
        }
        C4936 c49362 = c4936;
        if ((i & 4) != 0) {
            modality = c5050.f14577;
        }
        Modality modality2 = modality;
        boolean z5 = (i & 8) != 0 ? c5050.f14576 : true;
        if ((i & 16) != 0) {
            z = c5050.f14575;
        }
        boolean z6 = z;
        if ((i & 32) != 0) {
            z2 = c5050.f14574;
        }
        boolean z7 = z2;
        if ((i & 64) != 0) {
            z3 = c5050.f14581;
        }
        boolean z8 = z3;
        boolean z9 = (i & 128) != 0 ? c5050.f14580 : z4;
        c5050.getClass();
        c49362.getClass();
        return new C5050(c70052, c49362, modality2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5050)) {
            return false;
        }
        C5050 c5050 = (C5050) obj;
        return AbstractC4394.m8917(this.f14579, c5050.f14579) && AbstractC4394.m8917(this.f14578, c5050.f14578) && this.f14577 == c5050.f14577 && this.f14576 == c5050.f14576 && this.f14575 == c5050.f14575 && this.f14574 == c5050.f14574 && this.f14581 == c5050.f14581 && this.f14580 == c5050.f14580;
    }

    public final int hashCode() {
        C7005 c7005 = this.f14579;
        int iHashCode = (this.f14578.hashCode() + ((c7005 == null ? 0 : c7005.hashCode()) * 31)) * 31;
        Modality modality = this.f14577;
        return Boolean.hashCode(this.f14580) + AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140((iHashCode + (modality != null ? modality.hashCode() : 0)) * 31, 31, this.f14576), 31, this.f14575), 31, this.f14574), 31, this.f14581);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.f14579);
        sb.append(", typeSubstitutor=");
        sb.append(this.f14578);
        sb.append(", modality=");
        sb.append(this.f14577);
        sb.append(", isFakeOverride=");
        sb.append(this.f14576);
        sb.append(", forceIsExternal=");
        sb.append(this.f14575);
        sb.append(", forceIsOperator=");
        sb.append(this.f14574);
        sb.append(", forceIsInfix=");
        sb.append(this.f14581);
        sb.append(", forceIsInline=");
        return AbstractC0053.m150(sb, this.f14580, ')');
    }
}
