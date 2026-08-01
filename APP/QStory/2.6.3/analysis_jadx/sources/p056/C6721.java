package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6721 {
    public static final C6722 Companion = new C6722();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18152;

    public /* synthetic */ C6721(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C6719.f18147.getDescriptor());
            throw null;
        }
        this.f18152 = str;
        this.f18151 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6721)) {
            return false;
        }
        C6721 c6721 = (C6721) obj;
        return AbstractC4395.m8907(this.f18152, c6721.f18152) && AbstractC4395.m8907(this.f18151, c6721.f18151);
    }

    public final int hashCode() {
        return this.f18151.hashCode() + (this.f18152.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Implementation(name=");
        sb.append(this.f18152);
        sb.append(", version=");
        return AbstractC0053.m148(sb, this.f18151, ')');
    }

    public C6721() {
        this.f18152 = "mcp-ktor";
        this.f18151 = "0.5.0";
    }
}
