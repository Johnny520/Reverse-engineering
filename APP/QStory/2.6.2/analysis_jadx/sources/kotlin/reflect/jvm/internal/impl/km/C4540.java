package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4540 extends AbstractC4547 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13244;

    public C4540(String str, int i) {
        str.getClass();
        this.f13244 = str;
        this.f13243 = i;
        if (i <= 0) {
            C5919.m11249("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            throw null;
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f13244);
        int i3 = this.f13243;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.f13242 = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4540)) {
            return false;
        }
        C4540 c4540 = (C4540) obj;
        return AbstractC4394.m8917(this.f13244, c4540.f13244) && this.f13243 == c4540.f13243;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13243) + (this.f13244.hashCode() * 31);
    }

    public final String toString() {
        return this.f13242;
    }
}
