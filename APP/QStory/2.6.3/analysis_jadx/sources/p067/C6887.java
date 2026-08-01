package p067;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.types.AbstractC4922;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6887 extends AbstractC4922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18336;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6887(String str, String str2) {
        super(11);
        str.getClass();
        str2.getClass();
        this.f18336 = str;
        this.f18335 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6887)) {
            return false;
        }
        C6887 c6887 = (C6887) obj;
        return AbstractC4395.m8907(this.f18336, c6887.f18336) && AbstractC4395.m8907(this.f18335, c6887.f18335);
    }

    public final int hashCode() {
        return this.f18335.hashCode() + (this.f18336.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo9903() {
        return this.f18336 + ':' + this.f18335;
    }
}
