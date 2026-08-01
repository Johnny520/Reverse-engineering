package p383;

import com.bumptech.glide.AbstractC3056;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9057 {
    public static final C9021 Companion = new C9021();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte[] f25361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9060 f25362;

    public /* synthetic */ C9057(int i, C9060 c9060, byte[] bArr) {
        this.f25362 = (i & 1) == 0 ? null : c9060;
        if ((i & 2) == 0) {
            this.f25361 = new byte[0];
        } else {
            this.f25361 = bArr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C9057 m14592(C9057 c9057, byte[] bArr) {
        C9060 c9060 = c9057.f25362;
        c9057.getClass();
        AbstractC3056.m6668(-3937696712219690407L);
        return new C9057(c9060, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9057.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC3056.m6668(-3937709996553536935L);
        obj.getClass();
        C9057 c9057 = (C9057) obj;
        return AbstractC4394.m8917(this.f25362, c9057.f25362) && Arrays.equals(this.f25361, c9057.f25361);
    }

    public final int hashCode() {
        C9060 c9060 = this.f25362;
        return Arrays.hashCode(this.f25361) + ((c9060 != null ? c9060.f25367.hashCode() : 0) * 31);
    }

    public final String toString() {
        return AbstractC3056.m6668(-3937709700200793511L) + this.f25362 + AbstractC3056.m6668(-3937709618596414887L) + Arrays.toString(this.f25361) + ')';
    }

    public C9057(C9060 c9060, byte[] bArr) {
        AbstractC3056.m6668(-3937696712219690407L);
        this.f25362 = c9060;
        this.f25361 = bArr;
    }
}
