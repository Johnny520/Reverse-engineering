package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏子哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6778 {
    public static final C6777 Companion = new C6777();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18214;

    public /* synthetic */ C6778(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18214 = bool;
        } else {
            AbstractC7144.m12420(i, 1, C6756.f18189.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6778) && AbstractC4395.m8907(this.f18214, ((C6778) obj).f18214);
    }

    public final int hashCode() {
        Boolean bool = this.f18214;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Prompts(listChanged=" + this.f18214 + ')';
    }

    public C6778() {
        this.f18214 = null;
    }
}
