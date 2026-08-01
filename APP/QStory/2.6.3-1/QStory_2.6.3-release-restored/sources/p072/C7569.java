package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7569 {
    public static final C7578 Companion = new C7578();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Boolean f18511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18513;

    public /* synthetic */ C7569(int i, String str, String str2, Boolean bool) {
        if (7 != (i & 7)) {
            AbstractC7973.m12979(i, 7, C7579.f18521.getDescriptor());
            throw null;
        }
        this.f18513 = str;
        this.f18512 = str2;
        this.f18511 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7569)) {
            return false;
        }
        C7569 c7569 = (C7569) obj;
        return AbstractC5227.m9466(this.f18513, c7569.f18513) && AbstractC5227.m9466(this.f18512, c7569.f18512) && AbstractC5227.m9466(this.f18511, c7569.f18511);
    }

    public final int hashCode() {
        int iHashCode = this.f18513.hashCode() * 31;
        String str = this.f18512;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f18511;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PromptArgument(name=" + this.f18513 + ", description=" + this.f18512 + ", required=" + this.f18511 + ')';
    }
}
