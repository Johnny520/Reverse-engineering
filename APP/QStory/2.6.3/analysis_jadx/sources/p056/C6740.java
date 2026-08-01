package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6740 {
    public static final C6749 Companion = new C6749();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Boolean f18166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18168;

    public /* synthetic */ C6740(int i, String str, String str2, Boolean bool) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C6750.f18176.getDescriptor());
            throw null;
        }
        this.f18168 = str;
        this.f18167 = str2;
        this.f18166 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6740)) {
            return false;
        }
        C6740 c6740 = (C6740) obj;
        return AbstractC4395.m8907(this.f18168, c6740.f18168) && AbstractC4395.m8907(this.f18167, c6740.f18167) && AbstractC4395.m8907(this.f18166, c6740.f18166);
    }

    public final int hashCode() {
        int iHashCode = this.f18168.hashCode() * 31;
        String str = this.f18167;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f18166;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "PromptArgument(name=" + this.f18168 + ", description=" + this.f18167 + ", required=" + this.f18166 + ')';
    }
}
