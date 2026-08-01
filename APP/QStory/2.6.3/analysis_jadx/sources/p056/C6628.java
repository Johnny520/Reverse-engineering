package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6628 {
    public static final C6692 Companion = new C6692();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18014;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18015;

    public /* synthetic */ C6628(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6691.f18101.getDescriptor());
            throw null;
        }
        this.f18015 = str;
        this.f18014 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6628)) {
            return false;
        }
        C6628 c6628 = (C6628) obj;
        return AbstractC4395.m8907(this.f18015, c6628.f18015) && AbstractC4395.m8907(this.f18014, c6628.f18014);
    }

    public final int hashCode() {
        return this.f18014.hashCode() + (this.f18015.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Argument(name=");
        sb.append(this.f18015);
        sb.append(", value=");
        return AbstractC0053.m148(sb, this.f18014, ')');
    }
}
