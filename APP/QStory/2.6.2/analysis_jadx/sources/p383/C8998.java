package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C8998 {
    public static final C9002 Companion = new C9002();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25291;

    public /* synthetic */ C8998(int i, String str) {
        if ((i & 1) == 0) {
            this.f25291 = AbstractC3056.m6668(-3937561979095614887L);
        } else {
            this.f25291 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8998) && AbstractC4394.m8917(this.f25291, ((C8998) obj).f25291);
    }

    public final int hashCode() {
        return this.f25291.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937710683748304295L));
        return AbstractC0053.m155(sb, this.f25291, ')');
    }
}
