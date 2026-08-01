package p083;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7715 extends AbstractC5754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18679;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7715(String str, String str2) {
        super(11);
        str.getClass();
        str2.getClass();
        this.f18679 = str;
        this.f18678 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7715)) {
            return false;
        }
        C7715 c7715 = (C7715) obj;
        return AbstractC5227.m9466(this.f18679, c7715.f18679) && AbstractC5227.m9466(this.f18678, c7715.f18678);
    }

    public final int hashCode() {
        return this.f18678.hashCode() + (this.f18679.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo10462() {
        return this.f18679 + this.f18678;
    }
}
