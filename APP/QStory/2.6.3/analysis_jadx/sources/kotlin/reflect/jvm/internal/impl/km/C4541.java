package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.AbstractC4395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4541 extends AbstractC4548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f13246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13248;

    public C4541(String str, int i) {
        str.getClass();
        this.f13248 = str;
        this.f13247 = i;
        if (i <= 0) {
            C5925.m11310("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            throw null;
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f13248);
        int i3 = this.f13247;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.f13246 = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4541)) {
            return false;
        }
        C4541 c4541 = (C4541) obj;
        return AbstractC4395.m8907(this.f13248, c4541.f13248) && this.f13247 == c4541.f13247;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13247) + (this.f13248.hashCode() * 31);
    }

    public final String toString() {
        return this.f13246;
    }
}
