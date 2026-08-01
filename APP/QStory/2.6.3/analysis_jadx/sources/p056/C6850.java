package p056;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6850 implements InterfaceC6827 {
    public static final C6849 Companion = new C6849();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18287;

    public /* synthetic */ C6850(int i, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC7144.m12420(i, 1, C6845.f18283.getDescriptor());
            throw null;
        }
        this.f18287 = str;
        if ((i & 2) == 0) {
            this.f18286 = "ref/prompt";
        } else {
            this.f18286 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6850) && AbstractC4395.m8907(this.f18287, ((C6850) obj).f18287);
    }

    public final int hashCode() {
        return this.f18287.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("PromptReference(name="), this.f18287, ')');
    }
}
