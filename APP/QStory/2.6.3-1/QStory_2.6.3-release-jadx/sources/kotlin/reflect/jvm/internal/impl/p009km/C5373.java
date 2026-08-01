package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5373 extends AbstractC5380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13593;

    public C5373(String str, int i) {
        str.getClass();
        this.f13593 = str;
        this.f13592 = i;
        if (i <= 0) {
            C6755.m11869("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            throw null;
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f13593);
        int i3 = this.f13592;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.f13591 = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5373)) {
            return false;
        }
        C5373 c5373 = (C5373) obj;
        return AbstractC5227.m9466(this.f13593, c5373.f13593) && this.f13592 == c5373.f13592;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13592) + (this.f13593.hashCode() * 31);
    }

    public final String toString() {
        return this.f13591;
    }
}
