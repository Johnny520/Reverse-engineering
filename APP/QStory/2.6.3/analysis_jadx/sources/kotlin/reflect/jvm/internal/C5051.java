package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.types.C4937;
import p079.C7006;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5051 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5051 f14575 = new C5051(null, C4937.f14289, null, false, false, false, false, false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f14576;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f14577;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f14578;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Modality f14579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4937 f14580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7006 f14581;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f14582;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f14583;

    public C5051(C7006 c7006, C4937 c4937, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        c4937.getClass();
        this.f14581 = c7006;
        this.f14580 = c4937;
        this.f14579 = modality;
        this.f14578 = z;
        this.f14577 = z2;
        this.f14576 = z3;
        this.f14583 = z4;
        this.f14582 = z5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5051 m10002(C5051 c5051, C7006 c7006, C4937 c4937, Modality modality, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            c7006 = c5051.f14581;
        }
        C7006 c70062 = c7006;
        if ((i & 2) != 0) {
            c4937 = c5051.f14580;
        }
        C4937 c49372 = c4937;
        if ((i & 4) != 0) {
            modality = c5051.f14579;
        }
        Modality modality2 = modality;
        boolean z5 = (i & 8) != 0 ? c5051.f14578 : true;
        if ((i & 16) != 0) {
            z = c5051.f14577;
        }
        boolean z6 = z;
        if ((i & 32) != 0) {
            z2 = c5051.f14576;
        }
        boolean z7 = z2;
        if ((i & 64) != 0) {
            z3 = c5051.f14583;
        }
        boolean z8 = z3;
        boolean z9 = (i & 128) != 0 ? c5051.f14582 : z4;
        c5051.getClass();
        c49372.getClass();
        return new C5051(c70062, c49372, modality2, z5, z6, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5051)) {
            return false;
        }
        C5051 c5051 = (C5051) obj;
        return AbstractC4395.m8907(this.f14581, c5051.f14581) && AbstractC4395.m8907(this.f14580, c5051.f14580) && this.f14579 == c5051.f14579 && this.f14578 == c5051.f14578 && this.f14577 == c5051.f14577 && this.f14576 == c5051.f14576 && this.f14583 == c5051.f14583 && this.f14582 == c5051.f14582;
    }

    public final int hashCode() {
        C7006 c7006 = this.f14581;
        int iHashCode = (this.f14580.hashCode() + ((c7006 == null ? 0 : c7006.hashCode()) * 31)) * 31;
        Modality modality = this.f14579;
        return Boolean.hashCode(this.f14582) + AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141((iHashCode + (modality != null ? modality.hashCode() : 0)) * 31, 31, this.f14578), 31, this.f14577), 31, this.f14576), 31, this.f14583);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KCallableOverriddenStorage(instanceReceiverParameter=");
        sb.append(this.f14581);
        sb.append(", typeSubstitutor=");
        sb.append(this.f14580);
        sb.append(", modality=");
        sb.append(this.f14579);
        sb.append(", isFakeOverride=");
        sb.append(this.f14578);
        sb.append(", forceIsExternal=");
        sb.append(this.f14577);
        sb.append(", forceIsOperator=");
        sb.append(this.f14576);
        sb.append(", forceIsInfix=");
        sb.append(this.f14583);
        sb.append(", forceIsInline=");
        return AbstractC0053.m152(sb, this.f14582, ')');
    }
}
