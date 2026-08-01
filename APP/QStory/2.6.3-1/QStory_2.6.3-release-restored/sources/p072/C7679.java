package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7679 implements InterfaceC7656 {
    public static final C7678 Companion = new C7678();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18632;

    public /* synthetic */ C7679(int i, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7674.f18628.getDescriptor());
            throw null;
        }
        this.f18632 = str;
        if ((i & 2) == 0) {
            this.f18631 = "ref/prompt";
        } else {
            this.f18631 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7679) && AbstractC5227.m9466(this.f18632, ((C7679) obj).f18632);
    }

    public final int hashCode() {
        return this.f18632.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("PromptReference(name="), this.f18632, ')');
    }
}
