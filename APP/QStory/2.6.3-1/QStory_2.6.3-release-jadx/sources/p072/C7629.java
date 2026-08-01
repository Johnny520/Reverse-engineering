package p072;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲苏兰子世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7629 implements InterfaceC7656 {
    public static final C7626 Companion = new C7626();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f18583;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18584;

    public /* synthetic */ C7629(int i, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC7973.m12979(i, 1, C7627.f18581.getDescriptor());
            throw null;
        }
        this.f18584 = str;
        if ((i & 2) == 0) {
            this.f18583 = "ref/resource";
        } else {
            this.f18583 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7629) && AbstractC5227.m9466(this.f18584, ((C7629) obj).f18584);
    }

    public final int hashCode() {
        return this.f18584.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("ResourceReference(uri="), this.f18584, ')');
    }
}
