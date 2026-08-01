package p083;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7716 extends AbstractC5754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18681;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7716(String str, String str2) {
        super(11);
        str.getClass();
        str2.getClass();
        this.f18681 = str;
        this.f18680 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7716)) {
            return false;
        }
        C7716 c7716 = (C7716) obj;
        return AbstractC5227.m9466(this.f18681, c7716.f18681) && AbstractC5227.m9466(this.f18680, c7716.f18680);
    }

    public final int hashCode() {
        return this.f18680.hashCode() + (this.f18681.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo10462() {
        return this.f18681 + ':' + this.f18680;
    }
}
