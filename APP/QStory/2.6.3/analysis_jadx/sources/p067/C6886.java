package p067;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.types.AbstractC4922;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6886 extends AbstractC4922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18334;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6886(String str, String str2) {
        super(11);
        str.getClass();
        str2.getClass();
        this.f18334 = str;
        this.f18333 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6886)) {
            return false;
        }
        C6886 c6886 = (C6886) obj;
        return AbstractC4395.m8907(this.f18334, c6886.f18334) && AbstractC4395.m8907(this.f18333, c6886.f18333);
    }

    public final int hashCode() {
        return this.f18333.hashCode() + (this.f18334.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo9903() {
        return this.f18334 + this.f18333;
    }
}
