package p067;

import com.alibaba.fastjson2.AbstractC2904;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6885 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18339;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6885(String str, String str2) {
        super(12);
        str.getClass();
        str2.getClass();
        this.f18339 = str;
        this.f18338 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6885)) {
            return false;
        }
        C6885 c6885 = (C6885) obj;
        return AbstractC4394.m8917(this.f18339, c6885.f18339) && AbstractC4394.m8917(this.f18338, c6885.f18338);
    }

    public final int hashCode() {
        return this.f18338.hashCode() + (this.f18339.hashCode() * 31);
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo6280() {
        return this.f18339 + this.f18338;
    }
}
