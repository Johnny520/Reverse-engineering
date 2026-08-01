package p383;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9010 {
    public static final C9014 Companion = new C9014();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9011 f25304;

    public /* synthetic */ C9010(int i, C9011 c9011) {
        if (1 == (i & 1)) {
            this.f25304 = c9011;
        } else {
            AbstractC7143.m12393(i, 1, C9015.f25311.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9010) && AbstractC4394.m8917(this.f25304, ((C9010) obj).f25304);
    }

    public final int hashCode() {
        return this.f25304.hashCode();
    }

    public final String toString() {
        return "C2CRecallOperationInfo(info=" + this.f25304 + ')';
    }

    public C9010(C9011 c9011) {
        "info";
        this.f25304 = c9011;
    }
}
