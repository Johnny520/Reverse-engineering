package p390;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9110 {
    public static final C9111 Companion = new C9111();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25481;

    public /* synthetic */ C9110(int i, String str) {
        if (1 == (i & 1)) {
            this.f25481 = str;
        } else {
            AbstractC7143.m12393(i, 1, C9112.f25482.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9110) && AbstractC4394.m8917(this.f25481, ((C9110) obj).f25481);
    }

    public final int hashCode() {
        return this.f25481.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m156("ClassInfo(className=", this.f25481, ")");
    }

    public C9110(String str) {
        this.f25481 = str;
    }
}
