package p393;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9106 {
    public static final C9107 Companion = new C9107();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25534;

    public /* synthetic */ C9106(int i, String str) {
        if (1 == (i & 1)) {
            this.f25534 = str;
        } else {
            AbstractC7144.m12420(i, 1, C9108.f25535.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9106) && AbstractC4395.m8907(this.f25534, ((C9106) obj).f25534);
    }

    public final int hashCode() {
        return this.f25534.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m158("ClassInfo(className=", this.f25534, ")");
    }

    public C9106(String str) {
        this.f25534 = str;
    }
}
