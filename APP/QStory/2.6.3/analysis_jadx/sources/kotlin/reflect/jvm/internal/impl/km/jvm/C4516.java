package kotlin.reflect.jvm.internal.impl.km.jvm;

import com.bumptech.glide.AbstractC3065;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4516 extends AbstractC3065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13161;

    public C4516(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13161 = str;
        this.f13160 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4516)) {
            return false;
        }
        C4516 c4516 = (C4516) obj;
        return AbstractC4395.m8907(this.f13161, c4516.f13161) && AbstractC4395.m8907(this.f13160, c4516.f13160);
    }

    public final int hashCode() {
        return this.f13160.hashCode() + (this.f13161.hashCode() * 31);
    }

    public final String toString() {
        return this.f13161 + this.f13160;
    }
}
