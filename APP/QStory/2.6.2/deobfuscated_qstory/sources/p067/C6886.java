package p067;

import com.alibaba.fastjson2.AbstractC2904;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6886 extends AbstractC2904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f18340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f18341;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6886(String str, String str2) {
        super(12);
        str.getClass();
        str2.getClass();
        this.f18341 = str;
        this.f18340 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6886)) {
            return false;
        }
        C6886 c6886 = (C6886) obj;
        return AbstractC4394.m8917(this.f18341, c6886.f18341) && AbstractC4394.m8917(this.f18340, c6886.f18340);
    }

    public final int hashCode() {
        return this.f18340.hashCode() + (this.f18341.hashCode() * 31);
    }

    @Override // com.alibaba.fastjson2.AbstractC2904
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final String mo6280() {
        return this.f18341 + ':' + this.f18340;
    }
}
