package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世子兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7403 {
    public static final C7404 Companion = new C7404();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7400 f18291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18293;

    public /* synthetic */ C7403(int i, String str, String str2, C7400 c7400) {
        if (7 != (i & 7)) {
            AbstractC7973.m12979(i, 7, C7408.f18296.getDescriptor());
            throw null;
        }
        this.f18293 = str;
        this.f18292 = str2;
        this.f18291 = c7400;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7403)) {
            return false;
        }
        C7403 c7403 = (C7403) obj;
        return AbstractC5227.m9466(this.f18293, c7403.f18293) && AbstractC5227.m9466(this.f18292, c7403.f18292) && AbstractC5227.m9466(this.f18291, c7403.f18291);
    }

    public final int hashCode() {
        int iHashCode = this.f18293.hashCode() * 31;
        String str = this.f18292;
        return this.f18291.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Tool(name=" + this.f18293 + ", description=" + this.f18292 + ", inputSchema=" + this.f18291 + ')';
    }
}
